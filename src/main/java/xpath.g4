/* xpath.g4
 *
 *
 */

grammar xpath;

ap
	: doc '/' rp        # ApChildren
	| doc '//' rp       # ApAll
	;

doc
	: DOC '(' '"' fname '"' ')'
	;

fname
	: NAME ('.' NAME)?
	;

rp
	: NAME                         # TagName
	| '*'                          # AllChildren
	| '.'                          # Current
	| '..'                         # Parent
	| TXT                          # Text
	| '@' NAME                     # Attribute
	| '(' rp ')'                   # RpwithP
	| rp '/' rp                    # RpChildren
	| rp '//' rp                   # RpAll
	| rp '[' filter ']'            # RpFilter
	| rp ',' rp                    # TwoRp
	;

filter
	: rp                           # FilRp
	| rp '=' rp                    # FilEqual
	| rp 'eq' rp                   # FilEqual
	| rp '==' rp                   # FilIs
	| rp 'is' rp                   # FilIs
	| '(' filter ')'               # FilwithP
	| filter 'and' filter          # FilAnd
	| filter 'or' filter           # FilOr
	| 'not' filter                 # FilNot
	;

NUM:    [0-9]+;
DOC:	'document';
TXT:	'text()';
NAME:	[a-zA-Z0-9_-]+;
OPAR: 	'(';
CPAR: 	')';
OBRAC:	'[';
CBRAC:	']';
DOT:	'.';
DDOT:	'..';
COMMA:	',';
AT:		'@';
PATH:	'/';
DPATH:	'//';
STAR:	'*';
EQUL:	'=';
DEQUL:	'==';
NEWLINE:'\r'? '\n';
WS  :   [ \t]+ -> skip;