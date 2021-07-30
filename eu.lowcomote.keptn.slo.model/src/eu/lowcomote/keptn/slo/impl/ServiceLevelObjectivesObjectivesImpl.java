/**
 */
package eu.lowcomote.keptn.slo.impl;

import eu.lowcomote.keptn.slo.ServiceLevelObjectivesObjectives;
import eu.lowcomote.keptn.slo.ServiceLevelObjectivesObjectivesItems;
import eu.lowcomote.keptn.slo.SloPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Level Objectives Objectives</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.lowcomote.keptn.slo.impl.ServiceLevelObjectivesObjectivesImpl#getObjectives <em>Objectives</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceLevelObjectivesObjectivesImpl extends ServiceLevelObjectivesPropertiesAbstractImpl implements ServiceLevelObjectivesObjectives {
	/**
	 * The cached value of the '{@link #getObjectives() <em>Objectives</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectives()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceLevelObjectivesObjectivesItems> objectives;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceLevelObjectivesObjectivesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SloPackage.Literals.SERVICE_LEVEL_OBJECTIVES_OBJECTIVES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceLevelObjectivesObjectivesItems> getObjectives() {
		if (objectives == null) {
			objectives = new EObjectContainmentEList<ServiceLevelObjectivesObjectivesItems>(ServiceLevelObjectivesObjectivesItems.class, this, SloPackage.SERVICE_LEVEL_OBJECTIVES_OBJECTIVES__OBJECTIVES);
		}
		return objectives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SloPackage.SERVICE_LEVEL_OBJECTIVES_OBJECTIVES__OBJECTIVES:
				return ((InternalEList<?>)getObjectives()).basicRemove(otherEnd, msgs);
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
			case SloPackage.SERVICE_LEVEL_OBJECTIVES_OBJECTIVES__OBJECTIVES:
				return getObjectives();
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
			case SloPackage.SERVICE_LEVEL_OBJECTIVES_OBJECTIVES__OBJECTIVES:
				getObjectives().clear();
				getObjectives().addAll((Collection<? extends ServiceLevelObjectivesObjectivesItems>)newValue);
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
			case SloPackage.SERVICE_LEVEL_OBJECTIVES_OBJECTIVES__OBJECTIVES:
				getObjectives().clear();
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
			case SloPackage.SERVICE_LEVEL_OBJECTIVES_OBJECTIVES__OBJECTIVES:
				return objectives != null && !objectives.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServiceLevelObjectivesObjectivesImpl
