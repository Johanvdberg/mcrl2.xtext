/*
 * generated by Xtext 2.11.0.RC2
 */
package test.multiname.dsl.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import test.multiname.dsl.MultiNameDslRuntimeModule
import test.multiname.dsl.MultiNameDslStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class MultiNameDslIdeSetup extends MultiNameDslStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new MultiNameDslRuntimeModule, new MultiNameDslIdeModule))
	}
	
}
