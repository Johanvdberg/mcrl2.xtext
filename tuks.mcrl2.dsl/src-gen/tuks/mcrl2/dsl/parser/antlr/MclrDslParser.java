/*
 * generated by Xtext 2.11.0.beta2
 */
package tuks.mcrl2.dsl.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import tuks.mcrl2.dsl.parser.antlr.internal.InternalMclrDslParser;
import tuks.mcrl2.dsl.services.MclrDslGrammarAccess;

public class MclrDslParser extends AbstractAntlrParser {

	@Inject
	private MclrDslGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalMclrDslParser createParser(XtextTokenStream stream) {
		return new InternalMclrDslParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public MclrDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MclrDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}