grammar Team8;

primary
    : (FUNCTION | IF | FOR | ASSIGNMENT | EXPRESSION)+
    ;

FUNCTION
    : 'func' IDENTIFIER '(' (TYPE IDENTIFIER)* ')' '{' EXPRESSION '}'
    ;

IF
    : 'if' '(' COMPARISON '){' EXPRESSION '}'
    ;

FOR
    : 'for' '(' ASSIGNMENT ';' COMPARISON ';' EXPRESSION ')' '{' EXPRESSION '}'
    ;

COMPARISON
    : NUMBER '==' NUMBER
    | STRING '==' STRING
    | BOOLEAN
    ;

EXPRESSION
    : IDENTIFIER '=' NUMBER '+' NUMBER ';'
    ;

ASSIGNMENT
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
