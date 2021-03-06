/*
 * generated by Xtext 2.11.0.RC2
 */
package test.multiname.dsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import test.multiname.dsl.multiNameDsl.FuncName;
import test.multiname.dsl.multiNameDsl.Funcs;
import test.multiname.dsl.multiNameDsl.Model;
import test.multiname.dsl.multiNameDsl.Module;
import test.multiname.dsl.multiNameDsl.MultiNameDslPackage;
import test.multiname.dsl.multiNameDsl.VarName;
import test.multiname.dsl.multiNameDsl.Vars;
import test.multiname.dsl.services.MultiNameDslGrammarAccess;

@SuppressWarnings("all")
public class MultiNameDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MultiNameDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MultiNameDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MultiNameDslPackage.FUNC_NAME:
				sequence_FuncName(context, (FuncName) semanticObject); 
				return; 
			case MultiNameDslPackage.FUNCS:
				sequence_Funcs(context, (Funcs) semanticObject); 
				return; 
			case MultiNameDslPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case MultiNameDslPackage.MODULE:
				sequence_Module(context, (Module) semanticObject); 
				return; 
			case MultiNameDslPackage.VAR_NAME:
				sequence_VarName(context, (VarName) semanticObject); 
				return; 
			case MultiNameDslPackage.VARS:
				sequence_Vars(context, (Vars) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     FuncName returns FuncName
	 *     Name returns FuncName
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_FuncName(ISerializationContext context, FuncName semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MultiNameDslPackage.Literals.NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MultiNameDslPackage.Literals.NAME__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFuncNameAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Funcs returns Funcs
	 *
	 * Constraint:
	 *     (left=FuncName bracket?='('? right=[Name|ID])
	 */
	protected void sequence_Funcs(ISerializationContext context, Funcs semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     modules+=Module+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Module returns Module
	 *
	 * Constraint:
	 *     (name=ID vars+=Vars* funcs+=Funcs*)
	 */
	protected void sequence_Module(ISerializationContext context, Module semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VarName returns VarName
	 *     Name returns VarName
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_VarName(ISerializationContext context, VarName semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MultiNameDslPackage.Literals.NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MultiNameDslPackage.Literals.NAME__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVarNameAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Vars returns Vars
	 *
	 * Constraint:
	 *     varName=VarName
	 */
	protected void sequence_Vars(ISerializationContext context, Vars semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MultiNameDslPackage.Literals.VARS__VAR_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MultiNameDslPackage.Literals.VARS__VAR_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVarsAccess().getVarNameVarNameParserRuleCall_1_0(), semanticObject.getVarName());
		feeder.finish();
	}
	
	
}
