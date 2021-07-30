/**
 */
package eu.lowcomote.keptn.slo.impl;

import eu.lowcomote.keptn.slo.ComparisonCompare_with;
import eu.lowcomote.keptn.slo.SloPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comparison Compare with</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.lowcomote.keptn.slo.impl.ComparisonCompare_withImpl#getCompare_with <em>Compare with</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComparisonCompare_withImpl extends ComparisonPropertiesAbstractImpl implements ComparisonCompare_with {
	/**
	 * The default value of the '{@link #getCompare_with() <em>Compare with</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompare_with()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPARE_WITH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompare_with() <em>Compare with</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompare_with()
	 * @generated
	 * @ordered
	 */
	protected String compare_with = COMPARE_WITH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComparisonCompare_withImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SloPackage.Literals.COMPARISON_COMPARE_WITH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompare_with() {
		return compare_with;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompare_with(String newCompare_with) {
		String oldCompare_with = compare_with;
		compare_with = newCompare_with;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SloPackage.COMPARISON_COMPARE_WITH__COMPARE_WITH, oldCompare_with, compare_with));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SloPackage.COMPARISON_COMPARE_WITH__COMPARE_WITH:
				return getCompare_with();
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
			case SloPackage.COMPARISON_COMPARE_WITH__COMPARE_WITH:
				setCompare_with((String)newValue);
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
			case SloPackage.COMPARISON_COMPARE_WITH__COMPARE_WITH:
				setCompare_with(COMPARE_WITH_EDEFAULT);
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
			case SloPackage.COMPARISON_COMPARE_WITH__COMPARE_WITH:
				return COMPARE_WITH_EDEFAULT == null ? compare_with != null : !COMPARE_WITH_EDEFAULT.equals(compare_with);
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
		result.append(" (compare_with: ");
		result.append(compare_with);
		result.append(')');
		return result.toString();
	}

} //ComparisonCompare_withImpl
