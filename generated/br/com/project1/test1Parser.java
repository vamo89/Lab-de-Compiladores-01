// $ANTLR 3.4 C:\\Documents and Settings\\teste\\workspace\\Lab-de-Compiladores-01\\src\\br\\com\\project1\\test1.g 2012-03-06 20:21:55

  package br.com.project1;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class test1Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IDENT", "WS"
    };

    public static final int EOF=-1;
    public static final int IDENT=4;
    public static final int WS=5;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public test1Parser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public test1Parser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return test1Parser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Documents and Settings\\teste\\workspace\\Lab-de-Compiladores-01\\src\\br\\com\\project1\\test1.g"; }



    // $ANTLR start "rule"
    // C:\\Documents and Settings\\teste\\workspace\\Lab-de-Compiladores-01\\src\\br\\com\\project1\\test1.g:16:1: rule : (id= IDENT )+ ;
    public final void rule() throws RecognitionException {
        Token id=null;

        try {
            // C:\\Documents and Settings\\teste\\workspace\\Lab-de-Compiladores-01\\src\\br\\com\\project1\\test1.g:16:5: ( (id= IDENT )+ )
            // C:\\Documents and Settings\\teste\\workspace\\Lab-de-Compiladores-01\\src\\br\\com\\project1\\test1.g:17:3: (id= IDENT )+
            {
            // C:\\Documents and Settings\\teste\\workspace\\Lab-de-Compiladores-01\\src\\br\\com\\project1\\test1.g:17:5: (id= IDENT )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==IDENT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Documents and Settings\\teste\\workspace\\Lab-de-Compiladores-01\\src\\br\\com\\project1\\test1.g:17:5: id= IDENT
            	    {
            	    id=(Token)match(input,IDENT,FOLLOW_IDENT_in_rule44); 

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



                System.out.println(id.getText());
              

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "rule"

    // Delegated rules


 

    public static final BitSet FOLLOW_IDENT_in_rule44 = new BitSet(new long[]{0x0000000000000012L});

}