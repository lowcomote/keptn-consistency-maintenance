/**
 */
package eu.lowcomote.keptn.slo.impl;

import eu.lowcomote.keptn.slo.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SloFactoryImpl extends EFactoryImpl implements SloFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SloFactory init() {
		try {
			SloFactory theSloFactory = (SloFactory)EPackage.Registry.INSTANCE.getEFactory(SloPackage.eNS_URI);
			if (theSloFactory != null) {
				return theSloFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SloFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SloFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SloPackage.SLO_ROOT: return createSloRoot();
			case SloPackage.SERVICE_LEVEL_OBJECTIVES: return createServiceLevelObjectives();
			case SloPackage.COMPARISON: return createComparison();
			case SloPackage.OBJECTIVE: return createObjective();
			case SloPackage.SLI_CRITERIA: return createSLICriteria();
			case SloPackage.SCORE: return createScore();
			case SloPackage.SERVICE_LEVEL_OBJECTIVES_COMPARISON: return createServiceLevelObjectivesComparison();
			case SloPackage.SERVICE_LEVEL_OBJECTIVES_FILTER: return createServiceLevelObjectivesFilter();
			case SloPackage.SERVICE_LEVEL_OBJECTIVES_OBJECTIVES: return createServiceLevelObjectivesObjectives();
			case SloPackage.SERVICE_LEVEL_OBJECTIVES_SPEC_VERSION: return createServiceLevelObjectivesSpec_version();
			case SloPackage.SERVICE_LEVEL_OBJECTIVES_TOTAL_SCORE: return createServiceLevelObjectivesTotal_score();
			case SloPackage.COMPARISON_AGGREGATE_FUNCTION: return createComparisonAggregate_function();
			case SloPackage.COMPARISON_COMPARE_WITH: return createComparisonCompare_with();
			case SloPackage.COMPARISON_INCLUDE_RESULT_WITH_SCORE: return createComparisonInclude_result_with_score();
			case SloPackage.COMPARISON_NUMBER_OF_COMPARISON_RESULTS: return createComparisonNumber_of_comparison_results();
			case SloPackage.OBJECTIVE_KEY_SLI: return createObjectiveKey_sli();
			case SloPackage.OBJECTIVE_PASS: return createObjectivePass();
			case SloPackage.OBJECTIVE_SLI: return createObjectiveSli();
			case SloPackage.OBJECTIVE_DISPLAY_NAME: return createObjectiveDisplayName();
			case SloPackage.OBJECTIVE_WARNING: return createObjectiveWarning();
			case SloPackage.OBJECTIVE_WEIGHT: return createObjectiveWeight();
			case SloPackage.SLI_CRITERIA_CRITERIA: return createSLICriteriaCriteria();
			case SloPackage.SCORE_PASS: return createScorePass();
			case SloPackage.SCORE_WARNING: return createScoreWarning();
			case SloPackage.SERVICE_LEVEL_OBJECTIVES_FILTER_PATTERN_PROPERTIES0: return createServiceLevelObjectivesFilterPatternProperties0();
			case SloPackage.SERVICE_LEVEL_OBJECTIVES_OBJECTIVES_ITEMS: return createServiceLevelObjectivesObjectivesItems();
			case SloPackage.OBJECTIVE_PASS_ITEMS: return createObjectivePassItems();
			case SloPackage.OBJECTIVE_WARNING_ITEMS: return createObjectiveWarningItems();
			case SloPackage.SLI_CRITERIA_CRITERIA_ITEMS: return createSLICriteriaCriteriaItems();
			case SloPackage.SERVICE_LEVEL_OBJECTIVES_FILTER_ADDITIONAL_PROPERTIES: return createServiceLevelObjectivesFilterAdditionalProperties();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SloRoot createSloRoot() {
		SloRootImpl sloRoot = new SloRootImpl();
		return sloRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceLevelObjectives createServiceLevelObjectives() {
		ServiceLevelObjectivesImpl serviceLevelObjectives = new ServiceLevelObjectivesImpl();
		return serviceLevelObjectives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comparison createComparison() {
		ComparisonImpl comparison = new ComparisonImpl();
		return comparison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Objective createObjective() {
		ObjectiveImpl objective = new ObjectiveImpl();
		return objective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SLICriteria createSLICriteria() {
		SLICriteriaImpl sliCriteria = new SLICriteriaImpl();
		return sliCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Score createScore() {
		ScoreImpl score = new ScoreImpl();
		return score;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceLevelObjectivesComparison createServiceLevelObjectivesComparison() {
		ServiceLevelObjectivesComparisonImpl serviceLevelObjectivesComparison = new ServiceLevelObjectivesComparisonImpl();
		return serviceLevelObjectivesComparison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceLevelObjectivesFilter createServiceLevelObjectivesFilter() {
		ServiceLevelObjectivesFilterImpl serviceLevelObjectivesFilter = new ServiceLevelObjectivesFilterImpl();
		return serviceLevelObjectivesFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceLevelObjectivesObjectives createServiceLevelObjectivesObjectives() {
		ServiceLevelObjectivesObjectivesImpl serviceLevelObjectivesObjectives = new ServiceLevelObjectivesObjectivesImpl();
		return serviceLevelObjectivesObjectives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceLevelObjectivesSpec_version createServiceLevelObjectivesSpec_version() {
		ServiceLevelObjectivesSpec_versionImpl serviceLevelObjectivesSpec_version = new ServiceLevelObjectivesSpec_versionImpl();
		return serviceLevelObjectivesSpec_version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceLevelObjectivesTotal_score createServiceLevelObjectivesTotal_score() {
		ServiceLevelObjectivesTotal_scoreImpl serviceLevelObjectivesTotal_score = new ServiceLevelObjectivesTotal_scoreImpl();
		return serviceLevelObjectivesTotal_score;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonAggregate_function createComparisonAggregate_function() {
		ComparisonAggregate_functionImpl comparisonAggregate_function = new ComparisonAggregate_functionImpl();
		return comparisonAggregate_function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonCompare_with createComparisonCompare_with() {
		ComparisonCompare_withImpl comparisonCompare_with = new ComparisonCompare_withImpl();
		return comparisonCompare_with;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonInclude_result_with_score createComparisonInclude_result_with_score() {
		ComparisonInclude_result_with_scoreImpl comparisonInclude_result_with_score = new ComparisonInclude_result_with_scoreImpl();
		return comparisonInclude_result_with_score;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonNumber_of_comparison_results createComparisonNumber_of_comparison_results() {
		ComparisonNumber_of_comparison_resultsImpl comparisonNumber_of_comparison_results = new ComparisonNumber_of_comparison_resultsImpl();
		return comparisonNumber_of_comparison_results;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectiveKey_sli createObjectiveKey_sli() {
		ObjectiveKey_sliImpl objectiveKey_sli = new ObjectiveKey_sliImpl();
		return objectiveKey_sli;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectivePass createObjectivePass() {
		ObjectivePassImpl objectivePass = new ObjectivePassImpl();
		return objectivePass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectiveSli createObjectiveSli() {
		ObjectiveSliImpl objectiveSli = new ObjectiveSliImpl();
		return objectiveSli;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectiveDisplayName createObjectiveDisplayName() {
		ObjectiveDisplayNameImpl objectiveDisplayName = new ObjectiveDisplayNameImpl();
		return objectiveDisplayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectiveWarning createObjectiveWarning() {
		ObjectiveWarningImpl objectiveWarning = new ObjectiveWarningImpl();
		return objectiveWarning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectiveWeight createObjectiveWeight() {
		ObjectiveWeightImpl objectiveWeight = new ObjectiveWeightImpl();
		return objectiveWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SLICriteriaCriteria createSLICriteriaCriteria() {
		SLICriteriaCriteriaImpl sliCriteriaCriteria = new SLICriteriaCriteriaImpl();
		return sliCriteriaCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScorePass createScorePass() {
		ScorePassImpl scorePass = new ScorePassImpl();
		return scorePass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScoreWarning createScoreWarning() {
		ScoreWarningImpl scoreWarning = new ScoreWarningImpl();
		return scoreWarning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceLevelObjectivesFilterPatternProperties0 createServiceLevelObjectivesFilterPatternProperties0() {
		ServiceLevelObjectivesFilterPatternProperties0Impl serviceLevelObjectivesFilterPatternProperties0 = new ServiceLevelObjectivesFilterPatternProperties0Impl();
		return serviceLevelObjectivesFilterPatternProperties0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceLevelObjectivesObjectivesItems createServiceLevelObjectivesObjectivesItems() {
		ServiceLevelObjectivesObjectivesItemsImpl serviceLevelObjectivesObjectivesItems = new ServiceLevelObjectivesObjectivesItemsImpl();
		return serviceLevelObjectivesObjectivesItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectivePassItems createObjectivePassItems() {
		ObjectivePassItemsImpl objectivePassItems = new ObjectivePassItemsImpl();
		return objectivePassItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectiveWarningItems createObjectiveWarningItems() {
		ObjectiveWarningItemsImpl objectiveWarningItems = new ObjectiveWarningItemsImpl();
		return objectiveWarningItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SLICriteriaCriteriaItems createSLICriteriaCriteriaItems() {
		SLICriteriaCriteriaItemsImpl sliCriteriaCriteriaItems = new SLICriteriaCriteriaItemsImpl();
		return sliCriteriaCriteriaItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceLevelObjectivesFilterAdditionalProperties createServiceLevelObjectivesFilterAdditionalProperties() {
		ServiceLevelObjectivesFilterAdditionalPropertiesImpl serviceLevelObjectivesFilterAdditionalProperties = new ServiceLevelObjectivesFilterAdditionalPropertiesImpl();
		return serviceLevelObjectivesFilterAdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SloPackage getSloPackage() {
		return (SloPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SloPackage getPackage() {
		return SloPackage.eINSTANCE;
	}

} //SloFactoryImpl
