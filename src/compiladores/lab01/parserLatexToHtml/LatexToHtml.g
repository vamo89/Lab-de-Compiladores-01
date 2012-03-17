grammar LatexToHtml;

options {
  language = Java;
}

@header {
  package compiladores.lab01.parserLatexToHtml;
}

@lexer::header {
  package compiladores.lab01.parserLatexToHtml;
}

@members {
    String titleText = null;
}

//keywords
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
AUTHOR          :'\\author';
PUNCT           : ('.'|','|';'|'-'|'['|']');
TEXT_CONTENT    :('a'..'z' | 'A'..'Z' | '0'..'9' | PUNCT )('a'..'z' | 'A'..'Z' | '0'..'9' | PUNCT | WS)*;


//COMMANDS
author          :AUTHOR '{'TEXT_CONTENT'}';
textBF          :TEXTBF '{'TEXT_CONTENT'}';
textIT          :TEXTIT '{'TEXT_CONTENT'}';
mkTitle         :MKTITLE;
item            :ITEM TEXT_CONTENT+;
itemList        :BEGIN ITEMIZE (item|itemList)* END ITEMIZE;
document        :BEGIN DOCUMENT command END DOCUMENT;
title           :TITLE '{' titleText=TEXT_CONTENT '}';
graph           :INCLUDEGRAPHICS '{'TEXT_CONTENT'}';
documentClass   :DOCUMENTCLASS TEXT_CONTENT ('{'TEXT_CONTENT'}')*;
otherCommand    :'\\'TEXT_CONTENT'{'TEXT_CONTENT'}';

command : (documentClass|title|author|textBF|mkTitle|document|graph|itemList|textIT|otherCommand|TEXT_CONTENT)*;

/// Ignores
USERPACKAGE:
 USEPACKAGE (TEXT_CONTENT | '{'TEXT_CONTENT'}')* {$channel = HIDDEN;};

WS: (' ' | '\t' | '\n' | '\r' | '\f')+ {$channel = HIDDEN;};
//IGNORES: (WS|USERPACKAGE)* {$channel = HIDDEN;};

latex: 
    command
    ;
    

    
rule: latex;