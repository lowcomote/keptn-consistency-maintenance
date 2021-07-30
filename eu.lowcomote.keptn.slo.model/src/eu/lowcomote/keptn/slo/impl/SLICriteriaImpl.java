/**
 */
package eu.lowcomote.keptn.slo.impl;

import eu.lowcomote.keptn.slo.SLICriteria;
import eu.lowcomote.keptn.slo.SLICriteriaPropertiesAbstract;
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
 * An implementation of the model object '<em><b>SLI Criteria</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.lowcomote.keptn.slo.impl.SLICriteriaImpl#getSLICriteria <em>SLI Criteria</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SLICriteriaImpl extends MinimalEObjectImpl.Container implements SLICriteria {
	/**
	 * The cached value of the '{@link #getSLICriteria() <em>SLI Criteria</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSLICriteria()
	 * @generated
	 * @ordered
	 */
	protected EList<SLICriteriaPropertiesAbstract> sliCriteria;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SLICriteriaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SloPackage.Literals.SLI_CRITERIA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SLICriteriaPropertiesAbstract> getSLICriteria() {
		if (sliCriteria == null) {
			sliCriteria = new EObjectContainmentEList<SLICriteriaPropertiesAbstract>(SLICriteriaPropertiesAbstract.class, this, SloPackage.SLI_CRITERIA__SLI_CRITERIA);
		}
		return sliCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SloPackage.SLI_CRITERIA__SLI_CRITERIA:
				return ((InternalEList<?>)getSLICriteria()).basicRemove(otherEnd, msgs);
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
			case SloPackage.SLI_CRITERIA__SLI_CRITERIA:
				return getSLICriteria();
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
			case SloPackage.SLI_CRITERIA__SLI_CRITERIA:
				getSLICriteria().clear();
				getSLICriteria().addAll((Collection<? extends SLICriteriaPropertiesAbstract>)newValue);
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
			case SloPackage.SLI_CRITERIA__SLI_CRITERIA:
				getSLICriteria().clear();
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
			case SloPackage.SLI_CRITERIA__SLI_CRITERIA:
				return sliCriteria != null && !sliCriteria.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SLICriteriaImpl
