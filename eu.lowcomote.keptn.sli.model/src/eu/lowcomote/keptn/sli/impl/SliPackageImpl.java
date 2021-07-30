/**
 */
package eu.lowcomote.keptn.sli.impl;

import eu.lowcomote.keptn.sli.ServiceLevelIndicators;
import eu.lowcomote.keptn.sli.ServiceLevelIndicatorsIndicators;
import eu.lowcomote.keptn.sli.ServiceLevelIndicatorsIndicatorsPatternProperties0;
import eu.lowcomote.keptn.sli.ServiceLevelIndicatorsIndicatorsPropertiesAbstract;
import eu.lowcomote.keptn.sli.ServiceLevelIndicatorsPropertiesAbstract;
import eu.lowcomote.keptn.sli.ServiceLevelIndicatorsSpec_version;
import eu.lowcomote.keptn.sli.SliFactory;
import eu.lowcomote.keptn.sli.SliPackage;
import eu.lowcomote.keptn.sli.SliRoot;

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
public class SliPackageImpl extends EPackageImpl implements SliPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sliRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceLevelIndicatorsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceLevelIndicatorsIndicatorsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceLevelIndicatorsSpec_versionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceLevelIndicatorsIndicatorsPatternProperties0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceLevelIndicatorsPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceLevelIndicatorsIndicatorsPropertiesAbstractEClass = null;

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
	 * @see eu.lowcomote.keptn.sli.SliPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SliPackageImpl() {
		super(eNS_URI, SliFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SliPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SliPackage init() {
		if (isInited) return (SliPackage)EPackage.Registry.INSTANCE.getEPackage(SliPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSliPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SliPackageImpl theSliPackage = registeredSliPackage instanceof SliPackageImpl ? (SliPackageImpl)registeredSliPackage : new SliPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theSliPackage.createPackageContents();

		// Initialize created meta-data
		theSliPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSliPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SliPackage.eNS_URI, theSliPackage);
		return theSliPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSliRoot() {
		return sliRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSliRoot_SliRoot() {
		return (EReference)sliRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceLevelIndicators() {
		return serviceLevelIndicatorsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceLevelIndicators_ServiceLevelIndicators() {
		return (EReference)serviceLevelIndicatorsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceLevelIndicatorsIndicators() {
		return serviceLevelIndicatorsIndicatorsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceLevelIndicatorsIndicators_Indicators() {
		return (EReference)serviceLevelIndicatorsIndicatorsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceLevelIndicatorsSpec_version() {
		return serviceLevelIndicatorsSpec_versionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceLevelIndicatorsSpec_version_Spec_version() {
		return (EAttribute)serviceLevelIndicatorsSpec_versionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceLevelIndicatorsIndicatorsPatternProperties0() {
		return serviceLevelIndicatorsIndicatorsPatternProperties0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceLevelIndicatorsIndicatorsPatternProperties0_Key() {
		return (EAttribute)serviceLevelIndicatorsIndicatorsPatternProperties0EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceLevelIndicatorsIndicatorsPatternProperties0_PatternProperties0() {
		return (EAttribute)serviceLevelIndicatorsIndicatorsPatternProperties0EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceLevelIndicatorsPropertiesAbstract() {
		return serviceLevelIndicatorsPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceLevelIndicatorsIndicatorsPropertiesAbstract() {
		return serviceLevelIndicatorsIndicatorsPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SliFactory getSliFactory() {
		return (SliFactory)getEFactoryInstance();
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
		sliRootEClass = createEClass(SLI_ROOT);
		createEReference(sliRootEClass, SLI_ROOT__SLI_ROOT);

		serviceLevelIndicatorsEClass = createEClass(SERVICE_LEVEL_INDICATORS);
		createEReference(serviceLevelIndicatorsEClass, SERVICE_LEVEL_INDICATORS__SERVICE_LEVEL_INDICATORS);

		serviceLevelIndicatorsIndicatorsEClass = createEClass(SERVICE_LEVEL_INDICATORS_INDICATORS);
		createEReference(serviceLevelIndicatorsIndicatorsEClass, SERVICE_LEVEL_INDICATORS_INDICATORS__INDICATORS);

		serviceLevelIndicatorsSpec_versionEClass = createEClass(SERVICE_LEVEL_INDICATORS_SPEC_VERSION);
		createEAttribute(serviceLevelIndicatorsSpec_versionEClass, SERVICE_LEVEL_INDICATORS_SPEC_VERSION__SPEC_VERSION);

		serviceLevelIndicatorsIndicatorsPatternProperties0EClass = createEClass(SERVICE_LEVEL_INDICATORS_INDICATORS_PATTERN_PROPERTIES0);
		createEAttribute(serviceLevelIndicatorsIndicatorsPatternProperties0EClass, SERVICE_LEVEL_INDICATORS_INDICATORS_PATTERN_PROPERTIES0__KEY);
		createEAttribute(serviceLevelIndicatorsIndicatorsPatternProperties0EClass, SERVICE_LEVEL_INDICATORS_INDICATORS_PATTERN_PROPERTIES0__PATTERN_PROPERTIES0);

		serviceLevelIndicatorsPropertiesAbstractEClass = createEClass(SERVICE_LEVEL_INDICATORS_PROPERTIES_ABSTRACT);

		serviceLevelIndicatorsIndicatorsPropertiesAbstractEClass = createEClass(SERVICE_LEVEL_INDICATORS_INDICATORS_PROPERTIES_ABSTRACT);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		serviceLevelIndicatorsIndicatorsEClass.getESuperTypes().add(this.getServiceLevelIndicatorsPropertiesAbstract());
		serviceLevelIndicatorsSpec_versionEClass.getESuperTypes().add(this.getServiceLevelIndicatorsPropertiesAbstract());
		serviceLevelIndicatorsIndicatorsPatternProperties0EClass.getESuperTypes().add(this.getServiceLevelIndicatorsIndicatorsPropertiesAbstract());

		// Initialize classes, features, and operations; add parameters
		initEClass(sliRootEClass, SliRoot.class, "SliRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSliRoot_SliRoot(), this.getServiceLevelIndicators(), null, "sliRoot", null, 1, 1, SliRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceLevelIndicatorsEClass, ServiceLevelIndicators.class, "ServiceLevelIndicators", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceLevelIndicators_ServiceLevelIndicators(), this.getServiceLevelIndicatorsPropertiesAbstract(), null, "ServiceLevelIndicators", null, 0, -1, ServiceLevelIndicators.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceLevelIndicatorsIndicatorsEClass, ServiceLevelIndicatorsIndicators.class, "ServiceLevelIndicatorsIndicators", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceLevelIndicatorsIndicators_Indicators(), this.getServiceLevelIndicatorsIndicatorsPropertiesAbstract(), null, "indicators", null, 0, -1, ServiceLevelIndicatorsIndicators.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceLevelIndicatorsSpec_versionEClass, ServiceLevelIndicatorsSpec_version.class, "ServiceLevelIndicatorsSpec_version", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceLevelIndicatorsSpec_version_Spec_version(), ecorePackage.getEString(), "spec_version", null, 1, 1, ServiceLevelIndicatorsSpec_version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceLevelIndicatorsIndicatorsPatternProperties0EClass, ServiceLevelIndicatorsIndicatorsPatternProperties0.class, "ServiceLevelIndicatorsIndicatorsPatternProperties0", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceLevelIndicatorsIndicatorsPatternProperties0_Key(), ecorePackage.getEString(), "key", null, 1, 1, ServiceLevelIndicatorsIndicatorsPatternProperties0.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceLevelIndicatorsIndicatorsPatternProperties0_PatternProperties0(), ecorePackage.getEString(), "patternProperties0", null, 1, 1, ServiceLevelIndicatorsIndicatorsPatternProperties0.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceLevelIndicatorsPropertiesAbstractEClass, ServiceLevelIndicatorsPropertiesAbstract.class, "ServiceLevelIndicatorsPropertiesAbstract", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceLevelIndicatorsIndicatorsPropertiesAbstractEClass, ServiceLevelIndicatorsIndicatorsPropertiesAbstract.class, "ServiceLevelIndicatorsIndicatorsPropertiesAbstract", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //SliPackageImpl
