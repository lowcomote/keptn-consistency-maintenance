/**
 */
package eu.lowcomote.keptn.sli.util;

import eu.lowcomote.keptn.sli.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see eu.lowcomote.keptn.sli.SliPackage
 * @generated
 */
public class SliSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SliPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SliSwitch() {
		if (modelPackage == null) {
			modelPackage = SliPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SliPackage.SLI_ROOT: {
				SliRoot sliRoot = (SliRoot)theEObject;
				T result = caseSliRoot(sliRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SliPackage.SERVICE_LEVEL_INDICATORS: {
				ServiceLevelIndicators serviceLevelIndicators = (ServiceLevelIndicators)theEObject;
				T result = caseServiceLevelIndicators(serviceLevelIndicators);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SliPackage.SERVICE_LEVEL_INDICATORS_INDICATORS: {
				ServiceLevelIndicatorsIndicators serviceLevelIndicatorsIndicators = (ServiceLevelIndicatorsIndicators)theEObject;
				T result = caseServiceLevelIndicatorsIndicators(serviceLevelIndicatorsIndicators);
				if (result == null) result = caseServiceLevelIndicatorsPropertiesAbstract(serviceLevelIndicatorsIndicators);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SliPackage.SERVICE_LEVEL_INDICATORS_SPEC_VERSION: {
				ServiceLevelIndicatorsSpec_version serviceLevelIndicatorsSpec_version = (ServiceLevelIndicatorsSpec_version)theEObject;
				T result = caseServiceLevelIndicatorsSpec_version(serviceLevelIndicatorsSpec_version);
				if (result == null) result = caseServiceLevelIndicatorsPropertiesAbstract(serviceLevelIndicatorsSpec_version);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SliPackage.SERVICE_LEVEL_INDICATORS_INDICATORS_PATTERN_PROPERTIES0: {
				ServiceLevelIndicatorsIndicatorsPatternProperties0 serviceLevelIndicatorsIndicatorsPatternProperties0 = (ServiceLevelIndicatorsIndicatorsPatternProperties0)theEObject;
				T result = caseServiceLevelIndicatorsIndicatorsPatternProperties0(serviceLevelIndicatorsIndicatorsPatternProperties0);
				if (result == null) result = caseServiceLevelIndicatorsIndicatorsPropertiesAbstract(serviceLevelIndicatorsIndicatorsPatternProperties0);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SliPackage.SERVICE_LEVEL_INDICATORS_PROPERTIES_ABSTRACT: {
				ServiceLevelIndicatorsPropertiesAbstract serviceLevelIndicatorsPropertiesAbstract = (ServiceLevelIndicatorsPropertiesAbstract)theEObject;
				T result = caseServiceLevelIndicatorsPropertiesAbstract(serviceLevelIndicatorsPropertiesAbstract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SliPackage.SERVICE_LEVEL_INDICATORS_INDICATORS_PROPERTIES_ABSTRACT: {
				ServiceLevelIndicatorsIndicatorsPropertiesAbstract serviceLevelIndicatorsIndicatorsPropertiesAbstract = (ServiceLevelIndicatorsIndicatorsPropertiesAbstract)theEObject;
				T result = caseServiceLevelIndicatorsIndicatorsPropertiesAbstract(serviceLevelIndicatorsIndicatorsPropertiesAbstract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSliRoot(SliRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Level Indicators</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Level Indicators</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceLevelIndicators(ServiceLevelIndicators object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Level Indicators Indicators</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Level Indicators Indicators</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceLevelIndicatorsIndicators(ServiceLevelIndicatorsIndicators object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Level Indicators Spec version</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Level Indicators Spec version</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceLevelIndicatorsSpec_version(ServiceLevelIndicatorsSpec_version object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Level Indicators Indicators Pattern Properties0</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Level Indicators Indicators Pattern Properties0</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceLevelIndicatorsIndicatorsPatternProperties0(ServiceLevelIndicatorsIndicatorsPatternProperties0 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Level Indicators Properties Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Level Indicators Properties Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceLevelIndicatorsPropertiesAbstract(ServiceLevelIndicatorsPropertiesAbstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Level Indicators Indicators Properties Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Level Indicators Indicators Properties Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceLevelIndicatorsIndicatorsPropertiesAbstract(ServiceLevelIndicatorsIndicatorsPropertiesAbstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SliSwitch
