// $ANTLR 3.4 D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g 2012-03-17 16:31:33

  package compiladores.lab01.parserLatexToHtml;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class LatexToHtmlLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int AUTHOR=4;
    public static final int BEGIN=5;
    public static final int DOCUMENT=6;
    public static final int DOCUMENTCLASS=7;
    public static final int END=8;
    public static final int INCLUDEGRAPHICS=9;
    public static final int ITEM=10;
    public static final int ITEMIZE=11;
    public static final int MKTITLE=12;
    public static final int PUNCT=13;
    public static final int TEXTBF=14;
    public static final int TEXTIT=15;
    public static final int TEXT_CONTENT=16;
    public static final int TITLE=17;
    public static final int USEPACKAGE=18;
    public static final int USERPACKAGE=19;
    public static final int WS=20;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public LatexToHtmlLexer() {} 
    public LatexToHtmlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public LatexToHtmlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g"; }

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:11:7: ( '\\\\' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:11:9: '\\\\'
            {
            match('\\'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:12:7: ( '{' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:13:7: ( '}' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:13:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "BEGIN"
    public final void mBEGIN() throws RecognitionException {
        try {
            int _type = BEGIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:20:17: ( '\\\\' 'begin' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:20:18: '\\\\' 'begin'
            {
            match('\\'); 

            match("begin"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BEGIN"

    // $ANTLR start "DOCUMENTCLASS"
    public final void mDOCUMENTCLASS() throws RecognitionException {
        try {
            int _type = DOCUMENTCLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:21:17: ( '\\\\' 'documentclass' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:21:18: '\\\\' 'documentclass'
            {
            match('\\'); 

            match("documentclass"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOCUMENTCLASS"

    // $ANTLR start "DOCUMENT"
    public final void mDOCUMENT() throws RecognitionException {
        try {
            int _type = DOCUMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:22:17: ( '{document}' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:22:18: '{document}'
            {
            match("{document}"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOCUMENT"

    // $ANTLR start "ITEMIZE"
    public final void mITEMIZE() throws RecognitionException {
        try {
            int _type = ITEMIZE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:23:17: ( '{itemize}' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:23:18: '{itemize}'
            {
            match("{itemize}"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ITEMIZE"

    // $ANTLR start "ITEM"
    public final void mITEM() throws RecognitionException {
        try {
            int _type = ITEM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:24:17: ( '\\\\' 'item' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:24:18: '\\\\' 'item'
            {
            match('\\'); 

            match("item"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ITEM"

    // $ANTLR start "TEXTBF"
    public final void mTEXTBF() throws RecognitionException {
        try {
            int _type = TEXTBF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:25:17: ( '\\\\' 'textbf' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:25:18: '\\\\' 'textbf'
            {
            match('\\'); 

            match("textbf"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TEXTBF"

    // $ANTLR start "TEXTIT"
    public final void mTEXTIT() throws RecognitionException {
        try {
            int _type = TEXTIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:26:17: ( '\\\\' 'textit' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:26:18: '\\\\' 'textit'
            {
            match('\\'); 

            match("textit"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TEXTIT"

    // $ANTLR start "END"
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:27:17: ( '\\\\' 'end' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:27:18: '\\\\' 'end'
            {
            match('\\'); 

            match("end"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "END"

    // $ANTLR start "USEPACKAGE"
    public final void mUSEPACKAGE() throws RecognitionException {
        try {
            int _type = USEPACKAGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:28:17: ( '\\\\' 'usepackage' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:28:18: '\\\\' 'usepackage'
            {
            match('\\'); 

            match("usepackage"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "USEPACKAGE"

    // $ANTLR start "INCLUDEGRAPHICS"
    public final void mINCLUDEGRAPHICS() throws RecognitionException {
        try {
            int _type = INCLUDEGRAPHICS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:29:17: ( '\\\\' 'includegraphics' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:29:18: '\\\\' 'includegraphics'
            {
            match('\\'); 

            match("includegraphics"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INCLUDEGRAPHICS"

    // $ANTLR start "TITLE"
    public final void mTITLE() throws RecognitionException {
        try {
            int _type = TITLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:30:17: ( '\\\\' 'title' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:30:18: '\\\\' 'title'
            {
            match('\\'); 

            match("title"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TITLE"

    // $ANTLR start "MKTITLE"
    public final void mMKTITLE() throws RecognitionException {
        try {
            int _type = MKTITLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:31:17: ( '\\\\' 'maketitle' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:31:18: '\\\\' 'maketitle'
            {
            match('\\'); 

            match("maketitle"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MKTITLE"

    // $ANTLR start "AUTHOR"
    public final void mAUTHOR() throws RecognitionException {
        try {
            int _type = AUTHOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:32:17: ( '\\\\author' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:32:18: '\\\\author'
            {
            match("\\author"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AUTHOR"

    // $ANTLR start "PUNCT"
    public final void mPUNCT() throws RecognitionException {
        try {
            int _type = PUNCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:33:17: ( ( '.' | ',' | ';' | '-' | '[' | ']' ) )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:
            {
            if ( (input.LA(1) >= ',' && input.LA(1) <= '.')||input.LA(1)==';'||input.LA(1)=='['||input.LA(1)==']' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PUNCT"

    // $ANTLR start "TEXT_CONTENT"
    public final void mTEXT_CONTENT() throws RecognitionException {
        try {
            int _type = TEXT_CONTENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:34:17: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | PUNCT ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | PUNCT | WS )* )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:34:18: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | PUNCT ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | PUNCT | WS )*
            {
            if ( (input.LA(1) >= ',' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= '9')||input.LA(1)==';'||(input.LA(1) >= 'A' && input.LA(1) <= '[')||input.LA(1)==']'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:34:59: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | PUNCT | WS )*
            loop1:
            do {
                int alt1=6;
                switch ( input.LA(1) ) {
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt1=1;
                    }
                    break;
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    {
                    alt1=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt1=3;
                    }
                    break;
                case ',':
                case '-':
                case '.':
                case ';':
                case '[':
                case ']':
                    {
                    alt1=4;
                    }
                    break;
                case '\t':
                case '\n':
                case '\f':
                case '\r':
                case ' ':
                    {
                    alt1=5;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:34:60: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }
            	    break;
            	case 2 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:34:71: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); 

            	    }
            	    break;
            	case 3 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:34:82: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;
            	case 4 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:34:93: PUNCT
            	    {
            	    mPUNCT(); 


            	    }
            	    break;
            	case 5 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:34:101: WS
            	    {
            	    mWS(); 


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TEXT_CONTENT"

    // $ANTLR start "USERPACKAGE"
    public final void mUSERPACKAGE() throws RecognitionException {
        try {
            int _type = USERPACKAGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:53:12: ( USEPACKAGE ( TEXT_CONTENT | '{' TEXT_CONTENT '}' )* )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:54:2: USEPACKAGE ( TEXT_CONTENT | '{' TEXT_CONTENT '}' )*
            {
            mUSEPACKAGE(); 


            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:54:13: ( TEXT_CONTENT | '{' TEXT_CONTENT '}' )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= ',' && LA2_0 <= '.')||(LA2_0 >= '0' && LA2_0 <= '9')||LA2_0==';'||(LA2_0 >= 'A' && LA2_0 <= '[')||LA2_0==']'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }
                else if ( (LA2_0=='{') ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:54:14: TEXT_CONTENT
            	    {
            	    mTEXT_CONTENT(); 


            	    }
            	    break;
            	case 2 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:54:29: '{' TEXT_CONTENT '}'
            	    {
            	    match('{'); 

            	    mTEXT_CONTENT(); 


            	    match('}'); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
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
    // $ANTLR end "USERPACKAGE"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:56:3: ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+ )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:56:5: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
            {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:56:5: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
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
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:
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
        // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:8: ( T__21 | T__22 | T__23 | BEGIN | DOCUMENTCLASS | DOCUMENT | ITEMIZE | ITEM | TEXTBF | TEXTIT | END | USEPACKAGE | INCLUDEGRAPHICS | TITLE | MKTITLE | AUTHOR | PUNCT | TEXT_CONTENT | USERPACKAGE | WS )
        int alt4=20;
        switch ( input.LA(1) ) {
        case '\\':
            {
            switch ( input.LA(2) ) {
            case 'b':
                {
                alt4=4;
                }
                break;
            case 'd':
                {
                alt4=5;
                }
                break;
            case 'i':
                {
                int LA4_9 = input.LA(3);

                if ( (LA4_9=='t') ) {
                    alt4=8;
                }
                else if ( (LA4_9=='n') ) {
                    alt4=13;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 9, input);

                    throw nvae;

                }
                }
                break;
            case 't':
                {
                int LA4_10 = input.LA(3);

                if ( (LA4_10=='e') ) {
                    int LA4_22 = input.LA(4);

                    if ( (LA4_22=='x') ) {
                        int LA4_25 = input.LA(5);

                        if ( (LA4_25=='t') ) {
                            int LA4_27 = input.LA(6);

                            if ( (LA4_27=='b') ) {
                                alt4=9;
                            }
                            else if ( (LA4_27=='i') ) {
                                alt4=10;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 4, 27, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 25, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 22, input);

                        throw nvae;

                    }
                }
                else if ( (LA4_10=='i') ) {
                    alt4=14;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 10, input);

                    throw nvae;

                }
                }
                break;
            case 'e':
                {
                alt4=11;
                }
                break;
            case 'u':
                {
                int LA4_12 = input.LA(3);

                if ( (LA4_12=='s') ) {
                    int LA4_24 = input.LA(4);

                    if ( (LA4_24=='e') ) {
                        int LA4_26 = input.LA(5);

                        if ( (LA4_26=='p') ) {
                            int LA4_28 = input.LA(6);

                            if ( (LA4_28=='a') ) {
                                int LA4_31 = input.LA(7);

                                if ( (LA4_31=='c') ) {
                                    int LA4_32 = input.LA(8);

                                    if ( (LA4_32=='k') ) {
                                        int LA4_33 = input.LA(9);

                                        if ( (LA4_33=='a') ) {
                                            int LA4_34 = input.LA(10);

                                            if ( (LA4_34=='g') ) {
                                                int LA4_35 = input.LA(11);

                                                if ( (LA4_35=='e') ) {
                                                    int LA4_36 = input.LA(12);

                                                    if ( ((LA4_36 >= ',' && LA4_36 <= '.')||(LA4_36 >= '0' && LA4_36 <= '9')||LA4_36==';'||(LA4_36 >= 'A' && LA4_36 <= '[')||LA4_36==']'||(LA4_36 >= 'a' && LA4_36 <= '{')) ) {
                                                        alt4=19;
                                                    }
                                                    else {
                                                        alt4=12;
                                                    }
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("", 4, 35, input);

                                                    throw nvae;

                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 4, 34, input);

                                                throw nvae;

                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 4, 33, input);

                                            throw nvae;

                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 4, 32, input);

                                        throw nvae;

                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 4, 31, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 4, 28, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 26, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 24, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 12, input);

                    throw nvae;

                }
                }
                break;
            case 'm':
                {
                alt4=15;
                }
                break;
            case 'a':
                {
                alt4=16;
                }
                break;
            default:
                alt4=1;
            }

            }
            break;
        case '{':
            {
            switch ( input.LA(2) ) {
            case 'd':
                {
                alt4=6;
                }
                break;
            case 'i':
                {
                alt4=7;
                }
                break;
            default:
                alt4=2;
            }

            }
            break;
        case '}':
            {
            alt4=3;
            }
            break;
        case ',':
        case '-':
        case '.':
        case ';':
        case '[':
        case ']':
            {
            int LA4_4 = input.LA(2);

            if ( ((LA4_4 >= '\t' && LA4_4 <= '\n')||(LA4_4 >= '\f' && LA4_4 <= '\r')||LA4_4==' '||(LA4_4 >= ',' && LA4_4 <= '.')||(LA4_4 >= '0' && LA4_4 <= '9')||LA4_4==';'||(LA4_4 >= 'A' && LA4_4 <= '[')||LA4_4==']'||(LA4_4 >= 'a' && LA4_4 <= 'z')) ) {
                alt4=18;
            }
            else {
                alt4=17;
            }
            }
            break;
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case 'a':
        case 'b':
        case 'c':
        case 'd':
        case 'e':
        case 'f':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'o':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt4=18;
            }
            break;
        case '\t':
        case '\n':
        case '\f':
        case '\r':
        case ' ':
            {
            alt4=20;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 4, 0, input);

            throw nvae;

        }

        switch (alt4) {
            case 1 :
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:10: T__21
                {
                mT__21(); 


                }
                break;
            case 2 :
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:16: T__22
                {
                mT__22(); 


                }
                break;
            case 3 :
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:22: T__23
                {
                mT__23(); 


                }
                break;
            case 4 :
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:28: BEGIN
                {
                mBEGIN(); 


                }
                break;
            case 5 :
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:34: DOCUMENTCLASS
                {
                mDOCUMENTCLASS(); 


                }
                break;
            case 6 :
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:48: DOCUMENT
                {
                mDOCUMENT(); 


                }
                break;
            case 7 :
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:57: ITEMIZE
                {
                mITEMIZE(); 


                }
                break;
            case 8 :
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:65: ITEM
                {
                mITEM(); 


                }
                break;
            case 9 :
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:70: TEXTBF
                {
                mTEXTBF(); 


                }
                break;
            case 10 :
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:77: TEXTIT
                {
                mTEXTIT(); 


                }
                break;
            case 11 :
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:84: END
                {
                mEND(); 


                }
                break;
            case 12 :
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:88: USEPACKAGE
                {
                mUSEPACKAGE(); 


                }
                break;
            case 13 :
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:99: INCLUDEGRAPHICS
                {
                mINCLUDEGRAPHICS(); 


                }
                break;
            case 14 :
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:115: TITLE
                {
                mTITLE(); 


                }
                break;
            case 15 :
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:121: MKTITLE
                {
                mMKTITLE(); 


                }
                break;
            case 16 :
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:129: AUTHOR
                {
                mAUTHOR(); 


                }
                break;
            case 17 :
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:136: PUNCT
                {
                mPUNCT(); 


                }
                break;
            case 18 :
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:142: TEXT_CONTENT
                {
                mTEXT_CONTENT(); 


                }
                break;
            case 19 :
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:155: USERPACKAGE
                {
                mUSERPACKAGE(); 


                }
                break;
            case 20 :
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:167: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}