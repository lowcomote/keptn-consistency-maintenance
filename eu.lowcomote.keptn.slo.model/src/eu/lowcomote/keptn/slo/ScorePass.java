/**
 */
package eu.lowcomote.keptn.slo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Score Pass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.lowcomote.keptn.slo.ScorePass#getPass <em>Pass</em>}</li>
 * </ul>
 *
 * @see eu.lowcomote.keptn.slo.SloPackage#getScorePass()
 * @model
 * @generated
 */
public interface ScorePass extends ScorePropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Pass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pass</em>' attribute.
	 * @see #setPass(String)
	 * @see eu.lowcomote.keptn.slo.SloPackage#getScorePass_Pass()
	 * @model required="true"
	 * @generated
	 */
	String getPass();

	/**
	 * Sets the value of the '{@link eu.lowcomote.keptn.slo.ScorePass#getPass <em>Pass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pass</em>' attribute.
	 * @see #getPass()
	 * @generated
	 */
	void setPass(String value);

} // ScorePass
