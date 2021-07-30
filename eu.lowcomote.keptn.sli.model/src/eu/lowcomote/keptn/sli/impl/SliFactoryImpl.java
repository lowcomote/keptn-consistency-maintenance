/**
 */
package eu.lowcomote.keptn.sli.impl;

import eu.lowcomote.keptn.sli.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SliFactoryImpl extends EFactoryImpl implements SliFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SliFactory init() {
		try {
			SliFactory theSliFactory = (SliFactory)EPackage.Registry.INSTANCE.getEFactory(SliPackage.eNS_URI);
			if (theSliFactory != null) {
				return theSliFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SliFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SliFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SliPackage.SLI_ROOT: return createSliRoot();
			case SliPackage.SERVICE_LEVEL_INDICATORS: return createServiceLevelIndicators();
			case SliPackage.SERVICE_LEVEL_INDICATORS_INDICATORS: return createServiceLevelIndicatorsIndicators();
			case SliPackage.SERVICE_LEVEL_INDICATORS_SPEC_VERSION: return createServiceLevelIndicatorsSpec_version();
			case SliPackage.SERVICE_LEVEL_INDICATORS_INDICATORS_PATTERN_PROPERTIES0: return createServiceLevelIndicatorsIndicatorsPatternProperties0();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SliRoot createSliRoot() {
		SliRootImpl sliRoot = new SliRootImpl();
		return sliRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceLevelIndicators createServiceLevelIndicators() {
		ServiceLevelIndicatorsImpl serviceLevelIndicators = new ServiceLevelIndicatorsImpl();
		return serviceLevelIndicators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceLevelIndicatorsIndicators createServiceLevelIndicatorsIndicators() {
		ServiceLevelIndicatorsIndicatorsImpl serviceLevelIndicatorsIndicators = new ServiceLevelIndicatorsIndicatorsImpl();
		return serviceLevelIndicatorsIndicators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceLevelIndicatorsSpec_version createServiceLevelIndicatorsSpec_version() {
		ServiceLevelIndicatorsSpec_versionImpl serviceLevelIndicatorsSpec_version = new ServiceLevelIndicatorsSpec_versionImpl();
		return serviceLevelIndicatorsSpec_version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceLevelIndicatorsIndicatorsPatternProperties0 createServiceLevelIndicatorsIndicatorsPatternProperties0() {
		ServiceLevelIndicatorsIndicatorsPatternProperties0Impl serviceLevelIndicatorsIndicatorsPatternProperties0 = new ServiceLevelIndicatorsIndicatorsPatternProperties0Impl();
		return serviceLevelIndicatorsIndicatorsPatternProperties0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SliPackage getSliPackage() {
		return (SliPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SliPackage getPackage() {
		return SliPackage.eINSTANCE;
	}

} //SliFactoryImpl
