grammar grammarSample;

options {
  language = Java;
}

@header {
  package pack;
}

@lexer::header {
  package pack;
}

rule: 
  id=IDENT+ {
    System.out.println($id.getText());
  };

IDENT : 'a'..'z'+;
WS : (' ' | '\t' | '\n' | '\r' | '\f')+ {$channel = HIDDEN;};
