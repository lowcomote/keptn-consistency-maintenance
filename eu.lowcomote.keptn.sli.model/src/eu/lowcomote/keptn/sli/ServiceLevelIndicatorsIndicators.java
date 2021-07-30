/**
 */
package eu.lowcomote.keptn.sli;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Level Indicators Indicators</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.lowcomote.keptn.sli.ServiceLevelIndicatorsIndicators#getIndicators <em>Indicators</em>}</li>
 * </ul>
 *
 * @see eu.lowcomote.keptn.sli.SliPackage#getServiceLevelIndicatorsIndicators()
 * @model
 * @generated
 */
public interface ServiceLevelIndicatorsIndicators extends ServiceLevelIndicatorsPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Indicators</b></em>' containment reference list.
	 * The list contents are of type {@link eu.lowcomote.keptn.sli.ServiceLevelIndicatorsIndicatorsPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indicators</em>' containment reference list.
	 * @see eu.lowcomote.keptn.sli.SliPackage#getServiceLevelIndicatorsIndicators_Indicators()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceLevelIndicatorsIndicatorsPropertiesAbstract> getIndicators();

} // ServiceLevelIndicatorsIndicators
