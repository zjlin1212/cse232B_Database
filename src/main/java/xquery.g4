
grammar xquery;
import xpath;

query:
    xq EOF;

xq:
    var                 #XqVar
|   StringConstant      #XqString
|   ap                  #XqAp
|   '(' xq ')'          #XqParenthesis
|   xq ',' xq           #XqComma
|   xq  '/' rp          #XqSlash
|   xq '//' rp          #Xq2Slash
|   '<' String '>'  '{'  xq  '}' '<' '/' String '>'   #XqMakeElement
|   forClause letClause?  whereClause?  returnClause  #XqFor
|   letClause xq       #XqLet
;

forClause:
'for' var 'in' xq (',' var 'in' xq)*
;

letClause:
'let' var ':=' xq (',' var ':=' xq)*;

whereClause:
'where' cond;

returnClause:
'return' xq;


var
	: '$' String
	;

cond:
    xq '=' xq           #CondEq
|   xq 'eq' xq          #CondEq
|   xq '==' xq          #CondIs
|   xq 'is' xq          #CondIs
|   'empty' '(' xq ')'     #CondIsEmpty
|   'some' var 'in' xq (',' var 'in' xq )* 'satisfies' cond    #CondSome
| '(' cond ')'          #CondParenthesis
|   cond 'and' cond     #CondAnd
|   cond 'or' cond      #CondOr
|   'not' cond          #CondNot
;



INT :        [0-9]+;
LPAR:       '(';
RPAR:       ')';
LBRAC:      '[';
RBRAC:      ']';
MINUS:      '-';
PLUS:       '+';
DOT:        '.';
MUL:        '*';
DOTDOT:     '..';
AT:         '@';
COMMA:      ',';
PATHSEP:	'/';
ABRPATH:	'//';
EQUL:	'=';
DEQUL:	'==';
StringConstant:  '"'+[a-zA-Z0-9,.A!?:; ''""-]+'"';
