/*
 * generated by Xtext 2.25.0
 */
package eu.lowcomote.keptn.slo;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class SloStandaloneSetup extends SloStandaloneSetupGenerated {

	public static void doSetup() {
		new SloStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
