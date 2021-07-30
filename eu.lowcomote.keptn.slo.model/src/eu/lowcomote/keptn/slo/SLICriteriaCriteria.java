/**
 */
package eu.lowcomote.keptn.slo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SLI Criteria Criteria</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.lowcomote.keptn.slo.SLICriteriaCriteria#getCriteria <em>Criteria</em>}</li>
 * </ul>
 *
 * @see eu.lowcomote.keptn.slo.SloPackage#getSLICriteriaCriteria()
 * @model
 * @generated
 */
public interface SLICriteriaCriteria extends SLICriteriaPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Criteria</b></em>' containment reference list.
	 * The list contents are of type {@link eu.lowcomote.keptn.slo.SLICriteriaCriteriaItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criteria</em>' containment reference list.
	 * @see eu.lowcomote.keptn.slo.SloPackage#getSLICriteriaCriteria_Criteria()
	 * @model containment="true"
	 * @generated
	 */
	EList<SLICriteriaCriteriaItems> getCriteria();

} // SLICriteriaCriteria
