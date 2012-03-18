// $ANTLR 3.4 D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g 2012-03-18 00:02:52

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
    public static final int USERPACKAGE=21;
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
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:33:17: ( '\\\\author' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:33:18: '\\\\author'
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
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:35:17: ( ( '.' | ',' | ';' | '-' | '[' | ']' ) )
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
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:36:17: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | PUNCT ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | PUNCT | WS )* )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:36:18: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | PUNCT ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | PUNCT | WS )*
            {
            if ( (input.LA(1) >= ',' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= '9')||input.LA(1)==';'||(input.LA(1) >= 'A' && input.LA(1) <= '[')||input.LA(1)==']'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:36:59: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | PUNCT | WS )*
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
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:36:60: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }
            	    break;
            	case 2 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:36:71: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); 

            	    }
            	    break;
            	case 3 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:36:82: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;
            	case 4 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:36:93: PUNCT
            	    {
            	    mPUNCT(); 


            	    }
            	    break;
            	case 5 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:36:101: WS
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

    // $ANTLR start "SPECIALCHAR"
    public final void mSPECIALCHAR() throws RecognitionException {
        try {
            int _type = SPECIALCHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:38:17: ( 'Omega(n)' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:38:18: 'Omega(n)'
            {
            match("Omega(n)"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SPECIALCHAR"

    // $ANTLR start "USERPACKAGE"
    public final void mUSERPACKAGE() throws RecognitionException {
        try {
            int _type = USERPACKAGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:58:12: ( USEPACKAGE ( TEXT_CONTENT | '{' TEXT_CONTENT '}' )* )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:59:2: USEPACKAGE ( TEXT_CONTENT | '{' TEXT_CONTENT '}' )*
            {
            mUSEPACKAGE(); 


            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:59:13: ( TEXT_CONTENT | '{' TEXT_CONTENT '}' )*
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
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:59:14: TEXT_CONTENT
            	    {
            	    mTEXT_CONTENT(); 


            	    }
            	    break;
            	case 2 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:59:29: '{' TEXT_CONTENT '}'
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
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:61:3: ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+ )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:61:5: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
            {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:61:5: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
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
        // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:8: ( T__23 | T__24 | T__25 | BEGIN | DOCUMENTCLASS | DOCUMENT | ITEMIZE | ITEM | TEXTBF | TEXTIT | END | USEPACKAGE | INCLUDEGRAPHICS | TITLE | MKTITLE | AUTHOR | DOLLAR | PUNCT | TEXT_CONTENT | SPECIALCHAR | USERPACKAGE | WS )
        int alt4=22;
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
                int LA4_11 = input.LA(3);

                if ( (LA4_11=='t') ) {
                    alt4=8;
                }
                else if ( (LA4_11=='n') ) {
                    alt4=13;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 11, input);

                    throw nvae;

                }
                }
                break;
            case 't':
                {
                int LA4_12 = input.LA(3);

                if ( (LA4_12=='e') ) {
                    int LA4_25 = input.LA(4);

                    if ( (LA4_25=='x') ) {
                        int LA4_29 = input.LA(5);

                        if ( (LA4_29=='t') ) {
                            int LA4_32 = input.LA(6);

                            if ( (LA4_32=='b') ) {
                                alt4=9;
                            }
                            else if ( (LA4_32=='i') ) {
                                alt4=10;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 4, 32, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 29, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 25, input);

                        throw nvae;

                    }
                }
                else if ( (LA4_12=='i') ) {
                    alt4=14;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 12, input);

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
                int LA4_14 = input.LA(3);

                if ( (LA4_14=='s') ) {
                    int LA4_27 = input.LA(4);

                    if ( (LA4_27=='e') ) {
                        int LA4_30 = input.LA(5);

                        if ( (LA4_30=='p') ) {
                            int LA4_33 = input.LA(6);

                            if ( (LA4_33=='a') ) {
                                int LA4_37 = input.LA(7);

                                if ( (LA4_37=='c') ) {
                                    int LA4_39 = input.LA(8);

                                    if ( (LA4_39=='k') ) {
                                        int LA4_40 = input.LA(9);

                                        if ( (LA4_40=='a') ) {
                                            int LA4_41 = input.LA(10);

                                            if ( (LA4_41=='g') ) {
                                                int LA4_42 = input.LA(11);

                                                if ( (LA4_42=='e') ) {
                                                    int LA4_43 = input.LA(12);

                                                    if ( ((LA4_43 >= ',' && LA4_43 <= '.')||(LA4_43 >= '0' && LA4_43 <= '9')||LA4_43==';'||(LA4_43 >= 'A' && LA4_43 <= '[')||LA4_43==']'||(LA4_43 >= 'a' && LA4_43 <= '{')) ) {
                                                        alt4=21;
                                                    }
                                                    else {
                                                        alt4=12;
                                                    }
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("", 4, 42, input);

                                                    throw nvae;

                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 4, 41, input);

                                                throw nvae;

                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 4, 40, input);

                                            throw nvae;

                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 4, 39, input);

                                        throw nvae;

                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 4, 37, input);

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
                                new NoViableAltException("", 4, 30, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 27, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 14, input);

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
        case '$':
            {
            alt4=17;
            }
            break;
        case ',':
        case '-':
        case '.':
        case ';':
        case '[':
        case ']':
            {
            int LA4_5 = input.LA(2);

            if ( ((LA4_5 >= '\t' && LA4_5 <= '\n')||(LA4_5 >= '\f' && LA4_5 <= '\r')||LA4_5==' '||(LA4_5 >= ',' && LA4_5 <= '.')||(LA4_5 >= '0' && LA4_5 <= '9')||LA4_5==';'||(LA4_5 >= 'A' && LA4_5 <= '[')||LA4_5==']'||(LA4_5 >= 'a' && LA4_5 <= 'z')) ) {
                alt4=19;
            }
            else {
                alt4=18;
            }
            }
            break;
        case 'O':
            {
            int LA4_6 = input.LA(2);

            if ( (LA4_6=='m') ) {
                int LA4_22 = input.LA(3);

                if ( (LA4_22=='e') ) {
                    int LA4_28 = input.LA(4);

                    if ( (LA4_28=='g') ) {
                        int LA4_31 = input.LA(5);

                        if ( (LA4_31=='a') ) {
                            int LA4_34 = input.LA(6);

                            if ( (LA4_34=='(') ) {
                                alt4=20;
                            }
                            else {
                                alt4=19;
                            }
                        }
                        else {
                            alt4=19;
                        }
                    }
                    else {
                        alt4=19;
                    }
                }
                else {
                    alt4=19;
                }
            }
            else {
                alt4=19;
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
            alt4=19;
            }
            break;
        case '\t':
        case '\n':
        case '\f':
        case '\r':
        case ' ':
            {
            alt4=22;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 4, 0, input);

            throw nvae;

        }

        switch (alt4) {
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
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:149: TEXT_CONTENT
                {
                mTEXT_CONTENT(); 


                }
                break;
            case 20 :
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:162: SPECIALCHAR
                {
                mSPECIALCHAR(); 


                }
                break;
            case 21 :
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:174: USERPACKAGE
                {
                mUSERPACKAGE(); 


                }
                break;
            case 22 :
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:186: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}