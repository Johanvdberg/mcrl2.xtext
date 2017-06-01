/*
 * generated by Xtext 2.11.0.RC2
 */
grammar InternalMultiNameDsl;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package test.multiname.dsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package test.multiname.dsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import test.multiname.dsl.services.MultiNameDslGrammarAccess;

}
@parser::members {
	private MultiNameDslGrammarAccess grammarAccess;

	public void setGrammarAccess(MultiNameDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		(
			{ before(grammarAccess.getModelAccess().getModulesAssignment()); }
			(rule__Model__ModulesAssignment)
			{ after(grammarAccess.getModelAccess().getModulesAssignment()); }
		)
		(
			{ before(grammarAccess.getModelAccess().getModulesAssignment()); }
			(rule__Model__ModulesAssignment)*
			{ after(grammarAccess.getModelAccess().getModulesAssignment()); }
		)
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleModule
entryRuleModule
:
{ before(grammarAccess.getModuleRule()); }
	 ruleModule
{ after(grammarAccess.getModuleRule()); } 
	 EOF 
;

// Rule Module
ruleModule 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModuleAccess().getGroup()); }
		(rule__Module__Group__0)
		{ after(grammarAccess.getModuleAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVarName
entryRuleVarName
:
{ before(grammarAccess.getVarNameRule()); }
	 ruleVarName
{ after(grammarAccess.getVarNameRule()); } 
	 EOF 
;

// Rule VarName
ruleVarName 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVarNameAccess().getNameAssignment()); }
		(rule__VarName__NameAssignment)
		{ after(grammarAccess.getVarNameAccess().getNameAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFuncName
entryRuleFuncName
:
{ before(grammarAccess.getFuncNameRule()); }
	 ruleFuncName
{ after(grammarAccess.getFuncNameRule()); } 
	 EOF 
;

// Rule FuncName
ruleFuncName 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFuncNameAccess().getNameAssignment()); }
		(rule__FuncName__NameAssignment)
		{ after(grammarAccess.getFuncNameAccess().getNameAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFuncs
entryRuleFuncs
:
{ before(grammarAccess.getFuncsRule()); }
	 ruleFuncs
{ after(grammarAccess.getFuncsRule()); } 
	 EOF 
;

// Rule Funcs
ruleFuncs 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFuncsAccess().getGroup()); }
		(rule__Funcs__Group__0)
		{ after(grammarAccess.getFuncsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVars
entryRuleVars
:
{ before(grammarAccess.getVarsRule()); }
	 ruleVars
{ after(grammarAccess.getVarsRule()); } 
	 EOF 
;

// Rule Vars
ruleVars 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVarsAccess().getGroup()); }
		(rule__Vars__Group__0)
		{ after(grammarAccess.getVarsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Module__Group__0__Impl
	rule__Module__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModuleAccess().getBegin_moduleKeyword_0()); }
	'begin_module'
	{ after(grammarAccess.getModuleAccess().getBegin_moduleKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Module__Group__1__Impl
	rule__Module__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModuleAccess().getNameAssignment_1()); }
	(rule__Module__NameAssignment_1)
	{ after(grammarAccess.getModuleAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Module__Group__2__Impl
	rule__Module__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModuleAccess().getVarsAssignment_2()); }
	(rule__Module__VarsAssignment_2)*
	{ after(grammarAccess.getModuleAccess().getVarsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Module__Group__3__Impl
	rule__Module__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModuleAccess().getFuncsAssignment_3()); }
	(rule__Module__FuncsAssignment_3)*
	{ after(grammarAccess.getModuleAccess().getFuncsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Module__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModuleAccess().getEnd_moduleKeyword_4()); }
	'end_module'
	{ after(grammarAccess.getModuleAccess().getEnd_moduleKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Funcs__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Funcs__Group__0__Impl
	rule__Funcs__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Funcs__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFuncsAccess().getFuncKeyword_0()); }
	'func'
	{ after(grammarAccess.getFuncsAccess().getFuncKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Funcs__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Funcs__Group__1__Impl
	rule__Funcs__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Funcs__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFuncsAccess().getLeftAssignment_1()); }
	(rule__Funcs__LeftAssignment_1)
	{ after(grammarAccess.getFuncsAccess().getLeftAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Funcs__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Funcs__Group__2__Impl
	rule__Funcs__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Funcs__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFuncsAccess().getGroup_2()); }
	(rule__Funcs__Group_2__0)?
	{ after(grammarAccess.getFuncsAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Funcs__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Funcs__Group__3__Impl
	rule__Funcs__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Funcs__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFuncsAccess().getEqualsSignKeyword_3()); }
	'='
	{ after(grammarAccess.getFuncsAccess().getEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Funcs__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Funcs__Group__4__Impl
	rule__Funcs__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Funcs__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFuncsAccess().getRightAssignment_4()); }
	(rule__Funcs__RightAssignment_4)
	{ after(grammarAccess.getFuncsAccess().getRightAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Funcs__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Funcs__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Funcs__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFuncsAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getFuncsAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Funcs__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Funcs__Group_2__0__Impl
	rule__Funcs__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Funcs__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFuncsAccess().getBracketAssignment_2_0()); }
	(rule__Funcs__BracketAssignment_2_0)
	{ after(grammarAccess.getFuncsAccess().getBracketAssignment_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Funcs__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Funcs__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Funcs__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFuncsAccess().getRightParenthesisKeyword_2_1()); }
	')'
	{ after(grammarAccess.getFuncsAccess().getRightParenthesisKeyword_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Vars__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Vars__Group__0__Impl
	rule__Vars__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Vars__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVarsAccess().getVarKeyword_0()); }
	'var'
	{ after(grammarAccess.getVarsAccess().getVarKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Vars__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Vars__Group__1__Impl
	rule__Vars__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Vars__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVarsAccess().getVarNameAssignment_1()); }
	(rule__Vars__VarNameAssignment_1)
	{ after(grammarAccess.getVarsAccess().getVarNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Vars__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Vars__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Vars__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVarsAccess().getSemicolonKeyword_2()); }
	';'
	{ after(grammarAccess.getVarsAccess().getSemicolonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__ModulesAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getModulesModuleParserRuleCall_0()); }
		ruleModule
		{ after(grammarAccess.getModelAccess().getModulesModuleParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__VarsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModuleAccess().getVarsVarsParserRuleCall_2_0()); }
		ruleVars
		{ after(grammarAccess.getModuleAccess().getVarsVarsParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__FuncsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModuleAccess().getFuncsFuncsParserRuleCall_3_0()); }
		ruleFuncs
		{ after(grammarAccess.getModuleAccess().getFuncsFuncsParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VarName__NameAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVarNameAccess().getNameIDTerminalRuleCall_0()); }
		RULE_ID
		{ after(grammarAccess.getVarNameAccess().getNameIDTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FuncName__NameAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFuncNameAccess().getNameIDTerminalRuleCall_0()); }
		RULE_ID
		{ after(grammarAccess.getFuncNameAccess().getNameIDTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Funcs__LeftAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFuncsAccess().getLeftFuncNameParserRuleCall_1_0()); }
		ruleFuncName
		{ after(grammarAccess.getFuncsAccess().getLeftFuncNameParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Funcs__BracketAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFuncsAccess().getBracketLeftParenthesisKeyword_2_0_0()); }
		(
			{ before(grammarAccess.getFuncsAccess().getBracketLeftParenthesisKeyword_2_0_0()); }
			'('
			{ after(grammarAccess.getFuncsAccess().getBracketLeftParenthesisKeyword_2_0_0()); }
		)
		{ after(grammarAccess.getFuncsAccess().getBracketLeftParenthesisKeyword_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Funcs__RightAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFuncsAccess().getRightNameCrossReference_4_0()); }
		(
			{ before(grammarAccess.getFuncsAccess().getRightNameIDTerminalRuleCall_4_0_1()); }
			RULE_ID
			{ after(grammarAccess.getFuncsAccess().getRightNameIDTerminalRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getFuncsAccess().getRightNameCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Vars__VarNameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVarsAccess().getVarNameVarNameParserRuleCall_1_0()); }
		ruleVarName
		{ after(grammarAccess.getVarsAccess().getVarNameVarNameParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
