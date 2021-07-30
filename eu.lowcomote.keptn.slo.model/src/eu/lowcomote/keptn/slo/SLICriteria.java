/**
 */
package eu.lowcomote.keptn.slo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SLI Criteria</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.lowcomote.keptn.slo.SLICriteria#getSLICriteria <em>SLI Criteria</em>}</li>
 * </ul>
 *
 * @see eu.lowcomote.keptn.slo.SloPackage#getSLICriteria()
 * @model
 * @generated
 */
public interface SLICriteria extends EObject {
	/**
	 * Returns the value of the '<em><b>SLI Criteria</b></em>' containment reference list.
	 * The list contents are of type {@link eu.lowcomote.keptn.slo.SLICriteriaPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SLI Criteria</em>' containment reference list.
	 * @see eu.lowcomote.keptn.slo.SloPackage#getSLICriteria_SLICriteria()
	 * @model containment="true"
	 * @generated
	 */
	EList<SLICriteriaPropertiesAbstract> getSLICriteria();

} // SLICriteria
