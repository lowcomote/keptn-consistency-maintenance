/**
 */
package eu.lowcomote.keptn.sli.impl;

import eu.lowcomote.keptn.sli.ServiceLevelIndicators;
import eu.lowcomote.keptn.sli.SliPackage;
import eu.lowcomote.keptn.sli.SliRoot;

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
 *   <li>{@link eu.lowcomote.keptn.sli.impl.SliRootImpl#getSliRoot <em>Sli Root</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SliRootImpl extends MinimalEObjectImpl.Container implements SliRoot {
	/**
	 * The cached value of the '{@link #getSliRoot() <em>Sli Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSliRoot()
	 * @generated
	 * @ordered
	 */
	protected ServiceLevelIndicators sliRoot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SliRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SliPackage.Literals.SLI_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceLevelIndicators getSliRoot() {
		return sliRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSliRoot(ServiceLevelIndicators newSliRoot, NotificationChain msgs) {
		ServiceLevelIndicators oldSliRoot = sliRoot;
		sliRoot = newSliRoot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SliPackage.SLI_ROOT__SLI_ROOT, oldSliRoot, newSliRoot);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSliRoot(ServiceLevelIndicators newSliRoot) {
		if (newSliRoot != sliRoot) {
			NotificationChain msgs = null;
			if (sliRoot != null)
				msgs = ((InternalEObject)sliRoot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SliPackage.SLI_ROOT__SLI_ROOT, null, msgs);
			if (newSliRoot != null)
				msgs = ((InternalEObject)newSliRoot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SliPackage.SLI_ROOT__SLI_ROOT, null, msgs);
			msgs = basicSetSliRoot(newSliRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SliPackage.SLI_ROOT__SLI_ROOT, newSliRoot, newSliRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SliPackage.SLI_ROOT__SLI_ROOT:
				return basicSetSliRoot(null, msgs);
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
			case SliPackage.SLI_ROOT__SLI_ROOT:
				return getSliRoot();
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
			case SliPackage.SLI_ROOT__SLI_ROOT:
				setSliRoot((ServiceLevelIndicators)newValue);
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
			case SliPackage.SLI_ROOT__SLI_ROOT:
				setSliRoot((ServiceLevelIndicators)null);
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
			case SliPackage.SLI_ROOT__SLI_ROOT:
				return sliRoot != null;
		}
		return super.eIsSet(featureID);
	}

} //SliRootImpl
