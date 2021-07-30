/**
 */
package eu.lowcomote.keptn.sli.impl;

import eu.lowcomote.keptn.sli.ServiceLevelIndicatorsIndicatorsPatternProperties0;
import eu.lowcomote.keptn.sli.SliPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Level Indicators Indicators Pattern Properties0</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.lowcomote.keptn.sli.impl.ServiceLevelIndicatorsIndicatorsPatternProperties0Impl#getKey <em>Key</em>}</li>
 *   <li>{@link eu.lowcomote.keptn.sli.impl.ServiceLevelIndicatorsIndicatorsPatternProperties0Impl#getPatternProperties0 <em>Pattern Properties0</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceLevelIndicatorsIndicatorsPatternProperties0Impl extends ServiceLevelIndicatorsIndicatorsPropertiesAbstractImpl implements ServiceLevelIndicatorsIndicatorsPatternProperties0 {
	/**
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected String key = KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPatternProperties0() <em>Pattern Properties0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternProperties0()
	 * @generated
	 * @ordered
	 */
	protected static final String PATTERN_PROPERTIES0_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPatternProperties0() <em>Pattern Properties0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternProperties0()
	 * @generated
	 * @ordered
	 */
	protected String patternProperties0 = PATTERN_PROPERTIES0_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceLevelIndicatorsIndicatorsPatternProperties0Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SliPackage.Literals.SERVICE_LEVEL_INDICATORS_INDICATORS_PATTERN_PROPERTIES0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(String newKey) {
		String oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SliPackage.SERVICE_LEVEL_INDICATORS_INDICATORS_PATTERN_PROPERTIES0__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPatternProperties0() {
		return patternProperties0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatternProperties0(String newPatternProperties0) {
		String oldPatternProperties0 = patternProperties0;
		patternProperties0 = newPatternProperties0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SliPackage.SERVICE_LEVEL_INDICATORS_INDICATORS_PATTERN_PROPERTIES0__PATTERN_PROPERTIES0, oldPatternProperties0, patternProperties0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SliPackage.SERVICE_LEVEL_INDICATORS_INDICATORS_PATTERN_PROPERTIES0__KEY:
				return getKey();
			case SliPackage.SERVICE_LEVEL_INDICATORS_INDICATORS_PATTERN_PROPERTIES0__PATTERN_PROPERTIES0:
				return getPatternProperties0();
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
			case SliPackage.SERVICE_LEVEL_INDICATORS_INDICATORS_PATTERN_PROPERTIES0__KEY:
				setKey((String)newValue);
				return;
			case SliPackage.SERVICE_LEVEL_INDICATORS_INDICATORS_PATTERN_PROPERTIES0__PATTERN_PROPERTIES0:
				setPatternProperties0((String)newValue);
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
			case SliPackage.SERVICE_LEVEL_INDICATORS_INDICATORS_PATTERN_PROPERTIES0__KEY:
				setKey(KEY_EDEFAULT);
				return;
			case SliPackage.SERVICE_LEVEL_INDICATORS_INDICATORS_PATTERN_PROPERTIES0__PATTERN_PROPERTIES0:
				setPatternProperties0(PATTERN_PROPERTIES0_EDEFAULT);
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
			case SliPackage.SERVICE_LEVEL_INDICATORS_INDICATORS_PATTERN_PROPERTIES0__KEY:
				return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
			case SliPackage.SERVICE_LEVEL_INDICATORS_INDICATORS_PATTERN_PROPERTIES0__PATTERN_PROPERTIES0:
				return PATTERN_PROPERTIES0_EDEFAULT == null ? patternProperties0 != null : !PATTERN_PROPERTIES0_EDEFAULT.equals(patternProperties0);
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
		result.append(" (key: ");
		result.append(key);
		result.append(", patternProperties0: ");
		result.append(patternProperties0);
		result.append(')');
		return result.toString();
	}

} //ServiceLevelIndicatorsIndicatorsPatternProperties0Impl
