// $ANTLR 3.4 Lab6.g 2015-10-20 12:23:02

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class Lab6Lexer extends Lexer {
    public static final int EOF=-1;
    public static final int BIN=4;
    public static final int BINARY=5;
    public static final int CLOSEPAR=6;
    public static final int COSINE=7;
    public static final int DEC=8;
    public static final int DECIMAL=9;
    public static final int DIV=10;
    public static final int EXPONENT=11;
    public static final int HEX=12;
    public static final int HEXADECIMAL=13;
    public static final int INT=14;
    public static final int LOG=15;
    public static final int MINUS=16;
    public static final int MULT=17;
    public static final int OCT=18;
    public static final int OCTAL=19;
    public static final int OPENPAR=20;
    public static final int PLUS=21;
    public static final int SINE=22;
    public static final int TANGENT=23;
    public static final int WS=24;

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
            // Lab6.g:46:13: ( '0' .. '1' )
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
            // Lab6.g:47:13: ( '0' .. '7' )
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
            // Lab6.g:48:13: ( '0' .. '9' )
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
            // Lab6.g:49:13: ( ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) )
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
            // Lab6.g:53:4: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // Lab6.g:53:6: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // Lab6.g:53:6: ( ' ' | '\\t' | '\\r' | '\\n' )+
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

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lab6.g:56:5: ( ( DEC )+ )
            // Lab6.g:56:7: ( DEC )+
            {
            // Lab6.g:56:7: ( DEC )+
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
    // $ANTLR end "INT"

    // $ANTLR start "DECIMAL"
    public final void mDECIMAL() throws RecognitionException {
        try {
            int _type = DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lab6.g:57:9: ( ( DEC )+ '.' ( DEC )+ )
            // Lab6.g:57:11: ( DEC )+ '.' ( DEC )+
            {
            // Lab6.g:57:11: ( DEC )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                    alt3=1;
                }


                switch (alt3) {
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
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            match('.'); 

            // Lab6.g:57:18: ( DEC )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                    alt4=1;
                }


                switch (alt4) {
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
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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

    // $ANTLR start "BINARY"
    public final void mBINARY() throws RecognitionException {
        try {
            int _type = BINARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lab6.g:60:8: ( '0b' ( BIN )+ )
            // Lab6.g:60:10: '0b' ( BIN )+
            {
            match("0b"); 



            // Lab6.g:60:14: ( BIN )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '0' && LA5_0 <= '1')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
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
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BINARY"

    // $ANTLR start "OCTAL"
    public final void mOCTAL() throws RecognitionException {
        try {
            int _type = OCTAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lab6.g:63:7: ( 'oct' ( OCT )+ )
            // Lab6.g:63:9: 'oct' ( OCT )+
            {
            match("oct"); 



            // Lab6.g:63:14: ( OCT )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '0' && LA6_0 <= '7')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
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
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OCTAL"

    // $ANTLR start "HEXADECIMAL"
    public final void mHEXADECIMAL() throws RecognitionException {
        try {
            int _type = HEXADECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lab6.g:66:12: ( '0x' ( HEX )+ )
            // Lab6.g:66:14: '0x' ( HEX )+
            {
            match("0x"); 



            // Lab6.g:66:18: ( HEX )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '0' && LA7_0 <= '9')||(LA7_0 >= 'A' && LA7_0 <= 'F')||(LA7_0 >= 'a' && LA7_0 <= 'f')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
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
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEXADECIMAL"

    public void mTokens() throws RecognitionException {
        // Lab6.g:1:8: ( CLOSEPAR | COSINE | DIV | EXPONENT | LOG | MINUS | MULT | OPENPAR | PLUS | SINE | TANGENT | WS | INT | DECIMAL | BINARY | OCTAL | HEXADECIMAL )
        int alt8=17;
        alt8 = dfa8.predict(input);
        switch (alt8) {
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
                // Lab6.g:1:83: INT
                {
                mINT(); 


                }
                break;
            case 14 :
                // Lab6.g:1:87: DECIMAL
                {
                mDECIMAL(); 


                }
                break;
            case 15 :
                // Lab6.g:1:95: BINARY
                {
                mBINARY(); 


                }
                break;
            case 16 :
                // Lab6.g:1:102: OCTAL
                {
                mOCTAL(); 


                }
                break;
            case 17 :
                // Lab6.g:1:108: HEXADECIMAL
                {
                mHEXADECIMAL(); 


                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\15\uffff\2\22\5\uffff";
    static final String DFA8_eofS =
        "\24\uffff";
    static final String DFA8_minS =
        "\1\11\14\uffff\2\56\5\uffff";
    static final String DFA8_maxS =
        "\1\164\14\uffff\1\170\1\71\5\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\2"+
        "\uffff\1\20\1\17\1\21\1\15\1\16";
    static final String DFA8_specialS =
        "\24\uffff}>";
    static final String[] DFA8_transitionS = {
            "\2\14\2\uffff\1\14\22\uffff\1\14\7\uffff\1\10\1\1\1\7\1\11\1"+
            "\uffff\1\6\1\uffff\1\3\1\15\11\16\44\uffff\1\4\4\uffff\1\2\10"+
            "\uffff\1\5\2\uffff\1\17\3\uffff\1\12\1\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\23\1\uffff\12\16\50\uffff\1\20\25\uffff\1\21",
            "\1\23\1\uffff\12\16",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( CLOSEPAR | COSINE | DIV | EXPONENT | LOG | MINUS | MULT | OPENPAR | PLUS | SINE | TANGENT | WS | INT | DECIMAL | BINARY | OCTAL | HEXADECIMAL );";
        }
    }
 

}