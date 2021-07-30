/**
 */
package eu.lowcomote.keptn.slo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Level Objectives Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.lowcomote.keptn.slo.ServiceLevelObjectivesFilter#getFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @see eu.lowcomote.keptn.slo.SloPackage#getServiceLevelObjectivesFilter()
 * @model
 * @generated
 */
public interface ServiceLevelObjectivesFilter extends ServiceLevelObjectivesPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference list.
	 * The list contents are of type {@link eu.lowcomote.keptn.slo.ServiceLevelObjectivesFilterPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference list.
	 * @see eu.lowcomote.keptn.slo.SloPackage#getServiceLevelObjectivesFilter_Filter()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceLevelObjectivesFilterPropertiesAbstract> getFilter();

} // ServiceLevelObjectivesFilter
