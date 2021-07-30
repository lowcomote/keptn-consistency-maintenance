/**
 */
package eu.lowcomote.keptn.slo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Score</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.lowcomote.keptn.slo.Score#getScore <em>Score</em>}</li>
 * </ul>
 *
 * @see eu.lowcomote.keptn.slo.SloPackage#getScore()
 * @model
 * @generated
 */
public interface Score extends EObject {
	/**
	 * Returns the value of the '<em><b>Score</b></em>' containment reference list.
	 * The list contents are of type {@link eu.lowcomote.keptn.slo.ScorePropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Score</em>' containment reference list.
	 * @see eu.lowcomote.keptn.slo.SloPackage#getScore_Score()
	 * @model containment="true"
	 * @generated
	 */
	EList<ScorePropertiesAbstract> getScore();

} // Score
