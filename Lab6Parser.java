// $ANTLR 3.4 Lab6.g 2015-10-20 12:23:02

	import java.lang.Math;
	import java.io.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class Lab6Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BIN", "BINARY", "CLOSEPAR", "COSINE", "DEC", "DECIMAL", "DIV", "EXPONENT", "HEX", "HEXADECIMAL", "INT", "LOG", "MINUS", "MULT", "OCT", "OCTAL", "OPENPAR", "PLUS", "SINE", "TANGENT", "WS"
    };

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



    // $ANTLR start "top"
    // Lab6.g:70:1: top : ( expr | OPENPAR expr CLOSEPAR );
    public final void top() throws RecognitionException {
        try {
            // Lab6.g:70:6: ( expr | OPENPAR expr CLOSEPAR )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==BINARY||LA1_0==COSINE||LA1_0==DECIMAL||(LA1_0 >= HEXADECIMAL && LA1_0 <= LOG)||LA1_0==OCTAL||(LA1_0 >= SINE && LA1_0 <= TANGENT)) ) {
                alt1=1;
            }
            else if ( (LA1_0==OPENPAR) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // Lab6.g:70:8: expr
                    {
                    pushFollow(FOLLOW_expr_in_top312);
                    expr();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // Lab6.g:71:4: OPENPAR expr CLOSEPAR
                    {
                    match(input,OPENPAR,FOLLOW_OPENPAR_in_top317); 

                    pushFollow(FOLLOW_expr_in_top319);
                    expr();

                    state._fsp--;


                    match(input,CLOSEPAR,FOLLOW_CLOSEPAR_in_top321); 

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
    // Lab6.g:74:1: expr : ( addExpr | subExpr | mulExpr | divExpr | expExpr | sinExpr | cosExpr | tanExpr | logExpr | digit );
    public final void expr() throws RecognitionException {
        float addExpr1 =0.0f;

        float subExpr2 =0.0f;

        float mulExpr3 =0.0f;

        float divExpr4 =0.0f;

        float expExpr5 =0.0f;

        float sinExpr6 =0.0f;

        float cosExpr7 =0.0f;

        float tanExpr8 =0.0f;

        float logExpr9 =0.0f;

        float digit10 =0.0f;


        try {
            // Lab6.g:75:2: ( addExpr | subExpr | mulExpr | divExpr | expExpr | sinExpr | cosExpr | tanExpr | logExpr | digit )
            int alt2=10;
            switch ( input.LA(1) ) {
            case INT:
                {
                switch ( input.LA(2) ) {
                case PLUS:
                    {
                    alt2=1;
                    }
                    break;
                case MINUS:
                    {
                    alt2=2;
                    }
                    break;
                case MULT:
                    {
                    alt2=3;
                    }
                    break;
                case DIV:
                    {
                    alt2=4;
                    }
                    break;
                case EXPONENT:
                    {
                    alt2=5;
                    }
                    break;
                case EOF:
                case CLOSEPAR:
                    {
                    alt2=10;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;

                }

                }
                break;
            case DECIMAL:
                {
                switch ( input.LA(2) ) {
                case PLUS:
                    {
                    alt2=1;
                    }
                    break;
                case MINUS:
                    {
                    alt2=2;
                    }
                    break;
                case MULT:
                    {
                    alt2=3;
                    }
                    break;
                case DIV:
                    {
                    alt2=4;
                    }
                    break;
                case EXPONENT:
                    {
                    alt2=5;
                    }
                    break;
                case EOF:
                case CLOSEPAR:
                    {
                    alt2=10;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;

                }

                }
                break;
            case BINARY:
                {
                switch ( input.LA(2) ) {
                case PLUS:
                    {
                    alt2=1;
                    }
                    break;
                case MINUS:
                    {
                    alt2=2;
                    }
                    break;
                case MULT:
                    {
                    alt2=3;
                    }
                    break;
                case DIV:
                    {
                    alt2=4;
                    }
                    break;
                case EXPONENT:
                    {
                    alt2=5;
                    }
                    break;
                case EOF:
                case CLOSEPAR:
                    {
                    alt2=10;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;

                }

                }
                break;
            case HEXADECIMAL:
                {
                switch ( input.LA(2) ) {
                case PLUS:
                    {
                    alt2=1;
                    }
                    break;
                case MINUS:
                    {
                    alt2=2;
                    }
                    break;
                case MULT:
                    {
                    alt2=3;
                    }
                    break;
                case DIV:
                    {
                    alt2=4;
                    }
                    break;
                case EXPONENT:
                    {
                    alt2=5;
                    }
                    break;
                case EOF:
                case CLOSEPAR:
                    {
                    alt2=10;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 4, input);

                    throw nvae;

                }

                }
                break;
            case OCTAL:
                {
                switch ( input.LA(2) ) {
                case PLUS:
                    {
                    alt2=1;
                    }
                    break;
                case MINUS:
                    {
                    alt2=2;
                    }
                    break;
                case MULT:
                    {
                    alt2=3;
                    }
                    break;
                case DIV:
                    {
                    alt2=4;
                    }
                    break;
                case EXPONENT:
                    {
                    alt2=5;
                    }
                    break;
                case EOF:
                case CLOSEPAR:
                    {
                    alt2=10;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 5, input);

                    throw nvae;

                }

                }
                break;
            case SINE:
                {
                alt2=6;
                }
                break;
            case COSINE:
                {
                alt2=7;
                }
                break;
            case TANGENT:
                {
                alt2=8;
                }
                break;
            case LOG:
                {
                alt2=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // Lab6.g:75:4: addExpr
                    {
                    pushFollow(FOLLOW_addExpr_in_expr337);
                    addExpr1=addExpr();

                    state._fsp--;


                     System.out.println( addExpr1 ); 

                    }
                    break;
                case 2 :
                    // Lab6.g:76:4: subExpr
                    {
                    pushFollow(FOLLOW_subExpr_in_expr345);
                    subExpr2=subExpr();

                    state._fsp--;


                     System.out.println( subExpr2 ); 

                    }
                    break;
                case 3 :
                    // Lab6.g:77:4: mulExpr
                    {
                    pushFollow(FOLLOW_mulExpr_in_expr352);
                    mulExpr3=mulExpr();

                    state._fsp--;


                     System.out.println( mulExpr3 ); 

                    }
                    break;
                case 4 :
                    // Lab6.g:78:4: divExpr
                    {
                    pushFollow(FOLLOW_divExpr_in_expr359);
                    divExpr4=divExpr();

                    state._fsp--;


                     System.out.println( divExpr4 ); 

                    }
                    break;
                case 5 :
                    // Lab6.g:79:4: expExpr
                    {
                    pushFollow(FOLLOW_expExpr_in_expr366);
                    expExpr5=expExpr();

                    state._fsp--;


                     System.out.println( expExpr5 ); 

                    }
                    break;
                case 6 :
                    // Lab6.g:80:4: sinExpr
                    {
                    pushFollow(FOLLOW_sinExpr_in_expr373);
                    sinExpr6=sinExpr();

                    state._fsp--;


                     System.out.println( sinExpr6 ); 

                    }
                    break;
                case 7 :
                    // Lab6.g:81:4: cosExpr
                    {
                    pushFollow(FOLLOW_cosExpr_in_expr380);
                    cosExpr7=cosExpr();

                    state._fsp--;


                     System.out.println( cosExpr7 ); 

                    }
                    break;
                case 8 :
                    // Lab6.g:82:4: tanExpr
                    {
                    pushFollow(FOLLOW_tanExpr_in_expr387);
                    tanExpr8=tanExpr();

                    state._fsp--;


                     System.out.println( tanExpr8 ); 

                    }
                    break;
                case 9 :
                    // Lab6.g:83:4: logExpr
                    {
                    pushFollow(FOLLOW_logExpr_in_expr394);
                    logExpr9=logExpr();

                    state._fsp--;


                     System.out.println( logExpr9 ); 

                    }
                    break;
                case 10 :
                    // Lab6.g:84:4: digit
                    {
                    pushFollow(FOLLOW_digit_in_expr401);
                    digit10=digit();

                    state._fsp--;


                     System.out.println( digit10 ); 

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
    // $ANTLR end "expr"



    // $ANTLR start "parExpr"
    // Lab6.g:87:1: parExpr returns [float value] : ( OPENPAR addExpr CLOSEPAR | OPENPAR subExpr CLOSEPAR | OPENPAR mulExpr CLOSEPAR | OPENPAR divExpr CLOSEPAR );
    public final float parExpr() throws RecognitionException {
        float value = 0.0f;


        float addExpr11 =0.0f;

        float subExpr12 =0.0f;

        float mulExpr13 =0.0f;

        float divExpr14 =0.0f;


        try {
            // Lab6.g:88:2: ( OPENPAR addExpr CLOSEPAR | OPENPAR subExpr CLOSEPAR | OPENPAR mulExpr CLOSEPAR | OPENPAR divExpr CLOSEPAR )
            int alt3=4;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==OPENPAR) ) {
                switch ( input.LA(2) ) {
                case INT:
                    {
                    switch ( input.LA(3) ) {
                    case PLUS:
                        {
                        alt3=1;
                        }
                        break;
                    case MINUS:
                        {
                        alt3=2;
                        }
                        break;
                    case MULT:
                        {
                        alt3=3;
                        }
                        break;
                    case DIV:
                        {
                        alt3=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;

                    }

                    }
                    break;
                case DECIMAL:
                    {
                    switch ( input.LA(3) ) {
                    case PLUS:
                        {
                        alt3=1;
                        }
                        break;
                    case MINUS:
                        {
                        alt3=2;
                        }
                        break;
                    case MULT:
                        {
                        alt3=3;
                        }
                        break;
                    case DIV:
                        {
                        alt3=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 3, input);

                        throw nvae;

                    }

                    }
                    break;
                case BINARY:
                    {
                    switch ( input.LA(3) ) {
                    case PLUS:
                        {
                        alt3=1;
                        }
                        break;
                    case MINUS:
                        {
                        alt3=2;
                        }
                        break;
                    case MULT:
                        {
                        alt3=3;
                        }
                        break;
                    case DIV:
                        {
                        alt3=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 4, input);

                        throw nvae;

                    }

                    }
                    break;
                case HEXADECIMAL:
                    {
                    switch ( input.LA(3) ) {
                    case PLUS:
                        {
                        alt3=1;
                        }
                        break;
                    case MINUS:
                        {
                        alt3=2;
                        }
                        break;
                    case MULT:
                        {
                        alt3=3;
                        }
                        break;
                    case DIV:
                        {
                        alt3=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 5, input);

                        throw nvae;

                    }

                    }
                    break;
                case OCTAL:
                    {
                    switch ( input.LA(3) ) {
                    case PLUS:
                        {
                        alt3=1;
                        }
                        break;
                    case MINUS:
                        {
                        alt3=2;
                        }
                        break;
                    case MULT:
                        {
                        alt3=3;
                        }
                        break;
                    case DIV:
                        {
                        alt3=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 6, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // Lab6.g:88:4: OPENPAR addExpr CLOSEPAR
                    {
                    match(input,OPENPAR,FOLLOW_OPENPAR_in_parExpr420); 

                    pushFollow(FOLLOW_addExpr_in_parExpr422);
                    addExpr11=addExpr();

                    state._fsp--;


                    match(input,CLOSEPAR,FOLLOW_CLOSEPAR_in_parExpr424); 

                    value = addExpr11;

                    }
                    break;
                case 2 :
                    // Lab6.g:89:4: OPENPAR subExpr CLOSEPAR
                    {
                    match(input,OPENPAR,FOLLOW_OPENPAR_in_parExpr431); 

                    pushFollow(FOLLOW_subExpr_in_parExpr433);
                    subExpr12=subExpr();

                    state._fsp--;


                    match(input,CLOSEPAR,FOLLOW_CLOSEPAR_in_parExpr435); 

                    value = subExpr12;

                    }
                    break;
                case 3 :
                    // Lab6.g:90:4: OPENPAR mulExpr CLOSEPAR
                    {
                    match(input,OPENPAR,FOLLOW_OPENPAR_in_parExpr442); 

                    pushFollow(FOLLOW_mulExpr_in_parExpr444);
                    mulExpr13=mulExpr();

                    state._fsp--;


                    match(input,CLOSEPAR,FOLLOW_CLOSEPAR_in_parExpr446); 

                    value = mulExpr13;

                    }
                    break;
                case 4 :
                    // Lab6.g:91:4: OPENPAR divExpr CLOSEPAR
                    {
                    match(input,OPENPAR,FOLLOW_OPENPAR_in_parExpr453); 

                    pushFollow(FOLLOW_divExpr_in_parExpr455);
                    divExpr14=divExpr();

                    state._fsp--;


                    match(input,CLOSEPAR,FOLLOW_CLOSEPAR_in_parExpr457); 

                    value = divExpr14;

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
        return value;
    }
    // $ANTLR end "parExpr"



    // $ANTLR start "addExpr"
    // Lab6.g:94:1: addExpr returns [float value] : (l= digit ( PLUS r= digit ) |l= digit ( PLUS r= addExpr ) |l= digit ( PLUS r= subExpr ) |l= digit ( PLUS r= mulExpr ) |l= digit ( PLUS r= divExpr ) |l= digit ( PLUS r= parExpr ) );
    public final float addExpr() throws RecognitionException {
        float value = 0.0f;


        float l =0.0f;

        float r =0.0f;


        try {
            // Lab6.g:95:2: (l= digit ( PLUS r= digit ) |l= digit ( PLUS r= addExpr ) |l= digit ( PLUS r= subExpr ) |l= digit ( PLUS r= mulExpr ) |l= digit ( PLUS r= divExpr ) |l= digit ( PLUS r= parExpr ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case INT:
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==PLUS) ) {
                    switch ( input.LA(3) ) {
                    case INT:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt4=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt4=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt4=3;
                            }
                            break;
                        case MULT:
                            {
                            alt4=4;
                            }
                            break;
                        case DIV:
                            {
                            alt4=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 7, input);

                            throw nvae;

                        }

                        }
                        break;
                    case DECIMAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt4=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt4=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt4=3;
                            }
                            break;
                        case MULT:
                            {
                            alt4=4;
                            }
                            break;
                        case DIV:
                            {
                            alt4=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 8, input);

                            throw nvae;

                        }

                        }
                        break;
                    case BINARY:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt4=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt4=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt4=3;
                            }
                            break;
                        case MULT:
                            {
                            alt4=4;
                            }
                            break;
                        case DIV:
                            {
                            alt4=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 9, input);

                            throw nvae;

                        }

                        }
                        break;
                    case HEXADECIMAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt4=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt4=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt4=3;
                            }
                            break;
                        case MULT:
                            {
                            alt4=4;
                            }
                            break;
                        case DIV:
                            {
                            alt4=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 10, input);

                            throw nvae;

                        }

                        }
                        break;
                    case OCTAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt4=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt4=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt4=3;
                            }
                            break;
                        case MULT:
                            {
                            alt4=4;
                            }
                            break;
                        case DIV:
                            {
                            alt4=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 11, input);

                            throw nvae;

                        }

                        }
                        break;
                    case OPENPAR:
                        {
                        alt4=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 6, input);

                        throw nvae;

                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;

                }
                }
                break;
            case DECIMAL:
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==PLUS) ) {
                    switch ( input.LA(3) ) {
                    case INT:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt4=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt4=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt4=3;
                            }
                            break;
                        case MULT:
                            {
                            alt4=4;
                            }
                            break;
                        case DIV:
                            {
                            alt4=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 7, input);

                            throw nvae;

                        }

                        }
                        break;
                    case DECIMAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt4=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt4=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt4=3;
                            }
                            break;
                        case MULT:
                            {
                            alt4=4;
                            }
                            break;
                        case DIV:
                            {
                            alt4=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 8, input);

                            throw nvae;

                        }

                        }
                        break;
                    case BINARY:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt4=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt4=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt4=3;
                            }
                            break;
                        case MULT:
                            {
                            alt4=4;
                            }
                            break;
                        case DIV:
                            {
                            alt4=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 9, input);

                            throw nvae;

                        }

                        }
                        break;
                    case HEXADECIMAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt4=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt4=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt4=3;
                            }
                            break;
                        case MULT:
                            {
                            alt4=4;
                            }
                            break;
                        case DIV:
                            {
                            alt4=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 10, input);

                            throw nvae;

                        }

                        }
                        break;
                    case OCTAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt4=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt4=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt4=3;
                            }
                            break;
                        case MULT:
                            {
                            alt4=4;
                            }
                            break;
                        case DIV:
                            {
                            alt4=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 11, input);

                            throw nvae;

                        }

                        }
                        break;
                    case OPENPAR:
                        {
                        alt4=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 6, input);

                        throw nvae;

                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;

                }
                }
                break;
            case BINARY:
                {
                int LA4_3 = input.LA(2);

                if ( (LA4_3==PLUS) ) {
                    switch ( input.LA(3) ) {
                    case INT:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt4=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt4=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt4=3;
                            }
                            break;
                        case MULT:
                            {
                            alt4=4;
                            }
                            break;
                        case DIV:
                            {
                            alt4=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 7, input);

                            throw nvae;

                        }

                        }
                        break;
                    case DECIMAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt4=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt4=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt4=3;
                            }
                            break;
                        case MULT:
                            {
                            alt4=4;
                            }
                            break;
                        case DIV:
                            {
                            alt4=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 8, input);

                            throw nvae;

                        }

                        }
                        break;
                    case BINARY:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt4=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt4=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt4=3;
                            }
                            break;
                        case MULT:
                            {
                            alt4=4;
                            }
                            break;
                        case DIV:
                            {
                            alt4=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 9, input);

                            throw nvae;

                        }

                        }
                        break;
                    case HEXADECIMAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt4=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt4=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt4=3;
                            }
                            break;
                        case MULT:
                            {
                            alt4=4;
                            }
                            break;
                        case DIV:
                            {
                            alt4=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 10, input);

                            throw nvae;

                        }

                        }
                        break;
                    case OCTAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt4=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt4=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt4=3;
                            }
                            break;
                        case MULT:
                            {
                            alt4=4;
                            }
                            break;
                        case DIV:
                            {
                            alt4=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 11, input);

                            throw nvae;

                        }

                        }
                        break;
                    case OPENPAR:
                        {
                        alt4=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 6, input);

                        throw nvae;

                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 3, input);

                    throw nvae;

                }
                }
                break;
            case HEXADECIMAL:
                {
                int LA4_4 = input.LA(2);

                if ( (LA4_4==PLUS) ) {
                    switch ( input.LA(3) ) {
                    case INT:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt4=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt4=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt4=3;
                            }
                            break;
                        case MULT:
                            {
                            alt4=4;
                            }
                            break;
                        case DIV:
                            {
                            alt4=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 7, input);

                            throw nvae;

                        }

                        }
                        break;
                    case DECIMAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt4=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt4=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt4=3;
                            }
                            break;
                        case MULT:
                            {
                            alt4=4;
                            }
                            break;
                        case DIV:
                            {
                            alt4=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 8, input);

                            throw nvae;

                        }

                        }
                        break;
                    case BINARY:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt4=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt4=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt4=3;
                            }
                            break;
                        case MULT:
                            {
                            alt4=4;
                            }
                            break;
                        case DIV:
                            {
                            alt4=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 9, input);

                            throw nvae;

                        }

                        }
                        break;
                    case HEXADECIMAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt4=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt4=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt4=3;
                            }
                            break;
                        case MULT:
                            {
                            alt4=4;
                            }
                            break;
                        case DIV:
                            {
                            alt4=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 10, input);

                            throw nvae;

                        }

                        }
                        break;
                    case OCTAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt4=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt4=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt4=3;
                            }
                            break;
                        case MULT:
                            {
                            alt4=4;
                            }
                            break;
                        case DIV:
                            {
                            alt4=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 11, input);

                            throw nvae;

                        }

                        }
                        break;
                    case OPENPAR:
                        {
                        alt4=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 6, input);

                        throw nvae;

                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 4, input);

                    throw nvae;

                }
                }
                break;
            case OCTAL:
                {
                int LA4_5 = input.LA(2);

                if ( (LA4_5==PLUS) ) {
                    switch ( input.LA(3) ) {
                    case INT:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt4=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt4=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt4=3;
                            }
                            break;
                        case MULT:
                            {
                            alt4=4;
                            }
                            break;
                        case DIV:
                            {
                            alt4=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 7, input);

                            throw nvae;

                        }

                        }
                        break;
                    case DECIMAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt4=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt4=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt4=3;
                            }
                            break;
                        case MULT:
                            {
                            alt4=4;
                            }
                            break;
                        case DIV:
                            {
                            alt4=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 8, input);

                            throw nvae;

                        }

                        }
                        break;
                    case BINARY:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt4=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt4=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt4=3;
                            }
                            break;
                        case MULT:
                            {
                            alt4=4;
                            }
                            break;
                        case DIV:
                            {
                            alt4=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 9, input);

                            throw nvae;

                        }

                        }
                        break;
                    case HEXADECIMAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt4=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt4=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt4=3;
                            }
                            break;
                        case MULT:
                            {
                            alt4=4;
                            }
                            break;
                        case DIV:
                            {
                            alt4=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 10, input);

                            throw nvae;

                        }

                        }
                        break;
                    case OCTAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt4=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt4=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt4=3;
                            }
                            break;
                        case MULT:
                            {
                            alt4=4;
                            }
                            break;
                        case DIV:
                            {
                            alt4=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 11, input);

                            throw nvae;

                        }

                        }
                        break;
                    case OPENPAR:
                        {
                        alt4=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 6, input);

                        throw nvae;

                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 5, input);

                    throw nvae;

                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // Lab6.g:95:4: l= digit ( PLUS r= digit )
                    {
                    pushFollow(FOLLOW_digit_in_addExpr480);
                    l=digit();

                    state._fsp--;


                     value = l; 

                    // Lab6.g:96:3: ( PLUS r= digit )
                    // Lab6.g:96:5: PLUS r= digit
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_addExpr488); 

                    pushFollow(FOLLOW_digit_in_addExpr494);
                    r=digit();

                    state._fsp--;


                     value += r; 

                    }


                    }
                    break;
                case 2 :
                    // Lab6.g:97:4: l= digit ( PLUS r= addExpr )
                    {
                    pushFollow(FOLLOW_digit_in_addExpr508);
                    l=digit();

                    state._fsp--;


                    value = l; 

                    // Lab6.g:98:3: ( PLUS r= addExpr )
                    // Lab6.g:98:5: PLUS r= addExpr
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_addExpr516); 

                    pushFollow(FOLLOW_addExpr_in_addExpr522);
                    r=addExpr();

                    state._fsp--;


                     value += r; 

                    }


                    }
                    break;
                case 3 :
                    // Lab6.g:99:4: l= digit ( PLUS r= subExpr )
                    {
                    pushFollow(FOLLOW_digit_in_addExpr535);
                    l=digit();

                    state._fsp--;


                    value = l; 

                    // Lab6.g:100:3: ( PLUS r= subExpr )
                    // Lab6.g:100:5: PLUS r= subExpr
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_addExpr543); 

                    pushFollow(FOLLOW_subExpr_in_addExpr549);
                    r=subExpr();

                    state._fsp--;


                     value += r; 

                    }


                    }
                    break;
                case 4 :
                    // Lab6.g:101:4: l= digit ( PLUS r= mulExpr )
                    {
                    pushFollow(FOLLOW_digit_in_addExpr562);
                    l=digit();

                    state._fsp--;


                    value = l; 

                    // Lab6.g:102:3: ( PLUS r= mulExpr )
                    // Lab6.g:102:5: PLUS r= mulExpr
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_addExpr570); 

                    pushFollow(FOLLOW_mulExpr_in_addExpr576);
                    r=mulExpr();

                    state._fsp--;


                     value += r; 

                    }


                    }
                    break;
                case 5 :
                    // Lab6.g:103:4: l= digit ( PLUS r= divExpr )
                    {
                    pushFollow(FOLLOW_digit_in_addExpr588);
                    l=digit();

                    state._fsp--;


                    value = l; 

                    // Lab6.g:104:3: ( PLUS r= divExpr )
                    // Lab6.g:104:5: PLUS r= divExpr
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_addExpr596); 

                    pushFollow(FOLLOW_divExpr_in_addExpr602);
                    r=divExpr();

                    state._fsp--;


                     value += r; 

                    }


                    }
                    break;
                case 6 :
                    // Lab6.g:105:4: l= digit ( PLUS r= parExpr )
                    {
                    pushFollow(FOLLOW_digit_in_addExpr614);
                    l=digit();

                    state._fsp--;


                    value = l; 

                    // Lab6.g:106:3: ( PLUS r= parExpr )
                    // Lab6.g:106:5: PLUS r= parExpr
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_addExpr622); 

                    pushFollow(FOLLOW_parExpr_in_addExpr628);
                    r=parExpr();

                    state._fsp--;


                     value += r; 

                    }


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
        return value;
    }
    // $ANTLR end "addExpr"



    // $ANTLR start "subExpr"
    // Lab6.g:109:1: subExpr returns [float value] : (l= digit ( MINUS r= digit ) |l= digit ( MINUS r= addExpr ) |l= digit ( MINUS r= subExpr ) |l= digit ( MINUS r= mulExpr ) |l= digit ( MINUS r= divExpr ) |l= digit ( MINUS r= parExpr ) );
    public final float subExpr() throws RecognitionException {
        float value = 0.0f;


        float l =0.0f;

        float r =0.0f;


        try {
            // Lab6.g:110:2: (l= digit ( MINUS r= digit ) |l= digit ( MINUS r= addExpr ) |l= digit ( MINUS r= subExpr ) |l= digit ( MINUS r= mulExpr ) |l= digit ( MINUS r= divExpr ) |l= digit ( MINUS r= parExpr ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case INT:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==MINUS) ) {
                    switch ( input.LA(3) ) {
                    case INT:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt5=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt5=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt5=3;
                            }
                            break;
                        case MULT:
                            {
                            alt5=4;
                            }
                            break;
                        case DIV:
                            {
                            alt5=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 7, input);

                            throw nvae;

                        }

                        }
                        break;
                    case DECIMAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt5=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt5=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt5=3;
                            }
                            break;
                        case MULT:
                            {
                            alt5=4;
                            }
                            break;
                        case DIV:
                            {
                            alt5=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 8, input);

                            throw nvae;

                        }

                        }
                        break;
                    case BINARY:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt5=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt5=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt5=3;
                            }
                            break;
                        case MULT:
                            {
                            alt5=4;
                            }
                            break;
                        case DIV:
                            {
                            alt5=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 9, input);

                            throw nvae;

                        }

                        }
                        break;
                    case HEXADECIMAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt5=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt5=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt5=3;
                            }
                            break;
                        case MULT:
                            {
                            alt5=4;
                            }
                            break;
                        case DIV:
                            {
                            alt5=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 10, input);

                            throw nvae;

                        }

                        }
                        break;
                    case OCTAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt5=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt5=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt5=3;
                            }
                            break;
                        case MULT:
                            {
                            alt5=4;
                            }
                            break;
                        case DIV:
                            {
                            alt5=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 11, input);

                            throw nvae;

                        }

                        }
                        break;
                    case OPENPAR:
                        {
                        alt5=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 6, input);

                        throw nvae;

                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;

                }
                }
                break;
            case DECIMAL:
                {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==MINUS) ) {
                    switch ( input.LA(3) ) {
                    case INT:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt5=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt5=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt5=3;
                            }
                            break;
                        case MULT:
                            {
                            alt5=4;
                            }
                            break;
                        case DIV:
                            {
                            alt5=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 7, input);

                            throw nvae;

                        }

                        }
                        break;
                    case DECIMAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt5=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt5=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt5=3;
                            }
                            break;
                        case MULT:
                            {
                            alt5=4;
                            }
                            break;
                        case DIV:
                            {
                            alt5=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 8, input);

                            throw nvae;

                        }

                        }
                        break;
                    case BINARY:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt5=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt5=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt5=3;
                            }
                            break;
                        case MULT:
                            {
                            alt5=4;
                            }
                            break;
                        case DIV:
                            {
                            alt5=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 9, input);

                            throw nvae;

                        }

                        }
                        break;
                    case HEXADECIMAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt5=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt5=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt5=3;
                            }
                            break;
                        case MULT:
                            {
                            alt5=4;
                            }
                            break;
                        case DIV:
                            {
                            alt5=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 10, input);

                            throw nvae;

                        }

                        }
                        break;
                    case OCTAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt5=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt5=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt5=3;
                            }
                            break;
                        case MULT:
                            {
                            alt5=4;
                            }
                            break;
                        case DIV:
                            {
                            alt5=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 11, input);

                            throw nvae;

                        }

                        }
                        break;
                    case OPENPAR:
                        {
                        alt5=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 6, input);

                        throw nvae;

                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;

                }
                }
                break;
            case BINARY:
                {
                int LA5_3 = input.LA(2);

                if ( (LA5_3==MINUS) ) {
                    switch ( input.LA(3) ) {
                    case INT:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt5=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt5=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt5=3;
                            }
                            break;
                        case MULT:
                            {
                            alt5=4;
                            }
                            break;
                        case DIV:
                            {
                            alt5=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 7, input);

                            throw nvae;

                        }

                        }
                        break;
                    case DECIMAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt5=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt5=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt5=3;
                            }
                            break;
                        case MULT:
                            {
                            alt5=4;
                            }
                            break;
                        case DIV:
                            {
                            alt5=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 8, input);

                            throw nvae;

                        }

                        }
                        break;
                    case BINARY:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt5=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt5=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt5=3;
                            }
                            break;
                        case MULT:
                            {
                            alt5=4;
                            }
                            break;
                        case DIV:
                            {
                            alt5=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 9, input);

                            throw nvae;

                        }

                        }
                        break;
                    case HEXADECIMAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt5=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt5=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt5=3;
                            }
                            break;
                        case MULT:
                            {
                            alt5=4;
                            }
                            break;
                        case DIV:
                            {
                            alt5=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 10, input);

                            throw nvae;

                        }

                        }
                        break;
                    case OCTAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt5=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt5=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt5=3;
                            }
                            break;
                        case MULT:
                            {
                            alt5=4;
                            }
                            break;
                        case DIV:
                            {
                            alt5=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 11, input);

                            throw nvae;

                        }

                        }
                        break;
                    case OPENPAR:
                        {
                        alt5=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 6, input);

                        throw nvae;

                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 3, input);

                    throw nvae;

                }
                }
                break;
            case HEXADECIMAL:
                {
                int LA5_4 = input.LA(2);

                if ( (LA5_4==MINUS) ) {
                    switch ( input.LA(3) ) {
                    case INT:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt5=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt5=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt5=3;
                            }
                            break;
                        case MULT:
                            {
                            alt5=4;
                            }
                            break;
                        case DIV:
                            {
                            alt5=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 7, input);

                            throw nvae;

                        }

                        }
                        break;
                    case DECIMAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt5=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt5=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt5=3;
                            }
                            break;
                        case MULT:
                            {
                            alt5=4;
                            }
                            break;
                        case DIV:
                            {
                            alt5=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 8, input);

                            throw nvae;

                        }

                        }
                        break;
                    case BINARY:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt5=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt5=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt5=3;
                            }
                            break;
                        case MULT:
                            {
                            alt5=4;
                            }
                            break;
                        case DIV:
                            {
                            alt5=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 9, input);

                            throw nvae;

                        }

                        }
                        break;
                    case HEXADECIMAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt5=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt5=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt5=3;
                            }
                            break;
                        case MULT:
                            {
                            alt5=4;
                            }
                            break;
                        case DIV:
                            {
                            alt5=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 10, input);

                            throw nvae;

                        }

                        }
                        break;
                    case OCTAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt5=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt5=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt5=3;
                            }
                            break;
                        case MULT:
                            {
                            alt5=4;
                            }
                            break;
                        case DIV:
                            {
                            alt5=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 11, input);

                            throw nvae;

                        }

                        }
                        break;
                    case OPENPAR:
                        {
                        alt5=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 6, input);

                        throw nvae;

                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 4, input);

                    throw nvae;

                }
                }
                break;
            case OCTAL:
                {
                int LA5_5 = input.LA(2);

                if ( (LA5_5==MINUS) ) {
                    switch ( input.LA(3) ) {
                    case INT:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt5=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt5=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt5=3;
                            }
                            break;
                        case MULT:
                            {
                            alt5=4;
                            }
                            break;
                        case DIV:
                            {
                            alt5=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 7, input);

                            throw nvae;

                        }

                        }
                        break;
                    case DECIMAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt5=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt5=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt5=3;
                            }
                            break;
                        case MULT:
                            {
                            alt5=4;
                            }
                            break;
                        case DIV:
                            {
                            alt5=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 8, input);

                            throw nvae;

                        }

                        }
                        break;
                    case BINARY:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt5=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt5=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt5=3;
                            }
                            break;
                        case MULT:
                            {
                            alt5=4;
                            }
                            break;
                        case DIV:
                            {
                            alt5=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 9, input);

                            throw nvae;

                        }

                        }
                        break;
                    case HEXADECIMAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt5=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt5=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt5=3;
                            }
                            break;
                        case MULT:
                            {
                            alt5=4;
                            }
                            break;
                        case DIV:
                            {
                            alt5=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 10, input);

                            throw nvae;

                        }

                        }
                        break;
                    case OCTAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt5=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt5=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt5=3;
                            }
                            break;
                        case MULT:
                            {
                            alt5=4;
                            }
                            break;
                        case DIV:
                            {
                            alt5=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 11, input);

                            throw nvae;

                        }

                        }
                        break;
                    case OPENPAR:
                        {
                        alt5=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 6, input);

                        throw nvae;

                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 5, input);

                    throw nvae;

                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // Lab6.g:110:4: l= digit ( MINUS r= digit )
                    {
                    pushFollow(FOLLOW_digit_in_subExpr660);
                    l=digit();

                    state._fsp--;


                     value = l; 

                    // Lab6.g:111:3: ( MINUS r= digit )
                    // Lab6.g:111:5: MINUS r= digit
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_subExpr668); 

                    pushFollow(FOLLOW_digit_in_subExpr674);
                    r=digit();

                    state._fsp--;


                     value -= r; 

                    }


                    }
                    break;
                case 2 :
                    // Lab6.g:112:4: l= digit ( MINUS r= addExpr )
                    {
                    pushFollow(FOLLOW_digit_in_subExpr687);
                    l=digit();

                    state._fsp--;


                     value = l; 

                    // Lab6.g:113:3: ( MINUS r= addExpr )
                    // Lab6.g:113:5: MINUS r= addExpr
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_subExpr695); 

                    pushFollow(FOLLOW_addExpr_in_subExpr701);
                    r=addExpr();

                    state._fsp--;


                     value -= r; 

                    }


                    }
                    break;
                case 3 :
                    // Lab6.g:114:4: l= digit ( MINUS r= subExpr )
                    {
                    pushFollow(FOLLOW_digit_in_subExpr714);
                    l=digit();

                    state._fsp--;


                     value = l; 

                    // Lab6.g:115:3: ( MINUS r= subExpr )
                    // Lab6.g:115:5: MINUS r= subExpr
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_subExpr722); 

                    pushFollow(FOLLOW_subExpr_in_subExpr728);
                    r=subExpr();

                    state._fsp--;


                     value -= r; 

                    }


                    }
                    break;
                case 4 :
                    // Lab6.g:116:4: l= digit ( MINUS r= mulExpr )
                    {
                    pushFollow(FOLLOW_digit_in_subExpr741);
                    l=digit();

                    state._fsp--;


                     value = l; 

                    // Lab6.g:117:3: ( MINUS r= mulExpr )
                    // Lab6.g:117:5: MINUS r= mulExpr
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_subExpr749); 

                    pushFollow(FOLLOW_mulExpr_in_subExpr755);
                    r=mulExpr();

                    state._fsp--;


                     value -= r; 

                    }


                    }
                    break;
                case 5 :
                    // Lab6.g:118:4: l= digit ( MINUS r= divExpr )
                    {
                    pushFollow(FOLLOW_digit_in_subExpr768);
                    l=digit();

                    state._fsp--;


                     value = l; 

                    // Lab6.g:119:3: ( MINUS r= divExpr )
                    // Lab6.g:119:5: MINUS r= divExpr
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_subExpr776); 

                    pushFollow(FOLLOW_divExpr_in_subExpr782);
                    r=divExpr();

                    state._fsp--;


                     value -= r; 

                    }


                    }
                    break;
                case 6 :
                    // Lab6.g:120:4: l= digit ( MINUS r= parExpr )
                    {
                    pushFollow(FOLLOW_digit_in_subExpr795);
                    l=digit();

                    state._fsp--;


                     value = l; 

                    // Lab6.g:121:3: ( MINUS r= parExpr )
                    // Lab6.g:121:5: MINUS r= parExpr
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_subExpr803); 

                    pushFollow(FOLLOW_parExpr_in_subExpr809);
                    r=parExpr();

                    state._fsp--;


                     value -= r; 

                    }


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
        return value;
    }
    // $ANTLR end "subExpr"



    // $ANTLR start "mulExpr"
    // Lab6.g:124:1: mulExpr returns [float value] : (l= digit ( MULT r= digit ) |l= digit ( MULT r= addExpr ) |l= digit ( MULT r= subExpr ) |l= digit ( MULT r= mulExpr ) |l= digit ( MULT r= divExpr ) |l= digit ( MULT r= parExpr ) );
    public final float mulExpr() throws RecognitionException {
        float value = 0.0f;


        float l =0.0f;

        float r =0.0f;


        try {
            // Lab6.g:125:2: (l= digit ( MULT r= digit ) |l= digit ( MULT r= addExpr ) |l= digit ( MULT r= subExpr ) |l= digit ( MULT r= mulExpr ) |l= digit ( MULT r= divExpr ) |l= digit ( MULT r= parExpr ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case INT:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==MULT) ) {
                    switch ( input.LA(3) ) {
                    case INT:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt6=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt6=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt6=3;
                            }
                            break;
                        case MULT:
                            {
                            alt6=4;
                            }
                            break;
                        case DIV:
                            {
                            alt6=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 7, input);

                            throw nvae;

                        }

                        }
                        break;
                    case DECIMAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt6=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt6=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt6=3;
                            }
                            break;
                        case MULT:
                            {
                            alt6=4;
                            }
                            break;
                        case DIV:
                            {
                            alt6=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 8, input);

                            throw nvae;

                        }

                        }
                        break;
                    case BINARY:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt6=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt6=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt6=3;
                            }
                            break;
                        case MULT:
                            {
                            alt6=4;
                            }
                            break;
                        case DIV:
                            {
                            alt6=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 9, input);

                            throw nvae;

                        }

                        }
                        break;
                    case HEXADECIMAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt6=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt6=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt6=3;
                            }
                            break;
                        case MULT:
                            {
                            alt6=4;
                            }
                            break;
                        case DIV:
                            {
                            alt6=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 10, input);

                            throw nvae;

                        }

                        }
                        break;
                    case OCTAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt6=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt6=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt6=3;
                            }
                            break;
                        case MULT:
                            {
                            alt6=4;
                            }
                            break;
                        case DIV:
                            {
                            alt6=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 11, input);

                            throw nvae;

                        }

                        }
                        break;
                    case OPENPAR:
                        {
                        alt6=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 6, input);

                        throw nvae;

                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }
                }
                break;
            case DECIMAL:
                {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==MULT) ) {
                    switch ( input.LA(3) ) {
                    case INT:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt6=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt6=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt6=3;
                            }
                            break;
                        case MULT:
                            {
                            alt6=4;
                            }
                            break;
                        case DIV:
                            {
                            alt6=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 7, input);

                            throw nvae;

                        }

                        }
                        break;
                    case DECIMAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt6=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt6=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt6=3;
                            }
                            break;
                        case MULT:
                            {
                            alt6=4;
                            }
                            break;
                        case DIV:
                            {
                            alt6=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 8, input);

                            throw nvae;

                        }

                        }
                        break;
                    case BINARY:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt6=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt6=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt6=3;
                            }
                            break;
                        case MULT:
                            {
                            alt6=4;
                            }
                            break;
                        case DIV:
                            {
                            alt6=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 9, input);

                            throw nvae;

                        }

                        }
                        break;
                    case HEXADECIMAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt6=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt6=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt6=3;
                            }
                            break;
                        case MULT:
                            {
                            alt6=4;
                            }
                            break;
                        case DIV:
                            {
                            alt6=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 10, input);

                            throw nvae;

                        }

                        }
                        break;
                    case OCTAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt6=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt6=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt6=3;
                            }
                            break;
                        case MULT:
                            {
                            alt6=4;
                            }
                            break;
                        case DIV:
                            {
                            alt6=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 11, input);

                            throw nvae;

                        }

                        }
                        break;
                    case OPENPAR:
                        {
                        alt6=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 6, input);

                        throw nvae;

                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;

                }
                }
                break;
            case BINARY:
                {
                int LA6_3 = input.LA(2);

                if ( (LA6_3==MULT) ) {
                    switch ( input.LA(3) ) {
                    case INT:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt6=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt6=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt6=3;
                            }
                            break;
                        case MULT:
                            {
                            alt6=4;
                            }
                            break;
                        case DIV:
                            {
                            alt6=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 7, input);

                            throw nvae;

                        }

                        }
                        break;
                    case DECIMAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt6=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt6=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt6=3;
                            }
                            break;
                        case MULT:
                            {
                            alt6=4;
                            }
                            break;
                        case DIV:
                            {
                            alt6=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 8, input);

                            throw nvae;

                        }

                        }
                        break;
                    case BINARY:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt6=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt6=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt6=3;
                            }
                            break;
                        case MULT:
                            {
                            alt6=4;
                            }
                            break;
                        case DIV:
                            {
                            alt6=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 9, input);

                            throw nvae;

                        }

                        }
                        break;
                    case HEXADECIMAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt6=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt6=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt6=3;
                            }
                            break;
                        case MULT:
                            {
                            alt6=4;
                            }
                            break;
                        case DIV:
                            {
                            alt6=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 10, input);

                            throw nvae;

                        }

                        }
                        break;
                    case OCTAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt6=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt6=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt6=3;
                            }
                            break;
                        case MULT:
                            {
                            alt6=4;
                            }
                            break;
                        case DIV:
                            {
                            alt6=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 11, input);

                            throw nvae;

                        }

                        }
                        break;
                    case OPENPAR:
                        {
                        alt6=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 6, input);

                        throw nvae;

                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 3, input);

                    throw nvae;

                }
                }
                break;
            case HEXADECIMAL:
                {
                int LA6_4 = input.LA(2);

                if ( (LA6_4==MULT) ) {
                    switch ( input.LA(3) ) {
                    case INT:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt6=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt6=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt6=3;
                            }
                            break;
                        case MULT:
                            {
                            alt6=4;
                            }
                            break;
                        case DIV:
                            {
                            alt6=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 7, input);

                            throw nvae;

                        }

                        }
                        break;
                    case DECIMAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt6=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt6=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt6=3;
                            }
                            break;
                        case MULT:
                            {
                            alt6=4;
                            }
                            break;
                        case DIV:
                            {
                            alt6=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 8, input);

                            throw nvae;

                        }

                        }
                        break;
                    case BINARY:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt6=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt6=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt6=3;
                            }
                            break;
                        case MULT:
                            {
                            alt6=4;
                            }
                            break;
                        case DIV:
                            {
                            alt6=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 9, input);

                            throw nvae;

                        }

                        }
                        break;
                    case HEXADECIMAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt6=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt6=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt6=3;
                            }
                            break;
                        case MULT:
                            {
                            alt6=4;
                            }
                            break;
                        case DIV:
                            {
                            alt6=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 10, input);

                            throw nvae;

                        }

                        }
                        break;
                    case OCTAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt6=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt6=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt6=3;
                            }
                            break;
                        case MULT:
                            {
                            alt6=4;
                            }
                            break;
                        case DIV:
                            {
                            alt6=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 11, input);

                            throw nvae;

                        }

                        }
                        break;
                    case OPENPAR:
                        {
                        alt6=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 6, input);

                        throw nvae;

                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 4, input);

                    throw nvae;

                }
                }
                break;
            case OCTAL:
                {
                int LA6_5 = input.LA(2);

                if ( (LA6_5==MULT) ) {
                    switch ( input.LA(3) ) {
                    case INT:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt6=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt6=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt6=3;
                            }
                            break;
                        case MULT:
                            {
                            alt6=4;
                            }
                            break;
                        case DIV:
                            {
                            alt6=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 7, input);

                            throw nvae;

                        }

                        }
                        break;
                    case DECIMAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt6=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt6=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt6=3;
                            }
                            break;
                        case MULT:
                            {
                            alt6=4;
                            }
                            break;
                        case DIV:
                            {
                            alt6=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 8, input);

                            throw nvae;

                        }

                        }
                        break;
                    case BINARY:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt6=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt6=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt6=3;
                            }
                            break;
                        case MULT:
                            {
                            alt6=4;
                            }
                            break;
                        case DIV:
                            {
                            alt6=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 9, input);

                            throw nvae;

                        }

                        }
                        break;
                    case HEXADECIMAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt6=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt6=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt6=3;
                            }
                            break;
                        case MULT:
                            {
                            alt6=4;
                            }
                            break;
                        case DIV:
                            {
                            alt6=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 10, input);

                            throw nvae;

                        }

                        }
                        break;
                    case OCTAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt6=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt6=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt6=3;
                            }
                            break;
                        case MULT:
                            {
                            alt6=4;
                            }
                            break;
                        case DIV:
                            {
                            alt6=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 11, input);

                            throw nvae;

                        }

                        }
                        break;
                    case OPENPAR:
                        {
                        alt6=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 6, input);

                        throw nvae;

                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 5, input);

                    throw nvae;

                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // Lab6.g:125:4: l= digit ( MULT r= digit )
                    {
                    pushFollow(FOLLOW_digit_in_mulExpr833);
                    l=digit();

                    state._fsp--;


                     value = l; 

                    // Lab6.g:126:3: ( MULT r= digit )
                    // Lab6.g:126:5: MULT r= digit
                    {
                    match(input,MULT,FOLLOW_MULT_in_mulExpr841); 

                    pushFollow(FOLLOW_digit_in_mulExpr847);
                    r=digit();

                    state._fsp--;


                     value *= r; 

                    }


                    }
                    break;
                case 2 :
                    // Lab6.g:127:4: l= digit ( MULT r= addExpr )
                    {
                    pushFollow(FOLLOW_digit_in_mulExpr860);
                    l=digit();

                    state._fsp--;


                     value = l; 

                    // Lab6.g:128:3: ( MULT r= addExpr )
                    // Lab6.g:128:5: MULT r= addExpr
                    {
                    match(input,MULT,FOLLOW_MULT_in_mulExpr868); 

                    pushFollow(FOLLOW_addExpr_in_mulExpr874);
                    r=addExpr();

                    state._fsp--;


                     value *= r; 

                    }


                    }
                    break;
                case 3 :
                    // Lab6.g:129:4: l= digit ( MULT r= subExpr )
                    {
                    pushFollow(FOLLOW_digit_in_mulExpr887);
                    l=digit();

                    state._fsp--;


                     value = l; 

                    // Lab6.g:130:3: ( MULT r= subExpr )
                    // Lab6.g:130:5: MULT r= subExpr
                    {
                    match(input,MULT,FOLLOW_MULT_in_mulExpr895); 

                    pushFollow(FOLLOW_subExpr_in_mulExpr901);
                    r=subExpr();

                    state._fsp--;


                     value *= r; 

                    }


                    }
                    break;
                case 4 :
                    // Lab6.g:131:4: l= digit ( MULT r= mulExpr )
                    {
                    pushFollow(FOLLOW_digit_in_mulExpr914);
                    l=digit();

                    state._fsp--;


                     value = l; 

                    // Lab6.g:132:3: ( MULT r= mulExpr )
                    // Lab6.g:132:5: MULT r= mulExpr
                    {
                    match(input,MULT,FOLLOW_MULT_in_mulExpr922); 

                    pushFollow(FOLLOW_mulExpr_in_mulExpr928);
                    r=mulExpr();

                    state._fsp--;


                     value *= r; 

                    }


                    }
                    break;
                case 5 :
                    // Lab6.g:133:4: l= digit ( MULT r= divExpr )
                    {
                    pushFollow(FOLLOW_digit_in_mulExpr941);
                    l=digit();

                    state._fsp--;


                     value = l; 

                    // Lab6.g:134:3: ( MULT r= divExpr )
                    // Lab6.g:134:5: MULT r= divExpr
                    {
                    match(input,MULT,FOLLOW_MULT_in_mulExpr949); 

                    pushFollow(FOLLOW_divExpr_in_mulExpr955);
                    r=divExpr();

                    state._fsp--;


                     value *= r; 

                    }


                    }
                    break;
                case 6 :
                    // Lab6.g:135:4: l= digit ( MULT r= parExpr )
                    {
                    pushFollow(FOLLOW_digit_in_mulExpr968);
                    l=digit();

                    state._fsp--;


                     value = l; 

                    // Lab6.g:136:3: ( MULT r= parExpr )
                    // Lab6.g:136:5: MULT r= parExpr
                    {
                    match(input,MULT,FOLLOW_MULT_in_mulExpr976); 

                    pushFollow(FOLLOW_parExpr_in_mulExpr982);
                    r=parExpr();

                    state._fsp--;


                     value *= r; 

                    }


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
        return value;
    }
    // $ANTLR end "mulExpr"



    // $ANTLR start "divExpr"
    // Lab6.g:139:1: divExpr returns [float value] : (l= digit ( DIV r= digit ) |l= digit ( DIV r= addExpr ) |l= digit ( DIV r= subExpr ) |l= digit ( DIV r= mulExpr ) |l= digit ( DIV r= divExpr ) |l= digit ( DIV r= parExpr ) );
    public final float divExpr() throws RecognitionException {
        float value = 0.0f;


        float l =0.0f;

        float r =0.0f;


        try {
            // Lab6.g:140:2: (l= digit ( DIV r= digit ) |l= digit ( DIV r= addExpr ) |l= digit ( DIV r= subExpr ) |l= digit ( DIV r= mulExpr ) |l= digit ( DIV r= divExpr ) |l= digit ( DIV r= parExpr ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case INT:
                {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==DIV) ) {
                    switch ( input.LA(3) ) {
                    case INT:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt7=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt7=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt7=3;
                            }
                            break;
                        case MULT:
                            {
                            alt7=4;
                            }
                            break;
                        case DIV:
                            {
                            alt7=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 7, input);

                            throw nvae;

                        }

                        }
                        break;
                    case DECIMAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt7=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt7=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt7=3;
                            }
                            break;
                        case MULT:
                            {
                            alt7=4;
                            }
                            break;
                        case DIV:
                            {
                            alt7=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 8, input);

                            throw nvae;

                        }

                        }
                        break;
                    case BINARY:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt7=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt7=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt7=3;
                            }
                            break;
                        case MULT:
                            {
                            alt7=4;
                            }
                            break;
                        case DIV:
                            {
                            alt7=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 9, input);

                            throw nvae;

                        }

                        }
                        break;
                    case HEXADECIMAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt7=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt7=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt7=3;
                            }
                            break;
                        case MULT:
                            {
                            alt7=4;
                            }
                            break;
                        case DIV:
                            {
                            alt7=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 10, input);

                            throw nvae;

                        }

                        }
                        break;
                    case OCTAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt7=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt7=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt7=3;
                            }
                            break;
                        case MULT:
                            {
                            alt7=4;
                            }
                            break;
                        case DIV:
                            {
                            alt7=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 11, input);

                            throw nvae;

                        }

                        }
                        break;
                    case OPENPAR:
                        {
                        alt7=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 6, input);

                        throw nvae;

                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;

                }
                }
                break;
            case DECIMAL:
                {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==DIV) ) {
                    switch ( input.LA(3) ) {
                    case INT:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt7=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt7=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt7=3;
                            }
                            break;
                        case MULT:
                            {
                            alt7=4;
                            }
                            break;
                        case DIV:
                            {
                            alt7=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 7, input);

                            throw nvae;

                        }

                        }
                        break;
                    case DECIMAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt7=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt7=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt7=3;
                            }
                            break;
                        case MULT:
                            {
                            alt7=4;
                            }
                            break;
                        case DIV:
                            {
                            alt7=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 8, input);

                            throw nvae;

                        }

                        }
                        break;
                    case BINARY:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt7=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt7=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt7=3;
                            }
                            break;
                        case MULT:
                            {
                            alt7=4;
                            }
                            break;
                        case DIV:
                            {
                            alt7=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 9, input);

                            throw nvae;

                        }

                        }
                        break;
                    case HEXADECIMAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt7=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt7=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt7=3;
                            }
                            break;
                        case MULT:
                            {
                            alt7=4;
                            }
                            break;
                        case DIV:
                            {
                            alt7=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 10, input);

                            throw nvae;

                        }

                        }
                        break;
                    case OCTAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt7=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt7=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt7=3;
                            }
                            break;
                        case MULT:
                            {
                            alt7=4;
                            }
                            break;
                        case DIV:
                            {
                            alt7=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 11, input);

                            throw nvae;

                        }

                        }
                        break;
                    case OPENPAR:
                        {
                        alt7=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 6, input);

                        throw nvae;

                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;

                }
                }
                break;
            case BINARY:
                {
                int LA7_3 = input.LA(2);

                if ( (LA7_3==DIV) ) {
                    switch ( input.LA(3) ) {
                    case INT:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt7=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt7=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt7=3;
                            }
                            break;
                        case MULT:
                            {
                            alt7=4;
                            }
                            break;
                        case DIV:
                            {
                            alt7=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 7, input);

                            throw nvae;

                        }

                        }
                        break;
                    case DECIMAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt7=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt7=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt7=3;
                            }
                            break;
                        case MULT:
                            {
                            alt7=4;
                            }
                            break;
                        case DIV:
                            {
                            alt7=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 8, input);

                            throw nvae;

                        }

                        }
                        break;
                    case BINARY:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt7=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt7=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt7=3;
                            }
                            break;
                        case MULT:
                            {
                            alt7=4;
                            }
                            break;
                        case DIV:
                            {
                            alt7=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 9, input);

                            throw nvae;

                        }

                        }
                        break;
                    case HEXADECIMAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt7=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt7=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt7=3;
                            }
                            break;
                        case MULT:
                            {
                            alt7=4;
                            }
                            break;
                        case DIV:
                            {
                            alt7=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 10, input);

                            throw nvae;

                        }

                        }
                        break;
                    case OCTAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt7=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt7=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt7=3;
                            }
                            break;
                        case MULT:
                            {
                            alt7=4;
                            }
                            break;
                        case DIV:
                            {
                            alt7=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 11, input);

                            throw nvae;

                        }

                        }
                        break;
                    case OPENPAR:
                        {
                        alt7=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 6, input);

                        throw nvae;

                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 3, input);

                    throw nvae;

                }
                }
                break;
            case HEXADECIMAL:
                {
                int LA7_4 = input.LA(2);

                if ( (LA7_4==DIV) ) {
                    switch ( input.LA(3) ) {
                    case INT:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt7=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt7=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt7=3;
                            }
                            break;
                        case MULT:
                            {
                            alt7=4;
                            }
                            break;
                        case DIV:
                            {
                            alt7=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 7, input);

                            throw nvae;

                        }

                        }
                        break;
                    case DECIMAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt7=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt7=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt7=3;
                            }
                            break;
                        case MULT:
                            {
                            alt7=4;
                            }
                            break;
                        case DIV:
                            {
                            alt7=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 8, input);

                            throw nvae;

                        }

                        }
                        break;
                    case BINARY:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt7=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt7=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt7=3;
                            }
                            break;
                        case MULT:
                            {
                            alt7=4;
                            }
                            break;
                        case DIV:
                            {
                            alt7=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 9, input);

                            throw nvae;

                        }

                        }
                        break;
                    case HEXADECIMAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt7=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt7=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt7=3;
                            }
                            break;
                        case MULT:
                            {
                            alt7=4;
                            }
                            break;
                        case DIV:
                            {
                            alt7=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 10, input);

                            throw nvae;

                        }

                        }
                        break;
                    case OCTAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt7=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt7=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt7=3;
                            }
                            break;
                        case MULT:
                            {
                            alt7=4;
                            }
                            break;
                        case DIV:
                            {
                            alt7=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 11, input);

                            throw nvae;

                        }

                        }
                        break;
                    case OPENPAR:
                        {
                        alt7=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 6, input);

                        throw nvae;

                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 4, input);

                    throw nvae;

                }
                }
                break;
            case OCTAL:
                {
                int LA7_5 = input.LA(2);

                if ( (LA7_5==DIV) ) {
                    switch ( input.LA(3) ) {
                    case INT:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt7=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt7=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt7=3;
                            }
                            break;
                        case MULT:
                            {
                            alt7=4;
                            }
                            break;
                        case DIV:
                            {
                            alt7=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 7, input);

                            throw nvae;

                        }

                        }
                        break;
                    case DECIMAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt7=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt7=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt7=3;
                            }
                            break;
                        case MULT:
                            {
                            alt7=4;
                            }
                            break;
                        case DIV:
                            {
                            alt7=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 8, input);

                            throw nvae;

                        }

                        }
                        break;
                    case BINARY:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt7=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt7=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt7=3;
                            }
                            break;
                        case MULT:
                            {
                            alt7=4;
                            }
                            break;
                        case DIV:
                            {
                            alt7=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 9, input);

                            throw nvae;

                        }

                        }
                        break;
                    case HEXADECIMAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt7=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt7=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt7=3;
                            }
                            break;
                        case MULT:
                            {
                            alt7=4;
                            }
                            break;
                        case DIV:
                            {
                            alt7=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 10, input);

                            throw nvae;

                        }

                        }
                        break;
                    case OCTAL:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case CLOSEPAR:
                            {
                            alt7=1;
                            }
                            break;
                        case PLUS:
                            {
                            alt7=2;
                            }
                            break;
                        case MINUS:
                            {
                            alt7=3;
                            }
                            break;
                        case MULT:
                            {
                            alt7=4;
                            }
                            break;
                        case DIV:
                            {
                            alt7=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 11, input);

                            throw nvae;

                        }

                        }
                        break;
                    case OPENPAR:
                        {
                        alt7=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 6, input);

                        throw nvae;

                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 5, input);

                    throw nvae;

                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // Lab6.g:140:4: l= digit ( DIV r= digit )
                    {
                    pushFollow(FOLLOW_digit_in_divExpr1007);
                    l=digit();

                    state._fsp--;


                     value = l; 

                    // Lab6.g:141:3: ( DIV r= digit )
                    // Lab6.g:141:5: DIV r= digit
                    {
                    match(input,DIV,FOLLOW_DIV_in_divExpr1015); 

                    pushFollow(FOLLOW_digit_in_divExpr1021);
                    r=digit();

                    state._fsp--;


                     if (r == 0){value = 0;System.out.println("Cannot divide by 0.");}else {value /= r;} 

                    }


                    }
                    break;
                case 2 :
                    // Lab6.g:142:4: l= digit ( DIV r= addExpr )
                    {
                    pushFollow(FOLLOW_digit_in_divExpr1034);
                    l=digit();

                    state._fsp--;


                     value = l; 

                    // Lab6.g:143:3: ( DIV r= addExpr )
                    // Lab6.g:143:5: DIV r= addExpr
                    {
                    match(input,DIV,FOLLOW_DIV_in_divExpr1042); 

                    pushFollow(FOLLOW_addExpr_in_divExpr1048);
                    r=addExpr();

                    state._fsp--;


                     if (r == 0){value = 0;System.out.println("Cannot divide by 0.");}else {value /= r;} 

                    }


                    }
                    break;
                case 3 :
                    // Lab6.g:144:4: l= digit ( DIV r= subExpr )
                    {
                    pushFollow(FOLLOW_digit_in_divExpr1061);
                    l=digit();

                    state._fsp--;


                     value = l; 

                    // Lab6.g:145:3: ( DIV r= subExpr )
                    // Lab6.g:145:5: DIV r= subExpr
                    {
                    match(input,DIV,FOLLOW_DIV_in_divExpr1069); 

                    pushFollow(FOLLOW_subExpr_in_divExpr1075);
                    r=subExpr();

                    state._fsp--;


                     if (r == 0){value = 0;System.out.println("Cannot divide by 0.");}else {value /= r;} 

                    }


                    }
                    break;
                case 4 :
                    // Lab6.g:146:4: l= digit ( DIV r= mulExpr )
                    {
                    pushFollow(FOLLOW_digit_in_divExpr1088);
                    l=digit();

                    state._fsp--;


                     value = l; 

                    // Lab6.g:147:3: ( DIV r= mulExpr )
                    // Lab6.g:147:5: DIV r= mulExpr
                    {
                    match(input,DIV,FOLLOW_DIV_in_divExpr1096); 

                    pushFollow(FOLLOW_mulExpr_in_divExpr1102);
                    r=mulExpr();

                    state._fsp--;


                     if (r == 0){value = 0;System.out.println("Cannot divide by 0.");}else {value /= r;} 

                    }


                    }
                    break;
                case 5 :
                    // Lab6.g:148:4: l= digit ( DIV r= divExpr )
                    {
                    pushFollow(FOLLOW_digit_in_divExpr1115);
                    l=digit();

                    state._fsp--;


                     value = l; 

                    // Lab6.g:149:3: ( DIV r= divExpr )
                    // Lab6.g:149:5: DIV r= divExpr
                    {
                    match(input,DIV,FOLLOW_DIV_in_divExpr1123); 

                    pushFollow(FOLLOW_divExpr_in_divExpr1129);
                    r=divExpr();

                    state._fsp--;


                     if (r == 0){value = 0;System.out.println("Cannot divide by 0.");}else {value /= r;} 

                    }


                    }
                    break;
                case 6 :
                    // Lab6.g:150:4: l= digit ( DIV r= parExpr )
                    {
                    pushFollow(FOLLOW_digit_in_divExpr1142);
                    l=digit();

                    state._fsp--;


                     value = l; 

                    // Lab6.g:151:3: ( DIV r= parExpr )
                    // Lab6.g:151:5: DIV r= parExpr
                    {
                    match(input,DIV,FOLLOW_DIV_in_divExpr1150); 

                    pushFollow(FOLLOW_parExpr_in_divExpr1156);
                    r=parExpr();

                    state._fsp--;


                     if (r == 0){value = 0;System.out.println("Cannot divide by 0.");}else {value /= r;} 

                    }


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
        return value;
    }
    // $ANTLR end "divExpr"



    // $ANTLR start "expExpr"
    // Lab6.g:154:1: expExpr returns [float value] : l= digit ( EXPONENT r= digit ) ;
    public final float expExpr() throws RecognitionException {
        float value = 0.0f;


        float l =0.0f;

        float r =0.0f;


        try {
            // Lab6.g:155:2: (l= digit ( EXPONENT r= digit ) )
            // Lab6.g:155:4: l= digit ( EXPONENT r= digit )
            {
            pushFollow(FOLLOW_digit_in_expExpr1181);
            l=digit();

            state._fsp--;


             value = l; 

            // Lab6.g:156:3: ( EXPONENT r= digit )
            // Lab6.g:156:5: EXPONENT r= digit
            {
            match(input,EXPONENT,FOLLOW_EXPONENT_in_expExpr1189); 

            pushFollow(FOLLOW_digit_in_expExpr1195);
            r=digit();

            state._fsp--;


             value = (float)(Math.pow((float)value, (float)r)); 

            }


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
    // $ANTLR end "expExpr"



    // $ANTLR start "sinExpr"
    // Lab6.g:159:1: sinExpr returns [float value] : ( SINE r= addExpr | SINE r= subExpr | SINE r= mulExpr | SINE r= divExpr | SINE r= digit );
    public final float sinExpr() throws RecognitionException {
        float value = 0.0f;


        float r =0.0f;


        try {
            // Lab6.g:160:2: ( SINE r= addExpr | SINE r= subExpr | SINE r= mulExpr | SINE r= divExpr | SINE r= digit )
            int alt8=5;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==SINE) ) {
                switch ( input.LA(2) ) {
                case INT:
                    {
                    switch ( input.LA(3) ) {
                    case PLUS:
                        {
                        alt8=1;
                        }
                        break;
                    case MINUS:
                        {
                        alt8=2;
                        }
                        break;
                    case MULT:
                        {
                        alt8=3;
                        }
                        break;
                    case DIV:
                        {
                        alt8=4;
                        }
                        break;
                    case EOF:
                    case CLOSEPAR:
                        {
                        alt8=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 2, input);

                        throw nvae;

                    }

                    }
                    break;
                case DECIMAL:
                    {
                    switch ( input.LA(3) ) {
                    case PLUS:
                        {
                        alt8=1;
                        }
                        break;
                    case MINUS:
                        {
                        alt8=2;
                        }
                        break;
                    case MULT:
                        {
                        alt8=3;
                        }
                        break;
                    case DIV:
                        {
                        alt8=4;
                        }
                        break;
                    case EOF:
                    case CLOSEPAR:
                        {
                        alt8=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 3, input);

                        throw nvae;

                    }

                    }
                    break;
                case BINARY:
                    {
                    switch ( input.LA(3) ) {
                    case PLUS:
                        {
                        alt8=1;
                        }
                        break;
                    case MINUS:
                        {
                        alt8=2;
                        }
                        break;
                    case MULT:
                        {
                        alt8=3;
                        }
                        break;
                    case DIV:
                        {
                        alt8=4;
                        }
                        break;
                    case EOF:
                    case CLOSEPAR:
                        {
                        alt8=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 4, input);

                        throw nvae;

                    }

                    }
                    break;
                case HEXADECIMAL:
                    {
                    switch ( input.LA(3) ) {
                    case PLUS:
                        {
                        alt8=1;
                        }
                        break;
                    case MINUS:
                        {
                        alt8=2;
                        }
                        break;
                    case MULT:
                        {
                        alt8=3;
                        }
                        break;
                    case DIV:
                        {
                        alt8=4;
                        }
                        break;
                    case EOF:
                    case CLOSEPAR:
                        {
                        alt8=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 5, input);

                        throw nvae;

                    }

                    }
                    break;
                case OCTAL:
                    {
                    switch ( input.LA(3) ) {
                    case PLUS:
                        {
                        alt8=1;
                        }
                        break;
                    case MINUS:
                        {
                        alt8=2;
                        }
                        break;
                    case MULT:
                        {
                        alt8=3;
                        }
                        break;
                    case DIV:
                        {
                        alt8=4;
                        }
                        break;
                    case EOF:
                    case CLOSEPAR:
                        {
                        alt8=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 6, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // Lab6.g:160:4: SINE r= addExpr
                    {
                    match(input,SINE,FOLLOW_SINE_in_sinExpr1216); 

                    pushFollow(FOLLOW_addExpr_in_sinExpr1222);
                    r=addExpr();

                    state._fsp--;


                     value = (float)(Math.sin((float)r)); 

                    }
                    break;
                case 2 :
                    // Lab6.g:161:4: SINE r= subExpr
                    {
                    match(input,SINE,FOLLOW_SINE_in_sinExpr1229); 

                    pushFollow(FOLLOW_subExpr_in_sinExpr1235);
                    r=subExpr();

                    state._fsp--;


                     value = (float)(Math.sin((float)r)); 

                    }
                    break;
                case 3 :
                    // Lab6.g:162:4: SINE r= mulExpr
                    {
                    match(input,SINE,FOLLOW_SINE_in_sinExpr1242); 

                    pushFollow(FOLLOW_mulExpr_in_sinExpr1248);
                    r=mulExpr();

                    state._fsp--;


                     value = (float)(Math.sin((float)r)); 

                    }
                    break;
                case 4 :
                    // Lab6.g:163:4: SINE r= divExpr
                    {
                    match(input,SINE,FOLLOW_SINE_in_sinExpr1255); 

                    pushFollow(FOLLOW_divExpr_in_sinExpr1261);
                    r=divExpr();

                    state._fsp--;


                     value = (float)(Math.sin((float)r)); 

                    }
                    break;
                case 5 :
                    // Lab6.g:164:4: SINE r= digit
                    {
                    match(input,SINE,FOLLOW_SINE_in_sinExpr1268); 

                    pushFollow(FOLLOW_digit_in_sinExpr1274);
                    r=digit();

                    state._fsp--;


                     value = (float)(Math.sin((float)r)); 

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
        return value;
    }
    // $ANTLR end "sinExpr"



    // $ANTLR start "cosExpr"
    // Lab6.g:167:1: cosExpr returns [float value] : ( COSINE r= digit | COSINE r= addExpr | COSINE r= subExpr | COSINE r= mulExpr | COSINE r= divExpr );
    public final float cosExpr() throws RecognitionException {
        float value = 0.0f;


        float r =0.0f;


        try {
            // Lab6.g:168:2: ( COSINE r= digit | COSINE r= addExpr | COSINE r= subExpr | COSINE r= mulExpr | COSINE r= divExpr )
            int alt9=5;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==COSINE) ) {
                switch ( input.LA(2) ) {
                case INT:
                    {
                    switch ( input.LA(3) ) {
                    case EOF:
                    case CLOSEPAR:
                        {
                        alt9=1;
                        }
                        break;
                    case PLUS:
                        {
                        alt9=2;
                        }
                        break;
                    case MINUS:
                        {
                        alt9=3;
                        }
                        break;
                    case MULT:
                        {
                        alt9=4;
                        }
                        break;
                    case DIV:
                        {
                        alt9=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 2, input);

                        throw nvae;

                    }

                    }
                    break;
                case DECIMAL:
                    {
                    switch ( input.LA(3) ) {
                    case EOF:
                    case CLOSEPAR:
                        {
                        alt9=1;
                        }
                        break;
                    case PLUS:
                        {
                        alt9=2;
                        }
                        break;
                    case MINUS:
                        {
                        alt9=3;
                        }
                        break;
                    case MULT:
                        {
                        alt9=4;
                        }
                        break;
                    case DIV:
                        {
                        alt9=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 3, input);

                        throw nvae;

                    }

                    }
                    break;
                case BINARY:
                    {
                    switch ( input.LA(3) ) {
                    case EOF:
                    case CLOSEPAR:
                        {
                        alt9=1;
                        }
                        break;
                    case PLUS:
                        {
                        alt9=2;
                        }
                        break;
                    case MINUS:
                        {
                        alt9=3;
                        }
                        break;
                    case MULT:
                        {
                        alt9=4;
                        }
                        break;
                    case DIV:
                        {
                        alt9=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 4, input);

                        throw nvae;

                    }

                    }
                    break;
                case HEXADECIMAL:
                    {
                    switch ( input.LA(3) ) {
                    case EOF:
                    case CLOSEPAR:
                        {
                        alt9=1;
                        }
                        break;
                    case PLUS:
                        {
                        alt9=2;
                        }
                        break;
                    case MINUS:
                        {
                        alt9=3;
                        }
                        break;
                    case MULT:
                        {
                        alt9=4;
                        }
                        break;
                    case DIV:
                        {
                        alt9=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 5, input);

                        throw nvae;

                    }

                    }
                    break;
                case OCTAL:
                    {
                    switch ( input.LA(3) ) {
                    case EOF:
                    case CLOSEPAR:
                        {
                        alt9=1;
                        }
                        break;
                    case PLUS:
                        {
                        alt9=2;
                        }
                        break;
                    case MINUS:
                        {
                        alt9=3;
                        }
                        break;
                    case MULT:
                        {
                        alt9=4;
                        }
                        break;
                    case DIV:
                        {
                        alt9=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 6, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // Lab6.g:168:4: COSINE r= digit
                    {
                    match(input,COSINE,FOLLOW_COSINE_in_cosExpr1293); 

                    pushFollow(FOLLOW_digit_in_cosExpr1299);
                    r=digit();

                    state._fsp--;


                     value = (float)(Math.cos((float)r)); 

                    }
                    break;
                case 2 :
                    // Lab6.g:169:4: COSINE r= addExpr
                    {
                    match(input,COSINE,FOLLOW_COSINE_in_cosExpr1306); 

                    pushFollow(FOLLOW_addExpr_in_cosExpr1312);
                    r=addExpr();

                    state._fsp--;


                     value = (float)(Math.cos((float)r)); 

                    }
                    break;
                case 3 :
                    // Lab6.g:170:4: COSINE r= subExpr
                    {
                    match(input,COSINE,FOLLOW_COSINE_in_cosExpr1319); 

                    pushFollow(FOLLOW_subExpr_in_cosExpr1325);
                    r=subExpr();

                    state._fsp--;


                     value = (float)(Math.cos((float)r)); 

                    }
                    break;
                case 4 :
                    // Lab6.g:171:4: COSINE r= mulExpr
                    {
                    match(input,COSINE,FOLLOW_COSINE_in_cosExpr1332); 

                    pushFollow(FOLLOW_mulExpr_in_cosExpr1338);
                    r=mulExpr();

                    state._fsp--;


                     value = (float)(Math.cos((float)r)); 

                    }
                    break;
                case 5 :
                    // Lab6.g:172:4: COSINE r= divExpr
                    {
                    match(input,COSINE,FOLLOW_COSINE_in_cosExpr1345); 

                    pushFollow(FOLLOW_divExpr_in_cosExpr1351);
                    r=divExpr();

                    state._fsp--;


                     value = (float)(Math.cos((float)r)); 

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
        return value;
    }
    // $ANTLR end "cosExpr"



    // $ANTLR start "tanExpr"
    // Lab6.g:175:1: tanExpr returns [float value] : ( TANGENT r= digit | TANGENT r= addExpr | TANGENT r= subExpr | TANGENT r= mulExpr | TANGENT r= divExpr );
    public final float tanExpr() throws RecognitionException {
        float value = 0.0f;


        float r =0.0f;


        try {
            // Lab6.g:176:2: ( TANGENT r= digit | TANGENT r= addExpr | TANGENT r= subExpr | TANGENT r= mulExpr | TANGENT r= divExpr )
            int alt10=5;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==TANGENT) ) {
                switch ( input.LA(2) ) {
                case INT:
                    {
                    switch ( input.LA(3) ) {
                    case EOF:
                    case CLOSEPAR:
                        {
                        alt10=1;
                        }
                        break;
                    case PLUS:
                        {
                        alt10=2;
                        }
                        break;
                    case MINUS:
                        {
                        alt10=3;
                        }
                        break;
                    case MULT:
                        {
                        alt10=4;
                        }
                        break;
                    case DIV:
                        {
                        alt10=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 2, input);

                        throw nvae;

                    }

                    }
                    break;
                case DECIMAL:
                    {
                    switch ( input.LA(3) ) {
                    case EOF:
                    case CLOSEPAR:
                        {
                        alt10=1;
                        }
                        break;
                    case PLUS:
                        {
                        alt10=2;
                        }
                        break;
                    case MINUS:
                        {
                        alt10=3;
                        }
                        break;
                    case MULT:
                        {
                        alt10=4;
                        }
                        break;
                    case DIV:
                        {
                        alt10=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 3, input);

                        throw nvae;

                    }

                    }
                    break;
                case BINARY:
                    {
                    switch ( input.LA(3) ) {
                    case EOF:
                    case CLOSEPAR:
                        {
                        alt10=1;
                        }
                        break;
                    case PLUS:
                        {
                        alt10=2;
                        }
                        break;
                    case MINUS:
                        {
                        alt10=3;
                        }
                        break;
                    case MULT:
                        {
                        alt10=4;
                        }
                        break;
                    case DIV:
                        {
                        alt10=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 4, input);

                        throw nvae;

                    }

                    }
                    break;
                case HEXADECIMAL:
                    {
                    switch ( input.LA(3) ) {
                    case EOF:
                    case CLOSEPAR:
                        {
                        alt10=1;
                        }
                        break;
                    case PLUS:
                        {
                        alt10=2;
                        }
                        break;
                    case MINUS:
                        {
                        alt10=3;
                        }
                        break;
                    case MULT:
                        {
                        alt10=4;
                        }
                        break;
                    case DIV:
                        {
                        alt10=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 5, input);

                        throw nvae;

                    }

                    }
                    break;
                case OCTAL:
                    {
                    switch ( input.LA(3) ) {
                    case EOF:
                    case CLOSEPAR:
                        {
                        alt10=1;
                        }
                        break;
                    case PLUS:
                        {
                        alt10=2;
                        }
                        break;
                    case MINUS:
                        {
                        alt10=3;
                        }
                        break;
                    case MULT:
                        {
                        alt10=4;
                        }
                        break;
                    case DIV:
                        {
                        alt10=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 6, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // Lab6.g:176:4: TANGENT r= digit
                    {
                    match(input,TANGENT,FOLLOW_TANGENT_in_tanExpr1369); 

                    pushFollow(FOLLOW_digit_in_tanExpr1375);
                    r=digit();

                    state._fsp--;


                     value = (float)(Math.tan((float)r)); 

                    }
                    break;
                case 2 :
                    // Lab6.g:177:4: TANGENT r= addExpr
                    {
                    match(input,TANGENT,FOLLOW_TANGENT_in_tanExpr1382); 

                    pushFollow(FOLLOW_addExpr_in_tanExpr1388);
                    r=addExpr();

                    state._fsp--;


                     value = (float)(Math.tan((float)r)); 

                    }
                    break;
                case 3 :
                    // Lab6.g:178:4: TANGENT r= subExpr
                    {
                    match(input,TANGENT,FOLLOW_TANGENT_in_tanExpr1395); 

                    pushFollow(FOLLOW_subExpr_in_tanExpr1401);
                    r=subExpr();

                    state._fsp--;


                     value = (float)(Math.tan((float)r)); 

                    }
                    break;
                case 4 :
                    // Lab6.g:179:4: TANGENT r= mulExpr
                    {
                    match(input,TANGENT,FOLLOW_TANGENT_in_tanExpr1408); 

                    pushFollow(FOLLOW_mulExpr_in_tanExpr1414);
                    r=mulExpr();

                    state._fsp--;


                     value = (float)(Math.tan((float)r)); 

                    }
                    break;
                case 5 :
                    // Lab6.g:180:4: TANGENT r= divExpr
                    {
                    match(input,TANGENT,FOLLOW_TANGENT_in_tanExpr1421); 

                    pushFollow(FOLLOW_divExpr_in_tanExpr1427);
                    r=divExpr();

                    state._fsp--;


                     value = (float)(Math.tan((float)r)); 

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
        return value;
    }
    // $ANTLR end "tanExpr"



    // $ANTLR start "logExpr"
    // Lab6.g:183:1: logExpr returns [float value] : ( LOG r= digit | LOG r= addExpr | LOG r= subExpr | LOG r= mulExpr | LOG r= divExpr );
    public final float logExpr() throws RecognitionException {
        float value = 0.0f;


        float r =0.0f;


        try {
            // Lab6.g:184:2: ( LOG r= digit | LOG r= addExpr | LOG r= subExpr | LOG r= mulExpr | LOG r= divExpr )
            int alt11=5;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==LOG) ) {
                switch ( input.LA(2) ) {
                case INT:
                    {
                    switch ( input.LA(3) ) {
                    case EOF:
                    case CLOSEPAR:
                        {
                        alt11=1;
                        }
                        break;
                    case PLUS:
                        {
                        alt11=2;
                        }
                        break;
                    case MINUS:
                        {
                        alt11=3;
                        }
                        break;
                    case MULT:
                        {
                        alt11=4;
                        }
                        break;
                    case DIV:
                        {
                        alt11=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 2, input);

                        throw nvae;

                    }

                    }
                    break;
                case DECIMAL:
                    {
                    switch ( input.LA(3) ) {
                    case EOF:
                    case CLOSEPAR:
                        {
                        alt11=1;
                        }
                        break;
                    case PLUS:
                        {
                        alt11=2;
                        }
                        break;
                    case MINUS:
                        {
                        alt11=3;
                        }
                        break;
                    case MULT:
                        {
                        alt11=4;
                        }
                        break;
                    case DIV:
                        {
                        alt11=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 3, input);

                        throw nvae;

                    }

                    }
                    break;
                case BINARY:
                    {
                    switch ( input.LA(3) ) {
                    case EOF:
                    case CLOSEPAR:
                        {
                        alt11=1;
                        }
                        break;
                    case PLUS:
                        {
                        alt11=2;
                        }
                        break;
                    case MINUS:
                        {
                        alt11=3;
                        }
                        break;
                    case MULT:
                        {
                        alt11=4;
                        }
                        break;
                    case DIV:
                        {
                        alt11=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 4, input);

                        throw nvae;

                    }

                    }
                    break;
                case HEXADECIMAL:
                    {
                    switch ( input.LA(3) ) {
                    case EOF:
                    case CLOSEPAR:
                        {
                        alt11=1;
                        }
                        break;
                    case PLUS:
                        {
                        alt11=2;
                        }
                        break;
                    case MINUS:
                        {
                        alt11=3;
                        }
                        break;
                    case MULT:
                        {
                        alt11=4;
                        }
                        break;
                    case DIV:
                        {
                        alt11=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 5, input);

                        throw nvae;

                    }

                    }
                    break;
                case OCTAL:
                    {
                    switch ( input.LA(3) ) {
                    case EOF:
                    case CLOSEPAR:
                        {
                        alt11=1;
                        }
                        break;
                    case PLUS:
                        {
                        alt11=2;
                        }
                        break;
                    case MINUS:
                        {
                        alt11=3;
                        }
                        break;
                    case MULT:
                        {
                        alt11=4;
                        }
                        break;
                    case DIV:
                        {
                        alt11=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 6, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // Lab6.g:184:4: LOG r= digit
                    {
                    match(input,LOG,FOLLOW_LOG_in_logExpr1446); 

                    pushFollow(FOLLOW_digit_in_logExpr1452);
                    r=digit();

                    state._fsp--;


                     value = (float)(Math.log((float)r)); 

                    }
                    break;
                case 2 :
                    // Lab6.g:185:4: LOG r= addExpr
                    {
                    match(input,LOG,FOLLOW_LOG_in_logExpr1459); 

                    pushFollow(FOLLOW_addExpr_in_logExpr1465);
                    r=addExpr();

                    state._fsp--;


                     value = (float)(Math.log((float)r)); 

                    }
                    break;
                case 3 :
                    // Lab6.g:186:4: LOG r= subExpr
                    {
                    match(input,LOG,FOLLOW_LOG_in_logExpr1472); 

                    pushFollow(FOLLOW_subExpr_in_logExpr1478);
                    r=subExpr();

                    state._fsp--;


                     value = (float)(Math.log((float)r)); 

                    }
                    break;
                case 4 :
                    // Lab6.g:187:4: LOG r= mulExpr
                    {
                    match(input,LOG,FOLLOW_LOG_in_logExpr1485); 

                    pushFollow(FOLLOW_mulExpr_in_logExpr1491);
                    r=mulExpr();

                    state._fsp--;


                     value = (float)(Math.log((float)r)); 

                    }
                    break;
                case 5 :
                    // Lab6.g:188:4: LOG r= divExpr
                    {
                    match(input,LOG,FOLLOW_LOG_in_logExpr1498); 

                    pushFollow(FOLLOW_divExpr_in_logExpr1504);
                    r=divExpr();

                    state._fsp--;


                     value = (float)(Math.log((float)r)); 

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
        return value;
    }
    // $ANTLR end "logExpr"



    // $ANTLR start "digit"
    // Lab6.g:191:1: digit returns [float value] : ( INT | DECIMAL | BINARY | HEXADECIMAL | OCTAL );
    public final float digit() throws RecognitionException {
        float value = 0.0f;


        Token INT15=null;
        Token DECIMAL16=null;
        Token BINARY17=null;
        Token HEXADECIMAL18=null;
        Token OCTAL19=null;

        try {
            // Lab6.g:192:2: ( INT | DECIMAL | BINARY | HEXADECIMAL | OCTAL )
            int alt12=5;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt12=1;
                }
                break;
            case DECIMAL:
                {
                alt12=2;
                }
                break;
            case BINARY:
                {
                alt12=3;
                }
                break;
            case HEXADECIMAL:
                {
                alt12=4;
                }
                break;
            case OCTAL:
                {
                alt12=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }

            switch (alt12) {
                case 1 :
                    // Lab6.g:192:4: INT
                    {
                    INT15=(Token)match(input,INT,FOLLOW_INT_in_digit1523); 

                     value = Integer.parseInt( INT15.getText(), 10); 

                    }
                    break;
                case 2 :
                    // Lab6.g:193:4: DECIMAL
                    {
                    DECIMAL16=(Token)match(input,DECIMAL,FOLLOW_DECIMAL_in_digit1530); 

                     value = Float.parseFloat( DECIMAL16.getText()); 

                    }
                    break;
                case 3 :
                    // Lab6.g:194:4: BINARY
                    {
                    BINARY17=(Token)match(input,BINARY,FOLLOW_BINARY_in_digit1537); 

                     value = Integer.parseInt( BINARY17.getText().substring(2), 2); 

                    }
                    break;
                case 4 :
                    // Lab6.g:195:4: HEXADECIMAL
                    {
                    HEXADECIMAL18=(Token)match(input,HEXADECIMAL,FOLLOW_HEXADECIMAL_in_digit1544); 

                     value = Integer.parseInt( HEXADECIMAL18.getText().substring(2), 16); 

                    }
                    break;
                case 5 :
                    // Lab6.g:196:4: OCTAL
                    {
                    OCTAL19=(Token)match(input,OCTAL,FOLLOW_OCTAL_in_digit1551); 

                     value = Integer.parseInt( OCTAL19.getText().substring(3), 8); 

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
        return value;
    }
    // $ANTLR end "digit"

    // Delegated rules


 

    public static final BitSet FOLLOW_expr_in_top312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPENPAR_in_top317 = new BitSet(new long[]{0x0000000000C8E2A0L});
    public static final BitSet FOLLOW_expr_in_top319 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_CLOSEPAR_in_top321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addExpr_in_expr337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subExpr_in_expr345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mulExpr_in_expr352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_divExpr_in_expr359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expExpr_in_expr366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sinExpr_in_expr373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cosExpr_in_expr380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tanExpr_in_expr387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logExpr_in_expr394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_digit_in_expr401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPENPAR_in_parExpr420 = new BitSet(new long[]{0x0000000000086220L});
    public static final BitSet FOLLOW_addExpr_in_parExpr422 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_CLOSEPAR_in_parExpr424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPENPAR_in_parExpr431 = new BitSet(new long[]{0x0000000000086220L});
    public static final BitSet FOLLOW_subExpr_in_parExpr433 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_CLOSEPAR_in_parExpr435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPENPAR_in_parExpr442 = new BitSet(new long[]{0x0000000000086220L});
    public static final BitSet FOLLOW_mulExpr_in_parExpr444 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_CLOSEPAR_in_parExpr446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPENPAR_in_parExpr453 = new BitSet(new long[]{0x0000000000086220L});
    public static final BitSet FOLLOW_divExpr_in_parExpr455 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_CLOSEPAR_in_parExpr457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_digit_in_addExpr480 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PLUS_in_addExpr488 = new BitSet(new long[]{0x0000000000086220L});
    public static final BitSet FOLLOW_digit_in_addExpr494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_digit_in_addExpr508 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PLUS_in_addExpr516 = new BitSet(new long[]{0x0000000000086220L});
    public static final BitSet FOLLOW_addExpr_in_addExpr522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_digit_in_addExpr535 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PLUS_in_addExpr543 = new BitSet(new long[]{0x0000000000086220L});
    public static final BitSet FOLLOW_subExpr_in_addExpr549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_digit_in_addExpr562 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PLUS_in_addExpr570 = new BitSet(new long[]{0x0000000000086220L});
    public static final BitSet FOLLOW_mulExpr_in_addExpr576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_digit_in_addExpr588 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PLUS_in_addExpr596 = new BitSet(new long[]{0x0000000000086220L});
    public static final BitSet FOLLOW_divExpr_in_addExpr602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_digit_in_addExpr614 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PLUS_in_addExpr622 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_parExpr_in_addExpr628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_digit_in_subExpr660 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_MINUS_in_subExpr668 = new BitSet(new long[]{0x0000000000086220L});
    public static final BitSet FOLLOW_digit_in_subExpr674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_digit_in_subExpr687 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_MINUS_in_subExpr695 = new BitSet(new long[]{0x0000000000086220L});
    public static final BitSet FOLLOW_addExpr_in_subExpr701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_digit_in_subExpr714 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_MINUS_in_subExpr722 = new BitSet(new long[]{0x0000000000086220L});
    public static final BitSet FOLLOW_subExpr_in_subExpr728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_digit_in_subExpr741 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_MINUS_in_subExpr749 = new BitSet(new long[]{0x0000000000086220L});
    public static final BitSet FOLLOW_mulExpr_in_subExpr755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_digit_in_subExpr768 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_MINUS_in_subExpr776 = new BitSet(new long[]{0x0000000000086220L});
    public static final BitSet FOLLOW_divExpr_in_subExpr782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_digit_in_subExpr795 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_MINUS_in_subExpr803 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_parExpr_in_subExpr809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_digit_in_mulExpr833 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_MULT_in_mulExpr841 = new BitSet(new long[]{0x0000000000086220L});
    public static final BitSet FOLLOW_digit_in_mulExpr847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_digit_in_mulExpr860 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_MULT_in_mulExpr868 = new BitSet(new long[]{0x0000000000086220L});
    public static final BitSet FOLLOW_addExpr_in_mulExpr874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_digit_in_mulExpr887 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_MULT_in_mulExpr895 = new BitSet(new long[]{0x0000000000086220L});
    public static final BitSet FOLLOW_subExpr_in_mulExpr901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_digit_in_mulExpr914 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_MULT_in_mulExpr922 = new BitSet(new long[]{0x0000000000086220L});
    public static final BitSet FOLLOW_mulExpr_in_mulExpr928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_digit_in_mulExpr941 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_MULT_in_mulExpr949 = new BitSet(new long[]{0x0000000000086220L});
    public static final BitSet FOLLOW_divExpr_in_mulExpr955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_digit_in_mulExpr968 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_MULT_in_mulExpr976 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_parExpr_in_mulExpr982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_digit_in_divExpr1007 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_DIV_in_divExpr1015 = new BitSet(new long[]{0x0000000000086220L});
    public static final BitSet FOLLOW_digit_in_divExpr1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_digit_in_divExpr1034 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_DIV_in_divExpr1042 = new BitSet(new long[]{0x0000000000086220L});
    public static final BitSet FOLLOW_addExpr_in_divExpr1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_digit_in_divExpr1061 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_DIV_in_divExpr1069 = new BitSet(new long[]{0x0000000000086220L});
    public static final BitSet FOLLOW_subExpr_in_divExpr1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_digit_in_divExpr1088 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_DIV_in_divExpr1096 = new BitSet(new long[]{0x0000000000086220L});
    public static final BitSet FOLLOW_mulExpr_in_divExpr1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_digit_in_divExpr1115 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_DIV_in_divExpr1123 = new BitSet(new long[]{0x0000000000086220L});
    public static final BitSet FOLLOW_divExpr_in_divExpr1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_digit_in_divExpr1142 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_DIV_in_divExpr1150 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_parExpr_in_divExpr1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_digit_in_expExpr1181 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_EXPONENT_in_expExpr1189 = new BitSet(new long[]{0x0000000000086220L});
    public static final BitSet FOLLOW_digit_in_expExpr1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SINE_in_sinExpr1216 = new BitSet(new long[]{0x0000000000086220L});
    public static final BitSet FOLLOW_addExpr_in_sinExpr1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SINE_in_sinExpr1229 = new BitSet(new long[]{0x0000000000086220L});
    public static final BitSet FOLLOW_subExpr_in_sinExpr1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SINE_in_sinExpr1242 = new BitSet(new long[]{0x0000000000086220L});
    public static final BitSet FOLLOW_mulExpr_in_sinExpr1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SINE_in_sinExpr1255 = new BitSet(new long[]{0x0000000000086220L});
    public static final BitSet FOLLOW_divExpr_in_sinExpr1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SINE_in_sinExpr1268 = new BitSet(new long[]{0x0000000000086220L});
    public static final BitSet FOLLOW_digit_in_sinExpr1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COSINE_in_cosExpr1293 = new BitSet(new long[]{0x0000000000086220L});
    public static final BitSet FOLLOW_digit_in_cosExpr1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COSINE_in_cosExpr1306 = new BitSet(new long[]{0x0000000000086220L});
    public static final BitSet FOLLOW_addExpr_in_cosExpr1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COSINE_in_cosExpr1319 = new BitSet(new long[]{0x0000000000086220L});
    public static final BitSet FOLLOW_subExpr_in_cosExpr1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COSINE_in_cosExpr1332 = new BitSet(new long[]{0x0000000000086220L});
    public static final BitSet FOLLOW_mulExpr_in_cosExpr1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COSINE_in_cosExpr1345 = new BitSet(new long[]{0x0000000000086220L});
    public static final BitSet FOLLOW_divExpr_in_cosExpr1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TANGENT_in_tanExpr1369 = new BitSet(new long[]{0x0000000000086220L});
    public static final BitSet FOLLOW_digit_in_tanExpr1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TANGENT_in_tanExpr1382 = new BitSet(new long[]{0x0000000000086220L});
    public static final BitSet FOLLOW_addExpr_in_tanExpr1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TANGENT_in_tanExpr1395 = new BitSet(new long[]{0x0000000000086220L});
    public static final BitSet FOLLOW_subExpr_in_tanExpr1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TANGENT_in_tanExpr1408 = new BitSet(new long[]{0x0000000000086220L});
    public static final BitSet FOLLOW_mulExpr_in_tanExpr1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TANGENT_in_tanExpr1421 = new BitSet(new long[]{0x0000000000086220L});
    public static final BitSet FOLLOW_divExpr_in_tanExpr1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOG_in_logExpr1446 = new BitSet(new long[]{0x0000000000086220L});
    public static final BitSet FOLLOW_digit_in_logExpr1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOG_in_logExpr1459 = new BitSet(new long[]{0x0000000000086220L});
    public static final BitSet FOLLOW_addExpr_in_logExpr1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOG_in_logExpr1472 = new BitSet(new long[]{0x0000000000086220L});
    public static final BitSet FOLLOW_subExpr_in_logExpr1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOG_in_logExpr1485 = new BitSet(new long[]{0x0000000000086220L});
    public static final BitSet FOLLOW_mulExpr_in_logExpr1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOG_in_logExpr1498 = new BitSet(new long[]{0x0000000000086220L});
    public static final BitSet FOLLOW_divExpr_in_logExpr1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_digit1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECIMAL_in_digit1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BINARY_in_digit1537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEXADECIMAL_in_digit1544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OCTAL_in_digit1551 = new BitSet(new long[]{0x0000000000000002L});

}