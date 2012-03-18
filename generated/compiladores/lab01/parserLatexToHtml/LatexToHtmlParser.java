// $ANTLR 3.4 D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g 2012-03-18 02:02:48

  package compiladores.lab01.parserLatexToHtml;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class LatexToHtmlParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AUTHOR", "BEGIN", "DOCUMENT", "DOCUMENTCLASS", "DOLLAR", "END", "INCLUDEGRAPHICS", "ITEM", "ITEMIZE", "MKTITLE", "PUNCT", "SPECIALCHAR", "TEXTBF", "TEXTIT", "TEXT_CONTENT", "TITLE", "USEPACKAGE", "USEPACKAGE_IGNORE", "WS", "'\\\\'", "'{'", "'}'"
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
    public static final int USEPACKAGE_IGNORE=21;
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



    // $ANTLR start "body"
    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:41:1: body : ( TEXT_CONTENT | SPECIALCHAR );
    public final void body() throws RecognitionException {
        try {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:41:17: ( TEXT_CONTENT | SPECIALCHAR )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:
            {
            if ( input.LA(1)==SPECIALCHAR||input.LA(1)==TEXT_CONTENT ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "body"



    // $ANTLR start "author"
    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:42:1: author : AUTHOR '{' ( body )* '}' ;
    public final void author() throws RecognitionException {
        try {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:42:17: ( AUTHOR '{' ( body )* '}' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:42:18: AUTHOR '{' ( body )* '}'
            {
            match(input,AUTHOR,FOLLOW_AUTHOR_in_author390); 

            match(input,24,FOLLOW_24_in_author392); 

            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:42:28: ( body )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==SPECIALCHAR||LA1_0==TEXT_CONTENT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:42:28: body
            	    {
            	    pushFollow(FOLLOW_body_in_author393);
            	    body();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            match(input,25,FOLLOW_25_in_author395); 

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
    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:43:1: textBF : TEXTBF '{' ( body )* '}' ;
    public final void textBF() throws RecognitionException {
        try {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:43:17: ( TEXTBF '{' ( body )* '}' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:43:18: TEXTBF '{' ( body )* '}'
            {
            match(input,TEXTBF,FOLLOW_TEXTBF_in_textBF410); 

            match(input,24,FOLLOW_24_in_textBF412); 

            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:43:28: ( body )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==SPECIALCHAR||LA2_0==TEXT_CONTENT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:43:28: body
            	    {
            	    pushFollow(FOLLOW_body_in_textBF413);
            	    body();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            match(input,25,FOLLOW_25_in_textBF415); 

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
    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:44:1: textIT : TEXTIT '{' ( body )* '}' ;
    public final void textIT() throws RecognitionException {
        try {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:44:17: ( TEXTIT '{' ( body )* '}' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:44:18: TEXTIT '{' ( body )* '}'
            {
            match(input,TEXTIT,FOLLOW_TEXTIT_in_textIT430); 

            match(input,24,FOLLOW_24_in_textIT432); 

            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:44:28: ( body )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==SPECIALCHAR||LA3_0==TEXT_CONTENT) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:44:28: body
            	    {
            	    pushFollow(FOLLOW_body_in_textIT433);
            	    body();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            match(input,25,FOLLOW_25_in_textIT435); 

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
    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:45:1: dollarIT : DOLLAR ( body )* DOLLAR ;
    public final void dollarIT() throws RecognitionException {
        try {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:45:17: ( DOLLAR ( body )* DOLLAR )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:45:19: DOLLAR ( body )* DOLLAR
            {
            match(input,DOLLAR,FOLLOW_DOLLAR_in_dollarIT449); 

            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:45:26: ( body )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==SPECIALCHAR||LA4_0==TEXT_CONTENT) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:45:26: body
            	    {
            	    pushFollow(FOLLOW_body_in_dollarIT451);
            	    body();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            match(input,DOLLAR,FOLLOW_DOLLAR_in_dollarIT454); 

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
            match(input,MKTITLE,FOLLOW_MKTITLE_in_mkTitle468); 

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
            match(input,ITEM,FOLLOW_ITEM_in_item485); 

            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:47:23: ( TEXT_CONTENT )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==TEXT_CONTENT) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:47:23: TEXT_CONTENT
            	    {
            	    match(input,TEXT_CONTENT,FOLLOW_TEXT_CONTENT_in_item487); 

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
            match(input,BEGIN,FOLLOW_BEGIN_in_itemList501); 

            match(input,ITEMIZE,FOLLOW_ITEMIZE_in_itemList503); 

            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:48:32: ( item | itemList )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==ITEM) ) {
                    alt6=1;
                }
                else if ( (LA6_0==BEGIN) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:48:33: item
            	    {
            	    pushFollow(FOLLOW_item_in_itemList506);
            	    item();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:48:38: itemList
            	    {
            	    pushFollow(FOLLOW_itemList_in_itemList508);
            	    itemList();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            match(input,END,FOLLOW_END_in_itemList512); 

            match(input,ITEMIZE,FOLLOW_ITEMIZE_in_itemList514); 

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
            match(input,BEGIN,FOLLOW_BEGIN_in_document527); 

            match(input,DOCUMENT,FOLLOW_DOCUMENT_in_document529); 

            pushFollow(FOLLOW_command_in_document531);
            command();

            state._fsp--;


            match(input,END,FOLLOW_END_in_document533); 

            match(input,DOCUMENT,FOLLOW_DOCUMENT_in_document535); 

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
            match(input,TITLE,FOLLOW_TITLE_in_title551); 

            match(input,24,FOLLOW_24_in_title553); 

            titleText=(Token)match(input,TEXT_CONTENT,FOLLOW_TEXT_CONTENT_in_title557); 

            match(input,25,FOLLOW_25_in_title559); 

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
            match(input,INCLUDEGRAPHICS,FOLLOW_INCLUDEGRAPHICS_in_graph575); 

            match(input,24,FOLLOW_24_in_graph577); 

            match(input,TEXT_CONTENT,FOLLOW_TEXT_CONTENT_in_graph578); 

            match(input,25,FOLLOW_25_in_graph579); 

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
            match(input,DOCUMENTCLASS,FOLLOW_DOCUMENTCLASS_in_documentClass587); 

            match(input,TEXT_CONTENT,FOLLOW_TEXT_CONTENT_in_documentClass589); 

            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:52:45: ( '{' TEXT_CONTENT '}' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==24) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:52:46: '{' TEXT_CONTENT '}'
            	    {
            	    match(input,24,FOLLOW_24_in_documentClass592); 

            	    match(input,TEXT_CONTENT,FOLLOW_TEXT_CONTENT_in_documentClass593); 

            	    match(input,25,FOLLOW_25_in_documentClass594); 

            	    }
            	    break;

            	default :
            	    break loop7;
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
            match(input,23,FOLLOW_23_in_otherCommand605); 

            match(input,TEXT_CONTENT,FOLLOW_TEXT_CONTENT_in_otherCommand606); 

            match(input,24,FOLLOW_24_in_otherCommand607); 

            match(input,TEXT_CONTENT,FOLLOW_TEXT_CONTENT_in_otherCommand608); 

            match(input,25,FOLLOW_25_in_otherCommand609); 

            throw new Excepion("COMMAND NOT FOUND");

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
    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:55:1: command : ( documentClass | title | author | textBF | mkTitle | document | graph | itemList | textIT | dollarIT | TEXT_CONTENT | SPECIALCHAR )* ;
    public final void command() throws RecognitionException {
        try {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:55:9: ( ( documentClass | title | author | textBF | mkTitle | document | graph | itemList | textIT | dollarIT | TEXT_CONTENT | SPECIALCHAR )* )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:55:11: ( documentClass | title | author | textBF | mkTitle | document | graph | itemList | textIT | dollarIT | TEXT_CONTENT | SPECIALCHAR )*
            {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:55:11: ( documentClass | title | author | textBF | mkTitle | document | graph | itemList | textIT | dollarIT | TEXT_CONTENT | SPECIALCHAR )*
            loop8:
            do {
                int alt8=13;
                switch ( input.LA(1) ) {
                case DOCUMENTCLASS:
                    {
                    alt8=1;
                    }
                    break;
                case TITLE:
                    {
                    alt8=2;
                    }
                    break;
                case AUTHOR:
                    {
                    alt8=3;
                    }
                    break;
                case TEXTBF:
                    {
                    alt8=4;
                    }
                    break;
                case MKTITLE:
                    {
                    alt8=5;
                    }
                    break;
                case BEGIN:
                    {
                    int LA8_7 = input.LA(2);

                    if ( (LA8_7==DOCUMENT) ) {
                        alt8=6;
                    }
                    else if ( (LA8_7==ITEMIZE) ) {
                        alt8=8;
                    }


                    }
                    break;
                case INCLUDEGRAPHICS:
                    {
                    alt8=7;
                    }
                    break;
                case TEXTIT:
                    {
                    alt8=9;
                    }
                    break;
                case DOLLAR:
                    {
                    alt8=10;
                    }
                    break;
                case TEXT_CONTENT:
                    {
                    alt8=11;
                    }
                    break;
                case SPECIALCHAR:
                    {
                    alt8=12;
                    }
                    break;

                }

                switch (alt8) {
            	case 1 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:56:2: documentClass
            	    {
            	    pushFollow(FOLLOW_documentClass_in_command622);
            	    documentClass();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:57:2: title
            	    {
            	    pushFollow(FOLLOW_title_in_command628);
            	    title();

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:58:2: author
            	    {
            	    pushFollow(FOLLOW_author_in_command642);
            	    author();

            	    state._fsp--;


            	    }
            	    break;
            	case 4 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:59:2: textBF
            	    {
            	    pushFollow(FOLLOW_textBF_in_command655);
            	    textBF();

            	    state._fsp--;


            	    }
            	    break;
            	case 5 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:60:2: mkTitle
            	    {
            	    pushFollow(FOLLOW_mkTitle_in_command668);
            	    mkTitle();

            	    state._fsp--;


            	    }
            	    break;
            	case 6 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:61:2: document
            	    {
            	    pushFollow(FOLLOW_document_in_command680);
            	    document();

            	    state._fsp--;


            	    }
            	    break;
            	case 7 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:62:2: graph
            	    {
            	    pushFollow(FOLLOW_graph_in_command691);
            	    graph();

            	    state._fsp--;


            	    }
            	    break;
            	case 8 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:63:2: itemList
            	    {
            	    pushFollow(FOLLOW_itemList_in_command705);
            	    itemList();

            	    state._fsp--;


            	    }
            	    break;
            	case 9 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:64:2: textIT
            	    {
            	    pushFollow(FOLLOW_textIT_in_command716);
            	    textIT();

            	    state._fsp--;


            	    }
            	    break;
            	case 10 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:66:2: dollarIT
            	    {
            	    pushFollow(FOLLOW_dollarIT_in_command731);
            	    dollarIT();

            	    state._fsp--;


            	    }
            	    break;
            	case 11 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:67:2: TEXT_CONTENT
            	    {
            	    match(input,TEXT_CONTENT,FOLLOW_TEXT_CONTENT_in_command742); 

            	    }
            	    break;
            	case 12 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:68:2: SPECIALCHAR
            	    {
            	    match(input,SPECIALCHAR,FOLLOW_SPECIALCHAR_in_command749); 

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:78:1: latex : command ;
    public final void latex() throws RecognitionException {
        try {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:78:6: ( command )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:79:5: command
            {
            pushFollow(FOLLOW_command_in_latex813);
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
    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:84:1: rule : latex ;
    public final void rule() throws RecognitionException {
        try {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:84:5: ( latex )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:84:7: latex
            {
            pushFollow(FOLLOW_latex_in_rule835);
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


 

    public static final BitSet FOLLOW_AUTHOR_in_author390 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_author392 = new BitSet(new long[]{0x0000000002048000L});
    public static final BitSet FOLLOW_body_in_author393 = new BitSet(new long[]{0x0000000002048000L});
    public static final BitSet FOLLOW_25_in_author395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXTBF_in_textBF410 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_textBF412 = new BitSet(new long[]{0x0000000002048000L});
    public static final BitSet FOLLOW_body_in_textBF413 = new BitSet(new long[]{0x0000000002048000L});
    public static final BitSet FOLLOW_25_in_textBF415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXTIT_in_textIT430 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_textIT432 = new BitSet(new long[]{0x0000000002048000L});
    public static final BitSet FOLLOW_body_in_textIT433 = new BitSet(new long[]{0x0000000002048000L});
    public static final BitSet FOLLOW_25_in_textIT435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOLLAR_in_dollarIT449 = new BitSet(new long[]{0x0000000000048100L});
    public static final BitSet FOLLOW_body_in_dollarIT451 = new BitSet(new long[]{0x0000000000048100L});
    public static final BitSet FOLLOW_DOLLAR_in_dollarIT454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MKTITLE_in_mkTitle468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ITEM_in_item485 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_TEXT_CONTENT_in_item487 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_BEGIN_in_itemList501 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ITEMIZE_in_itemList503 = new BitSet(new long[]{0x0000000000000A20L});
    public static final BitSet FOLLOW_item_in_itemList506 = new BitSet(new long[]{0x0000000000000A20L});
    public static final BitSet FOLLOW_itemList_in_itemList508 = new BitSet(new long[]{0x0000000000000A20L});
    public static final BitSet FOLLOW_END_in_itemList512 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ITEMIZE_in_itemList514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_document527 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DOCUMENT_in_document529 = new BitSet(new long[]{0x00000000000FA7B0L});
    public static final BitSet FOLLOW_command_in_document531 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_END_in_document533 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DOCUMENT_in_document535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TITLE_in_title551 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_title553 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_TEXT_CONTENT_in_title557 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_title559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INCLUDEGRAPHICS_in_graph575 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_graph577 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_TEXT_CONTENT_in_graph578 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_graph579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOCUMENTCLASS_in_documentClass587 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_TEXT_CONTENT_in_documentClass589 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_documentClass592 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_TEXT_CONTENT_in_documentClass593 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_documentClass594 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_23_in_otherCommand605 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_TEXT_CONTENT_in_otherCommand606 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_otherCommand607 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_TEXT_CONTENT_in_otherCommand608 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_otherCommand609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_documentClass_in_command622 = new BitSet(new long[]{0x00000000000FA5B2L});
    public static final BitSet FOLLOW_title_in_command628 = new BitSet(new long[]{0x00000000000FA5B2L});
    public static final BitSet FOLLOW_author_in_command642 = new BitSet(new long[]{0x00000000000FA5B2L});
    public static final BitSet FOLLOW_textBF_in_command655 = new BitSet(new long[]{0x00000000000FA5B2L});
    public static final BitSet FOLLOW_mkTitle_in_command668 = new BitSet(new long[]{0x00000000000FA5B2L});
    public static final BitSet FOLLOW_document_in_command680 = new BitSet(new long[]{0x00000000000FA5B2L});
    public static final BitSet FOLLOW_graph_in_command691 = new BitSet(new long[]{0x00000000000FA5B2L});
    public static final BitSet FOLLOW_itemList_in_command705 = new BitSet(new long[]{0x00000000000FA5B2L});
    public static final BitSet FOLLOW_textIT_in_command716 = new BitSet(new long[]{0x00000000000FA5B2L});
    public static final BitSet FOLLOW_dollarIT_in_command731 = new BitSet(new long[]{0x00000000000FA5B2L});
    public static final BitSet FOLLOW_TEXT_CONTENT_in_command742 = new BitSet(new long[]{0x00000000000FA5B2L});
    public static final BitSet FOLLOW_SPECIALCHAR_in_command749 = new BitSet(new long[]{0x00000000000FA5B2L});
    public static final BitSet FOLLOW_command_in_latex813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_latex_in_rule835 = new BitSet(new long[]{0x0000000000000002L});

}