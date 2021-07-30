/**
 */
package eu.lowcomote.keptn.slo.util;

import eu.lowcomote.keptn.slo.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see eu.lowcomote.keptn.slo.SloPackage
 * @generated
 */
public class SloAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SloPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SloAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SloPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SloSwitch<Adapter> modelSwitch =
		new SloSwitch<Adapter>() {
			@Override
			public Adapter caseSloRoot(SloRoot object) {
				return createSloRootAdapter();
			}
			@Override
			public Adapter caseServiceLevelObjectives(ServiceLevelObjectives object) {
				return createServiceLevelObjectivesAdapter();
			}
			@Override
			public Adapter caseComparison(Comparison object) {
				return createComparisonAdapter();
			}
			@Override
			public Adapter caseObjective(Objective object) {
				return createObjectiveAdapter();
			}
			@Override
			public Adapter caseSLICriteria(SLICriteria object) {
				return createSLICriteriaAdapter();
			}
			@Override
			public Adapter caseScore(Score object) {
				return createScoreAdapter();
			}
			@Override
			public Adapter caseServiceLevelObjectivesComparison(ServiceLevelObjectivesComparison object) {
				return createServiceLevelObjectivesComparisonAdapter();
			}
			@Override
			public Adapter caseServiceLevelObjectivesFilter(ServiceLevelObjectivesFilter object) {
				return createServiceLevelObjectivesFilterAdapter();
			}
			@Override
			public Adapter caseServiceLevelObjectivesObjectives(ServiceLevelObjectivesObjectives object) {
				return createServiceLevelObjectivesObjectivesAdapter();
			}
			@Override
			public Adapter caseServiceLevelObjectivesSpec_version(ServiceLevelObjectivesSpec_version object) {
				return createServiceLevelObjectivesSpec_versionAdapter();
			}
			@Override
			public Adapter caseServiceLevelObjectivesTotal_score(ServiceLevelObjectivesTotal_score object) {
				return createServiceLevelObjectivesTotal_scoreAdapter();
			}
			@Override
			public Adapter caseComparisonAggregate_function(ComparisonAggregate_function object) {
				return createComparisonAggregate_functionAdapter();
			}
			@Override
			public Adapter caseComparisonCompare_with(ComparisonCompare_with object) {
				return createComparisonCompare_withAdapter();
			}
			@Override
			public Adapter caseComparisonInclude_result_with_score(ComparisonInclude_result_with_score object) {
				return createComparisonInclude_result_with_scoreAdapter();
			}
			@Override
			public Adapter caseComparisonNumber_of_comparison_results(ComparisonNumber_of_comparison_results object) {
				return createComparisonNumber_of_comparison_resultsAdapter();
			}
			@Override
			public Adapter caseObjectiveKey_sli(ObjectiveKey_sli object) {
				return createObjectiveKey_sliAdapter();
			}
			@Override
			public Adapter caseObjectivePass(ObjectivePass object) {
				return createObjectivePassAdapter();
			}
			@Override
			public Adapter caseObjectiveSli(ObjectiveSli object) {
				return createObjectiveSliAdapter();
			}
			@Override
			public Adapter caseObjectiveDisplayName(ObjectiveDisplayName object) {
				return createObjectiveDisplayNameAdapter();
			}
			@Override
			public Adapter caseObjectiveWarning(ObjectiveWarning object) {
				return createObjectiveWarningAdapter();
			}
			@Override
			public Adapter caseObjectiveWeight(ObjectiveWeight object) {
				return createObjectiveWeightAdapter();
			}
			@Override
			public Adapter caseSLICriteriaCriteria(SLICriteriaCriteria object) {
				return createSLICriteriaCriteriaAdapter();
			}
			@Override
			public Adapter caseScorePass(ScorePass object) {
				return createScorePassAdapter();
			}
			@Override
			public Adapter caseScoreWarning(ScoreWarning object) {
				return createScoreWarningAdapter();
			}
			@Override
			public Adapter caseServiceLevelObjectivesFilterPatternProperties0(ServiceLevelObjectivesFilterPatternProperties0 object) {
				return createServiceLevelObjectivesFilterPatternProperties0Adapter();
			}
			@Override
			public Adapter caseServiceLevelObjectivesObjectivesItems(ServiceLevelObjectivesObjectivesItems object) {
				return createServiceLevelObjectivesObjectivesItemsAdapter();
			}
			@Override
			public Adapter caseObjectivePassItems(ObjectivePassItems object) {
				return createObjectivePassItemsAdapter();
			}
			@Override
			public Adapter caseObjectiveWarningItems(ObjectiveWarningItems object) {
				return createObjectiveWarningItemsAdapter();
			}
			@Override
			public Adapter caseSLICriteriaCriteriaItems(SLICriteriaCriteriaItems object) {
				return createSLICriteriaCriteriaItemsAdapter();
			}
			@Override
			public Adapter caseServiceLevelObjectivesFilterAdditionalProperties(ServiceLevelObjectivesFilterAdditionalProperties object) {
				return createServiceLevelObjectivesFilterAdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseServiceLevelObjectivesPropertiesAbstract(ServiceLevelObjectivesPropertiesAbstract object) {
				return createServiceLevelObjectivesPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseComparisonPropertiesAbstract(ComparisonPropertiesAbstract object) {
				return createComparisonPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseObjectivePropertiesAbstract(ObjectivePropertiesAbstract object) {
				return createObjectivePropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseSLICriteriaPropertiesAbstract(SLICriteriaPropertiesAbstract object) {
				return createSLICriteriaPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseScorePropertiesAbstract(ScorePropertiesAbstract object) {
				return createScorePropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseServiceLevelObjectivesFilterPropertiesAbstract(ServiceLevelObjectivesFilterPropertiesAbstract object) {
				return createServiceLevelObjectivesFilterPropertiesAbstractAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link eu.lowcomote.keptn.slo.SloRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.lowcomote.keptn.slo.SloRoot
	 * @generated
	 */
	public Adapter createSloRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.lowcomote.keptn.slo.ServiceLevelObjectives <em>Service Level Objectives</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.lowcomote.keptn.slo.ServiceLevelObjectives
	 * @generated
	 */
	public Adapter createServiceLevelObjectivesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.lowcomote.keptn.slo.Comparison <em>Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.lowcomote.keptn.slo.Comparison
	 * @generated
	 */
	public Adapter createComparisonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.lowcomote.keptn.slo.Objective <em>Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.lowcomote.keptn.slo.Objective
	 * @generated
	 */
	public Adapter createObjectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.lowcomote.keptn.slo.SLICriteria <em>SLI Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.lowcomote.keptn.slo.SLICriteria
	 * @generated
	 */
	public Adapter createSLICriteriaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.lowcomote.keptn.slo.Score <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.lowcomote.keptn.slo.Score
	 * @generated
	 */
	public Adapter createScoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.lowcomote.keptn.slo.ServiceLevelObjectivesComparison <em>Service Level Objectives Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.lowcomote.keptn.slo.ServiceLevelObjectivesComparison
	 * @generated
	 */
	public Adapter createServiceLevelObjectivesComparisonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.lowcomote.keptn.slo.ServiceLevelObjectivesFilter <em>Service Level Objectives Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.lowcomote.keptn.slo.ServiceLevelObjectivesFilter
	 * @generated
	 */
	public Adapter createServiceLevelObjectivesFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.lowcomote.keptn.slo.ServiceLevelObjectivesObjectives <em>Service Level Objectives Objectives</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.lowcomote.keptn.slo.ServiceLevelObjectivesObjectives
	 * @generated
	 */
	public Adapter createServiceLevelObjectivesObjectivesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.lowcomote.keptn.slo.ServiceLevelObjectivesSpec_version <em>Service Level Objectives Spec version</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.lowcomote.keptn.slo.ServiceLevelObjectivesSpec_version
	 * @generated
	 */
	public Adapter createServiceLevelObjectivesSpec_versionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.lowcomote.keptn.slo.ServiceLevelObjectivesTotal_score <em>Service Level Objectives Total score</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.lowcomote.keptn.slo.ServiceLevelObjectivesTotal_score
	 * @generated
	 */
	public Adapter createServiceLevelObjectivesTotal_scoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.lowcomote.keptn.slo.ComparisonAggregate_function <em>Comparison Aggregate function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.lowcomote.keptn.slo.ComparisonAggregate_function
	 * @generated
	 */
	public Adapter createComparisonAggregate_functionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.lowcomote.keptn.slo.ComparisonCompare_with <em>Comparison Compare with</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.lowcomote.keptn.slo.ComparisonCompare_with
	 * @generated
	 */
	public Adapter createComparisonCompare_withAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.lowcomote.keptn.slo.ComparisonInclude_result_with_score <em>Comparison Include result with score</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.lowcomote.keptn.slo.ComparisonInclude_result_with_score
	 * @generated
	 */
	public Adapter createComparisonInclude_result_with_scoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.lowcomote.keptn.slo.ComparisonNumber_of_comparison_results <em>Comparison Number of comparison results</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.lowcomote.keptn.slo.ComparisonNumber_of_comparison_results
	 * @generated
	 */
	public Adapter createComparisonNumber_of_comparison_resultsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.lowcomote.keptn.slo.ObjectiveKey_sli <em>Objective Key sli</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.lowcomote.keptn.slo.ObjectiveKey_sli
	 * @generated
	 */
	public Adapter createObjectiveKey_sliAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.lowcomote.keptn.slo.ObjectivePass <em>Objective Pass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.lowcomote.keptn.slo.ObjectivePass
	 * @generated
	 */
	public Adapter createObjectivePassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.lowcomote.keptn.slo.ObjectiveSli <em>Objective Sli</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.lowcomote.keptn.slo.ObjectiveSli
	 * @generated
	 */
	public Adapter createObjectiveSliAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.lowcomote.keptn.slo.ObjectiveDisplayName <em>Objective Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.lowcomote.keptn.slo.ObjectiveDisplayName
	 * @generated
	 */
	public Adapter createObjectiveDisplayNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.lowcomote.keptn.slo.ObjectiveWarning <em>Objective Warning</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.lowcomote.keptn.slo.ObjectiveWarning
	 * @generated
	 */
	public Adapter createObjectiveWarningAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.lowcomote.keptn.slo.ObjectiveWeight <em>Objective Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.lowcomote.keptn.slo.ObjectiveWeight
	 * @generated
	 */
	public Adapter createObjectiveWeightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.lowcomote.keptn.slo.SLICriteriaCriteria <em>SLI Criteria Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.lowcomote.keptn.slo.SLICriteriaCriteria
	 * @generated
	 */
	public Adapter createSLICriteriaCriteriaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.lowcomote.keptn.slo.ScorePass <em>Score Pass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.lowcomote.keptn.slo.ScorePass
	 * @generated
	 */
	public Adapter createScorePassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.lowcomote.keptn.slo.ScoreWarning <em>Score Warning</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.lowcomote.keptn.slo.ScoreWarning
	 * @generated
	 */
	public Adapter createScoreWarningAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.lowcomote.keptn.slo.ServiceLevelObjectivesFilterPatternProperties0 <em>Service Level Objectives Filter Pattern Properties0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.lowcomote.keptn.slo.ServiceLevelObjectivesFilterPatternProperties0
	 * @generated
	 */
	public Adapter createServiceLevelObjectivesFilterPatternProperties0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.lowcomote.keptn.slo.ServiceLevelObjectivesObjectivesItems <em>Service Level Objectives Objectives Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.lowcomote.keptn.slo.ServiceLevelObjectivesObjectivesItems
	 * @generated
	 */
	public Adapter createServiceLevelObjectivesObjectivesItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.lowcomote.keptn.slo.ObjectivePassItems <em>Objective Pass Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.lowcomote.keptn.slo.ObjectivePassItems
	 * @generated
	 */
	public Adapter createObjectivePassItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.lowcomote.keptn.slo.ObjectiveWarningItems <em>Objective Warning Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.lowcomote.keptn.slo.ObjectiveWarningItems
	 * @generated
	 */
	public Adapter createObjectiveWarningItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.lowcomote.keptn.slo.SLICriteriaCriteriaItems <em>SLI Criteria Criteria Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.lowcomote.keptn.slo.SLICriteriaCriteriaItems
	 * @generated
	 */
	public Adapter createSLICriteriaCriteriaItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.lowcomote.keptn.slo.ServiceLevelObjectivesFilterAdditionalProperties <em>Service Level Objectives Filter Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.lowcomote.keptn.slo.ServiceLevelObjectivesFilterAdditionalProperties
	 * @generated
	 */
	public Adapter createServiceLevelObjectivesFilterAdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.lowcomote.keptn.slo.ServiceLevelObjectivesPropertiesAbstract <em>Service Level Objectives Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.lowcomote.keptn.slo.ServiceLevelObjectivesPropertiesAbstract
	 * @generated
	 */
	public Adapter createServiceLevelObjectivesPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.lowcomote.keptn.slo.ComparisonPropertiesAbstract <em>Comparison Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.lowcomote.keptn.slo.ComparisonPropertiesAbstract
	 * @generated
	 */
	public Adapter createComparisonPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.lowcomote.keptn.slo.ObjectivePropertiesAbstract <em>Objective Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.lowcomote.keptn.slo.ObjectivePropertiesAbstract
	 * @generated
	 */
	public Adapter createObjectivePropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.lowcomote.keptn.slo.SLICriteriaPropertiesAbstract <em>SLI Criteria Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.lowcomote.keptn.slo.SLICriteriaPropertiesAbstract
	 * @generated
	 */
	public Adapter createSLICriteriaPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.lowcomote.keptn.slo.ScorePropertiesAbstract <em>Score Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.lowcomote.keptn.slo.ScorePropertiesAbstract
	 * @generated
	 */
	public Adapter createScorePropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.lowcomote.keptn.slo.ServiceLevelObjectivesFilterPropertiesAbstract <em>Service Level Objectives Filter Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.lowcomote.keptn.slo.ServiceLevelObjectivesFilterPropertiesAbstract
	 * @generated
	 */
	public Adapter createServiceLevelObjectivesFilterPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SloAdapterFactory
