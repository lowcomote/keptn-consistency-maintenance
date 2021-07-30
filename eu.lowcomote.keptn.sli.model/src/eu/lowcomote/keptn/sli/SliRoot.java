/**
 */
package eu.lowcomote.keptn.sli;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.lowcomote.keptn.sli.SliRoot#getSliRoot <em>Sli Root</em>}</li>
 * </ul>
 *
 * @see eu.lowcomote.keptn.sli.SliPackage#getSliRoot()
 * @model
 * @generated
 */
public interface SliRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Sli Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sli Root</em>' containment reference.
	 * @see #setSliRoot(ServiceLevelIndicators)
	 * @see eu.lowcomote.keptn.sli.SliPackage#getSliRoot_SliRoot()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ServiceLevelIndicators getSliRoot();

	/**
	 * Sets the value of the '{@link eu.lowcomote.keptn.sli.SliRoot#getSliRoot <em>Sli Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sli Root</em>' containment reference.
	 * @see #getSliRoot()
	 * @generated
	 */
	void setSliRoot(ServiceLevelIndicators value);

} // SliRoot
