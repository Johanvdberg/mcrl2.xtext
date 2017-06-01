package test.multiname.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import test.multiname.dsl.services.MultiNameDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMultiNameDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'begin_module'", "'end_module'", "'func'", "'('", "')'", "'='", "';'", "'var'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=5;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMultiNameDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMultiNameDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMultiNameDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMultiNameDsl.g"; }



     	private MultiNameDslGrammarAccess grammarAccess;

        public InternalMultiNameDslParser(TokenStream input, MultiNameDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MultiNameDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMultiNameDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMultiNameDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMultiNameDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMultiNameDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_modules_0_0= ruleModule ) )+ ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_modules_0_0 = null;



        	enterRule();

        try {
            // InternalMultiNameDsl.g:77:2: ( ( (lv_modules_0_0= ruleModule ) )+ )
            // InternalMultiNameDsl.g:78:2: ( (lv_modules_0_0= ruleModule ) )+
            {
            // InternalMultiNameDsl.g:78:2: ( (lv_modules_0_0= ruleModule ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMultiNameDsl.g:79:3: (lv_modules_0_0= ruleModule )
            	    {
            	    // InternalMultiNameDsl.g:79:3: (lv_modules_0_0= ruleModule )
            	    // InternalMultiNameDsl.g:80:4: lv_modules_0_0= ruleModule
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getModulesModuleParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_modules_0_0=ruleModule();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"modules",
            	    					lv_modules_0_0,
            	    					"test.multiname.dsl.MultiNameDsl.Module");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleModule"
    // InternalMultiNameDsl.g:100:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // InternalMultiNameDsl.g:100:47: (iv_ruleModule= ruleModule EOF )
            // InternalMultiNameDsl.g:101:2: iv_ruleModule= ruleModule EOF
            {
             newCompositeNode(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModule=ruleModule();

            state._fsp--;

             current =iv_ruleModule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // InternalMultiNameDsl.g:107:1: ruleModule returns [EObject current=null] : (otherlv_0= 'begin_module' ( (lv_name_1_0= RULE_ID ) ) ( (lv_vars_2_0= ruleVars ) )* ( (lv_funcs_3_0= ruleFuncs ) )* otherlv_4= 'end_module' ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_4=null;
        EObject lv_vars_2_0 = null;

        EObject lv_funcs_3_0 = null;



        	enterRule();

        try {
            // InternalMultiNameDsl.g:113:2: ( (otherlv_0= 'begin_module' ( (lv_name_1_0= RULE_ID ) ) ( (lv_vars_2_0= ruleVars ) )* ( (lv_funcs_3_0= ruleFuncs ) )* otherlv_4= 'end_module' ) )
            // InternalMultiNameDsl.g:114:2: (otherlv_0= 'begin_module' ( (lv_name_1_0= RULE_ID ) ) ( (lv_vars_2_0= ruleVars ) )* ( (lv_funcs_3_0= ruleFuncs ) )* otherlv_4= 'end_module' )
            {
            // InternalMultiNameDsl.g:114:2: (otherlv_0= 'begin_module' ( (lv_name_1_0= RULE_ID ) ) ( (lv_vars_2_0= ruleVars ) )* ( (lv_funcs_3_0= ruleFuncs ) )* otherlv_4= 'end_module' )
            // InternalMultiNameDsl.g:115:3: otherlv_0= 'begin_module' ( (lv_name_1_0= RULE_ID ) ) ( (lv_vars_2_0= ruleVars ) )* ( (lv_funcs_3_0= ruleFuncs ) )* otherlv_4= 'end_module'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getModuleAccess().getBegin_moduleKeyword_0());
            		
            // InternalMultiNameDsl.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMultiNameDsl.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMultiNameDsl.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalMultiNameDsl.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMultiNameDsl.g:137:3: ( (lv_vars_2_0= ruleVars ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMultiNameDsl.g:138:4: (lv_vars_2_0= ruleVars )
            	    {
            	    // InternalMultiNameDsl.g:138:4: (lv_vars_2_0= ruleVars )
            	    // InternalMultiNameDsl.g:139:5: lv_vars_2_0= ruleVars
            	    {

            	    					newCompositeNode(grammarAccess.getModuleAccess().getVarsVarsParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_vars_2_0=ruleVars();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"vars",
            	    						lv_vars_2_0,
            	    						"test.multiname.dsl.MultiNameDsl.Vars");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalMultiNameDsl.g:156:3: ( (lv_funcs_3_0= ruleFuncs ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMultiNameDsl.g:157:4: (lv_funcs_3_0= ruleFuncs )
            	    {
            	    // InternalMultiNameDsl.g:157:4: (lv_funcs_3_0= ruleFuncs )
            	    // InternalMultiNameDsl.g:158:5: lv_funcs_3_0= ruleFuncs
            	    {

            	    					newCompositeNode(grammarAccess.getModuleAccess().getFuncsFuncsParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_funcs_3_0=ruleFuncs();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"funcs",
            	    						lv_funcs_3_0,
            	    						"test.multiname.dsl.MultiNameDsl.Funcs");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getModuleAccess().getEnd_moduleKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleVarName"
    // InternalMultiNameDsl.g:183:1: entryRuleVarName returns [EObject current=null] : iv_ruleVarName= ruleVarName EOF ;
    public final EObject entryRuleVarName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarName = null;


        try {
            // InternalMultiNameDsl.g:183:48: (iv_ruleVarName= ruleVarName EOF )
            // InternalMultiNameDsl.g:184:2: iv_ruleVarName= ruleVarName EOF
            {
             newCompositeNode(grammarAccess.getVarNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarName=ruleVarName();

            state._fsp--;

             current =iv_ruleVarName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarName"


    // $ANTLR start "ruleVarName"
    // InternalMultiNameDsl.g:190:1: ruleVarName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVarName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMultiNameDsl.g:196:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMultiNameDsl.g:197:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMultiNameDsl.g:197:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMultiNameDsl.g:198:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMultiNameDsl.g:198:3: (lv_name_0_0= RULE_ID )
            // InternalMultiNameDsl.g:199:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getVarNameAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVarNameRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarName"


    // $ANTLR start "entryRuleFuncName"
    // InternalMultiNameDsl.g:218:1: entryRuleFuncName returns [EObject current=null] : iv_ruleFuncName= ruleFuncName EOF ;
    public final EObject entryRuleFuncName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncName = null;


        try {
            // InternalMultiNameDsl.g:218:49: (iv_ruleFuncName= ruleFuncName EOF )
            // InternalMultiNameDsl.g:219:2: iv_ruleFuncName= ruleFuncName EOF
            {
             newCompositeNode(grammarAccess.getFuncNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuncName=ruleFuncName();

            state._fsp--;

             current =iv_ruleFuncName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFuncName"


    // $ANTLR start "ruleFuncName"
    // InternalMultiNameDsl.g:225:1: ruleFuncName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleFuncName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMultiNameDsl.g:231:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMultiNameDsl.g:232:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMultiNameDsl.g:232:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMultiNameDsl.g:233:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMultiNameDsl.g:233:3: (lv_name_0_0= RULE_ID )
            // InternalMultiNameDsl.g:234:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getFuncNameAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getFuncNameRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFuncName"


    // $ANTLR start "entryRuleFuncs"
    // InternalMultiNameDsl.g:253:1: entryRuleFuncs returns [EObject current=null] : iv_ruleFuncs= ruleFuncs EOF ;
    public final EObject entryRuleFuncs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncs = null;


        try {
            // InternalMultiNameDsl.g:253:46: (iv_ruleFuncs= ruleFuncs EOF )
            // InternalMultiNameDsl.g:254:2: iv_ruleFuncs= ruleFuncs EOF
            {
             newCompositeNode(grammarAccess.getFuncsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuncs=ruleFuncs();

            state._fsp--;

             current =iv_ruleFuncs; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFuncs"


    // $ANTLR start "ruleFuncs"
    // InternalMultiNameDsl.g:260:1: ruleFuncs returns [EObject current=null] : (otherlv_0= 'func' ( (lv_left_1_0= ruleFuncName ) ) ( ( (lv_bracket_2_0= '(' ) ) otherlv_3= ')' )? otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) otherlv_6= ';' ) ;
    public final EObject ruleFuncs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_bracket_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_left_1_0 = null;



        	enterRule();

        try {
            // InternalMultiNameDsl.g:266:2: ( (otherlv_0= 'func' ( (lv_left_1_0= ruleFuncName ) ) ( ( (lv_bracket_2_0= '(' ) ) otherlv_3= ')' )? otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) otherlv_6= ';' ) )
            // InternalMultiNameDsl.g:267:2: (otherlv_0= 'func' ( (lv_left_1_0= ruleFuncName ) ) ( ( (lv_bracket_2_0= '(' ) ) otherlv_3= ')' )? otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) otherlv_6= ';' )
            {
            // InternalMultiNameDsl.g:267:2: (otherlv_0= 'func' ( (lv_left_1_0= ruleFuncName ) ) ( ( (lv_bracket_2_0= '(' ) ) otherlv_3= ')' )? otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) otherlv_6= ';' )
            // InternalMultiNameDsl.g:268:3: otherlv_0= 'func' ( (lv_left_1_0= ruleFuncName ) ) ( ( (lv_bracket_2_0= '(' ) ) otherlv_3= ')' )? otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFuncsAccess().getFuncKeyword_0());
            		
            // InternalMultiNameDsl.g:272:3: ( (lv_left_1_0= ruleFuncName ) )
            // InternalMultiNameDsl.g:273:4: (lv_left_1_0= ruleFuncName )
            {
            // InternalMultiNameDsl.g:273:4: (lv_left_1_0= ruleFuncName )
            // InternalMultiNameDsl.g:274:5: lv_left_1_0= ruleFuncName
            {

            					newCompositeNode(grammarAccess.getFuncsAccess().getLeftFuncNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_left_1_0=ruleFuncName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFuncsRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_1_0,
            						"test.multiname.dsl.MultiNameDsl.FuncName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMultiNameDsl.g:291:3: ( ( (lv_bracket_2_0= '(' ) ) otherlv_3= ')' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMultiNameDsl.g:292:4: ( (lv_bracket_2_0= '(' ) ) otherlv_3= ')'
                    {
                    // InternalMultiNameDsl.g:292:4: ( (lv_bracket_2_0= '(' ) )
                    // InternalMultiNameDsl.g:293:5: (lv_bracket_2_0= '(' )
                    {
                    // InternalMultiNameDsl.g:293:5: (lv_bracket_2_0= '(' )
                    // InternalMultiNameDsl.g:294:6: lv_bracket_2_0= '('
                    {
                    lv_bracket_2_0=(Token)match(input,14,FOLLOW_8); 

                    						newLeafNode(lv_bracket_2_0, grammarAccess.getFuncsAccess().getBracketLeftParenthesisKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFuncsRule());
                    						}
                    						setWithLastConsumed(current, "bracket", true, "(");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getFuncsAccess().getRightParenthesisKeyword_2_1());
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getFuncsAccess().getEqualsSignKeyword_3());
            		
            // InternalMultiNameDsl.g:315:3: ( (otherlv_5= RULE_ID ) )
            // InternalMultiNameDsl.g:316:4: (otherlv_5= RULE_ID )
            {
            // InternalMultiNameDsl.g:316:4: (otherlv_5= RULE_ID )
            // InternalMultiNameDsl.g:317:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFuncsRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_5, grammarAccess.getFuncsAccess().getRightNameCrossReference_4_0());
            				

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getFuncsAccess().getSemicolonKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFuncs"


    // $ANTLR start "entryRuleVars"
    // InternalMultiNameDsl.g:336:1: entryRuleVars returns [EObject current=null] : iv_ruleVars= ruleVars EOF ;
    public final EObject entryRuleVars() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVars = null;


        try {
            // InternalMultiNameDsl.g:336:45: (iv_ruleVars= ruleVars EOF )
            // InternalMultiNameDsl.g:337:2: iv_ruleVars= ruleVars EOF
            {
             newCompositeNode(grammarAccess.getVarsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVars=ruleVars();

            state._fsp--;

             current =iv_ruleVars; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVars"


    // $ANTLR start "ruleVars"
    // InternalMultiNameDsl.g:343:1: ruleVars returns [EObject current=null] : (otherlv_0= 'var' ( (lv_varName_1_0= ruleVarName ) ) otherlv_2= ';' ) ;
    public final EObject ruleVars() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_varName_1_0 = null;



        	enterRule();

        try {
            // InternalMultiNameDsl.g:349:2: ( (otherlv_0= 'var' ( (lv_varName_1_0= ruleVarName ) ) otherlv_2= ';' ) )
            // InternalMultiNameDsl.g:350:2: (otherlv_0= 'var' ( (lv_varName_1_0= ruleVarName ) ) otherlv_2= ';' )
            {
            // InternalMultiNameDsl.g:350:2: (otherlv_0= 'var' ( (lv_varName_1_0= ruleVarName ) ) otherlv_2= ';' )
            // InternalMultiNameDsl.g:351:3: otherlv_0= 'var' ( (lv_varName_1_0= ruleVarName ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getVarsAccess().getVarKeyword_0());
            		
            // InternalMultiNameDsl.g:355:3: ( (lv_varName_1_0= ruleVarName ) )
            // InternalMultiNameDsl.g:356:4: (lv_varName_1_0= ruleVarName )
            {
            // InternalMultiNameDsl.g:356:4: (lv_varName_1_0= ruleVarName )
            // InternalMultiNameDsl.g:357:5: lv_varName_1_0= ruleVarName
            {

            					newCompositeNode(grammarAccess.getVarsAccess().getVarNameVarNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_varName_1_0=ruleVarName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarsRule());
            					}
            					set(
            						current,
            						"varName",
            						lv_varName_1_0,
            						"test.multiname.dsl.MultiNameDsl.VarName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getVarsAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVars"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000043000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});

}