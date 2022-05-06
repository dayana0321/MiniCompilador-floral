grammar minicompilador;

//Inicio del analisis sintactico
//Declaracion de un bloque
program: PROGRAM ID BRACKET_OPEN
	sentence* 
	BRACKET_CLOSE;

//Declaracion para la condicion if
if_decl: IF PAR_OPEN (ID | NUMBER | CADENA) (GT| LT | GEQ | LEQ | EQ) (ID | NUMBER | CADENA) PAR_CLOSE BRACKET_OPEN sentence* BRACKET_CLOSE ELSE BRACKET_OPEN sentence* BRACKET_CLOSE;	
//Declaracion de una sentencia
sentence: var_decl | var_assig |println |asig_op| operacion | if_decl;

//Declaración de una variable 
var_decl: (INT|STRING) ID SEMICOLON;
//Inicialización de una variable 
var_assig: ID ASIGN (NUMBER|CADENA) SEMICOLON;
//Mostrar en pantalla
println: PRINTLN (NUMBER | CADENA) SEMICOLON;
//Operacion Matemática
asig_op: ID ASIGN operacion;
operacion: (NUMBER PLUS NUMBER | NUMBER MINUS NUMBER| NUMBER MULT NUMBER | NUMBER DIV NUMBER) SEMICOLON;


//Analisis Lexico
//Palabras Reservadas
//Palabra reservada para declarar un bloque de programa
PROGRAM: 'rosa';
//Palabra reservada para una variable de tipo INT
INT: 'tulipan';
//Palabra reservada para una variable de tipo STRING
STRING: 'petunia';
//Palabra reservada para mostrar en pantalla.
PRINTLN: 'orquidea';
//Palabra reservada para el condicional IF
IF: 'lirio';
//Palabra reservada para ELSE
ELSE: 'hortensia';
//Simbolo de asignacion
ASIGN: ':=';
//Operadores Aritmeticos
PLUS: ' + ';
MINUS: ' - ';
MULT:  ' * ';
DIV: ' / ';

AND: '&&';
OR: '||';
//Operadores Logicos
GT: '>';
LT: '<';
GEQ: '>=';
LEQ: '<=';
EQ: '==';
//Corchetes
BRACKET_OPEN: '{';
BRACKET_CLOSE: '}';
//Parentesis
PAR_OPEN: '(';
PAR_CLOSE: ')';
//Simbolo de finalizacion de una sentencia.
SEMICOLON: ';';

//Expresiones regulares
//Expresión Regular que permite letras minusculas, mayusculas y numeros para nombrar identificadores.
ID: [a-zA-Z][a-zA-Z0-9]*;
//Expresion Regular que permite numeros enteros.
NUMBER: [0-9]+;
//Expresion Regular para reconocer cadenas de texto entre comillas dobles.
CADENA: '"'(~('"'|'\n'|'\r'))*'"';
//Ignora espacios en blanco, tabulaciones y saltos de linea.
WS:[ \t\r\n]+ -> skip;
//Permite reconocer los comentarios de linea.
LINE_COMMENT: '//'~[\r\n]* -> skip;
