/**
 */
package eu.lowcomote.keptn.slo.impl;

import eu.lowcomote.keptn.slo.Score;
import eu.lowcomote.keptn.slo.ServiceLevelObjectivesTotal_score;
import eu.lowcomote.keptn.slo.SloPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Level Objectives Total score</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.lowcomote.keptn.slo.impl.ServiceLevelObjectivesTotal_scoreImpl#getTotal_score <em>Total score</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceLevelObjectivesTotal_scoreImpl extends ServiceLevelObjectivesPropertiesAbstractImpl implements ServiceLevelObjectivesTotal_score {
	/**
	 * The cached value of the '{@link #getTotal_score() <em>Total score</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_score()
	 * @generated
	 * @ordered
	 */
	protected Score total_score;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceLevelObjectivesTotal_scoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SloPackage.Literals.SERVICE_LEVEL_OBJECTIVES_TOTAL_SCORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Score getTotal_score() {
		return total_score;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTotal_score(Score newTotal_score, NotificationChain msgs) {
		Score oldTotal_score = total_score;
		total_score = newTotal_score;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SloPackage.SERVICE_LEVEL_OBJECTIVES_TOTAL_SCORE__TOTAL_SCORE, oldTotal_score, newTotal_score);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotal_score(Score newTotal_score) {
		if (newTotal_score != total_score) {
			NotificationChain msgs = null;
			if (total_score != null)
				msgs = ((InternalEObject)total_score).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SloPackage.SERVICE_LEVEL_OBJECTIVES_TOTAL_SCORE__TOTAL_SCORE, null, msgs);
			if (newTotal_score != null)
				msgs = ((InternalEObject)newTotal_score).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SloPackage.SERVICE_LEVEL_OBJECTIVES_TOTAL_SCORE__TOTAL_SCORE, null, msgs);
			msgs = basicSetTotal_score(newTotal_score, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SloPackage.SERVICE_LEVEL_OBJECTIVES_TOTAL_SCORE__TOTAL_SCORE, newTotal_score, newTotal_score));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SloPackage.SERVICE_LEVEL_OBJECTIVES_TOTAL_SCORE__TOTAL_SCORE:
				return basicSetTotal_score(null, msgs);
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
			case SloPackage.SERVICE_LEVEL_OBJECTIVES_TOTAL_SCORE__TOTAL_SCORE:
				return getTotal_score();
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
			case SloPackage.SERVICE_LEVEL_OBJECTIVES_TOTAL_SCORE__TOTAL_SCORE:
				setTotal_score((Score)newValue);
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
			case SloPackage.SERVICE_LEVEL_OBJECTIVES_TOTAL_SCORE__TOTAL_SCORE:
				setTotal_score((Score)null);
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
			case SloPackage.SERVICE_LEVEL_OBJECTIVES_TOTAL_SCORE__TOTAL_SCORE:
				return total_score != null;
		}
		return super.eIsSet(featureID);
	}

} //ServiceLevelObjectivesTotal_scoreImpl
