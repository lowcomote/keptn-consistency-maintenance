/**
 */
package eu.lowcomote.keptn.slo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Level Objectives Comparison</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.lowcomote.keptn.slo.ServiceLevelObjectivesComparison#getComparison <em>Comparison</em>}</li>
 * </ul>
 *
 * @see eu.lowcomote.keptn.slo.SloPackage#getServiceLevelObjectivesComparison()
 * @model
 * @generated
 */
public interface ServiceLevelObjectivesComparison extends ServiceLevelObjectivesPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Comparison</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison</em>' containment reference.
	 * @see #setComparison(Comparison)
	 * @see eu.lowcomote.keptn.slo.SloPackage#getServiceLevelObjectivesComparison_Comparison()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Comparison getComparison();

	/**
	 * Sets the value of the '{@link eu.lowcomote.keptn.slo.ServiceLevelObjectivesComparison#getComparison <em>Comparison</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparison</em>' containment reference.
	 * @see #getComparison()
	 * @generated
	 */
	void setComparison(Comparison value);

} // ServiceLevelObjectivesComparison
