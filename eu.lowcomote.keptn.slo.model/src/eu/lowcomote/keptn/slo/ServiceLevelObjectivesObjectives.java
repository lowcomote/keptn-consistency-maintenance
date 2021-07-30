/**
 */
package eu.lowcomote.keptn.slo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Level Objectives Objectives</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.lowcomote.keptn.slo.ServiceLevelObjectivesObjectives#getObjectives <em>Objectives</em>}</li>
 * </ul>
 *
 * @see eu.lowcomote.keptn.slo.SloPackage#getServiceLevelObjectivesObjectives()
 * @model
 * @generated
 */
public interface ServiceLevelObjectivesObjectives extends ServiceLevelObjectivesPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Objectives</b></em>' containment reference list.
	 * The list contents are of type {@link eu.lowcomote.keptn.slo.ServiceLevelObjectivesObjectivesItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objectives</em>' containment reference list.
	 * @see eu.lowcomote.keptn.slo.SloPackage#getServiceLevelObjectivesObjectives_Objectives()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceLevelObjectivesObjectivesItems> getObjectives();

} // ServiceLevelObjectivesObjectives
