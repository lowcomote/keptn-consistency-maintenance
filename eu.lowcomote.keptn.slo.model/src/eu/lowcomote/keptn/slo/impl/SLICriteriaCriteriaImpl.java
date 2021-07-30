/**
 */
package eu.lowcomote.keptn.slo.impl;

import eu.lowcomote.keptn.slo.SLICriteriaCriteria;
import eu.lowcomote.keptn.slo.SLICriteriaCriteriaItems;
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
 * An implementation of the model object '<em><b>SLI Criteria Criteria</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.lowcomote.keptn.slo.impl.SLICriteriaCriteriaImpl#getCriteria <em>Criteria</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SLICriteriaCriteriaImpl extends SLICriteriaPropertiesAbstractImpl implements SLICriteriaCriteria {
	/**
	 * The cached value of the '{@link #getCriteria() <em>Criteria</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriteria()
	 * @generated
	 * @ordered
	 */
	protected EList<SLICriteriaCriteriaItems> criteria;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SLICriteriaCriteriaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SloPackage.Literals.SLI_CRITERIA_CRITERIA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SLICriteriaCriteriaItems> getCriteria() {
		if (criteria == null) {
			criteria = new EObjectContainmentEList<SLICriteriaCriteriaItems>(SLICriteriaCriteriaItems.class, this, SloPackage.SLI_CRITERIA_CRITERIA__CRITERIA);
		}
		return criteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SloPackage.SLI_CRITERIA_CRITERIA__CRITERIA:
				return ((InternalEList<?>)getCriteria()).basicRemove(otherEnd, msgs);
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
			case SloPackage.SLI_CRITERIA_CRITERIA__CRITERIA:
				return getCriteria();
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
			case SloPackage.SLI_CRITERIA_CRITERIA__CRITERIA:
				getCriteria().clear();
				getCriteria().addAll((Collection<? extends SLICriteriaCriteriaItems>)newValue);
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
			case SloPackage.SLI_CRITERIA_CRITERIA__CRITERIA:
				getCriteria().clear();
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
			case SloPackage.SLI_CRITERIA_CRITERIA__CRITERIA:
				return criteria != null && !criteria.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SLICriteriaCriteriaImpl
