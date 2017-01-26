package tuks.mcrl2.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import tuks.mcrl2.dsl.services.MclrDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMclrDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_WS", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "','", "'('", "')'", "'{'", "'}'", "'='", "':'", "';'", "'act'", "'?'", "'|'", "'cons'", "'true'", "'false'", "'!'", "'-'", "'#'", "'['", "'->'", "']'", "'+'", "'/'", "'div'", "'mod'", "'*'", "'=>'", "'||'", "'&&'", "'=='", "'!='", "'<'", "'<='", "'>='", "'>'", "'in'", "'|>'", "'<|'", "'++'", "'.'", "'forall'", "'exists'", "'lambda'", "'eqn'", "'map'", "'proc'", "'||_'", "'<<'", "'@'", "'delta'", "'tau'", "'block'", "'allow'", "'hide'", "'sum'", "'<>'", "'dist'", "'Bool'", "'Pos'", "'Nat'", "'Int'", "'Real'", "'List'", "'Set'", "'Bag'", "'FSet'", "'FBag'", "'struct'", "'sort'", "'glob'", "'var'", "'init'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int RULE_WS=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMclrDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMclrDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMclrDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMclrDsl.g"; }



     	private MclrDslGrammarAccess grammarAccess;

        public InternalMclrDslParser(TokenStream input, MclrDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MclrDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMclrDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMclrDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMclrDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMclrDsl.g:71:1: ruleModel returns [EObject current=null] : ( ( ( 'sort' | 'cons' | 'map' | 'var' | 'eqn' | 'glob' | 'act' | 'proc' )=> (lv_left_0_0= rulemCRL2SpecElt ) )* ( ( 'init' )=> (lv_init_1_0= ruleInit ) ) ( ( 'sort' | 'cons' | 'map' | 'var' | 'eqn' | 'glob' | 'act' | 'proc' )=> (lv_right_2_0= rulemCRL2SpecElt ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        EObject lv_init_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalMclrDsl.g:77:2: ( ( ( ( 'sort' | 'cons' | 'map' | 'var' | 'eqn' | 'glob' | 'act' | 'proc' )=> (lv_left_0_0= rulemCRL2SpecElt ) )* ( ( 'init' )=> (lv_init_1_0= ruleInit ) ) ( ( 'sort' | 'cons' | 'map' | 'var' | 'eqn' | 'glob' | 'act' | 'proc' )=> (lv_right_2_0= rulemCRL2SpecElt ) )* ) )
            // InternalMclrDsl.g:78:2: ( ( ( 'sort' | 'cons' | 'map' | 'var' | 'eqn' | 'glob' | 'act' | 'proc' )=> (lv_left_0_0= rulemCRL2SpecElt ) )* ( ( 'init' )=> (lv_init_1_0= ruleInit ) ) ( ( 'sort' | 'cons' | 'map' | 'var' | 'eqn' | 'glob' | 'act' | 'proc' )=> (lv_right_2_0= rulemCRL2SpecElt ) )* )
            {
            // InternalMclrDsl.g:78:2: ( ( ( 'sort' | 'cons' | 'map' | 'var' | 'eqn' | 'glob' | 'act' | 'proc' )=> (lv_left_0_0= rulemCRL2SpecElt ) )* ( ( 'init' )=> (lv_init_1_0= ruleInit ) ) ( ( 'sort' | 'cons' | 'map' | 'var' | 'eqn' | 'glob' | 'act' | 'proc' )=> (lv_right_2_0= rulemCRL2SpecElt ) )* )
            // InternalMclrDsl.g:79:3: ( ( 'sort' | 'cons' | 'map' | 'var' | 'eqn' | 'glob' | 'act' | 'proc' )=> (lv_left_0_0= rulemCRL2SpecElt ) )* ( ( 'init' )=> (lv_init_1_0= ruleInit ) ) ( ( 'sort' | 'cons' | 'map' | 'var' | 'eqn' | 'glob' | 'act' | 'proc' )=> (lv_right_2_0= rulemCRL2SpecElt ) )*
            {
            // InternalMclrDsl.g:79:3: ( ( 'sort' | 'cons' | 'map' | 'var' | 'eqn' | 'glob' | 'act' | 'proc' )=> (lv_left_0_0= rulemCRL2SpecElt ) )*
            loop1:
            do {
                int alt1=2;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // InternalMclrDsl.g:80:4: ( 'sort' | 'cons' | 'map' | 'var' | 'eqn' | 'glob' | 'act' | 'proc' )=> (lv_left_0_0= rulemCRL2SpecElt )
            	    {
            	    // InternalMclrDsl.g:81:4: (lv_left_0_0= rulemCRL2SpecElt )
            	    // InternalMclrDsl.g:82:5: lv_left_0_0= rulemCRL2SpecElt
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getModelAccess().getLeftMCRL2SpecEltParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_left_0_0=rulemCRL2SpecElt();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getModelRule());
            	      					}
            	      					add(
            	      						current,
            	      						"left",
            	      						lv_left_0_0,
            	      						"tuks.mcrl2.dsl.MclrDsl.mCRL2SpecElt");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMclrDsl.g:99:3: ( ( 'init' )=> (lv_init_1_0= ruleInit ) )
            // InternalMclrDsl.g:100:4: ( 'init' )=> (lv_init_1_0= ruleInit )
            {
            // InternalMclrDsl.g:101:4: (lv_init_1_0= ruleInit )
            // InternalMclrDsl.g:102:5: lv_init_1_0= ruleInit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getModelAccess().getInitInitParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_init_1_0=ruleInit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getModelRule());
              					}
              					set(
              						current,
              						"init",
              						lv_init_1_0,
              						"tuks.mcrl2.dsl.MclrDsl.Init");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMclrDsl.g:119:3: ( ( 'sort' | 'cons' | 'map' | 'var' | 'eqn' | 'glob' | 'act' | 'proc' )=> (lv_right_2_0= rulemCRL2SpecElt ) )*
            loop2:
            do {
                int alt2=2;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // InternalMclrDsl.g:120:4: ( 'sort' | 'cons' | 'map' | 'var' | 'eqn' | 'glob' | 'act' | 'proc' )=> (lv_right_2_0= rulemCRL2SpecElt )
            	    {
            	    // InternalMclrDsl.g:121:4: (lv_right_2_0= rulemCRL2SpecElt )
            	    // InternalMclrDsl.g:122:5: lv_right_2_0= rulemCRL2SpecElt
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getModelAccess().getRightMCRL2SpecEltParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_right_2_0=rulemCRL2SpecElt();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getModelRule());
            	      					}
            	      					add(
            	      						current,
            	      						"right",
            	      						lv_right_2_0,
            	      						"tuks.mcrl2.dsl.MclrDsl.mCRL2SpecElt");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleActionName"
    // InternalMclrDsl.g:143:1: entryRuleActionName returns [EObject current=null] : iv_ruleActionName= ruleActionName EOF ;
    public final EObject entryRuleActionName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionName = null;


        try {
            // InternalMclrDsl.g:143:51: (iv_ruleActionName= ruleActionName EOF )
            // InternalMclrDsl.g:144:2: iv_ruleActionName= ruleActionName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActionNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleActionName=ruleActionName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActionName; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleActionName"


    // $ANTLR start "ruleActionName"
    // InternalMclrDsl.g:150:1: ruleActionName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleActionName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMclrDsl.g:156:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMclrDsl.g:157:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMclrDsl.g:157:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMclrDsl.g:158:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMclrDsl.g:158:3: (lv_name_0_0= RULE_ID )
            // InternalMclrDsl.g:159:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getActionNameAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getActionNameRule());
              				}
              				setWithLastConsumed(
              					current,
              					"name",
              					lv_name_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleActionName"


    // $ANTLR start "entryRuleActionNameList"
    // InternalMclrDsl.g:178:1: entryRuleActionNameList returns [EObject current=null] : iv_ruleActionNameList= ruleActionNameList EOF ;
    public final EObject entryRuleActionNameList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionNameList = null;


        try {
            // InternalMclrDsl.g:178:55: (iv_ruleActionNameList= ruleActionNameList EOF )
            // InternalMclrDsl.g:179:2: iv_ruleActionNameList= ruleActionNameList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActionNameListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleActionNameList=ruleActionNameList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActionNameList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleActionNameList"


    // $ANTLR start "ruleActionNameList"
    // InternalMclrDsl.g:185:1: ruleActionNameList returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleActionNameList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMclrDsl.g:191:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // InternalMclrDsl.g:192:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // InternalMclrDsl.g:192:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // InternalMclrDsl.g:193:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // InternalMclrDsl.g:193:3: ( (otherlv_0= RULE_ID ) )
            // InternalMclrDsl.g:194:4: (otherlv_0= RULE_ID )
            {
            // InternalMclrDsl.g:194:4: (otherlv_0= RULE_ID )
            // InternalMclrDsl.g:195:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getActionNameListRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getActionNameListAccess().getId_listActionNameCrossReference_0_0());
              				
            }

            }


            }

            // InternalMclrDsl.g:206:3: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMclrDsl.g:207:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,11,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getActionNameListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalMclrDsl.g:211:4: ( (otherlv_2= RULE_ID ) )
            	    // InternalMclrDsl.g:212:5: (otherlv_2= RULE_ID )
            	    {
            	    // InternalMclrDsl.g:212:5: (otherlv_2= RULE_ID )
            	    // InternalMclrDsl.g:213:6: otherlv_2= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getActionNameListRule());
            	      						}
            	      					
            	    }
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_2, grammarAccess.getActionNameListAccess().getId_listActionNameCrossReference_1_1_0());
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleActionNameList"


    // $ANTLR start "entryRuleAction"
    // InternalMclrDsl.g:229:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalMclrDsl.g:229:47: (iv_ruleAction= ruleAction EOF )
            // InternalMclrDsl.g:230:2: iv_ruleAction= ruleAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalMclrDsl.g:236:1: ruleAction returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_exp_2_0= ruleDataExprList ) ) otherlv_3= ')' )? ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalMclrDsl.g:242:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_exp_2_0= ruleDataExprList ) ) otherlv_3= ')' )? ) )
            // InternalMclrDsl.g:243:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_exp_2_0= ruleDataExprList ) ) otherlv_3= ')' )? )
            {
            // InternalMclrDsl.g:243:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_exp_2_0= ruleDataExprList ) ) otherlv_3= ')' )? )
            // InternalMclrDsl.g:244:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_exp_2_0= ruleDataExprList ) ) otherlv_3= ')' )?
            {
            // InternalMclrDsl.g:244:3: ( (otherlv_0= RULE_ID ) )
            // InternalMclrDsl.g:245:4: (otherlv_0= RULE_ID )
            {
            // InternalMclrDsl.g:245:4: (otherlv_0= RULE_ID )
            // InternalMclrDsl.g:246:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getActionRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getActionAccess().getIdActionNameCrossReference_0_0());
              				
            }

            }


            }

            // InternalMclrDsl.g:257:3: (otherlv_1= '(' ( (lv_exp_2_0= ruleDataExprList ) ) otherlv_3= ')' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMclrDsl.g:258:4: otherlv_1= '(' ( (lv_exp_2_0= ruleDataExprList ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getActionAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalMclrDsl.g:262:4: ( (lv_exp_2_0= ruleDataExprList ) )
                    // InternalMclrDsl.g:263:5: (lv_exp_2_0= ruleDataExprList )
                    {
                    // InternalMclrDsl.g:263:5: (lv_exp_2_0= ruleDataExprList )
                    // InternalMclrDsl.g:264:6: lv_exp_2_0= ruleDataExprList
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getActionAccess().getExpDataExprListParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_9);
                    lv_exp_2_0=ruleDataExprList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getActionRule());
                      						}
                      						set(
                      							current,
                      							"exp",
                      							lv_exp_2_0,
                      							"tuks.mcrl2.dsl.MclrDsl.DataExprList");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getActionAccess().getRightParenthesisKeyword_1_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleActIdSet"
    // InternalMclrDsl.g:290:1: entryRuleActIdSet returns [EObject current=null] : iv_ruleActIdSet= ruleActIdSet EOF ;
    public final EObject entryRuleActIdSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActIdSet = null;


        try {
            // InternalMclrDsl.g:290:49: (iv_ruleActIdSet= ruleActIdSet EOF )
            // InternalMclrDsl.g:291:2: iv_ruleActIdSet= ruleActIdSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActIdSetRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleActIdSet=ruleActIdSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActIdSet; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleActIdSet"


    // $ANTLR start "ruleActIdSet"
    // InternalMclrDsl.g:297:1: ruleActIdSet returns [EObject current=null] : (otherlv_0= '{' ( (lv_ids_1_0= ruleActionNameList ) ) otherlv_2= '}' ) ;
    public final EObject ruleActIdSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_ids_1_0 = null;



        	enterRule();

        try {
            // InternalMclrDsl.g:303:2: ( (otherlv_0= '{' ( (lv_ids_1_0= ruleActionNameList ) ) otherlv_2= '}' ) )
            // InternalMclrDsl.g:304:2: (otherlv_0= '{' ( (lv_ids_1_0= ruleActionNameList ) ) otherlv_2= '}' )
            {
            // InternalMclrDsl.g:304:2: (otherlv_0= '{' ( (lv_ids_1_0= ruleActionNameList ) ) otherlv_2= '}' )
            // InternalMclrDsl.g:305:3: otherlv_0= '{' ( (lv_ids_1_0= ruleActionNameList ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getActIdSetAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalMclrDsl.g:309:3: ( (lv_ids_1_0= ruleActionNameList ) )
            // InternalMclrDsl.g:310:4: (lv_ids_1_0= ruleActionNameList )
            {
            // InternalMclrDsl.g:310:4: (lv_ids_1_0= ruleActionNameList )
            // InternalMclrDsl.g:311:5: lv_ids_1_0= ruleActionNameList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getActIdSetAccess().getIdsActionNameListParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_10);
            lv_ids_1_0=ruleActionNameList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getActIdSetRule());
              					}
              					set(
              						current,
              						"ids",
              						lv_ids_1_0,
              						"tuks.mcrl2.dsl.MclrDsl.ActionNameList");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getActIdSetAccess().getRightCurlyBracketKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleActIdSet"


    // $ANTLR start "entryRuleAssignment"
    // InternalMclrDsl.g:336:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalMclrDsl.g:336:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalMclrDsl.g:337:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalMclrDsl.g:343:1: ruleAssignment returns [EObject current=null] : ( ( (lv_id_0_0= ruleVarName ) ) otherlv_1= '=' ( (lv_data_exp_2_0= ruleDataExpr ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_id_0_0 = null;

        EObject lv_data_exp_2_0 = null;



        	enterRule();

        try {
            // InternalMclrDsl.g:349:2: ( ( ( (lv_id_0_0= ruleVarName ) ) otherlv_1= '=' ( (lv_data_exp_2_0= ruleDataExpr ) ) ) )
            // InternalMclrDsl.g:350:2: ( ( (lv_id_0_0= ruleVarName ) ) otherlv_1= '=' ( (lv_data_exp_2_0= ruleDataExpr ) ) )
            {
            // InternalMclrDsl.g:350:2: ( ( (lv_id_0_0= ruleVarName ) ) otherlv_1= '=' ( (lv_data_exp_2_0= ruleDataExpr ) ) )
            // InternalMclrDsl.g:351:3: ( (lv_id_0_0= ruleVarName ) ) otherlv_1= '=' ( (lv_data_exp_2_0= ruleDataExpr ) )
            {
            // InternalMclrDsl.g:351:3: ( (lv_id_0_0= ruleVarName ) )
            // InternalMclrDsl.g:352:4: (lv_id_0_0= ruleVarName )
            {
            // InternalMclrDsl.g:352:4: (lv_id_0_0= ruleVarName )
            // InternalMclrDsl.g:353:5: lv_id_0_0= ruleVarName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAssignmentAccess().getIdVarNameParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_id_0_0=ruleVarName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAssignmentRule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_0_0,
              						"tuks.mcrl2.dsl.MclrDsl.VarName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalMclrDsl.g:374:3: ( (lv_data_exp_2_0= ruleDataExpr ) )
            // InternalMclrDsl.g:375:4: (lv_data_exp_2_0= ruleDataExpr )
            {
            // InternalMclrDsl.g:375:4: (lv_data_exp_2_0= ruleDataExpr )
            // InternalMclrDsl.g:376:5: lv_data_exp_2_0= ruleDataExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAssignmentAccess().getData_expDataExprParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_data_exp_2_0=ruleDataExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAssignmentRule());
              					}
              					set(
              						current,
              						"data_exp",
              						lv_data_exp_2_0,
              						"tuks.mcrl2.dsl.MclrDsl.DataExpr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleAssignmentList"
    // InternalMclrDsl.g:397:1: entryRuleAssignmentList returns [EObject current=null] : iv_ruleAssignmentList= ruleAssignmentList EOF ;
    public final EObject entryRuleAssignmentList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentList = null;


        try {
            // InternalMclrDsl.g:397:55: (iv_ruleAssignmentList= ruleAssignmentList EOF )
            // InternalMclrDsl.g:398:2: iv_ruleAssignmentList= ruleAssignmentList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssignmentList=ruleAssignmentList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignmentList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAssignmentList"


    // $ANTLR start "ruleAssignmentList"
    // InternalMclrDsl.g:404:1: ruleAssignmentList returns [EObject current=null] : ( ( (lv_ass_0_0= ruleAssignment ) ) (otherlv_1= ',' ( (lv_ass_2_0= ruleAssignment ) ) )* ) ;
    public final EObject ruleAssignmentList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ass_0_0 = null;

        EObject lv_ass_2_0 = null;



        	enterRule();

        try {
            // InternalMclrDsl.g:410:2: ( ( ( (lv_ass_0_0= ruleAssignment ) ) (otherlv_1= ',' ( (lv_ass_2_0= ruleAssignment ) ) )* ) )
            // InternalMclrDsl.g:411:2: ( ( (lv_ass_0_0= ruleAssignment ) ) (otherlv_1= ',' ( (lv_ass_2_0= ruleAssignment ) ) )* )
            {
            // InternalMclrDsl.g:411:2: ( ( (lv_ass_0_0= ruleAssignment ) ) (otherlv_1= ',' ( (lv_ass_2_0= ruleAssignment ) ) )* )
            // InternalMclrDsl.g:412:3: ( (lv_ass_0_0= ruleAssignment ) ) (otherlv_1= ',' ( (lv_ass_2_0= ruleAssignment ) ) )*
            {
            // InternalMclrDsl.g:412:3: ( (lv_ass_0_0= ruleAssignment ) )
            // InternalMclrDsl.g:413:4: (lv_ass_0_0= ruleAssignment )
            {
            // InternalMclrDsl.g:413:4: (lv_ass_0_0= ruleAssignment )
            // InternalMclrDsl.g:414:5: lv_ass_0_0= ruleAssignment
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAssignmentListAccess().getAssAssignmentParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_ass_0_0=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAssignmentListRule());
              					}
              					add(
              						current,
              						"ass",
              						lv_ass_0_0,
              						"tuks.mcrl2.dsl.MclrDsl.Assignment");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMclrDsl.g:431:3: (otherlv_1= ',' ( (lv_ass_2_0= ruleAssignment ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==11) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMclrDsl.g:432:4: otherlv_1= ',' ( (lv_ass_2_0= ruleAssignment ) )
            	    {
            	    otherlv_1=(Token)match(input,11,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getAssignmentListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalMclrDsl.g:436:4: ( (lv_ass_2_0= ruleAssignment ) )
            	    // InternalMclrDsl.g:437:5: (lv_ass_2_0= ruleAssignment )
            	    {
            	    // InternalMclrDsl.g:437:5: (lv_ass_2_0= ruleAssignment )
            	    // InternalMclrDsl.g:438:6: lv_ass_2_0= ruleAssignment
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAssignmentListAccess().getAssAssignmentParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_ass_2_0=ruleAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAssignmentListRule());
            	      						}
            	      						add(
            	      							current,
            	      							"ass",
            	      							lv_ass_2_0,
            	      							"tuks.mcrl2.dsl.MclrDsl.Assignment");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAssignmentList"


    // $ANTLR start "entryRuleActList"
    // InternalMclrDsl.g:460:1: entryRuleActList returns [EObject current=null] : iv_ruleActList= ruleActList EOF ;
    public final EObject entryRuleActList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActList = null;


        try {
            // InternalMclrDsl.g:460:48: (iv_ruleActList= ruleActList EOF )
            // InternalMclrDsl.g:461:2: iv_ruleActList= ruleActList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleActList=ruleActList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleActList"


    // $ANTLR start "ruleActList"
    // InternalMclrDsl.g:467:1: ruleActList returns [EObject current=null] : ( ( (lv_id_list_0_0= ruleActionName ) ) (otherlv_1= ',' ( (lv_id_list_2_0= ruleActionName ) ) )* ) ;
    public final EObject ruleActList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_id_list_0_0 = null;

        EObject lv_id_list_2_0 = null;



        	enterRule();

        try {
            // InternalMclrDsl.g:473:2: ( ( ( (lv_id_list_0_0= ruleActionName ) ) (otherlv_1= ',' ( (lv_id_list_2_0= ruleActionName ) ) )* ) )
            // InternalMclrDsl.g:474:2: ( ( (lv_id_list_0_0= ruleActionName ) ) (otherlv_1= ',' ( (lv_id_list_2_0= ruleActionName ) ) )* )
            {
            // InternalMclrDsl.g:474:2: ( ( (lv_id_list_0_0= ruleActionName ) ) (otherlv_1= ',' ( (lv_id_list_2_0= ruleActionName ) ) )* )
            // InternalMclrDsl.g:475:3: ( (lv_id_list_0_0= ruleActionName ) ) (otherlv_1= ',' ( (lv_id_list_2_0= ruleActionName ) ) )*
            {
            // InternalMclrDsl.g:475:3: ( (lv_id_list_0_0= ruleActionName ) )
            // InternalMclrDsl.g:476:4: (lv_id_list_0_0= ruleActionName )
            {
            // InternalMclrDsl.g:476:4: (lv_id_list_0_0= ruleActionName )
            // InternalMclrDsl.g:477:5: lv_id_list_0_0= ruleActionName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getActListAccess().getId_listActionNameParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_id_list_0_0=ruleActionName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getActListRule());
              					}
              					add(
              						current,
              						"id_list",
              						lv_id_list_0_0,
              						"tuks.mcrl2.dsl.MclrDsl.ActionName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMclrDsl.g:494:3: (otherlv_1= ',' ( (lv_id_list_2_0= ruleActionName ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==11) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMclrDsl.g:495:4: otherlv_1= ',' ( (lv_id_list_2_0= ruleActionName ) )
            	    {
            	    otherlv_1=(Token)match(input,11,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getActListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalMclrDsl.g:499:4: ( (lv_id_list_2_0= ruleActionName ) )
            	    // InternalMclrDsl.g:500:5: (lv_id_list_2_0= ruleActionName )
            	    {
            	    // InternalMclrDsl.g:500:5: (lv_id_list_2_0= ruleActionName )
            	    // InternalMclrDsl.g:501:6: lv_id_list_2_0= ruleActionName
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getActListAccess().getId_listActionNameParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_id_list_2_0=ruleActionName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getActListRule());
            	      						}
            	      						add(
            	      							current,
            	      							"id_list",
            	      							lv_id_list_2_0,
            	      							"tuks.mcrl2.dsl.MclrDsl.ActionName");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleActList"


    // $ANTLR start "entryRuleActDecl"
    // InternalMclrDsl.g:523:1: entryRuleActDecl returns [EObject current=null] : iv_ruleActDecl= ruleActDecl EOF ;
    public final EObject entryRuleActDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActDecl = null;


        try {
            // InternalMclrDsl.g:523:48: (iv_ruleActDecl= ruleActDecl EOF )
            // InternalMclrDsl.g:524:2: iv_ruleActDecl= ruleActDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleActDecl=ruleActDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleActDecl"


    // $ANTLR start "ruleActDecl"
    // InternalMclrDsl.g:530:1: ruleActDecl returns [EObject current=null] : ( ( (lv_id_0_0= ruleActList ) ) (otherlv_1= ':' ( (lv_sort_2_0= ruleSortExpr ) ) )? otherlv_3= ';' ) ;
    public final EObject ruleActDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_id_0_0 = null;

        EObject lv_sort_2_0 = null;



        	enterRule();

        try {
            // InternalMclrDsl.g:536:2: ( ( ( (lv_id_0_0= ruleActList ) ) (otherlv_1= ':' ( (lv_sort_2_0= ruleSortExpr ) ) )? otherlv_3= ';' ) )
            // InternalMclrDsl.g:537:2: ( ( (lv_id_0_0= ruleActList ) ) (otherlv_1= ':' ( (lv_sort_2_0= ruleSortExpr ) ) )? otherlv_3= ';' )
            {
            // InternalMclrDsl.g:537:2: ( ( (lv_id_0_0= ruleActList ) ) (otherlv_1= ':' ( (lv_sort_2_0= ruleSortExpr ) ) )? otherlv_3= ';' )
            // InternalMclrDsl.g:538:3: ( (lv_id_0_0= ruleActList ) ) (otherlv_1= ':' ( (lv_sort_2_0= ruleSortExpr ) ) )? otherlv_3= ';'
            {
            // InternalMclrDsl.g:538:3: ( (lv_id_0_0= ruleActList ) )
            // InternalMclrDsl.g:539:4: (lv_id_0_0= ruleActList )
            {
            // InternalMclrDsl.g:539:4: (lv_id_0_0= ruleActList )
            // InternalMclrDsl.g:540:5: lv_id_0_0= ruleActList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getActDeclAccess().getIdActListParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_id_0_0=ruleActList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getActDeclRule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_0_0,
              						"tuks.mcrl2.dsl.MclrDsl.ActList");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMclrDsl.g:557:3: (otherlv_1= ':' ( (lv_sort_2_0= ruleSortExpr ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMclrDsl.g:558:4: otherlv_1= ':' ( (lv_sort_2_0= ruleSortExpr ) )
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getActDeclAccess().getColonKeyword_1_0());
                      			
                    }
                    // InternalMclrDsl.g:562:4: ( (lv_sort_2_0= ruleSortExpr ) )
                    // InternalMclrDsl.g:563:5: (lv_sort_2_0= ruleSortExpr )
                    {
                    // InternalMclrDsl.g:563:5: (lv_sort_2_0= ruleSortExpr )
                    // InternalMclrDsl.g:564:6: lv_sort_2_0= ruleSortExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getActDeclAccess().getSortSortExprParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_14);
                    lv_sort_2_0=ruleSortExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getActDeclRule());
                      						}
                      						set(
                      							current,
                      							"sort",
                      							lv_sort_2_0,
                      							"tuks.mcrl2.dsl.MclrDsl.SortExpr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getActDeclAccess().getSemicolonKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleActDecl"


    // $ANTLR start "entryRuleActSpec"
    // InternalMclrDsl.g:590:1: entryRuleActSpec returns [EObject current=null] : iv_ruleActSpec= ruleActSpec EOF ;
    public final EObject entryRuleActSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActSpec = null;


        try {
            // InternalMclrDsl.g:590:48: (iv_ruleActSpec= ruleActSpec EOF )
            // InternalMclrDsl.g:591:2: iv_ruleActSpec= ruleActSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleActSpec=ruleActSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActSpec; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleActSpec"


    // $ANTLR start "ruleActSpec"
    // InternalMclrDsl.g:597:1: ruleActSpec returns [EObject current=null] : (otherlv_0= 'act' ( (lv_act_list_1_0= ruleActDecl ) )+ ) ;
    public final EObject ruleActSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_act_list_1_0 = null;



        	enterRule();

        try {
            // InternalMclrDsl.g:603:2: ( (otherlv_0= 'act' ( (lv_act_list_1_0= ruleActDecl ) )+ ) )
            // InternalMclrDsl.g:604:2: (otherlv_0= 'act' ( (lv_act_list_1_0= ruleActDecl ) )+ )
            {
            // InternalMclrDsl.g:604:2: (otherlv_0= 'act' ( (lv_act_list_1_0= ruleActDecl ) )+ )
            // InternalMclrDsl.g:605:3: otherlv_0= 'act' ( (lv_act_list_1_0= ruleActDecl ) )+
            {
            otherlv_0=(Token)match(input,19,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getActSpecAccess().getActKeyword_0());
              		
            }
            // InternalMclrDsl.g:609:3: ( (lv_act_list_1_0= ruleActDecl ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMclrDsl.g:610:4: (lv_act_list_1_0= ruleActDecl )
            	    {
            	    // InternalMclrDsl.g:610:4: (lv_act_list_1_0= ruleActDecl )
            	    // InternalMclrDsl.g:611:5: lv_act_list_1_0= ruleActDecl
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getActSpecAccess().getAct_listActDeclParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_15);
            	    lv_act_list_1_0=ruleActDecl();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getActSpecRule());
            	      					}
            	      					add(
            	      						current,
            	      						"act_list",
            	      						lv_act_list_1_0,
            	      						"tuks.mcrl2.dsl.MclrDsl.ActDecl");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleActSpec"


    // $ANTLR start "entryRuleBagEnumElt"
    // InternalMclrDsl.g:632:1: entryRuleBagEnumElt returns [EObject current=null] : iv_ruleBagEnumElt= ruleBagEnumElt EOF ;
    public final EObject entryRuleBagEnumElt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBagEnumElt = null;


        try {
            // InternalMclrDsl.g:632:51: (iv_ruleBagEnumElt= ruleBagEnumElt EOF )
            // InternalMclrDsl.g:633:2: iv_ruleBagEnumElt= ruleBagEnumElt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBagEnumEltRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBagEnumElt=ruleBagEnumElt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBagEnumElt; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBagEnumElt"


    // $ANTLR start "ruleBagEnumElt"
    // InternalMclrDsl.g:639:1: ruleBagEnumElt returns [EObject current=null] : ( ( (lv_left_0_0= ruleDataExpr ) ) otherlv_1= ':' ( (lv_right_2_0= ruleDataExpr ) ) ) ;
    public final EObject ruleBagEnumElt() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalMclrDsl.g:645:2: ( ( ( (lv_left_0_0= ruleDataExpr ) ) otherlv_1= ':' ( (lv_right_2_0= ruleDataExpr ) ) ) )
            // InternalMclrDsl.g:646:2: ( ( (lv_left_0_0= ruleDataExpr ) ) otherlv_1= ':' ( (lv_right_2_0= ruleDataExpr ) ) )
            {
            // InternalMclrDsl.g:646:2: ( ( (lv_left_0_0= ruleDataExpr ) ) otherlv_1= ':' ( (lv_right_2_0= ruleDataExpr ) ) )
            // InternalMclrDsl.g:647:3: ( (lv_left_0_0= ruleDataExpr ) ) otherlv_1= ':' ( (lv_right_2_0= ruleDataExpr ) )
            {
            // InternalMclrDsl.g:647:3: ( (lv_left_0_0= ruleDataExpr ) )
            // InternalMclrDsl.g:648:4: (lv_left_0_0= ruleDataExpr )
            {
            // InternalMclrDsl.g:648:4: (lv_left_0_0= ruleDataExpr )
            // InternalMclrDsl.g:649:5: lv_left_0_0= ruleDataExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBagEnumEltAccess().getLeftDataExprParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_left_0_0=ruleDataExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBagEnumEltRule());
              					}
              					set(
              						current,
              						"left",
              						lv_left_0_0,
              						"tuks.mcrl2.dsl.MclrDsl.DataExpr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBagEnumEltAccess().getColonKeyword_1());
              		
            }
            // InternalMclrDsl.g:670:3: ( (lv_right_2_0= ruleDataExpr ) )
            // InternalMclrDsl.g:671:4: (lv_right_2_0= ruleDataExpr )
            {
            // InternalMclrDsl.g:671:4: (lv_right_2_0= ruleDataExpr )
            // InternalMclrDsl.g:672:5: lv_right_2_0= ruleDataExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBagEnumEltAccess().getRightDataExprParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_right_2_0=ruleDataExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBagEnumEltRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_2_0,
              						"tuks.mcrl2.dsl.MclrDsl.DataExpr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBagEnumElt"


    // $ANTLR start "entryRuleBagEnumEltList"
    // InternalMclrDsl.g:693:1: entryRuleBagEnumEltList returns [EObject current=null] : iv_ruleBagEnumEltList= ruleBagEnumEltList EOF ;
    public final EObject entryRuleBagEnumEltList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBagEnumEltList = null;


        try {
            // InternalMclrDsl.g:693:55: (iv_ruleBagEnumEltList= ruleBagEnumEltList EOF )
            // InternalMclrDsl.g:694:2: iv_ruleBagEnumEltList= ruleBagEnumEltList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBagEnumEltListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBagEnumEltList=ruleBagEnumEltList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBagEnumEltList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBagEnumEltList"


    // $ANTLR start "ruleBagEnumEltList"
    // InternalMclrDsl.g:700:1: ruleBagEnumEltList returns [EObject current=null] : ( ( (lv_bag_list_0_0= ruleBagEnumElt ) ) (otherlv_1= ',' ( (lv_bag_list_2_0= ruleBagEnumElt ) ) )* ) ;
    public final EObject ruleBagEnumEltList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_bag_list_0_0 = null;

        EObject lv_bag_list_2_0 = null;



        	enterRule();

        try {
            // InternalMclrDsl.g:706:2: ( ( ( (lv_bag_list_0_0= ruleBagEnumElt ) ) (otherlv_1= ',' ( (lv_bag_list_2_0= ruleBagEnumElt ) ) )* ) )
            // InternalMclrDsl.g:707:2: ( ( (lv_bag_list_0_0= ruleBagEnumElt ) ) (otherlv_1= ',' ( (lv_bag_list_2_0= ruleBagEnumElt ) ) )* )
            {
            // InternalMclrDsl.g:707:2: ( ( (lv_bag_list_0_0= ruleBagEnumElt ) ) (otherlv_1= ',' ( (lv_bag_list_2_0= ruleBagEnumElt ) ) )* )
            // InternalMclrDsl.g:708:3: ( (lv_bag_list_0_0= ruleBagEnumElt ) ) (otherlv_1= ',' ( (lv_bag_list_2_0= ruleBagEnumElt ) ) )*
            {
            // InternalMclrDsl.g:708:3: ( (lv_bag_list_0_0= ruleBagEnumElt ) )
            // InternalMclrDsl.g:709:4: (lv_bag_list_0_0= ruleBagEnumElt )
            {
            // InternalMclrDsl.g:709:4: (lv_bag_list_0_0= ruleBagEnumElt )
            // InternalMclrDsl.g:710:5: lv_bag_list_0_0= ruleBagEnumElt
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBagEnumEltListAccess().getBag_listBagEnumEltParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_bag_list_0_0=ruleBagEnumElt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBagEnumEltListRule());
              					}
              					add(
              						current,
              						"bag_list",
              						lv_bag_list_0_0,
              						"tuks.mcrl2.dsl.MclrDsl.BagEnumElt");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMclrDsl.g:727:3: (otherlv_1= ',' ( (lv_bag_list_2_0= ruleBagEnumElt ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==11) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMclrDsl.g:728:4: otherlv_1= ',' ( (lv_bag_list_2_0= ruleBagEnumElt ) )
            	    {
            	    otherlv_1=(Token)match(input,11,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getBagEnumEltListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalMclrDsl.g:732:4: ( (lv_bag_list_2_0= ruleBagEnumElt ) )
            	    // InternalMclrDsl.g:733:5: (lv_bag_list_2_0= ruleBagEnumElt )
            	    {
            	    // InternalMclrDsl.g:733:5: (lv_bag_list_2_0= ruleBagEnumElt )
            	    // InternalMclrDsl.g:734:6: lv_bag_list_2_0= ruleBagEnumElt
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getBagEnumEltListAccess().getBag_listBagEnumEltParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_bag_list_2_0=ruleBagEnumElt();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getBagEnumEltListRule());
            	      						}
            	      						add(
            	      							current,
            	      							"bag_list",
            	      							lv_bag_list_2_0,
            	      							"tuks.mcrl2.dsl.MclrDsl.BagEnumElt");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBagEnumEltList"


    // $ANTLR start "entryRuleConstrName"
    // InternalMclrDsl.g:756:1: entryRuleConstrName returns [EObject current=null] : iv_ruleConstrName= ruleConstrName EOF ;
    public final EObject entryRuleConstrName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstrName = null;


        try {
            // InternalMclrDsl.g:756:51: (iv_ruleConstrName= ruleConstrName EOF )
            // InternalMclrDsl.g:757:2: iv_ruleConstrName= ruleConstrName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstrNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConstrName=ruleConstrName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstrName; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConstrName"


    // $ANTLR start "ruleConstrName"
    // InternalMclrDsl.g:763:1: ruleConstrName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleConstrName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMclrDsl.g:769:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMclrDsl.g:770:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMclrDsl.g:770:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMclrDsl.g:771:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMclrDsl.g:771:3: (lv_name_0_0= RULE_ID )
            // InternalMclrDsl.g:772:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getConstrNameAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getConstrNameRule());
              				}
              				setWithLastConsumed(
              					current,
              					"name",
              					lv_name_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleConstrName"


    // $ANTLR start "entryRuleConstrDecl"
    // InternalMclrDsl.g:791:1: entryRuleConstrDecl returns [EObject current=null] : iv_ruleConstrDecl= ruleConstrDecl EOF ;
    public final EObject entryRuleConstrDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstrDecl = null;


        try {
            // InternalMclrDsl.g:791:51: (iv_ruleConstrDecl= ruleConstrDecl EOF )
            // InternalMclrDsl.g:792:2: iv_ruleConstrDecl= ruleConstrDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstrDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConstrDecl=ruleConstrDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstrDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConstrDecl"


    // $ANTLR start "ruleConstrDecl"
    // InternalMclrDsl.g:798:1: ruleConstrDecl returns [EObject current=null] : ( ( (lv_id_0_0= ruleConstrName ) ) ( ( '(' )=> (otherlv_1= '(' ( (lv_proj_2_0= ruleProjDeclList ) ) otherlv_3= ')' ) )? ( ( '?' )=> (otherlv_4= '?' ( (lv_right_id_5_0= RULE_ID ) ) ) )? ) ;
    public final EObject ruleConstrDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_right_id_5_0=null;
        EObject lv_id_0_0 = null;

        EObject lv_proj_2_0 = null;



        	enterRule();

        try {
            // InternalMclrDsl.g:804:2: ( ( ( (lv_id_0_0= ruleConstrName ) ) ( ( '(' )=> (otherlv_1= '(' ( (lv_proj_2_0= ruleProjDeclList ) ) otherlv_3= ')' ) )? ( ( '?' )=> (otherlv_4= '?' ( (lv_right_id_5_0= RULE_ID ) ) ) )? ) )
            // InternalMclrDsl.g:805:2: ( ( (lv_id_0_0= ruleConstrName ) ) ( ( '(' )=> (otherlv_1= '(' ( (lv_proj_2_0= ruleProjDeclList ) ) otherlv_3= ')' ) )? ( ( '?' )=> (otherlv_4= '?' ( (lv_right_id_5_0= RULE_ID ) ) ) )? )
            {
            // InternalMclrDsl.g:805:2: ( ( (lv_id_0_0= ruleConstrName ) ) ( ( '(' )=> (otherlv_1= '(' ( (lv_proj_2_0= ruleProjDeclList ) ) otherlv_3= ')' ) )? ( ( '?' )=> (otherlv_4= '?' ( (lv_right_id_5_0= RULE_ID ) ) ) )? )
            // InternalMclrDsl.g:806:3: ( (lv_id_0_0= ruleConstrName ) ) ( ( '(' )=> (otherlv_1= '(' ( (lv_proj_2_0= ruleProjDeclList ) ) otherlv_3= ')' ) )? ( ( '?' )=> (otherlv_4= '?' ( (lv_right_id_5_0= RULE_ID ) ) ) )?
            {
            // InternalMclrDsl.g:806:3: ( (lv_id_0_0= ruleConstrName ) )
            // InternalMclrDsl.g:807:4: (lv_id_0_0= ruleConstrName )
            {
            // InternalMclrDsl.g:807:4: (lv_id_0_0= ruleConstrName )
            // InternalMclrDsl.g:808:5: lv_id_0_0= ruleConstrName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConstrDeclAccess().getIdConstrNameParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_id_0_0=ruleConstrName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConstrDeclRule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_0_0,
              						"tuks.mcrl2.dsl.MclrDsl.ConstrName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMclrDsl.g:825:3: ( ( '(' )=> (otherlv_1= '(' ( (lv_proj_2_0= ruleProjDeclList ) ) otherlv_3= ')' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==12) && (synpred4_InternalMclrDsl())) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMclrDsl.g:826:4: ( '(' )=> (otherlv_1= '(' ( (lv_proj_2_0= ruleProjDeclList ) ) otherlv_3= ')' )
                    {
                    // InternalMclrDsl.g:827:4: (otherlv_1= '(' ( (lv_proj_2_0= ruleProjDeclList ) ) otherlv_3= ')' )
                    // InternalMclrDsl.g:828:5: otherlv_1= '(' ( (lv_proj_2_0= ruleProjDeclList ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getConstrDeclAccess().getLeftParenthesisKeyword_1_0_0());
                      				
                    }
                    // InternalMclrDsl.g:832:5: ( (lv_proj_2_0= ruleProjDeclList ) )
                    // InternalMclrDsl.g:833:6: (lv_proj_2_0= ruleProjDeclList )
                    {
                    // InternalMclrDsl.g:833:6: (lv_proj_2_0= ruleProjDeclList )
                    // InternalMclrDsl.g:834:7: lv_proj_2_0= ruleProjDeclList
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getConstrDeclAccess().getProjProjDeclListParserRuleCall_1_0_1_0());
                      						
                    }
                    pushFollow(FOLLOW_9);
                    lv_proj_2_0=ruleProjDeclList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getConstrDeclRule());
                      							}
                      							set(
                      								current,
                      								"proj",
                      								lv_proj_2_0,
                      								"tuks.mcrl2.dsl.MclrDsl.ProjDeclList");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,13,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getConstrDeclAccess().getRightParenthesisKeyword_1_0_2());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMclrDsl.g:857:3: ( ( '?' )=> (otherlv_4= '?' ( (lv_right_id_5_0= RULE_ID ) ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) && (synpred5_InternalMclrDsl())) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMclrDsl.g:858:4: ( '?' )=> (otherlv_4= '?' ( (lv_right_id_5_0= RULE_ID ) ) )
                    {
                    // InternalMclrDsl.g:859:4: (otherlv_4= '?' ( (lv_right_id_5_0= RULE_ID ) ) )
                    // InternalMclrDsl.g:860:5: otherlv_4= '?' ( (lv_right_id_5_0= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getConstrDeclAccess().getQuestionMarkKeyword_2_0_0());
                      				
                    }
                    // InternalMclrDsl.g:864:5: ( (lv_right_id_5_0= RULE_ID ) )
                    // InternalMclrDsl.g:865:6: (lv_right_id_5_0= RULE_ID )
                    {
                    // InternalMclrDsl.g:865:6: (lv_right_id_5_0= RULE_ID )
                    // InternalMclrDsl.g:866:7: lv_right_id_5_0= RULE_ID
                    {
                    lv_right_id_5_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_right_id_5_0, grammarAccess.getConstrDeclAccess().getRight_idIDTerminalRuleCall_2_0_1_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getConstrDeclRule());
                      							}
                      							setWithLastConsumed(
                      								current,
                      								"right_id",
                      								lv_right_id_5_0,
                      								"org.eclipse.xtext.common.Terminals.ID");
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleConstrDecl"


    // $ANTLR start "entryRuleConstrDeclList"
    // InternalMclrDsl.g:888:1: entryRuleConstrDeclList returns [EObject current=null] : iv_ruleConstrDeclList= ruleConstrDeclList EOF ;
    public final EObject entryRuleConstrDeclList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstrDeclList = null;


        try {
            // InternalMclrDsl.g:888:55: (iv_ruleConstrDeclList= ruleConstrDeclList EOF )
            // InternalMclrDsl.g:889:2: iv_ruleConstrDeclList= ruleConstrDeclList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstrDeclListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConstrDeclList=ruleConstrDeclList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstrDeclList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConstrDeclList"


    // $ANTLR start "ruleConstrDeclList"
    // InternalMclrDsl.g:895:1: ruleConstrDeclList returns [EObject current=null] : ( ( (lv_decl_0_0= ruleConstrDecl ) ) (otherlv_1= '|' ( (lv_decl_2_0= ruleConstrDecl ) ) )* ) ;
    public final EObject ruleConstrDeclList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_decl_0_0 = null;

        EObject lv_decl_2_0 = null;



        	enterRule();

        try {
            // InternalMclrDsl.g:901:2: ( ( ( (lv_decl_0_0= ruleConstrDecl ) ) (otherlv_1= '|' ( (lv_decl_2_0= ruleConstrDecl ) ) )* ) )
            // InternalMclrDsl.g:902:2: ( ( (lv_decl_0_0= ruleConstrDecl ) ) (otherlv_1= '|' ( (lv_decl_2_0= ruleConstrDecl ) ) )* )
            {
            // InternalMclrDsl.g:902:2: ( ( (lv_decl_0_0= ruleConstrDecl ) ) (otherlv_1= '|' ( (lv_decl_2_0= ruleConstrDecl ) ) )* )
            // InternalMclrDsl.g:903:3: ( (lv_decl_0_0= ruleConstrDecl ) ) (otherlv_1= '|' ( (lv_decl_2_0= ruleConstrDecl ) ) )*
            {
            // InternalMclrDsl.g:903:3: ( (lv_decl_0_0= ruleConstrDecl ) )
            // InternalMclrDsl.g:904:4: (lv_decl_0_0= ruleConstrDecl )
            {
            // InternalMclrDsl.g:904:4: (lv_decl_0_0= ruleConstrDecl )
            // InternalMclrDsl.g:905:5: lv_decl_0_0= ruleConstrDecl
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConstrDeclListAccess().getDeclConstrDeclParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_decl_0_0=ruleConstrDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConstrDeclListRule());
              					}
              					add(
              						current,
              						"decl",
              						lv_decl_0_0,
              						"tuks.mcrl2.dsl.MclrDsl.ConstrDecl");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMclrDsl.g:922:3: (otherlv_1= '|' ( (lv_decl_2_0= ruleConstrDecl ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==21) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMclrDsl.g:923:4: otherlv_1= '|' ( (lv_decl_2_0= ruleConstrDecl ) )
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getConstrDeclListAccess().getVerticalLineKeyword_1_0());
            	      			
            	    }
            	    // InternalMclrDsl.g:927:4: ( (lv_decl_2_0= ruleConstrDecl ) )
            	    // InternalMclrDsl.g:928:5: (lv_decl_2_0= ruleConstrDecl )
            	    {
            	    // InternalMclrDsl.g:928:5: (lv_decl_2_0= ruleConstrDecl )
            	    // InternalMclrDsl.g:929:6: lv_decl_2_0= ruleConstrDecl
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getConstrDeclListAccess().getDeclConstrDeclParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_19);
            	    lv_decl_2_0=ruleConstrDecl();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getConstrDeclListRule());
            	      						}
            	      						add(
            	      							current,
            	      							"decl",
            	      							lv_decl_2_0,
            	      							"tuks.mcrl2.dsl.MclrDsl.ConstrDecl");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleConstrDeclList"


    // $ANTLR start "entryRuleConsSpec"
    // InternalMclrDsl.g:951:1: entryRuleConsSpec returns [EObject current=null] : iv_ruleConsSpec= ruleConsSpec EOF ;
    public final EObject entryRuleConsSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConsSpec = null;


        try {
            // InternalMclrDsl.g:951:49: (iv_ruleConsSpec= ruleConsSpec EOF )
            // InternalMclrDsl.g:952:2: iv_ruleConsSpec= ruleConsSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConsSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConsSpec=ruleConsSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConsSpec; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConsSpec"


    // $ANTLR start "ruleConsSpec"
    // InternalMclrDsl.g:958:1: ruleConsSpec returns [EObject current=null] : (otherlv_0= 'cons' ( ( (lv_ids_1_0= ruleConstrName ) ) otherlv_2= ';' )+ ) ;
    public final EObject ruleConsSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_ids_1_0 = null;



        	enterRule();

        try {
            // InternalMclrDsl.g:964:2: ( (otherlv_0= 'cons' ( ( (lv_ids_1_0= ruleConstrName ) ) otherlv_2= ';' )+ ) )
            // InternalMclrDsl.g:965:2: (otherlv_0= 'cons' ( ( (lv_ids_1_0= ruleConstrName ) ) otherlv_2= ';' )+ )
            {
            // InternalMclrDsl.g:965:2: (otherlv_0= 'cons' ( ( (lv_ids_1_0= ruleConstrName ) ) otherlv_2= ';' )+ )
            // InternalMclrDsl.g:966:3: otherlv_0= 'cons' ( ( (lv_ids_1_0= ruleConstrName ) ) otherlv_2= ';' )+
            {
            otherlv_0=(Token)match(input,22,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConsSpecAccess().getConsKeyword_0());
              		
            }
            // InternalMclrDsl.g:970:3: ( ( (lv_ids_1_0= ruleConstrName ) ) otherlv_2= ';' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMclrDsl.g:971:4: ( (lv_ids_1_0= ruleConstrName ) ) otherlv_2= ';'
            	    {
            	    // InternalMclrDsl.g:971:4: ( (lv_ids_1_0= ruleConstrName ) )
            	    // InternalMclrDsl.g:972:5: (lv_ids_1_0= ruleConstrName )
            	    {
            	    // InternalMclrDsl.g:972:5: (lv_ids_1_0= ruleConstrName )
            	    // InternalMclrDsl.g:973:6: lv_ids_1_0= ruleConstrName
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getConsSpecAccess().getIdsConstrNameParserRuleCall_1_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_ids_1_0=ruleConstrName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getConsSpecRule());
            	      						}
            	      						add(
            	      							current,
            	      							"ids",
            	      							lv_ids_1_0,
            	      							"tuks.mcrl2.dsl.MclrDsl.ConstrName");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    otherlv_2=(Token)match(input,18,FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getConsSpecAccess().getSemicolonKeyword_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleConsSpec"


    // $ANTLR start "entryRuleDataName"
    // InternalMclrDsl.g:999:1: entryRuleDataName returns [EObject current=null] : iv_ruleDataName= ruleDataName EOF ;
    public final EObject entryRuleDataName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataName = null;


        try {
            // InternalMclrDsl.g:999:49: (iv_ruleDataName= ruleDataName EOF )
            // InternalMclrDsl.g:1000:2: iv_ruleDataName= ruleDataName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDataName=ruleDataName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataName; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDataName"


    // $ANTLR start "ruleDataName"
    // InternalMclrDsl.g:1006:1: ruleDataName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleDataName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMclrDsl.g:1012:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMclrDsl.g:1013:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMclrDsl.g:1013:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMclrDsl.g:1014:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMclrDsl.g:1014:3: (lv_name_0_0= RULE_ID )
            // InternalMclrDsl.g:1015:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getDataNameAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getDataNameRule());
              				}
              				setWithLastConsumed(
              					current,
              					"name",
              					lv_name_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDataName"


    // $ANTLR start "entryRuleDataExprUnit"
    // InternalMclrDsl.g:1034:1: entryRuleDataExprUnit returns [EObject current=null] : iv_ruleDataExprUnit= ruleDataExprUnit EOF ;
    public final EObject entryRuleDataExprUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataExprUnit = null;


        try {
            // InternalMclrDsl.g:1034:53: (iv_ruleDataExprUnit= ruleDataExprUnit EOF )
            // InternalMclrDsl.g:1035:2: iv_ruleDataExprUnit= ruleDataExprUnit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataExprUnitRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDataExprUnit=ruleDataExprUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataExprUnit; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDataExprUnit"


    // $ANTLR start "ruleDataExprUnit"
    // InternalMclrDsl.g:1041:1: ruleDataExprUnit returns [EObject current=null] : ( ( (lv_lower_0_0= ruleDataExprUnitTerm ) ) ( ( '(' )=> (otherlv_1= '(' ( (lv_data_2_0= ruleDataExprList ) ) otherlv_3= ')' ) )? ) ;
    public final EObject ruleDataExprUnit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_lower_0_0 = null;

        EObject lv_data_2_0 = null;



        	enterRule();

        try {
            // InternalMclrDsl.g:1047:2: ( ( ( (lv_lower_0_0= ruleDataExprUnitTerm ) ) ( ( '(' )=> (otherlv_1= '(' ( (lv_data_2_0= ruleDataExprList ) ) otherlv_3= ')' ) )? ) )
            // InternalMclrDsl.g:1048:2: ( ( (lv_lower_0_0= ruleDataExprUnitTerm ) ) ( ( '(' )=> (otherlv_1= '(' ( (lv_data_2_0= ruleDataExprList ) ) otherlv_3= ')' ) )? )
            {
            // InternalMclrDsl.g:1048:2: ( ( (lv_lower_0_0= ruleDataExprUnitTerm ) ) ( ( '(' )=> (otherlv_1= '(' ( (lv_data_2_0= ruleDataExprList ) ) otherlv_3= ')' ) )? )
            // InternalMclrDsl.g:1049:3: ( (lv_lower_0_0= ruleDataExprUnitTerm ) ) ( ( '(' )=> (otherlv_1= '(' ( (lv_data_2_0= ruleDataExprList ) ) otherlv_3= ')' ) )?
            {
            // InternalMclrDsl.g:1049:3: ( (lv_lower_0_0= ruleDataExprUnitTerm ) )
            // InternalMclrDsl.g:1050:4: (lv_lower_0_0= ruleDataExprUnitTerm )
            {
            // InternalMclrDsl.g:1050:4: (lv_lower_0_0= ruleDataExprUnitTerm )
            // InternalMclrDsl.g:1051:5: lv_lower_0_0= ruleDataExprUnitTerm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDataExprUnitAccess().getLowerDataExprUnitTermParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_lower_0_0=ruleDataExprUnitTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDataExprUnitRule());
              					}
              					set(
              						current,
              						"lower",
              						lv_lower_0_0,
              						"tuks.mcrl2.dsl.MclrDsl.DataExprUnitTerm");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMclrDsl.g:1068:3: ( ( '(' )=> (otherlv_1= '(' ( (lv_data_2_0= ruleDataExprList ) ) otherlv_3= ')' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==12) ) {
                int LA14_1 = input.LA(2);

                if ( (synpred6_InternalMclrDsl()) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // InternalMclrDsl.g:1069:4: ( '(' )=> (otherlv_1= '(' ( (lv_data_2_0= ruleDataExprList ) ) otherlv_3= ')' )
                    {
                    // InternalMclrDsl.g:1070:4: (otherlv_1= '(' ( (lv_data_2_0= ruleDataExprList ) ) otherlv_3= ')' )
                    // InternalMclrDsl.g:1071:5: otherlv_1= '(' ( (lv_data_2_0= ruleDataExprList ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getDataExprUnitAccess().getLeftParenthesisKeyword_1_0_0());
                      				
                    }
                    // InternalMclrDsl.g:1075:5: ( (lv_data_2_0= ruleDataExprList ) )
                    // InternalMclrDsl.g:1076:6: (lv_data_2_0= ruleDataExprList )
                    {
                    // InternalMclrDsl.g:1076:6: (lv_data_2_0= ruleDataExprList )
                    // InternalMclrDsl.g:1077:7: lv_data_2_0= ruleDataExprList
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDataExprUnitAccess().getDataDataExprListParserRuleCall_1_0_1_0());
                      						
                    }
                    pushFollow(FOLLOW_9);
                    lv_data_2_0=ruleDataExprList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getDataExprUnitRule());
                      							}
                      							set(
                      								current,
                      								"data",
                      								lv_data_2_0,
                      								"tuks.mcrl2.dsl.MclrDsl.DataExprList");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getDataExprUnitAccess().getRightParenthesisKeyword_1_0_2());
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDataExprUnit"


    // $ANTLR start "entryRuleDataExprUnitTerm"
    // InternalMclrDsl.g:1104:1: entryRuleDataExprUnitTerm returns [EObject current=null] : iv_ruleDataExprUnitTerm= ruleDataExprUnitTerm EOF ;
    public final EObject entryRuleDataExprUnitTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataExprUnitTerm = null;


        try {
            // InternalMclrDsl.g:1104:57: (iv_ruleDataExprUnitTerm= ruleDataExprUnitTerm EOF )
            // InternalMclrDsl.g:1105:2: iv_ruleDataExprUnitTerm= ruleDataExprUnitTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataExprUnitTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDataExprUnitTerm=ruleDataExprUnitTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataExprUnitTerm; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDataExprUnitTerm"


    // $ANTLR start "ruleDataExprUnitTerm"
    // InternalMclrDsl.g:1111:1: ruleDataExprUnitTerm returns [EObject current=null] : ( ( (lv_id_0_0= ruleDataName ) ) | ( (lv_number_1_0= RULE_INT ) ) | ( (lv_is_true_2_0= 'true' ) ) | ( (lv_is_false_3_0= 'false' ) ) | (otherlv_4= '(' ( (lv_exp_5_0= ruleDataExpr ) ) otherlv_6= ')' ) | ( ( ( (lv_is_exp_7_0= '!' ) ) | ( (lv_is_minus_8_0= '-' ) ) | ( (lv_is_sharp_9_0= '#' ) ) ) ( (lv_unit_10_0= ruleDataExprUnit ) ) ) ) ;
    public final EObject ruleDataExprUnitTerm() throws RecognitionException {
        EObject current = null;

        Token lv_number_1_0=null;
        Token lv_is_true_2_0=null;
        Token lv_is_false_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_is_exp_7_0=null;
        Token lv_is_minus_8_0=null;
        Token lv_is_sharp_9_0=null;
        EObject lv_id_0_0 = null;

        EObject lv_exp_5_0 = null;

        EObject lv_unit_10_0 = null;



        	enterRule();

        try {
            // InternalMclrDsl.g:1117:2: ( ( ( (lv_id_0_0= ruleDataName ) ) | ( (lv_number_1_0= RULE_INT ) ) | ( (lv_is_true_2_0= 'true' ) ) | ( (lv_is_false_3_0= 'false' ) ) | (otherlv_4= '(' ( (lv_exp_5_0= ruleDataExpr ) ) otherlv_6= ')' ) | ( ( ( (lv_is_exp_7_0= '!' ) ) | ( (lv_is_minus_8_0= '-' ) ) | ( (lv_is_sharp_9_0= '#' ) ) ) ( (lv_unit_10_0= ruleDataExprUnit ) ) ) ) )
            // InternalMclrDsl.g:1118:2: ( ( (lv_id_0_0= ruleDataName ) ) | ( (lv_number_1_0= RULE_INT ) ) | ( (lv_is_true_2_0= 'true' ) ) | ( (lv_is_false_3_0= 'false' ) ) | (otherlv_4= '(' ( (lv_exp_5_0= ruleDataExpr ) ) otherlv_6= ')' ) | ( ( ( (lv_is_exp_7_0= '!' ) ) | ( (lv_is_minus_8_0= '-' ) ) | ( (lv_is_sharp_9_0= '#' ) ) ) ( (lv_unit_10_0= ruleDataExprUnit ) ) ) )
            {
            // InternalMclrDsl.g:1118:2: ( ( (lv_id_0_0= ruleDataName ) ) | ( (lv_number_1_0= RULE_INT ) ) | ( (lv_is_true_2_0= 'true' ) ) | ( (lv_is_false_3_0= 'false' ) ) | (otherlv_4= '(' ( (lv_exp_5_0= ruleDataExpr ) ) otherlv_6= ')' ) | ( ( ( (lv_is_exp_7_0= '!' ) ) | ( (lv_is_minus_8_0= '-' ) ) | ( (lv_is_sharp_9_0= '#' ) ) ) ( (lv_unit_10_0= ruleDataExprUnit ) ) ) )
            int alt16=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt16=1;
                }
                break;
            case RULE_INT:
                {
                alt16=2;
                }
                break;
            case 23:
                {
                alt16=3;
                }
                break;
            case 24:
                {
                alt16=4;
                }
                break;
            case 12:
                {
                alt16=5;
                }
                break;
            case 25:
            case 26:
            case 27:
                {
                alt16=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalMclrDsl.g:1119:3: ( (lv_id_0_0= ruleDataName ) )
                    {
                    // InternalMclrDsl.g:1119:3: ( (lv_id_0_0= ruleDataName ) )
                    // InternalMclrDsl.g:1120:4: (lv_id_0_0= ruleDataName )
                    {
                    // InternalMclrDsl.g:1120:4: (lv_id_0_0= ruleDataName )
                    // InternalMclrDsl.g:1121:5: lv_id_0_0= ruleDataName
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDataExprUnitTermAccess().getIdDataNameParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_id_0_0=ruleDataName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDataExprUnitTermRule());
                      					}
                      					set(
                      						current,
                      						"id",
                      						lv_id_0_0,
                      						"tuks.mcrl2.dsl.MclrDsl.DataName");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMclrDsl.g:1139:3: ( (lv_number_1_0= RULE_INT ) )
                    {
                    // InternalMclrDsl.g:1139:3: ( (lv_number_1_0= RULE_INT ) )
                    // InternalMclrDsl.g:1140:4: (lv_number_1_0= RULE_INT )
                    {
                    // InternalMclrDsl.g:1140:4: (lv_number_1_0= RULE_INT )
                    // InternalMclrDsl.g:1141:5: lv_number_1_0= RULE_INT
                    {
                    lv_number_1_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_number_1_0, grammarAccess.getDataExprUnitTermAccess().getNumberINTTerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDataExprUnitTermRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"number",
                      						lv_number_1_0,
                      						"org.eclipse.xtext.common.Terminals.INT");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMclrDsl.g:1158:3: ( (lv_is_true_2_0= 'true' ) )
                    {
                    // InternalMclrDsl.g:1158:3: ( (lv_is_true_2_0= 'true' ) )
                    // InternalMclrDsl.g:1159:4: (lv_is_true_2_0= 'true' )
                    {
                    // InternalMclrDsl.g:1159:4: (lv_is_true_2_0= 'true' )
                    // InternalMclrDsl.g:1160:5: lv_is_true_2_0= 'true'
                    {
                    lv_is_true_2_0=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_is_true_2_0, grammarAccess.getDataExprUnitTermAccess().getIs_trueTrueKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDataExprUnitTermRule());
                      					}
                      					setWithLastConsumed(current, "is_true", true, "true");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMclrDsl.g:1173:3: ( (lv_is_false_3_0= 'false' ) )
                    {
                    // InternalMclrDsl.g:1173:3: ( (lv_is_false_3_0= 'false' ) )
                    // InternalMclrDsl.g:1174:4: (lv_is_false_3_0= 'false' )
                    {
                    // InternalMclrDsl.g:1174:4: (lv_is_false_3_0= 'false' )
                    // InternalMclrDsl.g:1175:5: lv_is_false_3_0= 'false'
                    {
                    lv_is_false_3_0=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_is_false_3_0, grammarAccess.getDataExprUnitTermAccess().getIs_falseFalseKeyword_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDataExprUnitTermRule());
                      					}
                      					setWithLastConsumed(current, "is_false", true, "false");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalMclrDsl.g:1188:3: (otherlv_4= '(' ( (lv_exp_5_0= ruleDataExpr ) ) otherlv_6= ')' )
                    {
                    // InternalMclrDsl.g:1188:3: (otherlv_4= '(' ( (lv_exp_5_0= ruleDataExpr ) ) otherlv_6= ')' )
                    // InternalMclrDsl.g:1189:4: otherlv_4= '(' ( (lv_exp_5_0= ruleDataExpr ) ) otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,12,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getDataExprUnitTermAccess().getLeftParenthesisKeyword_4_0());
                      			
                    }
                    // InternalMclrDsl.g:1193:4: ( (lv_exp_5_0= ruleDataExpr ) )
                    // InternalMclrDsl.g:1194:5: (lv_exp_5_0= ruleDataExpr )
                    {
                    // InternalMclrDsl.g:1194:5: (lv_exp_5_0= ruleDataExpr )
                    // InternalMclrDsl.g:1195:6: lv_exp_5_0= ruleDataExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDataExprUnitTermAccess().getExpDataExprParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_9);
                    lv_exp_5_0=ruleDataExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDataExprUnitTermRule());
                      						}
                      						set(
                      							current,
                      							"exp",
                      							lv_exp_5_0,
                      							"tuks.mcrl2.dsl.MclrDsl.DataExpr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getDataExprUnitTermAccess().getRightParenthesisKeyword_4_2());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalMclrDsl.g:1218:3: ( ( ( (lv_is_exp_7_0= '!' ) ) | ( (lv_is_minus_8_0= '-' ) ) | ( (lv_is_sharp_9_0= '#' ) ) ) ( (lv_unit_10_0= ruleDataExprUnit ) ) )
                    {
                    // InternalMclrDsl.g:1218:3: ( ( ( (lv_is_exp_7_0= '!' ) ) | ( (lv_is_minus_8_0= '-' ) ) | ( (lv_is_sharp_9_0= '#' ) ) ) ( (lv_unit_10_0= ruleDataExprUnit ) ) )
                    // InternalMclrDsl.g:1219:4: ( ( (lv_is_exp_7_0= '!' ) ) | ( (lv_is_minus_8_0= '-' ) ) | ( (lv_is_sharp_9_0= '#' ) ) ) ( (lv_unit_10_0= ruleDataExprUnit ) )
                    {
                    // InternalMclrDsl.g:1219:4: ( ( (lv_is_exp_7_0= '!' ) ) | ( (lv_is_minus_8_0= '-' ) ) | ( (lv_is_sharp_9_0= '#' ) ) )
                    int alt15=3;
                    switch ( input.LA(1) ) {
                    case 25:
                        {
                        alt15=1;
                        }
                        break;
                    case 26:
                        {
                        alt15=2;
                        }
                        break;
                    case 27:
                        {
                        alt15=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;
                    }

                    switch (alt15) {
                        case 1 :
                            // InternalMclrDsl.g:1220:5: ( (lv_is_exp_7_0= '!' ) )
                            {
                            // InternalMclrDsl.g:1220:5: ( (lv_is_exp_7_0= '!' ) )
                            // InternalMclrDsl.g:1221:6: (lv_is_exp_7_0= '!' )
                            {
                            // InternalMclrDsl.g:1221:6: (lv_is_exp_7_0= '!' )
                            // InternalMclrDsl.g:1222:7: lv_is_exp_7_0= '!'
                            {
                            lv_is_exp_7_0=(Token)match(input,25,FOLLOW_20); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_is_exp_7_0, grammarAccess.getDataExprUnitTermAccess().getIs_expExclamationMarkKeyword_5_0_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getDataExprUnitTermRule());
                              							}
                              							setWithLastConsumed(current, "is_exp", true, "!");
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalMclrDsl.g:1235:5: ( (lv_is_minus_8_0= '-' ) )
                            {
                            // InternalMclrDsl.g:1235:5: ( (lv_is_minus_8_0= '-' ) )
                            // InternalMclrDsl.g:1236:6: (lv_is_minus_8_0= '-' )
                            {
                            // InternalMclrDsl.g:1236:6: (lv_is_minus_8_0= '-' )
                            // InternalMclrDsl.g:1237:7: lv_is_minus_8_0= '-'
                            {
                            lv_is_minus_8_0=(Token)match(input,26,FOLLOW_20); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_is_minus_8_0, grammarAccess.getDataExprUnitTermAccess().getIs_minusHyphenMinusKeyword_5_0_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getDataExprUnitTermRule());
                              							}
                              							setWithLastConsumed(current, "is_minus", true, "-");
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalMclrDsl.g:1250:5: ( (lv_is_sharp_9_0= '#' ) )
                            {
                            // InternalMclrDsl.g:1250:5: ( (lv_is_sharp_9_0= '#' ) )
                            // InternalMclrDsl.g:1251:6: (lv_is_sharp_9_0= '#' )
                            {
                            // InternalMclrDsl.g:1251:6: (lv_is_sharp_9_0= '#' )
                            // InternalMclrDsl.g:1252:7: lv_is_sharp_9_0= '#'
                            {
                            lv_is_sharp_9_0=(Token)match(input,27,FOLLOW_20); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_is_sharp_9_0, grammarAccess.getDataExprUnitTermAccess().getIs_sharpNumberSignKeyword_5_0_2_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getDataExprUnitTermRule());
                              							}
                              							setWithLastConsumed(current, "is_sharp", true, "#");
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalMclrDsl.g:1265:4: ( (lv_unit_10_0= ruleDataExprUnit ) )
                    // InternalMclrDsl.g:1266:5: (lv_unit_10_0= ruleDataExprUnit )
                    {
                    // InternalMclrDsl.g:1266:5: (lv_unit_10_0= ruleDataExprUnit )
                    // InternalMclrDsl.g:1267:6: lv_unit_10_0= ruleDataExprUnit
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDataExprUnitTermAccess().getUnitDataExprUnitParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_unit_10_0=ruleDataExprUnit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDataExprUnitTermRule());
                      						}
                      						set(
                      							current,
                      							"unit",
                      							lv_unit_10_0,
                      							"tuks.mcrl2.dsl.MclrDsl.DataExprUnit");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDataExprUnitTerm"


    // $ANTLR start "entryRuleDataExpr"
    // InternalMclrDsl.g:1289:1: entryRuleDataExpr returns [EObject current=null] : iv_ruleDataExpr= ruleDataExpr EOF ;
    public final EObject entryRuleDataExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataExpr = null;


        try {
            // InternalMclrDsl.g:1289:49: (iv_ruleDataExpr= ruleDataExpr EOF )
            // InternalMclrDsl.g:1290:2: iv_ruleDataExpr= ruleDataExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDataExpr=ruleDataExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDataExpr"


    // $ANTLR start "ruleDataExpr"
    // InternalMclrDsl.g:1296:1: ruleDataExpr returns [EObject current=null] : ( ( (lv_left_0_0= ruleDataExpr1 ) ) ( (otherlv_1= '[' ( (lv_right_1_2_0= ruleDataExpr ) ) otherlv_3= '->' ( (lv_right_2_4_0= ruleDataExpr ) ) otherlv_5= ']' ) | (otherlv_6= '(' ( (lv_right_7_0= ruleDataExprList ) ) otherlv_8= ')' ) ) ) ;
    public final EObject ruleDataExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_1_2_0 = null;

        EObject lv_right_2_4_0 = null;

        EObject lv_right_7_0 = null;



        	enterRule();

        try {
            // InternalMclrDsl.g:1302:2: ( ( ( (lv_left_0_0= ruleDataExpr1 ) ) ( (otherlv_1= '[' ( (lv_right_1_2_0= ruleDataExpr ) ) otherlv_3= '->' ( (lv_right_2_4_0= ruleDataExpr ) ) otherlv_5= ']' ) | (otherlv_6= '(' ( (lv_right_7_0= ruleDataExprList ) ) otherlv_8= ')' ) ) ) )
            // InternalMclrDsl.g:1303:2: ( ( (lv_left_0_0= ruleDataExpr1 ) ) ( (otherlv_1= '[' ( (lv_right_1_2_0= ruleDataExpr ) ) otherlv_3= '->' ( (lv_right_2_4_0= ruleDataExpr ) ) otherlv_5= ']' ) | (otherlv_6= '(' ( (lv_right_7_0= ruleDataExprList ) ) otherlv_8= ')' ) ) )
            {
            // InternalMclrDsl.g:1303:2: ( ( (lv_left_0_0= ruleDataExpr1 ) ) ( (otherlv_1= '[' ( (lv_right_1_2_0= ruleDataExpr ) ) otherlv_3= '->' ( (lv_right_2_4_0= ruleDataExpr ) ) otherlv_5= ']' ) | (otherlv_6= '(' ( (lv_right_7_0= ruleDataExprList ) ) otherlv_8= ')' ) ) )
            // InternalMclrDsl.g:1304:3: ( (lv_left_0_0= ruleDataExpr1 ) ) ( (otherlv_1= '[' ( (lv_right_1_2_0= ruleDataExpr ) ) otherlv_3= '->' ( (lv_right_2_4_0= ruleDataExpr ) ) otherlv_5= ']' ) | (otherlv_6= '(' ( (lv_right_7_0= ruleDataExprList ) ) otherlv_8= ')' ) )
            {
            // InternalMclrDsl.g:1304:3: ( (lv_left_0_0= ruleDataExpr1 ) )
            // InternalMclrDsl.g:1305:4: (lv_left_0_0= ruleDataExpr1 )
            {
            // InternalMclrDsl.g:1305:4: (lv_left_0_0= ruleDataExpr1 )
            // InternalMclrDsl.g:1306:5: lv_left_0_0= ruleDataExpr1
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDataExprAccess().getLeftDataExpr1ParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_left_0_0=ruleDataExpr1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDataExprRule());
              					}
              					set(
              						current,
              						"left",
              						lv_left_0_0,
              						"tuks.mcrl2.dsl.MclrDsl.DataExpr1");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMclrDsl.g:1323:3: ( (otherlv_1= '[' ( (lv_right_1_2_0= ruleDataExpr ) ) otherlv_3= '->' ( (lv_right_2_4_0= ruleDataExpr ) ) otherlv_5= ']' ) | (otherlv_6= '(' ( (lv_right_7_0= ruleDataExprList ) ) otherlv_8= ')' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            else if ( (LA17_0==12) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalMclrDsl.g:1324:4: (otherlv_1= '[' ( (lv_right_1_2_0= ruleDataExpr ) ) otherlv_3= '->' ( (lv_right_2_4_0= ruleDataExpr ) ) otherlv_5= ']' )
                    {
                    // InternalMclrDsl.g:1324:4: (otherlv_1= '[' ( (lv_right_1_2_0= ruleDataExpr ) ) otherlv_3= '->' ( (lv_right_2_4_0= ruleDataExpr ) ) otherlv_5= ']' )
                    // InternalMclrDsl.g:1325:5: otherlv_1= '[' ( (lv_right_1_2_0= ruleDataExpr ) ) otherlv_3= '->' ( (lv_right_2_4_0= ruleDataExpr ) ) otherlv_5= ']'
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getDataExprAccess().getLeftSquareBracketKeyword_1_0_0());
                      				
                    }
                    // InternalMclrDsl.g:1329:5: ( (lv_right_1_2_0= ruleDataExpr ) )
                    // InternalMclrDsl.g:1330:6: (lv_right_1_2_0= ruleDataExpr )
                    {
                    // InternalMclrDsl.g:1330:6: (lv_right_1_2_0= ruleDataExpr )
                    // InternalMclrDsl.g:1331:7: lv_right_1_2_0= ruleDataExpr
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDataExprAccess().getRight_1DataExprParserRuleCall_1_0_1_0());
                      						
                    }
                    pushFollow(FOLLOW_22);
                    lv_right_1_2_0=ruleDataExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getDataExprRule());
                      							}
                      							set(
                      								current,
                      								"right_1",
                      								lv_right_1_2_0,
                      								"tuks.mcrl2.dsl.MclrDsl.DataExpr");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,29,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getDataExprAccess().getHyphenMinusGreaterThanSignKeyword_1_0_2());
                      				
                    }
                    // InternalMclrDsl.g:1352:5: ( (lv_right_2_4_0= ruleDataExpr ) )
                    // InternalMclrDsl.g:1353:6: (lv_right_2_4_0= ruleDataExpr )
                    {
                    // InternalMclrDsl.g:1353:6: (lv_right_2_4_0= ruleDataExpr )
                    // InternalMclrDsl.g:1354:7: lv_right_2_4_0= ruleDataExpr
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDataExprAccess().getRight_2DataExprParserRuleCall_1_0_3_0());
                      						
                    }
                    pushFollow(FOLLOW_23);
                    lv_right_2_4_0=ruleDataExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getDataExprRule());
                      							}
                      							set(
                      								current,
                      								"right_2",
                      								lv_right_2_4_0,
                      								"tuks.mcrl2.dsl.MclrDsl.DataExpr");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getDataExprAccess().getRightSquareBracketKeyword_1_0_4());
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMclrDsl.g:1377:4: (otherlv_6= '(' ( (lv_right_7_0= ruleDataExprList ) ) otherlv_8= ')' )
                    {
                    // InternalMclrDsl.g:1377:4: (otherlv_6= '(' ( (lv_right_7_0= ruleDataExprList ) ) otherlv_8= ')' )
                    // InternalMclrDsl.g:1378:5: otherlv_6= '(' ( (lv_right_7_0= ruleDataExprList ) ) otherlv_8= ')'
                    {
                    otherlv_6=(Token)match(input,12,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getDataExprAccess().getLeftParenthesisKeyword_1_1_0());
                      				
                    }
                    // InternalMclrDsl.g:1382:5: ( (lv_right_7_0= ruleDataExprList ) )
                    // InternalMclrDsl.g:1383:6: (lv_right_7_0= ruleDataExprList )
                    {
                    // InternalMclrDsl.g:1383:6: (lv_right_7_0= ruleDataExprList )
                    // InternalMclrDsl.g:1384:7: lv_right_7_0= ruleDataExprList
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDataExprAccess().getRightDataExprListParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_9);
                    lv_right_7_0=ruleDataExprList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getDataExprRule());
                      							}
                      							set(
                      								current,
                      								"right",
                      								lv_right_7_0,
                      								"tuks.mcrl2.dsl.MclrDsl.DataExprList");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_8=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_8, grammarAccess.getDataExprAccess().getRightParenthesisKeyword_1_1_2());
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDataExpr"


    // $ANTLR start "entryRuleDataExpr1"
    // InternalMclrDsl.g:1411:1: entryRuleDataExpr1 returns [EObject current=null] : iv_ruleDataExpr1= ruleDataExpr1 EOF ;
    public final EObject entryRuleDataExpr1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataExpr1 = null;


        try {
            // InternalMclrDsl.g:1411:50: (iv_ruleDataExpr1= ruleDataExpr1 EOF )
            // InternalMclrDsl.g:1412:2: iv_ruleDataExpr1= ruleDataExpr1 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataExpr1Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDataExpr1=ruleDataExpr1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataExpr1; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDataExpr1"


    // $ANTLR start "ruleDataExpr1"
    // InternalMclrDsl.g:1418:1: ruleDataExpr1 returns [EObject current=null] : ( ( (lv_left_0_0= ruleDataExpr2 ) ) ( ( ( '+' | '-' | '/' | 'div' | 'mod' | '*' )=> (otherlv_1= '+' | otherlv_2= '-' | otherlv_3= '/' | otherlv_4= 'div' | otherlv_5= 'mod' | otherlv_6= '*' ) ) ( (lv_right_7_0= ruleDataExpr ) ) ) ) ;
    public final EObject ruleDataExpr1() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_7_0 = null;



        	enterRule();

        try {
            // InternalMclrDsl.g:1424:2: ( ( ( (lv_left_0_0= ruleDataExpr2 ) ) ( ( ( '+' | '-' | '/' | 'div' | 'mod' | '*' )=> (otherlv_1= '+' | otherlv_2= '-' | otherlv_3= '/' | otherlv_4= 'div' | otherlv_5= 'mod' | otherlv_6= '*' ) ) ( (lv_right_7_0= ruleDataExpr ) ) ) ) )
            // InternalMclrDsl.g:1425:2: ( ( (lv_left_0_0= ruleDataExpr2 ) ) ( ( ( '+' | '-' | '/' | 'div' | 'mod' | '*' )=> (otherlv_1= '+' | otherlv_2= '-' | otherlv_3= '/' | otherlv_4= 'div' | otherlv_5= 'mod' | otherlv_6= '*' ) ) ( (lv_right_7_0= ruleDataExpr ) ) ) )
            {
            // InternalMclrDsl.g:1425:2: ( ( (lv_left_0_0= ruleDataExpr2 ) ) ( ( ( '+' | '-' | '/' | 'div' | 'mod' | '*' )=> (otherlv_1= '+' | otherlv_2= '-' | otherlv_3= '/' | otherlv_4= 'div' | otherlv_5= 'mod' | otherlv_6= '*' ) ) ( (lv_right_7_0= ruleDataExpr ) ) ) )
            // InternalMclrDsl.g:1426:3: ( (lv_left_0_0= ruleDataExpr2 ) ) ( ( ( '+' | '-' | '/' | 'div' | 'mod' | '*' )=> (otherlv_1= '+' | otherlv_2= '-' | otherlv_3= '/' | otherlv_4= 'div' | otherlv_5= 'mod' | otherlv_6= '*' ) ) ( (lv_right_7_0= ruleDataExpr ) ) )
            {
            // InternalMclrDsl.g:1426:3: ( (lv_left_0_0= ruleDataExpr2 ) )
            // InternalMclrDsl.g:1427:4: (lv_left_0_0= ruleDataExpr2 )
            {
            // InternalMclrDsl.g:1427:4: (lv_left_0_0= ruleDataExpr2 )
            // InternalMclrDsl.g:1428:5: lv_left_0_0= ruleDataExpr2
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDataExpr1Access().getLeftDataExpr2ParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_24);
            lv_left_0_0=ruleDataExpr2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDataExpr1Rule());
              					}
              					set(
              						current,
              						"left",
              						lv_left_0_0,
              						"tuks.mcrl2.dsl.MclrDsl.DataExpr2");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMclrDsl.g:1445:3: ( ( ( '+' | '-' | '/' | 'div' | 'mod' | '*' )=> (otherlv_1= '+' | otherlv_2= '-' | otherlv_3= '/' | otherlv_4= 'div' | otherlv_5= 'mod' | otherlv_6= '*' ) ) ( (lv_right_7_0= ruleDataExpr ) ) )
            // InternalMclrDsl.g:1446:4: ( ( '+' | '-' | '/' | 'div' | 'mod' | '*' )=> (otherlv_1= '+' | otherlv_2= '-' | otherlv_3= '/' | otherlv_4= 'div' | otherlv_5= 'mod' | otherlv_6= '*' ) ) ( (lv_right_7_0= ruleDataExpr ) )
            {
            // InternalMclrDsl.g:1446:4: ( ( '+' | '-' | '/' | 'div' | 'mod' | '*' )=> (otherlv_1= '+' | otherlv_2= '-' | otherlv_3= '/' | otherlv_4= 'div' | otherlv_5= 'mod' | otherlv_6= '*' ) )
            // InternalMclrDsl.g:1447:5: ( '+' | '-' | '/' | 'div' | 'mod' | '*' )=> (otherlv_1= '+' | otherlv_2= '-' | otherlv_3= '/' | otherlv_4= 'div' | otherlv_5= 'mod' | otherlv_6= '*' )
            {
            // InternalMclrDsl.g:1448:5: (otherlv_1= '+' | otherlv_2= '-' | otherlv_3= '/' | otherlv_4= 'div' | otherlv_5= 'mod' | otherlv_6= '*' )
            int alt18=6;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt18=1;
                }
                break;
            case 26:
                {
                alt18=2;
                }
                break;
            case 32:
                {
                alt18=3;
                }
                break;
            case 33:
                {
                alt18=4;
                }
                break;
            case 34:
                {
                alt18=5;
                }
                break;
            case 35:
                {
                alt18=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalMclrDsl.g:1449:6: otherlv_1= '+'
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_1, grammarAccess.getDataExpr1Access().getPlusSignKeyword_1_0_0_0());
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalMclrDsl.g:1454:6: otherlv_2= '-'
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_2, grammarAccess.getDataExpr1Access().getHyphenMinusKeyword_1_0_0_1());
                      					
                    }

                    }
                    break;
                case 3 :
                    // InternalMclrDsl.g:1459:6: otherlv_3= '/'
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_3, grammarAccess.getDataExpr1Access().getSolidusKeyword_1_0_0_2());
                      					
                    }

                    }
                    break;
                case 4 :
                    // InternalMclrDsl.g:1464:6: otherlv_4= 'div'
                    {
                    otherlv_4=(Token)match(input,33,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_4, grammarAccess.getDataExpr1Access().getDivKeyword_1_0_0_3());
                      					
                    }

                    }
                    break;
                case 5 :
                    // InternalMclrDsl.g:1469:6: otherlv_5= 'mod'
                    {
                    otherlv_5=(Token)match(input,34,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_5, grammarAccess.getDataExpr1Access().getModKeyword_1_0_0_4());
                      					
                    }

                    }
                    break;
                case 6 :
                    // InternalMclrDsl.g:1474:6: otherlv_6= '*'
                    {
                    otherlv_6=(Token)match(input,35,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_6, grammarAccess.getDataExpr1Access().getAsteriskKeyword_1_0_0_5());
                      					
                    }

                    }
                    break;

            }


            }

            // InternalMclrDsl.g:1480:4: ( (lv_right_7_0= ruleDataExpr ) )
            // InternalMclrDsl.g:1481:5: (lv_right_7_0= ruleDataExpr )
            {
            // InternalMclrDsl.g:1481:5: (lv_right_7_0= ruleDataExpr )
            // InternalMclrDsl.g:1482:6: lv_right_7_0= ruleDataExpr
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getDataExpr1Access().getRightDataExprParserRuleCall_1_1_0());
              					
            }
            pushFollow(FOLLOW_2);
            lv_right_7_0=ruleDataExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElementForParent(grammarAccess.getDataExpr1Rule());
              						}
              						set(
              							current,
              							"right",
              							lv_right_7_0,
              							"tuks.mcrl2.dsl.MclrDsl.DataExpr");
              						afterParserOrEnumRuleCall();
              					
            }

            }


            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDataExpr1"


    // $ANTLR start "entryRuleDataExpr2"
    // InternalMclrDsl.g:1504:1: entryRuleDataExpr2 returns [EObject current=null] : iv_ruleDataExpr2= ruleDataExpr2 EOF ;
    public final EObject entryRuleDataExpr2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataExpr2 = null;


        try {
            // InternalMclrDsl.g:1504:50: (iv_ruleDataExpr2= ruleDataExpr2 EOF )
            // InternalMclrDsl.g:1505:2: iv_ruleDataExpr2= ruleDataExpr2 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataExpr2Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDataExpr2=ruleDataExpr2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataExpr2; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDataExpr2"


    // $ANTLR start "ruleDataExpr2"
    // InternalMclrDsl.g:1511:1: ruleDataExpr2 returns [EObject current=null] : ( ( (lv_left_0_0= ruleDataExprTerm ) ) ( ( ( '=>' | '||' | '&&' | '==' | '!=' | '<' | '<=' | '>=' | '>' | 'in' | '|>' | '<|' | '++' | '.' )=> (otherlv_1= '=>' | otherlv_2= '||' | otherlv_3= '&&' | otherlv_4= '==' | otherlv_5= '!=' | otherlv_6= '<' | otherlv_7= '<=' | otherlv_8= '>=' | otherlv_9= '>' | otherlv_10= 'in' | otherlv_11= '|>' | otherlv_12= '<|' | otherlv_13= '++' | otherlv_14= '.' ) ) ( (lv_right_15_0= ruleDataExpr ) ) ) ) ;
    public final EObject ruleDataExpr2() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_15_0 = null;



        	enterRule();

        try {
            // InternalMclrDsl.g:1517:2: ( ( ( (lv_left_0_0= ruleDataExprTerm ) ) ( ( ( '=>' | '||' | '&&' | '==' | '!=' | '<' | '<=' | '>=' | '>' | 'in' | '|>' | '<|' | '++' | '.' )=> (otherlv_1= '=>' | otherlv_2= '||' | otherlv_3= '&&' | otherlv_4= '==' | otherlv_5= '!=' | otherlv_6= '<' | otherlv_7= '<=' | otherlv_8= '>=' | otherlv_9= '>' | otherlv_10= 'in' | otherlv_11= '|>' | otherlv_12= '<|' | otherlv_13= '++' | otherlv_14= '.' ) ) ( (lv_right_15_0= ruleDataExpr ) ) ) ) )
            // InternalMclrDsl.g:1518:2: ( ( (lv_left_0_0= ruleDataExprTerm ) ) ( ( ( '=>' | '||' | '&&' | '==' | '!=' | '<' | '<=' | '>=' | '>' | 'in' | '|>' | '<|' | '++' | '.' )=> (otherlv_1= '=>' | otherlv_2= '||' | otherlv_3= '&&' | otherlv_4= '==' | otherlv_5= '!=' | otherlv_6= '<' | otherlv_7= '<=' | otherlv_8= '>=' | otherlv_9= '>' | otherlv_10= 'in' | otherlv_11= '|>' | otherlv_12= '<|' | otherlv_13= '++' | otherlv_14= '.' ) ) ( (lv_right_15_0= ruleDataExpr ) ) ) )
            {
            // InternalMclrDsl.g:1518:2: ( ( (lv_left_0_0= ruleDataExprTerm ) ) ( ( ( '=>' | '||' | '&&' | '==' | '!=' | '<' | '<=' | '>=' | '>' | 'in' | '|>' | '<|' | '++' | '.' )=> (otherlv_1= '=>' | otherlv_2= '||' | otherlv_3= '&&' | otherlv_4= '==' | otherlv_5= '!=' | otherlv_6= '<' | otherlv_7= '<=' | otherlv_8= '>=' | otherlv_9= '>' | otherlv_10= 'in' | otherlv_11= '|>' | otherlv_12= '<|' | otherlv_13= '++' | otherlv_14= '.' ) ) ( (lv_right_15_0= ruleDataExpr ) ) ) )
            // InternalMclrDsl.g:1519:3: ( (lv_left_0_0= ruleDataExprTerm ) ) ( ( ( '=>' | '||' | '&&' | '==' | '!=' | '<' | '<=' | '>=' | '>' | 'in' | '|>' | '<|' | '++' | '.' )=> (otherlv_1= '=>' | otherlv_2= '||' | otherlv_3= '&&' | otherlv_4= '==' | otherlv_5= '!=' | otherlv_6= '<' | otherlv_7= '<=' | otherlv_8= '>=' | otherlv_9= '>' | otherlv_10= 'in' | otherlv_11= '|>' | otherlv_12= '<|' | otherlv_13= '++' | otherlv_14= '.' ) ) ( (lv_right_15_0= ruleDataExpr ) ) )
            {
            // InternalMclrDsl.g:1519:3: ( (lv_left_0_0= ruleDataExprTerm ) )
            // InternalMclrDsl.g:1520:4: (lv_left_0_0= ruleDataExprTerm )
            {
            // InternalMclrDsl.g:1520:4: (lv_left_0_0= ruleDataExprTerm )
            // InternalMclrDsl.g:1521:5: lv_left_0_0= ruleDataExprTerm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDataExpr2Access().getLeftDataExprTermParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_25);
            lv_left_0_0=ruleDataExprTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDataExpr2Rule());
              					}
              					set(
              						current,
              						"left",
              						lv_left_0_0,
              						"tuks.mcrl2.dsl.MclrDsl.DataExprTerm");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMclrDsl.g:1538:3: ( ( ( '=>' | '||' | '&&' | '==' | '!=' | '<' | '<=' | '>=' | '>' | 'in' | '|>' | '<|' | '++' | '.' )=> (otherlv_1= '=>' | otherlv_2= '||' | otherlv_3= '&&' | otherlv_4= '==' | otherlv_5= '!=' | otherlv_6= '<' | otherlv_7= '<=' | otherlv_8= '>=' | otherlv_9= '>' | otherlv_10= 'in' | otherlv_11= '|>' | otherlv_12= '<|' | otherlv_13= '++' | otherlv_14= '.' ) ) ( (lv_right_15_0= ruleDataExpr ) ) )
            // InternalMclrDsl.g:1539:4: ( ( '=>' | '||' | '&&' | '==' | '!=' | '<' | '<=' | '>=' | '>' | 'in' | '|>' | '<|' | '++' | '.' )=> (otherlv_1= '=>' | otherlv_2= '||' | otherlv_3= '&&' | otherlv_4= '==' | otherlv_5= '!=' | otherlv_6= '<' | otherlv_7= '<=' | otherlv_8= '>=' | otherlv_9= '>' | otherlv_10= 'in' | otherlv_11= '|>' | otherlv_12= '<|' | otherlv_13= '++' | otherlv_14= '.' ) ) ( (lv_right_15_0= ruleDataExpr ) )
            {
            // InternalMclrDsl.g:1539:4: ( ( '=>' | '||' | '&&' | '==' | '!=' | '<' | '<=' | '>=' | '>' | 'in' | '|>' | '<|' | '++' | '.' )=> (otherlv_1= '=>' | otherlv_2= '||' | otherlv_3= '&&' | otherlv_4= '==' | otherlv_5= '!=' | otherlv_6= '<' | otherlv_7= '<=' | otherlv_8= '>=' | otherlv_9= '>' | otherlv_10= 'in' | otherlv_11= '|>' | otherlv_12= '<|' | otherlv_13= '++' | otherlv_14= '.' ) )
            // InternalMclrDsl.g:1540:5: ( '=>' | '||' | '&&' | '==' | '!=' | '<' | '<=' | '>=' | '>' | 'in' | '|>' | '<|' | '++' | '.' )=> (otherlv_1= '=>' | otherlv_2= '||' | otherlv_3= '&&' | otherlv_4= '==' | otherlv_5= '!=' | otherlv_6= '<' | otherlv_7= '<=' | otherlv_8= '>=' | otherlv_9= '>' | otherlv_10= 'in' | otherlv_11= '|>' | otherlv_12= '<|' | otherlv_13= '++' | otherlv_14= '.' )
            {
            // InternalMclrDsl.g:1541:5: (otherlv_1= '=>' | otherlv_2= '||' | otherlv_3= '&&' | otherlv_4= '==' | otherlv_5= '!=' | otherlv_6= '<' | otherlv_7= '<=' | otherlv_8= '>=' | otherlv_9= '>' | otherlv_10= 'in' | otherlv_11= '|>' | otherlv_12= '<|' | otherlv_13= '++' | otherlv_14= '.' )
            int alt19=14;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt19=1;
                }
                break;
            case 37:
                {
                alt19=2;
                }
                break;
            case 38:
                {
                alt19=3;
                }
                break;
            case 39:
                {
                alt19=4;
                }
                break;
            case 40:
                {
                alt19=5;
                }
                break;
            case 41:
                {
                alt19=6;
                }
                break;
            case 42:
                {
                alt19=7;
                }
                break;
            case 43:
                {
                alt19=8;
                }
                break;
            case 44:
                {
                alt19=9;
                }
                break;
            case 45:
                {
                alt19=10;
                }
                break;
            case 46:
                {
                alt19=11;
                }
                break;
            case 47:
                {
                alt19=12;
                }
                break;
            case 48:
                {
                alt19=13;
                }
                break;
            case 49:
                {
                alt19=14;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalMclrDsl.g:1542:6: otherlv_1= '=>'
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_1, grammarAccess.getDataExpr2Access().getEqualsSignGreaterThanSignKeyword_1_0_0_0());
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalMclrDsl.g:1547:6: otherlv_2= '||'
                    {
                    otherlv_2=(Token)match(input,37,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_2, grammarAccess.getDataExpr2Access().getVerticalLineVerticalLineKeyword_1_0_0_1());
                      					
                    }

                    }
                    break;
                case 3 :
                    // InternalMclrDsl.g:1552:6: otherlv_3= '&&'
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_3, grammarAccess.getDataExpr2Access().getAmpersandAmpersandKeyword_1_0_0_2());
                      					
                    }

                    }
                    break;
                case 4 :
                    // InternalMclrDsl.g:1557:6: otherlv_4= '=='
                    {
                    otherlv_4=(Token)match(input,39,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_4, grammarAccess.getDataExpr2Access().getEqualsSignEqualsSignKeyword_1_0_0_3());
                      					
                    }

                    }
                    break;
                case 5 :
                    // InternalMclrDsl.g:1562:6: otherlv_5= '!='
                    {
                    otherlv_5=(Token)match(input,40,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_5, grammarAccess.getDataExpr2Access().getExclamationMarkEqualsSignKeyword_1_0_0_4());
                      					
                    }

                    }
                    break;
                case 6 :
                    // InternalMclrDsl.g:1567:6: otherlv_6= '<'
                    {
                    otherlv_6=(Token)match(input,41,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_6, grammarAccess.getDataExpr2Access().getLessThanSignKeyword_1_0_0_5());
                      					
                    }

                    }
                    break;
                case 7 :
                    // InternalMclrDsl.g:1572:6: otherlv_7= '<='
                    {
                    otherlv_7=(Token)match(input,42,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_7, grammarAccess.getDataExpr2Access().getLessThanSignEqualsSignKeyword_1_0_0_6());
                      					
                    }

                    }
                    break;
                case 8 :
                    // InternalMclrDsl.g:1577:6: otherlv_8= '>='
                    {
                    otherlv_8=(Token)match(input,43,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_8, grammarAccess.getDataExpr2Access().getGreaterThanSignEqualsSignKeyword_1_0_0_7());
                      					
                    }

                    }
                    break;
                case 9 :
                    // InternalMclrDsl.g:1582:6: otherlv_9= '>'
                    {
                    otherlv_9=(Token)match(input,44,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_9, grammarAccess.getDataExpr2Access().getGreaterThanSignKeyword_1_0_0_8());
                      					
                    }

                    }
                    break;
                case 10 :
                    // InternalMclrDsl.g:1587:6: otherlv_10= 'in'
                    {
                    otherlv_10=(Token)match(input,45,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_10, grammarAccess.getDataExpr2Access().getInKeyword_1_0_0_9());
                      					
                    }

                    }
                    break;
                case 11 :
                    // InternalMclrDsl.g:1592:6: otherlv_11= '|>'
                    {
                    otherlv_11=(Token)match(input,46,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_11, grammarAccess.getDataExpr2Access().getVerticalLineGreaterThanSignKeyword_1_0_0_10());
                      					
                    }

                    }
                    break;
                case 12 :
                    // InternalMclrDsl.g:1597:6: otherlv_12= '<|'
                    {
                    otherlv_12=(Token)match(input,47,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_12, grammarAccess.getDataExpr2Access().getLessThanSignVerticalLineKeyword_1_0_0_11());
                      					
                    }

                    }
                    break;
                case 13 :
                    // InternalMclrDsl.g:1602:6: otherlv_13= '++'
                    {
                    otherlv_13=(Token)match(input,48,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_13, grammarAccess.getDataExpr2Access().getPlusSignPlusSignKeyword_1_0_0_12());
                      					
                    }

                    }
                    break;
                case 14 :
                    // InternalMclrDsl.g:1607:6: otherlv_14= '.'
                    {
                    otherlv_14=(Token)match(input,49,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_14, grammarAccess.getDataExpr2Access().getFullStopKeyword_1_0_0_13());
                      					
                    }

                    }
                    break;

            }


            }

            // InternalMclrDsl.g:1613:4: ( (lv_right_15_0= ruleDataExpr ) )
            // InternalMclrDsl.g:1614:5: (lv_right_15_0= ruleDataExpr )
            {
            // InternalMclrDsl.g:1614:5: (lv_right_15_0= ruleDataExpr )
            // InternalMclrDsl.g:1615:6: lv_right_15_0= ruleDataExpr
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getDataExpr2Access().getRightDataExprParserRuleCall_1_1_0());
              					
            }
            pushFollow(FOLLOW_2);
            lv_right_15_0=ruleDataExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElementForParent(grammarAccess.getDataExpr2Rule());
              						}
              						set(
              							current,
              							"right",
              							lv_right_15_0,
              							"tuks.mcrl2.dsl.MclrDsl.DataExpr");
              						afterParserOrEnumRuleCall();
              					
            }

            }


            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDataExpr2"


    // $ANTLR start "entryRuleDataExprTerm"
    // InternalMclrDsl.g:1637:1: entryRuleDataExprTerm returns [EObject current=null] : iv_ruleDataExprTerm= ruleDataExprTerm EOF ;
    public final EObject entryRuleDataExprTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataExprTerm = null;


        try {
            // InternalMclrDsl.g:1637:53: (iv_ruleDataExprTerm= ruleDataExprTerm EOF )
            // InternalMclrDsl.g:1638:2: iv_ruleDataExprTerm= ruleDataExprTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataExprTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDataExprTerm=ruleDataExprTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataExprTerm; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDataExprTerm"


    // $ANTLR start "ruleDataExprTerm"
    // InternalMclrDsl.g:1644:1: ruleDataExprTerm returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | ( (lv_num_1_0= RULE_INT ) ) | ( (lv_is_true_2_0= 'true' ) ) | ( (lv_is_false_3_0= 'false' ) ) | ( ( (lv_is_sqaure_bracket_4_0= '[' ) ) ( (lv_data_list_5_0= ruleDataExprList ) )? otherlv_6= ']' ) | ( ( (lv_is_curly_bracket_7_0= '{' ) ) ( ( (lv_is_colon_8_0= ':' ) ) | ( ( 'true' | 'false' | '[' | '{' | '(' | '!' | '-' | '#' | 'forall' | 'exists' | 'lambda' | RULE_ID | RULE_INT )=> (lv_bag_9_0= ruleBagEnumEltList ) ) | ( ( 'true' | 'false' | '[' | '{' | '(' | '!' | '-' | '#' | 'forall' | 'exists' | 'lambda' | RULE_ID | RULE_INT )=> (lv_data_exp_list_10_0= ruleDataExprList ) ) | ( ( RULE_ID )=> ( ( (lv_var_decl_11_0= ruleVarsDecl ) ) otherlv_12= '|' ( (lv_data_exp_13_0= ruleDataExpr ) ) ) ) )? otherlv_14= '}' ) | ( ( (lv_is_round_bracket_15_0= '(' ) ) ( (lv_data_exp_16_0= ruleDataExpr ) ) otherlv_17= ')' ) | (otherlv_18= '!' ( (lv_data_exp_19_0= ruleDataExpr ) ) ) | (otherlv_20= '-' ( (lv_data_exp_21_0= ruleDataExpr ) ) ) | (otherlv_22= '#' ( (lv_data_exp_23_0= ruleDataExpr ) ) ) | ( ( ( (lv_is_forall_24_0= 'forall' ) ) | ( (lv_is_exist_25_0= 'exists' ) ) | ( (lv_is_lambda_26_0= 'lambda' ) ) ) ( (lv_var_list_27_0= ruleVarsDeclList ) ) otherlv_28= '.' ( (lv_data_exp_29_0= ruleDataExpr ) ) ) ) ;
    public final EObject ruleDataExprTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_num_1_0=null;
        Token lv_is_true_2_0=null;
        Token lv_is_false_3_0=null;
        Token lv_is_sqaure_bracket_4_0=null;
        Token otherlv_6=null;
        Token lv_is_curly_bracket_7_0=null;
        Token lv_is_colon_8_0=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token lv_is_round_bracket_15_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token lv_is_forall_24_0=null;
        Token lv_is_exist_25_0=null;
        Token lv_is_lambda_26_0=null;
        Token otherlv_28=null;
        EObject lv_data_list_5_0 = null;

        EObject lv_bag_9_0 = null;

        EObject lv_data_exp_list_10_0 = null;

        EObject lv_var_decl_11_0 = null;

        EObject lv_data_exp_13_0 = null;

        EObject lv_data_exp_16_0 = null;

        EObject lv_data_exp_19_0 = null;

        EObject lv_data_exp_21_0 = null;

        EObject lv_data_exp_23_0 = null;

        EObject lv_var_list_27_0 = null;

        EObject lv_data_exp_29_0 = null;



        	enterRule();

        try {
            // InternalMclrDsl.g:1650:2: ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_num_1_0= RULE_INT ) ) | ( (lv_is_true_2_0= 'true' ) ) | ( (lv_is_false_3_0= 'false' ) ) | ( ( (lv_is_sqaure_bracket_4_0= '[' ) ) ( (lv_data_list_5_0= ruleDataExprList ) )? otherlv_6= ']' ) | ( ( (lv_is_curly_bracket_7_0= '{' ) ) ( ( (lv_is_colon_8_0= ':' ) ) | ( ( 'true' | 'false' | '[' | '{' | '(' | '!' | '-' | '#' | 'forall' | 'exists' | 'lambda' | RULE_ID | RULE_INT )=> (lv_bag_9_0= ruleBagEnumEltList ) ) | ( ( 'true' | 'false' | '[' | '{' | '(' | '!' | '-' | '#' | 'forall' | 'exists' | 'lambda' | RULE_ID | RULE_INT )=> (lv_data_exp_list_10_0= ruleDataExprList ) ) | ( ( RULE_ID )=> ( ( (lv_var_decl_11_0= ruleVarsDecl ) ) otherlv_12= '|' ( (lv_data_exp_13_0= ruleDataExpr ) ) ) ) )? otherlv_14= '}' ) | ( ( (lv_is_round_bracket_15_0= '(' ) ) ( (lv_data_exp_16_0= ruleDataExpr ) ) otherlv_17= ')' ) | (otherlv_18= '!' ( (lv_data_exp_19_0= ruleDataExpr ) ) ) | (otherlv_20= '-' ( (lv_data_exp_21_0= ruleDataExpr ) ) ) | (otherlv_22= '#' ( (lv_data_exp_23_0= ruleDataExpr ) ) ) | ( ( ( (lv_is_forall_24_0= 'forall' ) ) | ( (lv_is_exist_25_0= 'exists' ) ) | ( (lv_is_lambda_26_0= 'lambda' ) ) ) ( (lv_var_list_27_0= ruleVarsDeclList ) ) otherlv_28= '.' ( (lv_data_exp_29_0= ruleDataExpr ) ) ) ) )
            // InternalMclrDsl.g:1651:2: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_num_1_0= RULE_INT ) ) | ( (lv_is_true_2_0= 'true' ) ) | ( (lv_is_false_3_0= 'false' ) ) | ( ( (lv_is_sqaure_bracket_4_0= '[' ) ) ( (lv_data_list_5_0= ruleDataExprList ) )? otherlv_6= ']' ) | ( ( (lv_is_curly_bracket_7_0= '{' ) ) ( ( (lv_is_colon_8_0= ':' ) ) | ( ( 'true' | 'false' | '[' | '{' | '(' | '!' | '-' | '#' | 'forall' | 'exists' | 'lambda' | RULE_ID | RULE_INT )=> (lv_bag_9_0= ruleBagEnumEltList ) ) | ( ( 'true' | 'false' | '[' | '{' | '(' | '!' | '-' | '#' | 'forall' | 'exists' | 'lambda' | RULE_ID | RULE_INT )=> (lv_data_exp_list_10_0= ruleDataExprList ) ) | ( ( RULE_ID )=> ( ( (lv_var_decl_11_0= ruleVarsDecl ) ) otherlv_12= '|' ( (lv_data_exp_13_0= ruleDataExpr ) ) ) ) )? otherlv_14= '}' ) | ( ( (lv_is_round_bracket_15_0= '(' ) ) ( (lv_data_exp_16_0= ruleDataExpr ) ) otherlv_17= ')' ) | (otherlv_18= '!' ( (lv_data_exp_19_0= ruleDataExpr ) ) ) | (otherlv_20= '-' ( (lv_data_exp_21_0= ruleDataExpr ) ) ) | (otherlv_22= '#' ( (lv_data_exp_23_0= ruleDataExpr ) ) ) | ( ( ( (lv_is_forall_24_0= 'forall' ) ) | ( (lv_is_exist_25_0= 'exists' ) ) | ( (lv_is_lambda_26_0= 'lambda' ) ) ) ( (lv_var_list_27_0= ruleVarsDeclList ) ) otherlv_28= '.' ( (lv_data_exp_29_0= ruleDataExpr ) ) ) )
            {
            // InternalMclrDsl.g:1651:2: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_num_1_0= RULE_INT ) ) | ( (lv_is_true_2_0= 'true' ) ) | ( (lv_is_false_3_0= 'false' ) ) | ( ( (lv_is_sqaure_bracket_4_0= '[' ) ) ( (lv_data_list_5_0= ruleDataExprList ) )? otherlv_6= ']' ) | ( ( (lv_is_curly_bracket_7_0= '{' ) ) ( ( (lv_is_colon_8_0= ':' ) ) | ( ( 'true' | 'false' | '[' | '{' | '(' | '!' | '-' | '#' | 'forall' | 'exists' | 'lambda' | RULE_ID | RULE_INT )=> (lv_bag_9_0= ruleBagEnumEltList ) ) | ( ( 'true' | 'false' | '[' | '{' | '(' | '!' | '-' | '#' | 'forall' | 'exists' | 'lambda' | RULE_ID | RULE_INT )=> (lv_data_exp_list_10_0= ruleDataExprList ) ) | ( ( RULE_ID )=> ( ( (lv_var_decl_11_0= ruleVarsDecl ) ) otherlv_12= '|' ( (lv_data_exp_13_0= ruleDataExpr ) ) ) ) )? otherlv_14= '}' ) | ( ( (lv_is_round_bracket_15_0= '(' ) ) ( (lv_data_exp_16_0= ruleDataExpr ) ) otherlv_17= ')' ) | (otherlv_18= '!' ( (lv_data_exp_19_0= ruleDataExpr ) ) ) | (otherlv_20= '-' ( (lv_data_exp_21_0= ruleDataExpr ) ) ) | (otherlv_22= '#' ( (lv_data_exp_23_0= ruleDataExpr ) ) ) | ( ( ( (lv_is_forall_24_0= 'forall' ) ) | ( (lv_is_exist_25_0= 'exists' ) ) | ( (lv_is_lambda_26_0= 'lambda' ) ) ) ( (lv_var_list_27_0= ruleVarsDeclList ) ) otherlv_28= '.' ( (lv_data_exp_29_0= ruleDataExpr ) ) ) )
            int alt23=11;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt23=1;
                }
                break;
            case RULE_INT:
                {
                alt23=2;
                }
                break;
            case 23:
                {
                alt23=3;
                }
                break;
            case 24:
                {
                alt23=4;
                }
                break;
            case 28:
                {
                alt23=5;
                }
                break;
            case 14:
                {
                alt23=6;
                }
                break;
            case 12:
                {
                alt23=7;
                }
                break;
            case 25:
                {
                alt23=8;
                }
                break;
            case 26:
                {
                alt23=9;
                }
                break;
            case 27:
                {
                alt23=10;
                }
                break;
            case 50:
            case 51:
            case 52:
                {
                alt23=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalMclrDsl.g:1652:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalMclrDsl.g:1652:3: ( (otherlv_0= RULE_ID ) )
                    // InternalMclrDsl.g:1653:4: (otherlv_0= RULE_ID )
                    {
                    // InternalMclrDsl.g:1653:4: (otherlv_0= RULE_ID )
                    // InternalMclrDsl.g:1654:5: otherlv_0= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDataExprTermRule());
                      					}
                      				
                    }
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_0, grammarAccess.getDataExprTermAccess().getVar_idVarNameCrossReference_0_0());
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMclrDsl.g:1666:3: ( (lv_num_1_0= RULE_INT ) )
                    {
                    // InternalMclrDsl.g:1666:3: ( (lv_num_1_0= RULE_INT ) )
                    // InternalMclrDsl.g:1667:4: (lv_num_1_0= RULE_INT )
                    {
                    // InternalMclrDsl.g:1667:4: (lv_num_1_0= RULE_INT )
                    // InternalMclrDsl.g:1668:5: lv_num_1_0= RULE_INT
                    {
                    lv_num_1_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_num_1_0, grammarAccess.getDataExprTermAccess().getNumINTTerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDataExprTermRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"num",
                      						lv_num_1_0,
                      						"org.eclipse.xtext.common.Terminals.INT");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMclrDsl.g:1685:3: ( (lv_is_true_2_0= 'true' ) )
                    {
                    // InternalMclrDsl.g:1685:3: ( (lv_is_true_2_0= 'true' ) )
                    // InternalMclrDsl.g:1686:4: (lv_is_true_2_0= 'true' )
                    {
                    // InternalMclrDsl.g:1686:4: (lv_is_true_2_0= 'true' )
                    // InternalMclrDsl.g:1687:5: lv_is_true_2_0= 'true'
                    {
                    lv_is_true_2_0=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_is_true_2_0, grammarAccess.getDataExprTermAccess().getIs_trueTrueKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDataExprTermRule());
                      					}
                      					setWithLastConsumed(current, "is_true", true, "true");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMclrDsl.g:1700:3: ( (lv_is_false_3_0= 'false' ) )
                    {
                    // InternalMclrDsl.g:1700:3: ( (lv_is_false_3_0= 'false' ) )
                    // InternalMclrDsl.g:1701:4: (lv_is_false_3_0= 'false' )
                    {
                    // InternalMclrDsl.g:1701:4: (lv_is_false_3_0= 'false' )
                    // InternalMclrDsl.g:1702:5: lv_is_false_3_0= 'false'
                    {
                    lv_is_false_3_0=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_is_false_3_0, grammarAccess.getDataExprTermAccess().getIs_falseFalseKeyword_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDataExprTermRule());
                      					}
                      					setWithLastConsumed(current, "is_false", true, "false");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalMclrDsl.g:1715:3: ( ( (lv_is_sqaure_bracket_4_0= '[' ) ) ( (lv_data_list_5_0= ruleDataExprList ) )? otherlv_6= ']' )
                    {
                    // InternalMclrDsl.g:1715:3: ( ( (lv_is_sqaure_bracket_4_0= '[' ) ) ( (lv_data_list_5_0= ruleDataExprList ) )? otherlv_6= ']' )
                    // InternalMclrDsl.g:1716:4: ( (lv_is_sqaure_bracket_4_0= '[' ) ) ( (lv_data_list_5_0= ruleDataExprList ) )? otherlv_6= ']'
                    {
                    // InternalMclrDsl.g:1716:4: ( (lv_is_sqaure_bracket_4_0= '[' ) )
                    // InternalMclrDsl.g:1717:5: (lv_is_sqaure_bracket_4_0= '[' )
                    {
                    // InternalMclrDsl.g:1717:5: (lv_is_sqaure_bracket_4_0= '[' )
                    // InternalMclrDsl.g:1718:6: lv_is_sqaure_bracket_4_0= '['
                    {
                    lv_is_sqaure_bracket_4_0=(Token)match(input,28,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_is_sqaure_bracket_4_0, grammarAccess.getDataExprTermAccess().getIs_sqaure_bracketLeftSquareBracketKeyword_4_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDataExprTermRule());
                      						}
                      						setWithLastConsumed(current, "is_sqaure_bracket", true, "[");
                      					
                    }

                    }


                    }

                    // InternalMclrDsl.g:1730:4: ( (lv_data_list_5_0= ruleDataExprList ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( ((LA20_0>=RULE_ID && LA20_0<=RULE_INT)||LA20_0==12||LA20_0==14||(LA20_0>=23 && LA20_0<=28)||(LA20_0>=50 && LA20_0<=52)) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalMclrDsl.g:1731:5: (lv_data_list_5_0= ruleDataExprList )
                            {
                            // InternalMclrDsl.g:1731:5: (lv_data_list_5_0= ruleDataExprList )
                            // InternalMclrDsl.g:1732:6: lv_data_list_5_0= ruleDataExprList
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getDataExprTermAccess().getData_listDataExprListParserRuleCall_4_1_0());
                              					
                            }
                            pushFollow(FOLLOW_23);
                            lv_data_list_5_0=ruleDataExprList();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getDataExprTermRule());
                              						}
                              						set(
                              							current,
                              							"data_list",
                              							lv_data_list_5_0,
                              							"tuks.mcrl2.dsl.MclrDsl.DataExprList");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getDataExprTermAccess().getRightSquareBracketKeyword_4_2());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalMclrDsl.g:1755:3: ( ( (lv_is_curly_bracket_7_0= '{' ) ) ( ( (lv_is_colon_8_0= ':' ) ) | ( ( 'true' | 'false' | '[' | '{' | '(' | '!' | '-' | '#' | 'forall' | 'exists' | 'lambda' | RULE_ID | RULE_INT )=> (lv_bag_9_0= ruleBagEnumEltList ) ) | ( ( 'true' | 'false' | '[' | '{' | '(' | '!' | '-' | '#' | 'forall' | 'exists' | 'lambda' | RULE_ID | RULE_INT )=> (lv_data_exp_list_10_0= ruleDataExprList ) ) | ( ( RULE_ID )=> ( ( (lv_var_decl_11_0= ruleVarsDecl ) ) otherlv_12= '|' ( (lv_data_exp_13_0= ruleDataExpr ) ) ) ) )? otherlv_14= '}' )
                    {
                    // InternalMclrDsl.g:1755:3: ( ( (lv_is_curly_bracket_7_0= '{' ) ) ( ( (lv_is_colon_8_0= ':' ) ) | ( ( 'true' | 'false' | '[' | '{' | '(' | '!' | '-' | '#' | 'forall' | 'exists' | 'lambda' | RULE_ID | RULE_INT )=> (lv_bag_9_0= ruleBagEnumEltList ) ) | ( ( 'true' | 'false' | '[' | '{' | '(' | '!' | '-' | '#' | 'forall' | 'exists' | 'lambda' | RULE_ID | RULE_INT )=> (lv_data_exp_list_10_0= ruleDataExprList ) ) | ( ( RULE_ID )=> ( ( (lv_var_decl_11_0= ruleVarsDecl ) ) otherlv_12= '|' ( (lv_data_exp_13_0= ruleDataExpr ) ) ) ) )? otherlv_14= '}' )
                    // InternalMclrDsl.g:1756:4: ( (lv_is_curly_bracket_7_0= '{' ) ) ( ( (lv_is_colon_8_0= ':' ) ) | ( ( 'true' | 'false' | '[' | '{' | '(' | '!' | '-' | '#' | 'forall' | 'exists' | 'lambda' | RULE_ID | RULE_INT )=> (lv_bag_9_0= ruleBagEnumEltList ) ) | ( ( 'true' | 'false' | '[' | '{' | '(' | '!' | '-' | '#' | 'forall' | 'exists' | 'lambda' | RULE_ID | RULE_INT )=> (lv_data_exp_list_10_0= ruleDataExprList ) ) | ( ( RULE_ID )=> ( ( (lv_var_decl_11_0= ruleVarsDecl ) ) otherlv_12= '|' ( (lv_data_exp_13_0= ruleDataExpr ) ) ) ) )? otherlv_14= '}'
                    {
                    // InternalMclrDsl.g:1756:4: ( (lv_is_curly_bracket_7_0= '{' ) )
                    // InternalMclrDsl.g:1757:5: (lv_is_curly_bracket_7_0= '{' )
                    {
                    // InternalMclrDsl.g:1757:5: (lv_is_curly_bracket_7_0= '{' )
                    // InternalMclrDsl.g:1758:6: lv_is_curly_bracket_7_0= '{'
                    {
                    lv_is_curly_bracket_7_0=(Token)match(input,14,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_is_curly_bracket_7_0, grammarAccess.getDataExprTermAccess().getIs_curly_bracketLeftCurlyBracketKeyword_5_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDataExprTermRule());
                      						}
                      						setWithLastConsumed(current, "is_curly_bracket", true, "{");
                      					
                    }

                    }


                    }

                    // InternalMclrDsl.g:1770:4: ( ( (lv_is_colon_8_0= ':' ) ) | ( ( 'true' | 'false' | '[' | '{' | '(' | '!' | '-' | '#' | 'forall' | 'exists' | 'lambda' | RULE_ID | RULE_INT )=> (lv_bag_9_0= ruleBagEnumEltList ) ) | ( ( 'true' | 'false' | '[' | '{' | '(' | '!' | '-' | '#' | 'forall' | 'exists' | 'lambda' | RULE_ID | RULE_INT )=> (lv_data_exp_list_10_0= ruleDataExprList ) ) | ( ( RULE_ID )=> ( ( (lv_var_decl_11_0= ruleVarsDecl ) ) otherlv_12= '|' ( (lv_data_exp_13_0= ruleDataExpr ) ) ) ) )?
                    int alt21=5;
                    alt21 = dfa21.predict(input);
                    switch (alt21) {
                        case 1 :
                            // InternalMclrDsl.g:1771:5: ( (lv_is_colon_8_0= ':' ) )
                            {
                            // InternalMclrDsl.g:1771:5: ( (lv_is_colon_8_0= ':' ) )
                            // InternalMclrDsl.g:1772:6: (lv_is_colon_8_0= ':' )
                            {
                            // InternalMclrDsl.g:1772:6: (lv_is_colon_8_0= ':' )
                            // InternalMclrDsl.g:1773:7: lv_is_colon_8_0= ':'
                            {
                            lv_is_colon_8_0=(Token)match(input,17,FOLLOW_10); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_is_colon_8_0, grammarAccess.getDataExprTermAccess().getIs_colonColonKeyword_5_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getDataExprTermRule());
                              							}
                              							setWithLastConsumed(current, "is_colon", true, ":");
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalMclrDsl.g:1786:5: ( ( 'true' | 'false' | '[' | '{' | '(' | '!' | '-' | '#' | 'forall' | 'exists' | 'lambda' | RULE_ID | RULE_INT )=> (lv_bag_9_0= ruleBagEnumEltList ) )
                            {
                            // InternalMclrDsl.g:1786:5: ( ( 'true' | 'false' | '[' | '{' | '(' | '!' | '-' | '#' | 'forall' | 'exists' | 'lambda' | RULE_ID | RULE_INT )=> (lv_bag_9_0= ruleBagEnumEltList ) )
                            // InternalMclrDsl.g:1787:6: ( 'true' | 'false' | '[' | '{' | '(' | '!' | '-' | '#' | 'forall' | 'exists' | 'lambda' | RULE_ID | RULE_INT )=> (lv_bag_9_0= ruleBagEnumEltList )
                            {
                            // InternalMclrDsl.g:1788:6: (lv_bag_9_0= ruleBagEnumEltList )
                            // InternalMclrDsl.g:1789:7: lv_bag_9_0= ruleBagEnumEltList
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getDataExprTermAccess().getBagBagEnumEltListParserRuleCall_5_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_10);
                            lv_bag_9_0=ruleBagEnumEltList();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getDataExprTermRule());
                              							}
                              							set(
                              								current,
                              								"bag",
                              								lv_bag_9_0,
                              								"tuks.mcrl2.dsl.MclrDsl.BagEnumEltList");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalMclrDsl.g:1807:5: ( ( 'true' | 'false' | '[' | '{' | '(' | '!' | '-' | '#' | 'forall' | 'exists' | 'lambda' | RULE_ID | RULE_INT )=> (lv_data_exp_list_10_0= ruleDataExprList ) )
                            {
                            // InternalMclrDsl.g:1807:5: ( ( 'true' | 'false' | '[' | '{' | '(' | '!' | '-' | '#' | 'forall' | 'exists' | 'lambda' | RULE_ID | RULE_INT )=> (lv_data_exp_list_10_0= ruleDataExprList ) )
                            // InternalMclrDsl.g:1808:6: ( 'true' | 'false' | '[' | '{' | '(' | '!' | '-' | '#' | 'forall' | 'exists' | 'lambda' | RULE_ID | RULE_INT )=> (lv_data_exp_list_10_0= ruleDataExprList )
                            {
                            // InternalMclrDsl.g:1809:6: (lv_data_exp_list_10_0= ruleDataExprList )
                            // InternalMclrDsl.g:1810:7: lv_data_exp_list_10_0= ruleDataExprList
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getDataExprTermAccess().getData_exp_listDataExprListParserRuleCall_5_1_2_0());
                              						
                            }
                            pushFollow(FOLLOW_10);
                            lv_data_exp_list_10_0=ruleDataExprList();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getDataExprTermRule());
                              							}
                              							set(
                              								current,
                              								"data_exp_list",
                              								lv_data_exp_list_10_0,
                              								"tuks.mcrl2.dsl.MclrDsl.DataExprList");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 4 :
                            // InternalMclrDsl.g:1828:5: ( ( RULE_ID )=> ( ( (lv_var_decl_11_0= ruleVarsDecl ) ) otherlv_12= '|' ( (lv_data_exp_13_0= ruleDataExpr ) ) ) )
                            {
                            // InternalMclrDsl.g:1828:5: ( ( RULE_ID )=> ( ( (lv_var_decl_11_0= ruleVarsDecl ) ) otherlv_12= '|' ( (lv_data_exp_13_0= ruleDataExpr ) ) ) )
                            // InternalMclrDsl.g:1829:6: ( RULE_ID )=> ( ( (lv_var_decl_11_0= ruleVarsDecl ) ) otherlv_12= '|' ( (lv_data_exp_13_0= ruleDataExpr ) ) )
                            {
                            // InternalMclrDsl.g:1830:6: ( ( (lv_var_decl_11_0= ruleVarsDecl ) ) otherlv_12= '|' ( (lv_data_exp_13_0= ruleDataExpr ) ) )
                            // InternalMclrDsl.g:1831:7: ( (lv_var_decl_11_0= ruleVarsDecl ) ) otherlv_12= '|' ( (lv_data_exp_13_0= ruleDataExpr ) )
                            {
                            // InternalMclrDsl.g:1831:7: ( (lv_var_decl_11_0= ruleVarsDecl ) )
                            // InternalMclrDsl.g:1832:8: (lv_var_decl_11_0= ruleVarsDecl )
                            {
                            // InternalMclrDsl.g:1832:8: (lv_var_decl_11_0= ruleVarsDecl )
                            // InternalMclrDsl.g:1833:9: lv_var_decl_11_0= ruleVarsDecl
                            {
                            if ( state.backtracking==0 ) {

                              									newCompositeNode(grammarAccess.getDataExprTermAccess().getVar_declVarsDeclParserRuleCall_5_1_3_0_0_0());
                              								
                            }
                            pushFollow(FOLLOW_28);
                            lv_var_decl_11_0=ruleVarsDecl();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              									if (current==null) {
                              										current = createModelElementForParent(grammarAccess.getDataExprTermRule());
                              									}
                              									set(
                              										current,
                              										"var_decl",
                              										lv_var_decl_11_0,
                              										"tuks.mcrl2.dsl.MclrDsl.VarsDecl");
                              									afterParserOrEnumRuleCall();
                              								
                            }

                            }


                            }

                            otherlv_12=(Token)match(input,21,FOLLOW_8); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_12, grammarAccess.getDataExprTermAccess().getVerticalLineKeyword_5_1_3_0_1());
                              						
                            }
                            // InternalMclrDsl.g:1854:7: ( (lv_data_exp_13_0= ruleDataExpr ) )
                            // InternalMclrDsl.g:1855:8: (lv_data_exp_13_0= ruleDataExpr )
                            {
                            // InternalMclrDsl.g:1855:8: (lv_data_exp_13_0= ruleDataExpr )
                            // InternalMclrDsl.g:1856:9: lv_data_exp_13_0= ruleDataExpr
                            {
                            if ( state.backtracking==0 ) {

                              									newCompositeNode(grammarAccess.getDataExprTermAccess().getData_expDataExprParserRuleCall_5_1_3_0_2_0());
                              								
                            }
                            pushFollow(FOLLOW_10);
                            lv_data_exp_13_0=ruleDataExpr();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              									if (current==null) {
                              										current = createModelElementForParent(grammarAccess.getDataExprTermRule());
                              									}
                              									set(
                              										current,
                              										"data_exp",
                              										lv_data_exp_13_0,
                              										"tuks.mcrl2.dsl.MclrDsl.DataExpr");
                              									afterParserOrEnumRuleCall();
                              								
                            }

                            }


                            }


                            }


                            }


                            }
                            break;

                    }

                    otherlv_14=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getDataExprTermAccess().getRightCurlyBracketKeyword_5_2());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalMclrDsl.g:1882:3: ( ( (lv_is_round_bracket_15_0= '(' ) ) ( (lv_data_exp_16_0= ruleDataExpr ) ) otherlv_17= ')' )
                    {
                    // InternalMclrDsl.g:1882:3: ( ( (lv_is_round_bracket_15_0= '(' ) ) ( (lv_data_exp_16_0= ruleDataExpr ) ) otherlv_17= ')' )
                    // InternalMclrDsl.g:1883:4: ( (lv_is_round_bracket_15_0= '(' ) ) ( (lv_data_exp_16_0= ruleDataExpr ) ) otherlv_17= ')'
                    {
                    // InternalMclrDsl.g:1883:4: ( (lv_is_round_bracket_15_0= '(' ) )
                    // InternalMclrDsl.g:1884:5: (lv_is_round_bracket_15_0= '(' )
                    {
                    // InternalMclrDsl.g:1884:5: (lv_is_round_bracket_15_0= '(' )
                    // InternalMclrDsl.g:1885:6: lv_is_round_bracket_15_0= '('
                    {
                    lv_is_round_bracket_15_0=(Token)match(input,12,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_is_round_bracket_15_0, grammarAccess.getDataExprTermAccess().getIs_round_bracketLeftParenthesisKeyword_6_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDataExprTermRule());
                      						}
                      						setWithLastConsumed(current, "is_round_bracket", true, "(");
                      					
                    }

                    }


                    }

                    // InternalMclrDsl.g:1897:4: ( (lv_data_exp_16_0= ruleDataExpr ) )
                    // InternalMclrDsl.g:1898:5: (lv_data_exp_16_0= ruleDataExpr )
                    {
                    // InternalMclrDsl.g:1898:5: (lv_data_exp_16_0= ruleDataExpr )
                    // InternalMclrDsl.g:1899:6: lv_data_exp_16_0= ruleDataExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDataExprTermAccess().getData_expDataExprParserRuleCall_6_1_0());
                      					
                    }
                    pushFollow(FOLLOW_9);
                    lv_data_exp_16_0=ruleDataExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDataExprTermRule());
                      						}
                      						set(
                      							current,
                      							"data_exp",
                      							lv_data_exp_16_0,
                      							"tuks.mcrl2.dsl.MclrDsl.DataExpr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getDataExprTermAccess().getRightParenthesisKeyword_6_2());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalMclrDsl.g:1922:3: (otherlv_18= '!' ( (lv_data_exp_19_0= ruleDataExpr ) ) )
                    {
                    // InternalMclrDsl.g:1922:3: (otherlv_18= '!' ( (lv_data_exp_19_0= ruleDataExpr ) ) )
                    // InternalMclrDsl.g:1923:4: otherlv_18= '!' ( (lv_data_exp_19_0= ruleDataExpr ) )
                    {
                    otherlv_18=(Token)match(input,25,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getDataExprTermAccess().getExclamationMarkKeyword_7_0());
                      			
                    }
                    // InternalMclrDsl.g:1927:4: ( (lv_data_exp_19_0= ruleDataExpr ) )
                    // InternalMclrDsl.g:1928:5: (lv_data_exp_19_0= ruleDataExpr )
                    {
                    // InternalMclrDsl.g:1928:5: (lv_data_exp_19_0= ruleDataExpr )
                    // InternalMclrDsl.g:1929:6: lv_data_exp_19_0= ruleDataExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDataExprTermAccess().getData_expDataExprParserRuleCall_7_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_data_exp_19_0=ruleDataExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDataExprTermRule());
                      						}
                      						set(
                      							current,
                      							"data_exp",
                      							lv_data_exp_19_0,
                      							"tuks.mcrl2.dsl.MclrDsl.DataExpr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalMclrDsl.g:1948:3: (otherlv_20= '-' ( (lv_data_exp_21_0= ruleDataExpr ) ) )
                    {
                    // InternalMclrDsl.g:1948:3: (otherlv_20= '-' ( (lv_data_exp_21_0= ruleDataExpr ) ) )
                    // InternalMclrDsl.g:1949:4: otherlv_20= '-' ( (lv_data_exp_21_0= ruleDataExpr ) )
                    {
                    otherlv_20=(Token)match(input,26,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_20, grammarAccess.getDataExprTermAccess().getHyphenMinusKeyword_8_0());
                      			
                    }
                    // InternalMclrDsl.g:1953:4: ( (lv_data_exp_21_0= ruleDataExpr ) )
                    // InternalMclrDsl.g:1954:5: (lv_data_exp_21_0= ruleDataExpr )
                    {
                    // InternalMclrDsl.g:1954:5: (lv_data_exp_21_0= ruleDataExpr )
                    // InternalMclrDsl.g:1955:6: lv_data_exp_21_0= ruleDataExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDataExprTermAccess().getData_expDataExprParserRuleCall_8_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_data_exp_21_0=ruleDataExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDataExprTermRule());
                      						}
                      						set(
                      							current,
                      							"data_exp",
                      							lv_data_exp_21_0,
                      							"tuks.mcrl2.dsl.MclrDsl.DataExpr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 10 :
                    // InternalMclrDsl.g:1974:3: (otherlv_22= '#' ( (lv_data_exp_23_0= ruleDataExpr ) ) )
                    {
                    // InternalMclrDsl.g:1974:3: (otherlv_22= '#' ( (lv_data_exp_23_0= ruleDataExpr ) ) )
                    // InternalMclrDsl.g:1975:4: otherlv_22= '#' ( (lv_data_exp_23_0= ruleDataExpr ) )
                    {
                    otherlv_22=(Token)match(input,27,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_22, grammarAccess.getDataExprTermAccess().getNumberSignKeyword_9_0());
                      			
                    }
                    // InternalMclrDsl.g:1979:4: ( (lv_data_exp_23_0= ruleDataExpr ) )
                    // InternalMclrDsl.g:1980:5: (lv_data_exp_23_0= ruleDataExpr )
                    {
                    // InternalMclrDsl.g:1980:5: (lv_data_exp_23_0= ruleDataExpr )
                    // InternalMclrDsl.g:1981:6: lv_data_exp_23_0= ruleDataExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDataExprTermAccess().getData_expDataExprParserRuleCall_9_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_data_exp_23_0=ruleDataExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDataExprTermRule());
                      						}
                      						set(
                      							current,
                      							"data_exp",
                      							lv_data_exp_23_0,
                      							"tuks.mcrl2.dsl.MclrDsl.DataExpr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 11 :
                    // InternalMclrDsl.g:2000:3: ( ( ( (lv_is_forall_24_0= 'forall' ) ) | ( (lv_is_exist_25_0= 'exists' ) ) | ( (lv_is_lambda_26_0= 'lambda' ) ) ) ( (lv_var_list_27_0= ruleVarsDeclList ) ) otherlv_28= '.' ( (lv_data_exp_29_0= ruleDataExpr ) ) )
                    {
                    // InternalMclrDsl.g:2000:3: ( ( ( (lv_is_forall_24_0= 'forall' ) ) | ( (lv_is_exist_25_0= 'exists' ) ) | ( (lv_is_lambda_26_0= 'lambda' ) ) ) ( (lv_var_list_27_0= ruleVarsDeclList ) ) otherlv_28= '.' ( (lv_data_exp_29_0= ruleDataExpr ) ) )
                    // InternalMclrDsl.g:2001:4: ( ( (lv_is_forall_24_0= 'forall' ) ) | ( (lv_is_exist_25_0= 'exists' ) ) | ( (lv_is_lambda_26_0= 'lambda' ) ) ) ( (lv_var_list_27_0= ruleVarsDeclList ) ) otherlv_28= '.' ( (lv_data_exp_29_0= ruleDataExpr ) )
                    {
                    // InternalMclrDsl.g:2001:4: ( ( (lv_is_forall_24_0= 'forall' ) ) | ( (lv_is_exist_25_0= 'exists' ) ) | ( (lv_is_lambda_26_0= 'lambda' ) ) )
                    int alt22=3;
                    switch ( input.LA(1) ) {
                    case 50:
                        {
                        alt22=1;
                        }
                        break;
                    case 51:
                        {
                        alt22=2;
                        }
                        break;
                    case 52:
                        {
                        alt22=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;
                    }

                    switch (alt22) {
                        case 1 :
                            // InternalMclrDsl.g:2002:5: ( (lv_is_forall_24_0= 'forall' ) )
                            {
                            // InternalMclrDsl.g:2002:5: ( (lv_is_forall_24_0= 'forall' ) )
                            // InternalMclrDsl.g:2003:6: (lv_is_forall_24_0= 'forall' )
                            {
                            // InternalMclrDsl.g:2003:6: (lv_is_forall_24_0= 'forall' )
                            // InternalMclrDsl.g:2004:7: lv_is_forall_24_0= 'forall'
                            {
                            lv_is_forall_24_0=(Token)match(input,50,FOLLOW_6); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_is_forall_24_0, grammarAccess.getDataExprTermAccess().getIs_forallForallKeyword_10_0_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getDataExprTermRule());
                              							}
                              							setWithLastConsumed(current, "is_forall", true, "forall");
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalMclrDsl.g:2017:5: ( (lv_is_exist_25_0= 'exists' ) )
                            {
                            // InternalMclrDsl.g:2017:5: ( (lv_is_exist_25_0= 'exists' ) )
                            // InternalMclrDsl.g:2018:6: (lv_is_exist_25_0= 'exists' )
                            {
                            // InternalMclrDsl.g:2018:6: (lv_is_exist_25_0= 'exists' )
                            // InternalMclrDsl.g:2019:7: lv_is_exist_25_0= 'exists'
                            {
                            lv_is_exist_25_0=(Token)match(input,51,FOLLOW_6); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_is_exist_25_0, grammarAccess.getDataExprTermAccess().getIs_existExistsKeyword_10_0_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getDataExprTermRule());
                              							}
                              							setWithLastConsumed(current, "is_exist", true, "exists");
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalMclrDsl.g:2032:5: ( (lv_is_lambda_26_0= 'lambda' ) )
                            {
                            // InternalMclrDsl.g:2032:5: ( (lv_is_lambda_26_0= 'lambda' ) )
                            // InternalMclrDsl.g:2033:6: (lv_is_lambda_26_0= 'lambda' )
                            {
                            // InternalMclrDsl.g:2033:6: (lv_is_lambda_26_0= 'lambda' )
                            // InternalMclrDsl.g:2034:7: lv_is_lambda_26_0= 'lambda'
                            {
                            lv_is_lambda_26_0=(Token)match(input,52,FOLLOW_6); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_is_lambda_26_0, grammarAccess.getDataExprTermAccess().getIs_lambdaLambdaKeyword_10_0_2_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getDataExprTermRule());
                              							}
                              							setWithLastConsumed(current, "is_lambda", true, "lambda");
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalMclrDsl.g:2047:4: ( (lv_var_list_27_0= ruleVarsDeclList ) )
                    // InternalMclrDsl.g:2048:5: (lv_var_list_27_0= ruleVarsDeclList )
                    {
                    // InternalMclrDsl.g:2048:5: (lv_var_list_27_0= ruleVarsDeclList )
                    // InternalMclrDsl.g:2049:6: lv_var_list_27_0= ruleVarsDeclList
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDataExprTermAccess().getVar_listVarsDeclListParserRuleCall_10_1_0());
                      					
                    }
                    pushFollow(FOLLOW_29);
                    lv_var_list_27_0=ruleVarsDeclList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDataExprTermRule());
                      						}
                      						set(
                      							current,
                      							"var_list",
                      							lv_var_list_27_0,
                      							"tuks.mcrl2.dsl.MclrDsl.VarsDeclList");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_28=(Token)match(input,49,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_28, grammarAccess.getDataExprTermAccess().getFullStopKeyword_10_2());
                      			
                    }
                    // InternalMclrDsl.g:2070:4: ( (lv_data_exp_29_0= ruleDataExpr ) )
                    // InternalMclrDsl.g:2071:5: (lv_data_exp_29_0= ruleDataExpr )
                    {
                    // InternalMclrDsl.g:2071:5: (lv_data_exp_29_0= ruleDataExpr )
                    // InternalMclrDsl.g:2072:6: lv_data_exp_29_0= ruleDataExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDataExprTermAccess().getData_expDataExprParserRuleCall_10_3_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_data_exp_29_0=ruleDataExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDataExprTermRule());
                      						}
                      						set(
                      							current,
                      							"data_exp",
                      							lv_data_exp_29_0,
                      							"tuks.mcrl2.dsl.MclrDsl.DataExpr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDataExprTerm"


    // $ANTLR start "entryRuleDataExprList"
    // InternalMclrDsl.g:2094:1: entryRuleDataExprList returns [EObject current=null] : iv_ruleDataExprList= ruleDataExprList EOF ;
    public final EObject entryRuleDataExprList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataExprList = null;


        try {
            // InternalMclrDsl.g:2094:53: (iv_ruleDataExprList= ruleDataExprList EOF )
            // InternalMclrDsl.g:2095:2: iv_ruleDataExprList= ruleDataExprList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataExprListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDataExprList=ruleDataExprList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataExprList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDataExprList"


    // $ANTLR start "ruleDataExprList"
    // InternalMclrDsl.g:2101:1: ruleDataExprList returns [EObject current=null] : ( ( (lv_data_exp_0_0= ruleDataExpr ) ) (otherlv_1= ',' ( (lv_data_exp_2_0= ruleDataExpr ) ) )* ) ;
    public final EObject ruleDataExprList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_data_exp_0_0 = null;

        EObject lv_data_exp_2_0 = null;



        	enterRule();

        try {
            // InternalMclrDsl.g:2107:2: ( ( ( (lv_data_exp_0_0= ruleDataExpr ) ) (otherlv_1= ',' ( (lv_data_exp_2_0= ruleDataExpr ) ) )* ) )
            // InternalMclrDsl.g:2108:2: ( ( (lv_data_exp_0_0= ruleDataExpr ) ) (otherlv_1= ',' ( (lv_data_exp_2_0= ruleDataExpr ) ) )* )
            {
            // InternalMclrDsl.g:2108:2: ( ( (lv_data_exp_0_0= ruleDataExpr ) ) (otherlv_1= ',' ( (lv_data_exp_2_0= ruleDataExpr ) ) )* )
            // InternalMclrDsl.g:2109:3: ( (lv_data_exp_0_0= ruleDataExpr ) ) (otherlv_1= ',' ( (lv_data_exp_2_0= ruleDataExpr ) ) )*
            {
            // InternalMclrDsl.g:2109:3: ( (lv_data_exp_0_0= ruleDataExpr ) )
            // InternalMclrDsl.g:2110:4: (lv_data_exp_0_0= ruleDataExpr )
            {
            // InternalMclrDsl.g:2110:4: (lv_data_exp_0_0= ruleDataExpr )
            // InternalMclrDsl.g:2111:5: lv_data_exp_0_0= ruleDataExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDataExprListAccess().getData_expDataExprParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_data_exp_0_0=ruleDataExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDataExprListRule());
              					}
              					add(
              						current,
              						"data_exp",
              						lv_data_exp_0_0,
              						"tuks.mcrl2.dsl.MclrDsl.DataExpr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMclrDsl.g:2128:3: (otherlv_1= ',' ( (lv_data_exp_2_0= ruleDataExpr ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==11) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMclrDsl.g:2129:4: otherlv_1= ',' ( (lv_data_exp_2_0= ruleDataExpr ) )
            	    {
            	    otherlv_1=(Token)match(input,11,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getDataExprListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalMclrDsl.g:2133:4: ( (lv_data_exp_2_0= ruleDataExpr ) )
            	    // InternalMclrDsl.g:2134:5: (lv_data_exp_2_0= ruleDataExpr )
            	    {
            	    // InternalMclrDsl.g:2134:5: (lv_data_exp_2_0= ruleDataExpr )
            	    // InternalMclrDsl.g:2135:6: lv_data_exp_2_0= ruleDataExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDataExprListAccess().getData_expDataExprParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_data_exp_2_0=ruleDataExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDataExprListRule());
            	      						}
            	      						add(
            	      							current,
            	      							"data_exp",
            	      							lv_data_exp_2_0,
            	      							"tuks.mcrl2.dsl.MclrDsl.DataExpr");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDataExprList"


    // $ANTLR start "entryRuleEqnDecl"
    // InternalMclrDsl.g:2157:1: entryRuleEqnDecl returns [EObject current=null] : iv_ruleEqnDecl= ruleEqnDecl EOF ;
    public final EObject entryRuleEqnDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqnDecl = null;


        try {
            // InternalMclrDsl.g:2157:48: (iv_ruleEqnDecl= ruleEqnDecl EOF )
            // InternalMclrDsl.g:2158:2: iv_ruleEqnDecl= ruleEqnDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqnDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEqnDecl=ruleEqnDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEqnDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEqnDecl"


    // $ANTLR start "ruleEqnDecl"
    // InternalMclrDsl.g:2164:1: ruleEqnDecl returns [EObject current=null] : ( ( ( 'true' | 'false' | '[' | '{' | '(' | '!' | '-' | '#' | 'forall' | 'exists' | 'lambda' | RULE_ID | RULE_INT )=> ( ( (lv_cond_0_0= ruleDataExpr ) ) otherlv_1= '->' ) )? ( (lv_left_2_0= ruleDataExpr ) ) otherlv_3= '=' ( (lv_right_4_0= ruleDataExpr ) ) otherlv_5= ';' ) ;
    public final EObject ruleEqnDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_cond_0_0 = null;

        EObject lv_left_2_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalMclrDsl.g:2170:2: ( ( ( ( 'true' | 'false' | '[' | '{' | '(' | '!' | '-' | '#' | 'forall' | 'exists' | 'lambda' | RULE_ID | RULE_INT )=> ( ( (lv_cond_0_0= ruleDataExpr ) ) otherlv_1= '->' ) )? ( (lv_left_2_0= ruleDataExpr ) ) otherlv_3= '=' ( (lv_right_4_0= ruleDataExpr ) ) otherlv_5= ';' ) )
            // InternalMclrDsl.g:2171:2: ( ( ( 'true' | 'false' | '[' | '{' | '(' | '!' | '-' | '#' | 'forall' | 'exists' | 'lambda' | RULE_ID | RULE_INT )=> ( ( (lv_cond_0_0= ruleDataExpr ) ) otherlv_1= '->' ) )? ( (lv_left_2_0= ruleDataExpr ) ) otherlv_3= '=' ( (lv_right_4_0= ruleDataExpr ) ) otherlv_5= ';' )
            {
            // InternalMclrDsl.g:2171:2: ( ( ( 'true' | 'false' | '[' | '{' | '(' | '!' | '-' | '#' | 'forall' | 'exists' | 'lambda' | RULE_ID | RULE_INT )=> ( ( (lv_cond_0_0= ruleDataExpr ) ) otherlv_1= '->' ) )? ( (lv_left_2_0= ruleDataExpr ) ) otherlv_3= '=' ( (lv_right_4_0= ruleDataExpr ) ) otherlv_5= ';' )
            // InternalMclrDsl.g:2172:3: ( ( 'true' | 'false' | '[' | '{' | '(' | '!' | '-' | '#' | 'forall' | 'exists' | 'lambda' | RULE_ID | RULE_INT )=> ( ( (lv_cond_0_0= ruleDataExpr ) ) otherlv_1= '->' ) )? ( (lv_left_2_0= ruleDataExpr ) ) otherlv_3= '=' ( (lv_right_4_0= ruleDataExpr ) ) otherlv_5= ';'
            {
            // InternalMclrDsl.g:2172:3: ( ( 'true' | 'false' | '[' | '{' | '(' | '!' | '-' | '#' | 'forall' | 'exists' | 'lambda' | RULE_ID | RULE_INT )=> ( ( (lv_cond_0_0= ruleDataExpr ) ) otherlv_1= '->' ) )?
            int alt25=2;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // InternalMclrDsl.g:2173:4: ( 'true' | 'false' | '[' | '{' | '(' | '!' | '-' | '#' | 'forall' | 'exists' | 'lambda' | RULE_ID | RULE_INT )=> ( ( (lv_cond_0_0= ruleDataExpr ) ) otherlv_1= '->' )
                    {
                    // InternalMclrDsl.g:2174:4: ( ( (lv_cond_0_0= ruleDataExpr ) ) otherlv_1= '->' )
                    // InternalMclrDsl.g:2175:5: ( (lv_cond_0_0= ruleDataExpr ) ) otherlv_1= '->'
                    {
                    // InternalMclrDsl.g:2175:5: ( (lv_cond_0_0= ruleDataExpr ) )
                    // InternalMclrDsl.g:2176:6: (lv_cond_0_0= ruleDataExpr )
                    {
                    // InternalMclrDsl.g:2176:6: (lv_cond_0_0= ruleDataExpr )
                    // InternalMclrDsl.g:2177:7: lv_cond_0_0= ruleDataExpr
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getEqnDeclAccess().getCondDataExprParserRuleCall_0_0_0_0());
                      						
                    }
                    pushFollow(FOLLOW_22);
                    lv_cond_0_0=ruleDataExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getEqnDeclRule());
                      							}
                      							set(
                      								current,
                      								"cond",
                      								lv_cond_0_0,
                      								"tuks.mcrl2.dsl.MclrDsl.DataExpr");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,29,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getEqnDeclAccess().getHyphenMinusGreaterThanSignKeyword_0_0_1());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMclrDsl.g:2200:3: ( (lv_left_2_0= ruleDataExpr ) )
            // InternalMclrDsl.g:2201:4: (lv_left_2_0= ruleDataExpr )
            {
            // InternalMclrDsl.g:2201:4: (lv_left_2_0= ruleDataExpr )
            // InternalMclrDsl.g:2202:5: lv_left_2_0= ruleDataExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEqnDeclAccess().getLeftDataExprParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_left_2_0=ruleDataExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEqnDeclRule());
              					}
              					set(
              						current,
              						"left",
              						lv_left_2_0,
              						"tuks.mcrl2.dsl.MclrDsl.DataExpr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getEqnDeclAccess().getEqualsSignKeyword_2());
              		
            }
            // InternalMclrDsl.g:2223:3: ( (lv_right_4_0= ruleDataExpr ) )
            // InternalMclrDsl.g:2224:4: (lv_right_4_0= ruleDataExpr )
            {
            // InternalMclrDsl.g:2224:4: (lv_right_4_0= ruleDataExpr )
            // InternalMclrDsl.g:2225:5: lv_right_4_0= ruleDataExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEqnDeclAccess().getRightDataExprParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_right_4_0=ruleDataExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEqnDeclRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_4_0,
              						"tuks.mcrl2.dsl.MclrDsl.DataExpr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getEqnDeclAccess().getSemicolonKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEqnDecl"


    // $ANTLR start "entryRuleEqnSpec"
    // InternalMclrDsl.g:2250:1: entryRuleEqnSpec returns [EObject current=null] : iv_ruleEqnSpec= ruleEqnSpec EOF ;
    public final EObject entryRuleEqnSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqnSpec = null;


        try {
            // InternalMclrDsl.g:2250:48: (iv_ruleEqnSpec= ruleEqnSpec EOF )
            // InternalMclrDsl.g:2251:2: iv_ruleEqnSpec= ruleEqnSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqnSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEqnSpec=ruleEqnSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEqnSpec; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEqnSpec"


    // $ANTLR start "ruleEqnSpec"
    // InternalMclrDsl.g:2257:1: ruleEqnSpec returns [EObject current=null] : ( ( (lv_spec_0_0= ruleVarSpec ) )? otherlv_1= 'eqn' ( (lv_eqn_2_0= ruleEqnDecl ) )+ ) ;
    public final EObject ruleEqnSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_spec_0_0 = null;

        EObject lv_eqn_2_0 = null;



        	enterRule();

        try {
            // InternalMclrDsl.g:2263:2: ( ( ( (lv_spec_0_0= ruleVarSpec ) )? otherlv_1= 'eqn' ( (lv_eqn_2_0= ruleEqnDecl ) )+ ) )
            // InternalMclrDsl.g:2264:2: ( ( (lv_spec_0_0= ruleVarSpec ) )? otherlv_1= 'eqn' ( (lv_eqn_2_0= ruleEqnDecl ) )+ )
            {
            // InternalMclrDsl.g:2264:2: ( ( (lv_spec_0_0= ruleVarSpec ) )? otherlv_1= 'eqn' ( (lv_eqn_2_0= ruleEqnDecl ) )+ )
            // InternalMclrDsl.g:2265:3: ( (lv_spec_0_0= ruleVarSpec ) )? otherlv_1= 'eqn' ( (lv_eqn_2_0= ruleEqnDecl ) )+
            {
            // InternalMclrDsl.g:2265:3: ( (lv_spec_0_0= ruleVarSpec ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==80) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMclrDsl.g:2266:4: (lv_spec_0_0= ruleVarSpec )
                    {
                    // InternalMclrDsl.g:2266:4: (lv_spec_0_0= ruleVarSpec )
                    // InternalMclrDsl.g:2267:5: lv_spec_0_0= ruleVarSpec
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getEqnSpecAccess().getSpecVarSpecParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_30);
                    lv_spec_0_0=ruleVarSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getEqnSpecRule());
                      					}
                      					set(
                      						current,
                      						"spec",
                      						lv_spec_0_0,
                      						"tuks.mcrl2.dsl.MclrDsl.VarSpec");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,53,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEqnSpecAccess().getEqnKeyword_1());
              		
            }
            // InternalMclrDsl.g:2288:3: ( (lv_eqn_2_0= ruleEqnDecl ) )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=RULE_ID && LA27_0<=RULE_INT)||LA27_0==12||LA27_0==14||(LA27_0>=23 && LA27_0<=28)||(LA27_0>=50 && LA27_0<=52)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMclrDsl.g:2289:4: (lv_eqn_2_0= ruleEqnDecl )
            	    {
            	    // InternalMclrDsl.g:2289:4: (lv_eqn_2_0= ruleEqnDecl )
            	    // InternalMclrDsl.g:2290:5: lv_eqn_2_0= ruleEqnDecl
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEqnSpecAccess().getEqnEqnDeclParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_31);
            	    lv_eqn_2_0=ruleEqnDecl();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getEqnSpecRule());
            	      					}
            	      					add(
            	      						current,
            	      						"eqn",
            	      						lv_eqn_2_0,
            	      						"tuks.mcrl2.dsl.MclrDsl.EqnDecl");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEqnSpec"


    // $ANTLR start "entryRuleMapSpec"
    // InternalMclrDsl.g:2311:1: entryRuleMapSpec returns [EObject current=null] : iv_ruleMapSpec= ruleMapSpec EOF ;
    public final EObject entryRuleMapSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapSpec = null;


        try {
            // InternalMclrDsl.g:2311:48: (iv_ruleMapSpec= ruleMapSpec EOF )
            // InternalMclrDsl.g:2312:2: iv_ruleMapSpec= ruleMapSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMapSpec=ruleMapSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapSpec; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMapSpec"


    // $ANTLR start "ruleMapSpec"
    // InternalMclrDsl.g:2318:1: ruleMapSpec returns [EObject current=null] : (otherlv_0= 'map' ( ( (lv_ids_1_0= ruleSortIdsDecl ) ) otherlv_2= ';' )+ ) ;
    public final EObject ruleMapSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_ids_1_0 = null;



        	enterRule();

        try {
            // InternalMclrDsl.g:2324:2: ( (otherlv_0= 'map' ( ( (lv_ids_1_0= ruleSortIdsDecl ) ) otherlv_2= ';' )+ ) )
            // InternalMclrDsl.g:2325:2: (otherlv_0= 'map' ( ( (lv_ids_1_0= ruleSortIdsDecl ) ) otherlv_2= ';' )+ )
            {
            // InternalMclrDsl.g:2325:2: (otherlv_0= 'map' ( ( (lv_ids_1_0= ruleSortIdsDecl ) ) otherlv_2= ';' )+ )
            // InternalMclrDsl.g:2326:3: otherlv_0= 'map' ( ( (lv_ids_1_0= ruleSortIdsDecl ) ) otherlv_2= ';' )+
            {
            otherlv_0=(Token)match(input,54,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMapSpecAccess().getMapKeyword_0());
              		
            }
            // InternalMclrDsl.g:2330:3: ( ( (lv_ids_1_0= ruleSortIdsDecl ) ) otherlv_2= ';' )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMclrDsl.g:2331:4: ( (lv_ids_1_0= ruleSortIdsDecl ) ) otherlv_2= ';'
            	    {
            	    // InternalMclrDsl.g:2331:4: ( (lv_ids_1_0= ruleSortIdsDecl ) )
            	    // InternalMclrDsl.g:2332:5: (lv_ids_1_0= ruleSortIdsDecl )
            	    {
            	    // InternalMclrDsl.g:2332:5: (lv_ids_1_0= ruleSortIdsDecl )
            	    // InternalMclrDsl.g:2333:6: lv_ids_1_0= ruleSortIdsDecl
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMapSpecAccess().getIdsSortIdsDeclParserRuleCall_1_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_ids_1_0=ruleSortIdsDecl();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getMapSpecRule());
            	      						}
            	      						add(
            	      							current,
            	      							"ids",
            	      							lv_ids_1_0,
            	      							"tuks.mcrl2.dsl.MclrDsl.SortIdsDecl");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    otherlv_2=(Token)match(input,18,FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getMapSpecAccess().getSemicolonKeyword_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMapSpec"


    // $ANTLR start "entryRuleMultActId"
    // InternalMclrDsl.g:2359:1: entryRuleMultActId returns [EObject current=null] : iv_ruleMultActId= ruleMultActId EOF ;
    public final EObject entryRuleMultActId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultActId = null;


        try {
            // InternalMclrDsl.g:2359:50: (iv_ruleMultActId= ruleMultActId EOF )
            // InternalMclrDsl.g:2360:2: iv_ruleMultActId= ruleMultActId EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultActIdRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultActId=ruleMultActId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultActId; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMultActId"


    // $ANTLR start "ruleMultActId"
    // InternalMclrDsl.g:2366:1: ruleMultActId returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '|' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleMultActId() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMclrDsl.g:2372:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '|' ( (otherlv_2= RULE_ID ) ) )* ) )
            // InternalMclrDsl.g:2373:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '|' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // InternalMclrDsl.g:2373:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '|' ( (otherlv_2= RULE_ID ) ) )* )
            // InternalMclrDsl.g:2374:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '|' ( (otherlv_2= RULE_ID ) ) )*
            {
            // InternalMclrDsl.g:2374:3: ( (otherlv_0= RULE_ID ) )
            // InternalMclrDsl.g:2375:4: (otherlv_0= RULE_ID )
            {
            // InternalMclrDsl.g:2375:4: (otherlv_0= RULE_ID )
            // InternalMclrDsl.g:2376:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMultActIdRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getMultActIdAccess().getIdsActionNameCrossReference_0_0());
              				
            }

            }


            }

            // InternalMclrDsl.g:2387:3: (otherlv_1= '|' ( (otherlv_2= RULE_ID ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==21) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalMclrDsl.g:2388:4: otherlv_1= '|' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getMultActIdAccess().getVerticalLineKeyword_1_0());
            	      			
            	    }
            	    // InternalMclrDsl.g:2392:4: ( (otherlv_2= RULE_ID ) )
            	    // InternalMclrDsl.g:2393:5: (otherlv_2= RULE_ID )
            	    {
            	    // InternalMclrDsl.g:2393:5: (otherlv_2= RULE_ID )
            	    // InternalMclrDsl.g:2394:6: otherlv_2= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getMultActIdRule());
            	      						}
            	      					
            	    }
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_2, grammarAccess.getMultActIdAccess().getIdsActionNameCrossReference_1_1_0());
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMultActId"


    // $ANTLR start "entryRuleMultActIdList"
    // InternalMclrDsl.g:2410:1: entryRuleMultActIdList returns [EObject current=null] : iv_ruleMultActIdList= ruleMultActIdList EOF ;
    public final EObject entryRuleMultActIdList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultActIdList = null;


        try {
            // InternalMclrDsl.g:2410:54: (iv_ruleMultActIdList= ruleMultActIdList EOF )
            // InternalMclrDsl.g:2411:2: iv_ruleMultActIdList= ruleMultActIdList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultActIdListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultActIdList=ruleMultActIdList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultActIdList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMultActIdList"


    // $ANTLR start "ruleMultActIdList"
    // InternalMclrDsl.g:2417:1: ruleMultActIdList returns [EObject current=null] : ( ( (lv_acts_0_0= ruleMultActId ) ) (otherlv_1= ',' ( (lv_acts_2_0= ruleMultActId ) ) )* ) ;
    public final EObject ruleMultActIdList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_acts_0_0 = null;

        EObject lv_acts_2_0 = null;



        	enterRule();

        try {
            // InternalMclrDsl.g:2423:2: ( ( ( (lv_acts_0_0= ruleMultActId ) ) (otherlv_1= ',' ( (lv_acts_2_0= ruleMultActId ) ) )* ) )
            // InternalMclrDsl.g:2424:2: ( ( (lv_acts_0_0= ruleMultActId ) ) (otherlv_1= ',' ( (lv_acts_2_0= ruleMultActId ) ) )* )
            {
            // InternalMclrDsl.g:2424:2: ( ( (lv_acts_0_0= ruleMultActId ) ) (otherlv_1= ',' ( (lv_acts_2_0= ruleMultActId ) ) )* )
            // InternalMclrDsl.g:2425:3: ( (lv_acts_0_0= ruleMultActId ) ) (otherlv_1= ',' ( (lv_acts_2_0= ruleMultActId ) ) )*
            {
            // InternalMclrDsl.g:2425:3: ( (lv_acts_0_0= ruleMultActId ) )
            // InternalMclrDsl.g:2426:4: (lv_acts_0_0= ruleMultActId )
            {
            // InternalMclrDsl.g:2426:4: (lv_acts_0_0= ruleMultActId )
            // InternalMclrDsl.g:2427:5: lv_acts_0_0= ruleMultActId
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMultActIdListAccess().getActsMultActIdParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_acts_0_0=ruleMultActId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMultActIdListRule());
              					}
              					add(
              						current,
              						"acts",
              						lv_acts_0_0,
              						"tuks.mcrl2.dsl.MclrDsl.MultActId");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMclrDsl.g:2444:3: (otherlv_1= ',' ( (lv_acts_2_0= ruleMultActId ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==11) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalMclrDsl.g:2445:4: otherlv_1= ',' ( (lv_acts_2_0= ruleMultActId ) )
            	    {
            	    otherlv_1=(Token)match(input,11,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getMultActIdListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalMclrDsl.g:2449:4: ( (lv_acts_2_0= ruleMultActId ) )
            	    // InternalMclrDsl.g:2450:5: (lv_acts_2_0= ruleMultActId )
            	    {
            	    // InternalMclrDsl.g:2450:5: (lv_acts_2_0= ruleMultActId )
            	    // InternalMclrDsl.g:2451:6: lv_acts_2_0= ruleMultActId
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMultActIdListAccess().getActsMultActIdParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_acts_2_0=ruleMultActId();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getMultActIdListRule());
            	      						}
            	      						add(
            	      							current,
            	      							"acts",
            	      							lv_acts_2_0,
            	      							"tuks.mcrl2.dsl.MclrDsl.MultActId");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMultActIdList"


    // $ANTLR start "entryRuleMultActIdSet"
    // InternalMclrDsl.g:2473:1: entryRuleMultActIdSet returns [EObject current=null] : iv_ruleMultActIdSet= ruleMultActIdSet EOF ;
    public final EObject entryRuleMultActIdSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultActIdSet = null;


        try {
            // InternalMclrDsl.g:2473:53: (iv_ruleMultActIdSet= ruleMultActIdSet EOF )
            // InternalMclrDsl.g:2474:2: iv_ruleMultActIdSet= ruleMultActIdSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultActIdSetRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultActIdSet=ruleMultActIdSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultActIdSet; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMultActIdSet"


    // $ANTLR start "ruleMultActIdSet"
    // InternalMclrDsl.g:2480:1: ruleMultActIdSet returns [EObject current=null] : (otherlv_0= '{' ( ( (lv_data_1_0= ruleMultActIdList ) ) | ( (lv_is_empty_2_0= RULE_WS ) ) ) otherlv_3= '}' ) ;
    public final EObject ruleMultActIdSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_is_empty_2_0=null;
        Token otherlv_3=null;
        EObject lv_data_1_0 = null;



        	enterRule();

        try {
            // InternalMclrDsl.g:2486:2: ( (otherlv_0= '{' ( ( (lv_data_1_0= ruleMultActIdList ) ) | ( (lv_is_empty_2_0= RULE_WS ) ) ) otherlv_3= '}' ) )
            // InternalMclrDsl.g:2487:2: (otherlv_0= '{' ( ( (lv_data_1_0= ruleMultActIdList ) ) | ( (lv_is_empty_2_0= RULE_WS ) ) ) otherlv_3= '}' )
            {
            // InternalMclrDsl.g:2487:2: (otherlv_0= '{' ( ( (lv_data_1_0= ruleMultActIdList ) ) | ( (lv_is_empty_2_0= RULE_WS ) ) ) otherlv_3= '}' )
            // InternalMclrDsl.g:2488:3: otherlv_0= '{' ( ( (lv_data_1_0= ruleMultActIdList ) ) | ( (lv_is_empty_2_0= RULE_WS ) ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMultActIdSetAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalMclrDsl.g:2492:3: ( ( (lv_data_1_0= ruleMultActIdList ) ) | ( (lv_is_empty_2_0= RULE_WS ) ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                alt31=1;
            }
            else if ( (LA31_0==RULE_WS) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalMclrDsl.g:2493:4: ( (lv_data_1_0= ruleMultActIdList ) )
                    {
                    // InternalMclrDsl.g:2493:4: ( (lv_data_1_0= ruleMultActIdList ) )
                    // InternalMclrDsl.g:2494:5: (lv_data_1_0= ruleMultActIdList )
                    {
                    // InternalMclrDsl.g:2494:5: (lv_data_1_0= ruleMultActIdList )
                    // InternalMclrDsl.g:2495:6: lv_data_1_0= ruleMultActIdList
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMultActIdSetAccess().getDataMultActIdListParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_10);
                    lv_data_1_0=ruleMultActIdList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMultActIdSetRule());
                      						}
                      						set(
                      							current,
                      							"data",
                      							lv_data_1_0,
                      							"tuks.mcrl2.dsl.MclrDsl.MultActIdList");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMclrDsl.g:2513:4: ( (lv_is_empty_2_0= RULE_WS ) )
                    {
                    // InternalMclrDsl.g:2513:4: ( (lv_is_empty_2_0= RULE_WS ) )
                    // InternalMclrDsl.g:2514:5: (lv_is_empty_2_0= RULE_WS )
                    {
                    // InternalMclrDsl.g:2514:5: (lv_is_empty_2_0= RULE_WS )
                    // InternalMclrDsl.g:2515:6: lv_is_empty_2_0= RULE_WS
                    {
                    lv_is_empty_2_0=(Token)match(input,RULE_WS,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_is_empty_2_0, grammarAccess.getMultActIdSetAccess().getIs_emptyWSTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMultActIdSetRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"is_empty",
                      							true,
                      							"org.eclipse.xtext.common.Terminals.WS");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMultActIdSetAccess().getRightCurlyBracketKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMultActIdSet"


    // $ANTLR start "entryRuleProcDecl"
    // InternalMclrDsl.g:2540:1: entryRuleProcDecl returns [EObject current=null] : iv_ruleProcDecl= ruleProcDecl EOF ;
    public final EObject entryRuleProcDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcDecl = null;


        try {
            // InternalMclrDsl.g:2540:49: (iv_ruleProcDecl= ruleProcDecl EOF )
            // InternalMclrDsl.g:2541:2: iv_ruleProcDecl= ruleProcDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProcDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProcDecl=ruleProcDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProcDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleProcDecl"


    // $ANTLR start "ruleProcDecl"
    // InternalMclrDsl.g:2547:1: ruleProcDecl returns [EObject current=null] : ( ( (lv_id_0_0= ruleProcName ) ) (otherlv_1= '(' ( (lv_variables_2_0= ruleVarsDeclList ) ) otherlv_3= ')' )? otherlv_4= '=' ( (lv_right_5_0= ruleProcExpr ) ) otherlv_6= ';' ) ;
    public final EObject ruleProcDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_id_0_0 = null;

        EObject lv_variables_2_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMclrDsl.g:2553:2: ( ( ( (lv_id_0_0= ruleProcName ) ) (otherlv_1= '(' ( (lv_variables_2_0= ruleVarsDeclList ) ) otherlv_3= ')' )? otherlv_4= '=' ( (lv_right_5_0= ruleProcExpr ) ) otherlv_6= ';' ) )
            // InternalMclrDsl.g:2554:2: ( ( (lv_id_0_0= ruleProcName ) ) (otherlv_1= '(' ( (lv_variables_2_0= ruleVarsDeclList ) ) otherlv_3= ')' )? otherlv_4= '=' ( (lv_right_5_0= ruleProcExpr ) ) otherlv_6= ';' )
            {
            // InternalMclrDsl.g:2554:2: ( ( (lv_id_0_0= ruleProcName ) ) (otherlv_1= '(' ( (lv_variables_2_0= ruleVarsDeclList ) ) otherlv_3= ')' )? otherlv_4= '=' ( (lv_right_5_0= ruleProcExpr ) ) otherlv_6= ';' )
            // InternalMclrDsl.g:2555:3: ( (lv_id_0_0= ruleProcName ) ) (otherlv_1= '(' ( (lv_variables_2_0= ruleVarsDeclList ) ) otherlv_3= ')' )? otherlv_4= '=' ( (lv_right_5_0= ruleProcExpr ) ) otherlv_6= ';'
            {
            // InternalMclrDsl.g:2555:3: ( (lv_id_0_0= ruleProcName ) )
            // InternalMclrDsl.g:2556:4: (lv_id_0_0= ruleProcName )
            {
            // InternalMclrDsl.g:2556:4: (lv_id_0_0= ruleProcName )
            // InternalMclrDsl.g:2557:5: lv_id_0_0= ruleProcName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getProcDeclAccess().getIdProcNameParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_33);
            lv_id_0_0=ruleProcName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getProcDeclRule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_0_0,
              						"tuks.mcrl2.dsl.MclrDsl.ProcName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMclrDsl.g:2574:3: (otherlv_1= '(' ( (lv_variables_2_0= ruleVarsDeclList ) ) otherlv_3= ')' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==12) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMclrDsl.g:2575:4: otherlv_1= '(' ( (lv_variables_2_0= ruleVarsDeclList ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getProcDeclAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalMclrDsl.g:2579:4: ( (lv_variables_2_0= ruleVarsDeclList ) )
                    // InternalMclrDsl.g:2580:5: (lv_variables_2_0= ruleVarsDeclList )
                    {
                    // InternalMclrDsl.g:2580:5: (lv_variables_2_0= ruleVarsDeclList )
                    // InternalMclrDsl.g:2581:6: lv_variables_2_0= ruleVarsDeclList
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getProcDeclAccess().getVariablesVarsDeclListParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_9);
                    lv_variables_2_0=ruleVarsDeclList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getProcDeclRule());
                      						}
                      						set(
                      							current,
                      							"variables",
                      							lv_variables_2_0,
                      							"tuks.mcrl2.dsl.MclrDsl.VarsDeclList");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,13,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getProcDeclAccess().getRightParenthesisKeyword_1_2());
                      			
                    }

                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getProcDeclAccess().getEqualsSignKeyword_2());
              		
            }
            // InternalMclrDsl.g:2607:3: ( (lv_right_5_0= ruleProcExpr ) )
            // InternalMclrDsl.g:2608:4: (lv_right_5_0= ruleProcExpr )
            {
            // InternalMclrDsl.g:2608:4: (lv_right_5_0= ruleProcExpr )
            // InternalMclrDsl.g:2609:5: lv_right_5_0= ruleProcExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getProcDeclAccess().getRightProcExprParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_right_5_0=ruleProcExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getProcDeclRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_5_0,
              						"tuks.mcrl2.dsl.MclrDsl.ProcExpr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getProcDeclAccess().getSemicolonKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleProcDecl"


    // $ANTLR start "entryRuleProcSpec"
    // InternalMclrDsl.g:2634:1: entryRuleProcSpec returns [EObject current=null] : iv_ruleProcSpec= ruleProcSpec EOF ;
    public final EObject entryRuleProcSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcSpec = null;


        try {
            // InternalMclrDsl.g:2634:49: (iv_ruleProcSpec= ruleProcSpec EOF )
            // InternalMclrDsl.g:2635:2: iv_ruleProcSpec= ruleProcSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProcSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProcSpec=ruleProcSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProcSpec; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleProcSpec"


    // $ANTLR start "ruleProcSpec"
    // InternalMclrDsl.g:2641:1: ruleProcSpec returns [EObject current=null] : (otherlv_0= 'proc' ( (lv_procs_1_0= ruleProcDecl ) )+ ) ;
    public final EObject ruleProcSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_procs_1_0 = null;



        	enterRule();

        try {
            // InternalMclrDsl.g:2647:2: ( (otherlv_0= 'proc' ( (lv_procs_1_0= ruleProcDecl ) )+ ) )
            // InternalMclrDsl.g:2648:2: (otherlv_0= 'proc' ( (lv_procs_1_0= ruleProcDecl ) )+ )
            {
            // InternalMclrDsl.g:2648:2: (otherlv_0= 'proc' ( (lv_procs_1_0= ruleProcDecl ) )+ )
            // InternalMclrDsl.g:2649:3: otherlv_0= 'proc' ( (lv_procs_1_0= ruleProcDecl ) )+
            {
            otherlv_0=(Token)match(input,55,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getProcSpecAccess().getProcKeyword_0());
              		
            }
            // InternalMclrDsl.g:2653:3: ( (lv_procs_1_0= ruleProcDecl ) )+
            int cnt33=0;
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_ID) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalMclrDsl.g:2654:4: (lv_procs_1_0= ruleProcDecl )
            	    {
            	    // InternalMclrDsl.g:2654:4: (lv_procs_1_0= ruleProcDecl )
            	    // InternalMclrDsl.g:2655:5: lv_procs_1_0= ruleProcDecl
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getProcSpecAccess().getProcsProcDeclParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_15);
            	    lv_procs_1_0=ruleProcDecl();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getProcSpecRule());
            	      					}
            	      					add(
            	      						current,
            	      						"procs",
            	      						lv_procs_1_0,
            	      						"tuks.mcrl2.dsl.MclrDsl.ProcDecl");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt33 >= 1 ) break loop33;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(33, input);
                        throw eee;
                }
                cnt33++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleProcSpec"


    // $ANTLR start "entryRuleProjName"
    // InternalMclrDsl.g:2676:1: entryRuleProjName returns [EObject current=null] : iv_ruleProjName= ruleProjName EOF ;
    public final EObject entryRuleProjName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjName = null;


        try {
            // InternalMclrDsl.g:2676:49: (iv_ruleProjName= ruleProjName EOF )
            // InternalMclrDsl.g:2677:2: iv_ruleProjName= ruleProjName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProjNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProjName=ruleProjName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProjName; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleProjName"


    // $ANTLR start "ruleProjName"
    // InternalMclrDsl.g:2683:1: ruleProjName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleProjName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMclrDsl.g:2689:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMclrDsl.g:2690:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMclrDsl.g:2690:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMclrDsl.g:2691:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMclrDsl.g:2691:3: (lv_name_0_0= RULE_ID )
            // InternalMclrDsl.g:2692:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getProjNameAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getProjNameRule());
              				}
              				setWithLastConsumed(
              					current,
              					"name",
              					lv_name_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleProjName"


    // $ANTLR start "entryRuleProjDecl"
    // InternalMclrDsl.g:2711:1: entryRuleProjDecl returns [EObject current=null] : iv_ruleProjDecl= ruleProjDecl EOF ;
    public final EObject entryRuleProjDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjDecl = null;


        try {
            // InternalMclrDsl.g:2711:49: (iv_ruleProjDecl= ruleProjDecl EOF )
            // InternalMclrDsl.g:2712:2: iv_ruleProjDecl= ruleProjDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProjDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProjDecl=ruleProjDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProjDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleProjDecl"


    // $ANTLR start "ruleProjDecl"
    // InternalMclrDsl.g:2718:1: ruleProjDecl returns [EObject current=null] : ( ( ( (lv_id_0_0= ruleProjName ) ) otherlv_1= ':' )? ( (lv_sort_2_0= ruleSortExpr ) ) ) ;
    public final EObject ruleProjDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_id_0_0 = null;

        EObject lv_sort_2_0 = null;



        	enterRule();

        try {
            // InternalMclrDsl.g:2724:2: ( ( ( ( (lv_id_0_0= ruleProjName ) ) otherlv_1= ':' )? ( (lv_sort_2_0= ruleSortExpr ) ) ) )
            // InternalMclrDsl.g:2725:2: ( ( ( (lv_id_0_0= ruleProjName ) ) otherlv_1= ':' )? ( (lv_sort_2_0= ruleSortExpr ) ) )
            {
            // InternalMclrDsl.g:2725:2: ( ( ( (lv_id_0_0= ruleProjName ) ) otherlv_1= ':' )? ( (lv_sort_2_0= ruleSortExpr ) ) )
            // InternalMclrDsl.g:2726:3: ( ( (lv_id_0_0= ruleProjName ) ) otherlv_1= ':' )? ( (lv_sort_2_0= ruleSortExpr ) )
            {
            // InternalMclrDsl.g:2726:3: ( ( (lv_id_0_0= ruleProjName ) ) otherlv_1= ':' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                int LA34_1 = input.LA(2);

                if ( (LA34_1==17) ) {
                    alt34=1;
                }
            }
            switch (alt34) {
                case 1 :
                    // InternalMclrDsl.g:2727:4: ( (lv_id_0_0= ruleProjName ) ) otherlv_1= ':'
                    {
                    // InternalMclrDsl.g:2727:4: ( (lv_id_0_0= ruleProjName ) )
                    // InternalMclrDsl.g:2728:5: (lv_id_0_0= ruleProjName )
                    {
                    // InternalMclrDsl.g:2728:5: (lv_id_0_0= ruleProjName )
                    // InternalMclrDsl.g:2729:6: lv_id_0_0= ruleProjName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getProjDeclAccess().getIdProjNameParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_16);
                    lv_id_0_0=ruleProjName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getProjDeclRule());
                      						}
                      						set(
                      							current,
                      							"id",
                      							lv_id_0_0,
                      							"tuks.mcrl2.dsl.MclrDsl.ProjName");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,17,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getProjDeclAccess().getColonKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalMclrDsl.g:2751:3: ( (lv_sort_2_0= ruleSortExpr ) )
            // InternalMclrDsl.g:2752:4: (lv_sort_2_0= ruleSortExpr )
            {
            // InternalMclrDsl.g:2752:4: (lv_sort_2_0= ruleSortExpr )
            // InternalMclrDsl.g:2753:5: lv_sort_2_0= ruleSortExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getProjDeclAccess().getSortSortExprParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_sort_2_0=ruleSortExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getProjDeclRule());
              					}
              					set(
              						current,
              						"sort",
              						lv_sort_2_0,
              						"tuks.mcrl2.dsl.MclrDsl.SortExpr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleProjDecl"


    // $ANTLR start "entryRuleProjDeclList"
    // InternalMclrDsl.g:2774:1: entryRuleProjDeclList returns [EObject current=null] : iv_ruleProjDeclList= ruleProjDeclList EOF ;
    public final EObject entryRuleProjDeclList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjDeclList = null;


        try {
            // InternalMclrDsl.g:2774:53: (iv_ruleProjDeclList= ruleProjDeclList EOF )
            // InternalMclrDsl.g:2775:2: iv_ruleProjDeclList= ruleProjDeclList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProjDeclListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProjDeclList=ruleProjDeclList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProjDeclList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleProjDeclList"


    // $ANTLR start "ruleProjDeclList"
    // InternalMclrDsl.g:2781:1: ruleProjDeclList returns [EObject current=null] : ( ( (lv_proj_0_0= ruleProjDecl ) ) (otherlv_1= ',' ( (lv_prof_2_0= ruleProjDecl ) ) )* ) ;
    public final EObject ruleProjDeclList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_proj_0_0 = null;

        EObject lv_prof_2_0 = null;



        	enterRule();

        try {
            // InternalMclrDsl.g:2787:2: ( ( ( (lv_proj_0_0= ruleProjDecl ) ) (otherlv_1= ',' ( (lv_prof_2_0= ruleProjDecl ) ) )* ) )
            // InternalMclrDsl.g:2788:2: ( ( (lv_proj_0_0= ruleProjDecl ) ) (otherlv_1= ',' ( (lv_prof_2_0= ruleProjDecl ) ) )* )
            {
            // InternalMclrDsl.g:2788:2: ( ( (lv_proj_0_0= ruleProjDecl ) ) (otherlv_1= ',' ( (lv_prof_2_0= ruleProjDecl ) ) )* )
            // InternalMclrDsl.g:2789:3: ( (lv_proj_0_0= ruleProjDecl ) ) (otherlv_1= ',' ( (lv_prof_2_0= ruleProjDecl ) ) )*
            {
            // InternalMclrDsl.g:2789:3: ( (lv_proj_0_0= ruleProjDecl ) )
            // InternalMclrDsl.g:2790:4: (lv_proj_0_0= ruleProjDecl )
            {
            // InternalMclrDsl.g:2790:4: (lv_proj_0_0= ruleProjDecl )
            // InternalMclrDsl.g:2791:5: lv_proj_0_0= ruleProjDecl
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getProjDeclListAccess().getProjProjDeclParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_proj_0_0=ruleProjDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getProjDeclListRule());
              					}
              					add(
              						current,
              						"proj",
              						lv_proj_0_0,
              						"tuks.mcrl2.dsl.MclrDsl.ProjDecl");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMclrDsl.g:2808:3: (otherlv_1= ',' ( (lv_prof_2_0= ruleProjDecl ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==11) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalMclrDsl.g:2809:4: otherlv_1= ',' ( (lv_prof_2_0= ruleProjDecl ) )
            	    {
            	    otherlv_1=(Token)match(input,11,FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getProjDeclListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalMclrDsl.g:2813:4: ( (lv_prof_2_0= ruleProjDecl ) )
            	    // InternalMclrDsl.g:2814:5: (lv_prof_2_0= ruleProjDecl )
            	    {
            	    // InternalMclrDsl.g:2814:5: (lv_prof_2_0= ruleProjDecl )
            	    // InternalMclrDsl.g:2815:6: lv_prof_2_0= ruleProjDecl
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getProjDeclListAccess().getProfProjDeclParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_prof_2_0=ruleProjDecl();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getProjDeclListRule());
            	      						}
            	      						add(
            	      							current,
            	      							"prof",
            	      							lv_prof_2_0,
            	      							"tuks.mcrl2.dsl.MclrDsl.ProjDecl");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleProjDeclList"


    // $ANTLR start "entryRuleProcExpr"
    // InternalMclrDsl.g:2837:1: entryRuleProcExpr returns [EObject current=null] : iv_ruleProcExpr= ruleProcExpr EOF ;
    public final EObject entryRuleProcExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcExpr = null;


        try {
            // InternalMclrDsl.g:2837:49: (iv_ruleProcExpr= ruleProcExpr EOF )
            // InternalMclrDsl.g:2838:2: iv_ruleProcExpr= ruleProcExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProcExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProcExpr=ruleProcExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProcExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleProcExpr"


    // $ANTLR start "ruleProcExpr"
    // InternalMclrDsl.g:2844:1: ruleProcExpr returns [EObject current=null] : ( ( (lv_left_0_0= ruleProcExprTerm ) ) ( ( ( ( (lv_is_plus_1_0= '+' ) ) | ( (lv_is_par_2_0= '||' ) ) | ( (lv_is_par_right_3_0= '||_' ) ) | ( (lv_is_left_shist_4_0= '<<' ) ) | ( (lv_is_point_5_0= '.' ) ) | ( (lv_is_or_6_0= '|' ) ) ) ( (lv_right_7_0= ruleProcExpr ) ) ) | ( ( (lv_is_at_8_0= '@' ) ) ( (lv_unit_right_9_0= ruleDataExprUnit ) ) ) ) ) ;
    public final EObject ruleProcExpr() throws RecognitionException {
        EObject current = null;

        Token lv_is_plus_1_0=null;
        Token lv_is_par_2_0=null;
        Token lv_is_par_right_3_0=null;
        Token lv_is_left_shist_4_0=null;
        Token lv_is_point_5_0=null;
        Token lv_is_or_6_0=null;
        Token lv_is_at_8_0=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_7_0 = null;

        EObject lv_unit_right_9_0 = null;



        	enterRule();

        try {
            // InternalMclrDsl.g:2850:2: ( ( ( (lv_left_0_0= ruleProcExprTerm ) ) ( ( ( ( (lv_is_plus_1_0= '+' ) ) | ( (lv_is_par_2_0= '||' ) ) | ( (lv_is_par_right_3_0= '||_' ) ) | ( (lv_is_left_shist_4_0= '<<' ) ) | ( (lv_is_point_5_0= '.' ) ) | ( (lv_is_or_6_0= '|' ) ) ) ( (lv_right_7_0= ruleProcExpr ) ) ) | ( ( (lv_is_at_8_0= '@' ) ) ( (lv_unit_right_9_0= ruleDataExprUnit ) ) ) ) ) )
            // InternalMclrDsl.g:2851:2: ( ( (lv_left_0_0= ruleProcExprTerm ) ) ( ( ( ( (lv_is_plus_1_0= '+' ) ) | ( (lv_is_par_2_0= '||' ) ) | ( (lv_is_par_right_3_0= '||_' ) ) | ( (lv_is_left_shist_4_0= '<<' ) ) | ( (lv_is_point_5_0= '.' ) ) | ( (lv_is_or_6_0= '|' ) ) ) ( (lv_right_7_0= ruleProcExpr ) ) ) | ( ( (lv_is_at_8_0= '@' ) ) ( (lv_unit_right_9_0= ruleDataExprUnit ) ) ) ) )
            {
            // InternalMclrDsl.g:2851:2: ( ( (lv_left_0_0= ruleProcExprTerm ) ) ( ( ( ( (lv_is_plus_1_0= '+' ) ) | ( (lv_is_par_2_0= '||' ) ) | ( (lv_is_par_right_3_0= '||_' ) ) | ( (lv_is_left_shist_4_0= '<<' ) ) | ( (lv_is_point_5_0= '.' ) ) | ( (lv_is_or_6_0= '|' ) ) ) ( (lv_right_7_0= ruleProcExpr ) ) ) | ( ( (lv_is_at_8_0= '@' ) ) ( (lv_unit_right_9_0= ruleDataExprUnit ) ) ) ) )
            // InternalMclrDsl.g:2852:3: ( (lv_left_0_0= ruleProcExprTerm ) ) ( ( ( ( (lv_is_plus_1_0= '+' ) ) | ( (lv_is_par_2_0= '||' ) ) | ( (lv_is_par_right_3_0= '||_' ) ) | ( (lv_is_left_shist_4_0= '<<' ) ) | ( (lv_is_point_5_0= '.' ) ) | ( (lv_is_or_6_0= '|' ) ) ) ( (lv_right_7_0= ruleProcExpr ) ) ) | ( ( (lv_is_at_8_0= '@' ) ) ( (lv_unit_right_9_0= ruleDataExprUnit ) ) ) )
            {
            // InternalMclrDsl.g:2852:3: ( (lv_left_0_0= ruleProcExprTerm ) )
            // InternalMclrDsl.g:2853:4: (lv_left_0_0= ruleProcExprTerm )
            {
            // InternalMclrDsl.g:2853:4: (lv_left_0_0= ruleProcExprTerm )
            // InternalMclrDsl.g:2854:5: lv_left_0_0= ruleProcExprTerm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getProcExprAccess().getLeftProcExprTermParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_35);
            lv_left_0_0=ruleProcExprTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getProcExprRule());
              					}
              					set(
              						current,
              						"left",
              						lv_left_0_0,
              						"tuks.mcrl2.dsl.MclrDsl.ProcExprTerm");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMclrDsl.g:2871:3: ( ( ( ( (lv_is_plus_1_0= '+' ) ) | ( (lv_is_par_2_0= '||' ) ) | ( (lv_is_par_right_3_0= '||_' ) ) | ( (lv_is_left_shist_4_0= '<<' ) ) | ( (lv_is_point_5_0= '.' ) ) | ( (lv_is_or_6_0= '|' ) ) ) ( (lv_right_7_0= ruleProcExpr ) ) ) | ( ( (lv_is_at_8_0= '@' ) ) ( (lv_unit_right_9_0= ruleDataExprUnit ) ) ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==21||LA37_0==31||LA37_0==37||LA37_0==49||(LA37_0>=56 && LA37_0<=57)) ) {
                alt37=1;
            }
            else if ( (LA37_0==58) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalMclrDsl.g:2872:4: ( ( ( (lv_is_plus_1_0= '+' ) ) | ( (lv_is_par_2_0= '||' ) ) | ( (lv_is_par_right_3_0= '||_' ) ) | ( (lv_is_left_shist_4_0= '<<' ) ) | ( (lv_is_point_5_0= '.' ) ) | ( (lv_is_or_6_0= '|' ) ) ) ( (lv_right_7_0= ruleProcExpr ) ) )
                    {
                    // InternalMclrDsl.g:2872:4: ( ( ( (lv_is_plus_1_0= '+' ) ) | ( (lv_is_par_2_0= '||' ) ) | ( (lv_is_par_right_3_0= '||_' ) ) | ( (lv_is_left_shist_4_0= '<<' ) ) | ( (lv_is_point_5_0= '.' ) ) | ( (lv_is_or_6_0= '|' ) ) ) ( (lv_right_7_0= ruleProcExpr ) ) )
                    // InternalMclrDsl.g:2873:5: ( ( (lv_is_plus_1_0= '+' ) ) | ( (lv_is_par_2_0= '||' ) ) | ( (lv_is_par_right_3_0= '||_' ) ) | ( (lv_is_left_shist_4_0= '<<' ) ) | ( (lv_is_point_5_0= '.' ) ) | ( (lv_is_or_6_0= '|' ) ) ) ( (lv_right_7_0= ruleProcExpr ) )
                    {
                    // InternalMclrDsl.g:2873:5: ( ( (lv_is_plus_1_0= '+' ) ) | ( (lv_is_par_2_0= '||' ) ) | ( (lv_is_par_right_3_0= '||_' ) ) | ( (lv_is_left_shist_4_0= '<<' ) ) | ( (lv_is_point_5_0= '.' ) ) | ( (lv_is_or_6_0= '|' ) ) )
                    int alt36=6;
                    switch ( input.LA(1) ) {
                    case 31:
                        {
                        alt36=1;
                        }
                        break;
                    case 37:
                        {
                        alt36=2;
                        }
                        break;
                    case 56:
                        {
                        alt36=3;
                        }
                        break;
                    case 57:
                        {
                        alt36=4;
                        }
                        break;
                    case 49:
                        {
                        alt36=5;
                        }
                        break;
                    case 21:
                        {
                        alt36=6;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 0, input);

                        throw nvae;
                    }

                    switch (alt36) {
                        case 1 :
                            // InternalMclrDsl.g:2874:6: ( (lv_is_plus_1_0= '+' ) )
                            {
                            // InternalMclrDsl.g:2874:6: ( (lv_is_plus_1_0= '+' ) )
                            // InternalMclrDsl.g:2875:7: (lv_is_plus_1_0= '+' )
                            {
                            // InternalMclrDsl.g:2875:7: (lv_is_plus_1_0= '+' )
                            // InternalMclrDsl.g:2876:8: lv_is_plus_1_0= '+'
                            {
                            lv_is_plus_1_0=(Token)match(input,31,FOLLOW_34); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_is_plus_1_0, grammarAccess.getProcExprAccess().getIs_plusPlusSignKeyword_1_0_0_0_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getProcExprRule());
                              								}
                              								setWithLastConsumed(current, "is_plus", true, "+");
                              							
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalMclrDsl.g:2889:6: ( (lv_is_par_2_0= '||' ) )
                            {
                            // InternalMclrDsl.g:2889:6: ( (lv_is_par_2_0= '||' ) )
                            // InternalMclrDsl.g:2890:7: (lv_is_par_2_0= '||' )
                            {
                            // InternalMclrDsl.g:2890:7: (lv_is_par_2_0= '||' )
                            // InternalMclrDsl.g:2891:8: lv_is_par_2_0= '||'
                            {
                            lv_is_par_2_0=(Token)match(input,37,FOLLOW_34); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_is_par_2_0, grammarAccess.getProcExprAccess().getIs_parVerticalLineVerticalLineKeyword_1_0_0_1_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getProcExprRule());
                              								}
                              								setWithLastConsumed(current, "is_par", true, "||");
                              							
                            }

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalMclrDsl.g:2904:6: ( (lv_is_par_right_3_0= '||_' ) )
                            {
                            // InternalMclrDsl.g:2904:6: ( (lv_is_par_right_3_0= '||_' ) )
                            // InternalMclrDsl.g:2905:7: (lv_is_par_right_3_0= '||_' )
                            {
                            // InternalMclrDsl.g:2905:7: (lv_is_par_right_3_0= '||_' )
                            // InternalMclrDsl.g:2906:8: lv_is_par_right_3_0= '||_'
                            {
                            lv_is_par_right_3_0=(Token)match(input,56,FOLLOW_34); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_is_par_right_3_0, grammarAccess.getProcExprAccess().getIs_par_right_Keyword_1_0_0_2_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getProcExprRule());
                              								}
                              								setWithLastConsumed(current, "is_par_right", true, "||_");
                              							
                            }

                            }


                            }


                            }
                            break;
                        case 4 :
                            // InternalMclrDsl.g:2919:6: ( (lv_is_left_shist_4_0= '<<' ) )
                            {
                            // InternalMclrDsl.g:2919:6: ( (lv_is_left_shist_4_0= '<<' ) )
                            // InternalMclrDsl.g:2920:7: (lv_is_left_shist_4_0= '<<' )
                            {
                            // InternalMclrDsl.g:2920:7: (lv_is_left_shist_4_0= '<<' )
                            // InternalMclrDsl.g:2921:8: lv_is_left_shist_4_0= '<<'
                            {
                            lv_is_left_shist_4_0=(Token)match(input,57,FOLLOW_34); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_is_left_shist_4_0, grammarAccess.getProcExprAccess().getIs_left_shistLessThanSignLessThanSignKeyword_1_0_0_3_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getProcExprRule());
                              								}
                              								setWithLastConsumed(current, "is_left_shist", true, "<<");
                              							
                            }

                            }


                            }


                            }
                            break;
                        case 5 :
                            // InternalMclrDsl.g:2934:6: ( (lv_is_point_5_0= '.' ) )
                            {
                            // InternalMclrDsl.g:2934:6: ( (lv_is_point_5_0= '.' ) )
                            // InternalMclrDsl.g:2935:7: (lv_is_point_5_0= '.' )
                            {
                            // InternalMclrDsl.g:2935:7: (lv_is_point_5_0= '.' )
                            // InternalMclrDsl.g:2936:8: lv_is_point_5_0= '.'
                            {
                            lv_is_point_5_0=(Token)match(input,49,FOLLOW_34); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_is_point_5_0, grammarAccess.getProcExprAccess().getIs_pointFullStopKeyword_1_0_0_4_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getProcExprRule());
                              								}
                              								setWithLastConsumed(current, "is_point", true, ".");
                              							
                            }

                            }


                            }


                            }
                            break;
                        case 6 :
                            // InternalMclrDsl.g:2949:6: ( (lv_is_or_6_0= '|' ) )
                            {
                            // InternalMclrDsl.g:2949:6: ( (lv_is_or_6_0= '|' ) )
                            // InternalMclrDsl.g:2950:7: (lv_is_or_6_0= '|' )
                            {
                            // InternalMclrDsl.g:2950:7: (lv_is_or_6_0= '|' )
                            // InternalMclrDsl.g:2951:8: lv_is_or_6_0= '|'
                            {
                            lv_is_or_6_0=(Token)match(input,21,FOLLOW_34); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_is_or_6_0, grammarAccess.getProcExprAccess().getIs_orVerticalLineKeyword_1_0_0_5_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getProcExprRule());
                              								}
                              								setWithLastConsumed(current, "is_or", true, "|");
                              							
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalMclrDsl.g:2964:5: ( (lv_right_7_0= ruleProcExpr ) )
                    // InternalMclrDsl.g:2965:6: (lv_right_7_0= ruleProcExpr )
                    {
                    // InternalMclrDsl.g:2965:6: (lv_right_7_0= ruleProcExpr )
                    // InternalMclrDsl.g:2966:7: lv_right_7_0= ruleProcExpr
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getProcExprAccess().getRightProcExprParserRuleCall_1_0_1_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_7_0=ruleProcExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getProcExprRule());
                      							}
                      							set(
                      								current,
                      								"right",
                      								lv_right_7_0,
                      								"tuks.mcrl2.dsl.MclrDsl.ProcExpr");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMclrDsl.g:2985:4: ( ( (lv_is_at_8_0= '@' ) ) ( (lv_unit_right_9_0= ruleDataExprUnit ) ) )
                    {
                    // InternalMclrDsl.g:2985:4: ( ( (lv_is_at_8_0= '@' ) ) ( (lv_unit_right_9_0= ruleDataExprUnit ) ) )
                    // InternalMclrDsl.g:2986:5: ( (lv_is_at_8_0= '@' ) ) ( (lv_unit_right_9_0= ruleDataExprUnit ) )
                    {
                    // InternalMclrDsl.g:2986:5: ( (lv_is_at_8_0= '@' ) )
                    // InternalMclrDsl.g:2987:6: (lv_is_at_8_0= '@' )
                    {
                    // InternalMclrDsl.g:2987:6: (lv_is_at_8_0= '@' )
                    // InternalMclrDsl.g:2988:7: lv_is_at_8_0= '@'
                    {
                    lv_is_at_8_0=(Token)match(input,58,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_is_at_8_0, grammarAccess.getProcExprAccess().getIs_atCommercialAtKeyword_1_1_0_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getProcExprRule());
                      							}
                      							setWithLastConsumed(current, "is_at", true, "@");
                      						
                    }

                    }


                    }

                    // InternalMclrDsl.g:3000:5: ( (lv_unit_right_9_0= ruleDataExprUnit ) )
                    // InternalMclrDsl.g:3001:6: (lv_unit_right_9_0= ruleDataExprUnit )
                    {
                    // InternalMclrDsl.g:3001:6: (lv_unit_right_9_0= ruleDataExprUnit )
                    // InternalMclrDsl.g:3002:7: lv_unit_right_9_0= ruleDataExprUnit
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getProcExprAccess().getUnit_rightDataExprUnitParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_unit_right_9_0=ruleDataExprUnit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getProcExprRule());
                      							}
                      							set(
                      								current,
                      								"unit_right",
                      								lv_unit_right_9_0,
                      								"tuks.mcrl2.dsl.MclrDsl.DataExprUnit");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleProcExpr"


    // $ANTLR start "entryRuleProcName"
    // InternalMclrDsl.g:3025:1: entryRuleProcName returns [EObject current=null] : iv_ruleProcName= ruleProcName EOF ;
    public final EObject entryRuleProcName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcName = null;


        try {
            // InternalMclrDsl.g:3025:49: (iv_ruleProcName= ruleProcName EOF )
            // InternalMclrDsl.g:3026:2: iv_ruleProcName= ruleProcName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProcNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProcName=ruleProcName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProcName; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleProcName"


    // $ANTLR start "ruleProcName"
    // InternalMclrDsl.g:3032:1: ruleProcName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleProcName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMclrDsl.g:3038:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMclrDsl.g:3039:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMclrDsl.g:3039:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMclrDsl.g:3040:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMclrDsl.g:3040:3: (lv_name_0_0= RULE_ID )
            // InternalMclrDsl.g:3041:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getProcNameAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getProcNameRule());
              				}
              				setWithLastConsumed(
              					current,
              					"name",
              					lv_name_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleProcName"


    // $ANTLR start "entryRuleProcExprTerm"
    // InternalMclrDsl.g:3060:1: entryRuleProcExprTerm returns [EObject current=null] : iv_ruleProcExprTerm= ruleProcExprTerm EOF ;
    public final EObject entryRuleProcExprTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcExprTerm = null;


        try {
            // InternalMclrDsl.g:3060:53: (iv_ruleProcExprTerm= ruleProcExprTerm EOF )
            // InternalMclrDsl.g:3061:2: iv_ruleProcExprTerm= ruleProcExprTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProcExprTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProcExprTerm=ruleProcExprTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProcExprTerm; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleProcExprTerm"


    // $ANTLR start "ruleProcExprTerm"
    // InternalMclrDsl.g:3067:1: ruleProcExprTerm returns [EObject current=null] : ( ( ( RULE_ID )=> (lv_action_0_0= ruleAction ) ) | ( ( RULE_ID )=> ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_ass_3_0= ruleAssignmentList ) )? otherlv_4= ')' ) ) | ( ( RULE_ID )=> ( ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_ass_7_0= ruleAssignmentList ) )? otherlv_8= ')' ) ) | ( (lv_is_delta_9_0= 'delta' ) ) | ( (lv_is_tau_10_0= 'tau' ) ) | ( ( (lv_is_block_11_0= 'block' ) ) otherlv_12= '(' ( (lv_act_set_13_0= ruleActIdSet ) ) otherlv_14= ',' ( (lv_proc_exp_15_0= ruleProcExpr ) ) otherlv_16= ')' ) | ( ( (lv_is_allow_17_0= 'allow' ) ) otherlv_18= '(' ( (lv_multi_set_19_0= ruleMultActIdSet ) ) otherlv_20= ',' ( (lv_proc_exp_21_0= ruleProcExpr ) ) otherlv_22= ')' ) | ( ( (lv_is_hide_23_0= 'hide' ) ) otherlv_24= '(' ( (lv_act_set_25_0= ruleActIdSet ) ) otherlv_26= ',' ( (lv_proc_exp_27_0= ruleProcExpr ) ) otherlv_28= ')' ) | ( ( ( '(' )=> (lv_is_grp_29_0= '(' ) ) ( (lv_proc_exp_30_0= ruleProcExpr ) ) otherlv_31= ')' ) | ( ( (lv_is_sum_32_0= 'sum' ) ) ( (lv_variables_33_0= ruleVarsDeclList ) ) otherlv_34= '.' ( (lv_proc_exp_35_0= ruleProcExpr ) ) ) | (this_DataExprUnit_36= ruleDataExprUnit otherlv_37= '->' ( (lv_proc_exp_38_0= ruleProcExpr ) ) (otherlv_39= '<>' ( (lv_proc_exp_other_40_0= ruleProcExpr ) ) )? ) | (otherlv_41= 'dist' this_VarsDeclList_42= ruleVarsDeclList otherlv_43= '[' ( (lv_data_44_0= ruleDataExpr ) ) otherlv_45= ']' otherlv_46= '.' ( (lv_proc_exp_47_0= ruleProcExpr ) ) ) ) ;
    public final EObject ruleProcExprTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_is_delta_9_0=null;
        Token lv_is_tau_10_0=null;
        Token lv_is_block_11_0=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token lv_is_allow_17_0=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token lv_is_hide_23_0=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token lv_is_grp_29_0=null;
        Token otherlv_31=null;
        Token lv_is_sum_32_0=null;
        Token otherlv_34=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        EObject lv_action_0_0 = null;

        EObject lv_ass_3_0 = null;

        EObject lv_ass_7_0 = null;

        EObject lv_act_set_13_0 = null;

        EObject lv_proc_exp_15_0 = null;

        EObject lv_multi_set_19_0 = null;

        EObject lv_proc_exp_21_0 = null;

        EObject lv_act_set_25_0 = null;

        EObject lv_proc_exp_27_0 = null;

        EObject lv_proc_exp_30_0 = null;

        EObject lv_variables_33_0 = null;

        EObject lv_proc_exp_35_0 = null;

        EObject this_DataExprUnit_36 = null;

        EObject lv_proc_exp_38_0 = null;

        EObject lv_proc_exp_other_40_0 = null;

        EObject this_VarsDeclList_42 = null;

        EObject lv_data_44_0 = null;

        EObject lv_proc_exp_47_0 = null;



        	enterRule();

        try {
            // InternalMclrDsl.g:3073:2: ( ( ( ( RULE_ID )=> (lv_action_0_0= ruleAction ) ) | ( ( RULE_ID )=> ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_ass_3_0= ruleAssignmentList ) )? otherlv_4= ')' ) ) | ( ( RULE_ID )=> ( ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_ass_7_0= ruleAssignmentList ) )? otherlv_8= ')' ) ) | ( (lv_is_delta_9_0= 'delta' ) ) | ( (lv_is_tau_10_0= 'tau' ) ) | ( ( (lv_is_block_11_0= 'block' ) ) otherlv_12= '(' ( (lv_act_set_13_0= ruleActIdSet ) ) otherlv_14= ',' ( (lv_proc_exp_15_0= ruleProcExpr ) ) otherlv_16= ')' ) | ( ( (lv_is_allow_17_0= 'allow' ) ) otherlv_18= '(' ( (lv_multi_set_19_0= ruleMultActIdSet ) ) otherlv_20= ',' ( (lv_proc_exp_21_0= ruleProcExpr ) ) otherlv_22= ')' ) | ( ( (lv_is_hide_23_0= 'hide' ) ) otherlv_24= '(' ( (lv_act_set_25_0= ruleActIdSet ) ) otherlv_26= ',' ( (lv_proc_exp_27_0= ruleProcExpr ) ) otherlv_28= ')' ) | ( ( ( '(' )=> (lv_is_grp_29_0= '(' ) ) ( (lv_proc_exp_30_0= ruleProcExpr ) ) otherlv_31= ')' ) | ( ( (lv_is_sum_32_0= 'sum' ) ) ( (lv_variables_33_0= ruleVarsDeclList ) ) otherlv_34= '.' ( (lv_proc_exp_35_0= ruleProcExpr ) ) ) | (this_DataExprUnit_36= ruleDataExprUnit otherlv_37= '->' ( (lv_proc_exp_38_0= ruleProcExpr ) ) (otherlv_39= '<>' ( (lv_proc_exp_other_40_0= ruleProcExpr ) ) )? ) | (otherlv_41= 'dist' this_VarsDeclList_42= ruleVarsDeclList otherlv_43= '[' ( (lv_data_44_0= ruleDataExpr ) ) otherlv_45= ']' otherlv_46= '.' ( (lv_proc_exp_47_0= ruleProcExpr ) ) ) ) )
            // InternalMclrDsl.g:3074:2: ( ( ( RULE_ID )=> (lv_action_0_0= ruleAction ) ) | ( ( RULE_ID )=> ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_ass_3_0= ruleAssignmentList ) )? otherlv_4= ')' ) ) | ( ( RULE_ID )=> ( ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_ass_7_0= ruleAssignmentList ) )? otherlv_8= ')' ) ) | ( (lv_is_delta_9_0= 'delta' ) ) | ( (lv_is_tau_10_0= 'tau' ) ) | ( ( (lv_is_block_11_0= 'block' ) ) otherlv_12= '(' ( (lv_act_set_13_0= ruleActIdSet ) ) otherlv_14= ',' ( (lv_proc_exp_15_0= ruleProcExpr ) ) otherlv_16= ')' ) | ( ( (lv_is_allow_17_0= 'allow' ) ) otherlv_18= '(' ( (lv_multi_set_19_0= ruleMultActIdSet ) ) otherlv_20= ',' ( (lv_proc_exp_21_0= ruleProcExpr ) ) otherlv_22= ')' ) | ( ( (lv_is_hide_23_0= 'hide' ) ) otherlv_24= '(' ( (lv_act_set_25_0= ruleActIdSet ) ) otherlv_26= ',' ( (lv_proc_exp_27_0= ruleProcExpr ) ) otherlv_28= ')' ) | ( ( ( '(' )=> (lv_is_grp_29_0= '(' ) ) ( (lv_proc_exp_30_0= ruleProcExpr ) ) otherlv_31= ')' ) | ( ( (lv_is_sum_32_0= 'sum' ) ) ( (lv_variables_33_0= ruleVarsDeclList ) ) otherlv_34= '.' ( (lv_proc_exp_35_0= ruleProcExpr ) ) ) | (this_DataExprUnit_36= ruleDataExprUnit otherlv_37= '->' ( (lv_proc_exp_38_0= ruleProcExpr ) ) (otherlv_39= '<>' ( (lv_proc_exp_other_40_0= ruleProcExpr ) ) )? ) | (otherlv_41= 'dist' this_VarsDeclList_42= ruleVarsDeclList otherlv_43= '[' ( (lv_data_44_0= ruleDataExpr ) ) otherlv_45= ']' otherlv_46= '.' ( (lv_proc_exp_47_0= ruleProcExpr ) ) ) )
            {
            // InternalMclrDsl.g:3074:2: ( ( ( RULE_ID )=> (lv_action_0_0= ruleAction ) ) | ( ( RULE_ID )=> ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_ass_3_0= ruleAssignmentList ) )? otherlv_4= ')' ) ) | ( ( RULE_ID )=> ( ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_ass_7_0= ruleAssignmentList ) )? otherlv_8= ')' ) ) | ( (lv_is_delta_9_0= 'delta' ) ) | ( (lv_is_tau_10_0= 'tau' ) ) | ( ( (lv_is_block_11_0= 'block' ) ) otherlv_12= '(' ( (lv_act_set_13_0= ruleActIdSet ) ) otherlv_14= ',' ( (lv_proc_exp_15_0= ruleProcExpr ) ) otherlv_16= ')' ) | ( ( (lv_is_allow_17_0= 'allow' ) ) otherlv_18= '(' ( (lv_multi_set_19_0= ruleMultActIdSet ) ) otherlv_20= ',' ( (lv_proc_exp_21_0= ruleProcExpr ) ) otherlv_22= ')' ) | ( ( (lv_is_hide_23_0= 'hide' ) ) otherlv_24= '(' ( (lv_act_set_25_0= ruleActIdSet ) ) otherlv_26= ',' ( (lv_proc_exp_27_0= ruleProcExpr ) ) otherlv_28= ')' ) | ( ( ( '(' )=> (lv_is_grp_29_0= '(' ) ) ( (lv_proc_exp_30_0= ruleProcExpr ) ) otherlv_31= ')' ) | ( ( (lv_is_sum_32_0= 'sum' ) ) ( (lv_variables_33_0= ruleVarsDeclList ) ) otherlv_34= '.' ( (lv_proc_exp_35_0= ruleProcExpr ) ) ) | (this_DataExprUnit_36= ruleDataExprUnit otherlv_37= '->' ( (lv_proc_exp_38_0= ruleProcExpr ) ) (otherlv_39= '<>' ( (lv_proc_exp_other_40_0= ruleProcExpr ) ) )? ) | (otherlv_41= 'dist' this_VarsDeclList_42= ruleVarsDeclList otherlv_43= '[' ( (lv_data_44_0= ruleDataExpr ) ) otherlv_45= ']' otherlv_46= '.' ( (lv_proc_exp_47_0= ruleProcExpr ) ) ) )
            int alt41=12;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // InternalMclrDsl.g:3075:3: ( ( RULE_ID )=> (lv_action_0_0= ruleAction ) )
                    {
                    // InternalMclrDsl.g:3075:3: ( ( RULE_ID )=> (lv_action_0_0= ruleAction ) )
                    // InternalMclrDsl.g:3076:4: ( RULE_ID )=> (lv_action_0_0= ruleAction )
                    {
                    // InternalMclrDsl.g:3077:4: (lv_action_0_0= ruleAction )
                    // InternalMclrDsl.g:3078:5: lv_action_0_0= ruleAction
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getProcExprTermAccess().getActionActionParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_action_0_0=ruleAction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getProcExprTermRule());
                      					}
                      					set(
                      						current,
                      						"action",
                      						lv_action_0_0,
                      						"tuks.mcrl2.dsl.MclrDsl.Action");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMclrDsl.g:3096:3: ( ( RULE_ID )=> ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_ass_3_0= ruleAssignmentList ) )? otherlv_4= ')' ) )
                    {
                    // InternalMclrDsl.g:3096:3: ( ( RULE_ID )=> ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_ass_3_0= ruleAssignmentList ) )? otherlv_4= ')' ) )
                    // InternalMclrDsl.g:3097:4: ( RULE_ID )=> ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_ass_3_0= ruleAssignmentList ) )? otherlv_4= ')' )
                    {
                    // InternalMclrDsl.g:3098:4: ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_ass_3_0= ruleAssignmentList ) )? otherlv_4= ')' )
                    // InternalMclrDsl.g:3099:5: ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_ass_3_0= ruleAssignmentList ) )? otherlv_4= ')'
                    {
                    // InternalMclrDsl.g:3099:5: ( (otherlv_1= RULE_ID ) )
                    // InternalMclrDsl.g:3100:6: (otherlv_1= RULE_ID )
                    {
                    // InternalMclrDsl.g:3100:6: (otherlv_1= RULE_ID )
                    // InternalMclrDsl.g:3101:7: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getProcExprTermRule());
                      							}
                      						
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(otherlv_1, grammarAccess.getProcExprTermAccess().getProc_idProcNameCrossReference_1_0_0_0());
                      						
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,12,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getProcExprTermAccess().getLeftParenthesisKeyword_1_0_1());
                      				
                    }
                    // InternalMclrDsl.g:3116:5: ( (lv_ass_3_0= ruleAssignmentList ) )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==RULE_ID) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalMclrDsl.g:3117:6: (lv_ass_3_0= ruleAssignmentList )
                            {
                            // InternalMclrDsl.g:3117:6: (lv_ass_3_0= ruleAssignmentList )
                            // InternalMclrDsl.g:3118:7: lv_ass_3_0= ruleAssignmentList
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getProcExprTermAccess().getAssAssignmentListParserRuleCall_1_0_2_0());
                              						
                            }
                            pushFollow(FOLLOW_9);
                            lv_ass_3_0=ruleAssignmentList();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getProcExprTermRule());
                              							}
                              							set(
                              								current,
                              								"ass",
                              								lv_ass_3_0,
                              								"tuks.mcrl2.dsl.MclrDsl.AssignmentList");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getProcExprTermAccess().getRightParenthesisKeyword_1_0_3());
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMclrDsl.g:3142:3: ( ( RULE_ID )=> ( ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_ass_7_0= ruleAssignmentList ) )? otherlv_8= ')' ) )
                    {
                    // InternalMclrDsl.g:3142:3: ( ( RULE_ID )=> ( ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_ass_7_0= ruleAssignmentList ) )? otherlv_8= ')' ) )
                    // InternalMclrDsl.g:3143:4: ( RULE_ID )=> ( ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_ass_7_0= ruleAssignmentList ) )? otherlv_8= ')' )
                    {
                    // InternalMclrDsl.g:3144:4: ( ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_ass_7_0= ruleAssignmentList ) )? otherlv_8= ')' )
                    // InternalMclrDsl.g:3145:5: ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_ass_7_0= ruleAssignmentList ) )? otherlv_8= ')'
                    {
                    // InternalMclrDsl.g:3145:5: ( (otherlv_5= RULE_ID ) )
                    // InternalMclrDsl.g:3146:6: (otherlv_5= RULE_ID )
                    {
                    // InternalMclrDsl.g:3146:6: (otherlv_5= RULE_ID )
                    // InternalMclrDsl.g:3147:7: otherlv_5= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getProcExprTermRule());
                      							}
                      						
                    }
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(otherlv_5, grammarAccess.getProcExprTermAccess().getMap_idSortNameCrossReference_2_0_0_0());
                      						
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,12,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getProcExprTermAccess().getLeftParenthesisKeyword_2_0_1());
                      				
                    }
                    // InternalMclrDsl.g:3162:5: ( (lv_ass_7_0= ruleAssignmentList ) )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==RULE_ID) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalMclrDsl.g:3163:6: (lv_ass_7_0= ruleAssignmentList )
                            {
                            // InternalMclrDsl.g:3163:6: (lv_ass_7_0= ruleAssignmentList )
                            // InternalMclrDsl.g:3164:7: lv_ass_7_0= ruleAssignmentList
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getProcExprTermAccess().getAssAssignmentListParserRuleCall_2_0_2_0());
                              						
                            }
                            pushFollow(FOLLOW_9);
                            lv_ass_7_0=ruleAssignmentList();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getProcExprTermRule());
                              							}
                              							set(
                              								current,
                              								"ass",
                              								lv_ass_7_0,
                              								"tuks.mcrl2.dsl.MclrDsl.AssignmentList");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_8, grammarAccess.getProcExprTermAccess().getRightParenthesisKeyword_2_0_3());
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMclrDsl.g:3188:3: ( (lv_is_delta_9_0= 'delta' ) )
                    {
                    // InternalMclrDsl.g:3188:3: ( (lv_is_delta_9_0= 'delta' ) )
                    // InternalMclrDsl.g:3189:4: (lv_is_delta_9_0= 'delta' )
                    {
                    // InternalMclrDsl.g:3189:4: (lv_is_delta_9_0= 'delta' )
                    // InternalMclrDsl.g:3190:5: lv_is_delta_9_0= 'delta'
                    {
                    lv_is_delta_9_0=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_is_delta_9_0, grammarAccess.getProcExprTermAccess().getIs_deltaDeltaKeyword_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getProcExprTermRule());
                      					}
                      					setWithLastConsumed(current, "is_delta", true, "delta");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalMclrDsl.g:3203:3: ( (lv_is_tau_10_0= 'tau' ) )
                    {
                    // InternalMclrDsl.g:3203:3: ( (lv_is_tau_10_0= 'tau' ) )
                    // InternalMclrDsl.g:3204:4: (lv_is_tau_10_0= 'tau' )
                    {
                    // InternalMclrDsl.g:3204:4: (lv_is_tau_10_0= 'tau' )
                    // InternalMclrDsl.g:3205:5: lv_is_tau_10_0= 'tau'
                    {
                    lv_is_tau_10_0=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_is_tau_10_0, grammarAccess.getProcExprTermAccess().getIs_tauTauKeyword_4_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getProcExprTermRule());
                      					}
                      					setWithLastConsumed(current, "is_tau", true, "tau");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalMclrDsl.g:3218:3: ( ( (lv_is_block_11_0= 'block' ) ) otherlv_12= '(' ( (lv_act_set_13_0= ruleActIdSet ) ) otherlv_14= ',' ( (lv_proc_exp_15_0= ruleProcExpr ) ) otherlv_16= ')' )
                    {
                    // InternalMclrDsl.g:3218:3: ( ( (lv_is_block_11_0= 'block' ) ) otherlv_12= '(' ( (lv_act_set_13_0= ruleActIdSet ) ) otherlv_14= ',' ( (lv_proc_exp_15_0= ruleProcExpr ) ) otherlv_16= ')' )
                    // InternalMclrDsl.g:3219:4: ( (lv_is_block_11_0= 'block' ) ) otherlv_12= '(' ( (lv_act_set_13_0= ruleActIdSet ) ) otherlv_14= ',' ( (lv_proc_exp_15_0= ruleProcExpr ) ) otherlv_16= ')'
                    {
                    // InternalMclrDsl.g:3219:4: ( (lv_is_block_11_0= 'block' ) )
                    // InternalMclrDsl.g:3220:5: (lv_is_block_11_0= 'block' )
                    {
                    // InternalMclrDsl.g:3220:5: (lv_is_block_11_0= 'block' )
                    // InternalMclrDsl.g:3221:6: lv_is_block_11_0= 'block'
                    {
                    lv_is_block_11_0=(Token)match(input,61,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_is_block_11_0, grammarAccess.getProcExprTermAccess().getIs_blockBlockKeyword_5_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getProcExprTermRule());
                      						}
                      						setWithLastConsumed(current, "is_block", true, "block");
                      					
                    }

                    }


                    }

                    otherlv_12=(Token)match(input,12,FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getProcExprTermAccess().getLeftParenthesisKeyword_5_1());
                      			
                    }
                    // InternalMclrDsl.g:3237:4: ( (lv_act_set_13_0= ruleActIdSet ) )
                    // InternalMclrDsl.g:3238:5: (lv_act_set_13_0= ruleActIdSet )
                    {
                    // InternalMclrDsl.g:3238:5: (lv_act_set_13_0= ruleActIdSet )
                    // InternalMclrDsl.g:3239:6: lv_act_set_13_0= ruleActIdSet
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getProcExprTermAccess().getAct_setActIdSetParserRuleCall_5_2_0());
                      					
                    }
                    pushFollow(FOLLOW_39);
                    lv_act_set_13_0=ruleActIdSet();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getProcExprTermRule());
                      						}
                      						set(
                      							current,
                      							"act_set",
                      							lv_act_set_13_0,
                      							"tuks.mcrl2.dsl.MclrDsl.ActIdSet");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_14=(Token)match(input,11,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getProcExprTermAccess().getCommaKeyword_5_3());
                      			
                    }
                    // InternalMclrDsl.g:3260:4: ( (lv_proc_exp_15_0= ruleProcExpr ) )
                    // InternalMclrDsl.g:3261:5: (lv_proc_exp_15_0= ruleProcExpr )
                    {
                    // InternalMclrDsl.g:3261:5: (lv_proc_exp_15_0= ruleProcExpr )
                    // InternalMclrDsl.g:3262:6: lv_proc_exp_15_0= ruleProcExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getProcExprTermAccess().getProc_expProcExprParserRuleCall_5_4_0());
                      					
                    }
                    pushFollow(FOLLOW_9);
                    lv_proc_exp_15_0=ruleProcExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getProcExprTermRule());
                      						}
                      						set(
                      							current,
                      							"proc_exp",
                      							lv_proc_exp_15_0,
                      							"tuks.mcrl2.dsl.MclrDsl.ProcExpr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_16=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getProcExprTermAccess().getRightParenthesisKeyword_5_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalMclrDsl.g:3285:3: ( ( (lv_is_allow_17_0= 'allow' ) ) otherlv_18= '(' ( (lv_multi_set_19_0= ruleMultActIdSet ) ) otherlv_20= ',' ( (lv_proc_exp_21_0= ruleProcExpr ) ) otherlv_22= ')' )
                    {
                    // InternalMclrDsl.g:3285:3: ( ( (lv_is_allow_17_0= 'allow' ) ) otherlv_18= '(' ( (lv_multi_set_19_0= ruleMultActIdSet ) ) otherlv_20= ',' ( (lv_proc_exp_21_0= ruleProcExpr ) ) otherlv_22= ')' )
                    // InternalMclrDsl.g:3286:4: ( (lv_is_allow_17_0= 'allow' ) ) otherlv_18= '(' ( (lv_multi_set_19_0= ruleMultActIdSet ) ) otherlv_20= ',' ( (lv_proc_exp_21_0= ruleProcExpr ) ) otherlv_22= ')'
                    {
                    // InternalMclrDsl.g:3286:4: ( (lv_is_allow_17_0= 'allow' ) )
                    // InternalMclrDsl.g:3287:5: (lv_is_allow_17_0= 'allow' )
                    {
                    // InternalMclrDsl.g:3287:5: (lv_is_allow_17_0= 'allow' )
                    // InternalMclrDsl.g:3288:6: lv_is_allow_17_0= 'allow'
                    {
                    lv_is_allow_17_0=(Token)match(input,62,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_is_allow_17_0, grammarAccess.getProcExprTermAccess().getIs_allowAllowKeyword_6_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getProcExprTermRule());
                      						}
                      						setWithLastConsumed(current, "is_allow", true, "allow");
                      					
                    }

                    }


                    }

                    otherlv_18=(Token)match(input,12,FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getProcExprTermAccess().getLeftParenthesisKeyword_6_1());
                      			
                    }
                    // InternalMclrDsl.g:3304:4: ( (lv_multi_set_19_0= ruleMultActIdSet ) )
                    // InternalMclrDsl.g:3305:5: (lv_multi_set_19_0= ruleMultActIdSet )
                    {
                    // InternalMclrDsl.g:3305:5: (lv_multi_set_19_0= ruleMultActIdSet )
                    // InternalMclrDsl.g:3306:6: lv_multi_set_19_0= ruleMultActIdSet
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getProcExprTermAccess().getMulti_setMultActIdSetParserRuleCall_6_2_0());
                      					
                    }
                    pushFollow(FOLLOW_39);
                    lv_multi_set_19_0=ruleMultActIdSet();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getProcExprTermRule());
                      						}
                      						set(
                      							current,
                      							"multi_set",
                      							lv_multi_set_19_0,
                      							"tuks.mcrl2.dsl.MclrDsl.MultActIdSet");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_20=(Token)match(input,11,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_20, grammarAccess.getProcExprTermAccess().getCommaKeyword_6_3());
                      			
                    }
                    // InternalMclrDsl.g:3327:4: ( (lv_proc_exp_21_0= ruleProcExpr ) )
                    // InternalMclrDsl.g:3328:5: (lv_proc_exp_21_0= ruleProcExpr )
                    {
                    // InternalMclrDsl.g:3328:5: (lv_proc_exp_21_0= ruleProcExpr )
                    // InternalMclrDsl.g:3329:6: lv_proc_exp_21_0= ruleProcExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getProcExprTermAccess().getProc_expProcExprParserRuleCall_6_4_0());
                      					
                    }
                    pushFollow(FOLLOW_9);
                    lv_proc_exp_21_0=ruleProcExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getProcExprTermRule());
                      						}
                      						set(
                      							current,
                      							"proc_exp",
                      							lv_proc_exp_21_0,
                      							"tuks.mcrl2.dsl.MclrDsl.ProcExpr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_22=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_22, grammarAccess.getProcExprTermAccess().getRightParenthesisKeyword_6_5());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalMclrDsl.g:3352:3: ( ( (lv_is_hide_23_0= 'hide' ) ) otherlv_24= '(' ( (lv_act_set_25_0= ruleActIdSet ) ) otherlv_26= ',' ( (lv_proc_exp_27_0= ruleProcExpr ) ) otherlv_28= ')' )
                    {
                    // InternalMclrDsl.g:3352:3: ( ( (lv_is_hide_23_0= 'hide' ) ) otherlv_24= '(' ( (lv_act_set_25_0= ruleActIdSet ) ) otherlv_26= ',' ( (lv_proc_exp_27_0= ruleProcExpr ) ) otherlv_28= ')' )
                    // InternalMclrDsl.g:3353:4: ( (lv_is_hide_23_0= 'hide' ) ) otherlv_24= '(' ( (lv_act_set_25_0= ruleActIdSet ) ) otherlv_26= ',' ( (lv_proc_exp_27_0= ruleProcExpr ) ) otherlv_28= ')'
                    {
                    // InternalMclrDsl.g:3353:4: ( (lv_is_hide_23_0= 'hide' ) )
                    // InternalMclrDsl.g:3354:5: (lv_is_hide_23_0= 'hide' )
                    {
                    // InternalMclrDsl.g:3354:5: (lv_is_hide_23_0= 'hide' )
                    // InternalMclrDsl.g:3355:6: lv_is_hide_23_0= 'hide'
                    {
                    lv_is_hide_23_0=(Token)match(input,63,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_is_hide_23_0, grammarAccess.getProcExprTermAccess().getIs_hideHideKeyword_7_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getProcExprTermRule());
                      						}
                      						setWithLastConsumed(current, "is_hide", true, "hide");
                      					
                    }

                    }


                    }

                    otherlv_24=(Token)match(input,12,FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_24, grammarAccess.getProcExprTermAccess().getLeftParenthesisKeyword_7_1());
                      			
                    }
                    // InternalMclrDsl.g:3371:4: ( (lv_act_set_25_0= ruleActIdSet ) )
                    // InternalMclrDsl.g:3372:5: (lv_act_set_25_0= ruleActIdSet )
                    {
                    // InternalMclrDsl.g:3372:5: (lv_act_set_25_0= ruleActIdSet )
                    // InternalMclrDsl.g:3373:6: lv_act_set_25_0= ruleActIdSet
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getProcExprTermAccess().getAct_setActIdSetParserRuleCall_7_2_0());
                      					
                    }
                    pushFollow(FOLLOW_39);
                    lv_act_set_25_0=ruleActIdSet();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getProcExprTermRule());
                      						}
                      						set(
                      							current,
                      							"act_set",
                      							lv_act_set_25_0,
                      							"tuks.mcrl2.dsl.MclrDsl.ActIdSet");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_26=(Token)match(input,11,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_26, grammarAccess.getProcExprTermAccess().getCommaKeyword_7_3());
                      			
                    }
                    // InternalMclrDsl.g:3394:4: ( (lv_proc_exp_27_0= ruleProcExpr ) )
                    // InternalMclrDsl.g:3395:5: (lv_proc_exp_27_0= ruleProcExpr )
                    {
                    // InternalMclrDsl.g:3395:5: (lv_proc_exp_27_0= ruleProcExpr )
                    // InternalMclrDsl.g:3396:6: lv_proc_exp_27_0= ruleProcExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getProcExprTermAccess().getProc_expProcExprParserRuleCall_7_4_0());
                      					
                    }
                    pushFollow(FOLLOW_9);
                    lv_proc_exp_27_0=ruleProcExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getProcExprTermRule());
                      						}
                      						set(
                      							current,
                      							"proc_exp",
                      							lv_proc_exp_27_0,
                      							"tuks.mcrl2.dsl.MclrDsl.ProcExpr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_28=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_28, grammarAccess.getProcExprTermAccess().getRightParenthesisKeyword_7_5());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalMclrDsl.g:3419:3: ( ( ( '(' )=> (lv_is_grp_29_0= '(' ) ) ( (lv_proc_exp_30_0= ruleProcExpr ) ) otherlv_31= ')' )
                    {
                    // InternalMclrDsl.g:3419:3: ( ( ( '(' )=> (lv_is_grp_29_0= '(' ) ) ( (lv_proc_exp_30_0= ruleProcExpr ) ) otherlv_31= ')' )
                    // InternalMclrDsl.g:3420:4: ( ( '(' )=> (lv_is_grp_29_0= '(' ) ) ( (lv_proc_exp_30_0= ruleProcExpr ) ) otherlv_31= ')'
                    {
                    // InternalMclrDsl.g:3420:4: ( ( '(' )=> (lv_is_grp_29_0= '(' ) )
                    // InternalMclrDsl.g:3421:5: ( '(' )=> (lv_is_grp_29_0= '(' )
                    {
                    // InternalMclrDsl.g:3422:5: (lv_is_grp_29_0= '(' )
                    // InternalMclrDsl.g:3423:6: lv_is_grp_29_0= '('
                    {
                    lv_is_grp_29_0=(Token)match(input,12,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_is_grp_29_0, grammarAccess.getProcExprTermAccess().getIs_grpLeftParenthesisKeyword_8_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getProcExprTermRule());
                      						}
                      						setWithLastConsumed(current, "is_grp", true, "(");
                      					
                    }

                    }


                    }

                    // InternalMclrDsl.g:3435:4: ( (lv_proc_exp_30_0= ruleProcExpr ) )
                    // InternalMclrDsl.g:3436:5: (lv_proc_exp_30_0= ruleProcExpr )
                    {
                    // InternalMclrDsl.g:3436:5: (lv_proc_exp_30_0= ruleProcExpr )
                    // InternalMclrDsl.g:3437:6: lv_proc_exp_30_0= ruleProcExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getProcExprTermAccess().getProc_expProcExprParserRuleCall_8_1_0());
                      					
                    }
                    pushFollow(FOLLOW_9);
                    lv_proc_exp_30_0=ruleProcExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getProcExprTermRule());
                      						}
                      						set(
                      							current,
                      							"proc_exp",
                      							lv_proc_exp_30_0,
                      							"tuks.mcrl2.dsl.MclrDsl.ProcExpr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_31=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_31, grammarAccess.getProcExprTermAccess().getRightParenthesisKeyword_8_2());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalMclrDsl.g:3460:3: ( ( (lv_is_sum_32_0= 'sum' ) ) ( (lv_variables_33_0= ruleVarsDeclList ) ) otherlv_34= '.' ( (lv_proc_exp_35_0= ruleProcExpr ) ) )
                    {
                    // InternalMclrDsl.g:3460:3: ( ( (lv_is_sum_32_0= 'sum' ) ) ( (lv_variables_33_0= ruleVarsDeclList ) ) otherlv_34= '.' ( (lv_proc_exp_35_0= ruleProcExpr ) ) )
                    // InternalMclrDsl.g:3461:4: ( (lv_is_sum_32_0= 'sum' ) ) ( (lv_variables_33_0= ruleVarsDeclList ) ) otherlv_34= '.' ( (lv_proc_exp_35_0= ruleProcExpr ) )
                    {
                    // InternalMclrDsl.g:3461:4: ( (lv_is_sum_32_0= 'sum' ) )
                    // InternalMclrDsl.g:3462:5: (lv_is_sum_32_0= 'sum' )
                    {
                    // InternalMclrDsl.g:3462:5: (lv_is_sum_32_0= 'sum' )
                    // InternalMclrDsl.g:3463:6: lv_is_sum_32_0= 'sum'
                    {
                    lv_is_sum_32_0=(Token)match(input,64,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_is_sum_32_0, grammarAccess.getProcExprTermAccess().getIs_sumSumKeyword_9_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getProcExprTermRule());
                      						}
                      						setWithLastConsumed(current, "is_sum", true, "sum");
                      					
                    }

                    }


                    }

                    // InternalMclrDsl.g:3475:4: ( (lv_variables_33_0= ruleVarsDeclList ) )
                    // InternalMclrDsl.g:3476:5: (lv_variables_33_0= ruleVarsDeclList )
                    {
                    // InternalMclrDsl.g:3476:5: (lv_variables_33_0= ruleVarsDeclList )
                    // InternalMclrDsl.g:3477:6: lv_variables_33_0= ruleVarsDeclList
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getProcExprTermAccess().getVariablesVarsDeclListParserRuleCall_9_1_0());
                      					
                    }
                    pushFollow(FOLLOW_29);
                    lv_variables_33_0=ruleVarsDeclList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getProcExprTermRule());
                      						}
                      						set(
                      							current,
                      							"variables",
                      							lv_variables_33_0,
                      							"tuks.mcrl2.dsl.MclrDsl.VarsDeclList");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_34=(Token)match(input,49,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_34, grammarAccess.getProcExprTermAccess().getFullStopKeyword_9_2());
                      			
                    }
                    // InternalMclrDsl.g:3498:4: ( (lv_proc_exp_35_0= ruleProcExpr ) )
                    // InternalMclrDsl.g:3499:5: (lv_proc_exp_35_0= ruleProcExpr )
                    {
                    // InternalMclrDsl.g:3499:5: (lv_proc_exp_35_0= ruleProcExpr )
                    // InternalMclrDsl.g:3500:6: lv_proc_exp_35_0= ruleProcExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getProcExprTermAccess().getProc_expProcExprParserRuleCall_9_3_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_proc_exp_35_0=ruleProcExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getProcExprTermRule());
                      						}
                      						set(
                      							current,
                      							"proc_exp",
                      							lv_proc_exp_35_0,
                      							"tuks.mcrl2.dsl.MclrDsl.ProcExpr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 11 :
                    // InternalMclrDsl.g:3519:3: (this_DataExprUnit_36= ruleDataExprUnit otherlv_37= '->' ( (lv_proc_exp_38_0= ruleProcExpr ) ) (otherlv_39= '<>' ( (lv_proc_exp_other_40_0= ruleProcExpr ) ) )? )
                    {
                    // InternalMclrDsl.g:3519:3: (this_DataExprUnit_36= ruleDataExprUnit otherlv_37= '->' ( (lv_proc_exp_38_0= ruleProcExpr ) ) (otherlv_39= '<>' ( (lv_proc_exp_other_40_0= ruleProcExpr ) ) )? )
                    // InternalMclrDsl.g:3520:4: this_DataExprUnit_36= ruleDataExprUnit otherlv_37= '->' ( (lv_proc_exp_38_0= ruleProcExpr ) ) (otherlv_39= '<>' ( (lv_proc_exp_other_40_0= ruleProcExpr ) ) )?
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getProcExprTermAccess().getDataExprUnitParserRuleCall_10_0());
                      			
                    }
                    pushFollow(FOLLOW_22);
                    this_DataExprUnit_36=ruleDataExprUnit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_DataExprUnit_36;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_37=(Token)match(input,29,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_37, grammarAccess.getProcExprTermAccess().getHyphenMinusGreaterThanSignKeyword_10_1());
                      			
                    }
                    // InternalMclrDsl.g:3532:4: ( (lv_proc_exp_38_0= ruleProcExpr ) )
                    // InternalMclrDsl.g:3533:5: (lv_proc_exp_38_0= ruleProcExpr )
                    {
                    // InternalMclrDsl.g:3533:5: (lv_proc_exp_38_0= ruleProcExpr )
                    // InternalMclrDsl.g:3534:6: lv_proc_exp_38_0= ruleProcExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getProcExprTermAccess().getProc_expProcExprParserRuleCall_10_2_0());
                      					
                    }
                    pushFollow(FOLLOW_40);
                    lv_proc_exp_38_0=ruleProcExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getProcExprTermRule());
                      						}
                      						set(
                      							current,
                      							"proc_exp",
                      							lv_proc_exp_38_0,
                      							"tuks.mcrl2.dsl.MclrDsl.ProcExpr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalMclrDsl.g:3551:4: (otherlv_39= '<>' ( (lv_proc_exp_other_40_0= ruleProcExpr ) ) )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==65) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalMclrDsl.g:3552:5: otherlv_39= '<>' ( (lv_proc_exp_other_40_0= ruleProcExpr ) )
                            {
                            otherlv_39=(Token)match(input,65,FOLLOW_34); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_39, grammarAccess.getProcExprTermAccess().getLessThanSignGreaterThanSignKeyword_10_3_0());
                              				
                            }
                            // InternalMclrDsl.g:3556:5: ( (lv_proc_exp_other_40_0= ruleProcExpr ) )
                            // InternalMclrDsl.g:3557:6: (lv_proc_exp_other_40_0= ruleProcExpr )
                            {
                            // InternalMclrDsl.g:3557:6: (lv_proc_exp_other_40_0= ruleProcExpr )
                            // InternalMclrDsl.g:3558:7: lv_proc_exp_other_40_0= ruleProcExpr
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getProcExprTermAccess().getProc_exp_otherProcExprParserRuleCall_10_3_1_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_proc_exp_other_40_0=ruleProcExpr();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getProcExprTermRule());
                              							}
                              							set(
                              								current,
                              								"proc_exp_other",
                              								lv_proc_exp_other_40_0,
                              								"tuks.mcrl2.dsl.MclrDsl.ProcExpr");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 12 :
                    // InternalMclrDsl.g:3578:3: (otherlv_41= 'dist' this_VarsDeclList_42= ruleVarsDeclList otherlv_43= '[' ( (lv_data_44_0= ruleDataExpr ) ) otherlv_45= ']' otherlv_46= '.' ( (lv_proc_exp_47_0= ruleProcExpr ) ) )
                    {
                    // InternalMclrDsl.g:3578:3: (otherlv_41= 'dist' this_VarsDeclList_42= ruleVarsDeclList otherlv_43= '[' ( (lv_data_44_0= ruleDataExpr ) ) otherlv_45= ']' otherlv_46= '.' ( (lv_proc_exp_47_0= ruleProcExpr ) ) )
                    // InternalMclrDsl.g:3579:4: otherlv_41= 'dist' this_VarsDeclList_42= ruleVarsDeclList otherlv_43= '[' ( (lv_data_44_0= ruleDataExpr ) ) otherlv_45= ']' otherlv_46= '.' ( (lv_proc_exp_47_0= ruleProcExpr ) )
                    {
                    otherlv_41=(Token)match(input,66,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_41, grammarAccess.getProcExprTermAccess().getDistKeyword_11_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getProcExprTermAccess().getVarsDeclListParserRuleCall_11_1());
                      			
                    }
                    pushFollow(FOLLOW_41);
                    this_VarsDeclList_42=ruleVarsDeclList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_VarsDeclList_42;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_43=(Token)match(input,28,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_43, grammarAccess.getProcExprTermAccess().getLeftSquareBracketKeyword_11_2());
                      			
                    }
                    // InternalMclrDsl.g:3595:4: ( (lv_data_44_0= ruleDataExpr ) )
                    // InternalMclrDsl.g:3596:5: (lv_data_44_0= ruleDataExpr )
                    {
                    // InternalMclrDsl.g:3596:5: (lv_data_44_0= ruleDataExpr )
                    // InternalMclrDsl.g:3597:6: lv_data_44_0= ruleDataExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getProcExprTermAccess().getDataDataExprParserRuleCall_11_3_0());
                      					
                    }
                    pushFollow(FOLLOW_23);
                    lv_data_44_0=ruleDataExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getProcExprTermRule());
                      						}
                      						set(
                      							current,
                      							"data",
                      							lv_data_44_0,
                      							"tuks.mcrl2.dsl.MclrDsl.DataExpr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_45=(Token)match(input,30,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_45, grammarAccess.getProcExprTermAccess().getRightSquareBracketKeyword_11_4());
                      			
                    }
                    otherlv_46=(Token)match(input,49,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_46, grammarAccess.getProcExprTermAccess().getFullStopKeyword_11_5());
                      			
                    }
                    // InternalMclrDsl.g:3622:4: ( (lv_proc_exp_47_0= ruleProcExpr ) )
                    // InternalMclrDsl.g:3623:5: (lv_proc_exp_47_0= ruleProcExpr )
                    {
                    // InternalMclrDsl.g:3623:5: (lv_proc_exp_47_0= ruleProcExpr )
                    // InternalMclrDsl.g:3624:6: lv_proc_exp_47_0= ruleProcExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getProcExprTermAccess().getProc_expProcExprParserRuleCall_11_6_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_proc_exp_47_0=ruleProcExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getProcExprTermRule());
                      						}
                      						set(
                      							current,
                      							"proc_exp",
                      							lv_proc_exp_47_0,
                      							"tuks.mcrl2.dsl.MclrDsl.ProcExpr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleProcExprTerm"


    // $ANTLR start "entryRuleSortName"
    // InternalMclrDsl.g:3646:1: entryRuleSortName returns [EObject current=null] : iv_ruleSortName= ruleSortName EOF ;
    public final EObject entryRuleSortName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSortName = null;


        try {
            // InternalMclrDsl.g:3646:49: (iv_ruleSortName= ruleSortName EOF )
            // InternalMclrDsl.g:3647:2: iv_ruleSortName= ruleSortName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSortNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSortName=ruleSortName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSortName; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSortName"


    // $ANTLR start "ruleSortName"
    // InternalMclrDsl.g:3653:1: ruleSortName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleSortName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMclrDsl.g:3659:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMclrDsl.g:3660:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMclrDsl.g:3660:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMclrDsl.g:3661:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMclrDsl.g:3661:3: (lv_name_0_0= RULE_ID )
            // InternalMclrDsl.g:3662:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getSortNameAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getSortNameRule());
              				}
              				setWithLastConsumed(
              					current,
              					"name",
              					lv_name_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSortName"


    // $ANTLR start "entryRuleSortIdList"
    // InternalMclrDsl.g:3681:1: entryRuleSortIdList returns [EObject current=null] : iv_ruleSortIdList= ruleSortIdList EOF ;
    public final EObject entryRuleSortIdList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSortIdList = null;


        try {
            // InternalMclrDsl.g:3681:51: (iv_ruleSortIdList= ruleSortIdList EOF )
            // InternalMclrDsl.g:3682:2: iv_ruleSortIdList= ruleSortIdList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSortIdListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSortIdList=ruleSortIdList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSortIdList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSortIdList"


    // $ANTLR start "ruleSortIdList"
    // InternalMclrDsl.g:3688:1: ruleSortIdList returns [EObject current=null] : ( ( (lv_id_list_0_0= ruleSortName ) ) (otherlv_1= ',' ( (lv_id_list_2_0= ruleSortName ) ) )* ) ;
    public final EObject ruleSortIdList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_id_list_0_0 = null;

        EObject lv_id_list_2_0 = null;



        	enterRule();

        try {
            // InternalMclrDsl.g:3694:2: ( ( ( (lv_id_list_0_0= ruleSortName ) ) (otherlv_1= ',' ( (lv_id_list_2_0= ruleSortName ) ) )* ) )
            // InternalMclrDsl.g:3695:2: ( ( (lv_id_list_0_0= ruleSortName ) ) (otherlv_1= ',' ( (lv_id_list_2_0= ruleSortName ) ) )* )
            {
            // InternalMclrDsl.g:3695:2: ( ( (lv_id_list_0_0= ruleSortName ) ) (otherlv_1= ',' ( (lv_id_list_2_0= ruleSortName ) ) )* )
            // InternalMclrDsl.g:3696:3: ( (lv_id_list_0_0= ruleSortName ) ) (otherlv_1= ',' ( (lv_id_list_2_0= ruleSortName ) ) )*
            {
            // InternalMclrDsl.g:3696:3: ( (lv_id_list_0_0= ruleSortName ) )
            // InternalMclrDsl.g:3697:4: (lv_id_list_0_0= ruleSortName )
            {
            // InternalMclrDsl.g:3697:4: (lv_id_list_0_0= ruleSortName )
            // InternalMclrDsl.g:3698:5: lv_id_list_0_0= ruleSortName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSortIdListAccess().getId_listSortNameParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_id_list_0_0=ruleSortName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSortIdListRule());
              					}
              					add(
              						current,
              						"id_list",
              						lv_id_list_0_0,
              						"tuks.mcrl2.dsl.MclrDsl.SortName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMclrDsl.g:3715:3: (otherlv_1= ',' ( (lv_id_list_2_0= ruleSortName ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==11) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalMclrDsl.g:3716:4: otherlv_1= ',' ( (lv_id_list_2_0= ruleSortName ) )
            	    {
            	    otherlv_1=(Token)match(input,11,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getSortIdListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalMclrDsl.g:3720:4: ( (lv_id_list_2_0= ruleSortName ) )
            	    // InternalMclrDsl.g:3721:5: (lv_id_list_2_0= ruleSortName )
            	    {
            	    // InternalMclrDsl.g:3721:5: (lv_id_list_2_0= ruleSortName )
            	    // InternalMclrDsl.g:3722:6: lv_id_list_2_0= ruleSortName
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSortIdListAccess().getId_listSortNameParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_id_list_2_0=ruleSortName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSortIdListRule());
            	      						}
            	      						add(
            	      							current,
            	      							"id_list",
            	      							lv_id_list_2_0,
            	      							"tuks.mcrl2.dsl.MclrDsl.SortName");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSortIdList"


    // $ANTLR start "entryRuleSortIdsDecl"
    // InternalMclrDsl.g:3744:1: entryRuleSortIdsDecl returns [EObject current=null] : iv_ruleSortIdsDecl= ruleSortIdsDecl EOF ;
    public final EObject entryRuleSortIdsDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSortIdsDecl = null;


        try {
            // InternalMclrDsl.g:3744:52: (iv_ruleSortIdsDecl= ruleSortIdsDecl EOF )
            // InternalMclrDsl.g:3745:2: iv_ruleSortIdsDecl= ruleSortIdsDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSortIdsDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSortIdsDecl=ruleSortIdsDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSortIdsDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSortIdsDecl"


    // $ANTLR start "ruleSortIdsDecl"
    // InternalMclrDsl.g:3751:1: ruleSortIdsDecl returns [EObject current=null] : ( ( (lv_id_0_0= ruleSortIdList ) ) otherlv_1= ':' ( (lv_sort_2_0= ruleSortExpr ) ) ) ;
    public final EObject ruleSortIdsDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_id_0_0 = null;

        EObject lv_sort_2_0 = null;



        	enterRule();

        try {
            // InternalMclrDsl.g:3757:2: ( ( ( (lv_id_0_0= ruleSortIdList ) ) otherlv_1= ':' ( (lv_sort_2_0= ruleSortExpr ) ) ) )
            // InternalMclrDsl.g:3758:2: ( ( (lv_id_0_0= ruleSortIdList ) ) otherlv_1= ':' ( (lv_sort_2_0= ruleSortExpr ) ) )
            {
            // InternalMclrDsl.g:3758:2: ( ( (lv_id_0_0= ruleSortIdList ) ) otherlv_1= ':' ( (lv_sort_2_0= ruleSortExpr ) ) )
            // InternalMclrDsl.g:3759:3: ( (lv_id_0_0= ruleSortIdList ) ) otherlv_1= ':' ( (lv_sort_2_0= ruleSortExpr ) )
            {
            // InternalMclrDsl.g:3759:3: ( (lv_id_0_0= ruleSortIdList ) )
            // InternalMclrDsl.g:3760:4: (lv_id_0_0= ruleSortIdList )
            {
            // InternalMclrDsl.g:3760:4: (lv_id_0_0= ruleSortIdList )
            // InternalMclrDsl.g:3761:5: lv_id_0_0= ruleSortIdList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSortIdsDeclAccess().getIdSortIdListParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_id_0_0=ruleSortIdList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSortIdsDeclRule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_0_0,
              						"tuks.mcrl2.dsl.MclrDsl.SortIdList");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSortIdsDeclAccess().getColonKeyword_1());
              		
            }
            // InternalMclrDsl.g:3782:3: ( (lv_sort_2_0= ruleSortExpr ) )
            // InternalMclrDsl.g:3783:4: (lv_sort_2_0= ruleSortExpr )
            {
            // InternalMclrDsl.g:3783:4: (lv_sort_2_0= ruleSortExpr )
            // InternalMclrDsl.g:3784:5: lv_sort_2_0= ruleSortExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSortIdsDeclAccess().getSortSortExprParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_sort_2_0=ruleSortExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSortIdsDeclRule());
              					}
              					set(
              						current,
              						"sort",
              						lv_sort_2_0,
              						"tuks.mcrl2.dsl.MclrDsl.SortExpr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSortIdsDecl"


    // $ANTLR start "entryRuleSortExpr"
    // InternalMclrDsl.g:3805:1: entryRuleSortExpr returns [EObject current=null] : iv_ruleSortExpr= ruleSortExpr EOF ;
    public final EObject entryRuleSortExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSortExpr = null;


        try {
            // InternalMclrDsl.g:3805:49: (iv_ruleSortExpr= ruleSortExpr EOF )
            // InternalMclrDsl.g:3806:2: iv_ruleSortExpr= ruleSortExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSortExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSortExpr=ruleSortExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSortExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSortExpr"


    // $ANTLR start "ruleSortExpr"
    // InternalMclrDsl.g:3812:1: ruleSortExpr returns [EObject current=null] : ( ( (lv_left_0_0= ruleSortExprTerm ) ) (otherlv_1= '->' | otherlv_2= '#' ) ( (lv_right_3_0= ruleSortExpr ) ) ) ;
    public final EObject ruleSortExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMclrDsl.g:3818:2: ( ( ( (lv_left_0_0= ruleSortExprTerm ) ) (otherlv_1= '->' | otherlv_2= '#' ) ( (lv_right_3_0= ruleSortExpr ) ) ) )
            // InternalMclrDsl.g:3819:2: ( ( (lv_left_0_0= ruleSortExprTerm ) ) (otherlv_1= '->' | otherlv_2= '#' ) ( (lv_right_3_0= ruleSortExpr ) ) )
            {
            // InternalMclrDsl.g:3819:2: ( ( (lv_left_0_0= ruleSortExprTerm ) ) (otherlv_1= '->' | otherlv_2= '#' ) ( (lv_right_3_0= ruleSortExpr ) ) )
            // InternalMclrDsl.g:3820:3: ( (lv_left_0_0= ruleSortExprTerm ) ) (otherlv_1= '->' | otherlv_2= '#' ) ( (lv_right_3_0= ruleSortExpr ) )
            {
            // InternalMclrDsl.g:3820:3: ( (lv_left_0_0= ruleSortExprTerm ) )
            // InternalMclrDsl.g:3821:4: (lv_left_0_0= ruleSortExprTerm )
            {
            // InternalMclrDsl.g:3821:4: (lv_left_0_0= ruleSortExprTerm )
            // InternalMclrDsl.g:3822:5: lv_left_0_0= ruleSortExprTerm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSortExprAccess().getLeftSortExprTermParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_42);
            lv_left_0_0=ruleSortExprTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSortExprRule());
              					}
              					set(
              						current,
              						"left",
              						lv_left_0_0,
              						"tuks.mcrl2.dsl.MclrDsl.SortExprTerm");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMclrDsl.g:3839:3: (otherlv_1= '->' | otherlv_2= '#' )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==29) ) {
                alt43=1;
            }
            else if ( (LA43_0==27) ) {
                alt43=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalMclrDsl.g:3840:4: otherlv_1= '->'
                    {
                    otherlv_1=(Token)match(input,29,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getSortExprAccess().getHyphenMinusGreaterThanSignKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalMclrDsl.g:3845:4: otherlv_2= '#'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSortExprAccess().getNumberSignKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalMclrDsl.g:3850:3: ( (lv_right_3_0= ruleSortExpr ) )
            // InternalMclrDsl.g:3851:4: (lv_right_3_0= ruleSortExpr )
            {
            // InternalMclrDsl.g:3851:4: (lv_right_3_0= ruleSortExpr )
            // InternalMclrDsl.g:3852:5: lv_right_3_0= ruleSortExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSortExprAccess().getRightSortExprParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_right_3_0=ruleSortExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSortExprRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_3_0,
              						"tuks.mcrl2.dsl.MclrDsl.SortExpr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSortExpr"


    // $ANTLR start "entryRuleSortExprTerm"
    // InternalMclrDsl.g:3873:1: entryRuleSortExprTerm returns [EObject current=null] : iv_ruleSortExprTerm= ruleSortExprTerm EOF ;
    public final EObject entryRuleSortExprTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSortExprTerm = null;


        try {
            // InternalMclrDsl.g:3873:53: (iv_ruleSortExprTerm= ruleSortExprTerm EOF )
            // InternalMclrDsl.g:3874:2: iv_ruleSortExprTerm= ruleSortExprTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSortExprTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSortExprTerm=ruleSortExprTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSortExprTerm; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSortExprTerm"


    // $ANTLR start "ruleSortExprTerm"
    // InternalMclrDsl.g:3880:1: ruleSortExprTerm returns [EObject current=null] : ( ( (lv_is_bool_0_0= 'Bool' ) ) | ( (lv_is_pos_1_0= 'Pos' ) ) | ( (lv_is_nat_2_0= 'Nat' ) ) | ( (lv_is_int_3_0= 'Int' ) ) | ( (lv_is_real_4_0= 'Real' ) ) | ( ( ( (lv_is_list_5_0= 'List' ) ) | ( (lv_set_6_0= 'Set' ) ) | ( (lv_bag_7_0= 'Bag' ) ) | ( (lv_fset_8_0= 'FSet' ) ) | ( (lv_fbag_9_0= 'FBag' ) ) ) otherlv_10= '(' ( (lv_exp_11_0= ruleSortExpr ) ) otherlv_12= ')' ) | ( (otherlv_13= RULE_ID ) ) | (otherlv_14= '(' ( (lv_exp_15_0= ruleSortExpr ) ) otherlv_16= ')' ) | (otherlv_17= 'struct' ( (lv_const_18_0= ruleConstrDeclList ) ) ) ) ;
    public final EObject ruleSortExprTerm() throws RecognitionException {
        EObject current = null;

        Token lv_is_bool_0_0=null;
        Token lv_is_pos_1_0=null;
        Token lv_is_nat_2_0=null;
        Token lv_is_int_3_0=null;
        Token lv_is_real_4_0=null;
        Token lv_is_list_5_0=null;
        Token lv_set_6_0=null;
        Token lv_bag_7_0=null;
        Token lv_fset_8_0=null;
        Token lv_fbag_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        EObject lv_exp_11_0 = null;

        EObject lv_exp_15_0 = null;

        EObject lv_const_18_0 = null;



        	enterRule();

        try {
            // InternalMclrDsl.g:3886:2: ( ( ( (lv_is_bool_0_0= 'Bool' ) ) | ( (lv_is_pos_1_0= 'Pos' ) ) | ( (lv_is_nat_2_0= 'Nat' ) ) | ( (lv_is_int_3_0= 'Int' ) ) | ( (lv_is_real_4_0= 'Real' ) ) | ( ( ( (lv_is_list_5_0= 'List' ) ) | ( (lv_set_6_0= 'Set' ) ) | ( (lv_bag_7_0= 'Bag' ) ) | ( (lv_fset_8_0= 'FSet' ) ) | ( (lv_fbag_9_0= 'FBag' ) ) ) otherlv_10= '(' ( (lv_exp_11_0= ruleSortExpr ) ) otherlv_12= ')' ) | ( (otherlv_13= RULE_ID ) ) | (otherlv_14= '(' ( (lv_exp_15_0= ruleSortExpr ) ) otherlv_16= ')' ) | (otherlv_17= 'struct' ( (lv_const_18_0= ruleConstrDeclList ) ) ) ) )
            // InternalMclrDsl.g:3887:2: ( ( (lv_is_bool_0_0= 'Bool' ) ) | ( (lv_is_pos_1_0= 'Pos' ) ) | ( (lv_is_nat_2_0= 'Nat' ) ) | ( (lv_is_int_3_0= 'Int' ) ) | ( (lv_is_real_4_0= 'Real' ) ) | ( ( ( (lv_is_list_5_0= 'List' ) ) | ( (lv_set_6_0= 'Set' ) ) | ( (lv_bag_7_0= 'Bag' ) ) | ( (lv_fset_8_0= 'FSet' ) ) | ( (lv_fbag_9_0= 'FBag' ) ) ) otherlv_10= '(' ( (lv_exp_11_0= ruleSortExpr ) ) otherlv_12= ')' ) | ( (otherlv_13= RULE_ID ) ) | (otherlv_14= '(' ( (lv_exp_15_0= ruleSortExpr ) ) otherlv_16= ')' ) | (otherlv_17= 'struct' ( (lv_const_18_0= ruleConstrDeclList ) ) ) )
            {
            // InternalMclrDsl.g:3887:2: ( ( (lv_is_bool_0_0= 'Bool' ) ) | ( (lv_is_pos_1_0= 'Pos' ) ) | ( (lv_is_nat_2_0= 'Nat' ) ) | ( (lv_is_int_3_0= 'Int' ) ) | ( (lv_is_real_4_0= 'Real' ) ) | ( ( ( (lv_is_list_5_0= 'List' ) ) | ( (lv_set_6_0= 'Set' ) ) | ( (lv_bag_7_0= 'Bag' ) ) | ( (lv_fset_8_0= 'FSet' ) ) | ( (lv_fbag_9_0= 'FBag' ) ) ) otherlv_10= '(' ( (lv_exp_11_0= ruleSortExpr ) ) otherlv_12= ')' ) | ( (otherlv_13= RULE_ID ) ) | (otherlv_14= '(' ( (lv_exp_15_0= ruleSortExpr ) ) otherlv_16= ')' ) | (otherlv_17= 'struct' ( (lv_const_18_0= ruleConstrDeclList ) ) ) )
            int alt45=9;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt45=1;
                }
                break;
            case 68:
                {
                alt45=2;
                }
                break;
            case 69:
                {
                alt45=3;
                }
                break;
            case 70:
                {
                alt45=4;
                }
                break;
            case 71:
                {
                alt45=5;
                }
                break;
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
                {
                alt45=6;
                }
                break;
            case RULE_ID:
                {
                alt45=7;
                }
                break;
            case 12:
                {
                alt45=8;
                }
                break;
            case 77:
                {
                alt45=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalMclrDsl.g:3888:3: ( (lv_is_bool_0_0= 'Bool' ) )
                    {
                    // InternalMclrDsl.g:3888:3: ( (lv_is_bool_0_0= 'Bool' ) )
                    // InternalMclrDsl.g:3889:4: (lv_is_bool_0_0= 'Bool' )
                    {
                    // InternalMclrDsl.g:3889:4: (lv_is_bool_0_0= 'Bool' )
                    // InternalMclrDsl.g:3890:5: lv_is_bool_0_0= 'Bool'
                    {
                    lv_is_bool_0_0=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_is_bool_0_0, grammarAccess.getSortExprTermAccess().getIs_boolBoolKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSortExprTermRule());
                      					}
                      					setWithLastConsumed(current, "is_bool", true, "Bool");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMclrDsl.g:3903:3: ( (lv_is_pos_1_0= 'Pos' ) )
                    {
                    // InternalMclrDsl.g:3903:3: ( (lv_is_pos_1_0= 'Pos' ) )
                    // InternalMclrDsl.g:3904:4: (lv_is_pos_1_0= 'Pos' )
                    {
                    // InternalMclrDsl.g:3904:4: (lv_is_pos_1_0= 'Pos' )
                    // InternalMclrDsl.g:3905:5: lv_is_pos_1_0= 'Pos'
                    {
                    lv_is_pos_1_0=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_is_pos_1_0, grammarAccess.getSortExprTermAccess().getIs_posPosKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSortExprTermRule());
                      					}
                      					setWithLastConsumed(current, "is_pos", true, "Pos");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMclrDsl.g:3918:3: ( (lv_is_nat_2_0= 'Nat' ) )
                    {
                    // InternalMclrDsl.g:3918:3: ( (lv_is_nat_2_0= 'Nat' ) )
                    // InternalMclrDsl.g:3919:4: (lv_is_nat_2_0= 'Nat' )
                    {
                    // InternalMclrDsl.g:3919:4: (lv_is_nat_2_0= 'Nat' )
                    // InternalMclrDsl.g:3920:5: lv_is_nat_2_0= 'Nat'
                    {
                    lv_is_nat_2_0=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_is_nat_2_0, grammarAccess.getSortExprTermAccess().getIs_natNatKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSortExprTermRule());
                      					}
                      					setWithLastConsumed(current, "is_nat", true, "Nat");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMclrDsl.g:3933:3: ( (lv_is_int_3_0= 'Int' ) )
                    {
                    // InternalMclrDsl.g:3933:3: ( (lv_is_int_3_0= 'Int' ) )
                    // InternalMclrDsl.g:3934:4: (lv_is_int_3_0= 'Int' )
                    {
                    // InternalMclrDsl.g:3934:4: (lv_is_int_3_0= 'Int' )
                    // InternalMclrDsl.g:3935:5: lv_is_int_3_0= 'Int'
                    {
                    lv_is_int_3_0=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_is_int_3_0, grammarAccess.getSortExprTermAccess().getIs_intIntKeyword_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSortExprTermRule());
                      					}
                      					setWithLastConsumed(current, "is_int", true, "Int");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalMclrDsl.g:3948:3: ( (lv_is_real_4_0= 'Real' ) )
                    {
                    // InternalMclrDsl.g:3948:3: ( (lv_is_real_4_0= 'Real' ) )
                    // InternalMclrDsl.g:3949:4: (lv_is_real_4_0= 'Real' )
                    {
                    // InternalMclrDsl.g:3949:4: (lv_is_real_4_0= 'Real' )
                    // InternalMclrDsl.g:3950:5: lv_is_real_4_0= 'Real'
                    {
                    lv_is_real_4_0=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_is_real_4_0, grammarAccess.getSortExprTermAccess().getIs_realRealKeyword_4_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSortExprTermRule());
                      					}
                      					setWithLastConsumed(current, "is_real", true, "Real");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalMclrDsl.g:3963:3: ( ( ( (lv_is_list_5_0= 'List' ) ) | ( (lv_set_6_0= 'Set' ) ) | ( (lv_bag_7_0= 'Bag' ) ) | ( (lv_fset_8_0= 'FSet' ) ) | ( (lv_fbag_9_0= 'FBag' ) ) ) otherlv_10= '(' ( (lv_exp_11_0= ruleSortExpr ) ) otherlv_12= ')' )
                    {
                    // InternalMclrDsl.g:3963:3: ( ( ( (lv_is_list_5_0= 'List' ) ) | ( (lv_set_6_0= 'Set' ) ) | ( (lv_bag_7_0= 'Bag' ) ) | ( (lv_fset_8_0= 'FSet' ) ) | ( (lv_fbag_9_0= 'FBag' ) ) ) otherlv_10= '(' ( (lv_exp_11_0= ruleSortExpr ) ) otherlv_12= ')' )
                    // InternalMclrDsl.g:3964:4: ( ( (lv_is_list_5_0= 'List' ) ) | ( (lv_set_6_0= 'Set' ) ) | ( (lv_bag_7_0= 'Bag' ) ) | ( (lv_fset_8_0= 'FSet' ) ) | ( (lv_fbag_9_0= 'FBag' ) ) ) otherlv_10= '(' ( (lv_exp_11_0= ruleSortExpr ) ) otherlv_12= ')'
                    {
                    // InternalMclrDsl.g:3964:4: ( ( (lv_is_list_5_0= 'List' ) ) | ( (lv_set_6_0= 'Set' ) ) | ( (lv_bag_7_0= 'Bag' ) ) | ( (lv_fset_8_0= 'FSet' ) ) | ( (lv_fbag_9_0= 'FBag' ) ) )
                    int alt44=5;
                    switch ( input.LA(1) ) {
                    case 72:
                        {
                        alt44=1;
                        }
                        break;
                    case 73:
                        {
                        alt44=2;
                        }
                        break;
                    case 74:
                        {
                        alt44=3;
                        }
                        break;
                    case 75:
                        {
                        alt44=4;
                        }
                        break;
                    case 76:
                        {
                        alt44=5;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 44, 0, input);

                        throw nvae;
                    }

                    switch (alt44) {
                        case 1 :
                            // InternalMclrDsl.g:3965:5: ( (lv_is_list_5_0= 'List' ) )
                            {
                            // InternalMclrDsl.g:3965:5: ( (lv_is_list_5_0= 'List' ) )
                            // InternalMclrDsl.g:3966:6: (lv_is_list_5_0= 'List' )
                            {
                            // InternalMclrDsl.g:3966:6: (lv_is_list_5_0= 'List' )
                            // InternalMclrDsl.g:3967:7: lv_is_list_5_0= 'List'
                            {
                            lv_is_list_5_0=(Token)match(input,72,FOLLOW_36); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_is_list_5_0, grammarAccess.getSortExprTermAccess().getIs_listListKeyword_5_0_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getSortExprTermRule());
                              							}
                              							setWithLastConsumed(current, "is_list", true, "List");
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalMclrDsl.g:3980:5: ( (lv_set_6_0= 'Set' ) )
                            {
                            // InternalMclrDsl.g:3980:5: ( (lv_set_6_0= 'Set' ) )
                            // InternalMclrDsl.g:3981:6: (lv_set_6_0= 'Set' )
                            {
                            // InternalMclrDsl.g:3981:6: (lv_set_6_0= 'Set' )
                            // InternalMclrDsl.g:3982:7: lv_set_6_0= 'Set'
                            {
                            lv_set_6_0=(Token)match(input,73,FOLLOW_36); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_set_6_0, grammarAccess.getSortExprTermAccess().getSetSetKeyword_5_0_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getSortExprTermRule());
                              							}
                              							setWithLastConsumed(current, "set", true, "Set");
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalMclrDsl.g:3995:5: ( (lv_bag_7_0= 'Bag' ) )
                            {
                            // InternalMclrDsl.g:3995:5: ( (lv_bag_7_0= 'Bag' ) )
                            // InternalMclrDsl.g:3996:6: (lv_bag_7_0= 'Bag' )
                            {
                            // InternalMclrDsl.g:3996:6: (lv_bag_7_0= 'Bag' )
                            // InternalMclrDsl.g:3997:7: lv_bag_7_0= 'Bag'
                            {
                            lv_bag_7_0=(Token)match(input,74,FOLLOW_36); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_bag_7_0, grammarAccess.getSortExprTermAccess().getBagBagKeyword_5_0_2_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getSortExprTermRule());
                              							}
                              							setWithLastConsumed(current, "bag", true, "Bag");
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 4 :
                            // InternalMclrDsl.g:4010:5: ( (lv_fset_8_0= 'FSet' ) )
                            {
                            // InternalMclrDsl.g:4010:5: ( (lv_fset_8_0= 'FSet' ) )
                            // InternalMclrDsl.g:4011:6: (lv_fset_8_0= 'FSet' )
                            {
                            // InternalMclrDsl.g:4011:6: (lv_fset_8_0= 'FSet' )
                            // InternalMclrDsl.g:4012:7: lv_fset_8_0= 'FSet'
                            {
                            lv_fset_8_0=(Token)match(input,75,FOLLOW_36); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_fset_8_0, grammarAccess.getSortExprTermAccess().getFsetFSetKeyword_5_0_3_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getSortExprTermRule());
                              							}
                              							setWithLastConsumed(current, "fset", true, "FSet");
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 5 :
                            // InternalMclrDsl.g:4025:5: ( (lv_fbag_9_0= 'FBag' ) )
                            {
                            // InternalMclrDsl.g:4025:5: ( (lv_fbag_9_0= 'FBag' ) )
                            // InternalMclrDsl.g:4026:6: (lv_fbag_9_0= 'FBag' )
                            {
                            // InternalMclrDsl.g:4026:6: (lv_fbag_9_0= 'FBag' )
                            // InternalMclrDsl.g:4027:7: lv_fbag_9_0= 'FBag'
                            {
                            lv_fbag_9_0=(Token)match(input,76,FOLLOW_36); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_fbag_9_0, grammarAccess.getSortExprTermAccess().getFbagFBagKeyword_5_0_4_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getSortExprTermRule());
                              							}
                              							setWithLastConsumed(current, "fbag", true, "FBag");
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,12,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getSortExprTermAccess().getLeftParenthesisKeyword_5_1());
                      			
                    }
                    // InternalMclrDsl.g:4044:4: ( (lv_exp_11_0= ruleSortExpr ) )
                    // InternalMclrDsl.g:4045:5: (lv_exp_11_0= ruleSortExpr )
                    {
                    // InternalMclrDsl.g:4045:5: (lv_exp_11_0= ruleSortExpr )
                    // InternalMclrDsl.g:4046:6: lv_exp_11_0= ruleSortExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSortExprTermAccess().getExpSortExprParserRuleCall_5_2_0());
                      					
                    }
                    pushFollow(FOLLOW_9);
                    lv_exp_11_0=ruleSortExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSortExprTermRule());
                      						}
                      						set(
                      							current,
                      							"exp",
                      							lv_exp_11_0,
                      							"tuks.mcrl2.dsl.MclrDsl.SortExpr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_12=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getSortExprTermAccess().getRightParenthesisKeyword_5_3());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalMclrDsl.g:4069:3: ( (otherlv_13= RULE_ID ) )
                    {
                    // InternalMclrDsl.g:4069:3: ( (otherlv_13= RULE_ID ) )
                    // InternalMclrDsl.g:4070:4: (otherlv_13= RULE_ID )
                    {
                    // InternalMclrDsl.g:4070:4: (otherlv_13= RULE_ID )
                    // InternalMclrDsl.g:4071:5: otherlv_13= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSortExprTermRule());
                      					}
                      				
                    }
                    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_13, grammarAccess.getSortExprTermAccess().getIdSortNameCrossReference_6_0());
                      				
                    }

                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalMclrDsl.g:4083:3: (otherlv_14= '(' ( (lv_exp_15_0= ruleSortExpr ) ) otherlv_16= ')' )
                    {
                    // InternalMclrDsl.g:4083:3: (otherlv_14= '(' ( (lv_exp_15_0= ruleSortExpr ) ) otherlv_16= ')' )
                    // InternalMclrDsl.g:4084:4: otherlv_14= '(' ( (lv_exp_15_0= ruleSortExpr ) ) otherlv_16= ')'
                    {
                    otherlv_14=(Token)match(input,12,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getSortExprTermAccess().getLeftParenthesisKeyword_7_0());
                      			
                    }
                    // InternalMclrDsl.g:4088:4: ( (lv_exp_15_0= ruleSortExpr ) )
                    // InternalMclrDsl.g:4089:5: (lv_exp_15_0= ruleSortExpr )
                    {
                    // InternalMclrDsl.g:4089:5: (lv_exp_15_0= ruleSortExpr )
                    // InternalMclrDsl.g:4090:6: lv_exp_15_0= ruleSortExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSortExprTermAccess().getExpSortExprParserRuleCall_7_1_0());
                      					
                    }
                    pushFollow(FOLLOW_9);
                    lv_exp_15_0=ruleSortExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSortExprTermRule());
                      						}
                      						set(
                      							current,
                      							"exp",
                      							lv_exp_15_0,
                      							"tuks.mcrl2.dsl.MclrDsl.SortExpr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_16=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getSortExprTermAccess().getRightParenthesisKeyword_7_2());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalMclrDsl.g:4113:3: (otherlv_17= 'struct' ( (lv_const_18_0= ruleConstrDeclList ) ) )
                    {
                    // InternalMclrDsl.g:4113:3: (otherlv_17= 'struct' ( (lv_const_18_0= ruleConstrDeclList ) ) )
                    // InternalMclrDsl.g:4114:4: otherlv_17= 'struct' ( (lv_const_18_0= ruleConstrDeclList ) )
                    {
                    otherlv_17=(Token)match(input,77,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getSortExprTermAccess().getStructKeyword_8_0());
                      			
                    }
                    // InternalMclrDsl.g:4118:4: ( (lv_const_18_0= ruleConstrDeclList ) )
                    // InternalMclrDsl.g:4119:5: (lv_const_18_0= ruleConstrDeclList )
                    {
                    // InternalMclrDsl.g:4119:5: (lv_const_18_0= ruleConstrDeclList )
                    // InternalMclrDsl.g:4120:6: lv_const_18_0= ruleConstrDeclList
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSortExprTermAccess().getConstConstrDeclListParserRuleCall_8_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_const_18_0=ruleConstrDeclList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSortExprTermRule());
                      						}
                      						set(
                      							current,
                      							"const",
                      							lv_const_18_0,
                      							"tuks.mcrl2.dsl.MclrDsl.ConstrDeclList");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSortExprTerm"


    // $ANTLR start "entryRuleSortDecl"
    // InternalMclrDsl.g:4142:1: entryRuleSortDecl returns [EObject current=null] : iv_ruleSortDecl= ruleSortDecl EOF ;
    public final EObject entryRuleSortDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSortDecl = null;


        try {
            // InternalMclrDsl.g:4142:49: (iv_ruleSortDecl= ruleSortDecl EOF )
            // InternalMclrDsl.g:4143:2: iv_ruleSortDecl= ruleSortDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSortDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSortDecl=ruleSortDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSortDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSortDecl"


    // $ANTLR start "ruleSortDecl"
    // InternalMclrDsl.g:4149:1: ruleSortDecl returns [EObject current=null] : ( ( (lv_id_0_0= ruleSortName ) ) otherlv_1= '=' ( (lv_sort_2_0= ruleSortExpr ) ) otherlv_3= ';' ) ;
    public final EObject ruleSortDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_id_0_0 = null;

        EObject lv_sort_2_0 = null;



        	enterRule();

        try {
            // InternalMclrDsl.g:4155:2: ( ( ( (lv_id_0_0= ruleSortName ) ) otherlv_1= '=' ( (lv_sort_2_0= ruleSortExpr ) ) otherlv_3= ';' ) )
            // InternalMclrDsl.g:4156:2: ( ( (lv_id_0_0= ruleSortName ) ) otherlv_1= '=' ( (lv_sort_2_0= ruleSortExpr ) ) otherlv_3= ';' )
            {
            // InternalMclrDsl.g:4156:2: ( ( (lv_id_0_0= ruleSortName ) ) otherlv_1= '=' ( (lv_sort_2_0= ruleSortExpr ) ) otherlv_3= ';' )
            // InternalMclrDsl.g:4157:3: ( (lv_id_0_0= ruleSortName ) ) otherlv_1= '=' ( (lv_sort_2_0= ruleSortExpr ) ) otherlv_3= ';'
            {
            // InternalMclrDsl.g:4157:3: ( (lv_id_0_0= ruleSortName ) )
            // InternalMclrDsl.g:4158:4: (lv_id_0_0= ruleSortName )
            {
            // InternalMclrDsl.g:4158:4: (lv_id_0_0= ruleSortName )
            // InternalMclrDsl.g:4159:5: lv_id_0_0= ruleSortName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSortDeclAccess().getIdSortNameParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_id_0_0=ruleSortName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSortDeclRule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_0_0,
              						"tuks.mcrl2.dsl.MclrDsl.SortName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSortDeclAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalMclrDsl.g:4180:3: ( (lv_sort_2_0= ruleSortExpr ) )
            // InternalMclrDsl.g:4181:4: (lv_sort_2_0= ruleSortExpr )
            {
            // InternalMclrDsl.g:4181:4: (lv_sort_2_0= ruleSortExpr )
            // InternalMclrDsl.g:4182:5: lv_sort_2_0= ruleSortExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSortDeclAccess().getSortSortExprParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_sort_2_0=ruleSortExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSortDeclRule());
              					}
              					set(
              						current,
              						"sort",
              						lv_sort_2_0,
              						"tuks.mcrl2.dsl.MclrDsl.SortExpr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getSortDeclAccess().getSemicolonKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSortDecl"


    // $ANTLR start "entryRuleSortSpec"
    // InternalMclrDsl.g:4207:1: entryRuleSortSpec returns [EObject current=null] : iv_ruleSortSpec= ruleSortSpec EOF ;
    public final EObject entryRuleSortSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSortSpec = null;


        try {
            // InternalMclrDsl.g:4207:49: (iv_ruleSortSpec= ruleSortSpec EOF )
            // InternalMclrDsl.g:4208:2: iv_ruleSortSpec= ruleSortSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSortSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSortSpec=ruleSortSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSortSpec; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSortSpec"


    // $ANTLR start "ruleSortSpec"
    // InternalMclrDsl.g:4214:1: ruleSortSpec returns [EObject current=null] : (otherlv_0= 'sort' ( (lv_sorts_1_0= ruleSortDecl ) )+ ) ;
    public final EObject ruleSortSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_sorts_1_0 = null;



        	enterRule();

        try {
            // InternalMclrDsl.g:4220:2: ( (otherlv_0= 'sort' ( (lv_sorts_1_0= ruleSortDecl ) )+ ) )
            // InternalMclrDsl.g:4221:2: (otherlv_0= 'sort' ( (lv_sorts_1_0= ruleSortDecl ) )+ )
            {
            // InternalMclrDsl.g:4221:2: (otherlv_0= 'sort' ( (lv_sorts_1_0= ruleSortDecl ) )+ )
            // InternalMclrDsl.g:4222:3: otherlv_0= 'sort' ( (lv_sorts_1_0= ruleSortDecl ) )+
            {
            otherlv_0=(Token)match(input,78,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSortSpecAccess().getSortKeyword_0());
              		
            }
            // InternalMclrDsl.g:4226:3: ( (lv_sorts_1_0= ruleSortDecl ) )+
            int cnt46=0;
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_ID) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalMclrDsl.g:4227:4: (lv_sorts_1_0= ruleSortDecl )
            	    {
            	    // InternalMclrDsl.g:4227:4: (lv_sorts_1_0= ruleSortDecl )
            	    // InternalMclrDsl.g:4228:5: lv_sorts_1_0= ruleSortDecl
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSortSpecAccess().getSortsSortDeclParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_15);
            	    lv_sorts_1_0=ruleSortDecl();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSortSpecRule());
            	      					}
            	      					add(
            	      						current,
            	      						"sorts",
            	      						lv_sorts_1_0,
            	      						"tuks.mcrl2.dsl.MclrDsl.SortDecl");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt46 >= 1 ) break loop46;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(46, input);
                        throw eee;
                }
                cnt46++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSortSpec"


    // $ANTLR start "entryRuleGlobVarSpec"
    // InternalMclrDsl.g:4249:1: entryRuleGlobVarSpec returns [EObject current=null] : iv_ruleGlobVarSpec= ruleGlobVarSpec EOF ;
    public final EObject entryRuleGlobVarSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobVarSpec = null;


        try {
            // InternalMclrDsl.g:4249:52: (iv_ruleGlobVarSpec= ruleGlobVarSpec EOF )
            // InternalMclrDsl.g:4250:2: iv_ruleGlobVarSpec= ruleGlobVarSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGlobVarSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGlobVarSpec=ruleGlobVarSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGlobVarSpec; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGlobVarSpec"


    // $ANTLR start "ruleGlobVarSpec"
    // InternalMclrDsl.g:4256:1: ruleGlobVarSpec returns [EObject current=null] : (otherlv_0= 'glob' ( ( (lv_vars_list_1_0= ruleVarsDeclList ) ) otherlv_2= ';' )+ ) ;
    public final EObject ruleGlobVarSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_vars_list_1_0 = null;



        	enterRule();

        try {
            // InternalMclrDsl.g:4262:2: ( (otherlv_0= 'glob' ( ( (lv_vars_list_1_0= ruleVarsDeclList ) ) otherlv_2= ';' )+ ) )
            // InternalMclrDsl.g:4263:2: (otherlv_0= 'glob' ( ( (lv_vars_list_1_0= ruleVarsDeclList ) ) otherlv_2= ';' )+ )
            {
            // InternalMclrDsl.g:4263:2: (otherlv_0= 'glob' ( ( (lv_vars_list_1_0= ruleVarsDeclList ) ) otherlv_2= ';' )+ )
            // InternalMclrDsl.g:4264:3: otherlv_0= 'glob' ( ( (lv_vars_list_1_0= ruleVarsDeclList ) ) otherlv_2= ';' )+
            {
            otherlv_0=(Token)match(input,79,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGlobVarSpecAccess().getGlobKeyword_0());
              		
            }
            // InternalMclrDsl.g:4268:3: ( ( (lv_vars_list_1_0= ruleVarsDeclList ) ) otherlv_2= ';' )+
            int cnt47=0;
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_ID) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalMclrDsl.g:4269:4: ( (lv_vars_list_1_0= ruleVarsDeclList ) ) otherlv_2= ';'
            	    {
            	    // InternalMclrDsl.g:4269:4: ( (lv_vars_list_1_0= ruleVarsDeclList ) )
            	    // InternalMclrDsl.g:4270:5: (lv_vars_list_1_0= ruleVarsDeclList )
            	    {
            	    // InternalMclrDsl.g:4270:5: (lv_vars_list_1_0= ruleVarsDeclList )
            	    // InternalMclrDsl.g:4271:6: lv_vars_list_1_0= ruleVarsDeclList
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getGlobVarSpecAccess().getVars_listVarsDeclListParserRuleCall_1_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_vars_list_1_0=ruleVarsDeclList();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getGlobVarSpecRule());
            	      						}
            	      						add(
            	      							current,
            	      							"vars_list",
            	      							lv_vars_list_1_0,
            	      							"tuks.mcrl2.dsl.MclrDsl.VarsDeclList");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    otherlv_2=(Token)match(input,18,FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getGlobVarSpecAccess().getSemicolonKeyword_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt47 >= 1 ) break loop47;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(47, input);
                        throw eee;
                }
                cnt47++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGlobVarSpec"


    // $ANTLR start "entryRuleVarName"
    // InternalMclrDsl.g:4297:1: entryRuleVarName returns [EObject current=null] : iv_ruleVarName= ruleVarName EOF ;
    public final EObject entryRuleVarName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarName = null;


        try {
            // InternalMclrDsl.g:4297:48: (iv_ruleVarName= ruleVarName EOF )
            // InternalMclrDsl.g:4298:2: iv_ruleVarName= ruleVarName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVarName=ruleVarName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarName; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMclrDsl.g:4304:1: ruleVarName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVarName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMclrDsl.g:4310:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMclrDsl.g:4311:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMclrDsl.g:4311:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMclrDsl.g:4312:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMclrDsl.g:4312:3: (lv_name_0_0= RULE_ID )
            // InternalMclrDsl.g:4313:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getVarNameAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleVarName"


    // $ANTLR start "entryRuleVarIdList"
    // InternalMclrDsl.g:4332:1: entryRuleVarIdList returns [EObject current=null] : iv_ruleVarIdList= ruleVarIdList EOF ;
    public final EObject entryRuleVarIdList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarIdList = null;


        try {
            // InternalMclrDsl.g:4332:50: (iv_ruleVarIdList= ruleVarIdList EOF )
            // InternalMclrDsl.g:4333:2: iv_ruleVarIdList= ruleVarIdList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarIdListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVarIdList=ruleVarIdList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarIdList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVarIdList"


    // $ANTLR start "ruleVarIdList"
    // InternalMclrDsl.g:4339:1: ruleVarIdList returns [EObject current=null] : ( ( (lv_id_list_0_0= ruleVarName ) ) (otherlv_1= ',' ( (lv_id_list_2_0= ruleVarName ) ) )* ) ;
    public final EObject ruleVarIdList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_id_list_0_0 = null;

        EObject lv_id_list_2_0 = null;



        	enterRule();

        try {
            // InternalMclrDsl.g:4345:2: ( ( ( (lv_id_list_0_0= ruleVarName ) ) (otherlv_1= ',' ( (lv_id_list_2_0= ruleVarName ) ) )* ) )
            // InternalMclrDsl.g:4346:2: ( ( (lv_id_list_0_0= ruleVarName ) ) (otherlv_1= ',' ( (lv_id_list_2_0= ruleVarName ) ) )* )
            {
            // InternalMclrDsl.g:4346:2: ( ( (lv_id_list_0_0= ruleVarName ) ) (otherlv_1= ',' ( (lv_id_list_2_0= ruleVarName ) ) )* )
            // InternalMclrDsl.g:4347:3: ( (lv_id_list_0_0= ruleVarName ) ) (otherlv_1= ',' ( (lv_id_list_2_0= ruleVarName ) ) )*
            {
            // InternalMclrDsl.g:4347:3: ( (lv_id_list_0_0= ruleVarName ) )
            // InternalMclrDsl.g:4348:4: (lv_id_list_0_0= ruleVarName )
            {
            // InternalMclrDsl.g:4348:4: (lv_id_list_0_0= ruleVarName )
            // InternalMclrDsl.g:4349:5: lv_id_list_0_0= ruleVarName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVarIdListAccess().getId_listVarNameParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_id_list_0_0=ruleVarName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVarIdListRule());
              					}
              					add(
              						current,
              						"id_list",
              						lv_id_list_0_0,
              						"tuks.mcrl2.dsl.MclrDsl.VarName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMclrDsl.g:4366:3: (otherlv_1= ',' ( (lv_id_list_2_0= ruleVarName ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==11) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalMclrDsl.g:4367:4: otherlv_1= ',' ( (lv_id_list_2_0= ruleVarName ) )
            	    {
            	    otherlv_1=(Token)match(input,11,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getVarIdListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalMclrDsl.g:4371:4: ( (lv_id_list_2_0= ruleVarName ) )
            	    // InternalMclrDsl.g:4372:5: (lv_id_list_2_0= ruleVarName )
            	    {
            	    // InternalMclrDsl.g:4372:5: (lv_id_list_2_0= ruleVarName )
            	    // InternalMclrDsl.g:4373:6: lv_id_list_2_0= ruleVarName
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getVarIdListAccess().getId_listVarNameParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_id_list_2_0=ruleVarName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getVarIdListRule());
            	      						}
            	      						add(
            	      							current,
            	      							"id_list",
            	      							lv_id_list_2_0,
            	      							"tuks.mcrl2.dsl.MclrDsl.VarName");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleVarIdList"


    // $ANTLR start "entryRuleVarsDecl"
    // InternalMclrDsl.g:4395:1: entryRuleVarsDecl returns [EObject current=null] : iv_ruleVarsDecl= ruleVarsDecl EOF ;
    public final EObject entryRuleVarsDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarsDecl = null;


        try {
            // InternalMclrDsl.g:4395:49: (iv_ruleVarsDecl= ruleVarsDecl EOF )
            // InternalMclrDsl.g:4396:2: iv_ruleVarsDecl= ruleVarsDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarsDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVarsDecl=ruleVarsDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarsDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVarsDecl"


    // $ANTLR start "ruleVarsDecl"
    // InternalMclrDsl.g:4402:1: ruleVarsDecl returns [EObject current=null] : ( ( (lv_id_0_0= ruleVarIdList ) ) otherlv_1= ':' ( (lv_sort_2_0= ruleSortExpr ) ) ) ;
    public final EObject ruleVarsDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_id_0_0 = null;

        EObject lv_sort_2_0 = null;



        	enterRule();

        try {
            // InternalMclrDsl.g:4408:2: ( ( ( (lv_id_0_0= ruleVarIdList ) ) otherlv_1= ':' ( (lv_sort_2_0= ruleSortExpr ) ) ) )
            // InternalMclrDsl.g:4409:2: ( ( (lv_id_0_0= ruleVarIdList ) ) otherlv_1= ':' ( (lv_sort_2_0= ruleSortExpr ) ) )
            {
            // InternalMclrDsl.g:4409:2: ( ( (lv_id_0_0= ruleVarIdList ) ) otherlv_1= ':' ( (lv_sort_2_0= ruleSortExpr ) ) )
            // InternalMclrDsl.g:4410:3: ( (lv_id_0_0= ruleVarIdList ) ) otherlv_1= ':' ( (lv_sort_2_0= ruleSortExpr ) )
            {
            // InternalMclrDsl.g:4410:3: ( (lv_id_0_0= ruleVarIdList ) )
            // InternalMclrDsl.g:4411:4: (lv_id_0_0= ruleVarIdList )
            {
            // InternalMclrDsl.g:4411:4: (lv_id_0_0= ruleVarIdList )
            // InternalMclrDsl.g:4412:5: lv_id_0_0= ruleVarIdList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVarsDeclAccess().getIdVarIdListParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_id_0_0=ruleVarIdList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVarsDeclRule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_0_0,
              						"tuks.mcrl2.dsl.MclrDsl.VarIdList");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVarsDeclAccess().getColonKeyword_1());
              		
            }
            // InternalMclrDsl.g:4433:3: ( (lv_sort_2_0= ruleSortExpr ) )
            // InternalMclrDsl.g:4434:4: (lv_sort_2_0= ruleSortExpr )
            {
            // InternalMclrDsl.g:4434:4: (lv_sort_2_0= ruleSortExpr )
            // InternalMclrDsl.g:4435:5: lv_sort_2_0= ruleSortExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVarsDeclAccess().getSortSortExprParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_sort_2_0=ruleSortExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVarsDeclRule());
              					}
              					set(
              						current,
              						"sort",
              						lv_sort_2_0,
              						"tuks.mcrl2.dsl.MclrDsl.SortExpr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleVarsDecl"


    // $ANTLR start "entryRuleVarsDeclList"
    // InternalMclrDsl.g:4456:1: entryRuleVarsDeclList returns [EObject current=null] : iv_ruleVarsDeclList= ruleVarsDeclList EOF ;
    public final EObject entryRuleVarsDeclList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarsDeclList = null;


        try {
            // InternalMclrDsl.g:4456:53: (iv_ruleVarsDeclList= ruleVarsDeclList EOF )
            // InternalMclrDsl.g:4457:2: iv_ruleVarsDeclList= ruleVarsDeclList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarsDeclListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVarsDeclList=ruleVarsDeclList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarsDeclList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVarsDeclList"


    // $ANTLR start "ruleVarsDeclList"
    // InternalMclrDsl.g:4463:1: ruleVarsDeclList returns [EObject current=null] : ( ( (lv_varialbes_0_0= ruleVarsDecl ) ) (otherlv_1= ',' ( (lv_varialbes_2_0= ruleVarsDecl ) ) )* ) ;
    public final EObject ruleVarsDeclList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_varialbes_0_0 = null;

        EObject lv_varialbes_2_0 = null;



        	enterRule();

        try {
            // InternalMclrDsl.g:4469:2: ( ( ( (lv_varialbes_0_0= ruleVarsDecl ) ) (otherlv_1= ',' ( (lv_varialbes_2_0= ruleVarsDecl ) ) )* ) )
            // InternalMclrDsl.g:4470:2: ( ( (lv_varialbes_0_0= ruleVarsDecl ) ) (otherlv_1= ',' ( (lv_varialbes_2_0= ruleVarsDecl ) ) )* )
            {
            // InternalMclrDsl.g:4470:2: ( ( (lv_varialbes_0_0= ruleVarsDecl ) ) (otherlv_1= ',' ( (lv_varialbes_2_0= ruleVarsDecl ) ) )* )
            // InternalMclrDsl.g:4471:3: ( (lv_varialbes_0_0= ruleVarsDecl ) ) (otherlv_1= ',' ( (lv_varialbes_2_0= ruleVarsDecl ) ) )*
            {
            // InternalMclrDsl.g:4471:3: ( (lv_varialbes_0_0= ruleVarsDecl ) )
            // InternalMclrDsl.g:4472:4: (lv_varialbes_0_0= ruleVarsDecl )
            {
            // InternalMclrDsl.g:4472:4: (lv_varialbes_0_0= ruleVarsDecl )
            // InternalMclrDsl.g:4473:5: lv_varialbes_0_0= ruleVarsDecl
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVarsDeclListAccess().getVarialbesVarsDeclParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_varialbes_0_0=ruleVarsDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVarsDeclListRule());
              					}
              					add(
              						current,
              						"varialbes",
              						lv_varialbes_0_0,
              						"tuks.mcrl2.dsl.MclrDsl.VarsDecl");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMclrDsl.g:4490:3: (otherlv_1= ',' ( (lv_varialbes_2_0= ruleVarsDecl ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==11) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalMclrDsl.g:4491:4: otherlv_1= ',' ( (lv_varialbes_2_0= ruleVarsDecl ) )
            	    {
            	    otherlv_1=(Token)match(input,11,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getVarsDeclListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalMclrDsl.g:4495:4: ( (lv_varialbes_2_0= ruleVarsDecl ) )
            	    // InternalMclrDsl.g:4496:5: (lv_varialbes_2_0= ruleVarsDecl )
            	    {
            	    // InternalMclrDsl.g:4496:5: (lv_varialbes_2_0= ruleVarsDecl )
            	    // InternalMclrDsl.g:4497:6: lv_varialbes_2_0= ruleVarsDecl
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getVarsDeclListAccess().getVarialbesVarsDeclParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_varialbes_2_0=ruleVarsDecl();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getVarsDeclListRule());
            	      						}
            	      						add(
            	      							current,
            	      							"varialbes",
            	      							lv_varialbes_2_0,
            	      							"tuks.mcrl2.dsl.MclrDsl.VarsDecl");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleVarsDeclList"


    // $ANTLR start "entryRuleVarSpec"
    // InternalMclrDsl.g:4519:1: entryRuleVarSpec returns [EObject current=null] : iv_ruleVarSpec= ruleVarSpec EOF ;
    public final EObject entryRuleVarSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarSpec = null;


        try {
            // InternalMclrDsl.g:4519:48: (iv_ruleVarSpec= ruleVarSpec EOF )
            // InternalMclrDsl.g:4520:2: iv_ruleVarSpec= ruleVarSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVarSpec=ruleVarSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarSpec; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVarSpec"


    // $ANTLR start "ruleVarSpec"
    // InternalMclrDsl.g:4526:1: ruleVarSpec returns [EObject current=null] : (otherlv_0= 'var' ( ( (lv_list_1_0= ruleVarsDeclList ) ) otherlv_2= ';' )+ ) ;
    public final EObject ruleVarSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_list_1_0 = null;



        	enterRule();

        try {
            // InternalMclrDsl.g:4532:2: ( (otherlv_0= 'var' ( ( (lv_list_1_0= ruleVarsDeclList ) ) otherlv_2= ';' )+ ) )
            // InternalMclrDsl.g:4533:2: (otherlv_0= 'var' ( ( (lv_list_1_0= ruleVarsDeclList ) ) otherlv_2= ';' )+ )
            {
            // InternalMclrDsl.g:4533:2: (otherlv_0= 'var' ( ( (lv_list_1_0= ruleVarsDeclList ) ) otherlv_2= ';' )+ )
            // InternalMclrDsl.g:4534:3: otherlv_0= 'var' ( ( (lv_list_1_0= ruleVarsDeclList ) ) otherlv_2= ';' )+
            {
            otherlv_0=(Token)match(input,80,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVarSpecAccess().getVarKeyword_0());
              		
            }
            // InternalMclrDsl.g:4538:3: ( ( (lv_list_1_0= ruleVarsDeclList ) ) otherlv_2= ';' )+
            int cnt50=0;
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==RULE_ID) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalMclrDsl.g:4539:4: ( (lv_list_1_0= ruleVarsDeclList ) ) otherlv_2= ';'
            	    {
            	    // InternalMclrDsl.g:4539:4: ( (lv_list_1_0= ruleVarsDeclList ) )
            	    // InternalMclrDsl.g:4540:5: (lv_list_1_0= ruleVarsDeclList )
            	    {
            	    // InternalMclrDsl.g:4540:5: (lv_list_1_0= ruleVarsDeclList )
            	    // InternalMclrDsl.g:4541:6: lv_list_1_0= ruleVarsDeclList
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getVarSpecAccess().getListVarsDeclListParserRuleCall_1_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_list_1_0=ruleVarsDeclList();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getVarSpecRule());
            	      						}
            	      						add(
            	      							current,
            	      							"list",
            	      							lv_list_1_0,
            	      							"tuks.mcrl2.dsl.MclrDsl.VarsDeclList");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    otherlv_2=(Token)match(input,18,FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getVarSpecAccess().getSemicolonKeyword_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt50 >= 1 ) break loop50;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(50, input);
                        throw eee;
                }
                cnt50++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleVarSpec"


    // $ANTLR start "entryRulemCRL2SpecElt"
    // InternalMclrDsl.g:4567:1: entryRulemCRL2SpecElt returns [EObject current=null] : iv_rulemCRL2SpecElt= rulemCRL2SpecElt EOF ;
    public final EObject entryRulemCRL2SpecElt() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemCRL2SpecElt = null;


        try {
            // InternalMclrDsl.g:4567:53: (iv_rulemCRL2SpecElt= rulemCRL2SpecElt EOF )
            // InternalMclrDsl.g:4568:2: iv_rulemCRL2SpecElt= rulemCRL2SpecElt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMCRL2SpecEltRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulemCRL2SpecElt=rulemCRL2SpecElt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulemCRL2SpecElt; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulemCRL2SpecElt"


    // $ANTLR start "rulemCRL2SpecElt"
    // InternalMclrDsl.g:4574:1: rulemCRL2SpecElt returns [EObject current=null] : ( ( (lv_sort_0_0= ruleSortSpec ) ) | ( (lv_const_1_0= ruleConsSpec ) ) | ( (lv_map_2_0= ruleMapSpec ) ) | ( (lv_eqn_3_0= ruleEqnSpec ) ) | ( (lv_blobal_4_0= ruleGlobVarSpec ) ) | ( (lv_act_5_0= ruleActSpec ) ) | ( (lv_proc_6_0= ruleProcSpec ) ) ) ;
    public final EObject rulemCRL2SpecElt() throws RecognitionException {
        EObject current = null;

        EObject lv_sort_0_0 = null;

        EObject lv_const_1_0 = null;

        EObject lv_map_2_0 = null;

        EObject lv_eqn_3_0 = null;

        EObject lv_blobal_4_0 = null;

        EObject lv_act_5_0 = null;

        EObject lv_proc_6_0 = null;



        	enterRule();

        try {
            // InternalMclrDsl.g:4580:2: ( ( ( (lv_sort_0_0= ruleSortSpec ) ) | ( (lv_const_1_0= ruleConsSpec ) ) | ( (lv_map_2_0= ruleMapSpec ) ) | ( (lv_eqn_3_0= ruleEqnSpec ) ) | ( (lv_blobal_4_0= ruleGlobVarSpec ) ) | ( (lv_act_5_0= ruleActSpec ) ) | ( (lv_proc_6_0= ruleProcSpec ) ) ) )
            // InternalMclrDsl.g:4581:2: ( ( (lv_sort_0_0= ruleSortSpec ) ) | ( (lv_const_1_0= ruleConsSpec ) ) | ( (lv_map_2_0= ruleMapSpec ) ) | ( (lv_eqn_3_0= ruleEqnSpec ) ) | ( (lv_blobal_4_0= ruleGlobVarSpec ) ) | ( (lv_act_5_0= ruleActSpec ) ) | ( (lv_proc_6_0= ruleProcSpec ) ) )
            {
            // InternalMclrDsl.g:4581:2: ( ( (lv_sort_0_0= ruleSortSpec ) ) | ( (lv_const_1_0= ruleConsSpec ) ) | ( (lv_map_2_0= ruleMapSpec ) ) | ( (lv_eqn_3_0= ruleEqnSpec ) ) | ( (lv_blobal_4_0= ruleGlobVarSpec ) ) | ( (lv_act_5_0= ruleActSpec ) ) | ( (lv_proc_6_0= ruleProcSpec ) ) )
            int alt51=7;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt51=1;
                }
                break;
            case 22:
                {
                alt51=2;
                }
                break;
            case 54:
                {
                alt51=3;
                }
                break;
            case 53:
            case 80:
                {
                alt51=4;
                }
                break;
            case 79:
                {
                alt51=5;
                }
                break;
            case 19:
                {
                alt51=6;
                }
                break;
            case 55:
                {
                alt51=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // InternalMclrDsl.g:4582:3: ( (lv_sort_0_0= ruleSortSpec ) )
                    {
                    // InternalMclrDsl.g:4582:3: ( (lv_sort_0_0= ruleSortSpec ) )
                    // InternalMclrDsl.g:4583:4: (lv_sort_0_0= ruleSortSpec )
                    {
                    // InternalMclrDsl.g:4583:4: (lv_sort_0_0= ruleSortSpec )
                    // InternalMclrDsl.g:4584:5: lv_sort_0_0= ruleSortSpec
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getMCRL2SpecEltAccess().getSortSortSpecParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_sort_0_0=ruleSortSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getMCRL2SpecEltRule());
                      					}
                      					set(
                      						current,
                      						"sort",
                      						lv_sort_0_0,
                      						"tuks.mcrl2.dsl.MclrDsl.SortSpec");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMclrDsl.g:4602:3: ( (lv_const_1_0= ruleConsSpec ) )
                    {
                    // InternalMclrDsl.g:4602:3: ( (lv_const_1_0= ruleConsSpec ) )
                    // InternalMclrDsl.g:4603:4: (lv_const_1_0= ruleConsSpec )
                    {
                    // InternalMclrDsl.g:4603:4: (lv_const_1_0= ruleConsSpec )
                    // InternalMclrDsl.g:4604:5: lv_const_1_0= ruleConsSpec
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getMCRL2SpecEltAccess().getConstConsSpecParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_const_1_0=ruleConsSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getMCRL2SpecEltRule());
                      					}
                      					set(
                      						current,
                      						"const",
                      						lv_const_1_0,
                      						"tuks.mcrl2.dsl.MclrDsl.ConsSpec");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMclrDsl.g:4622:3: ( (lv_map_2_0= ruleMapSpec ) )
                    {
                    // InternalMclrDsl.g:4622:3: ( (lv_map_2_0= ruleMapSpec ) )
                    // InternalMclrDsl.g:4623:4: (lv_map_2_0= ruleMapSpec )
                    {
                    // InternalMclrDsl.g:4623:4: (lv_map_2_0= ruleMapSpec )
                    // InternalMclrDsl.g:4624:5: lv_map_2_0= ruleMapSpec
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getMCRL2SpecEltAccess().getMapMapSpecParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_map_2_0=ruleMapSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getMCRL2SpecEltRule());
                      					}
                      					set(
                      						current,
                      						"map",
                      						lv_map_2_0,
                      						"tuks.mcrl2.dsl.MclrDsl.MapSpec");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMclrDsl.g:4642:3: ( (lv_eqn_3_0= ruleEqnSpec ) )
                    {
                    // InternalMclrDsl.g:4642:3: ( (lv_eqn_3_0= ruleEqnSpec ) )
                    // InternalMclrDsl.g:4643:4: (lv_eqn_3_0= ruleEqnSpec )
                    {
                    // InternalMclrDsl.g:4643:4: (lv_eqn_3_0= ruleEqnSpec )
                    // InternalMclrDsl.g:4644:5: lv_eqn_3_0= ruleEqnSpec
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getMCRL2SpecEltAccess().getEqnEqnSpecParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_eqn_3_0=ruleEqnSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getMCRL2SpecEltRule());
                      					}
                      					set(
                      						current,
                      						"eqn",
                      						lv_eqn_3_0,
                      						"tuks.mcrl2.dsl.MclrDsl.EqnSpec");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalMclrDsl.g:4662:3: ( (lv_blobal_4_0= ruleGlobVarSpec ) )
                    {
                    // InternalMclrDsl.g:4662:3: ( (lv_blobal_4_0= ruleGlobVarSpec ) )
                    // InternalMclrDsl.g:4663:4: (lv_blobal_4_0= ruleGlobVarSpec )
                    {
                    // InternalMclrDsl.g:4663:4: (lv_blobal_4_0= ruleGlobVarSpec )
                    // InternalMclrDsl.g:4664:5: lv_blobal_4_0= ruleGlobVarSpec
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getMCRL2SpecEltAccess().getBlobalGlobVarSpecParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_blobal_4_0=ruleGlobVarSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getMCRL2SpecEltRule());
                      					}
                      					set(
                      						current,
                      						"blobal",
                      						lv_blobal_4_0,
                      						"tuks.mcrl2.dsl.MclrDsl.GlobVarSpec");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalMclrDsl.g:4682:3: ( (lv_act_5_0= ruleActSpec ) )
                    {
                    // InternalMclrDsl.g:4682:3: ( (lv_act_5_0= ruleActSpec ) )
                    // InternalMclrDsl.g:4683:4: (lv_act_5_0= ruleActSpec )
                    {
                    // InternalMclrDsl.g:4683:4: (lv_act_5_0= ruleActSpec )
                    // InternalMclrDsl.g:4684:5: lv_act_5_0= ruleActSpec
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getMCRL2SpecEltAccess().getActActSpecParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_act_5_0=ruleActSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getMCRL2SpecEltRule());
                      					}
                      					set(
                      						current,
                      						"act",
                      						lv_act_5_0,
                      						"tuks.mcrl2.dsl.MclrDsl.ActSpec");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalMclrDsl.g:4702:3: ( (lv_proc_6_0= ruleProcSpec ) )
                    {
                    // InternalMclrDsl.g:4702:3: ( (lv_proc_6_0= ruleProcSpec ) )
                    // InternalMclrDsl.g:4703:4: (lv_proc_6_0= ruleProcSpec )
                    {
                    // InternalMclrDsl.g:4703:4: (lv_proc_6_0= ruleProcSpec )
                    // InternalMclrDsl.g:4704:5: lv_proc_6_0= ruleProcSpec
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getMCRL2SpecEltAccess().getProcProcSpecParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_proc_6_0=ruleProcSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getMCRL2SpecEltRule());
                      					}
                      					set(
                      						current,
                      						"proc",
                      						lv_proc_6_0,
                      						"tuks.mcrl2.dsl.MclrDsl.ProcSpec");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulemCRL2SpecElt"


    // $ANTLR start "entryRuleInit"
    // InternalMclrDsl.g:4725:1: entryRuleInit returns [EObject current=null] : iv_ruleInit= ruleInit EOF ;
    public final EObject entryRuleInit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInit = null;


        try {
            // InternalMclrDsl.g:4725:45: (iv_ruleInit= ruleInit EOF )
            // InternalMclrDsl.g:4726:2: iv_ruleInit= ruleInit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInitRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInit=ruleInit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInit; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInit"


    // $ANTLR start "ruleInit"
    // InternalMclrDsl.g:4732:1: ruleInit returns [EObject current=null] : (otherlv_0= 'init' ( (lv_proc_1_0= ruleProcExpr ) ) otherlv_2= ';' ) ;
    public final EObject ruleInit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_proc_1_0 = null;



        	enterRule();

        try {
            // InternalMclrDsl.g:4738:2: ( (otherlv_0= 'init' ( (lv_proc_1_0= ruleProcExpr ) ) otherlv_2= ';' ) )
            // InternalMclrDsl.g:4739:2: (otherlv_0= 'init' ( (lv_proc_1_0= ruleProcExpr ) ) otherlv_2= ';' )
            {
            // InternalMclrDsl.g:4739:2: (otherlv_0= 'init' ( (lv_proc_1_0= ruleProcExpr ) ) otherlv_2= ';' )
            // InternalMclrDsl.g:4740:3: otherlv_0= 'init' ( (lv_proc_1_0= ruleProcExpr ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,81,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInitAccess().getInitKeyword_0());
              		
            }
            // InternalMclrDsl.g:4744:3: ( (lv_proc_1_0= ruleProcExpr ) )
            // InternalMclrDsl.g:4745:4: (lv_proc_1_0= ruleProcExpr )
            {
            // InternalMclrDsl.g:4745:4: (lv_proc_1_0= ruleProcExpr )
            // InternalMclrDsl.g:4746:5: lv_proc_1_0= ruleProcExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInitAccess().getProcProcExprParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_proc_1_0=ruleProcExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getInitRule());
              					}
              					set(
              						current,
              						"proc",
              						lv_proc_1_0,
              						"tuks.mcrl2.dsl.MclrDsl.ProcExpr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getInitAccess().getSemicolonKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleInit"

    // $ANTLR start synpred1_InternalMclrDsl
    public final void synpred1_InternalMclrDsl_fragment() throws RecognitionException {   
        // InternalMclrDsl.g:80:4: ( 'sort' | 'cons' | 'map' | 'var' | 'eqn' | 'glob' | 'act' | 'proc' )
        // InternalMclrDsl.g:
        {
        if ( input.LA(1)==19||input.LA(1)==22||(input.LA(1)>=53 && input.LA(1)<=55)||(input.LA(1)>=78 && input.LA(1)<=80) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }
    }
    // $ANTLR end synpred1_InternalMclrDsl

    // $ANTLR start synpred2_InternalMclrDsl
    public final void synpred2_InternalMclrDsl_fragment() throws RecognitionException {   
        // InternalMclrDsl.g:100:4: ( 'init' )
        // InternalMclrDsl.g:100:5: 'init'
        {
        match(input,81,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalMclrDsl

    // $ANTLR start synpred3_InternalMclrDsl
    public final void synpred3_InternalMclrDsl_fragment() throws RecognitionException {   
        // InternalMclrDsl.g:120:4: ( 'sort' | 'cons' | 'map' | 'var' | 'eqn' | 'glob' | 'act' | 'proc' )
        // InternalMclrDsl.g:
        {
        if ( input.LA(1)==19||input.LA(1)==22||(input.LA(1)>=53 && input.LA(1)<=55)||(input.LA(1)>=78 && input.LA(1)<=80) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }
    }
    // $ANTLR end synpred3_InternalMclrDsl

    // $ANTLR start synpred4_InternalMclrDsl
    public final void synpred4_InternalMclrDsl_fragment() throws RecognitionException {   
        // InternalMclrDsl.g:826:4: ( '(' )
        // InternalMclrDsl.g:826:5: '('
        {
        match(input,12,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalMclrDsl

    // $ANTLR start synpred5_InternalMclrDsl
    public final void synpred5_InternalMclrDsl_fragment() throws RecognitionException {   
        // InternalMclrDsl.g:858:4: ( '?' )
        // InternalMclrDsl.g:858:5: '?'
        {
        match(input,20,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalMclrDsl

    // $ANTLR start synpred6_InternalMclrDsl
    public final void synpred6_InternalMclrDsl_fragment() throws RecognitionException {   
        // InternalMclrDsl.g:1069:4: ( '(' )
        // InternalMclrDsl.g:1069:5: '('
        {
        match(input,12,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_InternalMclrDsl

    // $ANTLR start synpred9_InternalMclrDsl
    public final void synpred9_InternalMclrDsl_fragment() throws RecognitionException {   
        // InternalMclrDsl.g:1787:6: ( 'true' | 'false' | '[' | '{' | '(' | '!' | '-' | '#' | 'forall' | 'exists' | 'lambda' | RULE_ID | RULE_INT )
        // InternalMclrDsl.g:
        {
        if ( (input.LA(1)>=RULE_ID && input.LA(1)<=RULE_INT)||input.LA(1)==12||input.LA(1)==14||(input.LA(1)>=23 && input.LA(1)<=28)||(input.LA(1)>=50 && input.LA(1)<=52) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }
    }
    // $ANTLR end synpred9_InternalMclrDsl

    // $ANTLR start synpred10_InternalMclrDsl
    public final void synpred10_InternalMclrDsl_fragment() throws RecognitionException {   
        // InternalMclrDsl.g:1808:6: ( 'true' | 'false' | '[' | '{' | '(' | '!' | '-' | '#' | 'forall' | 'exists' | 'lambda' | RULE_ID | RULE_INT )
        // InternalMclrDsl.g:
        {
        if ( (input.LA(1)>=RULE_ID && input.LA(1)<=RULE_INT)||input.LA(1)==12||input.LA(1)==14||(input.LA(1)>=23 && input.LA(1)<=28)||(input.LA(1)>=50 && input.LA(1)<=52) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }
    }
    // $ANTLR end synpred10_InternalMclrDsl

    // $ANTLR start synpred11_InternalMclrDsl
    public final void synpred11_InternalMclrDsl_fragment() throws RecognitionException {   
        // InternalMclrDsl.g:1829:6: ( RULE_ID )
        // InternalMclrDsl.g:1829:7: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_InternalMclrDsl

    // $ANTLR start synpred12_InternalMclrDsl
    public final void synpred12_InternalMclrDsl_fragment() throws RecognitionException {   
        // InternalMclrDsl.g:2173:4: ( 'true' | 'false' | '[' | '{' | '(' | '!' | '-' | '#' | 'forall' | 'exists' | 'lambda' | RULE_ID | RULE_INT )
        // InternalMclrDsl.g:
        {
        if ( (input.LA(1)>=RULE_ID && input.LA(1)<=RULE_INT)||input.LA(1)==12||input.LA(1)==14||(input.LA(1)>=23 && input.LA(1)<=28)||(input.LA(1)>=50 && input.LA(1)<=52) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }
    }
    // $ANTLR end synpred12_InternalMclrDsl

    // $ANTLR start synpred13_InternalMclrDsl
    public final void synpred13_InternalMclrDsl_fragment() throws RecognitionException {   
        // InternalMclrDsl.g:3076:4: ( RULE_ID )
        // InternalMclrDsl.g:3076:5: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_InternalMclrDsl

    // $ANTLR start synpred14_InternalMclrDsl
    public final void synpred14_InternalMclrDsl_fragment() throws RecognitionException {   
        // InternalMclrDsl.g:3097:4: ( RULE_ID )
        // InternalMclrDsl.g:3097:5: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_InternalMclrDsl

    // $ANTLR start synpred15_InternalMclrDsl
    public final void synpred15_InternalMclrDsl_fragment() throws RecognitionException {   
        // InternalMclrDsl.g:3143:4: ( RULE_ID )
        // InternalMclrDsl.g:3143:5: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_InternalMclrDsl

    // $ANTLR start synpred16_InternalMclrDsl
    public final void synpred16_InternalMclrDsl_fragment() throws RecognitionException {   
        // InternalMclrDsl.g:3421:5: ( '(' )
        // InternalMclrDsl.g:3421:6: '('
        {
        match(input,12,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalMclrDsl

    // Delegated rules

    public final boolean synpred14_InternalMclrDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalMclrDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalMclrDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalMclrDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalMclrDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalMclrDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalMclrDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalMclrDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalMclrDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalMclrDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalMclrDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalMclrDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalMclrDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalMclrDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalMclrDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalMclrDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalMclrDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalMclrDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalMclrDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalMclrDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalMclrDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalMclrDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalMclrDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalMclrDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalMclrDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalMclrDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalMclrDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalMclrDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA2 dfa2 = new DFA2(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA41 dfa41 = new DFA41(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\23\11\uffff";
    static final String dfa_3s = "\1\121\11\uffff";
    static final String dfa_4s = "\1\uffff\1\2\10\1";
    static final String dfa_5s = "\1\0\11\uffff}>";
    static final String[] dfa_6s = {
            "\1\10\2\uffff\1\3\36\uffff\1\6\1\4\1\11\26\uffff\1\2\1\7\1\5\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 79:3: ( ( 'sort' | 'cons' | 'map' | 'var' | 'eqn' | 'glob' | 'act' | 'proc' )=> (lv_left_0_0= rulemCRL2SpecElt ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA1_0 = input.LA(1);

                         
                        int index1_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_0==81) && (synpred2_InternalMclrDsl())) {s = 1;}

                        else if ( (LA1_0==78) && (synpred1_InternalMclrDsl())) {s = 2;}

                        else if ( (LA1_0==22) && (synpred1_InternalMclrDsl())) {s = 3;}

                        else if ( (LA1_0==54) && (synpred1_InternalMclrDsl())) {s = 4;}

                        else if ( (LA1_0==80) && (synpred1_InternalMclrDsl())) {s = 5;}

                        else if ( (LA1_0==53) && (synpred1_InternalMclrDsl())) {s = 6;}

                        else if ( (LA1_0==79) && (synpred1_InternalMclrDsl())) {s = 7;}

                        else if ( (LA1_0==19) && (synpred1_InternalMclrDsl())) {s = 8;}

                        else if ( (LA1_0==55) && (synpred1_InternalMclrDsl())) {s = 9;}

                         
                        input.seek(index1_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 1, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\1\1\11\uffff";
    static final String dfa_8s = "\1\120\11\uffff";
    static final String[] dfa_9s = {
            "\1\10\2\uffff\1\3\36\uffff\1\6\1\4\1\11\26\uffff\1\2\1\7\1\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final short[][] dfa_9 = unpackEncodedStringArray(dfa_9s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_7;
            this.min = dfa_2;
            this.max = dfa_8;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_9;
        }
        public String getDescription() {
            return "()* loopback of 119:3: ( ( 'sort' | 'cons' | 'map' | 'var' | 'eqn' | 'glob' | 'act' | 'proc' )=> (lv_right_2_0= rulemCRL2SpecElt ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_0 = input.LA(1);

                         
                        int index2_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA2_0==EOF) ) {s = 1;}

                        else if ( (LA2_0==78) && (synpred3_InternalMclrDsl())) {s = 2;}

                        else if ( (LA2_0==22) && (synpred3_InternalMclrDsl())) {s = 3;}

                        else if ( (LA2_0==54) && (synpred3_InternalMclrDsl())) {s = 4;}

                        else if ( (LA2_0==80) && (synpred3_InternalMclrDsl())) {s = 5;}

                        else if ( (LA2_0==53) && (synpred3_InternalMclrDsl())) {s = 6;}

                        else if ( (LA2_0==79) && (synpred3_InternalMclrDsl())) {s = 7;}

                        else if ( (LA2_0==19) && (synpred3_InternalMclrDsl())) {s = 8;}

                        else if ( (LA2_0==55) && (synpred3_InternalMclrDsl())) {s = 9;}

                         
                        input.seek(index2_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 2, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_10s = "\23\uffff";
    static final String dfa_11s = "\1\4\1\uffff\15\0\4\uffff";
    static final String dfa_12s = "\1\64\1\uffff\15\0\4\uffff";
    static final String dfa_13s = "\1\uffff\1\1\15\uffff\1\5\1\2\1\3\1\4";
    static final String dfa_14s = "\2\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\4\uffff}>";
    static final String[] dfa_15s = {
            "\1\2\1\3\6\uffff\1\10\1\uffff\1\7\1\17\1\uffff\1\1\5\uffff\1\4\1\5\1\11\1\12\1\13\1\6\25\uffff\1\14\1\15\1\16",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final char[] dfa_12 = DFA.unpackEncodedStringToUnsignedChars(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[][] dfa_15 = unpackEncodedStringArray(dfa_15s);

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = dfa_10;
            this.eof = dfa_10;
            this.min = dfa_11;
            this.max = dfa_12;
            this.accept = dfa_13;
            this.special = dfa_14;
            this.transition = dfa_15;
        }
        public String getDescription() {
            return "1770:4: ( ( (lv_is_colon_8_0= ':' ) ) | ( ( 'true' | 'false' | '[' | '{' | '(' | '!' | '-' | '#' | 'forall' | 'exists' | 'lambda' | RULE_ID | RULE_INT )=> (lv_bag_9_0= ruleBagEnumEltList ) ) | ( ( 'true' | 'false' | '[' | '{' | '(' | '!' | '-' | '#' | 'forall' | 'exists' | 'lambda' | RULE_ID | RULE_INT )=> (lv_data_exp_list_10_0= ruleDataExprList ) ) | ( ( RULE_ID )=> ( ( (lv_var_decl_11_0= ruleVarsDecl ) ) otherlv_12= '|' ( (lv_data_exp_13_0= ruleDataExpr ) ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_2 = input.LA(1);

                         
                        int index21_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMclrDsl()) ) {s = 16;}

                        else if ( (synpred10_InternalMclrDsl()) ) {s = 17;}

                        else if ( (synpred11_InternalMclrDsl()) ) {s = 18;}

                         
                        input.seek(index21_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA21_3 = input.LA(1);

                         
                        int index21_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMclrDsl()) ) {s = 16;}

                        else if ( (synpred10_InternalMclrDsl()) ) {s = 17;}

                         
                        input.seek(index21_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA21_4 = input.LA(1);

                         
                        int index21_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMclrDsl()) ) {s = 16;}

                        else if ( (synpred10_InternalMclrDsl()) ) {s = 17;}

                         
                        input.seek(index21_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA21_5 = input.LA(1);

                         
                        int index21_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMclrDsl()) ) {s = 16;}

                        else if ( (synpred10_InternalMclrDsl()) ) {s = 17;}

                         
                        input.seek(index21_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA21_6 = input.LA(1);

                         
                        int index21_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMclrDsl()) ) {s = 16;}

                        else if ( (synpred10_InternalMclrDsl()) ) {s = 17;}

                         
                        input.seek(index21_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA21_7 = input.LA(1);

                         
                        int index21_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMclrDsl()) ) {s = 16;}

                        else if ( (synpred10_InternalMclrDsl()) ) {s = 17;}

                         
                        input.seek(index21_7);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA21_8 = input.LA(1);

                         
                        int index21_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMclrDsl()) ) {s = 16;}

                        else if ( (synpred10_InternalMclrDsl()) ) {s = 17;}

                         
                        input.seek(index21_8);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA21_9 = input.LA(1);

                         
                        int index21_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMclrDsl()) ) {s = 16;}

                        else if ( (synpred10_InternalMclrDsl()) ) {s = 17;}

                         
                        input.seek(index21_9);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA21_10 = input.LA(1);

                         
                        int index21_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMclrDsl()) ) {s = 16;}

                        else if ( (synpred10_InternalMclrDsl()) ) {s = 17;}

                         
                        input.seek(index21_10);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA21_11 = input.LA(1);

                         
                        int index21_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMclrDsl()) ) {s = 16;}

                        else if ( (synpred10_InternalMclrDsl()) ) {s = 17;}

                         
                        input.seek(index21_11);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA21_12 = input.LA(1);

                         
                        int index21_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMclrDsl()) ) {s = 16;}

                        else if ( (synpred10_InternalMclrDsl()) ) {s = 17;}

                         
                        input.seek(index21_12);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA21_13 = input.LA(1);

                         
                        int index21_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMclrDsl()) ) {s = 16;}

                        else if ( (synpred10_InternalMclrDsl()) ) {s = 17;}

                         
                        input.seek(index21_13);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA21_14 = input.LA(1);

                         
                        int index21_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMclrDsl()) ) {s = 16;}

                        else if ( (synpred10_InternalMclrDsl()) ) {s = 17;}

                         
                        input.seek(index21_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_16s = "\20\uffff";
    static final String dfa_17s = "\1\4\15\0\2\uffff";
    static final String dfa_18s = "\1\64\15\0\2\uffff";
    static final String dfa_19s = "\16\uffff\1\1\1\2";
    static final String dfa_20s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\2\uffff}>";
    static final String[] dfa_21s = {
            "\1\1\1\2\6\uffff\1\7\1\uffff\1\6\10\uffff\1\3\1\4\1\10\1\11\1\12\1\5\25\uffff\1\13\1\14\1\15",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final char[] dfa_18 = DFA.unpackEncodedStringToUnsignedChars(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[][] dfa_21 = unpackEncodedStringArray(dfa_21s);

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = dfa_16;
            this.eof = dfa_16;
            this.min = dfa_17;
            this.max = dfa_18;
            this.accept = dfa_19;
            this.special = dfa_20;
            this.transition = dfa_21;
        }
        public String getDescription() {
            return "2172:3: ( ( 'true' | 'false' | '[' | '{' | '(' | '!' | '-' | '#' | 'forall' | 'exists' | 'lambda' | RULE_ID | RULE_INT )=> ( ( (lv_cond_0_0= ruleDataExpr ) ) otherlv_1= '->' ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_1 = input.LA(1);

                         
                        int index25_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalMclrDsl()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index25_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA25_2 = input.LA(1);

                         
                        int index25_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalMclrDsl()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index25_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA25_3 = input.LA(1);

                         
                        int index25_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalMclrDsl()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index25_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA25_4 = input.LA(1);

                         
                        int index25_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalMclrDsl()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index25_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA25_5 = input.LA(1);

                         
                        int index25_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalMclrDsl()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index25_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA25_6 = input.LA(1);

                         
                        int index25_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalMclrDsl()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index25_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA25_7 = input.LA(1);

                         
                        int index25_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalMclrDsl()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index25_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA25_8 = input.LA(1);

                         
                        int index25_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalMclrDsl()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index25_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA25_9 = input.LA(1);

                         
                        int index25_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalMclrDsl()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index25_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA25_10 = input.LA(1);

                         
                        int index25_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalMclrDsl()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index25_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA25_11 = input.LA(1);

                         
                        int index25_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalMclrDsl()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index25_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA25_12 = input.LA(1);

                         
                        int index25_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalMclrDsl()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index25_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA25_13 = input.LA(1);

                         
                        int index25_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalMclrDsl()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index25_13);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 25, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_22s = "\24\uffff";
    static final String dfa_23s = "\1\4\1\0\5\uffff\1\0\14\uffff";
    static final String dfa_24s = "\1\102\1\0\5\uffff\1\0\14\uffff";
    static final String dfa_25s = "\2\uffff\1\4\1\5\1\6\1\7\1\10\1\uffff\1\12\1\13\5\uffff\1\14\1\1\1\2\1\3\1\11";
    static final String dfa_26s = "\1\uffff\1\0\5\uffff\1\1\14\uffff}>";
    static final String[] dfa_27s = {
            "\1\1\1\11\6\uffff\1\7\12\uffff\5\11\37\uffff\1\2\1\3\1\4\1\5\1\6\1\10\1\uffff\1\17",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final char[] dfa_24 = DFA.unpackEncodedStringToUnsignedChars(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[][] dfa_27 = unpackEncodedStringArray(dfa_27s);

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = dfa_22;
            this.eof = dfa_22;
            this.min = dfa_23;
            this.max = dfa_24;
            this.accept = dfa_25;
            this.special = dfa_26;
            this.transition = dfa_27;
        }
        public String getDescription() {
            return "3074:2: ( ( ( RULE_ID )=> (lv_action_0_0= ruleAction ) ) | ( ( RULE_ID )=> ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_ass_3_0= ruleAssignmentList ) )? otherlv_4= ')' ) ) | ( ( RULE_ID )=> ( ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_ass_7_0= ruleAssignmentList ) )? otherlv_8= ')' ) ) | ( (lv_is_delta_9_0= 'delta' ) ) | ( (lv_is_tau_10_0= 'tau' ) ) | ( ( (lv_is_block_11_0= 'block' ) ) otherlv_12= '(' ( (lv_act_set_13_0= ruleActIdSet ) ) otherlv_14= ',' ( (lv_proc_exp_15_0= ruleProcExpr ) ) otherlv_16= ')' ) | ( ( (lv_is_allow_17_0= 'allow' ) ) otherlv_18= '(' ( (lv_multi_set_19_0= ruleMultActIdSet ) ) otherlv_20= ',' ( (lv_proc_exp_21_0= ruleProcExpr ) ) otherlv_22= ')' ) | ( ( (lv_is_hide_23_0= 'hide' ) ) otherlv_24= '(' ( (lv_act_set_25_0= ruleActIdSet ) ) otherlv_26= ',' ( (lv_proc_exp_27_0= ruleProcExpr ) ) otherlv_28= ')' ) | ( ( ( '(' )=> (lv_is_grp_29_0= '(' ) ) ( (lv_proc_exp_30_0= ruleProcExpr ) ) otherlv_31= ')' ) | ( ( (lv_is_sum_32_0= 'sum' ) ) ( (lv_variables_33_0= ruleVarsDeclList ) ) otherlv_34= '.' ( (lv_proc_exp_35_0= ruleProcExpr ) ) ) | (this_DataExprUnit_36= ruleDataExprUnit otherlv_37= '->' ( (lv_proc_exp_38_0= ruleProcExpr ) ) (otherlv_39= '<>' ( (lv_proc_exp_other_40_0= ruleProcExpr ) ) )? ) | (otherlv_41= 'dist' this_VarsDeclList_42= ruleVarsDeclList otherlv_43= '[' ( (lv_data_44_0= ruleDataExpr ) ) otherlv_45= ']' otherlv_46= '.' ( (lv_proc_exp_47_0= ruleProcExpr ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA41_1 = input.LA(1);

                         
                        int index41_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalMclrDsl()) ) {s = 16;}

                        else if ( (synpred14_InternalMclrDsl()) ) {s = 17;}

                        else if ( (synpred15_InternalMclrDsl()) ) {s = 18;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index41_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA41_7 = input.LA(1);

                         
                        int index41_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalMclrDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index41_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 41, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00E0000000480000L,0x000000000003C000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00E0000000480002L,0x000000000003C000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x001C00001F805030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000001010L,0x0000000000003FF8L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000101002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000F801030L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010001000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000F84000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0003FFF000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x001C00005F805030L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x001C00001F82D030L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x001C00001F805032L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0xF80000000F801030L,0x0000000000000005L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0702002080200000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000028000000L});

}