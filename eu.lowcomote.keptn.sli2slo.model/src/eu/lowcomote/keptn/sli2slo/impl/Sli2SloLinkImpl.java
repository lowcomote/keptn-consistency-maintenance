/**
 */
package eu.lowcomote.keptn.sli2slo.impl;

import eu.lowcomote.keptn.sli.SliRoot;

import eu.lowcomote.keptn.sli2slo.Sli2SloLink;
import eu.lowcomote.keptn.sli2slo.Sli2sloPackage;

import eu.lowcomote.keptn.slo.SloRoot;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sli2 Slo Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.lowcomote.keptn.sli2slo.impl.Sli2SloLinkImpl#getSli <em>Sli</em>}</li>
 *   <li>{@link eu.lowcomote.keptn.sli2slo.impl.Sli2SloLinkImpl#getSlo <em>Slo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Sli2SloLinkImpl extends MinimalEObjectImpl.Container implements Sli2SloLink {
	/**
	 * The cached value of the '{@link #getSli() <em>Sli</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSli()
	 * @generated
	 * @ordered
	 */
	protected EList<SliRoot> sli;

	/**
	 * The cached value of the '{@link #getSlo() <em>Slo</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlo()
	 * @generated
	 * @ordered
	 */
	protected EList<SloRoot> slo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Sli2SloLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Sli2sloPackage.Literals.SLI2_SLO_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SliRoot> getSli() {
		if (sli == null) {
			sli = new EObjectResolvingEList<SliRoot>(SliRoot.class, this, Sli2sloPackage.SLI2_SLO_LINK__SLI);
		}
		return sli;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SloRoot> getSlo() {
		if (slo == null) {
			slo = new EObjectResolvingEList<SloRoot>(SloRoot.class, this, Sli2sloPackage.SLI2_SLO_LINK__SLO);
		}
		return slo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Sli2sloPackage.SLI2_SLO_LINK__SLI:
				return getSli();
			case Sli2sloPackage.SLI2_SLO_LINK__SLO:
				return getSlo();
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
			case Sli2sloPackage.SLI2_SLO_LINK__SLI:
				getSli().clear();
				getSli().addAll((Collection<? extends SliRoot>)newValue);
				return;
			case Sli2sloPackage.SLI2_SLO_LINK__SLO:
				getSlo().clear();
				getSlo().addAll((Collection<? extends SloRoot>)newValue);
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
			case Sli2sloPackage.SLI2_SLO_LINK__SLI:
				getSli().clear();
				return;
			case Sli2sloPackage.SLI2_SLO_LINK__SLO:
				getSlo().clear();
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
			case Sli2sloPackage.SLI2_SLO_LINK__SLI:
				return sli != null && !sli.isEmpty();
			case Sli2sloPackage.SLI2_SLO_LINK__SLO:
				return slo != null && !slo.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Sli2SloLinkImpl
