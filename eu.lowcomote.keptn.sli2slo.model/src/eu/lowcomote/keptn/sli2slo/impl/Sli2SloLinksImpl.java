/**
 */
package eu.lowcomote.keptn.sli2slo.impl;

import eu.lowcomote.keptn.sli2slo.Sli2SloLink;
import eu.lowcomote.keptn.sli2slo.Sli2SloLinks;
import eu.lowcomote.keptn.sli2slo.Sli2sloPackage;

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
 * An implementation of the model object '<em><b>Sli2 Slo Links</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.lowcomote.keptn.sli2slo.impl.Sli2SloLinksImpl#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Sli2SloLinksImpl extends MinimalEObjectImpl.Container implements Sli2SloLinks {
	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Sli2SloLink> links;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Sli2SloLinksImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Sli2sloPackage.Literals.SLI2_SLO_LINKS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sli2SloLink> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Sli2SloLink>(Sli2SloLink.class, this, Sli2sloPackage.SLI2_SLO_LINKS__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Sli2sloPackage.SLI2_SLO_LINKS__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
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
			case Sli2sloPackage.SLI2_SLO_LINKS__LINKS:
				return getLinks();
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
			case Sli2sloPackage.SLI2_SLO_LINKS__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Sli2SloLink>)newValue);
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
			case Sli2sloPackage.SLI2_SLO_LINKS__LINKS:
				getLinks().clear();
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
			case Sli2sloPackage.SLI2_SLO_LINKS__LINKS:
				return links != null && !links.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Sli2SloLinksImpl
