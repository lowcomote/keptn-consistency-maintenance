/**
 */
package eu.lowcomote.keptn.sli2slo;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eu.lowcomote.keptn.sli2slo.Sli2sloPackage
 * @generated
 */
public interface Sli2sloFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Sli2sloFactory eINSTANCE = eu.lowcomote.keptn.sli2slo.impl.Sli2sloFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Sli2 Slo Links</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sli2 Slo Links</em>'.
	 * @generated
	 */
	Sli2SloLinks createSli2SloLinks();

	/**
	 * Returns a new object of class '<em>Sli2 Slo Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sli2 Slo Link</em>'.
	 * @generated
	 */
	Sli2SloLink createSli2SloLink();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Sli2sloPackage getSli2sloPackage();

} //Sli2sloFactory
