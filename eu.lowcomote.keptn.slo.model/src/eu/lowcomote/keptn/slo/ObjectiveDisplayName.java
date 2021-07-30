/**
 */
package eu.lowcomote.keptn.slo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Objective Display Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.lowcomote.keptn.slo.ObjectiveDisplayName#getDisplayName <em>Display Name</em>}</li>
 * </ul>
 *
 * @see eu.lowcomote.keptn.slo.SloPackage#getObjectiveDisplayName()
 * @model
 * @generated
 */
public interface ObjectiveDisplayName extends ObjectivePropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Name</em>' attribute.
	 * @see #setDisplayName(String)
	 * @see eu.lowcomote.keptn.slo.SloPackage#getObjectiveDisplayName_DisplayName()
	 * @model required="true"
	 * @generated
	 */
	String getDisplayName();

	/**
	 * Sets the value of the '{@link eu.lowcomote.keptn.slo.ObjectiveDisplayName#getDisplayName <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' attribute.
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(String value);

} // ObjectiveDisplayName
