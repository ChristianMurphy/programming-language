grammar Team8;

primary
    : statement*
    ;

statement
    : 'func' IDENTIFIER '(' parameter? ')' '{' (statement | assignment)* '}'
    | 'if' '(' comparison ')' '{' (statement | assignment)* '}'
    | 'for' '(' TYPE? assignment comparison ';' assignment ')' '{' (statement | assignment)* '}'
    ;

assignment
    : TYPE? IDENTIFIER '=' (BOOLEAN | valueOrVariable) ('+' valueOrVariable)* ';'
    ;

comparison
    : valueOrVariable '==' valueOrVariable
    | valueOrVariable '<' valueOrVariable
    | valueOrVariable '>' valueOrVariable
    | BOOLEAN
    ;

valueOrVariable
    : NUMBER
    | STRING
    | IDENTIFIER
    ;

parameter
    : TYPE IDENTIFIER
    | TYPE IDENTIFIER (',' parameter)
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
