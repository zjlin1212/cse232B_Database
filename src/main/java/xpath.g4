/* xpath.g4
 *
 *
 */
grammar xpath;


ap:
    doc  '/' rp     #apRoot
|   doc '//' rp     #apCurrent

;
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

doc: 'doc' '(' '"' filename '"' ')';
filename: String ('.' String)?;


String:[a-zA-Z0-9_-]+;



