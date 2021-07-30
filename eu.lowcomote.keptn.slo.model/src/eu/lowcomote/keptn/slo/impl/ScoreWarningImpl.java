/**
 */
package eu.lowcomote.keptn.slo.impl;

import eu.lowcomote.keptn.slo.ScoreWarning;
import eu.lowcomote.keptn.slo.SloPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Score Warning</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.lowcomote.keptn.slo.impl.ScoreWarningImpl#getWarning <em>Warning</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScoreWarningImpl extends ScorePropertiesAbstractImpl implements ScoreWarning {
	/**
	 * The default value of the '{@link #getWarning() <em>Warning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarning()
	 * @generated
	 * @ordered
	 */
	protected static final String WARNING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWarning() <em>Warning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarning()
	 * @generated
	 * @ordered
	 */
	protected String warning = WARNING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScoreWarningImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SloPackage.Literals.SCORE_WARNING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWarning() {
		return warning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWarning(String newWarning) {
		String oldWarning = warning;
		warning = newWarning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SloPackage.SCORE_WARNING__WARNING, oldWarning, warning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SloPackage.SCORE_WARNING__WARNING:
				return getWarning();
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
			case SloPackage.SCORE_WARNING__WARNING:
				setWarning((String)newValue);
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
			case SloPackage.SCORE_WARNING__WARNING:
				setWarning(WARNING_EDEFAULT);
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
			case SloPackage.SCORE_WARNING__WARNING:
				return WARNING_EDEFAULT == null ? warning != null : !WARNING_EDEFAULT.equals(warning);
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
		result.append(" (warning: ");
		result.append(warning);
		result.append(')');
		return result.toString();
	}

} //ScoreWarningImpl
