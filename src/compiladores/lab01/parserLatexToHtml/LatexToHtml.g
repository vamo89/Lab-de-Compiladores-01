grammar LatexToHtml;

options {
  language = Java;
}

@header {
  package compiladores.lab01.parserLatexToHtml;
  import java.util.regex.Pattern;
}

@lexer::header {
  package compiladores.lab01.parserLatexToHtml;
}

@parser::members {
  String titleText = null;
  String html = "";
}

run returns [String out] : returnStr=latex {return returnStr;};
/////
//TOKENS
///////////

BEGIN           :'\\''begin';
DOCUMENTCLASS   :'\\''documentclass';
DOCUMENT        :'{document}';
ITEMIZE         :'{itemize}';
ITEM            :'\\''item';
TEXTBF          :'\\''textbf';
TEXTIT          :'\\''textit';
END             :'\\''end';
USEPACKAGE      :'\\''usepackage';
INCLUDEGRAPHICS :'\\''includegraphics';
TITLE           :'\\''title';
MKTITLE         :'\\''maketitle';
AUTHOR          :'\\''author';
DOLLAR          :'\\$';
BRACKET         :'[';
CLOSEBRACKET    :']';
CONF            : BRACKET WS* TEXT_CONTENT CLOSEBRACKET;
PUNCT           : ('.'|','|';'|'-'|'('|')'|':');
SPECIALCHAR     :'\\'('a'..'z' | 'A'..'Z')*;
WS              : (' ' | '\t' | '\n' | '\r' | '\f') ;
TEXT_CONTENT    :('a'..'z' | 'A'..'Z' | '0'..'9' | PUNCT )('a'..'z' | 'A'..'Z' | '0'..'9' | PUNCT | WS)*;
DOLLARSIGN      :'$';

DOCUMENTCLASSTOKEN   : DOCUMENTCLASS CONF? '{'TEXT_CONTENT'}';
USEPACKAGE_IGNORE:
 USEPACKAGE CONF? '{'TEXT_CONTENT'}' ;
 
///////
//RULES
/////////////
body  : (text=TEXT_CONTENT|dollar=DOLLAR|dollarSgn=DOLLARSIGN|text=SPECIALCHAR|text=WS|text=BRACKET|text=CLOSEBRACKET ) 
{
    String str="";
    if($dollar!=null)str="$";
    else if($dollarSgn!=null)str="\$";
    if($text!=null){
		str = $text.getText();
	  }
    str = str.replaceAll("\r","");
    str = str.replaceAll("\n", "<br>");
    html+=str;
  
};

//Meta Author content
author    : AUTHOR '{'                            { html+="<META NAME=\"author\" content=\"";}
              command* '}'                        { html+="\" />";} ;

//BoldText
textBF    : TEXTBF '{'                            { html+="<b>";}
              command* '}'                        { html+="</b>";} ;

//Italic text
textIT    : TEXTIT '{'                            { html+="<i>";}
              command* '}'                        { html+="</i>";} ;

//Insert a title as <h1> html tag
mkTitle   : MKTITLE                               {html+="<h1>"+titleText+"</h1>";};

//Item Element
item      : ITEM id=CONF? 
																									{
																									if (id==null) html+="<li>";
																									else html+=$id.getText().substring(1,$id.getText().length()-1)+" - ";
																									} 
               (body|textBF|textIT)*              {if (id==null) html+="</li>";};

//List of Itens
itemList  : BEGIN ITEMIZE                         {html+="<ul>";}
                  WS* (item|(itemList WS*))*
                  END ITEMIZE                     {html+="</ul>";};

//Meta title
title     : TITLE '{' id=TEXT_CONTENT '}' 
																									{
																									  titleText=$id.getText();
																									  html+="<title>"+titleText+"</title>";
																									};

//Graphics Images
graph     : INCLUDEGRAPHICS '{'id=TEXT_CONTENT'}' {html+="<img src=\""+id.getText()+"\"/>";};

///////
// Master Rules
//////////////////

//Initilize Settings
initCommands : (
  DOCUMENTCLASSTOKEN      |
  title                   |
  author                  |
  USEPACKAGE_IGNORE       |
  WS
);

//Create Document body
document  : BEGIN DOCUMENT                        {html+="</head><body>";} 
                  command*
                  END DOCUMENT                    {html+="</body>";} ;

//Available commands
command : (
	textBF         |
	mkTitle        |
	graph          |
	itemList       |
	textIT         |
	body     
);

latex returns [String out]: 
{
	html+=
	"<html><head>"+
	"<script type=\"text/x-mathjax-config\">"+
	  "MathJax.Hub.Config({tex2jax: {inlineMath: [[\"\\$\",\"\\$\"]]}});"+
	"</script>"+
	"<script type=\"text/javascript\""+
	  " src=\"http://cdn.mathjax.org/mathjax/latest/MathJax.js?config=TeX-AMS-MML_HTMLorMML\">"+
	"</script>";
}
  initCommands* document                          
  {return html+"</html>";} ;
