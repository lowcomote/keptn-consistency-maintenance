/**
 */
package eu.lowcomote.keptn.slo;

import jsonMetaschemaMM.JsonDocument;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Level Objectives Filter Additional Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.lowcomote.keptn.slo.ServiceLevelObjectivesFilterAdditionalProperties#getKey <em>Key</em>}</li>
 *   <li>{@link eu.lowcomote.keptn.slo.ServiceLevelObjectivesFilterAdditionalProperties#getAdditionalProperties <em>Additional Properties</em>}</li>
 * </ul>
 *
 * @see eu.lowcomote.keptn.slo.SloPackage#getServiceLevelObjectivesFilterAdditionalProperties()
 * @model
 * @generated
 */
public interface ServiceLevelObjectivesFilterAdditionalProperties extends ServiceLevelObjectivesFilterPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see eu.lowcomote.keptn.slo.SloPackage#getServiceLevelObjectivesFilterAdditionalProperties_Key()
	 * @model required="true"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link eu.lowcomote.keptn.slo.ServiceLevelObjectivesFilterAdditionalProperties#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Additional Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Properties</em>' containment reference.
	 * @see #setAdditionalProperties(JsonDocument)
	 * @see eu.lowcomote.keptn.slo.SloPackage#getServiceLevelObjectivesFilterAdditionalProperties_AdditionalProperties()
	 * @model containment="true" required="true"
	 * @generated
	 */
	JsonDocument getAdditionalProperties();

	/**
	 * Sets the value of the '{@link eu.lowcomote.keptn.slo.ServiceLevelObjectivesFilterAdditionalProperties#getAdditionalProperties <em>Additional Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Properties</em>' containment reference.
	 * @see #getAdditionalProperties()
	 * @generated
	 */
	void setAdditionalProperties(JsonDocument value);

} // ServiceLevelObjectivesFilterAdditionalProperties
