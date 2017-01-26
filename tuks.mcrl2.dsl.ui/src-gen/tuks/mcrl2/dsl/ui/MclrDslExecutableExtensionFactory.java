/*
 * generated by Xtext 2.11.0.beta2
 */
package tuks.mcrl2.dsl.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import tuks.mcrl2.dsl.ui.internal.DslActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MclrDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return DslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return DslActivator.getInstance().getInjector(DslActivator.TUKS_MCRL2_DSL_MCLRDSL);
	}
	
}