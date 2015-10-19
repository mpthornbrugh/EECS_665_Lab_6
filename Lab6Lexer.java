// $ANTLR 3.4 Lab6.g 2015-10-19 16:05:29

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class Lab6Lexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public Lab6Lexer() {} 
    public Lab6Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public Lab6Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "Lab6.g"; }

    // $ANTLR start "CLOSEPAR"
    public final void mCLOSEPAR() throws RecognitionException {
        try {
            int _type = CLOSEPAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lab6.g:2:10: ( ')' )
            // Lab6.g:2:12: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLOSEPAR"

    // $ANTLR start "COSINE"
    public final void mCOSINE() throws RecognitionException {
        try {
            int _type = COSINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lab6.g:3:8: ( 'cos' )
            // Lab6.g:3:10: 'cos'
            {
            match("cos"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COSINE"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lab6.g:4:5: ( '/' )
            // Lab6.g:4:7: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            int _type = EXPONENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lab6.g:5:10: ( '^' )
            // Lab6.g:5:12: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "LOG"
    public final void mLOG() throws RecognitionException {
        try {
            int _type = LOG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lab6.g:6:5: ( 'log' )
            // Lab6.g:6:7: 'log'
            {
            match("log"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LOG"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lab6.g:7:7: ( '-' )
            // Lab6.g:7:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "MULT"
    public final void mMULT() throws RecognitionException {
        try {
            int _type = MULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lab6.g:8:6: ( '*' )
            // Lab6.g:8:8: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MULT"

    // $ANTLR start "OPENPAR"
    public final void mOPENPAR() throws RecognitionException {
        try {
            int _type = OPENPAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lab6.g:9:9: ( '(' )
            // Lab6.g:9:11: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPENPAR"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lab6.g:10:6: ( '+' )
            // Lab6.g:10:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "SINE"
    public final void mSINE() throws RecognitionException {
        try {
            int _type = SINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lab6.g:11:6: ( 'sin' )
            // Lab6.g:11:8: 'sin'
            {
            match("sin"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SINE"

    // $ANTLR start "TANGENT"
    public final void mTANGENT() throws RecognitionException {
        try {
            int _type = TANGENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lab6.g:12:9: ( 'tan' )
            // Lab6.g:12:11: 'tan'
            {
            match("tan"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TANGENT"

    // $ANTLR start "BIN"
    public final void mBIN() throws RecognitionException {
        try {
            // Lab6.g:43:13: ( '0' .. '1' )
            // Lab6.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '1') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BIN"

    // $ANTLR start "OCT"
    public final void mOCT() throws RecognitionException {
        try {
            // Lab6.g:44:13: ( '0' .. '7' )
            // Lab6.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OCT"

    // $ANTLR start "DEC"
    public final void mDEC() throws RecognitionException {
        try {
            // Lab6.g:45:13: ( '0' .. '9' )
            // Lab6.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DEC"

    // $ANTLR start "HEX"
    public final void mHEX() throws RecognitionException {
        try {
            // Lab6.g:46:13: ( ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) )
            // Lab6.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lab6.g:50:4: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // Lab6.g:50:6: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // Lab6.g:50:6: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '\t' && LA1_0 <= '\n')||LA1_0=='\r'||LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Lab6.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


             _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "DECIMAL"
    public final void mDECIMAL() throws RecognitionException {
        try {
            int _type = DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lab6.g:53:9: ( ( DEC )+ )
            // Lab6.g:53:11: ( DEC )+
            {
            // Lab6.g:53:11: ( DEC )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Lab6.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DECIMAL"

    public void mTokens() throws RecognitionException {
        // Lab6.g:1:8: ( CLOSEPAR | COSINE | DIV | EXPONENT | LOG | MINUS | MULT | OPENPAR | PLUS | SINE | TANGENT | WS | DECIMAL )
        int alt3=13;
        switch ( input.LA(1) ) {
        case ')':
            {
            alt3=1;
            }
            break;
        case 'c':
            {
            alt3=2;
            }
            break;
        case '/':
            {
            alt3=3;
            }
            break;
        case '^':
            {
            alt3=4;
            }
            break;
        case 'l':
            {
            alt3=5;
            }
            break;
        case '-':
            {
            alt3=6;
            }
            break;
        case '*':
            {
            alt3=7;
            }
            break;
        case '(':
            {
            alt3=8;
            }
            break;
        case '+':
            {
            alt3=9;
            }
            break;
        case 's':
            {
            alt3=10;
            }
            break;
        case 't':
            {
            alt3=11;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt3=12;
            }
            break;
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt3=13;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 3, 0, input);

            throw nvae;

        }

        switch (alt3) {
            case 1 :
                // Lab6.g:1:10: CLOSEPAR
                {
                mCLOSEPAR(); 


                }
                break;
            case 2 :
                // Lab6.g:1:19: COSINE
                {
                mCOSINE(); 


                }
                break;
            case 3 :
                // Lab6.g:1:26: DIV
                {
                mDIV(); 


                }
                break;
            case 4 :
                // Lab6.g:1:30: EXPONENT
                {
                mEXPONENT(); 


                }
                break;
            case 5 :
                // Lab6.g:1:39: LOG
                {
                mLOG(); 


                }
                break;
            case 6 :
                // Lab6.g:1:43: MINUS
                {
                mMINUS(); 


                }
                break;
            case 7 :
                // Lab6.g:1:49: MULT
                {
                mMULT(); 


                }
                break;
            case 8 :
                // Lab6.g:1:54: OPENPAR
                {
                mOPENPAR(); 


                }
                break;
            case 9 :
                // Lab6.g:1:62: PLUS
                {
                mPLUS(); 


                }
                break;
            case 10 :
                // Lab6.g:1:67: SINE
                {
                mSINE(); 


                }
                break;
            case 11 :
                // Lab6.g:1:72: TANGENT
                {
                mTANGENT(); 


                }
                break;
            case 12 :
                // Lab6.g:1:80: WS
                {
                mWS(); 


                }
                break;
            case 13 :
                // Lab6.g:1:83: DECIMAL
                {
                mDECIMAL(); 


                }
                break;

        }

    }


 

}