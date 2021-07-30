/**
 */
package eu.lowcomote.keptn.slo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Objective Pass Items</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.lowcomote.keptn.slo.ObjectivePassItems#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see eu.lowcomote.keptn.slo.SloPackage#getObjectivePassItems()
 * @model
 * @generated
 */
public interface ObjectivePassItems extends EObject {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference.
	 * @see #setItems(SLICriteria)
	 * @see eu.lowcomote.keptn.slo.SloPackage#getObjectivePassItems_Items()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SLICriteria getItems();

	/**
	 * Sets the value of the '{@link eu.lowcomote.keptn.slo.ObjectivePassItems#getItems <em>Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Items</em>' containment reference.
	 * @see #getItems()
	 * @generated
	 */
	void setItems(SLICriteria value);

} // ObjectivePassItems
