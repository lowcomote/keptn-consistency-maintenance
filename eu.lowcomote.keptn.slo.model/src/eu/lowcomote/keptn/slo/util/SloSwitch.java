/**
 */
package eu.lowcomote.keptn.slo.util;

import eu.lowcomote.keptn.slo.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see eu.lowcomote.keptn.slo.SloPackage
 * @generated
 */
public class SloSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SloPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SloSwitch() {
		if (modelPackage == null) {
			modelPackage = SloPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SloPackage.SLO_ROOT: {
				SloRoot sloRoot = (SloRoot)theEObject;
				T result = caseSloRoot(sloRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SloPackage.SERVICE_LEVEL_OBJECTIVES: {
				ServiceLevelObjectives serviceLevelObjectives = (ServiceLevelObjectives)theEObject;
				T result = caseServiceLevelObjectives(serviceLevelObjectives);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SloPackage.COMPARISON: {
				Comparison comparison = (Comparison)theEObject;
				T result = caseComparison(comparison);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SloPackage.OBJECTIVE: {
				Objective objective = (Objective)theEObject;
				T result = caseObjective(objective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SloPackage.SLI_CRITERIA: {
				SLICriteria sliCriteria = (SLICriteria)theEObject;
				T result = caseSLICriteria(sliCriteria);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SloPackage.SCORE: {
				Score score = (Score)theEObject;
				T result = caseScore(score);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SloPackage.SERVICE_LEVEL_OBJECTIVES_COMPARISON: {
				ServiceLevelObjectivesComparison serviceLevelObjectivesComparison = (ServiceLevelObjectivesComparison)theEObject;
				T result = caseServiceLevelObjectivesComparison(serviceLevelObjectivesComparison);
				if (result == null) result = caseServiceLevelObjectivesPropertiesAbstract(serviceLevelObjectivesComparison);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SloPackage.SERVICE_LEVEL_OBJECTIVES_FILTER: {
				ServiceLevelObjectivesFilter serviceLevelObjectivesFilter = (ServiceLevelObjectivesFilter)theEObject;
				T result = caseServiceLevelObjectivesFilter(serviceLevelObjectivesFilter);
				if (result == null) result = caseServiceLevelObjectivesPropertiesAbstract(serviceLevelObjectivesFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SloPackage.SERVICE_LEVEL_OBJECTIVES_OBJECTIVES: {
				ServiceLevelObjectivesObjectives serviceLevelObjectivesObjectives = (ServiceLevelObjectivesObjectives)theEObject;
				T result = caseServiceLevelObjectivesObjectives(serviceLevelObjectivesObjectives);
				if (result == null) result = caseServiceLevelObjectivesPropertiesAbstract(serviceLevelObjectivesObjectives);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SloPackage.SERVICE_LEVEL_OBJECTIVES_SPEC_VERSION: {
				ServiceLevelObjectivesSpec_version serviceLevelObjectivesSpec_version = (ServiceLevelObjectivesSpec_version)theEObject;
				T result = caseServiceLevelObjectivesSpec_version(serviceLevelObjectivesSpec_version);
				if (result == null) result = caseServiceLevelObjectivesPropertiesAbstract(serviceLevelObjectivesSpec_version);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SloPackage.SERVICE_LEVEL_OBJECTIVES_TOTAL_SCORE: {
				ServiceLevelObjectivesTotal_score serviceLevelObjectivesTotal_score = (ServiceLevelObjectivesTotal_score)theEObject;
				T result = caseServiceLevelObjectivesTotal_score(serviceLevelObjectivesTotal_score);
				if (result == null) result = caseServiceLevelObjectivesPropertiesAbstract(serviceLevelObjectivesTotal_score);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SloPackage.COMPARISON_AGGREGATE_FUNCTION: {
				ComparisonAggregate_function comparisonAggregate_function = (ComparisonAggregate_function)theEObject;
				T result = caseComparisonAggregate_function(comparisonAggregate_function);
				if (result == null) result = caseComparisonPropertiesAbstract(comparisonAggregate_function);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SloPackage.COMPARISON_COMPARE_WITH: {
				ComparisonCompare_with comparisonCompare_with = (ComparisonCompare_with)theEObject;
				T result = caseComparisonCompare_with(comparisonCompare_with);
				if (result == null) result = caseComparisonPropertiesAbstract(comparisonCompare_with);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SloPackage.COMPARISON_INCLUDE_RESULT_WITH_SCORE: {
				ComparisonInclude_result_with_score comparisonInclude_result_with_score = (ComparisonInclude_result_with_score)theEObject;
				T result = caseComparisonInclude_result_with_score(comparisonInclude_result_with_score);
				if (result == null) result = caseComparisonPropertiesAbstract(comparisonInclude_result_with_score);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SloPackage.COMPARISON_NUMBER_OF_COMPARISON_RESULTS: {
				ComparisonNumber_of_comparison_results comparisonNumber_of_comparison_results = (ComparisonNumber_of_comparison_results)theEObject;
				T result = caseComparisonNumber_of_comparison_results(comparisonNumber_of_comparison_results);
				if (result == null) result = caseComparisonPropertiesAbstract(comparisonNumber_of_comparison_results);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SloPackage.OBJECTIVE_KEY_SLI: {
				ObjectiveKey_sli objectiveKey_sli = (ObjectiveKey_sli)theEObject;
				T result = caseObjectiveKey_sli(objectiveKey_sli);
				if (result == null) result = caseObjectivePropertiesAbstract(objectiveKey_sli);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SloPackage.OBJECTIVE_PASS: {
				ObjectivePass objectivePass = (ObjectivePass)theEObject;
				T result = caseObjectivePass(objectivePass);
				if (result == null) result = caseObjectivePropertiesAbstract(objectivePass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SloPackage.OBJECTIVE_SLI: {
				ObjectiveSli objectiveSli = (ObjectiveSli)theEObject;
				T result = caseObjectiveSli(objectiveSli);
				if (result == null) result = caseObjectivePropertiesAbstract(objectiveSli);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SloPackage.OBJECTIVE_DISPLAY_NAME: {
				ObjectiveDisplayName objectiveDisplayName = (ObjectiveDisplayName)theEObject;
				T result = caseObjectiveDisplayName(objectiveDisplayName);
				if (result == null) result = caseObjectivePropertiesAbstract(objectiveDisplayName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SloPackage.OBJECTIVE_WARNING: {
				ObjectiveWarning objectiveWarning = (ObjectiveWarning)theEObject;
				T result = caseObjectiveWarning(objectiveWarning);
				if (result == null) result = caseObjectivePropertiesAbstract(objectiveWarning);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SloPackage.OBJECTIVE_WEIGHT: {
				ObjectiveWeight objectiveWeight = (ObjectiveWeight)theEObject;
				T result = caseObjectiveWeight(objectiveWeight);
				if (result == null) result = caseObjectivePropertiesAbstract(objectiveWeight);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SloPackage.SLI_CRITERIA_CRITERIA: {
				SLICriteriaCriteria sliCriteriaCriteria = (SLICriteriaCriteria)theEObject;
				T result = caseSLICriteriaCriteria(sliCriteriaCriteria);
				if (result == null) result = caseSLICriteriaPropertiesAbstract(sliCriteriaCriteria);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SloPackage.SCORE_PASS: {
				ScorePass scorePass = (ScorePass)theEObject;
				T result = caseScorePass(scorePass);
				if (result == null) result = caseScorePropertiesAbstract(scorePass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SloPackage.SCORE_WARNING: {
				ScoreWarning scoreWarning = (ScoreWarning)theEObject;
				T result = caseScoreWarning(scoreWarning);
				if (result == null) result = caseScorePropertiesAbstract(scoreWarning);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SloPackage.SERVICE_LEVEL_OBJECTIVES_FILTER_PATTERN_PROPERTIES0: {
				ServiceLevelObjectivesFilterPatternProperties0 serviceLevelObjectivesFilterPatternProperties0 = (ServiceLevelObjectivesFilterPatternProperties0)theEObject;
				T result = caseServiceLevelObjectivesFilterPatternProperties0(serviceLevelObjectivesFilterPatternProperties0);
				if (result == null) result = caseServiceLevelObjectivesFilterPropertiesAbstract(serviceLevelObjectivesFilterPatternProperties0);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SloPackage.SERVICE_LEVEL_OBJECTIVES_OBJECTIVES_ITEMS: {
				ServiceLevelObjectivesObjectivesItems serviceLevelObjectivesObjectivesItems = (ServiceLevelObjectivesObjectivesItems)theEObject;
				T result = caseServiceLevelObjectivesObjectivesItems(serviceLevelObjectivesObjectivesItems);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SloPackage.OBJECTIVE_PASS_ITEMS: {
				ObjectivePassItems objectivePassItems = (ObjectivePassItems)theEObject;
				T result = caseObjectivePassItems(objectivePassItems);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SloPackage.OBJECTIVE_WARNING_ITEMS: {
				ObjectiveWarningItems objectiveWarningItems = (ObjectiveWarningItems)theEObject;
				T result = caseObjectiveWarningItems(objectiveWarningItems);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SloPackage.SLI_CRITERIA_CRITERIA_ITEMS: {
				SLICriteriaCriteriaItems sliCriteriaCriteriaItems = (SLICriteriaCriteriaItems)theEObject;
				T result = caseSLICriteriaCriteriaItems(sliCriteriaCriteriaItems);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SloPackage.SERVICE_LEVEL_OBJECTIVES_FILTER_ADDITIONAL_PROPERTIES: {
				ServiceLevelObjectivesFilterAdditionalProperties serviceLevelObjectivesFilterAdditionalProperties = (ServiceLevelObjectivesFilterAdditionalProperties)theEObject;
				T result = caseServiceLevelObjectivesFilterAdditionalProperties(serviceLevelObjectivesFilterAdditionalProperties);
				if (result == null) result = caseServiceLevelObjectivesFilterPropertiesAbstract(serviceLevelObjectivesFilterAdditionalProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SloPackage.SERVICE_LEVEL_OBJECTIVES_PROPERTIES_ABSTRACT: {
				ServiceLevelObjectivesPropertiesAbstract serviceLevelObjectivesPropertiesAbstract = (ServiceLevelObjectivesPropertiesAbstract)theEObject;
				T result = caseServiceLevelObjectivesPropertiesAbstract(serviceLevelObjectivesPropertiesAbstract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SloPackage.COMPARISON_PROPERTIES_ABSTRACT: {
				ComparisonPropertiesAbstract comparisonPropertiesAbstract = (ComparisonPropertiesAbstract)theEObject;
				T result = caseComparisonPropertiesAbstract(comparisonPropertiesAbstract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SloPackage.OBJECTIVE_PROPERTIES_ABSTRACT: {
				ObjectivePropertiesAbstract objectivePropertiesAbstract = (ObjectivePropertiesAbstract)theEObject;
				T result = caseObjectivePropertiesAbstract(objectivePropertiesAbstract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SloPackage.SLI_CRITERIA_PROPERTIES_ABSTRACT: {
				SLICriteriaPropertiesAbstract sliCriteriaPropertiesAbstract = (SLICriteriaPropertiesAbstract)theEObject;
				T result = caseSLICriteriaPropertiesAbstract(sliCriteriaPropertiesAbstract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SloPackage.SCORE_PROPERTIES_ABSTRACT: {
				ScorePropertiesAbstract scorePropertiesAbstract = (ScorePropertiesAbstract)theEObject;
				T result = caseScorePropertiesAbstract(scorePropertiesAbstract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SloPackage.SERVICE_LEVEL_OBJECTIVES_FILTER_PROPERTIES_ABSTRACT: {
				ServiceLevelObjectivesFilterPropertiesAbstract serviceLevelObjectivesFilterPropertiesAbstract = (ServiceLevelObjectivesFilterPropertiesAbstract)theEObject;
				T result = caseServiceLevelObjectivesFilterPropertiesAbstract(serviceLevelObjectivesFilterPropertiesAbstract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSloRoot(SloRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Level Objectives</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Level Objectives</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceLevelObjectives(ServiceLevelObjectives object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparison</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparison</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComparison(Comparison object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Objective</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Objective</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjective(Objective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SLI Criteria</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SLI Criteria</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSLICriteria(SLICriteria object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Score</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Score</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScore(Score object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Level Objectives Comparison</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Level Objectives Comparison</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceLevelObjectivesComparison(ServiceLevelObjectivesComparison object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Level Objectives Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Level Objectives Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceLevelObjectivesFilter(ServiceLevelObjectivesFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Level Objectives Objectives</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Level Objectives Objectives</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceLevelObjectivesObjectives(ServiceLevelObjectivesObjectives object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Level Objectives Spec version</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Level Objectives Spec version</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceLevelObjectivesSpec_version(ServiceLevelObjectivesSpec_version object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Level Objectives Total score</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Level Objectives Total score</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceLevelObjectivesTotal_score(ServiceLevelObjectivesTotal_score object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparison Aggregate function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparison Aggregate function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComparisonAggregate_function(ComparisonAggregate_function object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparison Compare with</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparison Compare with</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComparisonCompare_with(ComparisonCompare_with object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparison Include result with score</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparison Include result with score</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComparisonInclude_result_with_score(ComparisonInclude_result_with_score object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparison Number of comparison results</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparison Number of comparison results</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComparisonNumber_of_comparison_results(ComparisonNumber_of_comparison_results object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Objective Key sli</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Objective Key sli</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectiveKey_sli(ObjectiveKey_sli object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Objective Pass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Objective Pass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectivePass(ObjectivePass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Objective Sli</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Objective Sli</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectiveSli(ObjectiveSli object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Objective Display Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Objective Display Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectiveDisplayName(ObjectiveDisplayName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Objective Warning</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Objective Warning</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectiveWarning(ObjectiveWarning object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Objective Weight</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Objective Weight</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectiveWeight(ObjectiveWeight object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SLI Criteria Criteria</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SLI Criteria Criteria</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSLICriteriaCriteria(SLICriteriaCriteria object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Score Pass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Score Pass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScorePass(ScorePass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Score Warning</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Score Warning</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScoreWarning(ScoreWarning object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Level Objectives Filter Pattern Properties0</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Level Objectives Filter Pattern Properties0</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceLevelObjectivesFilterPatternProperties0(ServiceLevelObjectivesFilterPatternProperties0 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Level Objectives Objectives Items</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Level Objectives Objectives Items</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceLevelObjectivesObjectivesItems(ServiceLevelObjectivesObjectivesItems object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Objective Pass Items</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Objective Pass Items</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectivePassItems(ObjectivePassItems object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Objective Warning Items</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Objective Warning Items</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectiveWarningItems(ObjectiveWarningItems object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SLI Criteria Criteria Items</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SLI Criteria Criteria Items</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSLICriteriaCriteriaItems(SLICriteriaCriteriaItems object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Level Objectives Filter Additional Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Level Objectives Filter Additional Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceLevelObjectivesFilterAdditionalProperties(ServiceLevelObjectivesFilterAdditionalProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Level Objectives Properties Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Level Objectives Properties Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceLevelObjectivesPropertiesAbstract(ServiceLevelObjectivesPropertiesAbstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparison Properties Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparison Properties Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComparisonPropertiesAbstract(ComparisonPropertiesAbstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Objective Properties Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Objective Properties Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectivePropertiesAbstract(ObjectivePropertiesAbstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SLI Criteria Properties Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SLI Criteria Properties Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSLICriteriaPropertiesAbstract(SLICriteriaPropertiesAbstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Score Properties Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Score Properties Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScorePropertiesAbstract(ScorePropertiesAbstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Level Objectives Filter Properties Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Level Objectives Filter Properties Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceLevelObjectivesFilterPropertiesAbstract(ServiceLevelObjectivesFilterPropertiesAbstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SloSwitch
