grammar yoyohead;

root
    : context
    ;

context
    : (operation | comparison | assignment | loop | branch | systemCall)+
    ;

//
///////////// SYSTEM CALL ////////////
//
systemCall
	: voidSystemCall
	| numberSystemCall
    | stringSystemCall
    | booleanSystemCall
	;

voidSystemCall
    : 'print(' IDENTIFIER ')'
    ;

numberSystemCall
    : 'readInt()'
    ;

stringSystemCall
    : 'readString()'
    ;

booleanSystemCall
    : 'readBoolean()'
    ;

//
///////////// BRANCHING ///////////////
//
branch
	: 'if' '(' (booleanOperation | comparison) ')' '{' context '}' 'else' '{' context '}'
	;

//
////////////// LOOPING ///////////////
//

loop
    : 'while' (IDENTIFIER | booleanOperation | numberComparison | stringComparison) '{' context '}'
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
    : IDENTIFIER ':=' (NUMBER | numberOperation | numberSystemCall)
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
    : IDENTIFIER NUMBEROPERATOR IDENTIFIER
    ;

stringOperation
    : IDENTIFIER STRINGOPERATOR IDENTIFIER
    ;

booleanOperation
    : IDENTIFIER BOOLEANOPERATOR IDENTIFIER
    ;

//
////////////// COMPARISONS /////////////////
//

comparison
    : numberComparison
    | stringComparison
    ;

numberComparison
    : IDENTIFIER NUMBERCOMPARITOR  IDENTIFIER
    ;

stringComparison
    : IDENTIFIER STRINGCOMPARITOR IDENTIFIER
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
