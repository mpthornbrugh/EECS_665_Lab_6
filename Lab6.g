// The name of the grammar. The name here needs to match the name of the
// file, including capitalization.
grammar Lab6;

// Define literals, keywords or operators, here as tokens.
tokens {
    PLUS = '+';
    MINUS = '-';
    MULT = '*';
    DIV = '/';
    EXPONENT = '^';
    OPENPAR = '(';
    CLOSEPAR = ')';
    LOG = 'log';
    SINE = 'sin';
    COSINE = 'cos';
    TANGENT = 'tan';
}

// Written in the target language. The header section can be
// used to import any Java classes that may be required.
@header {
	import java.lang.Math;
	import java.io.*;
}

// A main function to the parser. This function will setup the
// parsers input stream and execute the rule named "top".
@members {
    public static void main(String[] args) throws Exception {
	System.out.println("octal numbers are preceded by 'oct'");
        Lab6Lexer lex = new Lab6Lexer(new ANTLRInputStream(System.in));
       	CommonTokenStream tokens = new CommonTokenStream(lex);
        Lab6Parser parser = new Lab6Parser(tokens);

        try {
            parser.top();
        } catch (RecognitionException e)  {
            e.printStackTrace();
        }
    }
}

// Some example lexer fragments. These fragments don't produce any
// tokens themselves but can be used inside of other lexer rules.
fragment BIN: '0' .. '1';
fragment OCT: '0' .. '7';
fragment DEC: '0' .. '9';
fragment HEX: ('0' .. '9' | 'A' .. 'F' | 'a' .. 'f');

// The white space lexer rule. Match any number of white space characters
// and hide the results from the parser.
WS : (' ' | '\t' | '\r' | '\n')+ { $channel=HIDDEN; };

// The decimal value lexer rule. Match one or more decimal digits.
INT : DEC+ ;
DECIMAL : DEC+'.'DEC+ ;

// The binary value lexer rule. Match one or more decimal digits.
BINARY : '0b'BIN+ ;

// The octal value lexer rule. Match one or more octal digits.
OCTAL : 'oct'OCT+ ;

// The hexadecimal value lexer rule. Match one or more hexadecimal digits.
HEXADECIMAL: '0x'HEX+ ;

// The top rule. You should replace this with your own rule definition to
// parse expressions according to the assignment.
top 	: expr
	| OPENPAR expr CLOSEPAR
    	;

expr 
	: addExpr { System.out.println( $addExpr.value ); } 
	| subExpr { System.out.println( $subExpr.value ); }
	| mulExpr { System.out.println( $mulExpr.value ); }
	| divExpr { System.out.println( $divExpr.value ); }
	| expExpr { System.out.println( $expExpr.value ); }
	| sinExpr { System.out.println( $sinExpr.value ); }
	| cosExpr { System.out.println( $cosExpr.value ); }
	| tanExpr { System.out.println( $tanExpr.value ); }
	| logExpr { System.out.println( $logExpr.value ); }
	| digit   { System.out.println( $digit.value ); }
	;

parExpr returns [float value]
	: OPENPAR addExpr CLOSEPAR {$value = $addExpr.value;}
	| OPENPAR subExpr CLOSEPAR {$value = $subExpr.value;}
	| OPENPAR mulExpr CLOSEPAR {$value = $mulExpr.value;}
	| OPENPAR divExpr CLOSEPAR {$value = $divExpr.value;}
	;
	
addExpr returns [float value] 
	: l = digit { $value = $l.value; }
		( PLUS r = digit { $value += $r.value; } ) 
	| l = digit {$value = $l.value; }
		( PLUS r = addExpr { $value += $r.value; } )
	| l = digit {$value = $l.value; }
		( PLUS r = subExpr { $value += $r.value; } )
	| l = digit {$value = $l.value; }
		( PLUS r = mulExpr { $value += $r.value; })
	| l = digit {$value = $l.value; }
		( PLUS r = divExpr { $value += $r.value; })
	| l = digit {$value = $l.value; }
		( PLUS r = parExpr { $value += $r.value; })
	;
						   
subExpr returns [float value] 
	: l = digit { $value = $l.value; }
		( MINUS r = digit { $value -= $r.value; } )
	| l = digit { $value = $l.value; }
		( MINUS r = addExpr { $value -= $r.value; } )
	| l = digit { $value = $l.value; }
		( MINUS r = subExpr { $value -= $r.value; } )
	| l = digit { $value = $l.value; }
		( MINUS r = mulExpr { $value -= $r.value; } )
	| l = digit { $value = $l.value; }
		( MINUS r = divExpr { $value -= $r.value; } )
	| l = digit { $value = $l.value; }
		( MINUS r = parExpr { $value -= $r.value; } )
	;

mulExpr returns [float value] 
	: l = digit { $value = $l.value; }
		( MULT r = digit { $value *= $r.value; } )
	| l = digit { $value = $l.value; }
		( MULT r = addExpr { $value *= $r.value; } )
	| l = digit { $value = $l.value; }
		( MULT r = subExpr { $value *= $r.value; } )
	| l = digit { $value = $l.value; }
		( MULT r = mulExpr { $value *= $r.value; } )
	| l = digit { $value = $l.value; }
		( MULT r = divExpr { $value *= $r.value; } )
	| l = digit { $value = $l.value; }
		( MULT r = parExpr { $value *= $r.value; } )
	;
	
divExpr returns [float value] 
	: l = digit { $value = $l.value; }
		( DIV r = digit { if ($r.value == 0){$value = 0;System.out.println("Cannot divide by 0.");}else {$value /= $r.value;} } )
	| l = digit { $value = $l.value; }
		( DIV r = addExpr { if ($r.value == 0){$value = 0;System.out.println("Cannot divide by 0.");}else {$value /= $r.value;} } )
	| l = digit { $value = $l.value; }
		( DIV r = subExpr { if ($r.value == 0){$value = 0;System.out.println("Cannot divide by 0.");}else {$value /= $r.value;} } )
	| l = digit { $value = $l.value; }
		( DIV r = mulExpr { if ($r.value == 0){$value = 0;System.out.println("Cannot divide by 0.");}else {$value /= $r.value;} } )
	| l = digit { $value = $l.value; }
		( DIV r = divExpr { if ($r.value == 0){$value = 0;System.out.println("Cannot divide by 0.");}else {$value /= $r.value;} } )
	| l = digit { $value = $l.value; }
		( DIV r = parExpr { if ($r.value == 0){$value = 0;System.out.println("Cannot divide by 0.");}else {$value /= $r.value;} } )
	;
	
expExpr returns [float value] 
	: l = digit { $value = $l.value; }
		( EXPONENT r = digit { $value = (float)(Math.pow((float)$value, (float)$r.value)); } )
	;
	
sinExpr returns [float value] 
	: SINE r = addExpr { $value = (float)(Math.sin((float)$r.value)); }
	| SINE r = subExpr { $value = (float)(Math.sin((float)$r.value)); }
	| SINE r = mulExpr { $value = (float)(Math.sin((float)$r.value)); }
	| SINE r = divExpr { $value = (float)(Math.sin((float)$r.value)); }
	| SINE r = digit { $value = (float)(Math.sin((float)$r.value)); }
	;
	
cosExpr returns [float value] 
	: COSINE r = digit { $value = (float)(Math.cos((float)$r.value)); }
	| COSINE r = addExpr { $value = (float)(Math.cos((float)$r.value)); }
	| COSINE r = subExpr { $value = (float)(Math.cos((float)$r.value)); }
	| COSINE r = mulExpr { $value = (float)(Math.cos((float)$r.value)); }
	| COSINE r = divExpr { $value = (float)(Math.cos((float)$r.value)); }
	;

tanExpr returns [float value] 
	: TANGENT r = digit { $value = (float)(Math.tan((float)$r.value)); }
	| TANGENT r = addExpr { $value = (float)(Math.tan((float)$r.value)); }
	| TANGENT r = subExpr { $value = (float)(Math.tan((float)$r.value)); }
	| TANGENT r = mulExpr { $value = (float)(Math.tan((float)$r.value)); }
	| TANGENT r = divExpr { $value = (float)(Math.tan((float)$r.value)); }
	;
	
logExpr returns [float value] 
	: LOG r = digit { $value = (float)(Math.log((float)$r.value)); }
	| LOG r = addExpr { $value = (float)(Math.log((float)$r.value)); }
	| LOG r = subExpr { $value = (float)(Math.log((float)$r.value)); }
	| LOG r = mulExpr { $value = (float)(Math.log((float)$r.value)); }
	| LOG r = divExpr { $value = (float)(Math.log((float)$r.value)); }
	;
	
digit returns [float value] 
	: INT { $value = Integer.parseInt( $INT.getText(), 10); }
	| DECIMAL { $value = Float.parseFloat( $DECIMAL.getText()); }
	| BINARY { $value = Integer.parseInt( $BINARY.getText().substring(2), 2); }
	| HEXADECIMAL { $value = Integer.parseInt( $HEXADECIMAL.getText().substring(2), 16); }
	| OCTAL { $value = Integer.parseInt( $OCTAL.getText().substring(3), 8); }
	;

























