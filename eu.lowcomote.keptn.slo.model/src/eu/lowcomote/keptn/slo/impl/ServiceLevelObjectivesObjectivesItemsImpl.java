/**
 */
package eu.lowcomote.keptn.slo.impl;

import eu.lowcomote.keptn.slo.Objective;
import eu.lowcomote.keptn.slo.ServiceLevelObjectivesObjectivesItems;
import eu.lowcomote.keptn.slo.SloPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Level Objectives Objectives Items</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.lowcomote.keptn.slo.impl.ServiceLevelObjectivesObjectivesItemsImpl#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceLevelObjectivesObjectivesItemsImpl extends MinimalEObjectImpl.Container implements ServiceLevelObjectivesObjectivesItems {
	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected Objective items;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceLevelObjectivesObjectivesItemsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SloPackage.Literals.SERVICE_LEVEL_OBJECTIVES_OBJECTIVES_ITEMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Objective getItems() {
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItems(Objective newItems, NotificationChain msgs) {
		Objective oldItems = items;
		items = newItems;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SloPackage.SERVICE_LEVEL_OBJECTIVES_OBJECTIVES_ITEMS__ITEMS, oldItems, newItems);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItems(Objective newItems) {
		if (newItems != items) {
			NotificationChain msgs = null;
			if (items != null)
				msgs = ((InternalEObject)items).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SloPackage.SERVICE_LEVEL_OBJECTIVES_OBJECTIVES_ITEMS__ITEMS, null, msgs);
			if (newItems != null)
				msgs = ((InternalEObject)newItems).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SloPackage.SERVICE_LEVEL_OBJECTIVES_OBJECTIVES_ITEMS__ITEMS, null, msgs);
			msgs = basicSetItems(newItems, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SloPackage.SERVICE_LEVEL_OBJECTIVES_OBJECTIVES_ITEMS__ITEMS, newItems, newItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SloPackage.SERVICE_LEVEL_OBJECTIVES_OBJECTIVES_ITEMS__ITEMS:
				return basicSetItems(null, msgs);
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
			case SloPackage.SERVICE_LEVEL_OBJECTIVES_OBJECTIVES_ITEMS__ITEMS:
				return getItems();
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
			case SloPackage.SERVICE_LEVEL_OBJECTIVES_OBJECTIVES_ITEMS__ITEMS:
				setItems((Objective)newValue);
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
			case SloPackage.SERVICE_LEVEL_OBJECTIVES_OBJECTIVES_ITEMS__ITEMS:
				setItems((Objective)null);
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
			case SloPackage.SERVICE_LEVEL_OBJECTIVES_OBJECTIVES_ITEMS__ITEMS:
				return items != null;
		}
		return super.eIsSet(featureID);
	}

} //ServiceLevelObjectivesObjectivesItemsImpl
