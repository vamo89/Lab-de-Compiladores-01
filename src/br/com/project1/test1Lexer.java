// $ANTLR 3.4 C:\\Documents and Settings\\teste\\workspace\\sample\\src\\br\\com\\project1\\test1.g 2012-03-06 20:06:09

    package br.com.project1;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class test1Lexer extends Lexer {
    public static final int EOF=-1;
    public static final int IDENT=4;
    public static final int WS=5;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public test1Lexer() {} 
    public test1Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public test1Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Documents and Settings\\teste\\workspace\\sample\\src\\br\\com\\project1\\test1.g"; }

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\teste\\workspace\\sample\\src\\br\\com\\project1\\test1.g:21:7: ( 'a' .. 'z' | ( 'A' .. 'Z' )+ )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                alt2=1;
            }
            else if ( ((LA2_0 >= 'A' && LA2_0 <= 'Z')) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // C:\\Documents and Settings\\teste\\workspace\\sample\\src\\br\\com\\project1\\test1.g:21:9: 'a' .. 'z'
                    {
                    matchRange('a','z'); 

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\teste\\workspace\\sample\\src\\br\\com\\project1\\test1.g:21:18: ( 'A' .. 'Z' )+
                    {
                    // C:\\Documents and Settings\\teste\\workspace\\sample\\src\\br\\com\\project1\\test1.g:21:18: ( 'A' .. 'Z' )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0 >= 'A' && LA1_0 <= 'Z')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\teste\\workspace\\sample\\src\\br\\com\\project1\\test1.g:
                    	    {
                    	    if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
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
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IDENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\teste\\workspace\\sample\\src\\br\\com\\project1\\test1.g:22:4: ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+ )
            // C:\\Documents and Settings\\teste\\workspace\\sample\\src\\br\\com\\project1\\test1.g:22:6: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
            {
            // C:\\Documents and Settings\\teste\\workspace\\sample\\src\\br\\com\\project1\\test1.g:22:6: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '\t' && LA3_0 <= '\n')||(LA3_0 >= '\f' && LA3_0 <= '\r')||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Documents and Settings\\teste\\workspace\\sample\\src\\br\\com\\project1\\test1.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // C:\\Documents and Settings\\teste\\workspace\\sample\\src\\br\\com\\project1\\test1.g:1:8: ( IDENT | WS )
        int alt4=2;
        int LA4_0 = input.LA(1);

        if ( ((LA4_0 >= 'A' && LA4_0 <= 'Z')||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
            alt4=1;
        }
        else if ( ((LA4_0 >= '\t' && LA4_0 <= '\n')||(LA4_0 >= '\f' && LA4_0 <= '\r')||LA4_0==' ') ) {
            alt4=2;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("", 4, 0, input);

            throw nvae;

        }
        switch (alt4) {
            case 1 :
                // C:\\Documents and Settings\\teste\\workspace\\sample\\src\\br\\com\\project1\\test1.g:1:10: IDENT
                {
                mIDENT(); 


                }
                break;
            case 2 :
                // C:\\Documents and Settings\\teste\\workspace\\sample\\src\\br\\com\\project1\\test1.g:1:16: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}