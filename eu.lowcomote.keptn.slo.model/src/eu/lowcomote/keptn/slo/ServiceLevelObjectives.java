/**
 */
package eu.lowcomote.keptn.slo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Level Objectives</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.lowcomote.keptn.slo.ServiceLevelObjectives#getServiceLevelObjectives <em>Service Level Objectives</em>}</li>
 * </ul>
 *
 * @see eu.lowcomote.keptn.slo.SloPackage#getServiceLevelObjectives()
 * @model
 * @generated
 */
public interface ServiceLevelObjectives extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Level Objectives</b></em>' containment reference list.
	 * The list contents are of type {@link eu.lowcomote.keptn.slo.ServiceLevelObjectivesPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Level Objectives</em>' containment reference list.
	 * @see eu.lowcomote.keptn.slo.SloPackage#getServiceLevelObjectives_ServiceLevelObjectives()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceLevelObjectivesPropertiesAbstract> getServiceLevelObjectives();

} // ServiceLevelObjectives
