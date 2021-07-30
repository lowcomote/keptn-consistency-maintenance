/**
 */
package eu.lowcomote.keptn.slo.impl;

import eu.lowcomote.keptn.slo.ObjectiveWarning;
import eu.lowcomote.keptn.slo.ObjectiveWarningItems;
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
 * An implementation of the model object '<em><b>Objective Warning</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.lowcomote.keptn.slo.impl.ObjectiveWarningImpl#getWarning <em>Warning</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectiveWarningImpl extends ObjectivePropertiesAbstractImpl implements ObjectiveWarning {
	/**
	 * The cached value of the '{@link #getWarning() <em>Warning</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarning()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectiveWarningItems> warning;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectiveWarningImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SloPackage.Literals.OBJECTIVE_WARNING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectiveWarningItems> getWarning() {
		if (warning == null) {
			warning = new EObjectContainmentEList<ObjectiveWarningItems>(ObjectiveWarningItems.class, this, SloPackage.OBJECTIVE_WARNING__WARNING);
		}
		return warning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SloPackage.OBJECTIVE_WARNING__WARNING:
				return ((InternalEList<?>)getWarning()).basicRemove(otherEnd, msgs);
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
			case SloPackage.OBJECTIVE_WARNING__WARNING:
				return getWarning();
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
			case SloPackage.OBJECTIVE_WARNING__WARNING:
				getWarning().clear();
				getWarning().addAll((Collection<? extends ObjectiveWarningItems>)newValue);
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
			case SloPackage.OBJECTIVE_WARNING__WARNING:
				getWarning().clear();
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
			case SloPackage.OBJECTIVE_WARNING__WARNING:
				return warning != null && !warning.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ObjectiveWarningImpl
