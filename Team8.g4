grammar Team8;

root
    : (operation | comparison | assignment | loop | function)+
    ;

//
///////////// FUNCTION ///////////////
//
function
    : functionCall
    | functionDeclaration
    ;

functionCall
    : IDENTIFIER '(' callParameters ')'
    ;

functionDeclaration
    : numberFunctionDeclaration
    | stringFunctionDeclaration
    | booleanFunctionDeclaration
    ;

numberFunctionDeclaration
    : 'func' 'number' IDENTIFIER '(' parameters ')' '{' root 'return' IDENTIFIER '}'
    ;

stringFunctionDeclaration
    : 'func' 'string' IDENTIFIER '(' parameters ')' '{' root 'return' IDENTIFIER '}'
    ;

booleanFunctionDeclaration
    : 'func' 'boolean' IDENTIFIER '(' parameters ')' '{' root 'return' IDENTIFIER '}'
    ;

//
/////////////// PARAMETER ////////////////////
//

callParameters
    : ( (IDENTIFIER | comparison | operation) (',' (IDENTIFIER | comparison | operation))* )?
    ;

parameters
    : (parameter (',' parameter)*)?
    ;

parameter
    : numberParameter
    | stringParameter
    | booleanParameter
    ;

numberParameter
    : 'number' IDENTIFIER
    ;

stringParameter
    : 'string' IDENTIFIER
    ;

booleanParameter
    : 'boolean' IDENTIFIER
    ;

//
////////////// LOOPING ///////////////
//

loop
    : whileLoop
    | forLoop
    ;

whileLoop
    : 'while' (IDENTIFIER | booleanOperation | numberComparison | stringComparison) '{' root '}'
    ;

forLoop
    : 'for' IDENTIFIER 'in' 'range' (NUMBER | IDENTIFIER) 'to' (NUMBER | IDENTIFIER) '{' root '}'
    ;

//
////////////// ASSIGNMENT ////////////
//

assignment
    : initialAssignment
    | reassignment
    ;

initialAssignment
    : initialNumberAssignment
    | initialStringAssignment
    | initialBooleanAssignemnt
    ;

initialNumberAssignment
    : 'number' numberReassignment
    ;

initialStringAssignment
    : 'string' stringReassignment
    ;

initialBooleanAssignemnt
    : 'boolean' booleanReassignemnt
    ;

reassignment
    : numberReassignment
    | stringReassignment
    | booleanReassignemnt
    ;

numberReassignment
    : IDENTIFIER ':=' (NUMBER | numberOperation)
    ;

stringReassignment
    : IDENTIFIER ':=' (STRING | stringOperation)
    ;

booleanReassignemnt
    : IDENTIFIER ':=' (BOOLEAN | booleanOperation | numberComparison | stringComparison)
    ;

//
///////////// OPERATIONS /////////////
//

operation
    : stringOperation
    | numberOperation
    | booleanOperation
    ;

numberOperation
    : (NUMBER | IDENTIFIER) (NUMBEROPERATOR (NUMBER | IDENTIFIER))+
    ;

stringOperation
    : (STRING | IDENTIFIER) (STRINGOPERATOR (STRING | IDENTIFIER))+
    ;

booleanOperation
    : (BOOLEAN | IDENTIFIER) (BOOLEANOPERATOR (BOOLEAN | IDENTIFIER))+
    ;

//
////////////// COMPARISONS /////////////////
//

comparison
    : numberComparison
    | stringComparison
    ;

numberComparison
    : (NUMBER | IDENTIFIER) NUMBERCOMPARITOR (NUMBER | IDENTIFIER)
    ;

stringComparison
    : (STRING | IDENTIFIER) STRINGCOMPARITOR (STRING | IDENTIFIER)
    ;

//
///////////// OPERATORS ///////////////
//

// operations that can be run on numbers
NUMBEROPERATOR
    : 'add'
    | 'subtract'
    | 'multiply by'
    | 'divide by'
    | 'modulus'
    ;

// operations that can be run on strings
STRINGOPERATOR
    : 'append'
    ;

BOOLEANOPERATOR
    : 'and'
    | 'or'
    | 'xor'
    ;

//
///////////// COMPARITORS ///////////////
//

// how numbers can be compared
NUMBERCOMPARITOR
    : 'equals'
    | 'less than'
    | 'greater than'
    | 'less than or equals'
    | 'greater than or equals'
    ;

// how strings can be compared
STRINGCOMPARITOR
    : 'equals'
    ;

//
////////////// TYPES //////////////////
//

// Identifiers, variable names and function names can only be lower case
IDENTIFIER
    : [a-z]+
    ;

// int type can be any unsigned whole number
NUMBER
    : [0-9]+
    ;

// a string can contain uppercase, lowercase, numbers and spaces
// Example
//      "this 15 VALID"
STRING
    : '"' [ a-zA-Z0-9]+ '"'
    ;

// boolean can be true and yes or false and no
BOOLEAN
    : 'yes'
    | 'no'
    ;

//
////////////// IGNORED /////////////////
//

// this language ignores whitespace
WHITESPACE
    : [ \t\r\n]+ -> skip
    ;

// skip over comments
COMMENT
    : '//' ~( '\r' | '\n' )* -> skip
    ;
