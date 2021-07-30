/**
 */
package eu.lowcomote.keptn.slo;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eu.lowcomote.keptn.slo.SloFactory
 * @model kind="package"
 * @generated
 */
public interface SloPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "slo";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://jku.bise.at/slo";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "slo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SloPackage eINSTANCE = eu.lowcomote.keptn.slo.impl.SloPackageImpl.init();

	/**
	 * The meta object id for the '{@link eu.lowcomote.keptn.slo.impl.SloRootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.lowcomote.keptn.slo.impl.SloRootImpl
	 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getSloRoot()
	 * @generated
	 */
	int SLO_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Slo Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLO_ROOT__SLO_ROOT = 0;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLO_ROOT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLO_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.lowcomote.keptn.slo.impl.ServiceLevelObjectivesImpl <em>Service Level Objectives</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.lowcomote.keptn.slo.impl.ServiceLevelObjectivesImpl
	 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getServiceLevelObjectives()
	 * @generated
	 */
	int SERVICE_LEVEL_OBJECTIVES = 1;

	/**
	 * The feature id for the '<em><b>Service Level Objectives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_OBJECTIVES__SERVICE_LEVEL_OBJECTIVES = 0;

	/**
	 * The number of structural features of the '<em>Service Level Objectives</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_OBJECTIVES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Service Level Objectives</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_OBJECTIVES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.lowcomote.keptn.slo.impl.ComparisonImpl <em>Comparison</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.lowcomote.keptn.slo.impl.ComparisonImpl
	 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getComparison()
	 * @generated
	 */
	int COMPARISON = 2;

	/**
	 * The feature id for the '<em><b>Comparison</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__COMPARISON = 0;

	/**
	 * The number of structural features of the '<em>Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.lowcomote.keptn.slo.impl.ObjectiveImpl <em>Objective</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.lowcomote.keptn.slo.impl.ObjectiveImpl
	 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getObjective()
	 * @generated
	 */
	int OBJECTIVE = 3;

	/**
	 * The feature id for the '<em><b>Objective</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE__OBJECTIVE = 0;

	/**
	 * The number of structural features of the '<em>Objective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Objective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.lowcomote.keptn.slo.impl.SLICriteriaImpl <em>SLI Criteria</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.lowcomote.keptn.slo.impl.SLICriteriaImpl
	 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getSLICriteria()
	 * @generated
	 */
	int SLI_CRITERIA = 4;

	/**
	 * The feature id for the '<em><b>SLI Criteria</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLI_CRITERIA__SLI_CRITERIA = 0;

	/**
	 * The number of structural features of the '<em>SLI Criteria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLI_CRITERIA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>SLI Criteria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLI_CRITERIA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.lowcomote.keptn.slo.impl.ScoreImpl <em>Score</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.lowcomote.keptn.slo.impl.ScoreImpl
	 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getScore()
	 * @generated
	 */
	int SCORE = 5;

	/**
	 * The feature id for the '<em><b>Score</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE__SCORE = 0;

	/**
	 * The number of structural features of the '<em>Score</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Score</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.lowcomote.keptn.slo.impl.ServiceLevelObjectivesPropertiesAbstractImpl <em>Service Level Objectives Properties Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.lowcomote.keptn.slo.impl.ServiceLevelObjectivesPropertiesAbstractImpl
	 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getServiceLevelObjectivesPropertiesAbstract()
	 * @generated
	 */
	int SERVICE_LEVEL_OBJECTIVES_PROPERTIES_ABSTRACT = 30;

	/**
	 * The number of structural features of the '<em>Service Level Objectives Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_OBJECTIVES_PROPERTIES_ABSTRACT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Service Level Objectives Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_OBJECTIVES_PROPERTIES_ABSTRACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.lowcomote.keptn.slo.impl.ServiceLevelObjectivesComparisonImpl <em>Service Level Objectives Comparison</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.lowcomote.keptn.slo.impl.ServiceLevelObjectivesComparisonImpl
	 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getServiceLevelObjectivesComparison()
	 * @generated
	 */
	int SERVICE_LEVEL_OBJECTIVES_COMPARISON = 6;

	/**
	 * The feature id for the '<em><b>Comparison</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_OBJECTIVES_COMPARISON__COMPARISON = SERVICE_LEVEL_OBJECTIVES_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service Level Objectives Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_OBJECTIVES_COMPARISON_FEATURE_COUNT = SERVICE_LEVEL_OBJECTIVES_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Service Level Objectives Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_OBJECTIVES_COMPARISON_OPERATION_COUNT = SERVICE_LEVEL_OBJECTIVES_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.lowcomote.keptn.slo.impl.ServiceLevelObjectivesFilterImpl <em>Service Level Objectives Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.lowcomote.keptn.slo.impl.ServiceLevelObjectivesFilterImpl
	 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getServiceLevelObjectivesFilter()
	 * @generated
	 */
	int SERVICE_LEVEL_OBJECTIVES_FILTER = 7;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_OBJECTIVES_FILTER__FILTER = SERVICE_LEVEL_OBJECTIVES_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service Level Objectives Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_OBJECTIVES_FILTER_FEATURE_COUNT = SERVICE_LEVEL_OBJECTIVES_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Service Level Objectives Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_OBJECTIVES_FILTER_OPERATION_COUNT = SERVICE_LEVEL_OBJECTIVES_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.lowcomote.keptn.slo.impl.ServiceLevelObjectivesObjectivesImpl <em>Service Level Objectives Objectives</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.lowcomote.keptn.slo.impl.ServiceLevelObjectivesObjectivesImpl
	 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getServiceLevelObjectivesObjectives()
	 * @generated
	 */
	int SERVICE_LEVEL_OBJECTIVES_OBJECTIVES = 8;

	/**
	 * The feature id for the '<em><b>Objectives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_OBJECTIVES_OBJECTIVES__OBJECTIVES = SERVICE_LEVEL_OBJECTIVES_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service Level Objectives Objectives</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_OBJECTIVES_OBJECTIVES_FEATURE_COUNT = SERVICE_LEVEL_OBJECTIVES_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Service Level Objectives Objectives</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_OBJECTIVES_OBJECTIVES_OPERATION_COUNT = SERVICE_LEVEL_OBJECTIVES_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.lowcomote.keptn.slo.impl.ServiceLevelObjectivesSpec_versionImpl <em>Service Level Objectives Spec version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.lowcomote.keptn.slo.impl.ServiceLevelObjectivesSpec_versionImpl
	 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getServiceLevelObjectivesSpec_version()
	 * @generated
	 */
	int SERVICE_LEVEL_OBJECTIVES_SPEC_VERSION = 9;

	/**
	 * The feature id for the '<em><b>Spec version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_OBJECTIVES_SPEC_VERSION__SPEC_VERSION = SERVICE_LEVEL_OBJECTIVES_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service Level Objectives Spec version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_OBJECTIVES_SPEC_VERSION_FEATURE_COUNT = SERVICE_LEVEL_OBJECTIVES_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Service Level Objectives Spec version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_OBJECTIVES_SPEC_VERSION_OPERATION_COUNT = SERVICE_LEVEL_OBJECTIVES_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.lowcomote.keptn.slo.impl.ServiceLevelObjectivesTotal_scoreImpl <em>Service Level Objectives Total score</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.lowcomote.keptn.slo.impl.ServiceLevelObjectivesTotal_scoreImpl
	 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getServiceLevelObjectivesTotal_score()
	 * @generated
	 */
	int SERVICE_LEVEL_OBJECTIVES_TOTAL_SCORE = 10;

	/**
	 * The feature id for the '<em><b>Total score</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_OBJECTIVES_TOTAL_SCORE__TOTAL_SCORE = SERVICE_LEVEL_OBJECTIVES_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service Level Objectives Total score</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_OBJECTIVES_TOTAL_SCORE_FEATURE_COUNT = SERVICE_LEVEL_OBJECTIVES_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Service Level Objectives Total score</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_OBJECTIVES_TOTAL_SCORE_OPERATION_COUNT = SERVICE_LEVEL_OBJECTIVES_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.lowcomote.keptn.slo.impl.ComparisonPropertiesAbstractImpl <em>Comparison Properties Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.lowcomote.keptn.slo.impl.ComparisonPropertiesAbstractImpl
	 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getComparisonPropertiesAbstract()
	 * @generated
	 */
	int COMPARISON_PROPERTIES_ABSTRACT = 31;

	/**
	 * The number of structural features of the '<em>Comparison Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_PROPERTIES_ABSTRACT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Comparison Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_PROPERTIES_ABSTRACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.lowcomote.keptn.slo.impl.ComparisonAggregate_functionImpl <em>Comparison Aggregate function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.lowcomote.keptn.slo.impl.ComparisonAggregate_functionImpl
	 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getComparisonAggregate_function()
	 * @generated
	 */
	int COMPARISON_AGGREGATE_FUNCTION = 11;

	/**
	 * The feature id for the '<em><b>Aggregate function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_AGGREGATE_FUNCTION__AGGREGATE_FUNCTION = COMPARISON_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Comparison Aggregate function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_AGGREGATE_FUNCTION_FEATURE_COUNT = COMPARISON_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Comparison Aggregate function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_AGGREGATE_FUNCTION_OPERATION_COUNT = COMPARISON_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.lowcomote.keptn.slo.impl.ComparisonCompare_withImpl <em>Comparison Compare with</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.lowcomote.keptn.slo.impl.ComparisonCompare_withImpl
	 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getComparisonCompare_with()
	 * @generated
	 */
	int COMPARISON_COMPARE_WITH = 12;

	/**
	 * The feature id for the '<em><b>Compare with</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_COMPARE_WITH__COMPARE_WITH = COMPARISON_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Comparison Compare with</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_COMPARE_WITH_FEATURE_COUNT = COMPARISON_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Comparison Compare with</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_COMPARE_WITH_OPERATION_COUNT = COMPARISON_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.lowcomote.keptn.slo.impl.ComparisonInclude_result_with_scoreImpl <em>Comparison Include result with score</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.lowcomote.keptn.slo.impl.ComparisonInclude_result_with_scoreImpl
	 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getComparisonInclude_result_with_score()
	 * @generated
	 */
	int COMPARISON_INCLUDE_RESULT_WITH_SCORE = 13;

	/**
	 * The feature id for the '<em><b>Include result with score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_INCLUDE_RESULT_WITH_SCORE__INCLUDE_RESULT_WITH_SCORE = COMPARISON_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Comparison Include result with score</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_INCLUDE_RESULT_WITH_SCORE_FEATURE_COUNT = COMPARISON_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Comparison Include result with score</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_INCLUDE_RESULT_WITH_SCORE_OPERATION_COUNT = COMPARISON_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.lowcomote.keptn.slo.impl.ComparisonNumber_of_comparison_resultsImpl <em>Comparison Number of comparison results</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.lowcomote.keptn.slo.impl.ComparisonNumber_of_comparison_resultsImpl
	 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getComparisonNumber_of_comparison_results()
	 * @generated
	 */
	int COMPARISON_NUMBER_OF_COMPARISON_RESULTS = 14;

	/**
	 * The feature id for the '<em><b>Number of comparison results</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_NUMBER_OF_COMPARISON_RESULTS__NUMBER_OF_COMPARISON_RESULTS = COMPARISON_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Comparison Number of comparison results</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_NUMBER_OF_COMPARISON_RESULTS_FEATURE_COUNT = COMPARISON_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Comparison Number of comparison results</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_NUMBER_OF_COMPARISON_RESULTS_OPERATION_COUNT = COMPARISON_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.lowcomote.keptn.slo.impl.ObjectivePropertiesAbstractImpl <em>Objective Properties Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.lowcomote.keptn.slo.impl.ObjectivePropertiesAbstractImpl
	 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getObjectivePropertiesAbstract()
	 * @generated
	 */
	int OBJECTIVE_PROPERTIES_ABSTRACT = 32;

	/**
	 * The number of structural features of the '<em>Objective Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_PROPERTIES_ABSTRACT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Objective Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_PROPERTIES_ABSTRACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.lowcomote.keptn.slo.impl.ObjectiveKey_sliImpl <em>Objective Key sli</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.lowcomote.keptn.slo.impl.ObjectiveKey_sliImpl
	 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getObjectiveKey_sli()
	 * @generated
	 */
	int OBJECTIVE_KEY_SLI = 15;

	/**
	 * The feature id for the '<em><b>Key sli</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_KEY_SLI__KEY_SLI = OBJECTIVE_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Objective Key sli</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_KEY_SLI_FEATURE_COUNT = OBJECTIVE_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Objective Key sli</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_KEY_SLI_OPERATION_COUNT = OBJECTIVE_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.lowcomote.keptn.slo.impl.ObjectivePassImpl <em>Objective Pass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.lowcomote.keptn.slo.impl.ObjectivePassImpl
	 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getObjectivePass()
	 * @generated
	 */
	int OBJECTIVE_PASS = 16;

	/**
	 * The feature id for the '<em><b>Pass</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_PASS__PASS = OBJECTIVE_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Objective Pass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_PASS_FEATURE_COUNT = OBJECTIVE_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Objective Pass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_PASS_OPERATION_COUNT = OBJECTIVE_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.lowcomote.keptn.slo.impl.ObjectiveSliImpl <em>Objective Sli</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.lowcomote.keptn.slo.impl.ObjectiveSliImpl
	 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getObjectiveSli()
	 * @generated
	 */
	int OBJECTIVE_SLI = 17;

	/**
	 * The feature id for the '<em><b>Sli</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_SLI__SLI = OBJECTIVE_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Objective Sli</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_SLI_FEATURE_COUNT = OBJECTIVE_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Objective Sli</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_SLI_OPERATION_COUNT = OBJECTIVE_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.lowcomote.keptn.slo.impl.ObjectiveDisplayNameImpl <em>Objective Display Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.lowcomote.keptn.slo.impl.ObjectiveDisplayNameImpl
	 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getObjectiveDisplayName()
	 * @generated
	 */
	int OBJECTIVE_DISPLAY_NAME = 18;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_DISPLAY_NAME__DISPLAY_NAME = OBJECTIVE_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Objective Display Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_DISPLAY_NAME_FEATURE_COUNT = OBJECTIVE_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Objective Display Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_DISPLAY_NAME_OPERATION_COUNT = OBJECTIVE_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.lowcomote.keptn.slo.impl.ObjectiveWarningImpl <em>Objective Warning</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.lowcomote.keptn.slo.impl.ObjectiveWarningImpl
	 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getObjectiveWarning()
	 * @generated
	 */
	int OBJECTIVE_WARNING = 19;

	/**
	 * The feature id for the '<em><b>Warning</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_WARNING__WARNING = OBJECTIVE_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Objective Warning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_WARNING_FEATURE_COUNT = OBJECTIVE_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Objective Warning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_WARNING_OPERATION_COUNT = OBJECTIVE_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.lowcomote.keptn.slo.impl.ObjectiveWeightImpl <em>Objective Weight</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.lowcomote.keptn.slo.impl.ObjectiveWeightImpl
	 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getObjectiveWeight()
	 * @generated
	 */
	int OBJECTIVE_WEIGHT = 20;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_WEIGHT__WEIGHT = OBJECTIVE_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Objective Weight</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_WEIGHT_FEATURE_COUNT = OBJECTIVE_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Objective Weight</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_WEIGHT_OPERATION_COUNT = OBJECTIVE_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.lowcomote.keptn.slo.impl.SLICriteriaPropertiesAbstractImpl <em>SLI Criteria Properties Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.lowcomote.keptn.slo.impl.SLICriteriaPropertiesAbstractImpl
	 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getSLICriteriaPropertiesAbstract()
	 * @generated
	 */
	int SLI_CRITERIA_PROPERTIES_ABSTRACT = 33;

	/**
	 * The number of structural features of the '<em>SLI Criteria Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLI_CRITERIA_PROPERTIES_ABSTRACT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>SLI Criteria Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLI_CRITERIA_PROPERTIES_ABSTRACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.lowcomote.keptn.slo.impl.SLICriteriaCriteriaImpl <em>SLI Criteria Criteria</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.lowcomote.keptn.slo.impl.SLICriteriaCriteriaImpl
	 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getSLICriteriaCriteria()
	 * @generated
	 */
	int SLI_CRITERIA_CRITERIA = 21;

	/**
	 * The feature id for the '<em><b>Criteria</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLI_CRITERIA_CRITERIA__CRITERIA = SLI_CRITERIA_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SLI Criteria Criteria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLI_CRITERIA_CRITERIA_FEATURE_COUNT = SLI_CRITERIA_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>SLI Criteria Criteria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLI_CRITERIA_CRITERIA_OPERATION_COUNT = SLI_CRITERIA_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.lowcomote.keptn.slo.impl.ScorePropertiesAbstractImpl <em>Score Properties Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.lowcomote.keptn.slo.impl.ScorePropertiesAbstractImpl
	 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getScorePropertiesAbstract()
	 * @generated
	 */
	int SCORE_PROPERTIES_ABSTRACT = 34;

	/**
	 * The number of structural features of the '<em>Score Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_PROPERTIES_ABSTRACT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Score Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_PROPERTIES_ABSTRACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.lowcomote.keptn.slo.impl.ScorePassImpl <em>Score Pass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.lowcomote.keptn.slo.impl.ScorePassImpl
	 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getScorePass()
	 * @generated
	 */
	int SCORE_PASS = 22;

	/**
	 * The feature id for the '<em><b>Pass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_PASS__PASS = SCORE_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Score Pass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_PASS_FEATURE_COUNT = SCORE_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Score Pass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_PASS_OPERATION_COUNT = SCORE_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.lowcomote.keptn.slo.impl.ScoreWarningImpl <em>Score Warning</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.lowcomote.keptn.slo.impl.ScoreWarningImpl
	 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getScoreWarning()
	 * @generated
	 */
	int SCORE_WARNING = 23;

	/**
	 * The feature id for the '<em><b>Warning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_WARNING__WARNING = SCORE_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Score Warning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_WARNING_FEATURE_COUNT = SCORE_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Score Warning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_WARNING_OPERATION_COUNT = SCORE_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.lowcomote.keptn.slo.impl.ServiceLevelObjectivesFilterPropertiesAbstractImpl <em>Service Level Objectives Filter Properties Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.lowcomote.keptn.slo.impl.ServiceLevelObjectivesFilterPropertiesAbstractImpl
	 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getServiceLevelObjectivesFilterPropertiesAbstract()
	 * @generated
	 */
	int SERVICE_LEVEL_OBJECTIVES_FILTER_PROPERTIES_ABSTRACT = 35;

	/**
	 * The number of structural features of the '<em>Service Level Objectives Filter Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_OBJECTIVES_FILTER_PROPERTIES_ABSTRACT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Service Level Objectives Filter Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_OBJECTIVES_FILTER_PROPERTIES_ABSTRACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.lowcomote.keptn.slo.impl.ServiceLevelObjectivesFilterPatternProperties0Impl <em>Service Level Objectives Filter Pattern Properties0</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.lowcomote.keptn.slo.impl.ServiceLevelObjectivesFilterPatternProperties0Impl
	 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getServiceLevelObjectivesFilterPatternProperties0()
	 * @generated
	 */
	int SERVICE_LEVEL_OBJECTIVES_FILTER_PATTERN_PROPERTIES0 = 24;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_OBJECTIVES_FILTER_PATTERN_PROPERTIES0__KEY = SERVICE_LEVEL_OBJECTIVES_FILTER_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pattern Properties0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_OBJECTIVES_FILTER_PATTERN_PROPERTIES0__PATTERN_PROPERTIES0 = SERVICE_LEVEL_OBJECTIVES_FILTER_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service Level Objectives Filter Pattern Properties0</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_OBJECTIVES_FILTER_PATTERN_PROPERTIES0_FEATURE_COUNT = SERVICE_LEVEL_OBJECTIVES_FILTER_PROPERTIES_ABSTRACT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Service Level Objectives Filter Pattern Properties0</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_OBJECTIVES_FILTER_PATTERN_PROPERTIES0_OPERATION_COUNT = SERVICE_LEVEL_OBJECTIVES_FILTER_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.lowcomote.keptn.slo.impl.ServiceLevelObjectivesObjectivesItemsImpl <em>Service Level Objectives Objectives Items</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.lowcomote.keptn.slo.impl.ServiceLevelObjectivesObjectivesItemsImpl
	 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getServiceLevelObjectivesObjectivesItems()
	 * @generated
	 */
	int SERVICE_LEVEL_OBJECTIVES_OBJECTIVES_ITEMS = 25;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_OBJECTIVES_OBJECTIVES_ITEMS__ITEMS = 0;

	/**
	 * The number of structural features of the '<em>Service Level Objectives Objectives Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_OBJECTIVES_OBJECTIVES_ITEMS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Service Level Objectives Objectives Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_OBJECTIVES_OBJECTIVES_ITEMS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.lowcomote.keptn.slo.impl.ObjectivePassItemsImpl <em>Objective Pass Items</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.lowcomote.keptn.slo.impl.ObjectivePassItemsImpl
	 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getObjectivePassItems()
	 * @generated
	 */
	int OBJECTIVE_PASS_ITEMS = 26;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_PASS_ITEMS__ITEMS = 0;

	/**
	 * The number of structural features of the '<em>Objective Pass Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_PASS_ITEMS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Objective Pass Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_PASS_ITEMS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.lowcomote.keptn.slo.impl.ObjectiveWarningItemsImpl <em>Objective Warning Items</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.lowcomote.keptn.slo.impl.ObjectiveWarningItemsImpl
	 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getObjectiveWarningItems()
	 * @generated
	 */
	int OBJECTIVE_WARNING_ITEMS = 27;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_WARNING_ITEMS__ITEMS = 0;

	/**
	 * The number of structural features of the '<em>Objective Warning Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_WARNING_ITEMS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Objective Warning Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_WARNING_ITEMS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.lowcomote.keptn.slo.impl.SLICriteriaCriteriaItemsImpl <em>SLI Criteria Criteria Items</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.lowcomote.keptn.slo.impl.SLICriteriaCriteriaItemsImpl
	 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getSLICriteriaCriteriaItems()
	 * @generated
	 */
	int SLI_CRITERIA_CRITERIA_ITEMS = 28;

	/**
	 * The feature id for the '<em><b>Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLI_CRITERIA_CRITERIA_ITEMS__ITEMS = 0;

	/**
	 * The number of structural features of the '<em>SLI Criteria Criteria Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLI_CRITERIA_CRITERIA_ITEMS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>SLI Criteria Criteria Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLI_CRITERIA_CRITERIA_ITEMS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.lowcomote.keptn.slo.impl.ServiceLevelObjectivesFilterAdditionalPropertiesImpl <em>Service Level Objectives Filter Additional Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.lowcomote.keptn.slo.impl.ServiceLevelObjectivesFilterAdditionalPropertiesImpl
	 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getServiceLevelObjectivesFilterAdditionalProperties()
	 * @generated
	 */
	int SERVICE_LEVEL_OBJECTIVES_FILTER_ADDITIONAL_PROPERTIES = 29;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_OBJECTIVES_FILTER_ADDITIONAL_PROPERTIES__KEY = SERVICE_LEVEL_OBJECTIVES_FILTER_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Additional Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_OBJECTIVES_FILTER_ADDITIONAL_PROPERTIES__ADDITIONAL_PROPERTIES = SERVICE_LEVEL_OBJECTIVES_FILTER_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service Level Objectives Filter Additional Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_OBJECTIVES_FILTER_ADDITIONAL_PROPERTIES_FEATURE_COUNT = SERVICE_LEVEL_OBJECTIVES_FILTER_PROPERTIES_ABSTRACT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Service Level Objectives Filter Additional Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_OBJECTIVES_FILTER_ADDITIONAL_PROPERTIES_OPERATION_COUNT = SERVICE_LEVEL_OBJECTIVES_FILTER_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link eu.lowcomote.keptn.slo.SloRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see eu.lowcomote.keptn.slo.SloRoot
	 * @generated
	 */
	EClass getSloRoot();

	/**
	 * Returns the meta object for the containment reference '{@link eu.lowcomote.keptn.slo.SloRoot#getSloRoot <em>Slo Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Slo Root</em>'.
	 * @see eu.lowcomote.keptn.slo.SloRoot#getSloRoot()
	 * @see #getSloRoot()
	 * @generated
	 */
	EReference getSloRoot_SloRoot();

	/**
	 * Returns the meta object for class '{@link eu.lowcomote.keptn.slo.ServiceLevelObjectives <em>Service Level Objectives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Level Objectives</em>'.
	 * @see eu.lowcomote.keptn.slo.ServiceLevelObjectives
	 * @generated
	 */
	EClass getServiceLevelObjectives();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.lowcomote.keptn.slo.ServiceLevelObjectives#getServiceLevelObjectives <em>Service Level Objectives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Level Objectives</em>'.
	 * @see eu.lowcomote.keptn.slo.ServiceLevelObjectives#getServiceLevelObjectives()
	 * @see #getServiceLevelObjectives()
	 * @generated
	 */
	EReference getServiceLevelObjectives_ServiceLevelObjectives();

	/**
	 * Returns the meta object for class '{@link eu.lowcomote.keptn.slo.Comparison <em>Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison</em>'.
	 * @see eu.lowcomote.keptn.slo.Comparison
	 * @generated
	 */
	EClass getComparison();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.lowcomote.keptn.slo.Comparison#getComparison <em>Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comparison</em>'.
	 * @see eu.lowcomote.keptn.slo.Comparison#getComparison()
	 * @see #getComparison()
	 * @generated
	 */
	EReference getComparison_Comparison();

	/**
	 * Returns the meta object for class '{@link eu.lowcomote.keptn.slo.Objective <em>Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Objective</em>'.
	 * @see eu.lowcomote.keptn.slo.Objective
	 * @generated
	 */
	EClass getObjective();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.lowcomote.keptn.slo.Objective#getObjective <em>Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objective</em>'.
	 * @see eu.lowcomote.keptn.slo.Objective#getObjective()
	 * @see #getObjective()
	 * @generated
	 */
	EReference getObjective_Objective();

	/**
	 * Returns the meta object for class '{@link eu.lowcomote.keptn.slo.SLICriteria <em>SLI Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SLI Criteria</em>'.
	 * @see eu.lowcomote.keptn.slo.SLICriteria
	 * @generated
	 */
	EClass getSLICriteria();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.lowcomote.keptn.slo.SLICriteria#getSLICriteria <em>SLI Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SLI Criteria</em>'.
	 * @see eu.lowcomote.keptn.slo.SLICriteria#getSLICriteria()
	 * @see #getSLICriteria()
	 * @generated
	 */
	EReference getSLICriteria_SLICriteria();

	/**
	 * Returns the meta object for class '{@link eu.lowcomote.keptn.slo.Score <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Score</em>'.
	 * @see eu.lowcomote.keptn.slo.Score
	 * @generated
	 */
	EClass getScore();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.lowcomote.keptn.slo.Score#getScore <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Score</em>'.
	 * @see eu.lowcomote.keptn.slo.Score#getScore()
	 * @see #getScore()
	 * @generated
	 */
	EReference getScore_Score();

	/**
	 * Returns the meta object for class '{@link eu.lowcomote.keptn.slo.ServiceLevelObjectivesComparison <em>Service Level Objectives Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Level Objectives Comparison</em>'.
	 * @see eu.lowcomote.keptn.slo.ServiceLevelObjectivesComparison
	 * @generated
	 */
	EClass getServiceLevelObjectivesComparison();

	/**
	 * Returns the meta object for the containment reference '{@link eu.lowcomote.keptn.slo.ServiceLevelObjectivesComparison#getComparison <em>Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Comparison</em>'.
	 * @see eu.lowcomote.keptn.slo.ServiceLevelObjectivesComparison#getComparison()
	 * @see #getServiceLevelObjectivesComparison()
	 * @generated
	 */
	EReference getServiceLevelObjectivesComparison_Comparison();

	/**
	 * Returns the meta object for class '{@link eu.lowcomote.keptn.slo.ServiceLevelObjectivesFilter <em>Service Level Objectives Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Level Objectives Filter</em>'.
	 * @see eu.lowcomote.keptn.slo.ServiceLevelObjectivesFilter
	 * @generated
	 */
	EClass getServiceLevelObjectivesFilter();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.lowcomote.keptn.slo.ServiceLevelObjectivesFilter#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filter</em>'.
	 * @see eu.lowcomote.keptn.slo.ServiceLevelObjectivesFilter#getFilter()
	 * @see #getServiceLevelObjectivesFilter()
	 * @generated
	 */
	EReference getServiceLevelObjectivesFilter_Filter();

	/**
	 * Returns the meta object for class '{@link eu.lowcomote.keptn.slo.ServiceLevelObjectivesObjectives <em>Service Level Objectives Objectives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Level Objectives Objectives</em>'.
	 * @see eu.lowcomote.keptn.slo.ServiceLevelObjectivesObjectives
	 * @generated
	 */
	EClass getServiceLevelObjectivesObjectives();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.lowcomote.keptn.slo.ServiceLevelObjectivesObjectives#getObjectives <em>Objectives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objectives</em>'.
	 * @see eu.lowcomote.keptn.slo.ServiceLevelObjectivesObjectives#getObjectives()
	 * @see #getServiceLevelObjectivesObjectives()
	 * @generated
	 */
	EReference getServiceLevelObjectivesObjectives_Objectives();

	/**
	 * Returns the meta object for class '{@link eu.lowcomote.keptn.slo.ServiceLevelObjectivesSpec_version <em>Service Level Objectives Spec version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Level Objectives Spec version</em>'.
	 * @see eu.lowcomote.keptn.slo.ServiceLevelObjectivesSpec_version
	 * @generated
	 */
	EClass getServiceLevelObjectivesSpec_version();

	/**
	 * Returns the meta object for the attribute '{@link eu.lowcomote.keptn.slo.ServiceLevelObjectivesSpec_version#getSpec_version <em>Spec version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spec version</em>'.
	 * @see eu.lowcomote.keptn.slo.ServiceLevelObjectivesSpec_version#getSpec_version()
	 * @see #getServiceLevelObjectivesSpec_version()
	 * @generated
	 */
	EAttribute getServiceLevelObjectivesSpec_version_Spec_version();

	/**
	 * Returns the meta object for class '{@link eu.lowcomote.keptn.slo.ServiceLevelObjectivesTotal_score <em>Service Level Objectives Total score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Level Objectives Total score</em>'.
	 * @see eu.lowcomote.keptn.slo.ServiceLevelObjectivesTotal_score
	 * @generated
	 */
	EClass getServiceLevelObjectivesTotal_score();

	/**
	 * Returns the meta object for the containment reference '{@link eu.lowcomote.keptn.slo.ServiceLevelObjectivesTotal_score#getTotal_score <em>Total score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Total score</em>'.
	 * @see eu.lowcomote.keptn.slo.ServiceLevelObjectivesTotal_score#getTotal_score()
	 * @see #getServiceLevelObjectivesTotal_score()
	 * @generated
	 */
	EReference getServiceLevelObjectivesTotal_score_Total_score();

	/**
	 * Returns the meta object for class '{@link eu.lowcomote.keptn.slo.ComparisonAggregate_function <em>Comparison Aggregate function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison Aggregate function</em>'.
	 * @see eu.lowcomote.keptn.slo.ComparisonAggregate_function
	 * @generated
	 */
	EClass getComparisonAggregate_function();

	/**
	 * Returns the meta object for the attribute '{@link eu.lowcomote.keptn.slo.ComparisonAggregate_function#getAggregate_function <em>Aggregate function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aggregate function</em>'.
	 * @see eu.lowcomote.keptn.slo.ComparisonAggregate_function#getAggregate_function()
	 * @see #getComparisonAggregate_function()
	 * @generated
	 */
	EAttribute getComparisonAggregate_function_Aggregate_function();

	/**
	 * Returns the meta object for class '{@link eu.lowcomote.keptn.slo.ComparisonCompare_with <em>Comparison Compare with</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison Compare with</em>'.
	 * @see eu.lowcomote.keptn.slo.ComparisonCompare_with
	 * @generated
	 */
	EClass getComparisonCompare_with();

	/**
	 * Returns the meta object for the attribute '{@link eu.lowcomote.keptn.slo.ComparisonCompare_with#getCompare_with <em>Compare with</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compare with</em>'.
	 * @see eu.lowcomote.keptn.slo.ComparisonCompare_with#getCompare_with()
	 * @see #getComparisonCompare_with()
	 * @generated
	 */
	EAttribute getComparisonCompare_with_Compare_with();

	/**
	 * Returns the meta object for class '{@link eu.lowcomote.keptn.slo.ComparisonInclude_result_with_score <em>Comparison Include result with score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison Include result with score</em>'.
	 * @see eu.lowcomote.keptn.slo.ComparisonInclude_result_with_score
	 * @generated
	 */
	EClass getComparisonInclude_result_with_score();

	/**
	 * Returns the meta object for the attribute '{@link eu.lowcomote.keptn.slo.ComparisonInclude_result_with_score#getInclude_result_with_score <em>Include result with score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include result with score</em>'.
	 * @see eu.lowcomote.keptn.slo.ComparisonInclude_result_with_score#getInclude_result_with_score()
	 * @see #getComparisonInclude_result_with_score()
	 * @generated
	 */
	EAttribute getComparisonInclude_result_with_score_Include_result_with_score();

	/**
	 * Returns the meta object for class '{@link eu.lowcomote.keptn.slo.ComparisonNumber_of_comparison_results <em>Comparison Number of comparison results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison Number of comparison results</em>'.
	 * @see eu.lowcomote.keptn.slo.ComparisonNumber_of_comparison_results
	 * @generated
	 */
	EClass getComparisonNumber_of_comparison_results();

	/**
	 * Returns the meta object for the attribute '{@link eu.lowcomote.keptn.slo.ComparisonNumber_of_comparison_results#getNumber_of_comparison_results <em>Number of comparison results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number of comparison results</em>'.
	 * @see eu.lowcomote.keptn.slo.ComparisonNumber_of_comparison_results#getNumber_of_comparison_results()
	 * @see #getComparisonNumber_of_comparison_results()
	 * @generated
	 */
	EAttribute getComparisonNumber_of_comparison_results_Number_of_comparison_results();

	/**
	 * Returns the meta object for class '{@link eu.lowcomote.keptn.slo.ObjectiveKey_sli <em>Objective Key sli</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Objective Key sli</em>'.
	 * @see eu.lowcomote.keptn.slo.ObjectiveKey_sli
	 * @generated
	 */
	EClass getObjectiveKey_sli();

	/**
	 * Returns the meta object for the attribute '{@link eu.lowcomote.keptn.slo.ObjectiveKey_sli#isKey_sli <em>Key sli</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key sli</em>'.
	 * @see eu.lowcomote.keptn.slo.ObjectiveKey_sli#isKey_sli()
	 * @see #getObjectiveKey_sli()
	 * @generated
	 */
	EAttribute getObjectiveKey_sli_Key_sli();

	/**
	 * Returns the meta object for class '{@link eu.lowcomote.keptn.slo.ObjectivePass <em>Objective Pass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Objective Pass</em>'.
	 * @see eu.lowcomote.keptn.slo.ObjectivePass
	 * @generated
	 */
	EClass getObjectivePass();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.lowcomote.keptn.slo.ObjectivePass#getPass <em>Pass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pass</em>'.
	 * @see eu.lowcomote.keptn.slo.ObjectivePass#getPass()
	 * @see #getObjectivePass()
	 * @generated
	 */
	EReference getObjectivePass_Pass();

	/**
	 * Returns the meta object for class '{@link eu.lowcomote.keptn.slo.ObjectiveSli <em>Objective Sli</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Objective Sli</em>'.
	 * @see eu.lowcomote.keptn.slo.ObjectiveSli
	 * @generated
	 */
	EClass getObjectiveSli();

	/**
	 * Returns the meta object for the attribute '{@link eu.lowcomote.keptn.slo.ObjectiveSli#getSli <em>Sli</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sli</em>'.
	 * @see eu.lowcomote.keptn.slo.ObjectiveSli#getSli()
	 * @see #getObjectiveSli()
	 * @generated
	 */
	EAttribute getObjectiveSli_Sli();

	/**
	 * Returns the meta object for class '{@link eu.lowcomote.keptn.slo.ObjectiveDisplayName <em>Objective Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Objective Display Name</em>'.
	 * @see eu.lowcomote.keptn.slo.ObjectiveDisplayName
	 * @generated
	 */
	EClass getObjectiveDisplayName();

	/**
	 * Returns the meta object for the attribute '{@link eu.lowcomote.keptn.slo.ObjectiveDisplayName#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see eu.lowcomote.keptn.slo.ObjectiveDisplayName#getDisplayName()
	 * @see #getObjectiveDisplayName()
	 * @generated
	 */
	EAttribute getObjectiveDisplayName_DisplayName();

	/**
	 * Returns the meta object for class '{@link eu.lowcomote.keptn.slo.ObjectiveWarning <em>Objective Warning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Objective Warning</em>'.
	 * @see eu.lowcomote.keptn.slo.ObjectiveWarning
	 * @generated
	 */
	EClass getObjectiveWarning();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.lowcomote.keptn.slo.ObjectiveWarning#getWarning <em>Warning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Warning</em>'.
	 * @see eu.lowcomote.keptn.slo.ObjectiveWarning#getWarning()
	 * @see #getObjectiveWarning()
	 * @generated
	 */
	EReference getObjectiveWarning_Warning();

	/**
	 * Returns the meta object for class '{@link eu.lowcomote.keptn.slo.ObjectiveWeight <em>Objective Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Objective Weight</em>'.
	 * @see eu.lowcomote.keptn.slo.ObjectiveWeight
	 * @generated
	 */
	EClass getObjectiveWeight();

	/**
	 * Returns the meta object for the attribute '{@link eu.lowcomote.keptn.slo.ObjectiveWeight#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see eu.lowcomote.keptn.slo.ObjectiveWeight#getWeight()
	 * @see #getObjectiveWeight()
	 * @generated
	 */
	EAttribute getObjectiveWeight_Weight();

	/**
	 * Returns the meta object for class '{@link eu.lowcomote.keptn.slo.SLICriteriaCriteria <em>SLI Criteria Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SLI Criteria Criteria</em>'.
	 * @see eu.lowcomote.keptn.slo.SLICriteriaCriteria
	 * @generated
	 */
	EClass getSLICriteriaCriteria();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.lowcomote.keptn.slo.SLICriteriaCriteria#getCriteria <em>Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Criteria</em>'.
	 * @see eu.lowcomote.keptn.slo.SLICriteriaCriteria#getCriteria()
	 * @see #getSLICriteriaCriteria()
	 * @generated
	 */
	EReference getSLICriteriaCriteria_Criteria();

	/**
	 * Returns the meta object for class '{@link eu.lowcomote.keptn.slo.ScorePass <em>Score Pass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Score Pass</em>'.
	 * @see eu.lowcomote.keptn.slo.ScorePass
	 * @generated
	 */
	EClass getScorePass();

	/**
	 * Returns the meta object for the attribute '{@link eu.lowcomote.keptn.slo.ScorePass#getPass <em>Pass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pass</em>'.
	 * @see eu.lowcomote.keptn.slo.ScorePass#getPass()
	 * @see #getScorePass()
	 * @generated
	 */
	EAttribute getScorePass_Pass();

	/**
	 * Returns the meta object for class '{@link eu.lowcomote.keptn.slo.ScoreWarning <em>Score Warning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Score Warning</em>'.
	 * @see eu.lowcomote.keptn.slo.ScoreWarning
	 * @generated
	 */
	EClass getScoreWarning();

	/**
	 * Returns the meta object for the attribute '{@link eu.lowcomote.keptn.slo.ScoreWarning#getWarning <em>Warning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Warning</em>'.
	 * @see eu.lowcomote.keptn.slo.ScoreWarning#getWarning()
	 * @see #getScoreWarning()
	 * @generated
	 */
	EAttribute getScoreWarning_Warning();

	/**
	 * Returns the meta object for class '{@link eu.lowcomote.keptn.slo.ServiceLevelObjectivesFilterPatternProperties0 <em>Service Level Objectives Filter Pattern Properties0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Level Objectives Filter Pattern Properties0</em>'.
	 * @see eu.lowcomote.keptn.slo.ServiceLevelObjectivesFilterPatternProperties0
	 * @generated
	 */
	EClass getServiceLevelObjectivesFilterPatternProperties0();

	/**
	 * Returns the meta object for the attribute '{@link eu.lowcomote.keptn.slo.ServiceLevelObjectivesFilterPatternProperties0#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see eu.lowcomote.keptn.slo.ServiceLevelObjectivesFilterPatternProperties0#getKey()
	 * @see #getServiceLevelObjectivesFilterPatternProperties0()
	 * @generated
	 */
	EAttribute getServiceLevelObjectivesFilterPatternProperties0_Key();

	/**
	 * Returns the meta object for the attribute '{@link eu.lowcomote.keptn.slo.ServiceLevelObjectivesFilterPatternProperties0#getPatternProperties0 <em>Pattern Properties0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern Properties0</em>'.
	 * @see eu.lowcomote.keptn.slo.ServiceLevelObjectivesFilterPatternProperties0#getPatternProperties0()
	 * @see #getServiceLevelObjectivesFilterPatternProperties0()
	 * @generated
	 */
	EAttribute getServiceLevelObjectivesFilterPatternProperties0_PatternProperties0();

	/**
	 * Returns the meta object for class '{@link eu.lowcomote.keptn.slo.ServiceLevelObjectivesObjectivesItems <em>Service Level Objectives Objectives Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Level Objectives Objectives Items</em>'.
	 * @see eu.lowcomote.keptn.slo.ServiceLevelObjectivesObjectivesItems
	 * @generated
	 */
	EClass getServiceLevelObjectivesObjectivesItems();

	/**
	 * Returns the meta object for the containment reference '{@link eu.lowcomote.keptn.slo.ServiceLevelObjectivesObjectivesItems#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Items</em>'.
	 * @see eu.lowcomote.keptn.slo.ServiceLevelObjectivesObjectivesItems#getItems()
	 * @see #getServiceLevelObjectivesObjectivesItems()
	 * @generated
	 */
	EReference getServiceLevelObjectivesObjectivesItems_Items();

	/**
	 * Returns the meta object for class '{@link eu.lowcomote.keptn.slo.ObjectivePassItems <em>Objective Pass Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Objective Pass Items</em>'.
	 * @see eu.lowcomote.keptn.slo.ObjectivePassItems
	 * @generated
	 */
	EClass getObjectivePassItems();

	/**
	 * Returns the meta object for the containment reference '{@link eu.lowcomote.keptn.slo.ObjectivePassItems#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Items</em>'.
	 * @see eu.lowcomote.keptn.slo.ObjectivePassItems#getItems()
	 * @see #getObjectivePassItems()
	 * @generated
	 */
	EReference getObjectivePassItems_Items();

	/**
	 * Returns the meta object for class '{@link eu.lowcomote.keptn.slo.ObjectiveWarningItems <em>Objective Warning Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Objective Warning Items</em>'.
	 * @see eu.lowcomote.keptn.slo.ObjectiveWarningItems
	 * @generated
	 */
	EClass getObjectiveWarningItems();

	/**
	 * Returns the meta object for the containment reference '{@link eu.lowcomote.keptn.slo.ObjectiveWarningItems#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Items</em>'.
	 * @see eu.lowcomote.keptn.slo.ObjectiveWarningItems#getItems()
	 * @see #getObjectiveWarningItems()
	 * @generated
	 */
	EReference getObjectiveWarningItems_Items();

	/**
	 * Returns the meta object for class '{@link eu.lowcomote.keptn.slo.SLICriteriaCriteriaItems <em>SLI Criteria Criteria Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SLI Criteria Criteria Items</em>'.
	 * @see eu.lowcomote.keptn.slo.SLICriteriaCriteriaItems
	 * @generated
	 */
	EClass getSLICriteriaCriteriaItems();

	/**
	 * Returns the meta object for the attribute '{@link eu.lowcomote.keptn.slo.SLICriteriaCriteriaItems#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Items</em>'.
	 * @see eu.lowcomote.keptn.slo.SLICriteriaCriteriaItems#getItems()
	 * @see #getSLICriteriaCriteriaItems()
	 * @generated
	 */
	EAttribute getSLICriteriaCriteriaItems_Items();

	/**
	 * Returns the meta object for class '{@link eu.lowcomote.keptn.slo.ServiceLevelObjectivesFilterAdditionalProperties <em>Service Level Objectives Filter Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Level Objectives Filter Additional Properties</em>'.
	 * @see eu.lowcomote.keptn.slo.ServiceLevelObjectivesFilterAdditionalProperties
	 * @generated
	 */
	EClass getServiceLevelObjectivesFilterAdditionalProperties();

	/**
	 * Returns the meta object for the attribute '{@link eu.lowcomote.keptn.slo.ServiceLevelObjectivesFilterAdditionalProperties#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see eu.lowcomote.keptn.slo.ServiceLevelObjectivesFilterAdditionalProperties#getKey()
	 * @see #getServiceLevelObjectivesFilterAdditionalProperties()
	 * @generated
	 */
	EAttribute getServiceLevelObjectivesFilterAdditionalProperties_Key();

	/**
	 * Returns the meta object for the containment reference '{@link eu.lowcomote.keptn.slo.ServiceLevelObjectivesFilterAdditionalProperties#getAdditionalProperties <em>Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Additional Properties</em>'.
	 * @see eu.lowcomote.keptn.slo.ServiceLevelObjectivesFilterAdditionalProperties#getAdditionalProperties()
	 * @see #getServiceLevelObjectivesFilterAdditionalProperties()
	 * @generated
	 */
	EReference getServiceLevelObjectivesFilterAdditionalProperties_AdditionalProperties();

	/**
	 * Returns the meta object for class '{@link eu.lowcomote.keptn.slo.ServiceLevelObjectivesPropertiesAbstract <em>Service Level Objectives Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Level Objectives Properties Abstract</em>'.
	 * @see eu.lowcomote.keptn.slo.ServiceLevelObjectivesPropertiesAbstract
	 * @generated
	 */
	EClass getServiceLevelObjectivesPropertiesAbstract();

	/**
	 * Returns the meta object for class '{@link eu.lowcomote.keptn.slo.ComparisonPropertiesAbstract <em>Comparison Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison Properties Abstract</em>'.
	 * @see eu.lowcomote.keptn.slo.ComparisonPropertiesAbstract
	 * @generated
	 */
	EClass getComparisonPropertiesAbstract();

	/**
	 * Returns the meta object for class '{@link eu.lowcomote.keptn.slo.ObjectivePropertiesAbstract <em>Objective Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Objective Properties Abstract</em>'.
	 * @see eu.lowcomote.keptn.slo.ObjectivePropertiesAbstract
	 * @generated
	 */
	EClass getObjectivePropertiesAbstract();

	/**
	 * Returns the meta object for class '{@link eu.lowcomote.keptn.slo.SLICriteriaPropertiesAbstract <em>SLI Criteria Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SLI Criteria Properties Abstract</em>'.
	 * @see eu.lowcomote.keptn.slo.SLICriteriaPropertiesAbstract
	 * @generated
	 */
	EClass getSLICriteriaPropertiesAbstract();

	/**
	 * Returns the meta object for class '{@link eu.lowcomote.keptn.slo.ScorePropertiesAbstract <em>Score Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Score Properties Abstract</em>'.
	 * @see eu.lowcomote.keptn.slo.ScorePropertiesAbstract
	 * @generated
	 */
	EClass getScorePropertiesAbstract();

	/**
	 * Returns the meta object for class '{@link eu.lowcomote.keptn.slo.ServiceLevelObjectivesFilterPropertiesAbstract <em>Service Level Objectives Filter Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Level Objectives Filter Properties Abstract</em>'.
	 * @see eu.lowcomote.keptn.slo.ServiceLevelObjectivesFilterPropertiesAbstract
	 * @generated
	 */
	EClass getServiceLevelObjectivesFilterPropertiesAbstract();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SloFactory getSloFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link eu.lowcomote.keptn.slo.impl.SloRootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.lowcomote.keptn.slo.impl.SloRootImpl
		 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getSloRoot()
		 * @generated
		 */
		EClass SLO_ROOT = eINSTANCE.getSloRoot();

		/**
		 * The meta object literal for the '<em><b>Slo Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLO_ROOT__SLO_ROOT = eINSTANCE.getSloRoot_SloRoot();

		/**
		 * The meta object literal for the '{@link eu.lowcomote.keptn.slo.impl.ServiceLevelObjectivesImpl <em>Service Level Objectives</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.lowcomote.keptn.slo.impl.ServiceLevelObjectivesImpl
		 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getServiceLevelObjectives()
		 * @generated
		 */
		EClass SERVICE_LEVEL_OBJECTIVES = eINSTANCE.getServiceLevelObjectives();

		/**
		 * The meta object literal for the '<em><b>Service Level Objectives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_LEVEL_OBJECTIVES__SERVICE_LEVEL_OBJECTIVES = eINSTANCE.getServiceLevelObjectives_ServiceLevelObjectives();

		/**
		 * The meta object literal for the '{@link eu.lowcomote.keptn.slo.impl.ComparisonImpl <em>Comparison</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.lowcomote.keptn.slo.impl.ComparisonImpl
		 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getComparison()
		 * @generated
		 */
		EClass COMPARISON = eINSTANCE.getComparison();

		/**
		 * The meta object literal for the '<em><b>Comparison</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARISON__COMPARISON = eINSTANCE.getComparison_Comparison();

		/**
		 * The meta object literal for the '{@link eu.lowcomote.keptn.slo.impl.ObjectiveImpl <em>Objective</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.lowcomote.keptn.slo.impl.ObjectiveImpl
		 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getObjective()
		 * @generated
		 */
		EClass OBJECTIVE = eINSTANCE.getObjective();

		/**
		 * The meta object literal for the '<em><b>Objective</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECTIVE__OBJECTIVE = eINSTANCE.getObjective_Objective();

		/**
		 * The meta object literal for the '{@link eu.lowcomote.keptn.slo.impl.SLICriteriaImpl <em>SLI Criteria</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.lowcomote.keptn.slo.impl.SLICriteriaImpl
		 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getSLICriteria()
		 * @generated
		 */
		EClass SLI_CRITERIA = eINSTANCE.getSLICriteria();

		/**
		 * The meta object literal for the '<em><b>SLI Criteria</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLI_CRITERIA__SLI_CRITERIA = eINSTANCE.getSLICriteria_SLICriteria();

		/**
		 * The meta object literal for the '{@link eu.lowcomote.keptn.slo.impl.ScoreImpl <em>Score</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.lowcomote.keptn.slo.impl.ScoreImpl
		 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getScore()
		 * @generated
		 */
		EClass SCORE = eINSTANCE.getScore();

		/**
		 * The meta object literal for the '<em><b>Score</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCORE__SCORE = eINSTANCE.getScore_Score();

		/**
		 * The meta object literal for the '{@link eu.lowcomote.keptn.slo.impl.ServiceLevelObjectivesComparisonImpl <em>Service Level Objectives Comparison</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.lowcomote.keptn.slo.impl.ServiceLevelObjectivesComparisonImpl
		 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getServiceLevelObjectivesComparison()
		 * @generated
		 */
		EClass SERVICE_LEVEL_OBJECTIVES_COMPARISON = eINSTANCE.getServiceLevelObjectivesComparison();

		/**
		 * The meta object literal for the '<em><b>Comparison</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_LEVEL_OBJECTIVES_COMPARISON__COMPARISON = eINSTANCE.getServiceLevelObjectivesComparison_Comparison();

		/**
		 * The meta object literal for the '{@link eu.lowcomote.keptn.slo.impl.ServiceLevelObjectivesFilterImpl <em>Service Level Objectives Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.lowcomote.keptn.slo.impl.ServiceLevelObjectivesFilterImpl
		 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getServiceLevelObjectivesFilter()
		 * @generated
		 */
		EClass SERVICE_LEVEL_OBJECTIVES_FILTER = eINSTANCE.getServiceLevelObjectivesFilter();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_LEVEL_OBJECTIVES_FILTER__FILTER = eINSTANCE.getServiceLevelObjectivesFilter_Filter();

		/**
		 * The meta object literal for the '{@link eu.lowcomote.keptn.slo.impl.ServiceLevelObjectivesObjectivesImpl <em>Service Level Objectives Objectives</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.lowcomote.keptn.slo.impl.ServiceLevelObjectivesObjectivesImpl
		 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getServiceLevelObjectivesObjectives()
		 * @generated
		 */
		EClass SERVICE_LEVEL_OBJECTIVES_OBJECTIVES = eINSTANCE.getServiceLevelObjectivesObjectives();

		/**
		 * The meta object literal for the '<em><b>Objectives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_LEVEL_OBJECTIVES_OBJECTIVES__OBJECTIVES = eINSTANCE.getServiceLevelObjectivesObjectives_Objectives();

		/**
		 * The meta object literal for the '{@link eu.lowcomote.keptn.slo.impl.ServiceLevelObjectivesSpec_versionImpl <em>Service Level Objectives Spec version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.lowcomote.keptn.slo.impl.ServiceLevelObjectivesSpec_versionImpl
		 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getServiceLevelObjectivesSpec_version()
		 * @generated
		 */
		EClass SERVICE_LEVEL_OBJECTIVES_SPEC_VERSION = eINSTANCE.getServiceLevelObjectivesSpec_version();

		/**
		 * The meta object literal for the '<em><b>Spec version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_LEVEL_OBJECTIVES_SPEC_VERSION__SPEC_VERSION = eINSTANCE.getServiceLevelObjectivesSpec_version_Spec_version();

		/**
		 * The meta object literal for the '{@link eu.lowcomote.keptn.slo.impl.ServiceLevelObjectivesTotal_scoreImpl <em>Service Level Objectives Total score</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.lowcomote.keptn.slo.impl.ServiceLevelObjectivesTotal_scoreImpl
		 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getServiceLevelObjectivesTotal_score()
		 * @generated
		 */
		EClass SERVICE_LEVEL_OBJECTIVES_TOTAL_SCORE = eINSTANCE.getServiceLevelObjectivesTotal_score();

		/**
		 * The meta object literal for the '<em><b>Total score</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_LEVEL_OBJECTIVES_TOTAL_SCORE__TOTAL_SCORE = eINSTANCE.getServiceLevelObjectivesTotal_score_Total_score();

		/**
		 * The meta object literal for the '{@link eu.lowcomote.keptn.slo.impl.ComparisonAggregate_functionImpl <em>Comparison Aggregate function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.lowcomote.keptn.slo.impl.ComparisonAggregate_functionImpl
		 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getComparisonAggregate_function()
		 * @generated
		 */
		EClass COMPARISON_AGGREGATE_FUNCTION = eINSTANCE.getComparisonAggregate_function();

		/**
		 * The meta object literal for the '<em><b>Aggregate function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARISON_AGGREGATE_FUNCTION__AGGREGATE_FUNCTION = eINSTANCE.getComparisonAggregate_function_Aggregate_function();

		/**
		 * The meta object literal for the '{@link eu.lowcomote.keptn.slo.impl.ComparisonCompare_withImpl <em>Comparison Compare with</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.lowcomote.keptn.slo.impl.ComparisonCompare_withImpl
		 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getComparisonCompare_with()
		 * @generated
		 */
		EClass COMPARISON_COMPARE_WITH = eINSTANCE.getComparisonCompare_with();

		/**
		 * The meta object literal for the '<em><b>Compare with</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARISON_COMPARE_WITH__COMPARE_WITH = eINSTANCE.getComparisonCompare_with_Compare_with();

		/**
		 * The meta object literal for the '{@link eu.lowcomote.keptn.slo.impl.ComparisonInclude_result_with_scoreImpl <em>Comparison Include result with score</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.lowcomote.keptn.slo.impl.ComparisonInclude_result_with_scoreImpl
		 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getComparisonInclude_result_with_score()
		 * @generated
		 */
		EClass COMPARISON_INCLUDE_RESULT_WITH_SCORE = eINSTANCE.getComparisonInclude_result_with_score();

		/**
		 * The meta object literal for the '<em><b>Include result with score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARISON_INCLUDE_RESULT_WITH_SCORE__INCLUDE_RESULT_WITH_SCORE = eINSTANCE.getComparisonInclude_result_with_score_Include_result_with_score();

		/**
		 * The meta object literal for the '{@link eu.lowcomote.keptn.slo.impl.ComparisonNumber_of_comparison_resultsImpl <em>Comparison Number of comparison results</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.lowcomote.keptn.slo.impl.ComparisonNumber_of_comparison_resultsImpl
		 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getComparisonNumber_of_comparison_results()
		 * @generated
		 */
		EClass COMPARISON_NUMBER_OF_COMPARISON_RESULTS = eINSTANCE.getComparisonNumber_of_comparison_results();

		/**
		 * The meta object literal for the '<em><b>Number of comparison results</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARISON_NUMBER_OF_COMPARISON_RESULTS__NUMBER_OF_COMPARISON_RESULTS = eINSTANCE.getComparisonNumber_of_comparison_results_Number_of_comparison_results();

		/**
		 * The meta object literal for the '{@link eu.lowcomote.keptn.slo.impl.ObjectiveKey_sliImpl <em>Objective Key sli</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.lowcomote.keptn.slo.impl.ObjectiveKey_sliImpl
		 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getObjectiveKey_sli()
		 * @generated
		 */
		EClass OBJECTIVE_KEY_SLI = eINSTANCE.getObjectiveKey_sli();

		/**
		 * The meta object literal for the '<em><b>Key sli</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECTIVE_KEY_SLI__KEY_SLI = eINSTANCE.getObjectiveKey_sli_Key_sli();

		/**
		 * The meta object literal for the '{@link eu.lowcomote.keptn.slo.impl.ObjectivePassImpl <em>Objective Pass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.lowcomote.keptn.slo.impl.ObjectivePassImpl
		 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getObjectivePass()
		 * @generated
		 */
		EClass OBJECTIVE_PASS = eINSTANCE.getObjectivePass();

		/**
		 * The meta object literal for the '<em><b>Pass</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECTIVE_PASS__PASS = eINSTANCE.getObjectivePass_Pass();

		/**
		 * The meta object literal for the '{@link eu.lowcomote.keptn.slo.impl.ObjectiveSliImpl <em>Objective Sli</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.lowcomote.keptn.slo.impl.ObjectiveSliImpl
		 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getObjectiveSli()
		 * @generated
		 */
		EClass OBJECTIVE_SLI = eINSTANCE.getObjectiveSli();

		/**
		 * The meta object literal for the '<em><b>Sli</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECTIVE_SLI__SLI = eINSTANCE.getObjectiveSli_Sli();

		/**
		 * The meta object literal for the '{@link eu.lowcomote.keptn.slo.impl.ObjectiveDisplayNameImpl <em>Objective Display Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.lowcomote.keptn.slo.impl.ObjectiveDisplayNameImpl
		 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getObjectiveDisplayName()
		 * @generated
		 */
		EClass OBJECTIVE_DISPLAY_NAME = eINSTANCE.getObjectiveDisplayName();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECTIVE_DISPLAY_NAME__DISPLAY_NAME = eINSTANCE.getObjectiveDisplayName_DisplayName();

		/**
		 * The meta object literal for the '{@link eu.lowcomote.keptn.slo.impl.ObjectiveWarningImpl <em>Objective Warning</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.lowcomote.keptn.slo.impl.ObjectiveWarningImpl
		 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getObjectiveWarning()
		 * @generated
		 */
		EClass OBJECTIVE_WARNING = eINSTANCE.getObjectiveWarning();

		/**
		 * The meta object literal for the '<em><b>Warning</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECTIVE_WARNING__WARNING = eINSTANCE.getObjectiveWarning_Warning();

		/**
		 * The meta object literal for the '{@link eu.lowcomote.keptn.slo.impl.ObjectiveWeightImpl <em>Objective Weight</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.lowcomote.keptn.slo.impl.ObjectiveWeightImpl
		 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getObjectiveWeight()
		 * @generated
		 */
		EClass OBJECTIVE_WEIGHT = eINSTANCE.getObjectiveWeight();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECTIVE_WEIGHT__WEIGHT = eINSTANCE.getObjectiveWeight_Weight();

		/**
		 * The meta object literal for the '{@link eu.lowcomote.keptn.slo.impl.SLICriteriaCriteriaImpl <em>SLI Criteria Criteria</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.lowcomote.keptn.slo.impl.SLICriteriaCriteriaImpl
		 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getSLICriteriaCriteria()
		 * @generated
		 */
		EClass SLI_CRITERIA_CRITERIA = eINSTANCE.getSLICriteriaCriteria();

		/**
		 * The meta object literal for the '<em><b>Criteria</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLI_CRITERIA_CRITERIA__CRITERIA = eINSTANCE.getSLICriteriaCriteria_Criteria();

		/**
		 * The meta object literal for the '{@link eu.lowcomote.keptn.slo.impl.ScorePassImpl <em>Score Pass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.lowcomote.keptn.slo.impl.ScorePassImpl
		 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getScorePass()
		 * @generated
		 */
		EClass SCORE_PASS = eINSTANCE.getScorePass();

		/**
		 * The meta object literal for the '<em><b>Pass</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCORE_PASS__PASS = eINSTANCE.getScorePass_Pass();

		/**
		 * The meta object literal for the '{@link eu.lowcomote.keptn.slo.impl.ScoreWarningImpl <em>Score Warning</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.lowcomote.keptn.slo.impl.ScoreWarningImpl
		 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getScoreWarning()
		 * @generated
		 */
		EClass SCORE_WARNING = eINSTANCE.getScoreWarning();

		/**
		 * The meta object literal for the '<em><b>Warning</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCORE_WARNING__WARNING = eINSTANCE.getScoreWarning_Warning();

		/**
		 * The meta object literal for the '{@link eu.lowcomote.keptn.slo.impl.ServiceLevelObjectivesFilterPatternProperties0Impl <em>Service Level Objectives Filter Pattern Properties0</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.lowcomote.keptn.slo.impl.ServiceLevelObjectivesFilterPatternProperties0Impl
		 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getServiceLevelObjectivesFilterPatternProperties0()
		 * @generated
		 */
		EClass SERVICE_LEVEL_OBJECTIVES_FILTER_PATTERN_PROPERTIES0 = eINSTANCE.getServiceLevelObjectivesFilterPatternProperties0();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_LEVEL_OBJECTIVES_FILTER_PATTERN_PROPERTIES0__KEY = eINSTANCE.getServiceLevelObjectivesFilterPatternProperties0_Key();

		/**
		 * The meta object literal for the '<em><b>Pattern Properties0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_LEVEL_OBJECTIVES_FILTER_PATTERN_PROPERTIES0__PATTERN_PROPERTIES0 = eINSTANCE.getServiceLevelObjectivesFilterPatternProperties0_PatternProperties0();

		/**
		 * The meta object literal for the '{@link eu.lowcomote.keptn.slo.impl.ServiceLevelObjectivesObjectivesItemsImpl <em>Service Level Objectives Objectives Items</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.lowcomote.keptn.slo.impl.ServiceLevelObjectivesObjectivesItemsImpl
		 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getServiceLevelObjectivesObjectivesItems()
		 * @generated
		 */
		EClass SERVICE_LEVEL_OBJECTIVES_OBJECTIVES_ITEMS = eINSTANCE.getServiceLevelObjectivesObjectivesItems();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_LEVEL_OBJECTIVES_OBJECTIVES_ITEMS__ITEMS = eINSTANCE.getServiceLevelObjectivesObjectivesItems_Items();

		/**
		 * The meta object literal for the '{@link eu.lowcomote.keptn.slo.impl.ObjectivePassItemsImpl <em>Objective Pass Items</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.lowcomote.keptn.slo.impl.ObjectivePassItemsImpl
		 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getObjectivePassItems()
		 * @generated
		 */
		EClass OBJECTIVE_PASS_ITEMS = eINSTANCE.getObjectivePassItems();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECTIVE_PASS_ITEMS__ITEMS = eINSTANCE.getObjectivePassItems_Items();

		/**
		 * The meta object literal for the '{@link eu.lowcomote.keptn.slo.impl.ObjectiveWarningItemsImpl <em>Objective Warning Items</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.lowcomote.keptn.slo.impl.ObjectiveWarningItemsImpl
		 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getObjectiveWarningItems()
		 * @generated
		 */
		EClass OBJECTIVE_WARNING_ITEMS = eINSTANCE.getObjectiveWarningItems();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECTIVE_WARNING_ITEMS__ITEMS = eINSTANCE.getObjectiveWarningItems_Items();

		/**
		 * The meta object literal for the '{@link eu.lowcomote.keptn.slo.impl.SLICriteriaCriteriaItemsImpl <em>SLI Criteria Criteria Items</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.lowcomote.keptn.slo.impl.SLICriteriaCriteriaItemsImpl
		 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getSLICriteriaCriteriaItems()
		 * @generated
		 */
		EClass SLI_CRITERIA_CRITERIA_ITEMS = eINSTANCE.getSLICriteriaCriteriaItems();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLI_CRITERIA_CRITERIA_ITEMS__ITEMS = eINSTANCE.getSLICriteriaCriteriaItems_Items();

		/**
		 * The meta object literal for the '{@link eu.lowcomote.keptn.slo.impl.ServiceLevelObjectivesFilterAdditionalPropertiesImpl <em>Service Level Objectives Filter Additional Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.lowcomote.keptn.slo.impl.ServiceLevelObjectivesFilterAdditionalPropertiesImpl
		 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getServiceLevelObjectivesFilterAdditionalProperties()
		 * @generated
		 */
		EClass SERVICE_LEVEL_OBJECTIVES_FILTER_ADDITIONAL_PROPERTIES = eINSTANCE.getServiceLevelObjectivesFilterAdditionalProperties();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_LEVEL_OBJECTIVES_FILTER_ADDITIONAL_PROPERTIES__KEY = eINSTANCE.getServiceLevelObjectivesFilterAdditionalProperties_Key();

		/**
		 * The meta object literal for the '<em><b>Additional Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_LEVEL_OBJECTIVES_FILTER_ADDITIONAL_PROPERTIES__ADDITIONAL_PROPERTIES = eINSTANCE.getServiceLevelObjectivesFilterAdditionalProperties_AdditionalProperties();

		/**
		 * The meta object literal for the '{@link eu.lowcomote.keptn.slo.impl.ServiceLevelObjectivesPropertiesAbstractImpl <em>Service Level Objectives Properties Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.lowcomote.keptn.slo.impl.ServiceLevelObjectivesPropertiesAbstractImpl
		 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getServiceLevelObjectivesPropertiesAbstract()
		 * @generated
		 */
		EClass SERVICE_LEVEL_OBJECTIVES_PROPERTIES_ABSTRACT = eINSTANCE.getServiceLevelObjectivesPropertiesAbstract();

		/**
		 * The meta object literal for the '{@link eu.lowcomote.keptn.slo.impl.ComparisonPropertiesAbstractImpl <em>Comparison Properties Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.lowcomote.keptn.slo.impl.ComparisonPropertiesAbstractImpl
		 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getComparisonPropertiesAbstract()
		 * @generated
		 */
		EClass COMPARISON_PROPERTIES_ABSTRACT = eINSTANCE.getComparisonPropertiesAbstract();

		/**
		 * The meta object literal for the '{@link eu.lowcomote.keptn.slo.impl.ObjectivePropertiesAbstractImpl <em>Objective Properties Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.lowcomote.keptn.slo.impl.ObjectivePropertiesAbstractImpl
		 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getObjectivePropertiesAbstract()
		 * @generated
		 */
		EClass OBJECTIVE_PROPERTIES_ABSTRACT = eINSTANCE.getObjectivePropertiesAbstract();

		/**
		 * The meta object literal for the '{@link eu.lowcomote.keptn.slo.impl.SLICriteriaPropertiesAbstractImpl <em>SLI Criteria Properties Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.lowcomote.keptn.slo.impl.SLICriteriaPropertiesAbstractImpl
		 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getSLICriteriaPropertiesAbstract()
		 * @generated
		 */
		EClass SLI_CRITERIA_PROPERTIES_ABSTRACT = eINSTANCE.getSLICriteriaPropertiesAbstract();

		/**
		 * The meta object literal for the '{@link eu.lowcomote.keptn.slo.impl.ScorePropertiesAbstractImpl <em>Score Properties Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.lowcomote.keptn.slo.impl.ScorePropertiesAbstractImpl
		 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getScorePropertiesAbstract()
		 * @generated
		 */
		EClass SCORE_PROPERTIES_ABSTRACT = eINSTANCE.getScorePropertiesAbstract();

		/**
		 * The meta object literal for the '{@link eu.lowcomote.keptn.slo.impl.ServiceLevelObjectivesFilterPropertiesAbstractImpl <em>Service Level Objectives Filter Properties Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.lowcomote.keptn.slo.impl.ServiceLevelObjectivesFilterPropertiesAbstractImpl
		 * @see eu.lowcomote.keptn.slo.impl.SloPackageImpl#getServiceLevelObjectivesFilterPropertiesAbstract()
		 * @generated
		 */
		EClass SERVICE_LEVEL_OBJECTIVES_FILTER_PROPERTIES_ABSTRACT = eINSTANCE.getServiceLevelObjectivesFilterPropertiesAbstract();

	}

} //SloPackage
