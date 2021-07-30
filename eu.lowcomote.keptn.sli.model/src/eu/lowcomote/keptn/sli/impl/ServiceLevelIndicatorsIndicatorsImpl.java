/**
 */
package eu.lowcomote.keptn.sli.impl;

import eu.lowcomote.keptn.sli.ServiceLevelIndicatorsIndicators;
import eu.lowcomote.keptn.sli.ServiceLevelIndicatorsIndicatorsPropertiesAbstract;
import eu.lowcomote.keptn.sli.SliPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Level Indicators Indicators</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.lowcomote.keptn.sli.impl.ServiceLevelIndicatorsIndicatorsImpl#getIndicators <em>Indicators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceLevelIndicatorsIndicatorsImpl extends ServiceLevelIndicatorsPropertiesAbstractImpl implements ServiceLevelIndicatorsIndicators {
	/**
	 * The cached value of the '{@link #getIndicators() <em>Indicators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndicators()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceLevelIndicatorsIndicatorsPropertiesAbstract> indicators;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceLevelIndicatorsIndicatorsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SliPackage.Literals.SERVICE_LEVEL_INDICATORS_INDICATORS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceLevelIndicatorsIndicatorsPropertiesAbstract> getIndicators() {
		if (indicators == null) {
			indicators = new EObjectContainmentEList<ServiceLevelIndicatorsIndicatorsPropertiesAbstract>(ServiceLevelIndicatorsIndicatorsPropertiesAbstract.class, this, SliPackage.SERVICE_LEVEL_INDICATORS_INDICATORS__INDICATORS);
		}
		return indicators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SliPackage.SERVICE_LEVEL_INDICATORS_INDICATORS__INDICATORS:
				return ((InternalEList<?>)getIndicators()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SliPackage.SERVICE_LEVEL_INDICATORS_INDICATORS__INDICATORS:
				return getIndicators();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SliPackage.SERVICE_LEVEL_INDICATORS_INDICATORS__INDICATORS:
				getIndicators().clear();
				getIndicators().addAll((Collection<? extends ServiceLevelIndicatorsIndicatorsPropertiesAbstract>)newValue);
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
			case SliPackage.SERVICE_LEVEL_INDICATORS_INDICATORS__INDICATORS:
				getIndicators().clear();
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
			case SliPackage.SERVICE_LEVEL_INDICATORS_INDICATORS__INDICATORS:
				return indicators != null && !indicators.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServiceLevelIndicatorsIndicatorsImpl
