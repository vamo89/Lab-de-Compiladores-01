// $ANTLR 3.4 D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g 2012-03-25 19:02:45

  package compiladores.lab01.parserLatexToHtml;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class LatexToHtmlLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int AUTHOR=4;
    public static final int BEGIN=5;
    public static final int BRACKET=6;
    public static final int CLOSEBRACKET=7;
    public static final int CONF=8;
    public static final int DOCUMENT=9;
    public static final int DOCUMENTCLASS=10;
    public static final int DOCUMENTCLASSTOKEN=11;
    public static final int DOLLAR=12;
    public static final int DOLLARSIGN=13;
    public static final int END=14;
    public static final int INCLUDEGRAPHICS=15;
    public static final int ITEM=16;
    public static final int ITEMIZE=17;
    public static final int MKTITLE=18;
    public static final int PUNCT=19;
    public static final int SPECIALCHAR=20;
    public static final int TEXTBF=21;
    public static final int TEXTIT=22;
    public static final int TEXT_CONTENT=23;
    public static final int TITLE=24;
    public static final int USEPACKAGE=25;
    public static final int USEPACKAGE_IGNORE=26;
    public static final int WS=27;

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

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:11:7: ( '{' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:11:9: '{'
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
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:12:7: ( '}' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:12:9: '}'
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
    // $ANTLR end "T__29"

    // $ANTLR start "BEGIN"
    public final void mBEGIN() throws RecognitionException {
        try {
            int _type = BEGIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:26:17: ( '\\\\' 'begin' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:26:18: '\\\\' 'begin'
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
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:27:17: ( '\\\\' 'documentclass' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:27:18: '\\\\' 'documentclass'
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
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:28:17: ( '{document}' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:28:18: '{document}'
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
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:29:17: ( '{itemize}' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:29:18: '{itemize}'
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
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:30:17: ( '\\\\' 'item' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:30:18: '\\\\' 'item'
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
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:31:17: ( '\\\\' 'textbf' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:31:18: '\\\\' 'textbf'
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
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:32:17: ( '\\\\' 'textit' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:32:18: '\\\\' 'textit'
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
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:33:17: ( '\\\\' 'end' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:33:18: '\\\\' 'end'
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
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:34:17: ( '\\\\' 'usepackage' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:34:18: '\\\\' 'usepackage'
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
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:35:17: ( '\\\\' 'includegraphics' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:35:18: '\\\\' 'includegraphics'
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
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:36:17: ( '\\\\' 'title' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:36:18: '\\\\' 'title'
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
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:37:17: ( '\\\\' 'maketitle' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:37:18: '\\\\' 'maketitle'
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
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:38:17: ( '\\\\' 'author' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:38:18: '\\\\' 'author'
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
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:39:17: ( '\\\\$' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:39:18: '\\\\$'
            {
            match("\\$"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOLLAR"

    // $ANTLR start "BRACKET"
    public final void mBRACKET() throws RecognitionException {
        try {
            int _type = BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:40:17: ( '[' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:40:18: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BRACKET"

    // $ANTLR start "CLOSEBRACKET"
    public final void mCLOSEBRACKET() throws RecognitionException {
        try {
            int _type = CLOSEBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:41:17: ( ']' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:41:18: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLOSEBRACKET"

    // $ANTLR start "CONF"
    public final void mCONF() throws RecognitionException {
        try {
            int _type = CONF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:42:17: ( BRACKET ( WS )* TEXT_CONTENT CLOSEBRACKET )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:42:19: BRACKET ( WS )* TEXT_CONTENT CLOSEBRACKET
            {
            mBRACKET(); 


            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:42:27: ( WS )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '\t' && LA1_0 <= '\n')||(LA1_0 >= '\f' && LA1_0 <= '\r')||LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
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
            	    break loop1;
                }
            } while (true);


            mTEXT_CONTENT(); 


            mCLOSEBRACKET(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONF"

    // $ANTLR start "PUNCT"
    public final void mPUNCT() throws RecognitionException {
        try {
            int _type = PUNCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:43:17: ( ( '.' | ',' | ';' | '-' | '(' | ')' | ':' ) )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:
            {
            if ( (input.LA(1) >= '(' && input.LA(1) <= ')')||(input.LA(1) >= ',' && input.LA(1) <= '.')||(input.LA(1) >= ':' && input.LA(1) <= ';') ) {
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
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:44:17: ( '\\\\' ( 'a' .. 'z' | 'A' .. 'Z' )* )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:44:18: '\\\\' ( 'a' .. 'z' | 'A' .. 'Z' )*
            {
            match('\\'); 

            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:44:22: ( 'a' .. 'z' | 'A' .. 'Z' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:
            	    {
            	    if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
    // $ANTLR end "SPECIALCHAR"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:45:17: ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' ) )
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "TEXT_CONTENT"
    public final void mTEXT_CONTENT() throws RecognitionException {
        try {
            int _type = TEXT_CONTENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:46:17: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | PUNCT ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | PUNCT | WS )* )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:46:18: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | PUNCT ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | PUNCT | WS )*
            {
            if ( (input.LA(1) >= '(' && input.LA(1) <= ')')||(input.LA(1) >= ',' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= ';')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:46:59: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | PUNCT | WS )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '\t' && LA3_0 <= '\n')||(LA3_0 >= '\f' && LA3_0 <= '\r')||LA3_0==' '||(LA3_0 >= '(' && LA3_0 <= ')')||(LA3_0 >= ',' && LA3_0 <= '.')||(LA3_0 >= '0' && LA3_0 <= ';')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' '||(input.LA(1) >= '(' && input.LA(1) <= ')')||(input.LA(1) >= ',' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= ';')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
            	    break loop3;
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

    // $ANTLR start "DOLLARSIGN"
    public final void mDOLLARSIGN() throws RecognitionException {
        try {
            int _type = DOLLARSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:47:17: ( '$' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:47:18: '$'
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
    // $ANTLR end "DOLLARSIGN"

    // $ANTLR start "DOCUMENTCLASSTOKEN"
    public final void mDOCUMENTCLASSTOKEN() throws RecognitionException {
        try {
            int _type = DOCUMENTCLASSTOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:49:22: ( DOCUMENTCLASS ( CONF )? '{' TEXT_CONTENT '}' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:49:24: DOCUMENTCLASS ( CONF )? '{' TEXT_CONTENT '}'
            {
            mDOCUMENTCLASS(); 


            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:49:38: ( CONF )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='[') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:49:38: CONF
                    {
                    mCONF(); 


                    }
                    break;

            }


            match('{'); 

            mTEXT_CONTENT(); 


            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOCUMENTCLASSTOKEN"

    // $ANTLR start "USEPACKAGE_IGNORE"
    public final void mUSEPACKAGE_IGNORE() throws RecognitionException {
        try {
            int _type = USEPACKAGE_IGNORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:50:18: ( USEPACKAGE ( CONF )? '{' TEXT_CONTENT '}' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:51:2: USEPACKAGE ( CONF )? '{' TEXT_CONTENT '}'
            {
            mUSEPACKAGE(); 


            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:51:13: ( CONF )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='[') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:51:13: CONF
                    {
                    mCONF(); 


                    }
                    break;

            }


            match('{'); 

            mTEXT_CONTENT(); 


            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "USEPACKAGE_IGNORE"

    public void mTokens() throws RecognitionException {
        // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:8: ( T__28 | T__29 | BEGIN | DOCUMENTCLASS | DOCUMENT | ITEMIZE | ITEM | TEXTBF | TEXTIT | END | USEPACKAGE | INCLUDEGRAPHICS | TITLE | MKTITLE | AUTHOR | DOLLAR | BRACKET | CLOSEBRACKET | CONF | PUNCT | SPECIALCHAR | WS | TEXT_CONTENT | DOLLARSIGN | DOCUMENTCLASSTOKEN | USEPACKAGE_IGNORE )
        int alt6=26;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:10: T__28
                {
                mT__28(); 


                }
                break;
            case 2 :
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:16: T__29
                {
                mT__29(); 


                }
                break;
            case 3 :
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:22: BEGIN
                {
                mBEGIN(); 


                }
                break;
            case 4 :
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:28: DOCUMENTCLASS
                {
                mDOCUMENTCLASS(); 


                }
                break;
            case 5 :
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:42: DOCUMENT
                {
                mDOCUMENT(); 


                }
                break;
            case 6 :
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:51: ITEMIZE
                {
                mITEMIZE(); 


                }
                break;
            case 7 :
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:59: ITEM
                {
                mITEM(); 


                }
                break;
            case 8 :
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:64: TEXTBF
                {
                mTEXTBF(); 


                }
                break;
            case 9 :
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:71: TEXTIT
                {
                mTEXTIT(); 


                }
                break;
            case 10 :
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:78: END
                {
                mEND(); 


                }
                break;
            case 11 :
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:82: USEPACKAGE
                {
                mUSEPACKAGE(); 


                }
                break;
            case 12 :
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:93: INCLUDEGRAPHICS
                {
                mINCLUDEGRAPHICS(); 


                }
                break;
            case 13 :
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:109: TITLE
                {
                mTITLE(); 


                }
                break;
            case 14 :
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:115: MKTITLE
                {
                mMKTITLE(); 


                }
                break;
            case 15 :
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:123: AUTHOR
                {
                mAUTHOR(); 


                }
                break;
            case 16 :
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:130: DOLLAR
                {
                mDOLLAR(); 


                }
                break;
            case 17 :
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:137: BRACKET
                {
                mBRACKET(); 


                }
                break;
            case 18 :
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:145: CLOSEBRACKET
                {
                mCLOSEBRACKET(); 


                }
                break;
            case 19 :
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:158: CONF
                {
                mCONF(); 


                }
                break;
            case 20 :
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:163: PUNCT
                {
                mPUNCT(); 


                }
                break;
            case 21 :
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:169: SPECIALCHAR
                {
                mSPECIALCHAR(); 


                }
                break;
            case 22 :
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:181: WS
                {
                mWS(); 


                }
                break;
            case 23 :
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:184: TEXT_CONTENT
                {
                mTEXT_CONTENT(); 


                }
                break;
            case 24 :
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:197: DOLLARSIGN
                {
                mDOLLARSIGN(); 


                }
                break;
            case 25 :
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:208: DOCUMENTCLASSTOKEN
                {
                mDOCUMENTCLASSTOKEN(); 


                }
                break;
            case 26 :
                // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:1:227: USEPACKAGE_IGNORE
                {
                mUSEPACKAGE_IGNORE(); 


                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\1\uffff\1\14\1\uffff\1\26\1\27\1\uffff\1\31\6\uffff\10\26\5\uffff"+
        "\20\26\1\64\5\26\1\72\3\26\1\uffff\3\26\1\102\1\26\1\uffff\3\26"+
        "\1\107\3\26\1\uffff\2\26\1\115\1\116\1\uffff\2\26\1\121\2\26\2\uffff"+
        "\2\26\1\uffff\7\26\1\135\2\26\1\140\1\uffff\2\26\2\uffff\2\26\1"+
        "\146\1\26\2\uffff\1\26\1\152\1\uffff";
    static final String DFA6_eofS =
        "\153\uffff";
    static final String DFA6_minS =
        "\1\11\1\144\1\uffff\1\44\1\11\1\uffff\1\11\6\uffff\1\145\1\157\1"+
        "\156\1\145\1\156\1\163\1\141\1\165\5\uffff\1\147\1\143\1\145\1\143"+
        "\1\170\1\164\1\144\1\145\1\153\1\164\1\151\1\165\1\155\1\154\1\164"+
        "\1\154\1\101\1\160\1\145\1\150\1\156\1\155\1\101\1\165\1\142\1\145"+
        "\1\uffff\1\141\1\164\1\157\1\101\1\145\1\uffff\1\144\1\146\1\164"+
        "\1\101\1\143\1\151\1\162\1\uffff\1\156\1\145\2\101\1\uffff\1\153"+
        "\1\164\1\101\1\164\1\147\2\uffff\1\141\1\154\1\uffff\1\143\1\162"+
        "\1\147\1\145\1\154\1\141\1\145\1\101\1\141\1\160\1\101\1\uffff\1"+
        "\163\1\150\2\uffff\1\163\1\151\1\101\1\143\2\uffff\1\163\1\101\1"+
        "\uffff";
    static final String DFA6_maxS =
        "\1\175\1\151\1\uffff\1\165\1\172\1\uffff\1\172\6\uffff\1\145\1\157"+
        "\1\164\1\151\1\156\1\163\1\141\1\165\5\uffff\1\147\1\143\1\145\1"+
        "\143\1\170\1\164\1\144\1\145\1\153\1\164\1\151\1\165\1\155\1\154"+
        "\1\164\1\154\1\172\1\160\1\145\1\150\1\156\1\155\1\172\1\165\1\151"+
        "\1\145\1\uffff\1\141\1\164\1\157\1\172\1\145\1\uffff\1\144\1\146"+
        "\1\164\1\172\1\143\1\151\1\162\1\uffff\1\156\1\145\2\172\1\uffff"+
        "\1\153\1\164\1\172\1\164\1\147\2\uffff\1\141\1\154\1\uffff\1\143"+
        "\1\162\1\147\1\145\1\154\1\141\1\145\1\172\1\141\1\160\1\173\1\uffff"+
        "\1\163\1\150\2\uffff\1\163\1\151\1\173\1\143\2\uffff\1\163\1\172"+
        "\1\uffff";
    static final String DFA6_acceptS =
        "\2\uffff\1\2\2\uffff\1\22\1\uffff\1\26\1\27\1\30\1\5\1\6\1\1\10"+
        "\uffff\1\20\1\25\1\21\1\23\1\24\32\uffff\1\12\5\uffff\1\7\7\uffff"+
        "\1\3\4\uffff\1\15\5\uffff\1\10\1\11\2\uffff\1\17\13\uffff\1\16\2"+
        "\uffff\1\13\1\32\4\uffff\1\4\1\31\2\uffff\1\14";
    static final String DFA6_specialS =
        "\153\uffff}>";
    static final String[] DFA6_transitionS = {
            "\2\7\1\uffff\2\7\22\uffff\1\7\3\uffff\1\11\3\uffff\2\6\2\uffff"+
            "\3\6\1\uffff\12\10\2\6\5\uffff\32\10\1\4\1\3\1\5\3\uffff\32"+
            "\10\1\1\1\uffff\1\2",
            "\1\12\4\uffff\1\13",
            "",
            "\1\25\74\uffff\1\24\1\15\1\uffff\1\16\1\21\3\uffff\1\17\3\uffff"+
            "\1\23\6\uffff\1\20\1\22",
            "\2\30\1\uffff\2\30\22\uffff\1\30\7\uffff\2\30\2\uffff\3\30"+
            "\1\uffff\14\30\5\uffff\32\30\6\uffff\32\30",
            "",
            "\2\10\1\uffff\2\10\22\uffff\1\10\7\uffff\2\10\2\uffff\3\10"+
            "\1\uffff\14\10\5\uffff\32\10\6\uffff\32\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\32",
            "\1\33",
            "\1\35\5\uffff\1\34",
            "\1\36\3\uffff\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "",
            "",
            "",
            "",
            "",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\32\26\6\uffff\32\26",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\32\26\6\uffff\32\26",
            "\1\73",
            "\1\74\6\uffff\1\75",
            "\1\76",
            "",
            "\1\77",
            "\1\100",
            "\1\101",
            "\32\26\6\uffff\32\26",
            "\1\103",
            "",
            "\1\104",
            "\1\105",
            "\1\106",
            "\32\26\6\uffff\32\26",
            "\1\110",
            "\1\111",
            "\1\112",
            "",
            "\1\113",
            "\1\114",
            "\32\26\6\uffff\32\26",
            "\32\26\6\uffff\32\26",
            "",
            "\1\117",
            "\1\120",
            "\32\26\6\uffff\32\26",
            "\1\122",
            "\1\123",
            "",
            "",
            "\1\124",
            "\1\125",
            "",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\32\26\6\uffff\32\26",
            "\1\136",
            "\1\137",
            "\32\26\1\141\5\uffff\32\26\1\141",
            "",
            "\1\142",
            "\1\143",
            "",
            "",
            "\1\144",
            "\1\145",
            "\32\26\1\147\5\uffff\32\26\1\147",
            "\1\150",
            "",
            "",
            "\1\151",
            "\32\26\6\uffff\32\26",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__28 | T__29 | BEGIN | DOCUMENTCLASS | DOCUMENT | ITEMIZE | ITEM | TEXTBF | TEXTIT | END | USEPACKAGE | INCLUDEGRAPHICS | TITLE | MKTITLE | AUTHOR | DOLLAR | BRACKET | CLOSEBRACKET | CONF | PUNCT | SPECIALCHAR | WS | TEXT_CONTENT | DOLLARSIGN | DOCUMENTCLASSTOKEN | USEPACKAGE_IGNORE );";
        }
    }
 

}