/**
 */
package eu.lowcomote.keptn.sli2slo;

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
 * @see eu.lowcomote.keptn.sli2slo.Sli2sloFactory
 * @model kind="package"
 * @generated
 */
public interface Sli2sloPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sli2slo";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://eu.lowcomote/keptn/sli2slo";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sli2slo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Sli2sloPackage eINSTANCE = eu.lowcomote.keptn.sli2slo.impl.Sli2sloPackageImpl.init();

	/**
	 * The meta object id for the '{@link eu.lowcomote.keptn.sli2slo.impl.Sli2SloLinksImpl <em>Sli2 Slo Links</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.lowcomote.keptn.sli2slo.impl.Sli2SloLinksImpl
	 * @see eu.lowcomote.keptn.sli2slo.impl.Sli2sloPackageImpl#getSli2SloLinks()
	 * @generated
	 */
	int SLI2_SLO_LINKS = 0;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLI2_SLO_LINKS__LINKS = 0;

	/**
	 * The number of structural features of the '<em>Sli2 Slo Links</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLI2_SLO_LINKS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Sli2 Slo Links</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLI2_SLO_LINKS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.lowcomote.keptn.sli2slo.impl.Sli2SloLinkImpl <em>Sli2 Slo Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.lowcomote.keptn.sli2slo.impl.Sli2SloLinkImpl
	 * @see eu.lowcomote.keptn.sli2slo.impl.Sli2sloPackageImpl#getSli2SloLink()
	 * @generated
	 */
	int SLI2_SLO_LINK = 1;

	/**
	 * The feature id for the '<em><b>Sli</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLI2_SLO_LINK__SLI = 0;

	/**
	 * The feature id for the '<em><b>Slo</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLI2_SLO_LINK__SLO = 1;

	/**
	 * The number of structural features of the '<em>Sli2 Slo Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLI2_SLO_LINK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Sli2 Slo Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLI2_SLO_LINK_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link eu.lowcomote.keptn.sli2slo.Sli2SloLinks <em>Sli2 Slo Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sli2 Slo Links</em>'.
	 * @see eu.lowcomote.keptn.sli2slo.Sli2SloLinks
	 * @generated
	 */
	EClass getSli2SloLinks();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.lowcomote.keptn.sli2slo.Sli2SloLinks#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see eu.lowcomote.keptn.sli2slo.Sli2SloLinks#getLinks()
	 * @see #getSli2SloLinks()
	 * @generated
	 */
	EReference getSli2SloLinks_Links();

	/**
	 * Returns the meta object for class '{@link eu.lowcomote.keptn.sli2slo.Sli2SloLink <em>Sli2 Slo Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sli2 Slo Link</em>'.
	 * @see eu.lowcomote.keptn.sli2slo.Sli2SloLink
	 * @generated
	 */
	EClass getSli2SloLink();

	/**
	 * Returns the meta object for the reference list '{@link eu.lowcomote.keptn.sli2slo.Sli2SloLink#getSli <em>Sli</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sli</em>'.
	 * @see eu.lowcomote.keptn.sli2slo.Sli2SloLink#getSli()
	 * @see #getSli2SloLink()
	 * @generated
	 */
	EReference getSli2SloLink_Sli();

	/**
	 * Returns the meta object for the reference list '{@link eu.lowcomote.keptn.sli2slo.Sli2SloLink#getSlo <em>Slo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Slo</em>'.
	 * @see eu.lowcomote.keptn.sli2slo.Sli2SloLink#getSlo()
	 * @see #getSli2SloLink()
	 * @generated
	 */
	EReference getSli2SloLink_Slo();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Sli2sloFactory getSli2sloFactory();

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
		 * The meta object literal for the '{@link eu.lowcomote.keptn.sli2slo.impl.Sli2SloLinksImpl <em>Sli2 Slo Links</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.lowcomote.keptn.sli2slo.impl.Sli2SloLinksImpl
		 * @see eu.lowcomote.keptn.sli2slo.impl.Sli2sloPackageImpl#getSli2SloLinks()
		 * @generated
		 */
		EClass SLI2_SLO_LINKS = eINSTANCE.getSli2SloLinks();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLI2_SLO_LINKS__LINKS = eINSTANCE.getSli2SloLinks_Links();

		/**
		 * The meta object literal for the '{@link eu.lowcomote.keptn.sli2slo.impl.Sli2SloLinkImpl <em>Sli2 Slo Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.lowcomote.keptn.sli2slo.impl.Sli2SloLinkImpl
		 * @see eu.lowcomote.keptn.sli2slo.impl.Sli2sloPackageImpl#getSli2SloLink()
		 * @generated
		 */
		EClass SLI2_SLO_LINK = eINSTANCE.getSli2SloLink();

		/**
		 * The meta object literal for the '<em><b>Sli</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLI2_SLO_LINK__SLI = eINSTANCE.getSli2SloLink_Sli();

		/**
		 * The meta object literal for the '<em><b>Slo</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLI2_SLO_LINK__SLO = eINSTANCE.getSli2SloLink_Slo();

	}

} //Sli2sloPackage
