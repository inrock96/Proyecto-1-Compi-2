
/* imports */

package AnalizadorFlexCup;
import java_cup.runtime.*;
import java.util.*;

/*Declaraciones*/

%%

%class Lexico
%public
%line
%char
%cup
%unicode
%ignorecase

%init{
    yyline = 1;
    yychar = 1;
%init}

    //----->ER
    IDENTIFICADOR = [.]?([a-zA-Z][".""_"a-zA-Z0-9])
    NUMERO = [0-9]+
    DECIMAL = [0-9]+[.][0-9]+
    COMENTUNILINEA =("#".*\r\n)|("#".*\n)|("#".*\r)
    COMENTMULTILINEA ="#*""#"*([^*/]|[^*]"#"|"*"[^/])*"#"*"*#"
    BLANCOS = \r|[ \t\f]
    CADENA          = [\"]([^\"\n]|(\\\"))*[\"]

%%
    <YYINITIAL>{
        "null" { return new Symbol(sym.RNULL,yyline,yychar,yytext());}
        "if" { return new Symbol(sym.RIF,yyline,yychar,yytext());}
        "else" { return new Symbol(sym.RELSE,yyline,yychar,yytext());}
        "print" { return new Symbol(sym.RPRINT,yyline,yychar,yytext());}
        "switch" { return new Symbol(sym.RSWITCH,yyline,yychar,yytext());}
        "case" { return new Symbol(sym.RCASE,yyline,yychar,yytext());}
        "while" { return new Symbol(sym.RWHILE,yyline,yychar,yytext());}
        "do" { return new Symbol(sym.RDO,yyline,yychar,yytext());}
        "for" { return new Symbol(sym.RFOR,yyline,yychar,yytext());}
        "in" { return new Symbol(sym.RIN,yyline,yychar,yytext());}
        "break" { return new Symbol(sym.RBREAK,yyline,yychar,yytext());}
        "continue" { return new Symbol(sym.RCONTINUE,yyline,yychar,yytext());}
        "return" { return new Symbol(sym.RRETURN,yyline,yychar,yytext());}
        "function" { return new Symbol(sym.RFUNC,yyline,yychar,yytext());}
        "c" { return new Symbol(sym.RC,yyline,yychar,yytext());}
        "typeof" { return new Symbol(sym.RTYPEOF,yyline,yychar,yytext());}
        "length" { return new Symbol(sym.RLENGTH,yyline,yychar,yytext());}
        "ncol" { return new Symbol(sym.RNCOL,yyline,yychar,yytext());}
        "nrow" { return new Symbol(sym.RNROW,yyline,yychar,yytext());}
        "stringlength" { return new Symbol(sym.RSTRLENGTH,yyline,yychar,yytext());}
        "remove" { return new Symbol(sym.RREMOVE,yyline,yychar,yytext());}
        "tolowercase" { return new Symbol(sym.RTOLOWER,yyline,yychar,yytext());}
        "touppercase" { return new Symbol(sym.RTOUPPER,yyline,yychar,yytext());}
        "trunk" { return new Symbol(sym.RTRUNK,yyline,yychar,yytext());}
        "round" { return new Symbol(sym.RROUND,yyline,yychar,yytext());}
        "mean" { return new Symbol(sym.RMEAN,yyline,yychar,yytext());}
        "median" { return new Symbol(sym.RMEDIAN,yyline,yychar,yytext());}
        "mode" { return new Symbol(sym.RMODE,yyline,yychar,yytext());}
        "list" { return new Symbol(sym.RLIST,yyline,yychar,yytext());}
        "matrix" { return new Symbol(sym.RMATRIX,yyline,yychar,yytext());}
        "array" { return new Symbol(sym.RARRAY,yyline,yychar,yytext());}
        "pie" { return new Symbol(sym.RPIE,yyline,yychar,yytext());}
        "barplot" { return new Symbol(sym.RBARPLOT,yyline,yychar,yytext());}
        "plot" { return new Symbol(sym.RPLOT,yyline,yychar,yytext());}
        "hist" { return new Symbol(sym.RHIST,yyline,yychar,yytext());}
        
        //----->Simbolos

        ")" { return new Symbol(sym.PARDER,yyline,yychar,yytext());}
        "(" { return new Symbol(sym.PARIZQ,yyline,yychar,yytext());}
        "{" { return new Symbol(sym.LLAVIZQ,yyline,yychar,yytext());}
        "}" { return new Symbol(sym.LLAVDER,yyline,yychar,yytext());}
        "[" { return new Symbol(sym.CORIZQ,yyline,yychar,yytext());}
        "]" { return new Symbol(sym.CORDER,yyline,yychar,yytext());}
        "=" { return new Symbol(sym.IGUAL,yyline,yychar,yytext());}
        "+" { return new Symbol(sym.MAS,yyline,yychar,yytext());}
        "-" { return new Symbol(sym.MENOS,yyline,yychar,yytext());}
        "*" { return new Symbol(sym.POR,yyline,yychar,yytext());}
        "/" { return new Symbol(sym.DIV,yyline,yychar,yytext());}
        "^" { return new Symbol(sym.POT,yyline,yychar,yytext());}
        "%%" { return new Symbol(sym.MOD,yyline,yychar,yytext());}
        "==" { return new Symbol(sym.IGUALACION,yyline,yychar,yytext());}
        "!=" { return new Symbol(sym.DIFERENCIACION,yyline,yychar,yytext());}
        "<" { return new Symbol(sym.MENQUE,yyline,yychar,yytext());}
        ">" { return new Symbol(sym.MAYQUE,yyline,yychar,yytext());}
        "<=" { return new Symbol(sym.MENIGUAL,yyline,yychar,yytext());}
        ">=" { return new Symbol(sym.MAYIGUAL,yyline,yychar,yytext());}
        "&" { return new Symbol(sym.AND,yyline,yychar,yytext());}
        "|" { return new Symbol(sym.OR,yyline,yychar,yytext());}
        "!" { return new Symbol(sym.NOT,yyline,yychar,yytext());}
        "?" { return new Symbol(sym.TERNARIO,yyline,yychar,yytext());}
        ":" { return new Symbol(sym.DOSPT,yyline,yychar,yytext());}
        ";" { return new Symbol(sym.PTCOMA,yyline,yychar,yytext());}
        "," { return new Symbol(sym.COMA,yyline,yychar,yytext());}
        "=>" { return new Symbol(sym.IGUALFUNC,yyline,yychar,yytext());}
        \n {yychar=1;}
        {IDENTIFICADOR}  { return new Symbol(sym.IDENTIFICADOR,yyline,yychar,yytext());}
        {NUMERO}  { return new Symbol(sym.NUMERO,yyline,yychar,yytext());}
        {DECIMAL}  { return new Symbol(sym.DECIMAL,yyline,yychar,yytext());}
        {CADENA}  { return new Symbol(sym.CADENA,yyline,yychar,(yytext()).substring(1,yytext().length()-1));}
        
        {BLANCOS}  { }
        {COMENTMULTILINEA}  { System.out.println("reconoció comentario multi");}
        {COMENTUNILINEA}  { System.out.println("reconoció comentario unilinea");}
        
    }
    .{System.err.println("Este es un error léxico:"+yytext()+", en la linea: "+yyline+", en la columna: "+yychar)}


