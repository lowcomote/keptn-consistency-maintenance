/**
 */
package eu.lowcomote.keptn.slo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Level Objectives Objectives Items</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.lowcomote.keptn.slo.ServiceLevelObjectivesObjectivesItems#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see eu.lowcomote.keptn.slo.SloPackage#getServiceLevelObjectivesObjectivesItems()
 * @model
 * @generated
 */
public interface ServiceLevelObjectivesObjectivesItems extends EObject {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference.
	 * @see #setItems(Objective)
	 * @see eu.lowcomote.keptn.slo.SloPackage#getServiceLevelObjectivesObjectivesItems_Items()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Objective getItems();

	/**
	 * Sets the value of the '{@link eu.lowcomote.keptn.slo.ServiceLevelObjectivesObjectivesItems#getItems <em>Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Items</em>' containment reference.
	 * @see #getItems()
	 * @generated
	 */
	void setItems(Objective value);

} // ServiceLevelObjectivesObjectivesItems
