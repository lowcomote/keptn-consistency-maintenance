/**
 */
package eu.lowcomote.keptn.slo.impl;

import eu.lowcomote.keptn.slo.ServiceLevelObjectives;
import eu.lowcomote.keptn.slo.SloPackage;
import eu.lowcomote.keptn.slo.SloRoot;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.lowcomote.keptn.slo.impl.SloRootImpl#getSloRoot <em>Slo Root</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SloRootImpl extends MinimalEObjectImpl.Container implements SloRoot {
	/**
	 * The cached value of the '{@link #getSloRoot() <em>Slo Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSloRoot()
	 * @generated
	 * @ordered
	 */
	protected ServiceLevelObjectives sloRoot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SloRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SloPackage.Literals.SLO_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceLevelObjectives getSloRoot() {
		return sloRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSloRoot(ServiceLevelObjectives newSloRoot, NotificationChain msgs) {
		ServiceLevelObjectives oldSloRoot = sloRoot;
		sloRoot = newSloRoot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SloPackage.SLO_ROOT__SLO_ROOT, oldSloRoot, newSloRoot);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSloRoot(ServiceLevelObjectives newSloRoot) {
		if (newSloRoot != sloRoot) {
			NotificationChain msgs = null;
			if (sloRoot != null)
				msgs = ((InternalEObject)sloRoot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SloPackage.SLO_ROOT__SLO_ROOT, null, msgs);
			if (newSloRoot != null)
				msgs = ((InternalEObject)newSloRoot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SloPackage.SLO_ROOT__SLO_ROOT, null, msgs);
			msgs = basicSetSloRoot(newSloRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SloPackage.SLO_ROOT__SLO_ROOT, newSloRoot, newSloRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SloPackage.SLO_ROOT__SLO_ROOT:
				return basicSetSloRoot(null, msgs);
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
			case SloPackage.SLO_ROOT__SLO_ROOT:
				return getSloRoot();
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
			case SloPackage.SLO_ROOT__SLO_ROOT:
				setSloRoot((ServiceLevelObjectives)newValue);
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
			case SloPackage.SLO_ROOT__SLO_ROOT:
				setSloRoot((ServiceLevelObjectives)null);
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
			case SloPackage.SLO_ROOT__SLO_ROOT:
				return sloRoot != null;
		}
		return super.eIsSet(featureID);
	}

} //SloRootImpl
