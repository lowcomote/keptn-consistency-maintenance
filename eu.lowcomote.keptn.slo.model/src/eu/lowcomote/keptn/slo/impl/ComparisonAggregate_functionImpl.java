/**
 */
package eu.lowcomote.keptn.slo.impl;

import eu.lowcomote.keptn.slo.ComparisonAggregate_function;
import eu.lowcomote.keptn.slo.SloPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comparison Aggregate function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.lowcomote.keptn.slo.impl.ComparisonAggregate_functionImpl#getAggregate_function <em>Aggregate function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComparisonAggregate_functionImpl extends ComparisonPropertiesAbstractImpl implements ComparisonAggregate_function {
	/**
	 * The default value of the '{@link #getAggregate_function() <em>Aggregate function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregate_function()
	 * @generated
	 * @ordered
	 */
	protected static final String AGGREGATE_FUNCTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAggregate_function() <em>Aggregate function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregate_function()
	 * @generated
	 * @ordered
	 */
	protected String aggregate_function = AGGREGATE_FUNCTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComparisonAggregate_functionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SloPackage.Literals.COMPARISON_AGGREGATE_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAggregate_function() {
		return aggregate_function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregate_function(String newAggregate_function) {
		String oldAggregate_function = aggregate_function;
		aggregate_function = newAggregate_function;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SloPackage.COMPARISON_AGGREGATE_FUNCTION__AGGREGATE_FUNCTION, oldAggregate_function, aggregate_function));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SloPackage.COMPARISON_AGGREGATE_FUNCTION__AGGREGATE_FUNCTION:
				return getAggregate_function();
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
			case SloPackage.COMPARISON_AGGREGATE_FUNCTION__AGGREGATE_FUNCTION:
				setAggregate_function((String)newValue);
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
			case SloPackage.COMPARISON_AGGREGATE_FUNCTION__AGGREGATE_FUNCTION:
				setAggregate_function(AGGREGATE_FUNCTION_EDEFAULT);
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
			case SloPackage.COMPARISON_AGGREGATE_FUNCTION__AGGREGATE_FUNCTION:
				return AGGREGATE_FUNCTION_EDEFAULT == null ? aggregate_function != null : !AGGREGATE_FUNCTION_EDEFAULT.equals(aggregate_function);
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
		result.append(" (aggregate_function: ");
		result.append(aggregate_function);
		result.append(')');
		return result.toString();
	}

} //ComparisonAggregate_functionImpl
