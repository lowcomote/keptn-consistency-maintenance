/*
 * generated by Xtext 2.25.0
 */
package eu.lowcomote.keptn.sli;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class SliStandaloneSetup extends SliStandaloneSetupGenerated {

	public static void doSetup() {
		new SliStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}