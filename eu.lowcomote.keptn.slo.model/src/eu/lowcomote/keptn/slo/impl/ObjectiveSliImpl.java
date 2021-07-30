/**
 */
package eu.lowcomote.keptn.slo.impl;

import eu.lowcomote.keptn.slo.ObjectiveSli;
import eu.lowcomote.keptn.slo.SloPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Objective Sli</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.lowcomote.keptn.slo.impl.ObjectiveSliImpl#getSli <em>Sli</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectiveSliImpl extends ObjectivePropertiesAbstractImpl implements ObjectiveSli {
	/**
	 * The default value of the '{@link #getSli() <em>Sli</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSli()
	 * @generated
	 * @ordered
	 */
	protected static final String SLI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSli() <em>Sli</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSli()
	 * @generated
	 * @ordered
	 */
	protected String sli = SLI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectiveSliImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SloPackage.Literals.OBJECTIVE_SLI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSli() {
		return sli;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSli(String newSli) {
		String oldSli = sli;
		sli = newSli;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SloPackage.OBJECTIVE_SLI__SLI, oldSli, sli));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SloPackage.OBJECTIVE_SLI__SLI:
				return getSli();
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
			case SloPackage.OBJECTIVE_SLI__SLI:
				setSli((String)newValue);
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
			case SloPackage.OBJECTIVE_SLI__SLI:
				setSli(SLI_EDEFAULT);
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
			case SloPackage.OBJECTIVE_SLI__SLI:
				return SLI_EDEFAULT == null ? sli != null : !SLI_EDEFAULT.equals(sli);
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
		result.append(" (sli: ");
		result.append(sli);
		result.append(')');
		return result.toString();
	}

} //ObjectiveSliImpl
