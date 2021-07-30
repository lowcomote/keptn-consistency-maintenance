/**
 */
package eu.lowcomote.keptn.slo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Objective</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.lowcomote.keptn.slo.Objective#getObjective <em>Objective</em>}</li>
 * </ul>
 *
 * @see eu.lowcomote.keptn.slo.SloPackage#getObjective()
 * @model
 * @generated
 */
public interface Objective extends EObject {
	/**
	 * Returns the value of the '<em><b>Objective</b></em>' containment reference list.
	 * The list contents are of type {@link eu.lowcomote.keptn.slo.ObjectivePropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objective</em>' containment reference list.
	 * @see eu.lowcomote.keptn.slo.SloPackage#getObjective_Objective()
	 * @model containment="true"
	 * @generated
	 */
	EList<ObjectivePropertiesAbstract> getObjective();

} // Objective
