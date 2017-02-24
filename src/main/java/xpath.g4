grammar xpath;


ap:
    doc  '/' rp     #apRoot
|   doc '//' rp     #apCurrent
;

doc: 'doc' '(' filename  ')';
filename: StringConstant;


rp:
    String          #TagName
|   '*'             #All
|   '.'             #Current
|   '..'            #Parent
|   'text()'        #Text
|   '@' String      #AttName
|   '(' rp ')'      #RpPrthsis
|   rp '/' rp       #Rproot
|   rp '//' rp      #Rpcurrent
|   rp '[' filter ']'#Rpfilter
|   rp ',' rp       #RpAnd
;

filter:
    rp              #FilterRp
|   rp '=' rp       #FilterEqual
|   rp 'eq' rp      #FilterEqual
|   rp '==' rp      #FilterIs
|   rp 'is' rp      #FilterIs
|   '(' filter ')'  #FilterPrthsis
|   filter 'and' filter #FilterAnd
|   filter 'or' filter  #FilterOr
|   'not' filter        #FilterNot
;



String: LETTER (LETTER | DIGIT)*;
fragment LETTER: [a-zA-Z_];
fragment DIGIT: [0-9];

WS:     [ \t\r\n]+ -> skip;
StringConstant:  '"'+[a-zA-Z0-9,.!?:; _'"-]+'"';

