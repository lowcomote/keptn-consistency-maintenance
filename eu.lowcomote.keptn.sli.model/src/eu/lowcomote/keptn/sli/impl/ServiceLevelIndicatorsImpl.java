/**
 */
package eu.lowcomote.keptn.sli.impl;

import eu.lowcomote.keptn.sli.ServiceLevelIndicators;
import eu.lowcomote.keptn.sli.ServiceLevelIndicatorsPropertiesAbstract;
import eu.lowcomote.keptn.sli.SliPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Level Indicators</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.lowcomote.keptn.sli.impl.ServiceLevelIndicatorsImpl#getServiceLevelIndicators <em>Service Level Indicators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceLevelIndicatorsImpl extends MinimalEObjectImpl.Container implements ServiceLevelIndicators {
	/**
	 * The cached value of the '{@link #getServiceLevelIndicators() <em>Service Level Indicators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceLevelIndicators()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceLevelIndicatorsPropertiesAbstract> serviceLevelIndicators;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceLevelIndicatorsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SliPackage.Literals.SERVICE_LEVEL_INDICATORS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceLevelIndicatorsPropertiesAbstract> getServiceLevelIndicators() {
		if (serviceLevelIndicators == null) {
			serviceLevelIndicators = new EObjectContainmentEList<ServiceLevelIndicatorsPropertiesAbstract>(ServiceLevelIndicatorsPropertiesAbstract.class, this, SliPackage.SERVICE_LEVEL_INDICATORS__SERVICE_LEVEL_INDICATORS);
		}
		return serviceLevelIndicators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SliPackage.SERVICE_LEVEL_INDICATORS__SERVICE_LEVEL_INDICATORS:
				return ((InternalEList<?>)getServiceLevelIndicators()).basicRemove(otherEnd, msgs);
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
			case SliPackage.SERVICE_LEVEL_INDICATORS__SERVICE_LEVEL_INDICATORS:
				return getServiceLevelIndicators();
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
			case SliPackage.SERVICE_LEVEL_INDICATORS__SERVICE_LEVEL_INDICATORS:
				getServiceLevelIndicators().clear();
				getServiceLevelIndicators().addAll((Collection<? extends ServiceLevelIndicatorsPropertiesAbstract>)newValue);
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
			case SliPackage.SERVICE_LEVEL_INDICATORS__SERVICE_LEVEL_INDICATORS:
				getServiceLevelIndicators().clear();
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
			case SliPackage.SERVICE_LEVEL_INDICATORS__SERVICE_LEVEL_INDICATORS:
				return serviceLevelIndicators != null && !serviceLevelIndicators.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServiceLevelIndicatorsImpl
