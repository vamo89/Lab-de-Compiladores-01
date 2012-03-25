// $ANTLR 3.4 D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g 2012-03-25 19:02:45

  package compiladores.lab01.parserLatexToHtml;
  import java.util.regex.Pattern;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class LatexToHtmlParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AUTHOR", "BEGIN", "BRACKET", "CLOSEBRACKET", "CONF", "DOCUMENT", "DOCUMENTCLASS", "DOCUMENTCLASSTOKEN", "DOLLAR", "DOLLARSIGN", "END", "INCLUDEGRAPHICS", "ITEM", "ITEMIZE", "MKTITLE", "PUNCT", "SPECIALCHAR", "TEXTBF", "TEXTIT", "TEXT_CONTENT", "TITLE", "USEPACKAGE", "USEPACKAGE_IGNORE", "WS", "'{'", "'}'"
    };

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
      String html = "";



    // $ANTLR start "run"
    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:21:1: run returns [String out] : returnStr= latex ;
    public final String run() throws RecognitionException {
        String out = null;


        String returnStr =null;


        try {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:21:26: (returnStr= latex )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:21:28: returnStr= latex
            {
            pushFollow(FOLLOW_latex_in_run54);
            returnStr=latex();

            state._fsp--;


            return returnStr;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return out;
    }
    // $ANTLR end "run"


    public static class body_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "body"
    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:56:1: body : (text= TEXT_CONTENT |dollar= DOLLAR |dollarSgn= DOLLARSIGN |text= SPECIALCHAR |text= WS |text= BRACKET |text= CLOSEBRACKET ) ;
    public final LatexToHtmlParser.body_return body() throws RecognitionException {
        LatexToHtmlParser.body_return retval = new LatexToHtmlParser.body_return();
        retval.start = input.LT(1);


        Token text=null;
        Token dollar=null;
        Token dollarSgn=null;

        try {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:56:7: ( (text= TEXT_CONTENT |dollar= DOLLAR |dollarSgn= DOLLARSIGN |text= SPECIALCHAR |text= WS |text= BRACKET |text= CLOSEBRACKET ) )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:56:9: (text= TEXT_CONTENT |dollar= DOLLAR |dollarSgn= DOLLARSIGN |text= SPECIALCHAR |text= WS |text= BRACKET |text= CLOSEBRACKET )
            {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:56:9: (text= TEXT_CONTENT |dollar= DOLLAR |dollarSgn= DOLLARSIGN |text= SPECIALCHAR |text= WS |text= BRACKET |text= CLOSEBRACKET )
            int alt1=7;
            switch ( input.LA(1) ) {
            case TEXT_CONTENT:
                {
                alt1=1;
                }
                break;
            case DOLLAR:
                {
                alt1=2;
                }
                break;
            case DOLLARSIGN:
                {
                alt1=3;
                }
                break;
            case SPECIALCHAR:
                {
                alt1=4;
                }
                break;
            case WS:
                {
                alt1=5;
                }
                break;
            case BRACKET:
                {
                alt1=6;
                }
                break;
            case CLOSEBRACKET:
                {
                alt1=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:56:10: text= TEXT_CONTENT
                    {
                    text=(Token)match(input,TEXT_CONTENT,FOLLOW_TEXT_CONTENT_in_body519); 

                    }
                    break;
                case 2 :
                    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:56:28: dollar= DOLLAR
                    {
                    dollar=(Token)match(input,DOLLAR,FOLLOW_DOLLAR_in_body523); 

                    }
                    break;
                case 3 :
                    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:56:42: dollarSgn= DOLLARSIGN
                    {
                    dollarSgn=(Token)match(input,DOLLARSIGN,FOLLOW_DOLLARSIGN_in_body527); 

                    }
                    break;
                case 4 :
                    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:56:63: text= SPECIALCHAR
                    {
                    text=(Token)match(input,SPECIALCHAR,FOLLOW_SPECIALCHAR_in_body531); 

                    }
                    break;
                case 5 :
                    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:56:80: text= WS
                    {
                    text=(Token)match(input,WS,FOLLOW_WS_in_body535); 

                    }
                    break;
                case 6 :
                    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:56:88: text= BRACKET
                    {
                    text=(Token)match(input,BRACKET,FOLLOW_BRACKET_in_body539); 

                    }
                    break;
                case 7 :
                    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:56:101: text= CLOSEBRACKET
                    {
                    text=(Token)match(input,CLOSEBRACKET,FOLLOW_CLOSEBRACKET_in_body543); 

                    }
                    break;

            }



                String str="";
                if(dollar!=null)str="$";
                else if(dollarSgn!=null)str="$";
                if(text!=null){
            		str = text.getText();
            	  }
                str = str.replaceAll("\r","");
                str = str.replaceAll("\n", "<br>");
                html+=str;
              


            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "body"



    // $ANTLR start "author"
    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:71:1: author : AUTHOR '{' ( command )* '}' ;
    public final void author() throws RecognitionException {
        try {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:71:11: ( AUTHOR '{' ( command )* '}' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:71:13: AUTHOR '{' ( command )* '}'
            {
            match(input,AUTHOR,FOLLOW_AUTHOR_in_author560); 

            match(input,28,FOLLOW_28_in_author562); 

             html+="<META NAME=\"author\" content=\"";

            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:72:15: ( command )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= BEGIN && LA2_0 <= CLOSEBRACKET)||(LA2_0 >= DOLLAR && LA2_0 <= DOLLARSIGN)||LA2_0==INCLUDEGRAPHICS||LA2_0==MKTITLE||(LA2_0 >= SPECIALCHAR && LA2_0 <= TEXT_CONTENT)||LA2_0==WS) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:72:15: command
            	    {
            	    pushFollow(FOLLOW_command_in_author607);
            	    command();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            match(input,29,FOLLOW_29_in_author610); 

             html+="\" />";

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
    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:75:1: textBF : TEXTBF '{' ( command )* '}' ;
    public final void textBF() throws RecognitionException {
        try {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:75:11: ( TEXTBF '{' ( command )* '}' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:75:13: TEXTBF '{' ( command )* '}'
            {
            match(input,TEXTBF,FOLLOW_TEXTBF_in_textBF648); 

            match(input,28,FOLLOW_28_in_textBF650); 

             html+="<b>";

            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:76:15: ( command )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= BEGIN && LA3_0 <= CLOSEBRACKET)||(LA3_0 >= DOLLAR && LA3_0 <= DOLLARSIGN)||LA3_0==INCLUDEGRAPHICS||LA3_0==MKTITLE||(LA3_0 >= SPECIALCHAR && LA3_0 <= TEXT_CONTENT)||LA3_0==WS) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:76:15: command
            	    {
            	    pushFollow(FOLLOW_command_in_textBF695);
            	    command();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            match(input,29,FOLLOW_29_in_textBF698); 

             html+="</b>";

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
    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:79:1: textIT : TEXTIT '{' ( command )* '}' ;
    public final void textIT() throws RecognitionException {
        try {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:79:11: ( TEXTIT '{' ( command )* '}' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:79:13: TEXTIT '{' ( command )* '}'
            {
            match(input,TEXTIT,FOLLOW_TEXTIT_in_textIT736); 

            match(input,28,FOLLOW_28_in_textIT738); 

             html+="<i>";

            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:80:15: ( command )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= BEGIN && LA4_0 <= CLOSEBRACKET)||(LA4_0 >= DOLLAR && LA4_0 <= DOLLARSIGN)||LA4_0==INCLUDEGRAPHICS||LA4_0==MKTITLE||(LA4_0 >= SPECIALCHAR && LA4_0 <= TEXT_CONTENT)||LA4_0==WS) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:80:15: command
            	    {
            	    pushFollow(FOLLOW_command_in_textIT783);
            	    command();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            match(input,29,FOLLOW_29_in_textIT786); 

             html+="</i>";

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
    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:83:1: mkTitle : MKTITLE ;
    public final void mkTitle() throws RecognitionException {
        try {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:83:11: ( MKTITLE )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:83:13: MKTITLE
            {
            match(input,MKTITLE,FOLLOW_MKTITLE_in_mkTitle823); 

            html+="<h1>"+titleText+"</h1>";

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
    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:86:1: item : ITEM (id= CONF )? ( body | textBF | textIT )* ;
    public final void item() throws RecognitionException {
        Token id=null;

        try {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:86:11: ( ITEM (id= CONF )? ( body | textBF | textIT )* )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:86:13: ITEM (id= CONF )? ( body | textBF | textIT )*
            {
            match(input,ITEM,FOLLOW_ITEM_in_item869); 

            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:86:20: (id= CONF )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==CONF) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:86:20: id= CONF
                    {
                    id=(Token)match(input,CONF,FOLLOW_CONF_in_item873); 

                    }
                    break;

            }



            																									if (id==null) html+="<li>";
            																									else html+=id.getText().substring(1,id.getText().length()-1)+" - ";
            																									

            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:91:16: ( body | textBF | textIT )*
            loop6:
            do {
                int alt6=4;
                switch ( input.LA(1) ) {
                case BRACKET:
                case CLOSEBRACKET:
                case DOLLAR:
                case DOLLARSIGN:
                case SPECIALCHAR:
                case TEXT_CONTENT:
                case WS:
                    {
                    alt6=1;
                    }
                    break;
                case TEXTBF:
                    {
                    alt6=2;
                    }
                    break;
                case TEXTIT:
                    {
                    alt6=3;
                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:91:17: body
            	    {
            	    pushFollow(FOLLOW_body_in_item921);
            	    body();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:91:22: textBF
            	    {
            	    pushFollow(FOLLOW_textBF_in_item923);
            	    textBF();

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:91:29: textIT
            	    {
            	    pushFollow(FOLLOW_textIT_in_item925);
            	    textIT();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            if (id==null) html+="</li>";

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
    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:94:1: itemList : BEGIN ITEMIZE ( WS )* ( item | ( itemList ( WS )* ) )* END ITEMIZE ;
    public final void itemList() throws RecognitionException {
        try {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:94:11: ( BEGIN ITEMIZE ( WS )* ( item | ( itemList ( WS )* ) )* END ITEMIZE )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:94:13: BEGIN ITEMIZE ( WS )* ( item | ( itemList ( WS )* ) )* END ITEMIZE
            {
            match(input,BEGIN,FOLLOW_BEGIN_in_itemList952); 

            match(input,ITEMIZE,FOLLOW_ITEMIZE_in_itemList954); 

            html+="<ul>";

            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:95:19: ( WS )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==WS) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:95:19: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_itemList1000); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:95:23: ( item | ( itemList ( WS )* ) )*
            loop9:
            do {
                int alt9=3;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==ITEM) ) {
                    alt9=1;
                }
                else if ( (LA9_0==BEGIN) ) {
                    alt9=2;
                }


                switch (alt9) {
            	case 1 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:95:24: item
            	    {
            	    pushFollow(FOLLOW_item_in_itemList1004);
            	    item();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:95:29: ( itemList ( WS )* )
            	    {
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:95:29: ( itemList ( WS )* )
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:95:30: itemList ( WS )*
            	    {
            	    pushFollow(FOLLOW_itemList_in_itemList1007);
            	    itemList();

            	    state._fsp--;


            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:95:39: ( WS )*
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( (LA8_0==WS) ) {
            	            alt8=1;
            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:95:39: WS
            	    	    {
            	    	    match(input,WS,FOLLOW_WS_in_itemList1009); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop8;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            match(input,END,FOLLOW_END_in_itemList1033); 

            match(input,ITEMIZE,FOLLOW_ITEMIZE_in_itemList1035); 

            html+="</ul>";

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



    // $ANTLR start "title"
    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:99:1: title : TITLE '{' id= TEXT_CONTENT '}' ;
    public final void title() throws RecognitionException {
        Token id=null;

        try {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:99:11: ( TITLE '{' id= TEXT_CONTENT '}' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:99:13: TITLE '{' id= TEXT_CONTENT '}'
            {
            match(input,TITLE,FOLLOW_TITLE_in_title1070); 

            match(input,28,FOLLOW_28_in_title1072); 

            id=(Token)match(input,TEXT_CONTENT,FOLLOW_TEXT_CONTENT_in_title1076); 

            match(input,29,FOLLOW_29_in_title1078); 


            																									  titleText=id.getText();
            																									  html+="<title>"+titleText+"</title>";
            																									

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
    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:106:1: graph : INCLUDEGRAPHICS '{' id= TEXT_CONTENT '}' ;
    public final void graph() throws RecognitionException {
        Token id=null;

        try {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:106:11: ( INCLUDEGRAPHICS '{' id= TEXT_CONTENT '}' )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:106:13: INCLUDEGRAPHICS '{' id= TEXT_CONTENT '}'
            {
            match(input,INCLUDEGRAPHICS,FOLLOW_INCLUDEGRAPHICS_in_graph1119); 

            match(input,28,FOLLOW_28_in_graph1121); 

            id=(Token)match(input,TEXT_CONTENT,FOLLOW_TEXT_CONTENT_in_graph1124); 

            match(input,29,FOLLOW_29_in_graph1125); 

            html+="<img src=\""+id.getText()+"\"/>";

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



    // $ANTLR start "initCommands"
    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:113:1: initCommands : ( DOCUMENTCLASSTOKEN | title | author | USEPACKAGE_IGNORE | WS ) ;
    public final void initCommands() throws RecognitionException {
        try {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:113:14: ( ( DOCUMENTCLASSTOKEN | title | author | USEPACKAGE_IGNORE | WS ) )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:113:16: ( DOCUMENTCLASSTOKEN | title | author | USEPACKAGE_IGNORE | WS )
            {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:113:16: ( DOCUMENTCLASSTOKEN | title | author | USEPACKAGE_IGNORE | WS )
            int alt10=5;
            switch ( input.LA(1) ) {
            case DOCUMENTCLASSTOKEN:
                {
                alt10=1;
                }
                break;
            case TITLE:
                {
                alt10=2;
                }
                break;
            case AUTHOR:
                {
                alt10=3;
                }
                break;
            case USEPACKAGE_IGNORE:
                {
                alt10=4;
                }
                break;
            case WS:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }

            switch (alt10) {
                case 1 :
                    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:114:3: DOCUMENTCLASSTOKEN
                    {
                    match(input,DOCUMENTCLASSTOKEN,FOLLOW_DOCUMENTCLASSTOKEN_in_initCommands1144); 

                    }
                    break;
                case 2 :
                    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:115:3: title
                    {
                    pushFollow(FOLLOW_title_in_initCommands1155);
                    title();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:116:3: author
                    {
                    pushFollow(FOLLOW_author_in_initCommands1179);
                    author();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:117:3: USEPACKAGE_IGNORE
                    {
                    match(input,USEPACKAGE_IGNORE,FOLLOW_USEPACKAGE_IGNORE_in_initCommands1202); 

                    }
                    break;
                case 5 :
                    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:118:3: WS
                    {
                    match(input,WS,FOLLOW_WS_in_initCommands1214); 

                    }
                    break;

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
    // $ANTLR end "initCommands"



    // $ANTLR start "document"
    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:122:1: document : BEGIN DOCUMENT ( command )* END DOCUMENT ;
    public final void document() throws RecognitionException {
        try {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:122:11: ( BEGIN DOCUMENT ( command )* END DOCUMENT )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:122:13: BEGIN DOCUMENT ( command )* END DOCUMENT
            {
            match(input,BEGIN,FOLLOW_BEGIN_in_document1226); 

            match(input,DOCUMENT,FOLLOW_DOCUMENT_in_document1228); 

            html+="</head><body>";

            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:123:19: ( command )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0 >= BEGIN && LA11_0 <= CLOSEBRACKET)||(LA11_0 >= DOLLAR && LA11_0 <= DOLLARSIGN)||LA11_0==INCLUDEGRAPHICS||LA11_0==MKTITLE||(LA11_0 >= SPECIALCHAR && LA11_0 <= TEXT_CONTENT)||LA11_0==WS) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:123:19: command
            	    {
            	    pushFollow(FOLLOW_command_in_document1274);
            	    command();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            match(input,END,FOLLOW_END_in_document1295); 

            match(input,DOCUMENT,FOLLOW_DOCUMENT_in_document1297); 

            html+="</body>";

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



    // $ANTLR start "command"
    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:127:1: command : ( textBF | mkTitle | graph | itemList | textIT | body ) ;
    public final void command() throws RecognitionException {
        try {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:127:9: ( ( textBF | mkTitle | graph | itemList | textIT | body ) )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:127:11: ( textBF | mkTitle | graph | itemList | textIT | body )
            {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:127:11: ( textBF | mkTitle | graph | itemList | textIT | body )
            int alt12=6;
            switch ( input.LA(1) ) {
            case TEXTBF:
                {
                alt12=1;
                }
                break;
            case MKTITLE:
                {
                alt12=2;
                }
                break;
            case INCLUDEGRAPHICS:
                {
                alt12=3;
                }
                break;
            case BEGIN:
                {
                alt12=4;
                }
                break;
            case TEXTIT:
                {
                alt12=5;
                }
                break;
            case BRACKET:
            case CLOSEBRACKET:
            case DOLLAR:
            case DOLLARSIGN:
            case SPECIALCHAR:
            case TEXT_CONTENT:
            case WS:
                {
                alt12=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }

            switch (alt12) {
                case 1 :
                    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:128:2: textBF
                    {
                    pushFollow(FOLLOW_textBF_in_command1331);
                    textBF();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:129:2: mkTitle
                    {
                    pushFollow(FOLLOW_mkTitle_in_command1344);
                    mkTitle();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:130:2: graph
                    {
                    pushFollow(FOLLOW_graph_in_command1356);
                    graph();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:131:2: itemList
                    {
                    pushFollow(FOLLOW_itemList_in_command1370);
                    itemList();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:132:2: textIT
                    {
                    pushFollow(FOLLOW_textIT_in_command1381);
                    textIT();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:133:2: body
                    {
                    pushFollow(FOLLOW_body_in_command1394);
                    body();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "command"



    // $ANTLR start "latex"
    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:136:1: latex returns [String out] : ( initCommands )* document ;
    public final String latex() throws RecognitionException {
        String out = null;


        try {
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:136:27: ( ( initCommands )* document )
            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:137:1: ( initCommands )* document
            {

            	html+=
            	"<html><head>"+
            	"<script type=\"text/x-mathjax-config\">"+
            	  "MathJax.Hub.Config({tex2jax: {inlineMath: [[\"\\$\",\"\\$\"]]}});"+
            	"</script>"+
            	"<script type=\"text/javascript\""+
            	  " src=\"http://cdn.mathjax.org/mathjax/latest/MathJax.js?config=TeX-AMS-MML_HTMLorMML\">"+
            	"</script>";


            // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:147:3: ( initCommands )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==AUTHOR||LA13_0==DOCUMENTCLASSTOKEN||LA13_0==TITLE||(LA13_0 >= USEPACKAGE_IGNORE && LA13_0 <= WS)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // D:\\Compiladores\\Lab-de-Compiladores-01\\src\\compiladores\\lab01\\parserLatexToHtml\\LatexToHtml.g:147:3: initCommands
            	    {
            	    pushFollow(FOLLOW_initCommands_in_latex1417);
            	    initCommands();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            pushFollow(FOLLOW_document_in_latex1420);
            document();

            state._fsp--;


            return html+"</html>";

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return out;
    }
    // $ANTLR end "latex"

    // Delegated rules


 

    public static final BitSet FOLLOW_latex_in_run54 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_CONTENT_in_body519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOLLAR_in_body523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOLLARSIGN_in_body527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPECIALCHAR_in_body531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_body535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKET_in_body539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLOSEBRACKET_in_body543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AUTHOR_in_author560 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_author562 = new BitSet(new long[]{0x0000000028F4B0E0L});
    public static final BitSet FOLLOW_command_in_author607 = new BitSet(new long[]{0x0000000028F4B0E0L});
    public static final BitSet FOLLOW_29_in_author610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXTBF_in_textBF648 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_textBF650 = new BitSet(new long[]{0x0000000028F4B0E0L});
    public static final BitSet FOLLOW_command_in_textBF695 = new BitSet(new long[]{0x0000000028F4B0E0L});
    public static final BitSet FOLLOW_29_in_textBF698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXTIT_in_textIT736 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_textIT738 = new BitSet(new long[]{0x0000000028F4B0E0L});
    public static final BitSet FOLLOW_command_in_textIT783 = new BitSet(new long[]{0x0000000028F4B0E0L});
    public static final BitSet FOLLOW_29_in_textIT786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MKTITLE_in_mkTitle823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ITEM_in_item869 = new BitSet(new long[]{0x0000000008F031C2L});
    public static final BitSet FOLLOW_CONF_in_item873 = new BitSet(new long[]{0x0000000008F030C2L});
    public static final BitSet FOLLOW_body_in_item921 = new BitSet(new long[]{0x0000000008F030C2L});
    public static final BitSet FOLLOW_textBF_in_item923 = new BitSet(new long[]{0x0000000008F030C2L});
    public static final BitSet FOLLOW_textIT_in_item925 = new BitSet(new long[]{0x0000000008F030C2L});
    public static final BitSet FOLLOW_BEGIN_in_itemList952 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ITEMIZE_in_itemList954 = new BitSet(new long[]{0x0000000008014020L});
    public static final BitSet FOLLOW_WS_in_itemList1000 = new BitSet(new long[]{0x0000000008014020L});
    public static final BitSet FOLLOW_item_in_itemList1004 = new BitSet(new long[]{0x0000000000014020L});
    public static final BitSet FOLLOW_itemList_in_itemList1007 = new BitSet(new long[]{0x0000000008014020L});
    public static final BitSet FOLLOW_WS_in_itemList1009 = new BitSet(new long[]{0x0000000008014020L});
    public static final BitSet FOLLOW_END_in_itemList1033 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ITEMIZE_in_itemList1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TITLE_in_title1070 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_title1072 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_TEXT_CONTENT_in_title1076 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_title1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INCLUDEGRAPHICS_in_graph1119 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_graph1121 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_TEXT_CONTENT_in_graph1124 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_graph1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOCUMENTCLASSTOKEN_in_initCommands1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_title_in_initCommands1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_author_in_initCommands1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USEPACKAGE_IGNORE_in_initCommands1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_initCommands1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_document1226 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_DOCUMENT_in_document1228 = new BitSet(new long[]{0x0000000008F4F0E0L});
    public static final BitSet FOLLOW_command_in_document1274 = new BitSet(new long[]{0x0000000008F4F0E0L});
    public static final BitSet FOLLOW_END_in_document1295 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_DOCUMENT_in_document1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_textBF_in_command1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mkTitle_in_command1344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_graph_in_command1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itemList_in_command1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_textIT_in_command1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_body_in_command1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_initCommands_in_latex1417 = new BitSet(new long[]{0x000000000D000830L});
    public static final BitSet FOLLOW_document_in_latex1420 = new BitSet(new long[]{0x0000000000000002L});

}