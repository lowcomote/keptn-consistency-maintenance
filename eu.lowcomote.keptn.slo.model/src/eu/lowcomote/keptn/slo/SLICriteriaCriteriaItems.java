/**
 */
package eu.lowcomote.keptn.slo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SLI Criteria Criteria Items</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.lowcomote.keptn.slo.SLICriteriaCriteriaItems#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see eu.lowcomote.keptn.slo.SloPackage#getSLICriteriaCriteriaItems()
 * @model
 * @generated
 */
public interface SLICriteriaCriteriaItems extends EObject {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' attribute.
	 * @see #setItems(String)
	 * @see eu.lowcomote.keptn.slo.SloPackage#getSLICriteriaCriteriaItems_Items()
	 * @model required="true"
	 * @generated
	 */
	String getItems();

	/**
	 * Sets the value of the '{@link eu.lowcomote.keptn.slo.SLICriteriaCriteriaItems#getItems <em>Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Items</em>' attribute.
	 * @see #getItems()
	 * @generated
	 */
	void setItems(String value);

} // SLICriteriaCriteriaItems
