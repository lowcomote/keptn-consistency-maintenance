/**
 */
package eu.lowcomote.keptn.slo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Score Warning</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.lowcomote.keptn.slo.ScoreWarning#getWarning <em>Warning</em>}</li>
 * </ul>
 *
 * @see eu.lowcomote.keptn.slo.SloPackage#getScoreWarning()
 * @model
 * @generated
 */
public interface ScoreWarning extends ScorePropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Warning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warning</em>' attribute.
	 * @see #setWarning(String)
	 * @see eu.lowcomote.keptn.slo.SloPackage#getScoreWarning_Warning()
	 * @model required="true"
	 * @generated
	 */
	String getWarning();

	/**
	 * Sets the value of the '{@link eu.lowcomote.keptn.slo.ScoreWarning#getWarning <em>Warning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Warning</em>' attribute.
	 * @see #getWarning()
	 * @generated
	 */
	void setWarning(String value);

} // ScoreWarning
