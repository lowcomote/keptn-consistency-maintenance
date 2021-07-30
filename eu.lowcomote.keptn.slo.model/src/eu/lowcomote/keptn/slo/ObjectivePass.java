/**
 */
package eu.lowcomote.keptn.slo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Objective Pass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.lowcomote.keptn.slo.ObjectivePass#getPass <em>Pass</em>}</li>
 * </ul>
 *
 * @see eu.lowcomote.keptn.slo.SloPackage#getObjectivePass()
 * @model
 * @generated
 */
public interface ObjectivePass extends ObjectivePropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Pass</b></em>' containment reference list.
	 * The list contents are of type {@link eu.lowcomote.keptn.slo.ObjectivePassItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pass</em>' containment reference list.
	 * @see eu.lowcomote.keptn.slo.SloPackage#getObjectivePass_Pass()
	 * @model containment="true"
	 * @generated
	 */
	EList<ObjectivePassItems> getPass();

} // ObjectivePass
