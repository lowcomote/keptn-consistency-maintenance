/**
 */
package eu.lowcomote.keptn.slo.impl;

import eu.lowcomote.keptn.slo.ComparisonNumber_of_comparison_results;
import eu.lowcomote.keptn.slo.SloPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comparison Number of comparison results</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.lowcomote.keptn.slo.impl.ComparisonNumber_of_comparison_resultsImpl#getNumber_of_comparison_results <em>Number of comparison results</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComparisonNumber_of_comparison_resultsImpl extends ComparisonPropertiesAbstractImpl implements ComparisonNumber_of_comparison_results {
	/**
	 * The default value of the '{@link #getNumber_of_comparison_results() <em>Number of comparison results</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber_of_comparison_results()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_COMPARISON_RESULTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumber_of_comparison_results() <em>Number of comparison results</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber_of_comparison_results()
	 * @generated
	 * @ordered
	 */
	protected int number_of_comparison_results = NUMBER_OF_COMPARISON_RESULTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComparisonNumber_of_comparison_resultsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SloPackage.Literals.COMPARISON_NUMBER_OF_COMPARISON_RESULTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumber_of_comparison_results() {
		return number_of_comparison_results;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber_of_comparison_results(int newNumber_of_comparison_results) {
		int oldNumber_of_comparison_results = number_of_comparison_results;
		number_of_comparison_results = newNumber_of_comparison_results;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SloPackage.COMPARISON_NUMBER_OF_COMPARISON_RESULTS__NUMBER_OF_COMPARISON_RESULTS, oldNumber_of_comparison_results, number_of_comparison_results));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SloPackage.COMPARISON_NUMBER_OF_COMPARISON_RESULTS__NUMBER_OF_COMPARISON_RESULTS:
				return getNumber_of_comparison_results();
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
			case SloPackage.COMPARISON_NUMBER_OF_COMPARISON_RESULTS__NUMBER_OF_COMPARISON_RESULTS:
				setNumber_of_comparison_results((Integer)newValue);
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
			case SloPackage.COMPARISON_NUMBER_OF_COMPARISON_RESULTS__NUMBER_OF_COMPARISON_RESULTS:
				setNumber_of_comparison_results(NUMBER_OF_COMPARISON_RESULTS_EDEFAULT);
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
			case SloPackage.COMPARISON_NUMBER_OF_COMPARISON_RESULTS__NUMBER_OF_COMPARISON_RESULTS:
				return number_of_comparison_results != NUMBER_OF_COMPARISON_RESULTS_EDEFAULT;
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
		result.append(" (number_of_comparison_results: ");
		result.append(number_of_comparison_results);
		result.append(')');
		return result.toString();
	}

} //ComparisonNumber_of_comparison_resultsImpl
