/**
 */
package eu.lowcomote.keptn.sli.impl;

import eu.lowcomote.keptn.sli.ServiceLevelIndicatorsSpec_version;
import eu.lowcomote.keptn.sli.SliPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Level Indicators Spec version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.lowcomote.keptn.sli.impl.ServiceLevelIndicatorsSpec_versionImpl#getSpec_version <em>Spec version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceLevelIndicatorsSpec_versionImpl extends ServiceLevelIndicatorsPropertiesAbstractImpl implements ServiceLevelIndicatorsSpec_version {
	/**
	 * The default value of the '{@link #getSpec_version() <em>Spec version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpec_version()
	 * @generated
	 * @ordered
	 */
	protected static final String SPEC_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpec_version() <em>Spec version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpec_version()
	 * @generated
	 * @ordered
	 */
	protected String spec_version = SPEC_VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceLevelIndicatorsSpec_versionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SliPackage.Literals.SERVICE_LEVEL_INDICATORS_SPEC_VERSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpec_version() {
		return spec_version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpec_version(String newSpec_version) {
		String oldSpec_version = spec_version;
		spec_version = newSpec_version;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SliPackage.SERVICE_LEVEL_INDICATORS_SPEC_VERSION__SPEC_VERSION, oldSpec_version, spec_version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SliPackage.SERVICE_LEVEL_INDICATORS_SPEC_VERSION__SPEC_VERSION:
				return getSpec_version();
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
			case SliPackage.SERVICE_LEVEL_INDICATORS_SPEC_VERSION__SPEC_VERSION:
				setSpec_version((String)newValue);
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
			case SliPackage.SERVICE_LEVEL_INDICATORS_SPEC_VERSION__SPEC_VERSION:
				setSpec_version(SPEC_VERSION_EDEFAULT);
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
			case SliPackage.SERVICE_LEVEL_INDICATORS_SPEC_VERSION__SPEC_VERSION:
				return SPEC_VERSION_EDEFAULT == null ? spec_version != null : !SPEC_VERSION_EDEFAULT.equals(spec_version);
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
		result.append(" (spec_version: ");
		result.append(spec_version);
		result.append(')');
		return result.toString();
	}

} //ServiceLevelIndicatorsSpec_versionImpl
