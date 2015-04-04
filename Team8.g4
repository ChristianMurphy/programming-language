grammar Team8;

// A program is made of one or more statements
primary
    : statement+
    ;

// A statement can be a function, a branch, an assignment, or a loop
// Examples
//      func example (int test) {...}
//      while (n < 10) {...}
//      if (1 > n) {...}
statement
    : 'func' IDENTIFIER '(' parameter? ')' '{' statement* '}'
    | 'if' '(' comparison ')' '{' statement* '}'
    | 'while' '(' comparison ')' '{' statement* '}'
    | assignment
    ;

// a variable can be assigned an expression
// Examples
//      int number = 0;
//      int another = 1 + 1 + number;
//      bool test = 1 < 2;
assignment
    : TYPE? IDENTIFIER '=' expression ';'
    ;

// an expression is either addition or a comparison
// Examples
//      8
//      1 > 2
//      1 + test + 3
expression
    : valueOrVariable ('+' valueOrVariable)*
    | comparison
    ;

// compares two variables
// Examples
//      1 == 2
//      1 < 1
//      1 <= 1
//      2 > 1
//      2 >= 1
//      yes
//      false
comparison
    : valueOrVariable ('<'|'>')'='? valueOrVariable
    | valueOrVariable '==' valueOrVariable
    | BOOLEAN
    ;

// can either be a variable name or a variable
valueOrVariable
    : NUMBER
    | BOOLEAN
    | STRING
    | IDENTIFIER
    ;

// parameters can be a single type and indentifier or a comma seperated list
// Examples
//      int one
//      bool truth, int number, string name
parameter
    : TYPE IDENTIFIER
    | parameter (',' parameter)+
    ;

// there are three allowed types
TYPE
    : 'int'
    | 'bool'
    | 'string'
    ;

// a string can contain uppercase, lowercase, numbers and spaces
// Example
//      "this 15 VALID"
STRING
    : '"' [ a-zA-Z0-9]+ '"'
    ;

// Identifiers, variable names and function names can only be lower case
IDENTIFIER
    : [a-z]+
    ;

// boolean can be true and yes or false and no
BOOLEAN
    : 'true'
    | 'false'
    | 'yes'
    | 'no'
    ;

// int type can be any unsigned whole number
NUMBER
    : [0-9]+
    ;

// this language ignores whitespace
WHITESPACE
    : [ \t\r\n]+ -> skip
    ;
