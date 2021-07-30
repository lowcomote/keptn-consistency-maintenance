/**
 */
package eu.lowcomote.keptn.slo;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eu.lowcomote.keptn.slo.SloPackage
 * @generated
 */
public interface SloFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SloFactory eINSTANCE = eu.lowcomote.keptn.slo.impl.SloFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root</em>'.
	 * @generated
	 */
	SloRoot createSloRoot();

	/**
	 * Returns a new object of class '<em>Service Level Objectives</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Level Objectives</em>'.
	 * @generated
	 */
	ServiceLevelObjectives createServiceLevelObjectives();

	/**
	 * Returns a new object of class '<em>Comparison</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comparison</em>'.
	 * @generated
	 */
	Comparison createComparison();

	/**
	 * Returns a new object of class '<em>Objective</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Objective</em>'.
	 * @generated
	 */
	Objective createObjective();

	/**
	 * Returns a new object of class '<em>SLI Criteria</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SLI Criteria</em>'.
	 * @generated
	 */
	SLICriteria createSLICriteria();

	/**
	 * Returns a new object of class '<em>Score</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Score</em>'.
	 * @generated
	 */
	Score createScore();

	/**
	 * Returns a new object of class '<em>Service Level Objectives Comparison</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Level Objectives Comparison</em>'.
	 * @generated
	 */
	ServiceLevelObjectivesComparison createServiceLevelObjectivesComparison();

	/**
	 * Returns a new object of class '<em>Service Level Objectives Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Level Objectives Filter</em>'.
	 * @generated
	 */
	ServiceLevelObjectivesFilter createServiceLevelObjectivesFilter();

	/**
	 * Returns a new object of class '<em>Service Level Objectives Objectives</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Level Objectives Objectives</em>'.
	 * @generated
	 */
	ServiceLevelObjectivesObjectives createServiceLevelObjectivesObjectives();

	/**
	 * Returns a new object of class '<em>Service Level Objectives Spec version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Level Objectives Spec version</em>'.
	 * @generated
	 */
	ServiceLevelObjectivesSpec_version createServiceLevelObjectivesSpec_version();

	/**
	 * Returns a new object of class '<em>Service Level Objectives Total score</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Level Objectives Total score</em>'.
	 * @generated
	 */
	ServiceLevelObjectivesTotal_score createServiceLevelObjectivesTotal_score();

	/**
	 * Returns a new object of class '<em>Comparison Aggregate function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comparison Aggregate function</em>'.
	 * @generated
	 */
	ComparisonAggregate_function createComparisonAggregate_function();

	/**
	 * Returns a new object of class '<em>Comparison Compare with</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comparison Compare with</em>'.
	 * @generated
	 */
	ComparisonCompare_with createComparisonCompare_with();

	/**
	 * Returns a new object of class '<em>Comparison Include result with score</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comparison Include result with score</em>'.
	 * @generated
	 */
	ComparisonInclude_result_with_score createComparisonInclude_result_with_score();

	/**
	 * Returns a new object of class '<em>Comparison Number of comparison results</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comparison Number of comparison results</em>'.
	 * @generated
	 */
	ComparisonNumber_of_comparison_results createComparisonNumber_of_comparison_results();

	/**
	 * Returns a new object of class '<em>Objective Key sli</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Objective Key sli</em>'.
	 * @generated
	 */
	ObjectiveKey_sli createObjectiveKey_sli();

	/**
	 * Returns a new object of class '<em>Objective Pass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Objective Pass</em>'.
	 * @generated
	 */
	ObjectivePass createObjectivePass();

	/**
	 * Returns a new object of class '<em>Objective Sli</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Objective Sli</em>'.
	 * @generated
	 */
	ObjectiveSli createObjectiveSli();

	/**
	 * Returns a new object of class '<em>Objective Display Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Objective Display Name</em>'.
	 * @generated
	 */
	ObjectiveDisplayName createObjectiveDisplayName();

	/**
	 * Returns a new object of class '<em>Objective Warning</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Objective Warning</em>'.
	 * @generated
	 */
	ObjectiveWarning createObjectiveWarning();

	/**
	 * Returns a new object of class '<em>Objective Weight</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Objective Weight</em>'.
	 * @generated
	 */
	ObjectiveWeight createObjectiveWeight();

	/**
	 * Returns a new object of class '<em>SLI Criteria Criteria</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SLI Criteria Criteria</em>'.
	 * @generated
	 */
	SLICriteriaCriteria createSLICriteriaCriteria();

	/**
	 * Returns a new object of class '<em>Score Pass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Score Pass</em>'.
	 * @generated
	 */
	ScorePass createScorePass();

	/**
	 * Returns a new object of class '<em>Score Warning</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Score Warning</em>'.
	 * @generated
	 */
	ScoreWarning createScoreWarning();

	/**
	 * Returns a new object of class '<em>Service Level Objectives Filter Pattern Properties0</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Level Objectives Filter Pattern Properties0</em>'.
	 * @generated
	 */
	ServiceLevelObjectivesFilterPatternProperties0 createServiceLevelObjectivesFilterPatternProperties0();

	/**
	 * Returns a new object of class '<em>Service Level Objectives Objectives Items</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Level Objectives Objectives Items</em>'.
	 * @generated
	 */
	ServiceLevelObjectivesObjectivesItems createServiceLevelObjectivesObjectivesItems();

	/**
	 * Returns a new object of class '<em>Objective Pass Items</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Objective Pass Items</em>'.
	 * @generated
	 */
	ObjectivePassItems createObjectivePassItems();

	/**
	 * Returns a new object of class '<em>Objective Warning Items</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Objective Warning Items</em>'.
	 * @generated
	 */
	ObjectiveWarningItems createObjectiveWarningItems();

	/**
	 * Returns a new object of class '<em>SLI Criteria Criteria Items</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SLI Criteria Criteria Items</em>'.
	 * @generated
	 */
	SLICriteriaCriteriaItems createSLICriteriaCriteriaItems();

	/**
	 * Returns a new object of class '<em>Service Level Objectives Filter Additional Properties</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Level Objectives Filter Additional Properties</em>'.
	 * @generated
	 */
	ServiceLevelObjectivesFilterAdditionalProperties createServiceLevelObjectivesFilterAdditionalProperties();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SloPackage getSloPackage();

} //SloFactory
