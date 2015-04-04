grammar Team8;
r : IF;
FUNCTION : ID '(' TYPE ID ') {' EXPRESSION '}' ;
IF : 'if(' COMPARISON '){' EXPRESSION '}' ;                                   // if (1 < 2) { stuff }
FOR : 'for(' ASSIGNMENT ';' COMPARISON ';' EXPRESSION ') {' EXPRESSION '}' ;  // for (int test = 0; test < 2; test = test + 1){ stuff }
COMPARISON : NUMBER '==' NUMBER ;                                             // compare string or int
EXPRESSION : ID '=' NUMBER '+' NUMBER ';' ;                                   // adding two variables or two numbers
ASSIGNMENT : TYPE ID '=' (NUMBER | ID | BOOLEAN) ';' ;                        //
TYPE : 'int' | 'bool' | 'string' ;                                            // an id is assigned a number
ID : [a-z]+;                                                                  // match lower-case identifiers
BOOLEAN : 'true' | 'false' | 'yes' | 'no' ;                                   // booleans
NUMBER : [0-9]+ ;                                                             // number or floating point
WS : [ \t\r\n]+ -> skip ;                                                     // skip spaces, tabs, newlines
