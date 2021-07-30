/**
 */
package eu.lowcomote.keptn.slo.impl;

import eu.lowcomote.keptn.slo.ServiceLevelObjectivesFilter;
import eu.lowcomote.keptn.slo.ServiceLevelObjectivesFilterPropertiesAbstract;
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
 * An implementation of the model object '<em><b>Service Level Objectives Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.lowcomote.keptn.slo.impl.ServiceLevelObjectivesFilterImpl#getFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceLevelObjectivesFilterImpl extends ServiceLevelObjectivesPropertiesAbstractImpl implements ServiceLevelObjectivesFilter {
	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceLevelObjectivesFilterPropertiesAbstract> filter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceLevelObjectivesFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SloPackage.Literals.SERVICE_LEVEL_OBJECTIVES_FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceLevelObjectivesFilterPropertiesAbstract> getFilter() {
		if (filter == null) {
			filter = new EObjectContainmentEList<ServiceLevelObjectivesFilterPropertiesAbstract>(ServiceLevelObjectivesFilterPropertiesAbstract.class, this, SloPackage.SERVICE_LEVEL_OBJECTIVES_FILTER__FILTER);
		}
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SloPackage.SERVICE_LEVEL_OBJECTIVES_FILTER__FILTER:
				return ((InternalEList<?>)getFilter()).basicRemove(otherEnd, msgs);
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
			case SloPackage.SERVICE_LEVEL_OBJECTIVES_FILTER__FILTER:
				return getFilter();
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
			case SloPackage.SERVICE_LEVEL_OBJECTIVES_FILTER__FILTER:
				getFilter().clear();
				getFilter().addAll((Collection<? extends ServiceLevelObjectivesFilterPropertiesAbstract>)newValue);
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
			case SloPackage.SERVICE_LEVEL_OBJECTIVES_FILTER__FILTER:
				getFilter().clear();
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
			case SloPackage.SERVICE_LEVEL_OBJECTIVES_FILTER__FILTER:
				return filter != null && !filter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServiceLevelObjectivesFilterImpl
