/**
 */
package eu.lowcomote.keptn.sli2slo.impl;

import eu.lowcomote.keptn.sli2slo.*;

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
public class Sli2sloFactoryImpl extends EFactoryImpl implements Sli2sloFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Sli2sloFactory init() {
		try {
			Sli2sloFactory theSli2sloFactory = (Sli2sloFactory)EPackage.Registry.INSTANCE.getEFactory(Sli2sloPackage.eNS_URI);
			if (theSli2sloFactory != null) {
				return theSli2sloFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Sli2sloFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sli2sloFactoryImpl() {
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
			case Sli2sloPackage.SLI2_SLO_LINKS: return createSli2SloLinks();
			case Sli2sloPackage.SLI2_SLO_LINK: return createSli2SloLink();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sli2SloLinks createSli2SloLinks() {
		Sli2SloLinksImpl sli2SloLinks = new Sli2SloLinksImpl();
		return sli2SloLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sli2SloLink createSli2SloLink() {
		Sli2SloLinkImpl sli2SloLink = new Sli2SloLinkImpl();
		return sli2SloLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sli2sloPackage getSli2sloPackage() {
		return (Sli2sloPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Sli2sloPackage getPackage() {
		return Sli2sloPackage.eINSTANCE;
	}

} //Sli2sloFactoryImpl
