/**
 */
package eu.lowcomote.keptn.sli2slo.impl;

import eu.lowcomote.keptn.sli.SliPackage;

import eu.lowcomote.keptn.sli2slo.Sli2SloLink;
import eu.lowcomote.keptn.sli2slo.Sli2SloLinks;
import eu.lowcomote.keptn.sli2slo.Sli2sloFactory;
import eu.lowcomote.keptn.sli2slo.Sli2sloPackage;

import eu.lowcomote.keptn.slo.SloPackage;

import jsonMetaschemaMM.JsonMetaschemaMMPackage;

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
public class Sli2sloPackageImpl extends EPackageImpl implements Sli2sloPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sli2SloLinksEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sli2SloLinkEClass = null;

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
	 * @see eu.lowcomote.keptn.sli2slo.Sli2sloPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Sli2sloPackageImpl() {
		super(eNS_URI, Sli2sloFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Sli2sloPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Sli2sloPackage init() {
		if (isInited) return (Sli2sloPackage)EPackage.Registry.INSTANCE.getEPackage(Sli2sloPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSli2sloPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Sli2sloPackageImpl theSli2sloPackage = registeredSli2sloPackage instanceof Sli2sloPackageImpl ? (Sli2sloPackageImpl)registeredSli2sloPackage : new Sli2sloPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		JsonMetaschemaMMPackage.eINSTANCE.eClass();
		SliPackage.eINSTANCE.eClass();
		SloPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSli2sloPackage.createPackageContents();

		// Initialize created meta-data
		theSli2sloPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSli2sloPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Sli2sloPackage.eNS_URI, theSli2sloPackage);
		return theSli2sloPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSli2SloLinks() {
		return sli2SloLinksEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSli2SloLinks_Links() {
		return (EReference)sli2SloLinksEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSli2SloLink() {
		return sli2SloLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSli2SloLink_Sli() {
		return (EReference)sli2SloLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSli2SloLink_Slo() {
		return (EReference)sli2SloLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sli2sloFactory getSli2sloFactory() {
		return (Sli2sloFactory)getEFactoryInstance();
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
		sli2SloLinksEClass = createEClass(SLI2_SLO_LINKS);
		createEReference(sli2SloLinksEClass, SLI2_SLO_LINKS__LINKS);

		sli2SloLinkEClass = createEClass(SLI2_SLO_LINK);
		createEReference(sli2SloLinkEClass, SLI2_SLO_LINK__SLI);
		createEReference(sli2SloLinkEClass, SLI2_SLO_LINK__SLO);
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
		SliPackage theSliPackage = (SliPackage)EPackage.Registry.INSTANCE.getEPackage(SliPackage.eNS_URI);
		SloPackage theSloPackage = (SloPackage)EPackage.Registry.INSTANCE.getEPackage(SloPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(sli2SloLinksEClass, Sli2SloLinks.class, "Sli2SloLinks", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSli2SloLinks_Links(), this.getSli2SloLink(), null, "links", null, 0, -1, Sli2SloLinks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sli2SloLinkEClass, Sli2SloLink.class, "Sli2SloLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSli2SloLink_Sli(), theSliPackage.getSliRoot(), null, "sli", null, 1, -1, Sli2SloLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSli2SloLink_Slo(), theSloPackage.getSloRoot(), null, "slo", null, 1, -1, Sli2SloLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Sli2sloPackageImpl
