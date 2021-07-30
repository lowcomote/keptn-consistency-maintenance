/**
 */
package eu.lowcomote.keptn.sli;

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
 * @see eu.lowcomote.keptn.sli.SliFactory
 * @model kind="package"
 * @generated
 */
public interface SliPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sli";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://jku.bise.at/sli";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sli";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SliPackage eINSTANCE = eu.lowcomote.keptn.sli.impl.SliPackageImpl.init();

	/**
	 * The meta object id for the '{@link eu.lowcomote.keptn.sli.impl.SliRootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.lowcomote.keptn.sli.impl.SliRootImpl
	 * @see eu.lowcomote.keptn.sli.impl.SliPackageImpl#getSliRoot()
	 * @generated
	 */
	int SLI_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Sli Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLI_ROOT__SLI_ROOT = 0;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLI_ROOT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLI_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.lowcomote.keptn.sli.impl.ServiceLevelIndicatorsImpl <em>Service Level Indicators</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.lowcomote.keptn.sli.impl.ServiceLevelIndicatorsImpl
	 * @see eu.lowcomote.keptn.sli.impl.SliPackageImpl#getServiceLevelIndicators()
	 * @generated
	 */
	int SERVICE_LEVEL_INDICATORS = 1;

	/**
	 * The feature id for the '<em><b>Service Level Indicators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_INDICATORS__SERVICE_LEVEL_INDICATORS = 0;

	/**
	 * The number of structural features of the '<em>Service Level Indicators</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_INDICATORS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Service Level Indicators</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_INDICATORS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.lowcomote.keptn.sli.impl.ServiceLevelIndicatorsPropertiesAbstractImpl <em>Service Level Indicators Properties Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.lowcomote.keptn.sli.impl.ServiceLevelIndicatorsPropertiesAbstractImpl
	 * @see eu.lowcomote.keptn.sli.impl.SliPackageImpl#getServiceLevelIndicatorsPropertiesAbstract()
	 * @generated
	 */
	int SERVICE_LEVEL_INDICATORS_PROPERTIES_ABSTRACT = 5;

	/**
	 * The number of structural features of the '<em>Service Level Indicators Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_INDICATORS_PROPERTIES_ABSTRACT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Service Level Indicators Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_INDICATORS_PROPERTIES_ABSTRACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.lowcomote.keptn.sli.impl.ServiceLevelIndicatorsIndicatorsImpl <em>Service Level Indicators Indicators</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.lowcomote.keptn.sli.impl.ServiceLevelIndicatorsIndicatorsImpl
	 * @see eu.lowcomote.keptn.sli.impl.SliPackageImpl#getServiceLevelIndicatorsIndicators()
	 * @generated
	 */
	int SERVICE_LEVEL_INDICATORS_INDICATORS = 2;

	/**
	 * The feature id for the '<em><b>Indicators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_INDICATORS_INDICATORS__INDICATORS = SERVICE_LEVEL_INDICATORS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service Level Indicators Indicators</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_INDICATORS_INDICATORS_FEATURE_COUNT = SERVICE_LEVEL_INDICATORS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Service Level Indicators Indicators</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_INDICATORS_INDICATORS_OPERATION_COUNT = SERVICE_LEVEL_INDICATORS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.lowcomote.keptn.sli.impl.ServiceLevelIndicatorsSpec_versionImpl <em>Service Level Indicators Spec version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.lowcomote.keptn.sli.impl.ServiceLevelIndicatorsSpec_versionImpl
	 * @see eu.lowcomote.keptn.sli.impl.SliPackageImpl#getServiceLevelIndicatorsSpec_version()
	 * @generated
	 */
	int SERVICE_LEVEL_INDICATORS_SPEC_VERSION = 3;

	/**
	 * The feature id for the '<em><b>Spec version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_INDICATORS_SPEC_VERSION__SPEC_VERSION = SERVICE_LEVEL_INDICATORS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service Level Indicators Spec version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_INDICATORS_SPEC_VERSION_FEATURE_COUNT = SERVICE_LEVEL_INDICATORS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Service Level Indicators Spec version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_INDICATORS_SPEC_VERSION_OPERATION_COUNT = SERVICE_LEVEL_INDICATORS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.lowcomote.keptn.sli.impl.ServiceLevelIndicatorsIndicatorsPropertiesAbstractImpl <em>Service Level Indicators Indicators Properties Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.lowcomote.keptn.sli.impl.ServiceLevelIndicatorsIndicatorsPropertiesAbstractImpl
	 * @see eu.lowcomote.keptn.sli.impl.SliPackageImpl#getServiceLevelIndicatorsIndicatorsPropertiesAbstract()
	 * @generated
	 */
	int SERVICE_LEVEL_INDICATORS_INDICATORS_PROPERTIES_ABSTRACT = 6;

	/**
	 * The number of structural features of the '<em>Service Level Indicators Indicators Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_INDICATORS_INDICATORS_PROPERTIES_ABSTRACT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Service Level Indicators Indicators Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_INDICATORS_INDICATORS_PROPERTIES_ABSTRACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.lowcomote.keptn.sli.impl.ServiceLevelIndicatorsIndicatorsPatternProperties0Impl <em>Service Level Indicators Indicators Pattern Properties0</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.lowcomote.keptn.sli.impl.ServiceLevelIndicatorsIndicatorsPatternProperties0Impl
	 * @see eu.lowcomote.keptn.sli.impl.SliPackageImpl#getServiceLevelIndicatorsIndicatorsPatternProperties0()
	 * @generated
	 */
	int SERVICE_LEVEL_INDICATORS_INDICATORS_PATTERN_PROPERTIES0 = 4;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_INDICATORS_INDICATORS_PATTERN_PROPERTIES0__KEY = SERVICE_LEVEL_INDICATORS_INDICATORS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pattern Properties0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_INDICATORS_INDICATORS_PATTERN_PROPERTIES0__PATTERN_PROPERTIES0 = SERVICE_LEVEL_INDICATORS_INDICATORS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service Level Indicators Indicators Pattern Properties0</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_INDICATORS_INDICATORS_PATTERN_PROPERTIES0_FEATURE_COUNT = SERVICE_LEVEL_INDICATORS_INDICATORS_PROPERTIES_ABSTRACT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Service Level Indicators Indicators Pattern Properties0</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_INDICATORS_INDICATORS_PATTERN_PROPERTIES0_OPERATION_COUNT = SERVICE_LEVEL_INDICATORS_INDICATORS_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link eu.lowcomote.keptn.sli.SliRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see eu.lowcomote.keptn.sli.SliRoot
	 * @generated
	 */
	EClass getSliRoot();

	/**
	 * Returns the meta object for the containment reference '{@link eu.lowcomote.keptn.sli.SliRoot#getSliRoot <em>Sli Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sli Root</em>'.
	 * @see eu.lowcomote.keptn.sli.SliRoot#getSliRoot()
	 * @see #getSliRoot()
	 * @generated
	 */
	EReference getSliRoot_SliRoot();

	/**
	 * Returns the meta object for class '{@link eu.lowcomote.keptn.sli.ServiceLevelIndicators <em>Service Level Indicators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Level Indicators</em>'.
	 * @see eu.lowcomote.keptn.sli.ServiceLevelIndicators
	 * @generated
	 */
	EClass getServiceLevelIndicators();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.lowcomote.keptn.sli.ServiceLevelIndicators#getServiceLevelIndicators <em>Service Level Indicators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Level Indicators</em>'.
	 * @see eu.lowcomote.keptn.sli.ServiceLevelIndicators#getServiceLevelIndicators()
	 * @see #getServiceLevelIndicators()
	 * @generated
	 */
	EReference getServiceLevelIndicators_ServiceLevelIndicators();

	/**
	 * Returns the meta object for class '{@link eu.lowcomote.keptn.sli.ServiceLevelIndicatorsIndicators <em>Service Level Indicators Indicators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Level Indicators Indicators</em>'.
	 * @see eu.lowcomote.keptn.sli.ServiceLevelIndicatorsIndicators
	 * @generated
	 */
	EClass getServiceLevelIndicatorsIndicators();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.lowcomote.keptn.sli.ServiceLevelIndicatorsIndicators#getIndicators <em>Indicators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Indicators</em>'.
	 * @see eu.lowcomote.keptn.sli.ServiceLevelIndicatorsIndicators#getIndicators()
	 * @see #getServiceLevelIndicatorsIndicators()
	 * @generated
	 */
	EReference getServiceLevelIndicatorsIndicators_Indicators();

	/**
	 * Returns the meta object for class '{@link eu.lowcomote.keptn.sli.ServiceLevelIndicatorsSpec_version <em>Service Level Indicators Spec version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Level Indicators Spec version</em>'.
	 * @see eu.lowcomote.keptn.sli.ServiceLevelIndicatorsSpec_version
	 * @generated
	 */
	EClass getServiceLevelIndicatorsSpec_version();

	/**
	 * Returns the meta object for the attribute '{@link eu.lowcomote.keptn.sli.ServiceLevelIndicatorsSpec_version#getSpec_version <em>Spec version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spec version</em>'.
	 * @see eu.lowcomote.keptn.sli.ServiceLevelIndicatorsSpec_version#getSpec_version()
	 * @see #getServiceLevelIndicatorsSpec_version()
	 * @generated
	 */
	EAttribute getServiceLevelIndicatorsSpec_version_Spec_version();

	/**
	 * Returns the meta object for class '{@link eu.lowcomote.keptn.sli.ServiceLevelIndicatorsIndicatorsPatternProperties0 <em>Service Level Indicators Indicators Pattern Properties0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Level Indicators Indicators Pattern Properties0</em>'.
	 * @see eu.lowcomote.keptn.sli.ServiceLevelIndicatorsIndicatorsPatternProperties0
	 * @generated
	 */
	EClass getServiceLevelIndicatorsIndicatorsPatternProperties0();

	/**
	 * Returns the meta object for the attribute '{@link eu.lowcomote.keptn.sli.ServiceLevelIndicatorsIndicatorsPatternProperties0#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see eu.lowcomote.keptn.sli.ServiceLevelIndicatorsIndicatorsPatternProperties0#getKey()
	 * @see #getServiceLevelIndicatorsIndicatorsPatternProperties0()
	 * @generated
	 */
	EAttribute getServiceLevelIndicatorsIndicatorsPatternProperties0_Key();

	/**
	 * Returns the meta object for the attribute '{@link eu.lowcomote.keptn.sli.ServiceLevelIndicatorsIndicatorsPatternProperties0#getPatternProperties0 <em>Pattern Properties0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern Properties0</em>'.
	 * @see eu.lowcomote.keptn.sli.ServiceLevelIndicatorsIndicatorsPatternProperties0#getPatternProperties0()
	 * @see #getServiceLevelIndicatorsIndicatorsPatternProperties0()
	 * @generated
	 */
	EAttribute getServiceLevelIndicatorsIndicatorsPatternProperties0_PatternProperties0();

	/**
	 * Returns the meta object for class '{@link eu.lowcomote.keptn.sli.ServiceLevelIndicatorsPropertiesAbstract <em>Service Level Indicators Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Level Indicators Properties Abstract</em>'.
	 * @see eu.lowcomote.keptn.sli.ServiceLevelIndicatorsPropertiesAbstract
	 * @generated
	 */
	EClass getServiceLevelIndicatorsPropertiesAbstract();

	/**
	 * Returns the meta object for class '{@link eu.lowcomote.keptn.sli.ServiceLevelIndicatorsIndicatorsPropertiesAbstract <em>Service Level Indicators Indicators Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Level Indicators Indicators Properties Abstract</em>'.
	 * @see eu.lowcomote.keptn.sli.ServiceLevelIndicatorsIndicatorsPropertiesAbstract
	 * @generated
	 */
	EClass getServiceLevelIndicatorsIndicatorsPropertiesAbstract();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SliFactory getSliFactory();

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
		 * The meta object literal for the '{@link eu.lowcomote.keptn.sli.impl.SliRootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.lowcomote.keptn.sli.impl.SliRootImpl
		 * @see eu.lowcomote.keptn.sli.impl.SliPackageImpl#getSliRoot()
		 * @generated
		 */
		EClass SLI_ROOT = eINSTANCE.getSliRoot();

		/**
		 * The meta object literal for the '<em><b>Sli Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLI_ROOT__SLI_ROOT = eINSTANCE.getSliRoot_SliRoot();

		/**
		 * The meta object literal for the '{@link eu.lowcomote.keptn.sli.impl.ServiceLevelIndicatorsImpl <em>Service Level Indicators</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.lowcomote.keptn.sli.impl.ServiceLevelIndicatorsImpl
		 * @see eu.lowcomote.keptn.sli.impl.SliPackageImpl#getServiceLevelIndicators()
		 * @generated
		 */
		EClass SERVICE_LEVEL_INDICATORS = eINSTANCE.getServiceLevelIndicators();

		/**
		 * The meta object literal for the '<em><b>Service Level Indicators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_LEVEL_INDICATORS__SERVICE_LEVEL_INDICATORS = eINSTANCE.getServiceLevelIndicators_ServiceLevelIndicators();

		/**
		 * The meta object literal for the '{@link eu.lowcomote.keptn.sli.impl.ServiceLevelIndicatorsIndicatorsImpl <em>Service Level Indicators Indicators</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.lowcomote.keptn.sli.impl.ServiceLevelIndicatorsIndicatorsImpl
		 * @see eu.lowcomote.keptn.sli.impl.SliPackageImpl#getServiceLevelIndicatorsIndicators()
		 * @generated
		 */
		EClass SERVICE_LEVEL_INDICATORS_INDICATORS = eINSTANCE.getServiceLevelIndicatorsIndicators();

		/**
		 * The meta object literal for the '<em><b>Indicators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_LEVEL_INDICATORS_INDICATORS__INDICATORS = eINSTANCE.getServiceLevelIndicatorsIndicators_Indicators();

		/**
		 * The meta object literal for the '{@link eu.lowcomote.keptn.sli.impl.ServiceLevelIndicatorsSpec_versionImpl <em>Service Level Indicators Spec version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.lowcomote.keptn.sli.impl.ServiceLevelIndicatorsSpec_versionImpl
		 * @see eu.lowcomote.keptn.sli.impl.SliPackageImpl#getServiceLevelIndicatorsSpec_version()
		 * @generated
		 */
		EClass SERVICE_LEVEL_INDICATORS_SPEC_VERSION = eINSTANCE.getServiceLevelIndicatorsSpec_version();

		/**
		 * The meta object literal for the '<em><b>Spec version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_LEVEL_INDICATORS_SPEC_VERSION__SPEC_VERSION = eINSTANCE.getServiceLevelIndicatorsSpec_version_Spec_version();

		/**
		 * The meta object literal for the '{@link eu.lowcomote.keptn.sli.impl.ServiceLevelIndicatorsIndicatorsPatternProperties0Impl <em>Service Level Indicators Indicators Pattern Properties0</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.lowcomote.keptn.sli.impl.ServiceLevelIndicatorsIndicatorsPatternProperties0Impl
		 * @see eu.lowcomote.keptn.sli.impl.SliPackageImpl#getServiceLevelIndicatorsIndicatorsPatternProperties0()
		 * @generated
		 */
		EClass SERVICE_LEVEL_INDICATORS_INDICATORS_PATTERN_PROPERTIES0 = eINSTANCE.getServiceLevelIndicatorsIndicatorsPatternProperties0();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_LEVEL_INDICATORS_INDICATORS_PATTERN_PROPERTIES0__KEY = eINSTANCE.getServiceLevelIndicatorsIndicatorsPatternProperties0_Key();

		/**
		 * The meta object literal for the '<em><b>Pattern Properties0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_LEVEL_INDICATORS_INDICATORS_PATTERN_PROPERTIES0__PATTERN_PROPERTIES0 = eINSTANCE.getServiceLevelIndicatorsIndicatorsPatternProperties0_PatternProperties0();

		/**
		 * The meta object literal for the '{@link eu.lowcomote.keptn.sli.impl.ServiceLevelIndicatorsPropertiesAbstractImpl <em>Service Level Indicators Properties Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.lowcomote.keptn.sli.impl.ServiceLevelIndicatorsPropertiesAbstractImpl
		 * @see eu.lowcomote.keptn.sli.impl.SliPackageImpl#getServiceLevelIndicatorsPropertiesAbstract()
		 * @generated
		 */
		EClass SERVICE_LEVEL_INDICATORS_PROPERTIES_ABSTRACT = eINSTANCE.getServiceLevelIndicatorsPropertiesAbstract();

		/**
		 * The meta object literal for the '{@link eu.lowcomote.keptn.sli.impl.ServiceLevelIndicatorsIndicatorsPropertiesAbstractImpl <em>Service Level Indicators Indicators Properties Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.lowcomote.keptn.sli.impl.ServiceLevelIndicatorsIndicatorsPropertiesAbstractImpl
		 * @see eu.lowcomote.keptn.sli.impl.SliPackageImpl#getServiceLevelIndicatorsIndicatorsPropertiesAbstract()
		 * @generated
		 */
		EClass SERVICE_LEVEL_INDICATORS_INDICATORS_PROPERTIES_ABSTRACT = eINSTANCE.getServiceLevelIndicatorsIndicatorsPropertiesAbstract();

	}

} //SliPackage
