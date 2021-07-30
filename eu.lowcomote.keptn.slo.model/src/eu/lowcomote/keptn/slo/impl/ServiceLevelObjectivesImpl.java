/**
 */
package eu.lowcomote.keptn.slo.impl;

import eu.lowcomote.keptn.slo.ServiceLevelObjectives;
import eu.lowcomote.keptn.slo.ServiceLevelObjectivesPropertiesAbstract;
import eu.lowcomote.keptn.slo.SloPackage;

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
 * An implementation of the model object '<em><b>Service Level Objectives</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.lowcomote.keptn.slo.impl.ServiceLevelObjectivesImpl#getServiceLevelObjectives <em>Service Level Objectives</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceLevelObjectivesImpl extends MinimalEObjectImpl.Container implements ServiceLevelObjectives {
	/**
	 * The cached value of the '{@link #getServiceLevelObjectives() <em>Service Level Objectives</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceLevelObjectives()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceLevelObjectivesPropertiesAbstract> serviceLevelObjectives;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceLevelObjectivesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SloPackage.Literals.SERVICE_LEVEL_OBJECTIVES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceLevelObjectivesPropertiesAbstract> getServiceLevelObjectives() {
		if (serviceLevelObjectives == null) {
			serviceLevelObjectives = new EObjectContainmentEList<ServiceLevelObjectivesPropertiesAbstract>(ServiceLevelObjectivesPropertiesAbstract.class, this, SloPackage.SERVICE_LEVEL_OBJECTIVES__SERVICE_LEVEL_OBJECTIVES);
		}
		return serviceLevelObjectives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SloPackage.SERVICE_LEVEL_OBJECTIVES__SERVICE_LEVEL_OBJECTIVES:
				return ((InternalEList<?>)getServiceLevelObjectives()).basicRemove(otherEnd, msgs);
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
			case SloPackage.SERVICE_LEVEL_OBJECTIVES__SERVICE_LEVEL_OBJECTIVES:
				return getServiceLevelObjectives();
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
			case SloPackage.SERVICE_LEVEL_OBJECTIVES__SERVICE_LEVEL_OBJECTIVES:
				getServiceLevelObjectives().clear();
				getServiceLevelObjectives().addAll((Collection<? extends ServiceLevelObjectivesPropertiesAbstract>)newValue);
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
			case SloPackage.SERVICE_LEVEL_OBJECTIVES__SERVICE_LEVEL_OBJECTIVES:
				getServiceLevelObjectives().clear();
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
			case SloPackage.SERVICE_LEVEL_OBJECTIVES__SERVICE_LEVEL_OBJECTIVES:
				return serviceLevelObjectives != null && !serviceLevelObjectives.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServiceLevelObjectivesImpl
