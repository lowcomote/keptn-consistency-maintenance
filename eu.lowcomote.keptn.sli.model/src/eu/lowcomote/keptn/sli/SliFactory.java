/**
 */
package eu.lowcomote.keptn.sli;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eu.lowcomote.keptn.sli.SliPackage
 * @generated
 */
public interface SliFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SliFactory eINSTANCE = eu.lowcomote.keptn.sli.impl.SliFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root</em>'.
	 * @generated
	 */
	SliRoot createSliRoot();

	/**
	 * Returns a new object of class '<em>Service Level Indicators</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Level Indicators</em>'.
	 * @generated
	 */
	ServiceLevelIndicators createServiceLevelIndicators();

	/**
	 * Returns a new object of class '<em>Service Level Indicators Indicators</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Level Indicators Indicators</em>'.
	 * @generated
	 */
	ServiceLevelIndicatorsIndicators createServiceLevelIndicatorsIndicators();

	/**
	 * Returns a new object of class '<em>Service Level Indicators Spec version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Level Indicators Spec version</em>'.
	 * @generated
	 */
	ServiceLevelIndicatorsSpec_version createServiceLevelIndicatorsSpec_version();

	/**
	 * Returns a new object of class '<em>Service Level Indicators Indicators Pattern Properties0</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Level Indicators Indicators Pattern Properties0</em>'.
	 * @generated
	 */
	ServiceLevelIndicatorsIndicatorsPatternProperties0 createServiceLevelIndicatorsIndicatorsPatternProperties0();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SliPackage getSliPackage();

} //SliFactory
