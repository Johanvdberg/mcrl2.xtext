/*
 * generated by Xtext 2.11.0.RC2
 */
package test.multiname.dsl


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class MultiNameDslStandaloneSetup extends MultiNameDslStandaloneSetupGenerated {

	def static void doSetup() {
		new MultiNameDslStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
