/**
 */
package eu.lowcomote.keptn.slo.impl;

import eu.lowcomote.keptn.slo.Comparison;
import eu.lowcomote.keptn.slo.ComparisonAggregate_function;
import eu.lowcomote.keptn.slo.ComparisonCompare_with;
import eu.lowcomote.keptn.slo.ComparisonInclude_result_with_score;
import eu.lowcomote.keptn.slo.ComparisonNumber_of_comparison_results;
import eu.lowcomote.keptn.slo.ComparisonPropertiesAbstract;
import eu.lowcomote.keptn.slo.Objective;
import eu.lowcomote.keptn.slo.ObjectiveDisplayName;
import eu.lowcomote.keptn.slo.ObjectiveKey_sli;
import eu.lowcomote.keptn.slo.ObjectivePass;
import eu.lowcomote.keptn.slo.ObjectivePassItems;
import eu.lowcomote.keptn.slo.ObjectivePropertiesAbstract;
import eu.lowcomote.keptn.slo.ObjectiveSli;
import eu.lowcomote.keptn.slo.ObjectiveWarning;
import eu.lowcomote.keptn.slo.ObjectiveWarningItems;
import eu.lowcomote.keptn.slo.ObjectiveWeight;
import eu.lowcomote.keptn.slo.SLICriteria;
import eu.lowcomote.keptn.slo.SLICriteriaCriteria;
import eu.lowcomote.keptn.slo.SLICriteriaCriteriaItems;
import eu.lowcomote.keptn.slo.SLICriteriaPropertiesAbstract;
import eu.lowcomote.keptn.slo.Score;
import eu.lowcomote.keptn.slo.ScorePass;
import eu.lowcomote.keptn.slo.ScorePropertiesAbstract;
import eu.lowcomote.keptn.slo.ScoreWarning;
import eu.lowcomote.keptn.slo.ServiceLevelObjectives;
import eu.lowcomote.keptn.slo.ServiceLevelObjectivesComparison;
import eu.lowcomote.keptn.slo.ServiceLevelObjectivesFilter;
import eu.lowcomote.keptn.slo.ServiceLevelObjectivesFilterAdditionalProperties;
import eu.lowcomote.keptn.slo.ServiceLevelObjectivesFilterPatternProperties0;
import eu.lowcomote.keptn.slo.ServiceLevelObjectivesFilterPropertiesAbstract;
import eu.lowcomote.keptn.slo.ServiceLevelObjectivesObjectives;
import eu.lowcomote.keptn.slo.ServiceLevelObjectivesObjectivesItems;
import eu.lowcomote.keptn.slo.ServiceLevelObjectivesPropertiesAbstract;
import eu.lowcomote.keptn.slo.ServiceLevelObjectivesSpec_version;
import eu.lowcomote.keptn.slo.ServiceLevelObjectivesTotal_score;
import eu.lowcomote.keptn.slo.SloFactory;
import eu.lowcomote.keptn.slo.SloPackage;
import eu.lowcomote.keptn.slo.SloRoot;

import jsonMetaschemaMM.JsonMetaschemaMMPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SloPackageImpl extends EPackageImpl implements SloPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sloRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceLevelObjectivesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparisonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sliCriteriaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceLevelObjectivesComparisonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceLevelObjectivesFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceLevelObjectivesObjectivesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceLevelObjectivesSpec_versionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceLevelObjectivesTotal_scoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparisonAggregate_functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparisonCompare_withEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparisonInclude_result_with_scoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparisonNumber_of_comparison_resultsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectiveKey_sliEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectivePassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectiveSliEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectiveDisplayNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectiveWarningEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectiveWeightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sliCriteriaCriteriaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scorePassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scoreWarningEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceLevelObjectivesFilterPatternProperties0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceLevelObjectivesObjectivesItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectivePassItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectiveWarningItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sliCriteriaCriteriaItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceLevelObjectivesFilterAdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceLevelObjectivesPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparisonPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectivePropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sliCriteriaPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scorePropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceLevelObjectivesFilterPropertiesAbstractEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see eu.lowcomote.keptn.slo.SloPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SloPackageImpl() {
		super(eNS_URI, SloFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SloPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SloPackage init() {
		if (isInited) return (SloPackage)EPackage.Registry.INSTANCE.getEPackage(SloPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSloPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SloPackageImpl theSloPackage = registeredSloPackage instanceof SloPackageImpl ? (SloPackageImpl)registeredSloPackage : new SloPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		JsonMetaschemaMMPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSloPackage.createPackageContents();

		// Initialize created meta-data
		theSloPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSloPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SloPackage.eNS_URI, theSloPackage);
		return theSloPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSloRoot() {
		return sloRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSloRoot_SloRoot() {
		return (EReference)sloRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceLevelObjectives() {
		return serviceLevelObjectivesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceLevelObjectives_ServiceLevelObjectives() {
		return (EReference)serviceLevelObjectivesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComparison() {
		return comparisonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComparison_Comparison() {
		return (EReference)comparisonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjective() {
		return objectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjective_Objective() {
		return (EReference)objectiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSLICriteria() {
		return sliCriteriaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSLICriteria_SLICriteria() {
		return (EReference)sliCriteriaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScore() {
		return scoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScore_Score() {
		return (EReference)scoreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceLevelObjectivesComparison() {
		return serviceLevelObjectivesComparisonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceLevelObjectivesComparison_Comparison() {
		return (EReference)serviceLevelObjectivesComparisonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceLevelObjectivesFilter() {
		return serviceLevelObjectivesFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceLevelObjectivesFilter_Filter() {
		return (EReference)serviceLevelObjectivesFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceLevelObjectivesObjectives() {
		return serviceLevelObjectivesObjectivesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceLevelObjectivesObjectives_Objectives() {
		return (EReference)serviceLevelObjectivesObjectivesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceLevelObjectivesSpec_version() {
		return serviceLevelObjectivesSpec_versionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceLevelObjectivesSpec_version_Spec_version() {
		return (EAttribute)serviceLevelObjectivesSpec_versionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceLevelObjectivesTotal_score() {
		return serviceLevelObjectivesTotal_scoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceLevelObjectivesTotal_score_Total_score() {
		return (EReference)serviceLevelObjectivesTotal_scoreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComparisonAggregate_function() {
		return comparisonAggregate_functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComparisonAggregate_function_Aggregate_function() {
		return (EAttribute)comparisonAggregate_functionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComparisonCompare_with() {
		return comparisonCompare_withEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComparisonCompare_with_Compare_with() {
		return (EAttribute)comparisonCompare_withEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComparisonInclude_result_with_score() {
		return comparisonInclude_result_with_scoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComparisonInclude_result_with_score_Include_result_with_score() {
		return (EAttribute)comparisonInclude_result_with_scoreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComparisonNumber_of_comparison_results() {
		return comparisonNumber_of_comparison_resultsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComparisonNumber_of_comparison_results_Number_of_comparison_results() {
		return (EAttribute)comparisonNumber_of_comparison_resultsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectiveKey_sli() {
		return objectiveKey_sliEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectiveKey_sli_Key_sli() {
		return (EAttribute)objectiveKey_sliEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectivePass() {
		return objectivePassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectivePass_Pass() {
		return (EReference)objectivePassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectiveSli() {
		return objectiveSliEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectiveSli_Sli() {
		return (EAttribute)objectiveSliEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectiveDisplayName() {
		return objectiveDisplayNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectiveDisplayName_DisplayName() {
		return (EAttribute)objectiveDisplayNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectiveWarning() {
		return objectiveWarningEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectiveWarning_Warning() {
		return (EReference)objectiveWarningEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectiveWeight() {
		return objectiveWeightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectiveWeight_Weight() {
		return (EAttribute)objectiveWeightEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSLICriteriaCriteria() {
		return sliCriteriaCriteriaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSLICriteriaCriteria_Criteria() {
		return (EReference)sliCriteriaCriteriaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScorePass() {
		return scorePassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScorePass_Pass() {
		return (EAttribute)scorePassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScoreWarning() {
		return scoreWarningEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScoreWarning_Warning() {
		return (EAttribute)scoreWarningEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceLevelObjectivesFilterPatternProperties0() {
		return serviceLevelObjectivesFilterPatternProperties0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceLevelObjectivesFilterPatternProperties0_Key() {
		return (EAttribute)serviceLevelObjectivesFilterPatternProperties0EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceLevelObjectivesFilterPatternProperties0_PatternProperties0() {
		return (EAttribute)serviceLevelObjectivesFilterPatternProperties0EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceLevelObjectivesObjectivesItems() {
		return serviceLevelObjectivesObjectivesItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceLevelObjectivesObjectivesItems_Items() {
		return (EReference)serviceLevelObjectivesObjectivesItemsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectivePassItems() {
		return objectivePassItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectivePassItems_Items() {
		return (EReference)objectivePassItemsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectiveWarningItems() {
		return objectiveWarningItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectiveWarningItems_Items() {
		return (EReference)objectiveWarningItemsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSLICriteriaCriteriaItems() {
		return sliCriteriaCriteriaItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSLICriteriaCriteriaItems_Items() {
		return (EAttribute)sliCriteriaCriteriaItemsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceLevelObjectivesFilterAdditionalProperties() {
		return serviceLevelObjectivesFilterAdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceLevelObjectivesFilterAdditionalProperties_Key() {
		return (EAttribute)serviceLevelObjectivesFilterAdditionalPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceLevelObjectivesFilterAdditionalProperties_AdditionalProperties() {
		return (EReference)serviceLevelObjectivesFilterAdditionalPropertiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceLevelObjectivesPropertiesAbstract() {
		return serviceLevelObjectivesPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComparisonPropertiesAbstract() {
		return comparisonPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectivePropertiesAbstract() {
		return objectivePropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSLICriteriaPropertiesAbstract() {
		return sliCriteriaPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScorePropertiesAbstract() {
		return scorePropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceLevelObjectivesFilterPropertiesAbstract() {
		return serviceLevelObjectivesFilterPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SloFactory getSloFactory() {
		return (SloFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		sloRootEClass = createEClass(SLO_ROOT);
		createEReference(sloRootEClass, SLO_ROOT__SLO_ROOT);

		serviceLevelObjectivesEClass = createEClass(SERVICE_LEVEL_OBJECTIVES);
		createEReference(serviceLevelObjectivesEClass, SERVICE_LEVEL_OBJECTIVES__SERVICE_LEVEL_OBJECTIVES);

		comparisonEClass = createEClass(COMPARISON);
		createEReference(comparisonEClass, COMPARISON__COMPARISON);

		objectiveEClass = createEClass(OBJECTIVE);
		createEReference(objectiveEClass, OBJECTIVE__OBJECTIVE);

		sliCriteriaEClass = createEClass(SLI_CRITERIA);
		createEReference(sliCriteriaEClass, SLI_CRITERIA__SLI_CRITERIA);

		scoreEClass = createEClass(SCORE);
		createEReference(scoreEClass, SCORE__SCORE);

		serviceLevelObjectivesComparisonEClass = createEClass(SERVICE_LEVEL_OBJECTIVES_COMPARISON);
		createEReference(serviceLevelObjectivesComparisonEClass, SERVICE_LEVEL_OBJECTIVES_COMPARISON__COMPARISON);

		serviceLevelObjectivesFilterEClass = createEClass(SERVICE_LEVEL_OBJECTIVES_FILTER);
		createEReference(serviceLevelObjectivesFilterEClass, SERVICE_LEVEL_OBJECTIVES_FILTER__FILTER);

		serviceLevelObjectivesObjectivesEClass = createEClass(SERVICE_LEVEL_OBJECTIVES_OBJECTIVES);
		createEReference(serviceLevelObjectivesObjectivesEClass, SERVICE_LEVEL_OBJECTIVES_OBJECTIVES__OBJECTIVES);

		serviceLevelObjectivesSpec_versionEClass = createEClass(SERVICE_LEVEL_OBJECTIVES_SPEC_VERSION);
		createEAttribute(serviceLevelObjectivesSpec_versionEClass, SERVICE_LEVEL_OBJECTIVES_SPEC_VERSION__SPEC_VERSION);

		serviceLevelObjectivesTotal_scoreEClass = createEClass(SERVICE_LEVEL_OBJECTIVES_TOTAL_SCORE);
		createEReference(serviceLevelObjectivesTotal_scoreEClass, SERVICE_LEVEL_OBJECTIVES_TOTAL_SCORE__TOTAL_SCORE);

		comparisonAggregate_functionEClass = createEClass(COMPARISON_AGGREGATE_FUNCTION);
		createEAttribute(comparisonAggregate_functionEClass, COMPARISON_AGGREGATE_FUNCTION__AGGREGATE_FUNCTION);

		comparisonCompare_withEClass = createEClass(COMPARISON_COMPARE_WITH);
		createEAttribute(comparisonCompare_withEClass, COMPARISON_COMPARE_WITH__COMPARE_WITH);

		comparisonInclude_result_with_scoreEClass = createEClass(COMPARISON_INCLUDE_RESULT_WITH_SCORE);
		createEAttribute(comparisonInclude_result_with_scoreEClass, COMPARISON_INCLUDE_RESULT_WITH_SCORE__INCLUDE_RESULT_WITH_SCORE);

		comparisonNumber_of_comparison_resultsEClass = createEClass(COMPARISON_NUMBER_OF_COMPARISON_RESULTS);
		createEAttribute(comparisonNumber_of_comparison_resultsEClass, COMPARISON_NUMBER_OF_COMPARISON_RESULTS__NUMBER_OF_COMPARISON_RESULTS);

		objectiveKey_sliEClass = createEClass(OBJECTIVE_KEY_SLI);
		createEAttribute(objectiveKey_sliEClass, OBJECTIVE_KEY_SLI__KEY_SLI);

		objectivePassEClass = createEClass(OBJECTIVE_PASS);
		createEReference(objectivePassEClass, OBJECTIVE_PASS__PASS);

		objectiveSliEClass = createEClass(OBJECTIVE_SLI);
		createEAttribute(objectiveSliEClass, OBJECTIVE_SLI__SLI);

		objectiveDisplayNameEClass = createEClass(OBJECTIVE_DISPLAY_NAME);
		createEAttribute(objectiveDisplayNameEClass, OBJECTIVE_DISPLAY_NAME__DISPLAY_NAME);

		objectiveWarningEClass = createEClass(OBJECTIVE_WARNING);
		createEReference(objectiveWarningEClass, OBJECTIVE_WARNING__WARNING);

		objectiveWeightEClass = createEClass(OBJECTIVE_WEIGHT);
		createEAttribute(objectiveWeightEClass, OBJECTIVE_WEIGHT__WEIGHT);

		sliCriteriaCriteriaEClass = createEClass(SLI_CRITERIA_CRITERIA);
		createEReference(sliCriteriaCriteriaEClass, SLI_CRITERIA_CRITERIA__CRITERIA);

		scorePassEClass = createEClass(SCORE_PASS);
		createEAttribute(scorePassEClass, SCORE_PASS__PASS);

		scoreWarningEClass = createEClass(SCORE_WARNING);
		createEAttribute(scoreWarningEClass, SCORE_WARNING__WARNING);

		serviceLevelObjectivesFilterPatternProperties0EClass = createEClass(SERVICE_LEVEL_OBJECTIVES_FILTER_PATTERN_PROPERTIES0);
		createEAttribute(serviceLevelObjectivesFilterPatternProperties0EClass, SERVICE_LEVEL_OBJECTIVES_FILTER_PATTERN_PROPERTIES0__KEY);
		createEAttribute(serviceLevelObjectivesFilterPatternProperties0EClass, SERVICE_LEVEL_OBJECTIVES_FILTER_PATTERN_PROPERTIES0__PATTERN_PROPERTIES0);

		serviceLevelObjectivesObjectivesItemsEClass = createEClass(SERVICE_LEVEL_OBJECTIVES_OBJECTIVES_ITEMS);
		createEReference(serviceLevelObjectivesObjectivesItemsEClass, SERVICE_LEVEL_OBJECTIVES_OBJECTIVES_ITEMS__ITEMS);

		objectivePassItemsEClass = createEClass(OBJECTIVE_PASS_ITEMS);
		createEReference(objectivePassItemsEClass, OBJECTIVE_PASS_ITEMS__ITEMS);

		objectiveWarningItemsEClass = createEClass(OBJECTIVE_WARNING_ITEMS);
		createEReference(objectiveWarningItemsEClass, OBJECTIVE_WARNING_ITEMS__ITEMS);

		sliCriteriaCriteriaItemsEClass = createEClass(SLI_CRITERIA_CRITERIA_ITEMS);
		createEAttribute(sliCriteriaCriteriaItemsEClass, SLI_CRITERIA_CRITERIA_ITEMS__ITEMS);

		serviceLevelObjectivesFilterAdditionalPropertiesEClass = createEClass(SERVICE_LEVEL_OBJECTIVES_FILTER_ADDITIONAL_PROPERTIES);
		createEAttribute(serviceLevelObjectivesFilterAdditionalPropertiesEClass, SERVICE_LEVEL_OBJECTIVES_FILTER_ADDITIONAL_PROPERTIES__KEY);
		createEReference(serviceLevelObjectivesFilterAdditionalPropertiesEClass, SERVICE_LEVEL_OBJECTIVES_FILTER_ADDITIONAL_PROPERTIES__ADDITIONAL_PROPERTIES);

		serviceLevelObjectivesPropertiesAbstractEClass = createEClass(SERVICE_LEVEL_OBJECTIVES_PROPERTIES_ABSTRACT);

		comparisonPropertiesAbstractEClass = createEClass(COMPARISON_PROPERTIES_ABSTRACT);

		objectivePropertiesAbstractEClass = createEClass(OBJECTIVE_PROPERTIES_ABSTRACT);

		sliCriteriaPropertiesAbstractEClass = createEClass(SLI_CRITERIA_PROPERTIES_ABSTRACT);

		scorePropertiesAbstractEClass = createEClass(SCORE_PROPERTIES_ABSTRACT);

		serviceLevelObjectivesFilterPropertiesAbstractEClass = createEClass(SERVICE_LEVEL_OBJECTIVES_FILTER_PROPERTIES_ABSTRACT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		JsonMetaschemaMMPackage theJsonMetaschemaMMPackage = (JsonMetaschemaMMPackage)EPackage.Registry.INSTANCE.getEPackage(JsonMetaschemaMMPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		serviceLevelObjectivesComparisonEClass.getESuperTypes().add(this.getServiceLevelObjectivesPropertiesAbstract());
		serviceLevelObjectivesFilterEClass.getESuperTypes().add(this.getServiceLevelObjectivesPropertiesAbstract());
		serviceLevelObjectivesObjectivesEClass.getESuperTypes().add(this.getServiceLevelObjectivesPropertiesAbstract());
		serviceLevelObjectivesSpec_versionEClass.getESuperTypes().add(this.getServiceLevelObjectivesPropertiesAbstract());
		serviceLevelObjectivesTotal_scoreEClass.getESuperTypes().add(this.getServiceLevelObjectivesPropertiesAbstract());
		comparisonAggregate_functionEClass.getESuperTypes().add(this.getComparisonPropertiesAbstract());
		comparisonCompare_withEClass.getESuperTypes().add(this.getComparisonPropertiesAbstract());
		comparisonInclude_result_with_scoreEClass.getESuperTypes().add(this.getComparisonPropertiesAbstract());
		comparisonNumber_of_comparison_resultsEClass.getESuperTypes().add(this.getComparisonPropertiesAbstract());
		objectiveKey_sliEClass.getESuperTypes().add(this.getObjectivePropertiesAbstract());
		objectivePassEClass.getESuperTypes().add(this.getObjectivePropertiesAbstract());
		objectiveSliEClass.getESuperTypes().add(this.getObjectivePropertiesAbstract());
		objectiveDisplayNameEClass.getESuperTypes().add(this.getObjectivePropertiesAbstract());
		objectiveWarningEClass.getESuperTypes().add(this.getObjectivePropertiesAbstract());
		objectiveWeightEClass.getESuperTypes().add(this.getObjectivePropertiesAbstract());
		sliCriteriaCriteriaEClass.getESuperTypes().add(this.getSLICriteriaPropertiesAbstract());
		scorePassEClass.getESuperTypes().add(this.getScorePropertiesAbstract());
		scoreWarningEClass.getESuperTypes().add(this.getScorePropertiesAbstract());
		serviceLevelObjectivesFilterPatternProperties0EClass.getESuperTypes().add(this.getServiceLevelObjectivesFilterPropertiesAbstract());
		serviceLevelObjectivesFilterAdditionalPropertiesEClass.getESuperTypes().add(this.getServiceLevelObjectivesFilterPropertiesAbstract());

		// Initialize classes, features, and operations; add parameters
		initEClass(sloRootEClass, SloRoot.class, "SloRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSloRoot_SloRoot(), this.getServiceLevelObjectives(), null, "sloRoot", null, 1, 1, SloRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceLevelObjectivesEClass, ServiceLevelObjectives.class, "ServiceLevelObjectives", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceLevelObjectives_ServiceLevelObjectives(), this.getServiceLevelObjectivesPropertiesAbstract(), null, "ServiceLevelObjectives", null, 0, -1, ServiceLevelObjectives.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comparisonEClass, Comparison.class, "Comparison", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComparison_Comparison(), this.getComparisonPropertiesAbstract(), null, "Comparison", null, 0, -1, Comparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectiveEClass, Objective.class, "Objective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjective_Objective(), this.getObjectivePropertiesAbstract(), null, "Objective", null, 0, -1, Objective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sliCriteriaEClass, SLICriteria.class, "SLICriteria", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSLICriteria_SLICriteria(), this.getSLICriteriaPropertiesAbstract(), null, "SLICriteria", null, 0, -1, SLICriteria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scoreEClass, Score.class, "Score", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScore_Score(), this.getScorePropertiesAbstract(), null, "Score", null, 0, -1, Score.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceLevelObjectivesComparisonEClass, ServiceLevelObjectivesComparison.class, "ServiceLevelObjectivesComparison", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceLevelObjectivesComparison_Comparison(), this.getComparison(), null, "comparison", null, 1, 1, ServiceLevelObjectivesComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceLevelObjectivesFilterEClass, ServiceLevelObjectivesFilter.class, "ServiceLevelObjectivesFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceLevelObjectivesFilter_Filter(), this.getServiceLevelObjectivesFilterPropertiesAbstract(), null, "filter", null, 0, -1, ServiceLevelObjectivesFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceLevelObjectivesObjectivesEClass, ServiceLevelObjectivesObjectives.class, "ServiceLevelObjectivesObjectives", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceLevelObjectivesObjectives_Objectives(), this.getServiceLevelObjectivesObjectivesItems(), null, "objectives", null, 0, -1, ServiceLevelObjectivesObjectives.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceLevelObjectivesSpec_versionEClass, ServiceLevelObjectivesSpec_version.class, "ServiceLevelObjectivesSpec_version", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceLevelObjectivesSpec_version_Spec_version(), ecorePackage.getEString(), "spec_version", null, 1, 1, ServiceLevelObjectivesSpec_version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceLevelObjectivesTotal_scoreEClass, ServiceLevelObjectivesTotal_score.class, "ServiceLevelObjectivesTotal_score", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceLevelObjectivesTotal_score_Total_score(), this.getScore(), null, "total_score", null, 1, 1, ServiceLevelObjectivesTotal_score.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comparisonAggregate_functionEClass, ComparisonAggregate_function.class, "ComparisonAggregate_function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComparisonAggregate_function_Aggregate_function(), ecorePackage.getEString(), "aggregate_function", null, 1, 1, ComparisonAggregate_function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comparisonCompare_withEClass, ComparisonCompare_with.class, "ComparisonCompare_with", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComparisonCompare_with_Compare_with(), ecorePackage.getEString(), "compare_with", null, 1, 1, ComparisonCompare_with.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comparisonInclude_result_with_scoreEClass, ComparisonInclude_result_with_score.class, "ComparisonInclude_result_with_score", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComparisonInclude_result_with_score_Include_result_with_score(), ecorePackage.getEString(), "include_result_with_score", null, 1, 1, ComparisonInclude_result_with_score.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comparisonNumber_of_comparison_resultsEClass, ComparisonNumber_of_comparison_results.class, "ComparisonNumber_of_comparison_results", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComparisonNumber_of_comparison_results_Number_of_comparison_results(), ecorePackage.getEInt(), "number_of_comparison_results", null, 1, 1, ComparisonNumber_of_comparison_results.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectiveKey_sliEClass, ObjectiveKey_sli.class, "ObjectiveKey_sli", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectiveKey_sli_Key_sli(), ecorePackage.getEBoolean(), "key_sli", null, 1, 1, ObjectiveKey_sli.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectivePassEClass, ObjectivePass.class, "ObjectivePass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectivePass_Pass(), this.getObjectivePassItems(), null, "pass", null, 0, -1, ObjectivePass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectiveSliEClass, ObjectiveSli.class, "ObjectiveSli", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectiveSli_Sli(), ecorePackage.getEString(), "sli", null, 1, 1, ObjectiveSli.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectiveDisplayNameEClass, ObjectiveDisplayName.class, "ObjectiveDisplayName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectiveDisplayName_DisplayName(), ecorePackage.getEString(), "displayName", null, 1, 1, ObjectiveDisplayName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectiveWarningEClass, ObjectiveWarning.class, "ObjectiveWarning", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectiveWarning_Warning(), this.getObjectiveWarningItems(), null, "warning", null, 0, -1, ObjectiveWarning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectiveWeightEClass, ObjectiveWeight.class, "ObjectiveWeight", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectiveWeight_Weight(), ecorePackage.getEInt(), "weight", null, 1, 1, ObjectiveWeight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sliCriteriaCriteriaEClass, SLICriteriaCriteria.class, "SLICriteriaCriteria", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSLICriteriaCriteria_Criteria(), this.getSLICriteriaCriteriaItems(), null, "criteria", null, 0, -1, SLICriteriaCriteria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scorePassEClass, ScorePass.class, "ScorePass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScorePass_Pass(), ecorePackage.getEString(), "pass", null, 1, 1, ScorePass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scoreWarningEClass, ScoreWarning.class, "ScoreWarning", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScoreWarning_Warning(), ecorePackage.getEString(), "warning", null, 1, 1, ScoreWarning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceLevelObjectivesFilterPatternProperties0EClass, ServiceLevelObjectivesFilterPatternProperties0.class, "ServiceLevelObjectivesFilterPatternProperties0", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceLevelObjectivesFilterPatternProperties0_Key(), ecorePackage.getEString(), "key", null, 1, 1, ServiceLevelObjectivesFilterPatternProperties0.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceLevelObjectivesFilterPatternProperties0_PatternProperties0(), ecorePackage.getEString(), "patternProperties0", null, 1, 1, ServiceLevelObjectivesFilterPatternProperties0.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceLevelObjectivesObjectivesItemsEClass, ServiceLevelObjectivesObjectivesItems.class, "ServiceLevelObjectivesObjectivesItems", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceLevelObjectivesObjectivesItems_Items(), this.getObjective(), null, "items", null, 1, 1, ServiceLevelObjectivesObjectivesItems.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectivePassItemsEClass, ObjectivePassItems.class, "ObjectivePassItems", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectivePassItems_Items(), this.getSLICriteria(), null, "items", null, 1, 1, ObjectivePassItems.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectiveWarningItemsEClass, ObjectiveWarningItems.class, "ObjectiveWarningItems", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectiveWarningItems_Items(), this.getSLICriteria(), null, "items", null, 1, 1, ObjectiveWarningItems.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sliCriteriaCriteriaItemsEClass, SLICriteriaCriteriaItems.class, "SLICriteriaCriteriaItems", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSLICriteriaCriteriaItems_Items(), ecorePackage.getEString(), "items", null, 1, 1, SLICriteriaCriteriaItems.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceLevelObjectivesFilterAdditionalPropertiesEClass, ServiceLevelObjectivesFilterAdditionalProperties.class, "ServiceLevelObjectivesFilterAdditionalProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceLevelObjectivesFilterAdditionalProperties_Key(), ecorePackage.getEString(), "key", null, 1, 1, ServiceLevelObjectivesFilterAdditionalProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceLevelObjectivesFilterAdditionalProperties_AdditionalProperties(), theJsonMetaschemaMMPackage.getJsonDocument(), null, "additionalProperties", null, 1, 1, ServiceLevelObjectivesFilterAdditionalProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceLevelObjectivesPropertiesAbstractEClass, ServiceLevelObjectivesPropertiesAbstract.class, "ServiceLevelObjectivesPropertiesAbstract", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(comparisonPropertiesAbstractEClass, ComparisonPropertiesAbstract.class, "ComparisonPropertiesAbstract", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectivePropertiesAbstractEClass, ObjectivePropertiesAbstract.class, "ObjectivePropertiesAbstract", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sliCriteriaPropertiesAbstractEClass, SLICriteriaPropertiesAbstract.class, "SLICriteriaPropertiesAbstract", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(scorePropertiesAbstractEClass, ScorePropertiesAbstract.class, "ScorePropertiesAbstract", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceLevelObjectivesFilterPropertiesAbstractEClass, ServiceLevelObjectivesFilterPropertiesAbstract.class, "ServiceLevelObjectivesFilterPropertiesAbstract", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //SloPackageImpl
