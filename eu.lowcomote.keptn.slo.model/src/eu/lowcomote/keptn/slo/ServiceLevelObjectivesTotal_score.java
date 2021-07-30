/**
 */
package eu.lowcomote.keptn.slo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Level Objectives Total score</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.lowcomote.keptn.slo.ServiceLevelObjectivesTotal_score#getTotal_score <em>Total score</em>}</li>
 * </ul>
 *
 * @see eu.lowcomote.keptn.slo.SloPackage#getServiceLevelObjectivesTotal_score()
 * @model
 * @generated
 */
public interface ServiceLevelObjectivesTotal_score extends ServiceLevelObjectivesPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Total score</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total score</em>' containment reference.
	 * @see #setTotal_score(Score)
	 * @see eu.lowcomote.keptn.slo.SloPackage#getServiceLevelObjectivesTotal_score_Total_score()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Score getTotal_score();

	/**
	 * Sets the value of the '{@link eu.lowcomote.keptn.slo.ServiceLevelObjectivesTotal_score#getTotal_score <em>Total score</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total score</em>' containment reference.
	 * @see #getTotal_score()
	 * @generated
	 */
	void setTotal_score(Score value);

} // ServiceLevelObjectivesTotal_score
