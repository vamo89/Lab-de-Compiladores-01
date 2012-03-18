// $ANTLR 3.4 D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g 2012-03-18 00:02:51

  package compiladores.lab01.parserLatexToHtml;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class LatexToHtmlParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AUTHOR", "BEGIN", "DOCUMENT", "DOCUMENTCLASS", "DOLLAR", "END", "INCLUDEGRAPHICS", "ITEM", "ITEMIZE", "MKTITLE", "PUNCT", "SPECIALCHAR", "TEXTBF", "TEXTIT", "TEXT_CONTENT", "TITLE", "USEPACKAGE", "USERPACKAGE", "WS", "'\\\\'", "'{'", "'}'"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public LatexToHtmlParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public LatexToHtmlParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return LatexToHtmlParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g"; }


        String titleText = null;



    // $ANTLR start "specialChar"
    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:41:1: specialChar : DOLLAR '\\\\' SPECIALCHAR DOLLAR ;
    public final void specialChar() throws RecognitionException {
        try {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:41:17: ( DOLLAR '\\\\' SPECIALCHAR DOLLAR )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:41:18: DOLLAR '\\\\' SPECIALCHAR DOLLAR
            {
            match(input,DOLLAR,FOLLOW_DOLLAR_in_specialChar351); 

            match(input,23,FOLLOW_23_in_specialChar353); 

            match(input,SPECIALCHAR,FOLLOW_SPECIALCHAR_in_specialChar355); 

            match(input,DOLLAR,FOLLOW_DOLLAR_in_specialChar357); 

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
    // $ANTLR end "specialChar"



    // $ANTLR start "author"
    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:42:1: author : AUTHOR '{' TEXT_CONTENT '}' ;
    public final void author() throws RecognitionException {
        try {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:42:17: ( AUTHOR '{' TEXT_CONTENT '}' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:42:18: AUTHOR '{' TEXT_CONTENT '}'
            {
            match(input,AUTHOR,FOLLOW_AUTHOR_in_author372); 

            match(input,24,FOLLOW_24_in_author374); 

            match(input,TEXT_CONTENT,FOLLOW_TEXT_CONTENT_in_author375); 

            match(input,25,FOLLOW_25_in_author376); 

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
    // $ANTLR end "author"



    // $ANTLR start "textBF"
    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:43:1: textBF : TEXTBF '{' TEXT_CONTENT '}' ;
    public final void textBF() throws RecognitionException {
        try {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:43:17: ( TEXTBF '{' TEXT_CONTENT '}' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:43:18: TEXTBF '{' TEXT_CONTENT '}'
            {
            match(input,TEXTBF,FOLLOW_TEXTBF_in_textBF391); 

            match(input,24,FOLLOW_24_in_textBF393); 

            match(input,TEXT_CONTENT,FOLLOW_TEXT_CONTENT_in_textBF394); 

            match(input,25,FOLLOW_25_in_textBF395); 

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
    // $ANTLR end "textBF"



    // $ANTLR start "textIT"
    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:44:1: textIT : TEXTIT '{' TEXT_CONTENT '}' ;
    public final void textIT() throws RecognitionException {
        try {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:44:17: ( TEXTIT '{' TEXT_CONTENT '}' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:44:18: TEXTIT '{' TEXT_CONTENT '}'
            {
            match(input,TEXTIT,FOLLOW_TEXTIT_in_textIT410); 

            match(input,24,FOLLOW_24_in_textIT412); 

            match(input,TEXT_CONTENT,FOLLOW_TEXT_CONTENT_in_textIT413); 

            match(input,25,FOLLOW_25_in_textIT414); 

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
    // $ANTLR end "textIT"



    // $ANTLR start "dollarIT"
    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:45:1: dollarIT : DOLLAR TEXT_CONTENT DOLLAR ;
    public final void dollarIT() throws RecognitionException {
        try {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:45:17: ( DOLLAR TEXT_CONTENT DOLLAR )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:45:19: DOLLAR TEXT_CONTENT DOLLAR
            {
            match(input,DOLLAR,FOLLOW_DOLLAR_in_dollarIT428); 

            match(input,TEXT_CONTENT,FOLLOW_TEXT_CONTENT_in_dollarIT430); 

            match(input,DOLLAR,FOLLOW_DOLLAR_in_dollarIT432); 

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
    // $ANTLR end "dollarIT"



    // $ANTLR start "mkTitle"
    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:46:1: mkTitle : MKTITLE ;
    public final void mkTitle() throws RecognitionException {
        try {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:46:17: ( MKTITLE )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:46:18: MKTITLE
            {
            match(input,MKTITLE,FOLLOW_MKTITLE_in_mkTitle446); 

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
    // $ANTLR end "mkTitle"



    // $ANTLR start "item"
    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:47:1: item : ITEM ( TEXT_CONTENT )+ ;
    public final void item() throws RecognitionException {
        try {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:47:17: ( ITEM ( TEXT_CONTENT )+ )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:47:18: ITEM ( TEXT_CONTENT )+
            {
            match(input,ITEM,FOLLOW_ITEM_in_item463); 

            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:47:23: ( TEXT_CONTENT )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==TEXT_CONTENT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:47:23: TEXT_CONTENT
            	    {
            	    match(input,TEXT_CONTENT,FOLLOW_TEXT_CONTENT_in_item465); 

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
    // $ANTLR end "item"



    // $ANTLR start "itemList"
    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:48:1: itemList : BEGIN ITEMIZE ( item | itemList )* END ITEMIZE ;
    public final void itemList() throws RecognitionException {
        try {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:48:17: ( BEGIN ITEMIZE ( item | itemList )* END ITEMIZE )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:48:18: BEGIN ITEMIZE ( item | itemList )* END ITEMIZE
            {
            match(input,BEGIN,FOLLOW_BEGIN_in_itemList479); 

            match(input,ITEMIZE,FOLLOW_ITEMIZE_in_itemList481); 

            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:48:32: ( item | itemList )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==ITEM) ) {
                    alt2=1;
                }
                else if ( (LA2_0==BEGIN) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:48:33: item
            	    {
            	    pushFollow(FOLLOW_item_in_itemList484);
            	    item();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:48:38: itemList
            	    {
            	    pushFollow(FOLLOW_itemList_in_itemList486);
            	    itemList();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            match(input,END,FOLLOW_END_in_itemList490); 

            match(input,ITEMIZE,FOLLOW_ITEMIZE_in_itemList492); 

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
    // $ANTLR end "itemList"



    // $ANTLR start "document"
    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:49:1: document : BEGIN DOCUMENT command END DOCUMENT ;
    public final void document() throws RecognitionException {
        try {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:49:17: ( BEGIN DOCUMENT command END DOCUMENT )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:49:18: BEGIN DOCUMENT command END DOCUMENT
            {
            match(input,BEGIN,FOLLOW_BEGIN_in_document505); 

            match(input,DOCUMENT,FOLLOW_DOCUMENT_in_document507); 

            pushFollow(FOLLOW_command_in_document509);
            command();

            state._fsp--;


            match(input,END,FOLLOW_END_in_document511); 

            match(input,DOCUMENT,FOLLOW_DOCUMENT_in_document513); 

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
    // $ANTLR end "document"



    // $ANTLR start "title"
    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:50:1: title : TITLE '{' titleText= TEXT_CONTENT '}' ;
    public final void title() throws RecognitionException {
        Token titleText=null;

        try {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:50:17: ( TITLE '{' titleText= TEXT_CONTENT '}' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:50:18: TITLE '{' titleText= TEXT_CONTENT '}'
            {
            match(input,TITLE,FOLLOW_TITLE_in_title529); 

            match(input,24,FOLLOW_24_in_title531); 

            titleText=(Token)match(input,TEXT_CONTENT,FOLLOW_TEXT_CONTENT_in_title535); 

            match(input,25,FOLLOW_25_in_title537); 

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
    // $ANTLR end "title"



    // $ANTLR start "graph"
    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:51:1: graph : INCLUDEGRAPHICS '{' TEXT_CONTENT '}' ;
    public final void graph() throws RecognitionException {
        try {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:51:17: ( INCLUDEGRAPHICS '{' TEXT_CONTENT '}' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:51:18: INCLUDEGRAPHICS '{' TEXT_CONTENT '}'
            {
            match(input,INCLUDEGRAPHICS,FOLLOW_INCLUDEGRAPHICS_in_graph553); 

            match(input,24,FOLLOW_24_in_graph555); 

            match(input,TEXT_CONTENT,FOLLOW_TEXT_CONTENT_in_graph556); 

            match(input,25,FOLLOW_25_in_graph557); 

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
    // $ANTLR end "graph"



    // $ANTLR start "documentClass"
    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:52:1: documentClass : DOCUMENTCLASS TEXT_CONTENT ( '{' TEXT_CONTENT '}' )* ;
    public final void documentClass() throws RecognitionException {
        try {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:52:17: ( DOCUMENTCLASS TEXT_CONTENT ( '{' TEXT_CONTENT '}' )* )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:52:18: DOCUMENTCLASS TEXT_CONTENT ( '{' TEXT_CONTENT '}' )*
            {
            match(input,DOCUMENTCLASS,FOLLOW_DOCUMENTCLASS_in_documentClass565); 

            match(input,TEXT_CONTENT,FOLLOW_TEXT_CONTENT_in_documentClass567); 

            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:52:45: ( '{' TEXT_CONTENT '}' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==24) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:52:46: '{' TEXT_CONTENT '}'
            	    {
            	    match(input,24,FOLLOW_24_in_documentClass570); 

            	    match(input,TEXT_CONTENT,FOLLOW_TEXT_CONTENT_in_documentClass571); 

            	    match(input,25,FOLLOW_25_in_documentClass572); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


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
    // $ANTLR end "documentClass"



    // $ANTLR start "otherCommand"
    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:53:1: otherCommand : '\\\\' TEXT_CONTENT '{' TEXT_CONTENT '}' ;
    public final void otherCommand() throws RecognitionException {
        try {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:53:17: ( '\\\\' TEXT_CONTENT '{' TEXT_CONTENT '}' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:53:18: '\\\\' TEXT_CONTENT '{' TEXT_CONTENT '}'
            {
            match(input,23,FOLLOW_23_in_otherCommand583); 

            match(input,TEXT_CONTENT,FOLLOW_TEXT_CONTENT_in_otherCommand584); 

            match(input,24,FOLLOW_24_in_otherCommand585); 

            match(input,TEXT_CONTENT,FOLLOW_TEXT_CONTENT_in_otherCommand586); 

            match(input,25,FOLLOW_25_in_otherCommand587); 

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
    // $ANTLR end "otherCommand"



    // $ANTLR start "command"
    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:55:1: command : ( documentClass | title | author | textBF | mkTitle | document | graph | itemList | textIT | otherCommand | specialChar | dollarIT | TEXT_CONTENT )* ;
    public final void command() throws RecognitionException {
        try {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:55:9: ( ( documentClass | title | author | textBF | mkTitle | document | graph | itemList | textIT | otherCommand | specialChar | dollarIT | TEXT_CONTENT )* )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:55:11: ( documentClass | title | author | textBF | mkTitle | document | graph | itemList | textIT | otherCommand | specialChar | dollarIT | TEXT_CONTENT )*
            {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:55:11: ( documentClass | title | author | textBF | mkTitle | document | graph | itemList | textIT | otherCommand | specialChar | dollarIT | TEXT_CONTENT )*
            loop4:
            do {
                int alt4=14;
                switch ( input.LA(1) ) {
                case DOCUMENTCLASS:
                    {
                    alt4=1;
                    }
                    break;
                case TITLE:
                    {
                    alt4=2;
                    }
                    break;
                case AUTHOR:
                    {
                    alt4=3;
                    }
                    break;
                case TEXTBF:
                    {
                    alt4=4;
                    }
                    break;
                case MKTITLE:
                    {
                    alt4=5;
                    }
                    break;
                case BEGIN:
                    {
                    int LA4_7 = input.LA(2);

                    if ( (LA4_7==DOCUMENT) ) {
                        alt4=6;
                    }
                    else if ( (LA4_7==ITEMIZE) ) {
                        alt4=8;
                    }


                    }
                    break;
                case INCLUDEGRAPHICS:
                    {
                    alt4=7;
                    }
                    break;
                case TEXTIT:
                    {
                    alt4=9;
                    }
                    break;
                case 23:
                    {
                    alt4=10;
                    }
                    break;
                case DOLLAR:
                    {
                    int LA4_11 = input.LA(2);

                    if ( (LA4_11==23) ) {
                        alt4=11;
                    }
                    else if ( (LA4_11==TEXT_CONTENT) ) {
                        alt4=12;
                    }


                    }
                    break;
                case TEXT_CONTENT:
                    {
                    alt4=13;
                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:55:12: documentClass
            	    {
            	    pushFollow(FOLLOW_documentClass_in_command596);
            	    documentClass();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:55:26: title
            	    {
            	    pushFollow(FOLLOW_title_in_command598);
            	    title();

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:55:32: author
            	    {
            	    pushFollow(FOLLOW_author_in_command600);
            	    author();

            	    state._fsp--;


            	    }
            	    break;
            	case 4 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:55:39: textBF
            	    {
            	    pushFollow(FOLLOW_textBF_in_command602);
            	    textBF();

            	    state._fsp--;


            	    }
            	    break;
            	case 5 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:55:46: mkTitle
            	    {
            	    pushFollow(FOLLOW_mkTitle_in_command604);
            	    mkTitle();

            	    state._fsp--;


            	    }
            	    break;
            	case 6 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:55:54: document
            	    {
            	    pushFollow(FOLLOW_document_in_command606);
            	    document();

            	    state._fsp--;


            	    }
            	    break;
            	case 7 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:55:63: graph
            	    {
            	    pushFollow(FOLLOW_graph_in_command608);
            	    graph();

            	    state._fsp--;


            	    }
            	    break;
            	case 8 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:55:69: itemList
            	    {
            	    pushFollow(FOLLOW_itemList_in_command610);
            	    itemList();

            	    state._fsp--;


            	    }
            	    break;
            	case 9 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:55:78: textIT
            	    {
            	    pushFollow(FOLLOW_textIT_in_command612);
            	    textIT();

            	    state._fsp--;


            	    }
            	    break;
            	case 10 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:55:85: otherCommand
            	    {
            	    pushFollow(FOLLOW_otherCommand_in_command614);
            	    otherCommand();

            	    state._fsp--;


            	    }
            	    break;
            	case 11 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:55:98: specialChar
            	    {
            	    pushFollow(FOLLOW_specialChar_in_command616);
            	    specialChar();

            	    state._fsp--;


            	    }
            	    break;
            	case 12 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:55:110: dollarIT
            	    {
            	    pushFollow(FOLLOW_dollarIT_in_command618);
            	    dollarIT();

            	    state._fsp--;


            	    }
            	    break;
            	case 13 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:55:119: TEXT_CONTENT
            	    {
            	    match(input,TEXT_CONTENT,FOLLOW_TEXT_CONTENT_in_command620); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


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
    // $ANTLR end "command"



    // $ANTLR start "latex"
    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:64:1: latex : command ;
    public final void latex() throws RecognitionException {
        try {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:64:6: ( command )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:65:5: command
            {
            pushFollow(FOLLOW_command_in_latex685);
            command();

            state._fsp--;


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
    // $ANTLR end "latex"



    // $ANTLR start "rule"
    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:70:1: rule : latex ;
    public final void rule() throws RecognitionException {
        try {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:70:5: ( latex )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:70:7: latex
            {
            pushFollow(FOLLOW_latex_in_rule707);
            latex();

            state._fsp--;


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


 

    public static final BitSet FOLLOW_DOLLAR_in_specialChar351 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_specialChar353 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SPECIALCHAR_in_specialChar355 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_DOLLAR_in_specialChar357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AUTHOR_in_author372 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_author374 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_TEXT_CONTENT_in_author375 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_author376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXTBF_in_textBF391 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_textBF393 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_TEXT_CONTENT_in_textBF394 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_textBF395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXTIT_in_textIT410 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_textIT412 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_TEXT_CONTENT_in_textIT413 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_textIT414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOLLAR_in_dollarIT428 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_TEXT_CONTENT_in_dollarIT430 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_DOLLAR_in_dollarIT432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MKTITLE_in_mkTitle446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ITEM_in_item463 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_TEXT_CONTENT_in_item465 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_BEGIN_in_itemList479 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ITEMIZE_in_itemList481 = new BitSet(new long[]{0x0000000000000A20L});
    public static final BitSet FOLLOW_item_in_itemList484 = new BitSet(new long[]{0x0000000000000A20L});
    public static final BitSet FOLLOW_itemList_in_itemList486 = new BitSet(new long[]{0x0000000000000A20L});
    public static final BitSet FOLLOW_END_in_itemList490 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ITEMIZE_in_itemList492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_document505 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DOCUMENT_in_document507 = new BitSet(new long[]{0x00000000008F27B0L});
    public static final BitSet FOLLOW_command_in_document509 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_END_in_document511 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DOCUMENT_in_document513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TITLE_in_title529 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_title531 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_TEXT_CONTENT_in_title535 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_title537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INCLUDEGRAPHICS_in_graph553 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_graph555 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_TEXT_CONTENT_in_graph556 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_graph557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOCUMENTCLASS_in_documentClass565 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_TEXT_CONTENT_in_documentClass567 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_documentClass570 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_TEXT_CONTENT_in_documentClass571 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_documentClass572 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_23_in_otherCommand583 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_TEXT_CONTENT_in_otherCommand584 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_otherCommand585 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_TEXT_CONTENT_in_otherCommand586 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_otherCommand587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_documentClass_in_command596 = new BitSet(new long[]{0x00000000008F25B2L});
    public static final BitSet FOLLOW_title_in_command598 = new BitSet(new long[]{0x00000000008F25B2L});
    public static final BitSet FOLLOW_author_in_command600 = new BitSet(new long[]{0x00000000008F25B2L});
    public static final BitSet FOLLOW_textBF_in_command602 = new BitSet(new long[]{0x00000000008F25B2L});
    public static final BitSet FOLLOW_mkTitle_in_command604 = new BitSet(new long[]{0x00000000008F25B2L});
    public static final BitSet FOLLOW_document_in_command606 = new BitSet(new long[]{0x00000000008F25B2L});
    public static final BitSet FOLLOW_graph_in_command608 = new BitSet(new long[]{0x00000000008F25B2L});
    public static final BitSet FOLLOW_itemList_in_command610 = new BitSet(new long[]{0x00000000008F25B2L});
    public static final BitSet FOLLOW_textIT_in_command612 = new BitSet(new long[]{0x00000000008F25B2L});
    public static final BitSet FOLLOW_otherCommand_in_command614 = new BitSet(new long[]{0x00000000008F25B2L});
    public static final BitSet FOLLOW_specialChar_in_command616 = new BitSet(new long[]{0x00000000008F25B2L});
    public static final BitSet FOLLOW_dollarIT_in_command618 = new BitSet(new long[]{0x00000000008F25B2L});
    public static final BitSet FOLLOW_TEXT_CONTENT_in_command620 = new BitSet(new long[]{0x00000000008F25B2L});
    public static final BitSet FOLLOW_command_in_latex685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_latex_in_rule707 = new BitSet(new long[]{0x0000000000000002L});

}