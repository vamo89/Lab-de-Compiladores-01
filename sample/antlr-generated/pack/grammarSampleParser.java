// $ANTLR 3.4 C:\\Users\\ra084643\\workspace\\sample\\src\\pack\\grammarSample.g 2012-03-04 12:41:24

  package pack;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class grammarSampleParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", 
    };

    public static final int EOF=-1;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public grammarSampleParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public grammarSampleParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return grammarSampleParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\ra084643\\workspace\\sample\\src\\pack\\grammarSample.g"; }



    // $ANTLR start "rule"
    // C:\\Users\\ra084643\\workspace\\sample\\src\\pack\\grammarSample.g:15:1: rule :;
    public final void rule() throws RecognitionException {
        try {
            // C:\\Users\\ra084643\\workspace\\sample\\src\\pack\\grammarSample.g:15:5: ()
            // C:\\Users\\ra084643\\workspace\\sample\\src\\pack\\grammarSample.g:15:7: 
            {
            }

        }
        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "rule"

    // Delegated rules


 

}