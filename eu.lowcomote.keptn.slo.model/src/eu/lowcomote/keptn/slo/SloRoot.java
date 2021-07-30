/**
 */
package eu.lowcomote.keptn.slo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.lowcomote.keptn.slo.SloRoot#getSloRoot <em>Slo Root</em>}</li>
 * </ul>
 *
 * @see eu.lowcomote.keptn.slo.SloPackage#getSloRoot()
 * @model
 * @generated
 */
public interface SloRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Slo Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slo Root</em>' containment reference.
	 * @see #setSloRoot(ServiceLevelObjectives)
	 * @see eu.lowcomote.keptn.slo.SloPackage#getSloRoot_SloRoot()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ServiceLevelObjectives getSloRoot();

	/**
	 * Sets the value of the '{@link eu.lowcomote.keptn.slo.SloRoot#getSloRoot <em>Slo Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slo Root</em>' containment reference.
	 * @see #getSloRoot()
	 * @generated
	 */
	void setSloRoot(ServiceLevelObjectives value);

} // SloRoot
