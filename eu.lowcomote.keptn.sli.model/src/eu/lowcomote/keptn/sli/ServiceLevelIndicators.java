/**
 */
package eu.lowcomote.keptn.sli;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Level Indicators</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.lowcomote.keptn.sli.ServiceLevelIndicators#getServiceLevelIndicators <em>Service Level Indicators</em>}</li>
 * </ul>
 *
 * @see eu.lowcomote.keptn.sli.SliPackage#getServiceLevelIndicators()
 * @model
 * @generated
 */
public interface ServiceLevelIndicators extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Level Indicators</b></em>' containment reference list.
	 * The list contents are of type {@link eu.lowcomote.keptn.sli.ServiceLevelIndicatorsPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Level Indicators</em>' containment reference list.
	 * @see eu.lowcomote.keptn.sli.SliPackage#getServiceLevelIndicators_ServiceLevelIndicators()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceLevelIndicatorsPropertiesAbstract> getServiceLevelIndicators();

} // ServiceLevelIndicators
