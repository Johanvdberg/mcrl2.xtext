/*
 * generated by Xtext 2.11.0.RC2
 */
package test.multiname.dsl.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import test.multiname.dsl.ui.internal.DslActivator;

public class MultiNameDslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return DslActivator.getInstance().getInjector("test.multiname.dsl.MultiNameDsl");
	}

}
