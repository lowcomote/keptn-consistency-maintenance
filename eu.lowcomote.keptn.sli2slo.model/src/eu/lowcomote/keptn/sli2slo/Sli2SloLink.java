/**
 */
package eu.lowcomote.keptn.sli2slo;

import eu.lowcomote.keptn.sli.SliRoot;

import eu.lowcomote.keptn.slo.SloRoot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sli2 Slo Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.lowcomote.keptn.sli2slo.Sli2SloLink#getSli <em>Sli</em>}</li>
 *   <li>{@link eu.lowcomote.keptn.sli2slo.Sli2SloLink#getSlo <em>Slo</em>}</li>
 * </ul>
 *
 * @see eu.lowcomote.keptn.sli2slo.Sli2sloPackage#getSli2SloLink()
 * @model
 * @generated
 */
public interface Sli2SloLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Sli</b></em>' reference list.
	 * The list contents are of type {@link eu.lowcomote.keptn.sli.SliRoot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sli</em>' reference list.
	 * @see eu.lowcomote.keptn.sli2slo.Sli2sloPackage#getSli2SloLink_Sli()
	 * @model required="true"
	 * @generated
	 */
	EList<SliRoot> getSli();

	/**
	 * Returns the value of the '<em><b>Slo</b></em>' reference list.
	 * The list contents are of type {@link eu.lowcomote.keptn.slo.SloRoot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slo</em>' reference list.
	 * @see eu.lowcomote.keptn.sli2slo.Sli2sloPackage#getSli2SloLink_Slo()
	 * @model required="true"
	 * @generated
	 */
	EList<SloRoot> getSlo();

} // Sli2SloLink
