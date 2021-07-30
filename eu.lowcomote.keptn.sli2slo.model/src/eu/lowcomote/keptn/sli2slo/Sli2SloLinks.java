/**
 */
package eu.lowcomote.keptn.sli2slo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sli2 Slo Links</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.lowcomote.keptn.sli2slo.Sli2SloLinks#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @see eu.lowcomote.keptn.sli2slo.Sli2sloPackage#getSli2SloLinks()
 * @model
 * @generated
 */
public interface Sli2SloLinks extends EObject {
	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link eu.lowcomote.keptn.sli2slo.Sli2SloLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see eu.lowcomote.keptn.sli2slo.Sli2sloPackage#getSli2SloLinks_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sli2SloLink> getLinks();

} // Sli2SloLinks
