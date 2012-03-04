grammar test1;

options {
  language = Java;
}

@header {
  package br.com.project1;
}

@lexer::header {
    package br.com.project1;
}


rule: 
  id=IDENT+ {
    System.out.println($id.getText());
  };

IDENT : 'a'..'z'+;
WS : (' ' | '\t' | '\n' | '\r' | '\f')+ {$channel = HIDDEN;};