// $ANTLR 3.4 D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g 2012-03-18 02:02:48

  package compiladores.lab01.parserLatexToHtml;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class LatexToHtmlLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int AUTHOR=4;
    public static final int BEGIN=5;
    public static final int DOCUMENT=6;
    public static final int DOCUMENTCLASS=7;
    public static final int DOLLAR=8;
    public static final int END=9;
    public static final int INCLUDEGRAPHICS=10;
    public static final int ITEM=11;
    public static final int ITEMIZE=12;
    public static final int MKTITLE=13;
    public static final int PUNCT=14;
    public static final int SPECIALCHAR=15;
    public static final int TEXTBF=16;
    public static final int TEXTIT=17;
    public static final int TEXT_CONTENT=18;
    public static final int TITLE=19;
    public static final int USEPACKAGE=20;
    public static final int USEPACKAGE_IGNORE=21;
    public static final int WS=22;

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

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
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
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
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
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
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
    // $ANTLR end "T__25"

    // $ANTLR start "BEGIN"
    public final void mBEGIN() throws RecognitionException {
        try {
            int _type = BEGIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:21:17: ( '\\\\' 'begin' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:21:18: '\\\\' 'begin'
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
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:22:17: ( '\\\\' 'documentclass' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:22:18: '\\\\' 'documentclass'
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
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:23:17: ( '{document}' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:23:18: '{document}'
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
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:24:17: ( '{itemize}' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:24:18: '{itemize}'
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
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:25:17: ( '\\\\' 'item' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:25:18: '\\\\' 'item'
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
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:26:17: ( '\\\\' 'textbf' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:26:18: '\\\\' 'textbf'
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
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:27:17: ( '\\\\' 'textit' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:27:18: '\\\\' 'textit'
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
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:28:17: ( '\\\\' 'end' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:28:18: '\\\\' 'end'
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
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:29:17: ( '\\\\' 'usepackage' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:29:18: '\\\\' 'usepackage'
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
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:30:17: ( '\\\\' 'includegraphics' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:30:18: '\\\\' 'includegraphics'
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
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:31:17: ( '\\\\' 'title' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:31:18: '\\\\' 'title'
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
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:32:17: ( '\\\\' 'maketitle' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:32:18: '\\\\' 'maketitle'
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
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:33:17: ( '\\\\' 'author' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:33:18: '\\\\' 'author'
            {
            match('\\'); 

            match("author"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AUTHOR"

    // $ANTLR start "DOLLAR"
    public final void mDOLLAR() throws RecognitionException {
        try {
            int _type = DOLLAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:34:17: ( '$' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:34:18: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOLLAR"

    // $ANTLR start "PUNCT"
    public final void mPUNCT() throws RecognitionException {
        try {
            int _type = PUNCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:35:17: ( ( '.' | ',' | ';' | '-' | '[' | ']' | '(' | ')' ) )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:
            {
            if ( (input.LA(1) >= '(' && input.LA(1) <= ')')||(input.LA(1) >= ',' && input.LA(1) <= '.')||input.LA(1)==';'||input.LA(1)=='['||input.LA(1)==']' ) {
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

    // $ANTLR start "SPECIALCHAR"
    public final void mSPECIALCHAR() throws RecognitionException {
        try {
            int _type = SPECIALCHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:36:17: ( '\\\\' ( 'Omega' | 'Alpha' | 'Beta' | 'Gamma' ) )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:36:18: '\\\\' ( 'Omega' | 'Alpha' | 'Beta' | 'Gamma' )
            {
            match('\\'); 

            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:36:22: ( 'Omega' | 'Alpha' | 'Beta' | 'Gamma' )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 'O':
                {
                alt1=1;
                }
                break;
            case 'A':
                {
                alt1=2;
                }
                break;
            case 'B':
                {
                alt1=3;
                }
                break;
            case 'G':
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:36:23: 'Omega'
                    {
                    match("Omega"); 



                    }
                    break;
                case 2 :
                    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:36:31: 'Alpha'
                    {
                    match("Alpha"); 



                    }
                    break;
                case 3 :
                    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:36:39: 'Beta'
                    {
                    match("Beta"); 



                    }
                    break;
                case 4 :
                    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:36:46: 'Gamma'
                    {
                    match("Gamma"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SPECIALCHAR"

    // $ANTLR start "TEXT_CONTENT"
    public final void mTEXT_CONTENT() throws RecognitionException {
        try {
            int _type = TEXT_CONTENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:37:17: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | PUNCT ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | PUNCT | WS )* )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:37:18: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | PUNCT ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | PUNCT | WS )*
            {
            if ( (input.LA(1) >= '(' && input.LA(1) <= ')')||(input.LA(1) >= ',' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= '9')||input.LA(1)==';'||(input.LA(1) >= 'A' && input.LA(1) <= '[')||input.LA(1)==']'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:37:59: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | PUNCT | WS )*
            loop2:
            do {
                int alt2=6;
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
                    alt2=1;
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
                    alt2=2;
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
                    alt2=3;
                    }
                    break;
                case '(':
                case ')':
                case ',':
                case '-':
                case '.':
                case ';':
                case '[':
                case ']':
                    {
                    alt2=4;
                    }
                    break;
                case '\t':
                case '\n':
                case '\f':
                case '\r':
                case ' ':
                    {
                    alt2=5;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:37:60: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }
            	    break;
            	case 2 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:37:71: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); 

            	    }
            	    break;
            	case 3 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:37:82: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;
            	case 4 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:37:93: PUNCT
            	    {
            	    mPUNCT(); 


            	    }
            	    break;
            	case 5 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:37:101: WS
            	    {
            	    mWS(); 


            	    }
            	    break;

            	default :
            	    break loop2;
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

    // $ANTLR start "USEPACKAGE_IGNORE"
    public final void mUSEPACKAGE_IGNORE() throws RecognitionException {
        try {
            int _type = USEPACKAGE_IGNORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:72:18: ( USEPACKAGE ( TEXT_CONTENT )* '{' TEXT_CONTENT ( '}' )* )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:73:2: USEPACKAGE ( TEXT_CONTENT )* '{' TEXT_CONTENT ( '}' )*
            {
            mUSEPACKAGE(); 


            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:73:13: ( TEXT_CONTENT )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '(' && LA3_0 <= ')')||(LA3_0 >= ',' && LA3_0 <= '.')||(LA3_0 >= '0' && LA3_0 <= '9')||LA3_0==';'||(LA3_0 >= 'A' && LA3_0 <= '[')||LA3_0==']'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:73:14: TEXT_CONTENT
            	    {
            	    mTEXT_CONTENT(); 


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            match('{'); 

            mTEXT_CONTENT(); 


            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:73:43: ( '}' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='}') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:73:43: '}'
            	    {
            	    match('}'); 

            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "USEPACKAGE_IGNORE"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:75:3: ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+ )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:75:5: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
            {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:75:5: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '\t' && LA5_0 <= '\n')||(LA5_0 >= '\f' && LA5_0 <= '\r')||LA5_0==' ') ) {
                    alt5=1;
                }


                switch (alt5) {
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
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
        // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:8: ( T__23 | T__24 | T__25 | BEGIN | DOCUMENTCLASS | DOCUMENT | ITEMIZE | ITEM | TEXTBF | TEXTIT | END | USEPACKAGE | INCLUDEGRAPHICS | TITLE | MKTITLE | AUTHOR | DOLLAR | PUNCT | SPECIALCHAR | TEXT_CONTENT | USEPACKAGE_IGNORE | WS )
        int alt6=22;
        switch ( input.LA(1) ) {
        case '\\':
            {
            switch ( input.LA(2) ) {
            case 'b':
                {
                alt6=4;
                }
                break;
            case 'd':
                {
                alt6=5;
                }
                break;
            case 'i':
                {
                int LA6_10 = input.LA(3);

                if ( (LA6_10=='t') ) {
                    alt6=8;
                }
                else if ( (LA6_10=='n') ) {
                    alt6=13;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 10, input);

                    throw nvae;

                }
                }
                break;
            case 't':
                {
                int LA6_11 = input.LA(3);

                if ( (LA6_11=='e') ) {
                    int LA6_24 = input.LA(4);

                    if ( (LA6_24=='x') ) {
                        int LA6_27 = input.LA(5);

                        if ( (LA6_27=='t') ) {
                            int LA6_29 = input.LA(6);

                            if ( (LA6_29=='b') ) {
                                alt6=9;
                            }
                            else if ( (LA6_29=='i') ) {
                                alt6=10;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 6, 29, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 27, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 24, input);

                        throw nvae;

                    }
                }
                else if ( (LA6_11=='i') ) {
                    alt6=14;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 11, input);

                    throw nvae;

                }
                }
                break;
            case 'e':
                {
                alt6=11;
                }
                break;
            case 'u':
                {
                int LA6_13 = input.LA(3);

                if ( (LA6_13=='s') ) {
                    int LA6_26 = input.LA(4);

                    if ( (LA6_26=='e') ) {
                        int LA6_28 = input.LA(5);

                        if ( (LA6_28=='p') ) {
                            int LA6_30 = input.LA(6);

                            if ( (LA6_30=='a') ) {
                                int LA6_33 = input.LA(7);

                                if ( (LA6_33=='c') ) {
                                    int LA6_34 = input.LA(8);

                                    if ( (LA6_34=='k') ) {
                                        int LA6_35 = input.LA(9);

                                        if ( (LA6_35=='a') ) {
                                            int LA6_36 = input.LA(10);

                                            if ( (LA6_36=='g') ) {
                                                int LA6_37 = input.LA(11);

                                                if ( (LA6_37=='e') ) {
                                                    int LA6_38 = input.LA(12);

                                                    if ( ((LA6_38 >= '(' && LA6_38 <= ')')||(LA6_38 >= ',' && LA6_38 <= '.')||(LA6_38 >= '0' && LA6_38 <= '9')||LA6_38==';'||(LA6_38 >= 'A' && LA6_38 <= '[')||LA6_38==']'||(LA6_38 >= 'a' && LA6_38 <= '{')) ) {
                                                        alt6=21;
                                                    }
                                                    else {
                                                        alt6=12;
                                                    }
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("", 6, 37, input);

                                                    throw nvae;

                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 6, 36, input);

                                                throw nvae;

                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 6, 35, input);

                                            throw nvae;

                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 6, 34, input);

                                        throw nvae;

                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 6, 33, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 6, 30, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 28, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 26, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 13, input);

                    throw nvae;

                }
                }
                break;
            case 'm':
                {
                alt6=15;
                }
                break;
            case 'a':
                {
                alt6=16;
                }
                break;
            case 'A':
            case 'B':
            case 'G':
            case 'O':
                {
                alt6=19;
                }
                break;
            default:
                alt6=1;
            }

            }
            break;
        case '{':
            {
            switch ( input.LA(2) ) {
            case 'd':
                {
                alt6=6;
                }
                break;
            case 'i':
                {
                alt6=7;
                }
                break;
            default:
                alt6=2;
            }

            }
            break;
        case '}':
            {
            alt6=3;
            }
            break;
        case '$':
            {
            alt6=17;
            }
            break;
        case '(':
        case ')':
        case ',':
        case '-':
        case '.':
        case ';':
        case '[':
        case ']':
            {
            int LA6_5 = input.LA(2);

            if ( ((LA6_5 >= '\t' && LA6_5 <= '\n')||(LA6_5 >= '\f' && LA6_5 <= '\r')||LA6_5==' '||(LA6_5 >= '(' && LA6_5 <= ')')||(LA6_5 >= ',' && LA6_5 <= '.')||(LA6_5 >= '0' && LA6_5 <= '9')||LA6_5==';'||(LA6_5 >= 'A' && LA6_5 <= '[')||LA6_5==']'||(LA6_5 >= 'a' && LA6_5 <= 'z')) ) {
                alt6=20;
            }
            else {
                alt6=18;
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
            alt6=20;
            }
            break;
        case '\t':
        case '\n':
        case '\f':
        case '\r':
        case ' ':
            {
            alt6=22;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 6, 0, input);

            throw nvae;

        }

        switch (alt6) {
            case 1 :
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:10: T__23
                {
                mT__23(); 


                }
                break;
            case 2 :
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:16: T__24
                {
                mT__24(); 


                }
                break;
            case 3 :
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:22: T__25
                {
                mT__25(); 


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
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:136: DOLLAR
                {
                mDOLLAR(); 


                }
                break;
            case 18 :
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:143: PUNCT
                {
                mPUNCT(); 


                }
                break;
            case 19 :
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:149: SPECIALCHAR
                {
                mSPECIALCHAR(); 


                }
                break;
            case 20 :
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:161: TEXT_CONTENT
                {
                mTEXT_CONTENT(); 


                }
                break;
            case 21 :
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:174: USEPACKAGE_IGNORE
                {
                mUSEPACKAGE_IGNORE(); 


                }
                break;
            case 22 :
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:192: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}