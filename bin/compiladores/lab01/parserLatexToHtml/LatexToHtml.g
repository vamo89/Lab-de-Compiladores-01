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
AUTHOR          :'\\''author';
DOLLAR          :'$';
PUNCT           : ('.'|','|';'|'-'|'['|']'|'('|')');
SPECIALCHAR     :'\\'('Omega'|'Alpha'|'Beta'|'Gamma');//Adicionar o resto;
TEXT_CONTENT    :('a'..'z' | 'A'..'Z' | '0'..'9' | PUNCT )('a'..'z' | 'A'..'Z' | '0'..'9' | PUNCT | WS)*;


//COMMANDS
body            : TEXT_CONTENT|SPECIALCHAR;
author          :AUTHOR '{'body*'}';
textBF          :TEXTBF '{'body*'}';
textIT          :TEXTIT '{'body*'}';
dollarIT        : DOLLAR body* DOLLAR;
mkTitle         :MKTITLE;
item            :ITEM TEXT_CONTENT+;
itemList        :BEGIN ITEMIZE (item|itemList)* END ITEMIZE;
document        :BEGIN DOCUMENT command END DOCUMENT;
title           :TITLE '{' titleText=TEXT_CONTENT '}';
graph           :INCLUDEGRAPHICS '{'TEXT_CONTENT'}';
documentClass   :DOCUMENTCLASS TEXT_CONTENT ('{'TEXT_CONTENT'}')*;
otherCommand    :'\\'TEXT_CONTENT'{'TEXT_CONTENT'}' {throw new Excepion("COMMAND NOT FOUND");};

command : (
	documentClass  |
	title          |
	author         |
	textBF         |
	mkTitle        |
	document       |
	graph          |
	itemList       |
	textIT         |
	//otherCommand   |
	dollarIT       |
	TEXT_CONTENT   |
	SPECIALCHAR
)*;

/// Ignores
USEPACKAGE_IGNORE:
 USEPACKAGE (TEXT_CONTENT)*'{'TEXT_CONTENT'}'* {$channel = HIDDEN;};

WS: (' ' | '\t' | '\n' | '\r' | '\f')+ {$channel = HIDDEN;};
//IGNORE: (WS|USERPACKAGE)* {$channel = HIDDEN;};

latex: 
    command
    ;
    

    
rule: latex;