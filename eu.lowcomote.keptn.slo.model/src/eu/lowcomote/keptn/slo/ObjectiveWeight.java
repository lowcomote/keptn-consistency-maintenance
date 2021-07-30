/**
 */
package eu.lowcomote.keptn.slo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Objective Weight</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.lowcomote.keptn.slo.ObjectiveWeight#getWeight <em>Weight</em>}</li>
 * </ul>
 *
 * @see eu.lowcomote.keptn.slo.SloPackage#getObjectiveWeight()
 * @model
 * @generated
 */
public interface ObjectiveWeight extends ObjectivePropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(int)
	 * @see eu.lowcomote.keptn.slo.SloPackage#getObjectiveWeight_Weight()
	 * @model required="true"
	 * @generated
	 */
	int getWeight();

	/**
	 * Sets the value of the '{@link eu.lowcomote.keptn.slo.ObjectiveWeight#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(int value);

} // ObjectiveWeight
