grammar Team8;

primary
    : (statement)*
    ;

statement
    : 'func' IDENTIFIER '(' (TYPE IDENTIFIER)* ')' '{' (expression)* '}'
    | 'if' '(' comparison '){' expression '}'
    | 'for' '(' assignment ';' comparison ';' expression ')' '{' (expression)* '}'
    ;

comparison
    : NUMBER '==' NUMBER
    | STRING '==' STRING
    | BOOLEAN
    ;

expression
    : IDENTIFIER '=' NUMBER '+' NUMBER ';'
    ;

assignment
    : TYPE IDENTIFIER '=' (NUMBER | BOOLEAN | STRING) ';'
    ;

TYPE
    : 'int'
    | 'bool'
    | 'string'
    ;

STRING
    : '"' [a-zA-Z0-9]+ '"'
    ;

IDENTIFIER
    : [a-z]+
    ;

BOOLEAN
    : 'true'
    | 'false'
    | 'yes'
    | 'no'
    ;

NUMBER
    : [0-9]+
    ;

WHITESPACE
    : [ \t\r\n]+ -> skip
    ;
