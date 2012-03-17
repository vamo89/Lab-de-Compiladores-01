// $ANTLR 3.4 D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g 2012-03-17 16:31:32

  package compiladores.lab01.parserLatexToHtml;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class LatexToHtmlParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AUTHOR", "BEGIN", "DOCUMENT", "DOCUMENTCLASS", "END", "INCLUDEGRAPHICS", "ITEM", "ITEMIZE", "MKTITLE", "PUNCT", "TEXTBF", "TEXTIT", "TEXT_CONTENT", "TITLE", "USEPACKAGE", "USERPACKAGE", "WS", "'\\\\'", "'{'", "'}'"
    };

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



    // $ANTLR start "author"
    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:38:1: author : AUTHOR '{' TEXT_CONTENT '}' ;
    public final void author() throws RecognitionException {
        try {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:38:17: ( AUTHOR '{' TEXT_CONTENT '}' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:38:18: AUTHOR '{' TEXT_CONTENT '}'
            {
            match(input,AUTHOR,FOLLOW_AUTHOR_in_author330); 

            match(input,22,FOLLOW_22_in_author332); 

            match(input,TEXT_CONTENT,FOLLOW_TEXT_CONTENT_in_author333); 

            match(input,23,FOLLOW_23_in_author334); 

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
    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:39:1: textBF : TEXTBF '{' TEXT_CONTENT '}' ;
    public final void textBF() throws RecognitionException {
        try {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:39:17: ( TEXTBF '{' TEXT_CONTENT '}' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:39:18: TEXTBF '{' TEXT_CONTENT '}'
            {
            match(input,TEXTBF,FOLLOW_TEXTBF_in_textBF349); 

            match(input,22,FOLLOW_22_in_textBF351); 

            match(input,TEXT_CONTENT,FOLLOW_TEXT_CONTENT_in_textBF352); 

            match(input,23,FOLLOW_23_in_textBF353); 

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
    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:40:1: textIT : TEXTIT '{' TEXT_CONTENT '}' ;
    public final void textIT() throws RecognitionException {
        try {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:40:17: ( TEXTIT '{' TEXT_CONTENT '}' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:40:18: TEXTIT '{' TEXT_CONTENT '}'
            {
            match(input,TEXTIT,FOLLOW_TEXTIT_in_textIT368); 

            match(input,22,FOLLOW_22_in_textIT370); 

            match(input,TEXT_CONTENT,FOLLOW_TEXT_CONTENT_in_textIT371); 

            match(input,23,FOLLOW_23_in_textIT372); 

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



    // $ANTLR start "mkTitle"
    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:41:1: mkTitle : MKTITLE ;
    public final void mkTitle() throws RecognitionException {
        try {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:41:17: ( MKTITLE )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:41:18: MKTITLE
            {
            match(input,MKTITLE,FOLLOW_MKTITLE_in_mkTitle386); 

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
    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:42:1: item : ITEM ( TEXT_CONTENT )+ ;
    public final void item() throws RecognitionException {
        try {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:42:17: ( ITEM ( TEXT_CONTENT )+ )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:42:18: ITEM ( TEXT_CONTENT )+
            {
            match(input,ITEM,FOLLOW_ITEM_in_item403); 

            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:42:23: ( TEXT_CONTENT )+
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
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:42:23: TEXT_CONTENT
            	    {
            	    match(input,TEXT_CONTENT,FOLLOW_TEXT_CONTENT_in_item405); 

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
    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:43:1: itemList : BEGIN ITEMIZE ( item | itemList )* END ITEMIZE ;
    public final void itemList() throws RecognitionException {
        try {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:43:17: ( BEGIN ITEMIZE ( item | itemList )* END ITEMIZE )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:43:18: BEGIN ITEMIZE ( item | itemList )* END ITEMIZE
            {
            match(input,BEGIN,FOLLOW_BEGIN_in_itemList419); 

            match(input,ITEMIZE,FOLLOW_ITEMIZE_in_itemList421); 

            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:43:32: ( item | itemList )*
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
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:43:33: item
            	    {
            	    pushFollow(FOLLOW_item_in_itemList424);
            	    item();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:43:38: itemList
            	    {
            	    pushFollow(FOLLOW_itemList_in_itemList426);
            	    itemList();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            match(input,END,FOLLOW_END_in_itemList430); 

            match(input,ITEMIZE,FOLLOW_ITEMIZE_in_itemList432); 

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
    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:44:1: document : BEGIN DOCUMENT command END DOCUMENT ;
    public final void document() throws RecognitionException {
        try {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:44:17: ( BEGIN DOCUMENT command END DOCUMENT )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:44:18: BEGIN DOCUMENT command END DOCUMENT
            {
            match(input,BEGIN,FOLLOW_BEGIN_in_document445); 

            match(input,DOCUMENT,FOLLOW_DOCUMENT_in_document447); 

            pushFollow(FOLLOW_command_in_document449);
            command();

            state._fsp--;


            match(input,END,FOLLOW_END_in_document451); 

            match(input,DOCUMENT,FOLLOW_DOCUMENT_in_document453); 

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
    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:45:1: title : TITLE '{' titleText= TEXT_CONTENT '}' ;
    public final void title() throws RecognitionException {
        Token titleText=null;

        try {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:45:17: ( TITLE '{' titleText= TEXT_CONTENT '}' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:45:18: TITLE '{' titleText= TEXT_CONTENT '}'
            {
            match(input,TITLE,FOLLOW_TITLE_in_title469); 

            match(input,22,FOLLOW_22_in_title471); 

            titleText=(Token)match(input,TEXT_CONTENT,FOLLOW_TEXT_CONTENT_in_title475); 

            match(input,23,FOLLOW_23_in_title477); 

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
    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:46:1: graph : INCLUDEGRAPHICS '{' TEXT_CONTENT '}' ;
    public final void graph() throws RecognitionException {
        try {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:46:17: ( INCLUDEGRAPHICS '{' TEXT_CONTENT '}' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:46:18: INCLUDEGRAPHICS '{' TEXT_CONTENT '}'
            {
            match(input,INCLUDEGRAPHICS,FOLLOW_INCLUDEGRAPHICS_in_graph493); 

            match(input,22,FOLLOW_22_in_graph495); 

            match(input,TEXT_CONTENT,FOLLOW_TEXT_CONTENT_in_graph496); 

            match(input,23,FOLLOW_23_in_graph497); 

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
    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:47:1: documentClass : DOCUMENTCLASS TEXT_CONTENT ( '{' TEXT_CONTENT '}' )* ;
    public final void documentClass() throws RecognitionException {
        try {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:47:17: ( DOCUMENTCLASS TEXT_CONTENT ( '{' TEXT_CONTENT '}' )* )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:47:18: DOCUMENTCLASS TEXT_CONTENT ( '{' TEXT_CONTENT '}' )*
            {
            match(input,DOCUMENTCLASS,FOLLOW_DOCUMENTCLASS_in_documentClass505); 

            match(input,TEXT_CONTENT,FOLLOW_TEXT_CONTENT_in_documentClass507); 

            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:47:45: ( '{' TEXT_CONTENT '}' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:47:46: '{' TEXT_CONTENT '}'
            	    {
            	    match(input,22,FOLLOW_22_in_documentClass510); 

            	    match(input,TEXT_CONTENT,FOLLOW_TEXT_CONTENT_in_documentClass511); 

            	    match(input,23,FOLLOW_23_in_documentClass512); 

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
    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:48:1: otherCommand : '\\\\' TEXT_CONTENT '{' TEXT_CONTENT '}' ;
    public final void otherCommand() throws RecognitionException {
        try {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:48:17: ( '\\\\' TEXT_CONTENT '{' TEXT_CONTENT '}' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:48:18: '\\\\' TEXT_CONTENT '{' TEXT_CONTENT '}'
            {
            match(input,21,FOLLOW_21_in_otherCommand523); 

            match(input,TEXT_CONTENT,FOLLOW_TEXT_CONTENT_in_otherCommand524); 

            match(input,22,FOLLOW_22_in_otherCommand525); 

            match(input,TEXT_CONTENT,FOLLOW_TEXT_CONTENT_in_otherCommand526); 

            match(input,23,FOLLOW_23_in_otherCommand527); 

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
    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:50:1: command : ( documentClass | title | author | textBF | mkTitle | document | graph | itemList | textIT | otherCommand | TEXT_CONTENT )* ;
    public final void command() throws RecognitionException {
        try {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:50:9: ( ( documentClass | title | author | textBF | mkTitle | document | graph | itemList | textIT | otherCommand | TEXT_CONTENT )* )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:50:11: ( documentClass | title | author | textBF | mkTitle | document | graph | itemList | textIT | otherCommand | TEXT_CONTENT )*
            {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:50:11: ( documentClass | title | author | textBF | mkTitle | document | graph | itemList | textIT | otherCommand | TEXT_CONTENT )*
            loop4:
            do {
                int alt4=12;
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
                case 21:
                    {
                    alt4=10;
                    }
                    break;
                case TEXT_CONTENT:
                    {
                    alt4=11;
                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:50:12: documentClass
            	    {
            	    pushFollow(FOLLOW_documentClass_in_command536);
            	    documentClass();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:50:26: title
            	    {
            	    pushFollow(FOLLOW_title_in_command538);
            	    title();

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:50:32: author
            	    {
            	    pushFollow(FOLLOW_author_in_command540);
            	    author();

            	    state._fsp--;


            	    }
            	    break;
            	case 4 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:50:39: textBF
            	    {
            	    pushFollow(FOLLOW_textBF_in_command542);
            	    textBF();

            	    state._fsp--;


            	    }
            	    break;
            	case 5 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:50:46: mkTitle
            	    {
            	    pushFollow(FOLLOW_mkTitle_in_command544);
            	    mkTitle();

            	    state._fsp--;


            	    }
            	    break;
            	case 6 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:50:54: document
            	    {
            	    pushFollow(FOLLOW_document_in_command546);
            	    document();

            	    state._fsp--;


            	    }
            	    break;
            	case 7 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:50:63: graph
            	    {
            	    pushFollow(FOLLOW_graph_in_command548);
            	    graph();

            	    state._fsp--;


            	    }
            	    break;
            	case 8 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:50:69: itemList
            	    {
            	    pushFollow(FOLLOW_itemList_in_command550);
            	    itemList();

            	    state._fsp--;


            	    }
            	    break;
            	case 9 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:50:78: textIT
            	    {
            	    pushFollow(FOLLOW_textIT_in_command552);
            	    textIT();

            	    state._fsp--;


            	    }
            	    break;
            	case 10 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:50:85: otherCommand
            	    {
            	    pushFollow(FOLLOW_otherCommand_in_command554);
            	    otherCommand();

            	    state._fsp--;


            	    }
            	    break;
            	case 11 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:50:98: TEXT_CONTENT
            	    {
            	    match(input,TEXT_CONTENT,FOLLOW_TEXT_CONTENT_in_command556); 

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
    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:59:1: latex : command ;
    public final void latex() throws RecognitionException {
        try {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:59:6: ( command )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:60:5: command
            {
            pushFollow(FOLLOW_command_in_latex621);
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
    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:65:1: rule : latex ;
    public final void rule() throws RecognitionException {
        try {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:65:5: ( latex )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:65:7: latex
            {
            pushFollow(FOLLOW_latex_in_rule643);
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


 

    public static final BitSet FOLLOW_AUTHOR_in_author330 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_author332 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_TEXT_CONTENT_in_author333 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_author334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXTBF_in_textBF349 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_textBF351 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_TEXT_CONTENT_in_textBF352 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_textBF353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXTIT_in_textIT368 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_textIT370 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_TEXT_CONTENT_in_textIT371 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_textIT372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MKTITLE_in_mkTitle386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ITEM_in_item403 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_TEXT_CONTENT_in_item405 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_BEGIN_in_itemList419 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ITEMIZE_in_itemList421 = new BitSet(new long[]{0x0000000000000520L});
    public static final BitSet FOLLOW_item_in_itemList424 = new BitSet(new long[]{0x0000000000000520L});
    public static final BitSet FOLLOW_itemList_in_itemList426 = new BitSet(new long[]{0x0000000000000520L});
    public static final BitSet FOLLOW_END_in_itemList430 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ITEMIZE_in_itemList432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_document445 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DOCUMENT_in_document447 = new BitSet(new long[]{0x000000000023D3B0L});
    public static final BitSet FOLLOW_command_in_document449 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_END_in_document451 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DOCUMENT_in_document453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TITLE_in_title469 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_title471 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_TEXT_CONTENT_in_title475 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_title477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INCLUDEGRAPHICS_in_graph493 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_graph495 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_TEXT_CONTENT_in_graph496 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_graph497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOCUMENTCLASS_in_documentClass505 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_TEXT_CONTENT_in_documentClass507 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_documentClass510 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_TEXT_CONTENT_in_documentClass511 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_documentClass512 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_21_in_otherCommand523 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_TEXT_CONTENT_in_otherCommand524 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_otherCommand525 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_TEXT_CONTENT_in_otherCommand526 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_otherCommand527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_documentClass_in_command536 = new BitSet(new long[]{0x000000000023D2B2L});
    public static final BitSet FOLLOW_title_in_command538 = new BitSet(new long[]{0x000000000023D2B2L});
    public static final BitSet FOLLOW_author_in_command540 = new BitSet(new long[]{0x000000000023D2B2L});
    public static final BitSet FOLLOW_textBF_in_command542 = new BitSet(new long[]{0x000000000023D2B2L});
    public static final BitSet FOLLOW_mkTitle_in_command544 = new BitSet(new long[]{0x000000000023D2B2L});
    public static final BitSet FOLLOW_document_in_command546 = new BitSet(new long[]{0x000000000023D2B2L});
    public static final BitSet FOLLOW_graph_in_command548 = new BitSet(new long[]{0x000000000023D2B2L});
    public static final BitSet FOLLOW_itemList_in_command550 = new BitSet(new long[]{0x000000000023D2B2L});
    public static final BitSet FOLLOW_textIT_in_command552 = new BitSet(new long[]{0x000000000023D2B2L});
    public static final BitSet FOLLOW_otherCommand_in_command554 = new BitSet(new long[]{0x000000000023D2B2L});
    public static final BitSet FOLLOW_TEXT_CONTENT_in_command556 = new BitSet(new long[]{0x000000000023D2B2L});
    public static final BitSet FOLLOW_command_in_latex621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_latex_in_rule643 = new BitSet(new long[]{0x0000000000000002L});

}