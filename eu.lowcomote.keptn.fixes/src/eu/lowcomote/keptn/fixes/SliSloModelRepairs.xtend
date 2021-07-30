package eu.lowcomote.keptn.fixes

import eu.lowcomote.keptn.queries.ObjectiveSliAndIndicatorKeyMustBeTheSame
import eu.lowcomote.keptn.queries.SliIndicatorHasProperty
import eu.lowcomote.keptn.sli.ServiceLevelIndicatorsIndicatorsPatternProperties0
import java.util.concurrent.ConcurrentHashMap
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.jface.dialogs.MessageDialog
import org.eclipse.ui.PlatformUI
import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.query.runtime.emf.EMFScope
import org.eclipse.viatra.transformation.evm.specific.Lifecycles
import org.eclipse.viatra.transformation.evm.specific.crud.CRUDActivationStateEnum
import org.eclipse.viatra.transformation.evm.specific.resolver.InvertedDisappearancePriorityConflictResolver
import org.eclipse.viatra.transformation.runtime.emf.rules.eventdriven.EventDrivenTransformationRuleFactory
import org.eclipse.viatra.transformation.runtime.emf.transformation.eventdriven.EventDrivenTransformation

class SliSloModelRepairs implements AutoCloseable {

	extension EventDrivenTransformation transformation
	extension EventDrivenTransformationRuleFactory = new EventDrivenTransformationRuleFactory

	AdvancedViatraQueryEngine queryEngine

	new(ResourceSet resourceSet) {
		initQueryEngine(resourceSet)
		initTransformationEngine
	}

	def execute() {
		transformation.executionSchema.startUnscheduledExecution
	}

	private def initQueryEngine(ResourceSet resourceSet) {
		val scope = new EMFScope(resourceSet)
		val viatraQueryEngine = ViatraQueryEngine.on(scope)
		queryEngine = AdvancedViatraQueryEngine.from(viatraQueryEngine)
	}

	private def initTransformationEngine() {
		val prioritizeDisappearanceConflictResolver = new InvertedDisappearancePriorityConflictResolver
		transformation = EventDrivenTransformation.forEngine(queryEngine).setConflictResolver(
			prioritizeDisappearanceConflictResolver).addRule(createSliSloQuickFixRule).build
	}

	override close() throws Exception {
		if (transformation !== null) {
			transformation.dispose
		}
		if (queryEngine !== null) {
			queryEngine.dispose
		}
	}

	private def createSliSloQuickFixRule() {
		val errorsMatcher = ObjectiveSliAndIndicatorKeyMustBeTheSame.Matcher.on(queryEngine)
		val oldKeyByPatternProperty = new ConcurrentHashMap<ServiceLevelIndicatorsIndicatorsPatternProperties0, String>

		createRule(SliIndicatorHasProperty.instance).action(CRUDActivationStateEnum.CREATED) [
			val sliIndicator = it.sliIndicator
			val sliIndicatorPatternPropertiesNewKey = it.key

			val sliIndicatorPatternProperties = it.properties
			val hasOldKey = oldKeyByPatternProperty.containsKey(sliIndicatorPatternProperties)
			val sliIndicatorPatternPropertiesOldKey = oldKeyByPatternProperty.get(sliIndicatorPatternProperties)

			// if sliIndicatorPatternPropertiesOldKey is null then the parameter is unbound in pattern matching
			val hasError = errorsMatcher.hasMatch(null, sliIndicatorPatternPropertiesOldKey, null, sliIndicator, null)
			if (hasError && hasOldKey) {
				val objectives = errorsMatcher.getAllValuesOfobjective(sliIndicatorPatternPropertiesOldKey, null,
					sliIndicator, null)
				val activeShell = PlatformUI.workbench.display.activeShell
				
				val numberOfObjectives = objectives.size
				val isPlural = numberOfObjectives > 1
				
				val shouldRename = MessageDialog.openQuestion(
					activeShell,
					"Question",
					'''There «isPlural ? "are" : "is"» «numberOfObjectives» Service Level Objective«isPlural ? "s" : ""» associated with this SLI pattern property. Would you like to rename the referred SLI key«isPlural ? "s" : ""» there to «sliIndicatorPatternPropertiesNewKey»?'''
				);
				if (shouldRename) {
					errorsMatcher.getAllValuesOfsliField(null, null, sliIndicator, null).forEach [
						sli = sliIndicatorPatternPropertiesNewKey
					]
				}
			}
		].action(CRUDActivationStateEnum.DELETED) [
			oldKeyByPatternProperty.put(properties, key)
		].addLifeCycle(Lifecycles.getDefault(true, true)).build
	}

}
