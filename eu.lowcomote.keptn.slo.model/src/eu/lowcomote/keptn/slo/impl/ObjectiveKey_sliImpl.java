/**
 */
package eu.lowcomote.keptn.slo.impl;

import eu.lowcomote.keptn.slo.ObjectiveKey_sli;
import eu.lowcomote.keptn.slo.SloPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Objective Key sli</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.lowcomote.keptn.slo.impl.ObjectiveKey_sliImpl#isKey_sli <em>Key sli</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectiveKey_sliImpl extends ObjectivePropertiesAbstractImpl implements ObjectiveKey_sli {
	/**
	 * The default value of the '{@link #isKey_sli() <em>Key sli</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKey_sli()
	 * @generated
	 * @ordered
	 */
	protected static final boolean KEY_SLI_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isKey_sli() <em>Key sli</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKey_sli()
	 * @generated
	 * @ordered
	 */
	protected boolean key_sli = KEY_SLI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectiveKey_sliImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SloPackage.Literals.OBJECTIVE_KEY_SLI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isKey_sli() {
		return key_sli;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey_sli(boolean newKey_sli) {
		boolean oldKey_sli = key_sli;
		key_sli = newKey_sli;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SloPackage.OBJECTIVE_KEY_SLI__KEY_SLI, oldKey_sli, key_sli));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SloPackage.OBJECTIVE_KEY_SLI__KEY_SLI:
				return isKey_sli();
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
			case SloPackage.OBJECTIVE_KEY_SLI__KEY_SLI:
				setKey_sli((Boolean)newValue);
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
			case SloPackage.OBJECTIVE_KEY_SLI__KEY_SLI:
				setKey_sli(KEY_SLI_EDEFAULT);
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
			case SloPackage.OBJECTIVE_KEY_SLI__KEY_SLI:
				return key_sli != KEY_SLI_EDEFAULT;
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
		result.append(" (key_sli: ");
		result.append(key_sli);
		result.append(')');
		return result.toString();
	}

} //ObjectiveKey_sliImpl
