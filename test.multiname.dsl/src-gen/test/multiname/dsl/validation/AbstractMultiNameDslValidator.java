/*
 * generated by Xtext 2.11.0.RC2
 */
package test.multiname.dsl.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractMultiNameDslValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(test.multiname.dsl.multiNameDsl.MultiNameDslPackage.eINSTANCE);
		return result;
	}
	
}