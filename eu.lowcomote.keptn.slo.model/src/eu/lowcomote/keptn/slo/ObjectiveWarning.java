/**
 */
package eu.lowcomote.keptn.slo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Objective Warning</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.lowcomote.keptn.slo.ObjectiveWarning#getWarning <em>Warning</em>}</li>
 * </ul>
 *
 * @see eu.lowcomote.keptn.slo.SloPackage#getObjectiveWarning()
 * @model
 * @generated
 */
public interface ObjectiveWarning extends ObjectivePropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Warning</b></em>' containment reference list.
	 * The list contents are of type {@link eu.lowcomote.keptn.slo.ObjectiveWarningItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warning</em>' containment reference list.
	 * @see eu.lowcomote.keptn.slo.SloPackage#getObjectiveWarning_Warning()
	 * @model containment="true"
	 * @generated
	 */
	EList<ObjectiveWarningItems> getWarning();

} // ObjectiveWarning
