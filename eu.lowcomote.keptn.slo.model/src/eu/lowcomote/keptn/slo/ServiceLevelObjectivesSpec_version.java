/**
 */
package eu.lowcomote.keptn.slo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Level Objectives Spec version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.lowcomote.keptn.slo.ServiceLevelObjectivesSpec_version#getSpec_version <em>Spec version</em>}</li>
 * </ul>
 *
 * @see eu.lowcomote.keptn.slo.SloPackage#getServiceLevelObjectivesSpec_version()
 * @model
 * @generated
 */
public interface ServiceLevelObjectivesSpec_version extends ServiceLevelObjectivesPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Spec version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec version</em>' attribute.
	 * @see #setSpec_version(String)
	 * @see eu.lowcomote.keptn.slo.SloPackage#getServiceLevelObjectivesSpec_version_Spec_version()
	 * @model required="true"
	 * @generated
	 */
	String getSpec_version();

	/**
	 * Sets the value of the '{@link eu.lowcomote.keptn.slo.ServiceLevelObjectivesSpec_version#getSpec_version <em>Spec version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spec version</em>' attribute.
	 * @see #getSpec_version()
	 * @generated
	 */
	void setSpec_version(String value);

} // ServiceLevelObjectivesSpec_version
