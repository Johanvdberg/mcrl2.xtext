/*
 * generated by Xtext 2.11.0.RC2
 */
package test.multiname.dsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MultiNameDslGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "test.multiname.dsl.MultiNameDsl.Model");
		private final Assignment cModulesAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cModulesModuleParserRuleCall_0 = (RuleCall)cModulesAssignment.eContents().get(0);
		
		//Model:
		//	modules+=Module+;
		@Override public ParserRule getRule() { return rule; }
		
		//modules+=Module+
		public Assignment getModulesAssignment() { return cModulesAssignment; }
		
		//Module
		public RuleCall getModulesModuleParserRuleCall_0() { return cModulesModuleParserRuleCall_0; }
	}
	public class ModuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "test.multiname.dsl.MultiNameDsl.Module");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cBegin_moduleKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cVarsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cVarsVarsParserRuleCall_2_0 = (RuleCall)cVarsAssignment_2.eContents().get(0);
		private final Assignment cFuncsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cFuncsFuncsParserRuleCall_3_0 = (RuleCall)cFuncsAssignment_3.eContents().get(0);
		private final Keyword cEnd_moduleKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Module:
		//	'begin_module' name=ID
		//	vars+=Vars*
		//	funcs+=Funcs*
		//	'end_module';
		@Override public ParserRule getRule() { return rule; }
		
		//'begin_module' name=ID vars+=Vars* funcs+=Funcs* 'end_module'
		public Group getGroup() { return cGroup; }
		
		//'begin_module'
		public Keyword getBegin_moduleKeyword_0() { return cBegin_moduleKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//vars+=Vars*
		public Assignment getVarsAssignment_2() { return cVarsAssignment_2; }
		
		//Vars
		public RuleCall getVarsVarsParserRuleCall_2_0() { return cVarsVarsParserRuleCall_2_0; }
		
		//funcs+=Funcs*
		public Assignment getFuncsAssignment_3() { return cFuncsAssignment_3; }
		
		//Funcs
		public RuleCall getFuncsFuncsParserRuleCall_3_0() { return cFuncsFuncsParserRuleCall_3_0; }
		
		//'end_module'
		public Keyword getEnd_moduleKeyword_4() { return cEnd_moduleKeyword_4; }
	}
	public class VarNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "test.multiname.dsl.MultiNameDsl.VarName");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//VarName:
		//	name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	public class FuncNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "test.multiname.dsl.MultiNameDsl.FuncName");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//FuncName:
		//	name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	public class NameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "test.multiname.dsl.MultiNameDsl.Name");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cVarNameParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cFuncNameParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Name:
		//	VarName | FuncName;
		@Override public ParserRule getRule() { return rule; }
		
		//VarName | FuncName
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//VarName
		public RuleCall getVarNameParserRuleCall_0() { return cVarNameParserRuleCall_0; }
		
		//FuncName
		public RuleCall getFuncNameParserRuleCall_1() { return cFuncNameParserRuleCall_1; }
	}
	public class FuncsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "test.multiname.dsl.MultiNameDsl.Funcs");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFuncKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cLeftAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cLeftFuncNameParserRuleCall_1_0 = (RuleCall)cLeftAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cBracketAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final Keyword cBracketLeftParenthesisKeyword_2_0_0 = (Keyword)cBracketAssignment_2_0.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Keyword cEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cRightAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cRightNameCrossReference_4_0 = (CrossReference)cRightAssignment_4.eContents().get(0);
		private final RuleCall cRightNameIDTerminalRuleCall_4_0_1 = (RuleCall)cRightNameCrossReference_4_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Funcs:
		//	'func' left=FuncName (bracket?='(' ')')? '=' right=[Name] ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'func' left=FuncName (bracket?='(' ')')? '=' right=[Name] ';'
		public Group getGroup() { return cGroup; }
		
		//'func'
		public Keyword getFuncKeyword_0() { return cFuncKeyword_0; }
		
		//left=FuncName
		public Assignment getLeftAssignment_1() { return cLeftAssignment_1; }
		
		//FuncName
		public RuleCall getLeftFuncNameParserRuleCall_1_0() { return cLeftFuncNameParserRuleCall_1_0; }
		
		//(bracket?='(' ')')?
		public Group getGroup_2() { return cGroup_2; }
		
		//bracket?='('
		public Assignment getBracketAssignment_2_0() { return cBracketAssignment_2_0; }
		
		//'('
		public Keyword getBracketLeftParenthesisKeyword_2_0_0() { return cBracketLeftParenthesisKeyword_2_0_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_2_1() { return cRightParenthesisKeyword_2_1; }
		
		//'='
		public Keyword getEqualsSignKeyword_3() { return cEqualsSignKeyword_3; }
		
		//right=[Name]
		public Assignment getRightAssignment_4() { return cRightAssignment_4; }
		
		//[Name]
		public CrossReference getRightNameCrossReference_4_0() { return cRightNameCrossReference_4_0; }
		
		//ID
		public RuleCall getRightNameIDTerminalRuleCall_4_0_1() { return cRightNameIDTerminalRuleCall_4_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	public class VarsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "test.multiname.dsl.MultiNameDsl.Vars");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVarKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cVarNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cVarNameVarNameParserRuleCall_1_0 = (RuleCall)cVarNameAssignment_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Vars:
		//	'var' varName=VarName ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'var' varName=VarName ';'
		public Group getGroup() { return cGroup; }
		
		//'var'
		public Keyword getVarKeyword_0() { return cVarKeyword_0; }
		
		//varName=VarName
		public Assignment getVarNameAssignment_1() { return cVarNameAssignment_1; }
		
		//VarName
		public RuleCall getVarNameVarNameParserRuleCall_1_0() { return cVarNameVarNameParserRuleCall_1_0; }
		
		//';'
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}
	
	
	private final ModelElements pModel;
	private final ModuleElements pModule;
	private final VarNameElements pVarName;
	private final FuncNameElements pFuncName;
	private final NameElements pName;
	private final FuncsElements pFuncs;
	private final VarsElements pVars;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MultiNameDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pModule = new ModuleElements();
		this.pVarName = new VarNameElements();
		this.pFuncName = new FuncNameElements();
		this.pName = new NameElements();
		this.pFuncs = new FuncsElements();
		this.pVars = new VarsElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("test.multiname.dsl.MultiNameDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	modules+=Module+;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Module:
	//	'begin_module' name=ID
	//	vars+=Vars*
	//	funcs+=Funcs*
	//	'end_module';
	public ModuleElements getModuleAccess() {
		return pModule;
	}
	
	public ParserRule getModuleRule() {
		return getModuleAccess().getRule();
	}
	
	//VarName:
	//	name=ID;
	public VarNameElements getVarNameAccess() {
		return pVarName;
	}
	
	public ParserRule getVarNameRule() {
		return getVarNameAccess().getRule();
	}
	
	//FuncName:
	//	name=ID;
	public FuncNameElements getFuncNameAccess() {
		return pFuncName;
	}
	
	public ParserRule getFuncNameRule() {
		return getFuncNameAccess().getRule();
	}
	
	//Name:
	//	VarName | FuncName;
	public NameElements getNameAccess() {
		return pName;
	}
	
	public ParserRule getNameRule() {
		return getNameAccess().getRule();
	}
	
	//Funcs:
	//	'func' left=FuncName (bracket?='(' ')')? '=' right=[Name] ';';
	public FuncsElements getFuncsAccess() {
		return pFuncs;
	}
	
	public ParserRule getFuncsRule() {
		return getFuncsAccess().getRule();
	}
	
	//Vars:
	//	'var' varName=VarName ';';
	public VarsElements getVarsAccess() {
		return pVars;
	}
	
	public ParserRule getVarsRule() {
		return getVarsAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
