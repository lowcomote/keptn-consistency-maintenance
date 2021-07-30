/**
 */
package eu.lowcomote.keptn.slo.impl;

import eu.lowcomote.keptn.slo.ComparisonInclude_result_with_score;
import eu.lowcomote.keptn.slo.SloPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comparison Include result with score</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.lowcomote.keptn.slo.impl.ComparisonInclude_result_with_scoreImpl#getInclude_result_with_score <em>Include result with score</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComparisonInclude_result_with_scoreImpl extends ComparisonPropertiesAbstractImpl implements ComparisonInclude_result_with_score {
	/**
	 * The default value of the '{@link #getInclude_result_with_score() <em>Include result with score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclude_result_with_score()
	 * @generated
	 * @ordered
	 */
	protected static final String INCLUDE_RESULT_WITH_SCORE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInclude_result_with_score() <em>Include result with score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclude_result_with_score()
	 * @generated
	 * @ordered
	 */
	protected String include_result_with_score = INCLUDE_RESULT_WITH_SCORE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComparisonInclude_result_with_scoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SloPackage.Literals.COMPARISON_INCLUDE_RESULT_WITH_SCORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInclude_result_with_score() {
		return include_result_with_score;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInclude_result_with_score(String newInclude_result_with_score) {
		String oldInclude_result_with_score = include_result_with_score;
		include_result_with_score = newInclude_result_with_score;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SloPackage.COMPARISON_INCLUDE_RESULT_WITH_SCORE__INCLUDE_RESULT_WITH_SCORE, oldInclude_result_with_score, include_result_with_score));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SloPackage.COMPARISON_INCLUDE_RESULT_WITH_SCORE__INCLUDE_RESULT_WITH_SCORE:
				return getInclude_result_with_score();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SloPackage.COMPARISON_INCLUDE_RESULT_WITH_SCORE__INCLUDE_RESULT_WITH_SCORE:
				setInclude_result_with_score((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SloPackage.COMPARISON_INCLUDE_RESULT_WITH_SCORE__INCLUDE_RESULT_WITH_SCORE:
				setInclude_result_with_score(INCLUDE_RESULT_WITH_SCORE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SloPackage.COMPARISON_INCLUDE_RESULT_WITH_SCORE__INCLUDE_RESULT_WITH_SCORE:
				return INCLUDE_RESULT_WITH_SCORE_EDEFAULT == null ? include_result_with_score != null : !INCLUDE_RESULT_WITH_SCORE_EDEFAULT.equals(include_result_with_score);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (include_result_with_score: ");
		result.append(include_result_with_score);
		result.append(')');
		return result.toString();
	}

} //ComparisonInclude_result_with_scoreImpl
