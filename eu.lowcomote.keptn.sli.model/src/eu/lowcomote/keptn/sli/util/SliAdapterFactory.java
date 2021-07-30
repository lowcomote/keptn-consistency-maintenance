/**
 */
package eu.lowcomote.keptn.sli.util;

import eu.lowcomote.keptn.sli.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see eu.lowcomote.keptn.sli.SliPackage
 * @generated
 */
public class SliAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SliPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SliAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SliPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SliSwitch<Adapter> modelSwitch =
		new SliSwitch<Adapter>() {
			@Override
			public Adapter caseSliRoot(SliRoot object) {
				return createSliRootAdapter();
			}
			@Override
			public Adapter caseServiceLevelIndicators(ServiceLevelIndicators object) {
				return createServiceLevelIndicatorsAdapter();
			}
			@Override
			public Adapter caseServiceLevelIndicatorsIndicators(ServiceLevelIndicatorsIndicators object) {
				return createServiceLevelIndicatorsIndicatorsAdapter();
			}
			@Override
			public Adapter caseServiceLevelIndicatorsSpec_version(ServiceLevelIndicatorsSpec_version object) {
				return createServiceLevelIndicatorsSpec_versionAdapter();
			}
			@Override
			public Adapter caseServiceLevelIndicatorsIndicatorsPatternProperties0(ServiceLevelIndicatorsIndicatorsPatternProperties0 object) {
				return createServiceLevelIndicatorsIndicatorsPatternProperties0Adapter();
			}
			@Override
			public Adapter caseServiceLevelIndicatorsPropertiesAbstract(ServiceLevelIndicatorsPropertiesAbstract object) {
				return createServiceLevelIndicatorsPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseServiceLevelIndicatorsIndicatorsPropertiesAbstract(ServiceLevelIndicatorsIndicatorsPropertiesAbstract object) {
				return createServiceLevelIndicatorsIndicatorsPropertiesAbstractAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link eu.lowcomote.keptn.sli.SliRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.lowcomote.keptn.sli.SliRoot
	 * @generated
	 */
	public Adapter createSliRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.lowcomote.keptn.sli.ServiceLevelIndicators <em>Service Level Indicators</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.lowcomote.keptn.sli.ServiceLevelIndicators
	 * @generated
	 */
	public Adapter createServiceLevelIndicatorsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.lowcomote.keptn.sli.ServiceLevelIndicatorsIndicators <em>Service Level Indicators Indicators</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.lowcomote.keptn.sli.ServiceLevelIndicatorsIndicators
	 * @generated
	 */
	public Adapter createServiceLevelIndicatorsIndicatorsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.lowcomote.keptn.sli.ServiceLevelIndicatorsSpec_version <em>Service Level Indicators Spec version</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.lowcomote.keptn.sli.ServiceLevelIndicatorsSpec_version
	 * @generated
	 */
	public Adapter createServiceLevelIndicatorsSpec_versionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.lowcomote.keptn.sli.ServiceLevelIndicatorsIndicatorsPatternProperties0 <em>Service Level Indicators Indicators Pattern Properties0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.lowcomote.keptn.sli.ServiceLevelIndicatorsIndicatorsPatternProperties0
	 * @generated
	 */
	public Adapter createServiceLevelIndicatorsIndicatorsPatternProperties0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.lowcomote.keptn.sli.ServiceLevelIndicatorsPropertiesAbstract <em>Service Level Indicators Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.lowcomote.keptn.sli.ServiceLevelIndicatorsPropertiesAbstract
	 * @generated
	 */
	public Adapter createServiceLevelIndicatorsPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.lowcomote.keptn.sli.ServiceLevelIndicatorsIndicatorsPropertiesAbstract <em>Service Level Indicators Indicators Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.lowcomote.keptn.sli.ServiceLevelIndicatorsIndicatorsPropertiesAbstract
	 * @generated
	 */
	public Adapter createServiceLevelIndicatorsIndicatorsPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SliAdapterFactory
