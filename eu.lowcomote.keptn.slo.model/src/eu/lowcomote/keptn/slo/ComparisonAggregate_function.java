/**
 */
package eu.lowcomote.keptn.slo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparison Aggregate function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.lowcomote.keptn.slo.ComparisonAggregate_function#getAggregate_function <em>Aggregate function</em>}</li>
 * </ul>
 *
 * @see eu.lowcomote.keptn.slo.SloPackage#getComparisonAggregate_function()
 * @model
 * @generated
 */
public interface ComparisonAggregate_function extends ComparisonPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Aggregate function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregate function</em>' attribute.
	 * @see #setAggregate_function(String)
	 * @see eu.lowcomote.keptn.slo.SloPackage#getComparisonAggregate_function_Aggregate_function()
	 * @model required="true"
	 * @generated
	 */
	String getAggregate_function();

	/**
	 * Sets the value of the '{@link eu.lowcomote.keptn.slo.ComparisonAggregate_function#getAggregate_function <em>Aggregate function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregate function</em>' attribute.
	 * @see #getAggregate_function()
	 * @generated
	 */
	void setAggregate_function(String value);

} // ComparisonAggregate_function
