/**
 */
package eu.lowcomote.keptn.slo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparison</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.lowcomote.keptn.slo.Comparison#getComparison <em>Comparison</em>}</li>
 * </ul>
 *
 * @see eu.lowcomote.keptn.slo.SloPackage#getComparison()
 * @model
 * @generated
 */
public interface Comparison extends EObject {
	/**
	 * Returns the value of the '<em><b>Comparison</b></em>' containment reference list.
	 * The list contents are of type {@link eu.lowcomote.keptn.slo.ComparisonPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison</em>' containment reference list.
	 * @see eu.lowcomote.keptn.slo.SloPackage#getComparison_Comparison()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComparisonPropertiesAbstract> getComparison();

} // Comparison
