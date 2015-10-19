// $ANTLR 3.4 Lab6.g 2015-10-19 16:05:29



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class Lab6Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BIN", "CLOSEPAR", "COSINE", "DEC", "DECIMAL", "DIV", "EXPONENT", "HEX", "LOG", "MINUS", "MULT", "OCT", "OPENPAR", "PLUS", "SINE", "TANGENT", "WS"
    };

    public static final int EOF=-1;
    public static final int BIN=4;
    public static final int CLOSEPAR=5;
    public static final int COSINE=6;
    public static final int DEC=7;
    public static final int DECIMAL=8;
    public static final int DIV=9;
    public static final int EXPONENT=10;
    public static final int HEX=11;
    public static final int LOG=12;
    public static final int MINUS=13;
    public static final int MULT=14;
    public static final int OCT=15;
    public static final int OPENPAR=16;
    public static final int PLUS=17;
    public static final int SINE=18;
    public static final int TANGENT=19;
    public static final int WS=20;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public Lab6Parser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public Lab6Parser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return Lab6Parser.tokenNames; }
    public String getGrammarFileName() { return "Lab6.g"; }


        public static void main(String[] args) throws Exception {
            Lab6Lexer lex = new Lab6Lexer(new ANTLRInputStream(System.in));
           	CommonTokenStream tokens = new CommonTokenStream(lex);
            Lab6Parser parser = new Lab6Parser(tokens);

            try {
                parser.top();
            } catch (RecognitionException e)  {
                e.printStackTrace();
            }
        }



    // $ANTLR start "top"
    // Lab6.g:66:1: top : ( expr EOF | EOF );
    public final void top() throws RecognitionException {
        try {
            // Lab6.g:66:5: ( expr EOF | EOF )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==DECIMAL) ) {
                alt1=1;
            }
            else if ( (LA1_0==EOF) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // Lab6.g:66:7: expr EOF
                    {
                    pushFollow(FOLLOW_expr_in_top273);
                    expr();

                    state._fsp--;


                    match(input,EOF,FOLLOW_EOF_in_top275); 

                    }
                    break;
                case 2 :
                    // Lab6.g:67:7: EOF
                    {
                    match(input,EOF,FOLLOW_EOF_in_top283); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "top"



    // $ANTLR start "expr"
    // Lab6.g:70:1: expr : term ;
    public final void expr() throws RecognitionException {
        float term1 =0.0f;


        try {
            // Lab6.g:70:6: ( term )
            // Lab6.g:70:8: term
            {
            pushFollow(FOLLOW_term_in_expr296);
            term1=term();

            state._fsp--;


             System.out.println( term1 ); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "expr"



    // $ANTLR start "term"
    // Lab6.g:72:1: term returns [float value] : l= digit ( PLUS r= digit )* ;
    public final float term() throws RecognitionException {
        float value = 0.0f;


        float l =0.0f;

        float r =0.0f;


        try {
            // Lab6.g:72:28: (l= digit ( PLUS r= digit )* )
            // Lab6.g:72:30: l= digit ( PLUS r= digit )*
            {
            pushFollow(FOLLOW_digit_in_term315);
            l=digit();

            state._fsp--;


             value = l; 

            // Lab6.g:72:63: ( PLUS r= digit )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==PLUS) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Lab6.g:72:65: PLUS r= digit
            	    {
            	    match(input,PLUS,FOLLOW_PLUS_in_term321); 

            	    pushFollow(FOLLOW_digit_in_term327);
            	    r=digit();

            	    state._fsp--;


            	     value += r; 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "term"



    // $ANTLR start "digit"
    // Lab6.g:74:1: digit returns [float value] : DECIMAL ;
    public final float digit() throws RecognitionException {
        float value = 0.0f;


        Token DECIMAL2=null;

        try {
            // Lab6.g:74:29: ( DECIMAL )
            // Lab6.g:74:31: DECIMAL
            {
            DECIMAL2=(Token)match(input,DECIMAL,FOLLOW_DECIMAL_in_digit345); 

             value = Integer.parseInt( DECIMAL2.getText(), 10 ); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "digit"

    // Delegated rules


 

    public static final BitSet FOLLOW_expr_in_top273 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_top275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOF_in_top283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_expr296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_digit_in_term315 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_PLUS_in_term321 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_digit_in_term327 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_DECIMAL_in_digit345 = new BitSet(new long[]{0x0000000000000002L});

}