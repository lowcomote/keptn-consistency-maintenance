/**
 */
package eu.lowcomote.keptn.slo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Objective Sli</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.lowcomote.keptn.slo.ObjectiveSli#getSli <em>Sli</em>}</li>
 * </ul>
 *
 * @see eu.lowcomote.keptn.slo.SloPackage#getObjectiveSli()
 * @model
 * @generated
 */
public interface ObjectiveSli extends ObjectivePropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Sli</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sli</em>' attribute.
	 * @see #setSli(String)
	 * @see eu.lowcomote.keptn.slo.SloPackage#getObjectiveSli_Sli()
	 * @model required="true"
	 * @generated
	 */
	String getSli();

	/**
	 * Sets the value of the '{@link eu.lowcomote.keptn.slo.ObjectiveSli#getSli <em>Sli</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sli</em>' attribute.
	 * @see #getSli()
	 * @generated
	 */
	void setSli(String value);

} // ObjectiveSli
