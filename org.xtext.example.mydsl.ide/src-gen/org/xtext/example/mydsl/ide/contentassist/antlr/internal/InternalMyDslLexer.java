package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslLexer extends Lexer {
    public static final int RULE_A=9;
    public static final int RULE_STRUCT=46;
    public static final int RULE_DEC_OP=82;
    public static final int RULE_ATOMIC=56;
    public static final int RULE_REGISTER=39;
    public static final int RULE_WHILE=53;
    public static final int RULE_FUNC_NAME=64;
    public static final int RULE_ID=4;
    public static final int RULE_RETURN=41;
    public static final int RULE_INLINE=36;
    public static final int RULE_SUB_ASSIGN=72;
    public static final int RULE_HP=11;
    public static final int RULE_AUTO=20;
    public static final int RULE_INT=90;
    public static final int RULE_ML_COMMENT=92;
    public static final int RULE_RESTRICT=40;
    public static final int RULE_MUL_ASSIGN=73;
    public static final int RULE_IMAGINARY=60;
    public static final int RULE_ENUM=30;
    public static final int RULE_I_CONSTANT=65;
    public static final int RULE_COMPLEX=58;
    public static final int RULE_IS=16;
    public static final int RULE_CONST=24;
    public static final int RULE_VOLATILE=52;
    public static final int RULE_DEFAULT=26;
    public static final int RULE_IF=35;
    public static final int RULE_ELLIPSIS=68;
    public static final int RULE_AND_OP=84;
    public static final int RULE_SIGNED=43;
    public static final int RULE_LEFT_ASSIGN=70;
    public static final int RULE_STATIC_ASSERT=62;
    public static final int RULE_UNSIGNED=50;
    public static final int RULE_ALIGNAS=54;
    public static final int RULE_EQ_OP=88;
    public static final int RULE_STATIC=45;
    public static final int RULE_LEFT_OP=80;
    public static final int RULE_CONTINUE=25;
    public static final int RULE_BOOL=57;
    public static final int RULE_AND_ASSIGN=76;
    public static final int RULE_O=5;
    public static final int RULE_P=13;
    public static final int RULE_SWITCH=47;
    public static final int RULE_L=8;
    public static final int RULE_OR_OP=85;
    public static final int RULE_FLOAT=32;
    public static final int RULE_F_CONSTANT=66;
    public static final int RULE_H=10;
    public static final int RULE_E=12;
    public static final int RULE_D=6;
    public static final int T__100=100;
    public static final int RULE_THREAD_LOCAL=63;
    public static final int T__101=101;
    public static final int RULE_NORETURN=61;
    public static final int RULE_CP=17;
    public static final int RULE_EXTERN=31;
    public static final int RULE_GE_OP=87;
    public static final int T__99=99;
    public static final int RULE_CHAR=23;
    public static final int RULE_SP=18;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int RULE_MOD_ASSIGN=75;
    public static final int RULE_SHORT=42;
    public static final int RULE_CASE=22;
    public static final int RULE_DO=27;
    public static final int RULE_XOR_ASSIGN=77;
    public static final int RULE_INC_OP=81;
    public static final int RULE_UNION=49;
    public static final int RULE_ELSE=29;
    public static final int RULE_TYPEDEF=48;
    public static final int RULE_OR_ASSIGN=78;
    public static final int RULE_NE_OP=89;
    public static final int RULE_ALIGNOF=55;
    public static final int RULE_PTR_OP=83;
    public static final int RULE_STRING=91;
    public static final int RULE_ES=15;
    public static final int RULE_STRING_LITERAL=67;
    public static final int RULE_SL_COMMENT=93;
    public static final int RULE_DOUBLE=28;
    public static final int RULE_BREAK=21;
    public static final int RULE_ADD_ASSIGN=71;
    public static final int RULE_FOR=33;
    public static final int EOF=-1;
    public static final int RULE_SIZEOF=44;
    public static final int RULE_VOID=51;
    public static final int RULE_GENERIC=59;
    public static final int RULE_WS=19;
    public static final int RULE_GOTO=34;
    public static final int RULE_RIGHT_ASSIGN=69;
    public static final int RULE_FS=14;
    public static final int RULE_INTZ=37;
    public static final int RULE_ANY_OTHER=94;
    public static final int RULE_DIV_ASSIGN=74;
    public static final int RULE_RIGHT_OP=79;
    public static final int RULE_NZ=7;
    public static final int RULE_LE_OP=86;
    public static final int RULE_LONG=38;

    // delegates
    // delegators

    public InternalMyDslLexer() {;} 
    public InternalMyDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:11:7: ( 'datatype' )
            // InternalMyDsl.g:11:9: 'datatype'
            {
            match("datatype"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:12:7: ( 'entity' )
            // InternalMyDsl.g:12:9: 'entity'
            {
            match("entity"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13:7: ( '{' )
            // InternalMyDsl.g:13:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:14:7: ( '}' )
            // InternalMyDsl.g:14:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:15:7: ( 'extends' )
            // InternalMyDsl.g:15:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:16:8: ( ':' )
            // InternalMyDsl.g:16:10: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:17:8: ( 'many' )
            // InternalMyDsl.g:17:10: 'many'
            {
            match("many"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "RULE_O"
    public final void mRULE_O() throws RecognitionException {
        try {
            // InternalMyDsl.g:708:17: ( '0' .. '7' )
            // InternalMyDsl.g:708:19: '0' .. '7'
            {
            matchRange('0','7'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_O"

    // $ANTLR start "RULE_D"
    public final void mRULE_D() throws RecognitionException {
        try {
            // InternalMyDsl.g:710:17: ( '0' .. '9' )
            // InternalMyDsl.g:710:19: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_D"

    // $ANTLR start "RULE_NZ"
    public final void mRULE_NZ() throws RecognitionException {
        try {
            // InternalMyDsl.g:712:18: ( '1' .. '9' )
            // InternalMyDsl.g:712:20: '1' .. '9'
            {
            matchRange('1','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NZ"

    // $ANTLR start "RULE_L"
    public final void mRULE_L() throws RecognitionException {
        try {
            int _type = RULE_L;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:714:8: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) )
            // InternalMyDsl.g:714:10: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_L"

    // $ANTLR start "RULE_A"
    public final void mRULE_A() throws RecognitionException {
        try {
            // InternalMyDsl.g:716:17: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' '..' '9' ) )
            // InternalMyDsl.g:716:19: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' '..' '9' )
            {
            // InternalMyDsl.g:716:19: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' '..' '9' )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                {
                alt1=1;
                }
                break;
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                {
                alt1=2;
                }
                break;
            case '_':
                {
                alt1=3;
                }
                break;
            case '0':
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:716:20: 'a' .. 'z'
                    {
                    matchRange('a','z'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:716:29: 'A' .. 'Z'
                    {
                    matchRange('A','Z'); 

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:716:38: '_'
                    {
                    match('_'); 

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:716:42: '0' '..' '9'
                    {
                    match('0'); 
                    match(".."); 

                    match('9'); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_A"

    // $ANTLR start "RULE_H"
    public final void mRULE_H() throws RecognitionException {
        try {
            // InternalMyDsl.g:718:17: ( ( 'a' .. 'f' | 'A' .. 'F' | '0' '..' '9' ) )
            // InternalMyDsl.g:718:19: ( 'a' .. 'f' | 'A' .. 'F' | '0' '..' '9' )
            {
            // InternalMyDsl.g:718:19: ( 'a' .. 'f' | 'A' .. 'F' | '0' '..' '9' )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
                {
                alt2=1;
                }
                break;
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
                {
                alt2=2;
                }
                break;
            case '0':
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:718:20: 'a' .. 'f'
                    {
                    matchRange('a','f'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:718:29: 'A' .. 'F'
                    {
                    matchRange('A','F'); 

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:718:38: '0' '..' '9'
                    {
                    match('0'); 
                    match(".."); 

                    match('9'); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_H"

    // $ANTLR start "RULE_HP"
    public final void mRULE_HP() throws RecognitionException {
        try {
            // InternalMyDsl.g:720:18: ( '0' ( 'x' | 'X' ) )
            // InternalMyDsl.g:720:20: '0' ( 'x' | 'X' )
            {
            match('0'); 
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HP"

    // $ANTLR start "RULE_E"
    public final void mRULE_E() throws RecognitionException {
        try {
            // InternalMyDsl.g:722:17: ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_D '+' )
            // InternalMyDsl.g:722:19: ( 'E' | 'e' ) ( '+' | '-' )? RULE_D '+'
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyDsl.g:722:29: ( '+' | '-' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='+'||LA3_0=='-') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            mRULE_D(); 
            match('+'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_E"

    // $ANTLR start "RULE_P"
    public final void mRULE_P() throws RecognitionException {
        try {
            // InternalMyDsl.g:724:17: ( ( 'P' | 'p' ) ( '+' | '-' )? '{' RULE_D '}' '+' )
            // InternalMyDsl.g:724:19: ( 'P' | 'p' ) ( '+' | '-' )? '{' RULE_D '}' '+'
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyDsl.g:724:29: ( '+' | '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='+'||LA4_0=='-') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            match('{'); 
            mRULE_D(); 
            match('}'); 
            match('+'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_P"

    // $ANTLR start "RULE_FS"
    public final void mRULE_FS() throws RecognitionException {
        try {
            // InternalMyDsl.g:726:18: ( ( 'f' | 'F' | 'l' | 'L' ) )
            // InternalMyDsl.g:726:20: ( 'f' | 'F' | 'l' | 'L' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='L'||input.LA(1)=='f'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_FS"

    // $ANTLR start "RULE_ES"
    public final void mRULE_ES() throws RecognitionException {
        try {
            // InternalMyDsl.g:728:18: ( RULE_A )
            // InternalMyDsl.g:728:20: RULE_A
            {
            mRULE_A(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ES"

    // $ANTLR start "RULE_IS"
    public final void mRULE_IS() throws RecognitionException {
        try {
            // InternalMyDsl.g:730:18: ( ( ( 'u' | 'U' ) ( 'l' | 'L' | 'l' 'l' | 'L' 'L' )? | ( 'l' | 'L' | 'l' 'l' | 'L' 'L' ) ( 'u' | 'U' )? ) )
            // InternalMyDsl.g:730:20: ( ( 'u' | 'U' ) ( 'l' | 'L' | 'l' 'l' | 'L' 'L' )? | ( 'l' | 'L' | 'l' 'l' | 'L' 'L' ) ( 'u' | 'U' )? )
            {
            // InternalMyDsl.g:730:20: ( ( 'u' | 'U' ) ( 'l' | 'L' | 'l' 'l' | 'L' 'L' )? | ( 'l' | 'L' | 'l' 'l' | 'L' 'L' ) ( 'u' | 'U' )? )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='U'||LA8_0=='u') ) {
                alt8=1;
            }
            else if ( (LA8_0=='L'||LA8_0=='l') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:730:21: ( 'u' | 'U' ) ( 'l' | 'L' | 'l' 'l' | 'L' 'L' )?
                    {
                    if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalMyDsl.g:730:31: ( 'l' | 'L' | 'l' 'l' | 'L' 'L' )?
                    int alt5=5;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='l') ) {
                        int LA5_1 = input.LA(2);

                        if ( (LA5_1=='l') ) {
                            alt5=3;
                        }
                    }
                    else if ( (LA5_0=='L') ) {
                        int LA5_2 = input.LA(2);

                        if ( (LA5_2=='L') ) {
                            alt5=4;
                        }
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalMyDsl.g:730:32: 'l'
                            {
                            match('l'); 

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:730:36: 'L'
                            {
                            match('L'); 

                            }
                            break;
                        case 3 :
                            // InternalMyDsl.g:730:40: 'l' 'l'
                            {
                            match('l'); 
                            match('l'); 

                            }
                            break;
                        case 4 :
                            // InternalMyDsl.g:730:48: 'L' 'L'
                            {
                            match('L'); 
                            match('L'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:730:58: ( 'l' | 'L' | 'l' 'l' | 'L' 'L' ) ( 'u' | 'U' )?
                    {
                    // InternalMyDsl.g:730:58: ( 'l' | 'L' | 'l' 'l' | 'L' 'L' )
                    int alt6=4;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='l') ) {
                        int LA6_1 = input.LA(2);

                        if ( (LA6_1=='l') ) {
                            alt6=3;
                        }
                        else {
                            alt6=1;}
                    }
                    else if ( (LA6_0=='L') ) {
                        int LA6_2 = input.LA(2);

                        if ( (LA6_2=='L') ) {
                            alt6=4;
                        }
                        else {
                            alt6=2;}
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalMyDsl.g:730:59: 'l'
                            {
                            match('l'); 

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:730:63: 'L'
                            {
                            match('L'); 

                            }
                            break;
                        case 3 :
                            // InternalMyDsl.g:730:67: 'l' 'l'
                            {
                            match('l'); 
                            match('l'); 

                            }
                            break;
                        case 4 :
                            // InternalMyDsl.g:730:75: 'L' 'L'
                            {
                            match('L'); 
                            match('L'); 

                            }
                            break;

                    }

                    // InternalMyDsl.g:730:84: ( 'u' | 'U' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='U'||LA7_0=='u') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalMyDsl.g:
                            {
                            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_IS"

    // $ANTLR start "RULE_CP"
    public final void mRULE_CP() throws RecognitionException {
        try {
            // InternalMyDsl.g:732:18: ( ( 'u' | 'U' | 'L' ) )
            // InternalMyDsl.g:732:20: ( 'u' | 'U' | 'L' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_CP"

    // $ANTLR start "RULE_SP"
    public final void mRULE_SP() throws RecognitionException {
        try {
            // InternalMyDsl.g:734:18: ( ( 'u' '8' | 'u' | 'U' | 'L' ) )
            // InternalMyDsl.g:734:20: ( 'u' '8' | 'u' | 'U' | 'L' )
            {
            // InternalMyDsl.g:734:20: ( 'u' '8' | 'u' | 'U' | 'L' )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 'u':
                {
                int LA9_1 = input.LA(2);

                if ( (LA9_1=='8') ) {
                    alt9=1;
                }
                else {
                    alt9=2;}
                }
                break;
            case 'U':
                {
                alt9=3;
                }
                break;
            case 'L':
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:734:21: 'u' '8'
                    {
                    match('u'); 
                    match('8'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:734:29: 'u'
                    {
                    match('u'); 

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:734:33: 'U'
                    {
                    match('U'); 

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:734:37: 'L'
                    {
                    match('L'); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_SP"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:736:9: ( ( ' ' | '\\t' | '\\r' | '\\n' | '\\f' )+ )
            // InternalMyDsl.g:736:11: ( ' ' | '\\t' | '\\r' | '\\n' | '\\f' )+
            {
            // InternalMyDsl.g:736:11: ( ' ' | '\\t' | '\\r' | '\\n' | '\\f' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\t' && LA10_0<='\n')||(LA10_0>='\f' && LA10_0<='\r')||LA10_0==' ') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_AUTO"
    public final void mRULE_AUTO() throws RecognitionException {
        try {
            int _type = RULE_AUTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:738:11: ( 'auto' )
            // InternalMyDsl.g:738:13: 'auto'
            {
            match("auto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AUTO"

    // $ANTLR start "RULE_BREAK"
    public final void mRULE_BREAK() throws RecognitionException {
        try {
            int _type = RULE_BREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:740:12: ( 'break' )
            // InternalMyDsl.g:740:14: 'break'
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BREAK"

    // $ANTLR start "RULE_CASE"
    public final void mRULE_CASE() throws RecognitionException {
        try {
            int _type = RULE_CASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:742:11: ( 'case' )
            // InternalMyDsl.g:742:13: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CASE"

    // $ANTLR start "RULE_CHAR"
    public final void mRULE_CHAR() throws RecognitionException {
        try {
            int _type = RULE_CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:744:11: ( 'char' )
            // InternalMyDsl.g:744:13: 'char'
            {
            match("char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CHAR"

    // $ANTLR start "RULE_CONST"
    public final void mRULE_CONST() throws RecognitionException {
        try {
            int _type = RULE_CONST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:746:12: ( 'const' )
            // InternalMyDsl.g:746:14: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CONST"

    // $ANTLR start "RULE_CONTINUE"
    public final void mRULE_CONTINUE() throws RecognitionException {
        try {
            int _type = RULE_CONTINUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:748:15: ( 'continue' )
            // InternalMyDsl.g:748:17: 'continue'
            {
            match("continue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CONTINUE"

    // $ANTLR start "RULE_DEFAULT"
    public final void mRULE_DEFAULT() throws RecognitionException {
        try {
            int _type = RULE_DEFAULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:750:14: ( 'default' )
            // InternalMyDsl.g:750:16: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DEFAULT"

    // $ANTLR start "RULE_DO"
    public final void mRULE_DO() throws RecognitionException {
        try {
            int _type = RULE_DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:752:9: ( 'do' )
            // InternalMyDsl.g:752:11: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DO"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:754:13: ( 'double' )
            // InternalMyDsl.g:754:15: 'double'
            {
            match("double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_ELSE"
    public final void mRULE_ELSE() throws RecognitionException {
        try {
            int _type = RULE_ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:756:11: ( 'else' )
            // InternalMyDsl.g:756:13: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ELSE"

    // $ANTLR start "RULE_ENUM"
    public final void mRULE_ENUM() throws RecognitionException {
        try {
            int _type = RULE_ENUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:758:11: ( 'enum' )
            // InternalMyDsl.g:758:13: 'enum'
            {
            match("enum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ENUM"

    // $ANTLR start "RULE_EXTERN"
    public final void mRULE_EXTERN() throws RecognitionException {
        try {
            int _type = RULE_EXTERN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:760:13: ( 'extern' )
            // InternalMyDsl.g:760:15: 'extern'
            {
            match("extern"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXTERN"

    // $ANTLR start "RULE_FLOAT"
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:762:12: ( 'float' )
            // InternalMyDsl.g:762:14: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOAT"

    // $ANTLR start "RULE_FOR"
    public final void mRULE_FOR() throws RecognitionException {
        try {
            int _type = RULE_FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:764:10: ( 'for' )
            // InternalMyDsl.g:764:12: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FOR"

    // $ANTLR start "RULE_GOTO"
    public final void mRULE_GOTO() throws RecognitionException {
        try {
            int _type = RULE_GOTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:766:11: ( 'goto' )
            // InternalMyDsl.g:766:13: 'goto'
            {
            match("goto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GOTO"

    // $ANTLR start "RULE_IF"
    public final void mRULE_IF() throws RecognitionException {
        try {
            int _type = RULE_IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:768:9: ( 'if' )
            // InternalMyDsl.g:768:11: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IF"

    // $ANTLR start "RULE_INLINE"
    public final void mRULE_INLINE() throws RecognitionException {
        try {
            int _type = RULE_INLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:770:13: ( 'inline' )
            // InternalMyDsl.g:770:15: 'inline'
            {
            match("inline"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INLINE"

    // $ANTLR start "RULE_INTZ"
    public final void mRULE_INTZ() throws RecognitionException {
        try {
            int _type = RULE_INTZ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:772:11: ( 'int' )
            // InternalMyDsl.g:772:13: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTZ"

    // $ANTLR start "RULE_LONG"
    public final void mRULE_LONG() throws RecognitionException {
        try {
            int _type = RULE_LONG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:774:11: ( 'long' )
            // InternalMyDsl.g:774:13: 'long'
            {
            match("long"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LONG"

    // $ANTLR start "RULE_REGISTER"
    public final void mRULE_REGISTER() throws RecognitionException {
        try {
            int _type = RULE_REGISTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:776:15: ( 'register' )
            // InternalMyDsl.g:776:17: 'register'
            {
            match("register"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REGISTER"

    // $ANTLR start "RULE_RESTRICT"
    public final void mRULE_RESTRICT() throws RecognitionException {
        try {
            int _type = RULE_RESTRICT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:778:15: ( 'restrict' )
            // InternalMyDsl.g:778:17: 'restrict'
            {
            match("restrict"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RESTRICT"

    // $ANTLR start "RULE_RETURN"
    public final void mRULE_RETURN() throws RecognitionException {
        try {
            int _type = RULE_RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:780:13: ( 'return' )
            // InternalMyDsl.g:780:15: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RETURN"

    // $ANTLR start "RULE_SHORT"
    public final void mRULE_SHORT() throws RecognitionException {
        try {
            int _type = RULE_SHORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:782:12: ( 'short' )
            // InternalMyDsl.g:782:14: 'short'
            {
            match("short"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SHORT"

    // $ANTLR start "RULE_SIGNED"
    public final void mRULE_SIGNED() throws RecognitionException {
        try {
            int _type = RULE_SIGNED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:784:13: ( 'signed' )
            // InternalMyDsl.g:784:15: 'signed'
            {
            match("signed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SIGNED"

    // $ANTLR start "RULE_SIZEOF"
    public final void mRULE_SIZEOF() throws RecognitionException {
        try {
            int _type = RULE_SIZEOF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:786:13: ( 'sizeof' )
            // InternalMyDsl.g:786:15: 'sizeof'
            {
            match("sizeof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SIZEOF"

    // $ANTLR start "RULE_STATIC"
    public final void mRULE_STATIC() throws RecognitionException {
        try {
            int _type = RULE_STATIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:788:13: ( 'static' )
            // InternalMyDsl.g:788:15: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STATIC"

    // $ANTLR start "RULE_STRUCT"
    public final void mRULE_STRUCT() throws RecognitionException {
        try {
            int _type = RULE_STRUCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:790:13: ( 'struct' )
            // InternalMyDsl.g:790:15: 'struct'
            {
            match("struct"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRUCT"

    // $ANTLR start "RULE_SWITCH"
    public final void mRULE_SWITCH() throws RecognitionException {
        try {
            int _type = RULE_SWITCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:792:13: ( 'switch' )
            // InternalMyDsl.g:792:15: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SWITCH"

    // $ANTLR start "RULE_TYPEDEF"
    public final void mRULE_TYPEDEF() throws RecognitionException {
        try {
            int _type = RULE_TYPEDEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:794:14: ( 'typedef' )
            // InternalMyDsl.g:794:16: 'typedef'
            {
            match("typedef"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TYPEDEF"

    // $ANTLR start "RULE_UNION"
    public final void mRULE_UNION() throws RecognitionException {
        try {
            int _type = RULE_UNION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:796:12: ( 'union' )
            // InternalMyDsl.g:796:14: 'union'
            {
            match("union"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNION"

    // $ANTLR start "RULE_UNSIGNED"
    public final void mRULE_UNSIGNED() throws RecognitionException {
        try {
            int _type = RULE_UNSIGNED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:798:15: ( 'unsigned' )
            // InternalMyDsl.g:798:17: 'unsigned'
            {
            match("unsigned"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNSIGNED"

    // $ANTLR start "RULE_VOID"
    public final void mRULE_VOID() throws RecognitionException {
        try {
            int _type = RULE_VOID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:800:11: ( 'void' )
            // InternalMyDsl.g:800:13: 'void'
            {
            match("void"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VOID"

    // $ANTLR start "RULE_VOLATILE"
    public final void mRULE_VOLATILE() throws RecognitionException {
        try {
            int _type = RULE_VOLATILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:802:15: ( 'volatile' )
            // InternalMyDsl.g:802:17: 'volatile'
            {
            match("volatile"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VOLATILE"

    // $ANTLR start "RULE_WHILE"
    public final void mRULE_WHILE() throws RecognitionException {
        try {
            int _type = RULE_WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:804:12: ( 'while' )
            // InternalMyDsl.g:804:14: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WHILE"

    // $ANTLR start "RULE_ALIGNAS"
    public final void mRULE_ALIGNAS() throws RecognitionException {
        try {
            int _type = RULE_ALIGNAS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:806:14: ( '_Alignas' )
            // InternalMyDsl.g:806:16: '_Alignas'
            {
            match("_Alignas"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ALIGNAS"

    // $ANTLR start "RULE_ALIGNOF"
    public final void mRULE_ALIGNOF() throws RecognitionException {
        try {
            int _type = RULE_ALIGNOF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:808:14: ( '_Alignof' )
            // InternalMyDsl.g:808:16: '_Alignof'
            {
            match("_Alignof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ALIGNOF"

    // $ANTLR start "RULE_ATOMIC"
    public final void mRULE_ATOMIC() throws RecognitionException {
        try {
            int _type = RULE_ATOMIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:810:13: ( '_Atomic' )
            // InternalMyDsl.g:810:15: '_Atomic'
            {
            match("_Atomic"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ATOMIC"

    // $ANTLR start "RULE_BOOL"
    public final void mRULE_BOOL() throws RecognitionException {
        try {
            int _type = RULE_BOOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:812:11: ( '_Bool' )
            // InternalMyDsl.g:812:13: '_Bool'
            {
            match("_Bool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOL"

    // $ANTLR start "RULE_COMPLEX"
    public final void mRULE_COMPLEX() throws RecognitionException {
        try {
            int _type = RULE_COMPLEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:814:14: ( '_Complex' )
            // InternalMyDsl.g:814:16: '_Complex'
            {
            match("_Complex"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMPLEX"

    // $ANTLR start "RULE_GENERIC"
    public final void mRULE_GENERIC() throws RecognitionException {
        try {
            int _type = RULE_GENERIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:816:14: ( '_Generic' )
            // InternalMyDsl.g:816:16: '_Generic'
            {
            match("_Generic"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GENERIC"

    // $ANTLR start "RULE_IMAGINARY"
    public final void mRULE_IMAGINARY() throws RecognitionException {
        try {
            int _type = RULE_IMAGINARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:818:16: ( '_Imaginary' )
            // InternalMyDsl.g:818:18: '_Imaginary'
            {
            match("_Imaginary"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IMAGINARY"

    // $ANTLR start "RULE_NORETURN"
    public final void mRULE_NORETURN() throws RecognitionException {
        try {
            int _type = RULE_NORETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:820:15: ( '_Noreturn' )
            // InternalMyDsl.g:820:17: '_Noreturn'
            {
            match("_Noreturn"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NORETURN"

    // $ANTLR start "RULE_STATIC_ASSERT"
    public final void mRULE_STATIC_ASSERT() throws RecognitionException {
        try {
            int _type = RULE_STATIC_ASSERT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:822:20: ( '_Static_assert' )
            // InternalMyDsl.g:822:22: '_Static_assert'
            {
            match("_Static_assert"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STATIC_ASSERT"

    // $ANTLR start "RULE_THREAD_LOCAL"
    public final void mRULE_THREAD_LOCAL() throws RecognitionException {
        try {
            int _type = RULE_THREAD_LOCAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:824:19: ( '_Thread_local' )
            // InternalMyDsl.g:824:21: '_Thread_local'
            {
            match("_Thread_local"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_THREAD_LOCAL"

    // $ANTLR start "RULE_FUNC_NAME"
    public final void mRULE_FUNC_NAME() throws RecognitionException {
        try {
            int _type = RULE_FUNC_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:826:16: ( '__func__' )
            // InternalMyDsl.g:826:18: '__func__'
            {
            match("__func__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FUNC_NAME"

    // $ANTLR start "RULE_I_CONSTANT"
    public final void mRULE_I_CONSTANT() throws RecognitionException {
        try {
            int _type = RULE_I_CONSTANT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:828:17: ( ( RULE_HP RULE_H '+' ( RULE_IS )? | RULE_NZ RULE_D '*' ( RULE_IS )? | '0' RULE_O '*' ( RULE_IS )? | ( RULE_CP )? '\\'' ( ( '^' | '\\'' | '\\\\' | '\\n' ) | RULE_ES )+ '\\'' ) )
            // InternalMyDsl.g:828:19: ( RULE_HP RULE_H '+' ( RULE_IS )? | RULE_NZ RULE_D '*' ( RULE_IS )? | '0' RULE_O '*' ( RULE_IS )? | ( RULE_CP )? '\\'' ( ( '^' | '\\'' | '\\\\' | '\\n' ) | RULE_ES )+ '\\'' )
            {
            // InternalMyDsl.g:828:19: ( RULE_HP RULE_H '+' ( RULE_IS )? | RULE_NZ RULE_D '*' ( RULE_IS )? | '0' RULE_O '*' ( RULE_IS )? | ( RULE_CP )? '\\'' ( ( '^' | '\\'' | '\\\\' | '\\n' ) | RULE_ES )+ '\\'' )
            int alt16=4;
            switch ( input.LA(1) ) {
            case '0':
                {
                int LA16_1 = input.LA(2);

                if ( (LA16_1=='X'||LA16_1=='x') ) {
                    alt16=1;
                }
                else if ( ((LA16_1>='0' && LA16_1<='7')) ) {
                    alt16=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
                }
                break;
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
                alt16=2;
                }
                break;
            case '\'':
            case 'L':
            case 'U':
            case 'u':
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:828:20: RULE_HP RULE_H '+' ( RULE_IS )?
                    {
                    mRULE_HP(); 
                    mRULE_H(); 
                    match('+'); 
                    // InternalMyDsl.g:828:39: ( RULE_IS )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='L'||LA11_0=='U'||LA11_0=='l'||LA11_0=='u') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalMyDsl.g:828:39: RULE_IS
                            {
                            mRULE_IS(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:828:48: RULE_NZ RULE_D '*' ( RULE_IS )?
                    {
                    mRULE_NZ(); 
                    mRULE_D(); 
                    match('*'); 
                    // InternalMyDsl.g:828:67: ( RULE_IS )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='L'||LA12_0=='U'||LA12_0=='l'||LA12_0=='u') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalMyDsl.g:828:67: RULE_IS
                            {
                            mRULE_IS(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:828:76: '0' RULE_O '*' ( RULE_IS )?
                    {
                    match('0'); 
                    mRULE_O(); 
                    match('*'); 
                    // InternalMyDsl.g:828:91: ( RULE_IS )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='L'||LA13_0=='U'||LA13_0=='l'||LA13_0=='u') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalMyDsl.g:828:91: RULE_IS
                            {
                            mRULE_IS(); 

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:828:100: ( RULE_CP )? '\\'' ( ( '^' | '\\'' | '\\\\' | '\\n' ) | RULE_ES )+ '\\''
                    {
                    // InternalMyDsl.g:828:100: ( RULE_CP )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='L'||LA14_0=='U'||LA14_0=='u') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalMyDsl.g:828:100: RULE_CP
                            {
                            mRULE_CP(); 

                            }
                            break;

                    }

                    match('\''); 
                    // InternalMyDsl.g:828:114: ( ( '^' | '\\'' | '\\\\' | '\\n' ) | RULE_ES )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=3;
                        switch ( input.LA(1) ) {
                        case '\'':
                            {
                            int LA15_1 = input.LA(2);

                            if ( (LA15_1=='\n'||LA15_1=='\''||LA15_1=='0'||(LA15_1>='A' && LA15_1<='Z')||LA15_1=='\\'||(LA15_1>='^' && LA15_1<='_')||(LA15_1>='a' && LA15_1<='z')) ) {
                                alt15=1;
                            }


                            }
                            break;
                        case '\n':
                        case '\\':
                        case '^':
                            {
                            alt15=1;
                            }
                            break;
                        case '0':
                        case 'A':
                        case 'B':
                        case 'C':
                        case 'D':
                        case 'E':
                        case 'F':
                        case 'G':
                        case 'H':
                        case 'I':
                        case 'J':
                        case 'K':
                        case 'L':
                        case 'M':
                        case 'N':
                        case 'O':
                        case 'P':
                        case 'Q':
                        case 'R':
                        case 'S':
                        case 'T':
                        case 'U':
                        case 'V':
                        case 'W':
                        case 'X':
                        case 'Y':
                        case 'Z':
                        case '_':
                        case 'a':
                        case 'b':
                        case 'c':
                        case 'd':
                        case 'e':
                        case 'f':
                        case 'g':
                        case 'h':
                        case 'i':
                        case 'j':
                        case 'k':
                        case 'l':
                        case 'm':
                        case 'n':
                        case 'o':
                        case 'p':
                        case 'q':
                        case 'r':
                        case 's':
                        case 't':
                        case 'u':
                        case 'v':
                        case 'w':
                        case 'x':
                        case 'y':
                        case 'z':
                            {
                            alt15=2;
                            }
                            break;

                        }

                        switch (alt15) {
                    	case 1 :
                    	    // InternalMyDsl.g:828:115: ( '^' | '\\'' | '\\\\' | '\\n' )
                    	    {
                    	    if ( input.LA(1)=='\n'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='^' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:828:136: RULE_ES
                    	    {
                    	    mRULE_ES(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_I_CONSTANT"

    // $ANTLR start "RULE_F_CONSTANT"
    public final void mRULE_F_CONSTANT() throws RecognitionException {
        try {
            int _type = RULE_F_CONSTANT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:830:17: ( ( RULE_D '+' RULE_E ( RULE_FS )? | RULE_D '*' '.' RULE_D '+' ( RULE_E )? ( RULE_FS )? | RULE_D '+' '.' ( RULE_E )? ( RULE_FS )? | RULE_HP RULE_H '+' RULE_P ( RULE_FS )? RULE_HP RULE_H '*' '.' RULE_H '+' RULE_P ( RULE_FS )? | RULE_HP RULE_H '+' '.' RULE_P ( RULE_FS )? ) )
            // InternalMyDsl.g:830:19: ( RULE_D '+' RULE_E ( RULE_FS )? | RULE_D '*' '.' RULE_D '+' ( RULE_E )? ( RULE_FS )? | RULE_D '+' '.' ( RULE_E )? ( RULE_FS )? | RULE_HP RULE_H '+' RULE_P ( RULE_FS )? RULE_HP RULE_H '*' '.' RULE_H '+' RULE_P ( RULE_FS )? | RULE_HP RULE_H '+' '.' RULE_P ( RULE_FS )? )
            {
            // InternalMyDsl.g:830:19: ( RULE_D '+' RULE_E ( RULE_FS )? | RULE_D '*' '.' RULE_D '+' ( RULE_E )? ( RULE_FS )? | RULE_D '+' '.' ( RULE_E )? ( RULE_FS )? | RULE_HP RULE_H '+' RULE_P ( RULE_FS )? RULE_HP RULE_H '*' '.' RULE_H '+' RULE_P ( RULE_FS )? | RULE_HP RULE_H '+' '.' RULE_P ( RULE_FS )? )
            int alt25=5;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:830:20: RULE_D '+' RULE_E ( RULE_FS )?
                    {
                    mRULE_D(); 
                    match('+'); 
                    mRULE_E(); 
                    // InternalMyDsl.g:830:38: ( RULE_FS )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='F'||LA17_0=='L'||LA17_0=='f'||LA17_0=='l') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalMyDsl.g:830:38: RULE_FS
                            {
                            mRULE_FS(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:830:47: RULE_D '*' '.' RULE_D '+' ( RULE_E )? ( RULE_FS )?
                    {
                    mRULE_D(); 
                    match('*'); 
                    match('.'); 
                    mRULE_D(); 
                    match('+'); 
                    // InternalMyDsl.g:830:73: ( RULE_E )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='E'||LA18_0=='e') ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalMyDsl.g:830:73: RULE_E
                            {
                            mRULE_E(); 

                            }
                            break;

                    }

                    // InternalMyDsl.g:830:81: ( RULE_FS )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0=='F'||LA19_0=='L'||LA19_0=='f'||LA19_0=='l') ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalMyDsl.g:830:81: RULE_FS
                            {
                            mRULE_FS(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:830:90: RULE_D '+' '.' ( RULE_E )? ( RULE_FS )?
                    {
                    mRULE_D(); 
                    match('+'); 
                    match('.'); 
                    // InternalMyDsl.g:830:105: ( RULE_E )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0=='E'||LA20_0=='e') ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalMyDsl.g:830:105: RULE_E
                            {
                            mRULE_E(); 

                            }
                            break;

                    }

                    // InternalMyDsl.g:830:113: ( RULE_FS )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0=='F'||LA21_0=='L'||LA21_0=='f'||LA21_0=='l') ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalMyDsl.g:830:113: RULE_FS
                            {
                            mRULE_FS(); 

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:830:122: RULE_HP RULE_H '+' RULE_P ( RULE_FS )? RULE_HP RULE_H '*' '.' RULE_H '+' RULE_P ( RULE_FS )?
                    {
                    mRULE_HP(); 
                    mRULE_H(); 
                    match('+'); 
                    mRULE_P(); 
                    // InternalMyDsl.g:830:148: ( RULE_FS )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0=='F'||LA22_0=='L'||LA22_0=='f'||LA22_0=='l') ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalMyDsl.g:830:148: RULE_FS
                            {
                            mRULE_FS(); 

                            }
                            break;

                    }

                    mRULE_HP(); 
                    mRULE_H(); 
                    match('*'); 
                    match('.'); 
                    mRULE_H(); 
                    match('+'); 
                    mRULE_P(); 
                    // InternalMyDsl.g:830:198: ( RULE_FS )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0=='F'||LA23_0=='L'||LA23_0=='f'||LA23_0=='l') ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalMyDsl.g:830:198: RULE_FS
                            {
                            mRULE_FS(); 

                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:830:207: RULE_HP RULE_H '+' '.' RULE_P ( RULE_FS )?
                    {
                    mRULE_HP(); 
                    mRULE_H(); 
                    match('+'); 
                    match('.'); 
                    mRULE_P(); 
                    // InternalMyDsl.g:830:237: ( RULE_FS )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0=='F'||LA24_0=='L'||LA24_0=='f'||LA24_0=='l') ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalMyDsl.g:830:237: RULE_FS
                            {
                            mRULE_FS(); 

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_F_CONSTANT"

    // $ANTLR start "RULE_STRING_LITERAL"
    public final void mRULE_STRING_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:832:21: ( ( ( RULE_SP )? '\"' ( ( '^' | '\\'' | '\\\\' | '\\n' ) | RULE_ES )* '\"' ( RULE_WS )* )+ )
            // InternalMyDsl.g:832:23: ( ( RULE_SP )? '\"' ( ( '^' | '\\'' | '\\\\' | '\\n' ) | RULE_ES )* '\"' ( RULE_WS )* )+
            {
            // InternalMyDsl.g:832:23: ( ( RULE_SP )? '\"' ( ( '^' | '\\'' | '\\\\' | '\\n' ) | RULE_ES )* '\"' ( RULE_WS )* )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0=='\"'||LA29_0=='L'||LA29_0=='U'||LA29_0=='u') ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalMyDsl.g:832:24: ( RULE_SP )? '\"' ( ( '^' | '\\'' | '\\\\' | '\\n' ) | RULE_ES )* '\"' ( RULE_WS )*
            	    {
            	    // InternalMyDsl.g:832:24: ( RULE_SP )?
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0=='L'||LA26_0=='U'||LA26_0=='u') ) {
            	        alt26=1;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // InternalMyDsl.g:832:24: RULE_SP
            	            {
            	            mRULE_SP(); 

            	            }
            	            break;

            	    }

            	    match('\"'); 
            	    // InternalMyDsl.g:832:37: ( ( '^' | '\\'' | '\\\\' | '\\n' ) | RULE_ES )*
            	    loop27:
            	    do {
            	        int alt27=3;
            	        int LA27_0 = input.LA(1);

            	        if ( (LA27_0=='\n'||LA27_0=='\''||LA27_0=='\\'||LA27_0=='^') ) {
            	            alt27=1;
            	        }
            	        else if ( (LA27_0=='0'||(LA27_0>='A' && LA27_0<='Z')||LA27_0=='_'||(LA27_0>='a' && LA27_0<='z')) ) {
            	            alt27=2;
            	        }


            	        switch (alt27) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:832:38: ( '^' | '\\'' | '\\\\' | '\\n' )
            	    	    {
            	    	    if ( input.LA(1)=='\n'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='^' ) {
            	    	        input.consume();

            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;}


            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // InternalMyDsl.g:832:59: RULE_ES
            	    	    {
            	    	    mRULE_ES(); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop27;
            	        }
            	    } while (true);

            	    match('\"'); 
            	    // InternalMyDsl.g:832:73: ( RULE_WS )*
            	    loop28:
            	    do {
            	        int alt28=2;
            	        int LA28_0 = input.LA(1);

            	        if ( ((LA28_0>='\t' && LA28_0<='\n')||(LA28_0>='\f' && LA28_0<='\r')||LA28_0==' ') ) {
            	            alt28=1;
            	        }


            	        switch (alt28) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:832:73: RULE_WS
            	    	    {
            	    	    mRULE_WS(); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop28;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING_LITERAL"

    // $ANTLR start "RULE_ELLIPSIS"
    public final void mRULE_ELLIPSIS() throws RecognitionException {
        try {
            int _type = RULE_ELLIPSIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:834:15: ( '...' )
            // InternalMyDsl.g:834:17: '...'
            {
            match("..."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ELLIPSIS"

    // $ANTLR start "RULE_RIGHT_ASSIGN"
    public final void mRULE_RIGHT_ASSIGN() throws RecognitionException {
        try {
            int _type = RULE_RIGHT_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:836:19: ( '>>=' )
            // InternalMyDsl.g:836:21: '>>='
            {
            match(">>="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RIGHT_ASSIGN"

    // $ANTLR start "RULE_LEFT_ASSIGN"
    public final void mRULE_LEFT_ASSIGN() throws RecognitionException {
        try {
            int _type = RULE_LEFT_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:838:18: ( '<<=' )
            // InternalMyDsl.g:838:20: '<<='
            {
            match("<<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LEFT_ASSIGN"

    // $ANTLR start "RULE_ADD_ASSIGN"
    public final void mRULE_ADD_ASSIGN() throws RecognitionException {
        try {
            int _type = RULE_ADD_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:840:17: ( '+=' )
            // InternalMyDsl.g:840:19: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ADD_ASSIGN"

    // $ANTLR start "RULE_SUB_ASSIGN"
    public final void mRULE_SUB_ASSIGN() throws RecognitionException {
        try {
            int _type = RULE_SUB_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:842:17: ( '-=' )
            // InternalMyDsl.g:842:19: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SUB_ASSIGN"

    // $ANTLR start "RULE_MUL_ASSIGN"
    public final void mRULE_MUL_ASSIGN() throws RecognitionException {
        try {
            int _type = RULE_MUL_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:844:17: ( '*=' )
            // InternalMyDsl.g:844:19: '*='
            {
            match("*="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MUL_ASSIGN"

    // $ANTLR start "RULE_DIV_ASSIGN"
    public final void mRULE_DIV_ASSIGN() throws RecognitionException {
        try {
            int _type = RULE_DIV_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:846:17: ( '/=' )
            // InternalMyDsl.g:846:19: '/='
            {
            match("/="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIV_ASSIGN"

    // $ANTLR start "RULE_MOD_ASSIGN"
    public final void mRULE_MOD_ASSIGN() throws RecognitionException {
        try {
            int _type = RULE_MOD_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:848:17: ( '%=' )
            // InternalMyDsl.g:848:19: '%='
            {
            match("%="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MOD_ASSIGN"

    // $ANTLR start "RULE_AND_ASSIGN"
    public final void mRULE_AND_ASSIGN() throws RecognitionException {
        try {
            int _type = RULE_AND_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:850:17: ( '&=' )
            // InternalMyDsl.g:850:19: '&='
            {
            match("&="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AND_ASSIGN"

    // $ANTLR start "RULE_XOR_ASSIGN"
    public final void mRULE_XOR_ASSIGN() throws RecognitionException {
        try {
            int _type = RULE_XOR_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:852:17: ( '^=' )
            // InternalMyDsl.g:852:19: '^='
            {
            match("^="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_XOR_ASSIGN"

    // $ANTLR start "RULE_OR_ASSIGN"
    public final void mRULE_OR_ASSIGN() throws RecognitionException {
        try {
            int _type = RULE_OR_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:854:16: ( '|=' )
            // InternalMyDsl.g:854:18: '|='
            {
            match("|="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OR_ASSIGN"

    // $ANTLR start "RULE_RIGHT_OP"
    public final void mRULE_RIGHT_OP() throws RecognitionException {
        try {
            int _type = RULE_RIGHT_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:856:15: ( '>>' )
            // InternalMyDsl.g:856:17: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RIGHT_OP"

    // $ANTLR start "RULE_LEFT_OP"
    public final void mRULE_LEFT_OP() throws RecognitionException {
        try {
            int _type = RULE_LEFT_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:858:14: ( '<<' )
            // InternalMyDsl.g:858:16: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LEFT_OP"

    // $ANTLR start "RULE_INC_OP"
    public final void mRULE_INC_OP() throws RecognitionException {
        try {
            int _type = RULE_INC_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:860:13: ( '++' )
            // InternalMyDsl.g:860:15: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INC_OP"

    // $ANTLR start "RULE_DEC_OP"
    public final void mRULE_DEC_OP() throws RecognitionException {
        try {
            int _type = RULE_DEC_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:862:13: ( '--' )
            // InternalMyDsl.g:862:15: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DEC_OP"

    // $ANTLR start "RULE_PTR_OP"
    public final void mRULE_PTR_OP() throws RecognitionException {
        try {
            int _type = RULE_PTR_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:864:13: ( '->' )
            // InternalMyDsl.g:864:15: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PTR_OP"

    // $ANTLR start "RULE_AND_OP"
    public final void mRULE_AND_OP() throws RecognitionException {
        try {
            int _type = RULE_AND_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:866:13: ( '&&' )
            // InternalMyDsl.g:866:15: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AND_OP"

    // $ANTLR start "RULE_OR_OP"
    public final void mRULE_OR_OP() throws RecognitionException {
        try {
            int _type = RULE_OR_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:868:12: ( '||' )
            // InternalMyDsl.g:868:14: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OR_OP"

    // $ANTLR start "RULE_LE_OP"
    public final void mRULE_LE_OP() throws RecognitionException {
        try {
            int _type = RULE_LE_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:870:12: ( '<=' )
            // InternalMyDsl.g:870:14: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LE_OP"

    // $ANTLR start "RULE_GE_OP"
    public final void mRULE_GE_OP() throws RecognitionException {
        try {
            int _type = RULE_GE_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:872:12: ( '>=' )
            // InternalMyDsl.g:872:14: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GE_OP"

    // $ANTLR start "RULE_EQ_OP"
    public final void mRULE_EQ_OP() throws RecognitionException {
        try {
            int _type = RULE_EQ_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:874:12: ( '==' )
            // InternalMyDsl.g:874:14: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EQ_OP"

    // $ANTLR start "RULE_NE_OP"
    public final void mRULE_NE_OP() throws RecognitionException {
        try {
            int _type = RULE_NE_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:876:12: ( '!=' )
            // InternalMyDsl.g:876:14: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NE_OP"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:878:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMyDsl.g:878:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMyDsl.g:878:11: ( '^' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0=='^') ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:878:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyDsl.g:878:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>='0' && LA31_0<='9')||(LA31_0>='A' && LA31_0<='Z')||LA31_0=='_'||(LA31_0>='a' && LA31_0<='z')) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:880:10: ( ( '0' .. '9' )+ )
            // InternalMyDsl.g:880:12: ( '0' .. '9' )+
            {
            // InternalMyDsl.g:880:12: ( '0' .. '9' )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>='0' && LA32_0<='9')) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalMyDsl.g:880:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:882:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMyDsl.g:882:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMyDsl.g:882:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0=='\"') ) {
                alt35=1;
            }
            else if ( (LA35_0=='\'') ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyDsl.g:882:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMyDsl.g:882:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop33:
                    do {
                        int alt33=3;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0=='\\') ) {
                            alt33=1;
                        }
                        else if ( ((LA33_0>='\u0000' && LA33_0<='!')||(LA33_0>='#' && LA33_0<='[')||(LA33_0>=']' && LA33_0<='\uFFFF')) ) {
                            alt33=2;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalMyDsl.g:882:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:882:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:882:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMyDsl.g:882:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop34:
                    do {
                        int alt34=3;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0=='\\') ) {
                            alt34=1;
                        }
                        else if ( ((LA34_0>='\u0000' && LA34_0<='&')||(LA34_0>='(' && LA34_0<='[')||(LA34_0>=']' && LA34_0<='\uFFFF')) ) {
                            alt34=2;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalMyDsl.g:882:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:882:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:884:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMyDsl.g:884:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMyDsl.g:884:24: ( options {greedy=false; } : . )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0=='*') ) {
                    int LA36_1 = input.LA(2);

                    if ( (LA36_1=='/') ) {
                        alt36=2;
                    }
                    else if ( ((LA36_1>='\u0000' && LA36_1<='.')||(LA36_1>='0' && LA36_1<='\uFFFF')) ) {
                        alt36=1;
                    }


                }
                else if ( ((LA36_0>='\u0000' && LA36_0<=')')||(LA36_0>='+' && LA36_0<='\uFFFF')) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalMyDsl.g:884:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:886:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyDsl.g:886:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMyDsl.g:886:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>='\u0000' && LA37_0<='\t')||(LA37_0>='\u000B' && LA37_0<='\f')||(LA37_0>='\u000E' && LA37_0<='\uFFFF')) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalMyDsl.g:886:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            // InternalMyDsl.g:886:40: ( ( '\\r' )? '\\n' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0=='\n'||LA39_0=='\r') ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMyDsl.g:886:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyDsl.g:886:41: ( '\\r' )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0=='\r') ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalMyDsl.g:886:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:888:16: ( . )
            // InternalMyDsl.g:888:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalMyDsl.g:1:8: ( T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | RULE_L | RULE_WS | RULE_AUTO | RULE_BREAK | RULE_CASE | RULE_CHAR | RULE_CONST | RULE_CONTINUE | RULE_DEFAULT | RULE_DO | RULE_DOUBLE | RULE_ELSE | RULE_ENUM | RULE_EXTERN | RULE_FLOAT | RULE_FOR | RULE_GOTO | RULE_IF | RULE_INLINE | RULE_INTZ | RULE_LONG | RULE_REGISTER | RULE_RESTRICT | RULE_RETURN | RULE_SHORT | RULE_SIGNED | RULE_SIZEOF | RULE_STATIC | RULE_STRUCT | RULE_SWITCH | RULE_TYPEDEF | RULE_UNION | RULE_UNSIGNED | RULE_VOID | RULE_VOLATILE | RULE_WHILE | RULE_ALIGNAS | RULE_ALIGNOF | RULE_ATOMIC | RULE_BOOL | RULE_COMPLEX | RULE_GENERIC | RULE_IMAGINARY | RULE_NORETURN | RULE_STATIC_ASSERT | RULE_THREAD_LOCAL | RULE_FUNC_NAME | RULE_I_CONSTANT | RULE_F_CONSTANT | RULE_STRING_LITERAL | RULE_ELLIPSIS | RULE_RIGHT_ASSIGN | RULE_LEFT_ASSIGN | RULE_ADD_ASSIGN | RULE_SUB_ASSIGN | RULE_MUL_ASSIGN | RULE_DIV_ASSIGN | RULE_MOD_ASSIGN | RULE_AND_ASSIGN | RULE_XOR_ASSIGN | RULE_OR_ASSIGN | RULE_RIGHT_OP | RULE_LEFT_OP | RULE_INC_OP | RULE_DEC_OP | RULE_PTR_OP | RULE_AND_OP | RULE_OR_OP | RULE_LE_OP | RULE_GE_OP | RULE_EQ_OP | RULE_NE_OP | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_ANY_OTHER )
        int alt40=85;
        alt40 = dfa40.predict(input);
        switch (alt40) {
            case 1 :
                // InternalMyDsl.g:1:10: T__95
                {
                mT__95(); 

                }
                break;
            case 2 :
                // InternalMyDsl.g:1:16: T__96
                {
                mT__96(); 

                }
                break;
            case 3 :
                // InternalMyDsl.g:1:22: T__97
                {
                mT__97(); 

                }
                break;
            case 4 :
                // InternalMyDsl.g:1:28: T__98
                {
                mT__98(); 

                }
                break;
            case 5 :
                // InternalMyDsl.g:1:34: T__99
                {
                mT__99(); 

                }
                break;
            case 6 :
                // InternalMyDsl.g:1:40: T__100
                {
                mT__100(); 

                }
                break;
            case 7 :
                // InternalMyDsl.g:1:47: T__101
                {
                mT__101(); 

                }
                break;
            case 8 :
                // InternalMyDsl.g:1:54: RULE_L
                {
                mRULE_L(); 

                }
                break;
            case 9 :
                // InternalMyDsl.g:1:61: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 10 :
                // InternalMyDsl.g:1:69: RULE_AUTO
                {
                mRULE_AUTO(); 

                }
                break;
            case 11 :
                // InternalMyDsl.g:1:79: RULE_BREAK
                {
                mRULE_BREAK(); 

                }
                break;
            case 12 :
                // InternalMyDsl.g:1:90: RULE_CASE
                {
                mRULE_CASE(); 

                }
                break;
            case 13 :
                // InternalMyDsl.g:1:100: RULE_CHAR
                {
                mRULE_CHAR(); 

                }
                break;
            case 14 :
                // InternalMyDsl.g:1:110: RULE_CONST
                {
                mRULE_CONST(); 

                }
                break;
            case 15 :
                // InternalMyDsl.g:1:121: RULE_CONTINUE
                {
                mRULE_CONTINUE(); 

                }
                break;
            case 16 :
                // InternalMyDsl.g:1:135: RULE_DEFAULT
                {
                mRULE_DEFAULT(); 

                }
                break;
            case 17 :
                // InternalMyDsl.g:1:148: RULE_DO
                {
                mRULE_DO(); 

                }
                break;
            case 18 :
                // InternalMyDsl.g:1:156: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 19 :
                // InternalMyDsl.g:1:168: RULE_ELSE
                {
                mRULE_ELSE(); 

                }
                break;
            case 20 :
                // InternalMyDsl.g:1:178: RULE_ENUM
                {
                mRULE_ENUM(); 

                }
                break;
            case 21 :
                // InternalMyDsl.g:1:188: RULE_EXTERN
                {
                mRULE_EXTERN(); 

                }
                break;
            case 22 :
                // InternalMyDsl.g:1:200: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 23 :
                // InternalMyDsl.g:1:211: RULE_FOR
                {
                mRULE_FOR(); 

                }
                break;
            case 24 :
                // InternalMyDsl.g:1:220: RULE_GOTO
                {
                mRULE_GOTO(); 

                }
                break;
            case 25 :
                // InternalMyDsl.g:1:230: RULE_IF
                {
                mRULE_IF(); 

                }
                break;
            case 26 :
                // InternalMyDsl.g:1:238: RULE_INLINE
                {
                mRULE_INLINE(); 

                }
                break;
            case 27 :
                // InternalMyDsl.g:1:250: RULE_INTZ
                {
                mRULE_INTZ(); 

                }
                break;
            case 28 :
                // InternalMyDsl.g:1:260: RULE_LONG
                {
                mRULE_LONG(); 

                }
                break;
            case 29 :
                // InternalMyDsl.g:1:270: RULE_REGISTER
                {
                mRULE_REGISTER(); 

                }
                break;
            case 30 :
                // InternalMyDsl.g:1:284: RULE_RESTRICT
                {
                mRULE_RESTRICT(); 

                }
                break;
            case 31 :
                // InternalMyDsl.g:1:298: RULE_RETURN
                {
                mRULE_RETURN(); 

                }
                break;
            case 32 :
                // InternalMyDsl.g:1:310: RULE_SHORT
                {
                mRULE_SHORT(); 

                }
                break;
            case 33 :
                // InternalMyDsl.g:1:321: RULE_SIGNED
                {
                mRULE_SIGNED(); 

                }
                break;
            case 34 :
                // InternalMyDsl.g:1:333: RULE_SIZEOF
                {
                mRULE_SIZEOF(); 

                }
                break;
            case 35 :
                // InternalMyDsl.g:1:345: RULE_STATIC
                {
                mRULE_STATIC(); 

                }
                break;
            case 36 :
                // InternalMyDsl.g:1:357: RULE_STRUCT
                {
                mRULE_STRUCT(); 

                }
                break;
            case 37 :
                // InternalMyDsl.g:1:369: RULE_SWITCH
                {
                mRULE_SWITCH(); 

                }
                break;
            case 38 :
                // InternalMyDsl.g:1:381: RULE_TYPEDEF
                {
                mRULE_TYPEDEF(); 

                }
                break;
            case 39 :
                // InternalMyDsl.g:1:394: RULE_UNION
                {
                mRULE_UNION(); 

                }
                break;
            case 40 :
                // InternalMyDsl.g:1:405: RULE_UNSIGNED
                {
                mRULE_UNSIGNED(); 

                }
                break;
            case 41 :
                // InternalMyDsl.g:1:419: RULE_VOID
                {
                mRULE_VOID(); 

                }
                break;
            case 42 :
                // InternalMyDsl.g:1:429: RULE_VOLATILE
                {
                mRULE_VOLATILE(); 

                }
                break;
            case 43 :
                // InternalMyDsl.g:1:443: RULE_WHILE
                {
                mRULE_WHILE(); 

                }
                break;
            case 44 :
                // InternalMyDsl.g:1:454: RULE_ALIGNAS
                {
                mRULE_ALIGNAS(); 

                }
                break;
            case 45 :
                // InternalMyDsl.g:1:467: RULE_ALIGNOF
                {
                mRULE_ALIGNOF(); 

                }
                break;
            case 46 :
                // InternalMyDsl.g:1:480: RULE_ATOMIC
                {
                mRULE_ATOMIC(); 

                }
                break;
            case 47 :
                // InternalMyDsl.g:1:492: RULE_BOOL
                {
                mRULE_BOOL(); 

                }
                break;
            case 48 :
                // InternalMyDsl.g:1:502: RULE_COMPLEX
                {
                mRULE_COMPLEX(); 

                }
                break;
            case 49 :
                // InternalMyDsl.g:1:515: RULE_GENERIC
                {
                mRULE_GENERIC(); 

                }
                break;
            case 50 :
                // InternalMyDsl.g:1:528: RULE_IMAGINARY
                {
                mRULE_IMAGINARY(); 

                }
                break;
            case 51 :
                // InternalMyDsl.g:1:543: RULE_NORETURN
                {
                mRULE_NORETURN(); 

                }
                break;
            case 52 :
                // InternalMyDsl.g:1:557: RULE_STATIC_ASSERT
                {
                mRULE_STATIC_ASSERT(); 

                }
                break;
            case 53 :
                // InternalMyDsl.g:1:576: RULE_THREAD_LOCAL
                {
                mRULE_THREAD_LOCAL(); 

                }
                break;
            case 54 :
                // InternalMyDsl.g:1:594: RULE_FUNC_NAME
                {
                mRULE_FUNC_NAME(); 

                }
                break;
            case 55 :
                // InternalMyDsl.g:1:609: RULE_I_CONSTANT
                {
                mRULE_I_CONSTANT(); 

                }
                break;
            case 56 :
                // InternalMyDsl.g:1:625: RULE_F_CONSTANT
                {
                mRULE_F_CONSTANT(); 

                }
                break;
            case 57 :
                // InternalMyDsl.g:1:641: RULE_STRING_LITERAL
                {
                mRULE_STRING_LITERAL(); 

                }
                break;
            case 58 :
                // InternalMyDsl.g:1:661: RULE_ELLIPSIS
                {
                mRULE_ELLIPSIS(); 

                }
                break;
            case 59 :
                // InternalMyDsl.g:1:675: RULE_RIGHT_ASSIGN
                {
                mRULE_RIGHT_ASSIGN(); 

                }
                break;
            case 60 :
                // InternalMyDsl.g:1:693: RULE_LEFT_ASSIGN
                {
                mRULE_LEFT_ASSIGN(); 

                }
                break;
            case 61 :
                // InternalMyDsl.g:1:710: RULE_ADD_ASSIGN
                {
                mRULE_ADD_ASSIGN(); 

                }
                break;
            case 62 :
                // InternalMyDsl.g:1:726: RULE_SUB_ASSIGN
                {
                mRULE_SUB_ASSIGN(); 

                }
                break;
            case 63 :
                // InternalMyDsl.g:1:742: RULE_MUL_ASSIGN
                {
                mRULE_MUL_ASSIGN(); 

                }
                break;
            case 64 :
                // InternalMyDsl.g:1:758: RULE_DIV_ASSIGN
                {
                mRULE_DIV_ASSIGN(); 

                }
                break;
            case 65 :
                // InternalMyDsl.g:1:774: RULE_MOD_ASSIGN
                {
                mRULE_MOD_ASSIGN(); 

                }
                break;
            case 66 :
                // InternalMyDsl.g:1:790: RULE_AND_ASSIGN
                {
                mRULE_AND_ASSIGN(); 

                }
                break;
            case 67 :
                // InternalMyDsl.g:1:806: RULE_XOR_ASSIGN
                {
                mRULE_XOR_ASSIGN(); 

                }
                break;
            case 68 :
                // InternalMyDsl.g:1:822: RULE_OR_ASSIGN
                {
                mRULE_OR_ASSIGN(); 

                }
                break;
            case 69 :
                // InternalMyDsl.g:1:837: RULE_RIGHT_OP
                {
                mRULE_RIGHT_OP(); 

                }
                break;
            case 70 :
                // InternalMyDsl.g:1:851: RULE_LEFT_OP
                {
                mRULE_LEFT_OP(); 

                }
                break;
            case 71 :
                // InternalMyDsl.g:1:864: RULE_INC_OP
                {
                mRULE_INC_OP(); 

                }
                break;
            case 72 :
                // InternalMyDsl.g:1:876: RULE_DEC_OP
                {
                mRULE_DEC_OP(); 

                }
                break;
            case 73 :
                // InternalMyDsl.g:1:888: RULE_PTR_OP
                {
                mRULE_PTR_OP(); 

                }
                break;
            case 74 :
                // InternalMyDsl.g:1:900: RULE_AND_OP
                {
                mRULE_AND_OP(); 

                }
                break;
            case 75 :
                // InternalMyDsl.g:1:912: RULE_OR_OP
                {
                mRULE_OR_OP(); 

                }
                break;
            case 76 :
                // InternalMyDsl.g:1:923: RULE_LE_OP
                {
                mRULE_LE_OP(); 

                }
                break;
            case 77 :
                // InternalMyDsl.g:1:934: RULE_GE_OP
                {
                mRULE_GE_OP(); 

                }
                break;
            case 78 :
                // InternalMyDsl.g:1:945: RULE_EQ_OP
                {
                mRULE_EQ_OP(); 

                }
                break;
            case 79 :
                // InternalMyDsl.g:1:956: RULE_NE_OP
                {
                mRULE_NE_OP(); 

                }
                break;
            case 80 :
                // InternalMyDsl.g:1:967: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 81 :
                // InternalMyDsl.g:1:975: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 82 :
                // InternalMyDsl.g:1:984: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 83 :
                // InternalMyDsl.g:1:996: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 84 :
                // InternalMyDsl.g:1:1012: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 85 :
                // InternalMyDsl.g:1:1028: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA25 dfa25 = new DFA25(this);
    protected DFA40 dfa40 = new DFA40(this);
    static final String DFA25_eotS =
        "\21\uffff";
    static final String DFA25_eofS =
        "\21\uffff";
    static final String DFA25_minS =
        "\1\60\2\52\1\60\1\uffff\1\56\2\53\1\56\2\uffff\2\56\2\uffff\1\71\1\53";
    static final String DFA25_maxS =
        "\1\71\1\170\1\53\1\146\1\uffff\1\145\2\53\1\56\2\uffff\1\160\1\56\2\uffff\1\71\1\53";
    static final String DFA25_acceptS =
        "\4\uffff\1\2\4\uffff\1\3\1\1\2\uffff\1\5\1\4\2\uffff";
    static final String DFA25_specialS =
        "\21\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\1\11\2",
            "\1\4\1\5\54\uffff\1\3\37\uffff\1\3",
            "\1\4\1\5",
            "\1\10\20\uffff\6\7\32\uffff\6\6",
            "",
            "\1\11\26\uffff\1\12\37\uffff\1\12",
            "\1\13",
            "\1\13",
            "\1\14",
            "",
            "",
            "\1\15\41\uffff\1\16\37\uffff\1\16",
            "\1\17",
            "",
            "",
            "\1\20",
            "\1\13"
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "830:19: ( RULE_D '+' RULE_E ( RULE_FS )? | RULE_D '*' '.' RULE_D '+' ( RULE_E )? ( RULE_FS )? | RULE_D '+' '.' ( RULE_E )? ( RULE_FS )? | RULE_HP RULE_H '+' RULE_P ( RULE_FS )? RULE_HP RULE_H '*' '.' RULE_H '+' RULE_P ( RULE_FS )? | RULE_HP RULE_H '+' '.' RULE_P ( RULE_FS )? )";
        }
    }
    static final String DFA40_eotS =
        "\1\uffff\2\56\3\uffff\2\56\1\uffff\16\56\2\131\1\56\1\52\1\56\16\52\1\uffff\2\57\1\u0085\2\uffff\3\57\3\uffff\2\57\1\uffff\7\57\1\u0093\12\57\2\uffff\13\57\2\uffff\1\131\1\uffff\1\131\6\uffff\1\144\11\uffff\1\u00c3\1\uffff\1\u00c5\22\uffff\3\57\1\uffff\13\57\1\u00d5\1\57\1\uffff\1\57\1\u00d8\32\57\3\uffff\1\113\7\uffff\1\114\12\uffff\4\57\1\u0100\1\57\1\u0103\1\u0104\1\u0105\1\57\1\u0107\1\u0108\3\57\1\uffff\1\u010c\1\57\1\uffff\1\u010e\14\57\1\u011b\14\57\1\113\2\uffff\1\114\3\uffff\1\144\1\uffff\4\57\1\uffff\2\57\3\uffff\1\u0132\2\uffff\1\u0133\1\57\1\u0135\1\uffff\1\57\1\uffff\3\57\1\u013a\6\57\1\u0141\1\57\1\uffff\1\57\1\u0144\2\57\1\u0147\7\57\4\uffff\2\57\1\u0152\1\u0153\1\57\1\u0155\2\uffff\1\57\1\uffff\1\u0157\2\57\1\u015a\1\uffff\1\u015b\1\u015c\1\u015d\1\u015e\1\u015f\1\57\1\uffff\2\57\1\uffff\2\57\1\uffff\7\57\1\uffff\1\57\1\u016e\2\uffff\1\u016f\1\uffff\1\57\1\uffff\2\57\6\uffff\1\u0173\4\57\1\u0178\7\57\1\u0180\2\uffff\1\u0181\1\u0182\1\u0183\1\uffff\1\u0184\1\u0185\1\u0186\1\u0187\1\uffff\1\u0188\1\u0189\4\57\1\u018e\12\uffff\1\57\1\u0190\2\57\1\uffff\1\u0193\1\uffff\2\57\1\uffff\5\57\1\u019b\1\u019c\2\uffff";
    static final String DFA40_eofS =
        "\u019d\uffff";
    static final String DFA40_minS =
        "\1\0\2\60\3\uffff\2\60\1\uffff\11\60\1\42\3\60\1\42\2\52\1\60\1\0\1\42\1\0\1\56\1\75\1\74\1\53\1\55\1\75\1\52\1\75\1\46\4\75\1\uffff\1\164\1\146\1\60\2\uffff\2\164\1\163\3\uffff\1\156\1\164\1\uffff\1\145\1\163\1\141\1\156\1\157\1\162\1\164\1\60\1\154\1\156\1\147\1\157\1\147\1\141\1\151\1\160\1\151\1\42\2\uffff\2\151\1\154\2\157\1\145\1\155\1\157\1\164\1\150\1\146\1\60\1\uffff\1\52\1\uffff\1\52\6\0\1\12\1\uffff\5\0\1\uffff\1\0\1\uffff\1\75\1\uffff\1\75\22\uffff\2\141\1\142\1\uffff\1\151\1\155\2\145\1\171\1\157\1\141\1\145\1\162\1\163\1\141\1\60\1\157\1\uffff\1\151\1\60\1\147\1\151\1\164\1\165\1\162\1\156\1\145\1\164\1\165\1\164\1\145\1\157\1\151\1\144\1\141\1\154\1\151\2\157\1\155\1\156\1\141\1\162\1\141\1\162\1\165\2\53\1\56\6\0\1\uffff\10\0\4\uffff\1\164\1\165\1\154\1\164\1\60\1\156\3\60\1\153\2\60\1\164\1\151\1\164\1\uffff\1\60\1\156\1\uffff\1\60\1\163\2\162\1\164\1\145\1\157\1\151\2\143\1\144\1\156\1\147\1\60\1\164\1\145\1\147\1\155\1\154\1\160\1\145\1\147\1\145\1\164\1\145\1\156\2\56\5\0\1\12\1\0\1\171\1\154\1\145\1\171\1\uffff\1\144\1\156\3\uffff\1\60\2\uffff\1\60\1\156\1\60\1\uffff\1\145\1\uffff\1\164\1\151\1\156\1\60\1\144\1\146\1\143\1\164\1\150\1\145\1\60\1\156\1\uffff\1\151\1\60\1\156\1\151\1\60\1\154\1\162\1\151\1\164\1\151\1\141\1\143\1\71\3\0\1\160\1\164\2\60\1\163\1\60\2\uffff\1\165\1\uffff\1\60\1\145\1\143\1\60\1\uffff\5\60\1\146\1\uffff\1\145\1\154\1\uffff\1\141\1\143\1\uffff\1\145\1\151\1\156\1\165\1\143\1\144\1\137\1\53\1\145\1\60\2\uffff\1\60\1\uffff\1\145\1\uffff\1\162\1\164\6\uffff\1\60\1\144\1\145\1\163\1\146\1\60\1\170\1\143\1\141\1\162\3\137\1\60\2\uffff\3\60\1\uffff\4\60\1\uffff\2\60\1\162\1\156\1\141\1\154\1\60\12\uffff\1\171\1\60\1\163\1\157\1\uffff\1\60\1\uffff\1\163\1\143\1\uffff\1\145\1\141\1\162\1\154\1\164\2\60\2\uffff";
    static final String DFA40_maxS =
        "\1\uffff\2\172\3\uffff\2\172\1\uffff\16\172\1\170\1\71\1\172\1\uffff\1\172\1\uffff\1\56\1\76\2\75\1\76\4\75\1\172\1\174\2\75\1\uffff\1\164\1\146\1\172\2\uffff\1\165\1\164\1\163\3\uffff\1\156\1\164\1\uffff\1\145\1\163\1\141\1\156\1\157\1\162\1\164\1\172\1\164\1\156\1\164\1\157\1\172\1\162\1\151\1\160\1\163\1\42\2\uffff\1\154\1\151\1\164\2\157\1\145\1\155\1\157\1\164\1\150\2\146\1\uffff\1\52\1\uffff\1\52\6\uffff\1\172\1\uffff\5\uffff\1\uffff\1\uffff\1\uffff\1\75\1\uffff\1\75\22\uffff\2\141\1\142\1\uffff\1\151\1\155\2\145\1\171\1\157\1\141\1\145\1\162\1\164\1\141\1\172\1\157\1\uffff\1\151\1\172\1\147\1\151\1\164\1\165\1\162\1\156\1\145\1\164\1\165\1\164\1\145\1\157\1\151\1\144\1\141\1\154\1\151\2\157\1\155\1\156\1\141\1\162\1\141\1\162\1\165\2\53\1\56\6\uffff\1\uffff\10\uffff\4\uffff\1\164\1\165\1\154\1\164\1\172\1\162\3\172\1\153\2\172\1\164\1\151\1\164\1\uffff\1\172\1\156\1\uffff\1\172\1\163\2\162\1\164\1\145\1\157\1\151\2\143\1\144\1\156\1\147\1\172\1\164\1\145\1\147\1\155\1\154\1\160\1\145\1\147\1\145\1\164\1\145\1\156\1\160\1\56\5\uffff\1\172\1\uffff\1\171\1\154\1\145\1\171\1\uffff\1\144\1\156\3\uffff\1\172\2\uffff\1\172\1\156\1\172\1\uffff\1\145\1\uffff\1\164\1\151\1\156\1\172\1\144\1\146\1\143\1\164\1\150\1\145\1\172\1\156\1\uffff\1\151\1\172\1\156\1\151\1\172\1\154\1\162\1\151\1\164\1\151\1\141\1\143\1\71\3\uffff\1\160\1\164\2\172\1\163\1\172\2\uffff\1\165\1\uffff\1\172\1\145\1\143\1\172\1\uffff\5\172\1\146\1\uffff\1\145\1\154\1\uffff\1\157\1\143\1\uffff\1\145\1\151\1\156\1\165\1\143\1\144\1\137\1\53\1\145\1\172\2\uffff\1\172\1\uffff\1\145\1\uffff\1\162\1\164\6\uffff\1\172\1\144\1\145\1\163\1\146\1\172\1\170\1\143\1\141\1\162\3\137\1\172\2\uffff\3\172\1\uffff\4\172\1\uffff\2\172\1\162\1\156\1\141\1\154\1\172\12\uffff\1\171\1\172\1\163\1\157\1\uffff\1\172\1\uffff\1\163\1\143\1\uffff\1\145\1\141\1\162\1\154\1\164\2\172\2\uffff";
    static final String DFA40_acceptS =
        "\3\uffff\1\3\1\4\1\6\2\uffff\1\11\41\uffff\1\125\3\uffff\1\10\1\120\3\uffff\1\3\1\4\1\6\2\uffff\1\11\22\uffff\1\67\1\71\14\uffff\1\121\1\uffff\1\70\10\uffff\1\122\5\uffff\1\71\1\uffff\1\72\1\uffff\1\115\1\uffff\1\114\1\75\1\107\1\76\1\110\1\111\1\77\1\100\1\123\1\124\1\101\1\102\1\112\1\103\1\104\1\113\1\116\1\117\3\uffff\1\21\15\uffff\1\31\45\uffff\1\67\10\uffff\1\73\1\105\1\74\1\106\17\uffff\1\27\2\uffff\1\33\47\uffff\1\24\2\uffff\1\23\1\7\1\12\1\uffff\1\14\1\15\3\uffff\1\30\1\uffff\1\34\14\uffff\1\51\26\uffff\1\13\1\16\1\uffff\1\26\4\uffff\1\40\6\uffff\1\47\2\uffff\1\53\2\uffff\1\57\12\uffff\1\22\1\2\1\uffff\1\25\1\uffff\1\32\2\uffff\1\37\1\41\1\42\1\43\1\44\1\45\16\uffff\1\20\1\5\3\uffff\1\46\4\uffff\1\56\7\uffff\1\1\1\17\1\35\1\36\1\50\1\52\1\54\1\55\1\60\1\61\4\uffff\1\66\1\uffff\1\63\2\uffff\1\62\7\uffff\1\65\1\64";
    static final String DFA40_specialS =
        "\1\0\31\uffff\1\26\1\uffff\1\45\100\uffff\1\32\1\41\1\42\1\43\1\7\1\31\2\uffff\1\27\1\22\1\23\1\24\1\3\1\uffff\1\14\107\uffff\1\12\1\30\1\34\1\36\1\40\1\6\1\uffff\1\10\1\15\1\13\1\17\1\20\1\21\1\2\1\4\63\uffff\1\11\1\16\1\1\1\35\1\37\1\uffff\1\5\55\uffff\1\44\1\33\1\25\161\uffff}>";
    static final String[] DFA40_transitionS = {
            "\11\52\2\10\1\52\2\10\22\52\1\10\1\51\1\34\2\52\1\44\1\45\1\32\2\52\1\42\1\40\1\52\1\41\1\35\1\43\1\27\11\30\1\5\1\52\1\37\1\50\1\36\2\52\13\31\1\33\10\31\1\26\5\31\3\52\1\46\1\25\1\52\1\7\1\11\1\12\1\1\1\2\1\13\1\14\1\31\1\15\2\31\1\16\1\6\4\31\1\17\1\20\1\21\1\22\1\23\1\24\3\31\1\3\1\47\1\4\uff82\52",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\53\3\57\1\54\11\57\1\55\13\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\62\1\57\1\60\11\57\1\61\2\57",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\66\31\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\24\57\1\67\5\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\71\10\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\72\6\57\1\73\6\57\1\74\13\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\75\2\57\1\76\13\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\77\13\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\5\57\1\100\7\57\1\101\14\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\102\13\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\103\25\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\7\57\1\104\1\105\12\57\1\106\2\57\1\107\3\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\30\57\1\110\1\57",
            "\1\114\4\uffff\1\113\10\uffff\10\57\1\112\1\57\7\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\111\14\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\115\13\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\7\57\1\116\22\57",
            "\12\57\7\uffff\1\117\1\120\1\121\3\57\1\122\1\57\1\123\4\57\1\124\4\57\1\125\1\126\6\57\4\uffff\1\127\1\uffff\32\57",
            "\1\114\4\uffff\1\113\10\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\2\133\4\uffff\10\132\40\uffff\1\130\37\uffff\1\130",
            "\2\133\4\uffff\12\134",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\144\1\142\34\144\1\143\10\144\1\141\20\144\32\137\1\144\1\135\1\144\1\142\1\140\1\144\32\136\uff85\144",
            "\1\114\4\uffff\1\113\10\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\144\1\153\27\144\1\152\4\144\1\153\10\144\1\151\20\144\32\147\1\144\1\145\1\144\1\153\1\150\1\144\32\146\uff85\144",
            "\1\154",
            "\1\156\1\155",
            "\1\157\1\160",
            "\1\162\21\uffff\1\161",
            "\1\164\17\uffff\1\163\1\165",
            "\1\166",
            "\1\170\4\uffff\1\171\15\uffff\1\167",
            "\1\172",
            "\1\174\26\uffff\1\173",
            "\1\175\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\176\76\uffff\1\177",
            "\1\u0080",
            "\1\u0081",
            "",
            "\1\u0082",
            "\1\u0083",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\24\57\1\u0084\5\57",
            "",
            "",
            "\1\u0086\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "",
            "",
            "",
            "\1\u008a",
            "\1\u008b",
            "",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0094\7\uffff\1\u0095",
            "\1\u0096",
            "\1\u0097\13\uffff\1\u0098\1\u0099",
            "\1\u009a",
            "\1\u009b\22\uffff\1\u009c",
            "\1\u009d\20\uffff\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1\11\uffff\1\u00a2",
            "\1\114",
            "",
            "",
            "\1\u00a3\2\uffff\1\u00a4",
            "\1\u00a5",
            "\1\u00a6\7\uffff\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b2\20\uffff\6\u00b1\32\uffff\6\u00b0",
            "",
            "\1\113",
            "",
            "\1\113",
            "\12\144\1\u00b4\34\144\1\u00b3\10\144\1\u00b8\20\144\32\u00b6\1\144\1\u00b4\1\144\1\u00b4\1\u00b7\1\144\32\u00b5\uff85\144",
            "\12\144\1\142\34\144\1\u00b9\10\144\1\141\20\144\32\137\1\144\1\135\1\144\1\142\1\140\1\144\32\136\uff85\144",
            "\12\144\1\142\34\144\1\u00b9\10\144\1\141\20\144\32\137\1\144\1\135\1\144\1\142\1\140\1\144\32\136\uff85\144",
            "\12\144\1\142\34\144\1\u00b9\10\144\1\141\20\144\32\137\1\144\1\135\1\144\1\142\1\140\1\144\32\136\uff85\144",
            "\56\144\1\u00ba\uffd1\144",
            "\12\144\1\142\34\144\1\u00b9\10\144\1\141\20\144\32\137\1\144\1\135\1\144\1\142\1\140\1\144\32\136\uff85\144",
            "\1\113\34\uffff\1\113\10\uffff\1\113\20\uffff\32\113\1\uffff\1\113\1\uffff\2\113\1\uffff\32\113",
            "",
            "\12\144\1\u00bc\27\144\1\u00bb\4\144\1\u00bc\10\144\1\u00c0\20\144\32\u00be\1\144\1\u00bc\1\144\1\u00bc\1\u00bf\1\144\32\u00bd\uff85\144",
            "\12\144\1\153\27\144\1\152\4\144\1\153\10\144\1\151\20\144\32\147\1\144\1\145\1\144\1\153\1\150\1\144\32\146\uff85\144",
            "\12\144\1\153\27\144\1\152\4\144\1\153\10\144\1\151\20\144\32\147\1\144\1\145\1\144\1\153\1\150\1\144\32\146\uff85\144",
            "\12\144\1\153\27\144\1\152\4\144\1\153\10\144\1\151\20\144\32\147\1\144\1\145\1\144\1\153\1\150\1\144\32\146\uff85\144",
            "\56\144\1\u00c1\uffd1\144",
            "",
            "\12\144\1\153\27\144\1\152\4\144\1\153\10\144\1\151\20\144\32\147\1\144\1\145\1\144\1\153\1\150\1\144\32\146\uff85\144",
            "",
            "\1\u00c2",
            "",
            "\1\u00c4",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2\1\u00d3",
            "\1\u00d4",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00d6",
            "",
            "\1\u00d7",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f3",
            "\1\u00f4",
            "\12\144\1\142\34\144\1\u00b9\10\144\1\141\20\144\32\137\1\144\1\135\1\144\1\142\1\140\1\144\32\136\uff85\144",
            "\12\144\1\142\34\144\1\u00b9\10\144\1\141\20\144\32\137\1\144\1\135\1\144\1\142\1\140\1\144\32\136\uff85\144",
            "\12\144\1\142\34\144\1\u00b9\10\144\1\141\20\144\32\137\1\144\1\135\1\144\1\142\1\140\1\144\32\136\uff85\144",
            "\12\144\1\142\34\144\1\u00b9\10\144\1\141\20\144\32\137\1\144\1\135\1\144\1\142\1\140\1\144\32\136\uff85\144",
            "\12\144\1\142\34\144\1\u00b9\10\144\1\141\20\144\32\137\1\144\1\135\1\144\1\142\1\140\1\144\32\136\uff85\144",
            "\56\144\1\u00ba\uffd1\144",
            "",
            "\56\144\1\u00f5\uffd1\144",
            "\11\144\2\u00f6\1\144\2\u00f6\22\144\1\u00f6\1\144\1\u00fa\51\144\1\u00f9\10\144\1\u00f8\37\144\1\u00f7\uff8a\144",
            "\12\144\1\153\27\144\1\152\4\144\1\153\10\144\1\151\20\144\32\147\1\144\1\145\1\144\1\153\1\150\1\144\32\146\uff85\144",
            "\12\144\1\153\27\144\1\152\4\144\1\153\10\144\1\151\20\144\32\147\1\144\1\145\1\144\1\153\1\150\1\144\32\146\uff85\144",
            "\12\144\1\153\27\144\1\152\4\144\1\153\10\144\1\151\20\144\32\147\1\144\1\145\1\144\1\153\1\150\1\144\32\146\uff85\144",
            "\12\144\1\153\27\144\1\152\4\144\1\153\10\144\1\151\20\144\32\147\1\144\1\145\1\144\1\153\1\150\1\144\32\146\uff85\144",
            "\56\144\1\u00c1\uffd1\144",
            "\56\144\1\u00fb\uffd1\144",
            "",
            "",
            "",
            "",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0101\3\uffff\1\u0102",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0106",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u010d",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\133\41\uffff\1\133\37\uffff\1\133",
            "\1\u0128",
            "\71\144\1\u0129\uffc6\144",
            "\11\144\2\u00f6\1\144\2\u00f6\22\144\1\u00f6\1\144\1\u00fa\51\144\1\u00f9\10\144\1\u00f8\37\144\1\u00f7\uff8a\144",
            "\42\144\1\u00fa\25\144\1\u012a\uffc7\144",
            "\42\144\1\u00fa\uffdd\144",
            "\42\144\1\u00fa\uffdd\144",
            "\1\114\27\uffff\1\114\4\uffff\1\114\10\uffff\1\114\20\uffff\32\114\1\uffff\1\114\1\uffff\2\114\1\uffff\32\114",
            "\71\144\1\u012b\uffc6\144",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "",
            "\1\u0130",
            "\1\u0131",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0134",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u0136",
            "",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0142",
            "",
            "\1\u0143",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0145",
            "\1\u0146",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\12\144\1\142\34\144\1\u00b9\10\144\1\141\20\144\32\137\1\144\1\135\1\144\1\142\1\140\1\144\32\136\uff85\144",
            "\42\144\1\u00fa\uffdd\144",
            "\12\144\1\153\27\144\1\152\4\144\1\153\10\144\1\151\20\144\32\147\1\144\1\145\1\144\1\153\1\150\1\144\32\146\uff85\144",
            "\1\u0150",
            "\1\u0151",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0154",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\1\u0156",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0158",
            "\1\u0159",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0160",
            "",
            "\1\u0161",
            "\1\u0162",
            "",
            "\1\u0163\15\uffff\1\u0164",
            "\1\u0165",
            "",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u00f3",
            "\1\u016d",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u0170",
            "",
            "\1\u0171",
            "\1\u0172",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u018a",
            "\1\u018b",
            "\1\u018c",
            "\1\u018d",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
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
            "\1\u018f",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0191",
            "\1\u0192",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u0194",
            "\1\u0195",
            "",
            "\1\u0196",
            "\1\u0197",
            "\1\u0198",
            "\1\u0199",
            "\1\u019a",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            ""
    };

    static final short[] DFA40_eot = DFA.unpackEncodedString(DFA40_eotS);
    static final short[] DFA40_eof = DFA.unpackEncodedString(DFA40_eofS);
    static final char[] DFA40_min = DFA.unpackEncodedStringToUnsignedChars(DFA40_minS);
    static final char[] DFA40_max = DFA.unpackEncodedStringToUnsignedChars(DFA40_maxS);
    static final short[] DFA40_accept = DFA.unpackEncodedString(DFA40_acceptS);
    static final short[] DFA40_special = DFA.unpackEncodedString(DFA40_specialS);
    static final short[][] DFA40_transition;

    static {
        int numStates = DFA40_transitionS.length;
        DFA40_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA40_transition[i] = DFA.unpackEncodedString(DFA40_transitionS[i]);
        }
    }

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = DFA40_eot;
            this.eof = DFA40_eof;
            this.min = DFA40_min;
            this.max = DFA40_max;
            this.accept = DFA40_accept;
            this.special = DFA40_special;
            this.transition = DFA40_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | RULE_L | RULE_WS | RULE_AUTO | RULE_BREAK | RULE_CASE | RULE_CHAR | RULE_CONST | RULE_CONTINUE | RULE_DEFAULT | RULE_DO | RULE_DOUBLE | RULE_ELSE | RULE_ENUM | RULE_EXTERN | RULE_FLOAT | RULE_FOR | RULE_GOTO | RULE_IF | RULE_INLINE | RULE_INTZ | RULE_LONG | RULE_REGISTER | RULE_RESTRICT | RULE_RETURN | RULE_SHORT | RULE_SIGNED | RULE_SIZEOF | RULE_STATIC | RULE_STRUCT | RULE_SWITCH | RULE_TYPEDEF | RULE_UNION | RULE_UNSIGNED | RULE_VOID | RULE_VOLATILE | RULE_WHILE | RULE_ALIGNAS | RULE_ALIGNOF | RULE_ATOMIC | RULE_BOOL | RULE_COMPLEX | RULE_GENERIC | RULE_IMAGINARY | RULE_NORETURN | RULE_STATIC_ASSERT | RULE_THREAD_LOCAL | RULE_FUNC_NAME | RULE_I_CONSTANT | RULE_F_CONSTANT | RULE_STRING_LITERAL | RULE_ELLIPSIS | RULE_RIGHT_ASSIGN | RULE_LEFT_ASSIGN | RULE_ADD_ASSIGN | RULE_SUB_ASSIGN | RULE_MUL_ASSIGN | RULE_DIV_ASSIGN | RULE_MOD_ASSIGN | RULE_AND_ASSIGN | RULE_XOR_ASSIGN | RULE_OR_ASSIGN | RULE_RIGHT_OP | RULE_LEFT_OP | RULE_INC_OP | RULE_DEC_OP | RULE_PTR_OP | RULE_AND_OP | RULE_OR_OP | RULE_LE_OP | RULE_GE_OP | RULE_EQ_OP | RULE_NE_OP | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA40_0 = input.LA(1);

                        s = -1;
                        if ( (LA40_0=='d') ) {s = 1;}

                        else if ( (LA40_0=='e') ) {s = 2;}

                        else if ( (LA40_0=='{') ) {s = 3;}

                        else if ( (LA40_0=='}') ) {s = 4;}

                        else if ( (LA40_0==':') ) {s = 5;}

                        else if ( (LA40_0=='m') ) {s = 6;}

                        else if ( (LA40_0=='a') ) {s = 7;}

                        else if ( ((LA40_0>='\t' && LA40_0<='\n')||(LA40_0>='\f' && LA40_0<='\r')||LA40_0==' ') ) {s = 8;}

                        else if ( (LA40_0=='b') ) {s = 9;}

                        else if ( (LA40_0=='c') ) {s = 10;}

                        else if ( (LA40_0=='f') ) {s = 11;}

                        else if ( (LA40_0=='g') ) {s = 12;}

                        else if ( (LA40_0=='i') ) {s = 13;}

                        else if ( (LA40_0=='l') ) {s = 14;}

                        else if ( (LA40_0=='r') ) {s = 15;}

                        else if ( (LA40_0=='s') ) {s = 16;}

                        else if ( (LA40_0=='t') ) {s = 17;}

                        else if ( (LA40_0=='u') ) {s = 18;}

                        else if ( (LA40_0=='v') ) {s = 19;}

                        else if ( (LA40_0=='w') ) {s = 20;}

                        else if ( (LA40_0=='_') ) {s = 21;}

                        else if ( (LA40_0=='U') ) {s = 22;}

                        else if ( (LA40_0=='0') ) {s = 23;}

                        else if ( ((LA40_0>='1' && LA40_0<='9')) ) {s = 24;}

                        else if ( ((LA40_0>='A' && LA40_0<='K')||(LA40_0>='M' && LA40_0<='T')||(LA40_0>='V' && LA40_0<='Z')||LA40_0=='h'||(LA40_0>='j' && LA40_0<='k')||(LA40_0>='n' && LA40_0<='q')||(LA40_0>='x' && LA40_0<='z')) ) {s = 25;}

                        else if ( (LA40_0=='\'') ) {s = 26;}

                        else if ( (LA40_0=='L') ) {s = 27;}

                        else if ( (LA40_0=='\"') ) {s = 28;}

                        else if ( (LA40_0=='.') ) {s = 29;}

                        else if ( (LA40_0=='>') ) {s = 30;}

                        else if ( (LA40_0=='<') ) {s = 31;}

                        else if ( (LA40_0=='+') ) {s = 32;}

                        else if ( (LA40_0=='-') ) {s = 33;}

                        else if ( (LA40_0=='*') ) {s = 34;}

                        else if ( (LA40_0=='/') ) {s = 35;}

                        else if ( (LA40_0=='%') ) {s = 36;}

                        else if ( (LA40_0=='&') ) {s = 37;}

                        else if ( (LA40_0=='^') ) {s = 38;}

                        else if ( (LA40_0=='|') ) {s = 39;}

                        else if ( (LA40_0=='=') ) {s = 40;}

                        else if ( (LA40_0=='!') ) {s = 41;}

                        else if ( ((LA40_0>='\u0000' && LA40_0<='\b')||LA40_0=='\u000B'||(LA40_0>='\u000E' && LA40_0<='\u001F')||(LA40_0>='#' && LA40_0<='$')||(LA40_0>='(' && LA40_0<=')')||LA40_0==','||LA40_0==';'||(LA40_0>='?' && LA40_0<='@')||(LA40_0>='[' && LA40_0<=']')||LA40_0=='`'||(LA40_0>='~' && LA40_0<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA40_247 = input.LA(1);

                        s = -1;
                        if ( (LA40_247=='8') ) {s = 298;}

                        else if ( (LA40_247=='\"') ) {s = 250;}

                        else if ( ((LA40_247>='\u0000' && LA40_247<='!')||(LA40_247>='#' && LA40_247<='7')||(LA40_247>='9' && LA40_247<='\uFFFF')) ) {s = 100;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA40_192 = input.LA(1);

                        s = -1;
                        if ( (LA40_192=='.') ) {s = 193;}

                        else if ( ((LA40_192>='\u0000' && LA40_192<='-')||(LA40_192>='/' && LA40_192<='\uFFFF')) ) {s = 100;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA40_105 = input.LA(1);

                        s = -1;
                        if ( (LA40_105=='.') ) {s = 193;}

                        else if ( ((LA40_105>='\u0000' && LA40_105<='-')||(LA40_105>='/' && LA40_105<='\uFFFF')) ) {s = 100;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA40_193 = input.LA(1);

                        s = -1;
                        if ( (LA40_193=='.') ) {s = 251;}

                        else if ( ((LA40_193>='\u0000' && LA40_193<='-')||(LA40_193>='/' && LA40_193<='\uFFFF')) ) {s = 100;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA40_251 = input.LA(1);

                        s = -1;
                        if ( (LA40_251=='9') ) {s = 299;}

                        else if ( ((LA40_251>='\u0000' && LA40_251<='8')||(LA40_251>=':' && LA40_251<='\uFFFF')) ) {s = 100;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA40_184 = input.LA(1);

                        s = -1;
                        if ( (LA40_184=='.') ) {s = 186;}

                        else if ( ((LA40_184>='\u0000' && LA40_184<='-')||(LA40_184>='/' && LA40_184<='\uFFFF')) ) {s = 100;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA40_97 = input.LA(1);

                        s = -1;
                        if ( (LA40_97=='.') ) {s = 186;}

                        else if ( ((LA40_97>='\u0000' && LA40_97<='-')||(LA40_97>='/' && LA40_97<='\uFFFF')) ) {s = 100;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA40_186 = input.LA(1);

                        s = -1;
                        if ( (LA40_186=='.') ) {s = 245;}

                        else if ( ((LA40_186>='\u0000' && LA40_186<='-')||(LA40_186>='/' && LA40_186<='\uFFFF')) ) {s = 100;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA40_245 = input.LA(1);

                        s = -1;
                        if ( (LA40_245=='9') ) {s = 297;}

                        else if ( ((LA40_245>='\u0000' && LA40_245<='8')||(LA40_245>=':' && LA40_245<='\uFFFF')) ) {s = 100;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA40_179 = input.LA(1);

                        s = -1;
                        if ( (LA40_179=='\'') ) {s = 185;}

                        else if ( (LA40_179=='\\') ) {s = 93;}

                        else if ( (LA40_179=='\n'||LA40_179=='^') ) {s = 98;}

                        else if ( ((LA40_179>='a' && LA40_179<='z')) ) {s = 94;}

                        else if ( ((LA40_179>='A' && LA40_179<='Z')) ) {s = 95;}

                        else if ( (LA40_179=='_') ) {s = 96;}

                        else if ( (LA40_179=='0') ) {s = 97;}

                        else if ( ((LA40_179>='\u0000' && LA40_179<='\t')||(LA40_179>='\u000B' && LA40_179<='&')||(LA40_179>='(' && LA40_179<='/')||(LA40_179>='1' && LA40_179<='@')||LA40_179=='['||LA40_179==']'||LA40_179=='`'||(LA40_179>='{' && LA40_179<='\uFFFF')) ) {s = 100;}

                        else s = 75;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA40_188 = input.LA(1);

                        s = -1;
                        if ( (LA40_188=='\"') ) {s = 106;}

                        else if ( (LA40_188=='\\') ) {s = 101;}

                        else if ( ((LA40_188>='a' && LA40_188<='z')) ) {s = 102;}

                        else if ( ((LA40_188>='A' && LA40_188<='Z')) ) {s = 103;}

                        else if ( (LA40_188=='_') ) {s = 104;}

                        else if ( (LA40_188=='0') ) {s = 105;}

                        else if ( (LA40_188=='\n'||LA40_188=='\''||LA40_188=='^') ) {s = 107;}

                        else if ( ((LA40_188>='\u0000' && LA40_188<='\t')||(LA40_188>='\u000B' && LA40_188<='!')||(LA40_188>='#' && LA40_188<='&')||(LA40_188>='(' && LA40_188<='/')||(LA40_188>='1' && LA40_188<='@')||LA40_188=='['||LA40_188==']'||LA40_188=='`'||(LA40_188>='{' && LA40_188<='\uFFFF')) ) {s = 100;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA40_107 = input.LA(1);

                        s = -1;
                        if ( (LA40_107=='\"') ) {s = 106;}

                        else if ( (LA40_107=='\\') ) {s = 101;}

                        else if ( (LA40_107=='\n'||LA40_107=='\''||LA40_107=='^') ) {s = 107;}

                        else if ( ((LA40_107>='a' && LA40_107<='z')) ) {s = 102;}

                        else if ( ((LA40_107>='A' && LA40_107<='Z')) ) {s = 103;}

                        else if ( (LA40_107=='_') ) {s = 104;}

                        else if ( (LA40_107=='0') ) {s = 105;}

                        else if ( ((LA40_107>='\u0000' && LA40_107<='\t')||(LA40_107>='\u000B' && LA40_107<='!')||(LA40_107>='#' && LA40_107<='&')||(LA40_107>='(' && LA40_107<='/')||(LA40_107>='1' && LA40_107<='@')||LA40_107=='['||LA40_107==']'||LA40_107=='`'||(LA40_107>='{' && LA40_107<='\uFFFF')) ) {s = 100;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA40_187 = input.LA(1);

                        s = -1;
                        if ( ((LA40_187>='\t' && LA40_187<='\n')||(LA40_187>='\f' && LA40_187<='\r')||LA40_187==' ') ) {s = 246;}

                        else if ( (LA40_187=='u') ) {s = 247;}

                        else if ( (LA40_187=='U') ) {s = 248;}

                        else if ( (LA40_187=='L') ) {s = 249;}

                        else if ( (LA40_187=='\"') ) {s = 250;}

                        else if ( ((LA40_187>='\u0000' && LA40_187<='\b')||LA40_187=='\u000B'||(LA40_187>='\u000E' && LA40_187<='\u001F')||LA40_187=='!'||(LA40_187>='#' && LA40_187<='K')||(LA40_187>='M' && LA40_187<='T')||(LA40_187>='V' && LA40_187<='t')||(LA40_187>='v' && LA40_187<='\uFFFF')) ) {s = 100;}

                        else s = 76;

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA40_246 = input.LA(1);

                        s = -1;
                        if ( (LA40_246=='\"') ) {s = 250;}

                        else if ( ((LA40_246>='\u0000' && LA40_246<='\b')||LA40_246=='\u000B'||(LA40_246>='\u000E' && LA40_246<='\u001F')||LA40_246=='!'||(LA40_246>='#' && LA40_246<='K')||(LA40_246>='M' && LA40_246<='T')||(LA40_246>='V' && LA40_246<='t')||(LA40_246>='v' && LA40_246<='\uFFFF')) ) {s = 100;}

                        else if ( (LA40_246=='u') ) {s = 247;}

                        else if ( (LA40_246=='U') ) {s = 248;}

                        else if ( (LA40_246=='L') ) {s = 249;}

                        else if ( ((LA40_246>='\t' && LA40_246<='\n')||(LA40_246>='\f' && LA40_246<='\r')||LA40_246==' ') ) {s = 246;}

                        else s = 76;

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA40_189 = input.LA(1);

                        s = -1;
                        if ( (LA40_189=='\"') ) {s = 106;}

                        else if ( (LA40_189=='\\') ) {s = 101;}

                        else if ( ((LA40_189>='a' && LA40_189<='z')) ) {s = 102;}

                        else if ( ((LA40_189>='A' && LA40_189<='Z')) ) {s = 103;}

                        else if ( (LA40_189=='_') ) {s = 104;}

                        else if ( (LA40_189=='0') ) {s = 105;}

                        else if ( (LA40_189=='\n'||LA40_189=='\''||LA40_189=='^') ) {s = 107;}

                        else if ( ((LA40_189>='\u0000' && LA40_189<='\t')||(LA40_189>='\u000B' && LA40_189<='!')||(LA40_189>='#' && LA40_189<='&')||(LA40_189>='(' && LA40_189<='/')||(LA40_189>='1' && LA40_189<='@')||LA40_189=='['||LA40_189==']'||LA40_189=='`'||(LA40_189>='{' && LA40_189<='\uFFFF')) ) {s = 100;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA40_190 = input.LA(1);

                        s = -1;
                        if ( (LA40_190=='\"') ) {s = 106;}

                        else if ( (LA40_190=='\\') ) {s = 101;}

                        else if ( ((LA40_190>='a' && LA40_190<='z')) ) {s = 102;}

                        else if ( ((LA40_190>='A' && LA40_190<='Z')) ) {s = 103;}

                        else if ( (LA40_190=='_') ) {s = 104;}

                        else if ( (LA40_190=='0') ) {s = 105;}

                        else if ( (LA40_190=='\n'||LA40_190=='\''||LA40_190=='^') ) {s = 107;}

                        else if ( ((LA40_190>='\u0000' && LA40_190<='\t')||(LA40_190>='\u000B' && LA40_190<='!')||(LA40_190>='#' && LA40_190<='&')||(LA40_190>='(' && LA40_190<='/')||(LA40_190>='1' && LA40_190<='@')||LA40_190=='['||LA40_190==']'||LA40_190=='`'||(LA40_190>='{' && LA40_190<='\uFFFF')) ) {s = 100;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA40_191 = input.LA(1);

                        s = -1;
                        if ( (LA40_191=='\"') ) {s = 106;}

                        else if ( (LA40_191=='\\') ) {s = 101;}

                        else if ( (LA40_191=='\n'||LA40_191=='\''||LA40_191=='^') ) {s = 107;}

                        else if ( ((LA40_191>='a' && LA40_191<='z')) ) {s = 102;}

                        else if ( ((LA40_191>='A' && LA40_191<='Z')) ) {s = 103;}

                        else if ( (LA40_191=='_') ) {s = 104;}

                        else if ( (LA40_191=='0') ) {s = 105;}

                        else if ( ((LA40_191>='\u0000' && LA40_191<='\t')||(LA40_191>='\u000B' && LA40_191<='!')||(LA40_191>='#' && LA40_191<='&')||(LA40_191>='(' && LA40_191<='/')||(LA40_191>='1' && LA40_191<='@')||LA40_191=='['||LA40_191==']'||LA40_191=='`'||(LA40_191>='{' && LA40_191<='\uFFFF')) ) {s = 100;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA40_102 = input.LA(1);

                        s = -1;
                        if ( (LA40_102=='\"') ) {s = 106;}

                        else if ( (LA40_102=='\\') ) {s = 101;}

                        else if ( (LA40_102=='\n'||LA40_102=='\''||LA40_102=='^') ) {s = 107;}

                        else if ( ((LA40_102>='a' && LA40_102<='z')) ) {s = 102;}

                        else if ( ((LA40_102>='A' && LA40_102<='Z')) ) {s = 103;}

                        else if ( (LA40_102=='_') ) {s = 104;}

                        else if ( (LA40_102=='0') ) {s = 105;}

                        else if ( ((LA40_102>='\u0000' && LA40_102<='\t')||(LA40_102>='\u000B' && LA40_102<='!')||(LA40_102>='#' && LA40_102<='&')||(LA40_102>='(' && LA40_102<='/')||(LA40_102>='1' && LA40_102<='@')||LA40_102=='['||LA40_102==']'||LA40_102=='`'||(LA40_102>='{' && LA40_102<='\uFFFF')) ) {s = 100;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA40_103 = input.LA(1);

                        s = -1;
                        if ( (LA40_103=='\"') ) {s = 106;}

                        else if ( (LA40_103=='\\') ) {s = 101;}

                        else if ( (LA40_103=='\n'||LA40_103=='\''||LA40_103=='^') ) {s = 107;}

                        else if ( ((LA40_103>='a' && LA40_103<='z')) ) {s = 102;}

                        else if ( ((LA40_103>='A' && LA40_103<='Z')) ) {s = 103;}

                        else if ( (LA40_103=='_') ) {s = 104;}

                        else if ( (LA40_103=='0') ) {s = 105;}

                        else if ( ((LA40_103>='\u0000' && LA40_103<='\t')||(LA40_103>='\u000B' && LA40_103<='!')||(LA40_103>='#' && LA40_103<='&')||(LA40_103>='(' && LA40_103<='/')||(LA40_103>='1' && LA40_103<='@')||LA40_103=='['||LA40_103==']'||LA40_103=='`'||(LA40_103>='{' && LA40_103<='\uFFFF')) ) {s = 100;}

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA40_104 = input.LA(1);

                        s = -1;
                        if ( (LA40_104=='\"') ) {s = 106;}

                        else if ( (LA40_104=='\\') ) {s = 101;}

                        else if ( (LA40_104=='\n'||LA40_104=='\''||LA40_104=='^') ) {s = 107;}

                        else if ( ((LA40_104>='a' && LA40_104<='z')) ) {s = 102;}

                        else if ( ((LA40_104>='A' && LA40_104<='Z')) ) {s = 103;}

                        else if ( (LA40_104=='_') ) {s = 104;}

                        else if ( (LA40_104=='0') ) {s = 105;}

                        else if ( ((LA40_104>='\u0000' && LA40_104<='\t')||(LA40_104>='\u000B' && LA40_104<='!')||(LA40_104>='#' && LA40_104<='&')||(LA40_104>='(' && LA40_104<='/')||(LA40_104>='1' && LA40_104<='@')||LA40_104=='['||LA40_104==']'||LA40_104=='`'||(LA40_104>='{' && LA40_104<='\uFFFF')) ) {s = 100;}

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA40_299 = input.LA(1);

                        s = -1;
                        if ( (LA40_299=='\"') ) {s = 106;}

                        else if ( (LA40_299=='\\') ) {s = 101;}

                        else if ( (LA40_299=='\n'||LA40_299=='\''||LA40_299=='^') ) {s = 107;}

                        else if ( ((LA40_299>='a' && LA40_299<='z')) ) {s = 102;}

                        else if ( ((LA40_299>='A' && LA40_299<='Z')) ) {s = 103;}

                        else if ( (LA40_299=='_') ) {s = 104;}

                        else if ( (LA40_299=='0') ) {s = 105;}

                        else if ( ((LA40_299>='\u0000' && LA40_299<='\t')||(LA40_299>='\u000B' && LA40_299<='!')||(LA40_299>='#' && LA40_299<='&')||(LA40_299>='(' && LA40_299<='/')||(LA40_299>='1' && LA40_299<='@')||LA40_299=='['||LA40_299==']'||LA40_299=='`'||(LA40_299>='{' && LA40_299<='\uFFFF')) ) {s = 100;}

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA40_26 = input.LA(1);

                        s = -1;
                        if ( (LA40_26=='\\') ) {s = 93;}

                        else if ( ((LA40_26>='a' && LA40_26<='z')) ) {s = 94;}

                        else if ( ((LA40_26>='A' && LA40_26<='Z')) ) {s = 95;}

                        else if ( (LA40_26=='_') ) {s = 96;}

                        else if ( (LA40_26=='0') ) {s = 97;}

                        else if ( (LA40_26=='\n'||LA40_26=='^') ) {s = 98;}

                        else if ( (LA40_26=='\'') ) {s = 99;}

                        else if ( ((LA40_26>='\u0000' && LA40_26<='\t')||(LA40_26>='\u000B' && LA40_26<='&')||(LA40_26>='(' && LA40_26<='/')||(LA40_26>='1' && LA40_26<='@')||LA40_26=='['||LA40_26==']'||LA40_26=='`'||(LA40_26>='{' && LA40_26<='\uFFFF')) ) {s = 100;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA40_101 = input.LA(1);

                        s = -1;
                        if ( (LA40_101=='\"') ) {s = 187;}

                        else if ( (LA40_101=='\n'||LA40_101=='\''||LA40_101=='\\'||LA40_101=='^') ) {s = 188;}

                        else if ( ((LA40_101>='a' && LA40_101<='z')) ) {s = 189;}

                        else if ( ((LA40_101>='A' && LA40_101<='Z')) ) {s = 190;}

                        else if ( (LA40_101=='_') ) {s = 191;}

                        else if ( (LA40_101=='0') ) {s = 192;}

                        else if ( ((LA40_101>='\u0000' && LA40_101<='\t')||(LA40_101>='\u000B' && LA40_101<='!')||(LA40_101>='#' && LA40_101<='&')||(LA40_101>='(' && LA40_101<='/')||(LA40_101>='1' && LA40_101<='@')||LA40_101=='['||LA40_101==']'||LA40_101=='`'||(LA40_101>='{' && LA40_101<='\uFFFF')) ) {s = 100;}

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA40_180 = input.LA(1);

                        s = -1;
                        if ( (LA40_180=='\'') ) {s = 185;}

                        else if ( (LA40_180=='\\') ) {s = 93;}

                        else if ( (LA40_180=='\n'||LA40_180=='^') ) {s = 98;}

                        else if ( ((LA40_180>='a' && LA40_180<='z')) ) {s = 94;}

                        else if ( ((LA40_180>='A' && LA40_180<='Z')) ) {s = 95;}

                        else if ( (LA40_180=='_') ) {s = 96;}

                        else if ( (LA40_180=='0') ) {s = 97;}

                        else if ( ((LA40_180>='\u0000' && LA40_180<='\t')||(LA40_180>='\u000B' && LA40_180<='&')||(LA40_180>='(' && LA40_180<='/')||(LA40_180>='1' && LA40_180<='@')||LA40_180=='['||LA40_180==']'||LA40_180=='`'||(LA40_180>='{' && LA40_180<='\uFFFF')) ) {s = 100;}

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA40_98 = input.LA(1);

                        s = -1;
                        if ( (LA40_98=='\'') ) {s = 185;}

                        else if ( (LA40_98=='\\') ) {s = 93;}

                        else if ( ((LA40_98>='a' && LA40_98<='z')) ) {s = 94;}

                        else if ( ((LA40_98>='A' && LA40_98<='Z')) ) {s = 95;}

                        else if ( (LA40_98=='_') ) {s = 96;}

                        else if ( (LA40_98=='0') ) {s = 97;}

                        else if ( (LA40_98=='\n'||LA40_98=='^') ) {s = 98;}

                        else if ( ((LA40_98>='\u0000' && LA40_98<='\t')||(LA40_98>='\u000B' && LA40_98<='&')||(LA40_98>='(' && LA40_98<='/')||(LA40_98>='1' && LA40_98<='@')||LA40_98=='['||LA40_98==']'||LA40_98=='`'||(LA40_98>='{' && LA40_98<='\uFFFF')) ) {s = 100;}

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA40_93 = input.LA(1);

                        s = -1;
                        if ( (LA40_93=='\'') ) {s = 179;}

                        else if ( (LA40_93=='\n'||LA40_93=='\\'||LA40_93=='^') ) {s = 180;}

                        else if ( ((LA40_93>='a' && LA40_93<='z')) ) {s = 181;}

                        else if ( ((LA40_93>='A' && LA40_93<='Z')) ) {s = 182;}

                        else if ( (LA40_93=='_') ) {s = 183;}

                        else if ( (LA40_93=='0') ) {s = 184;}

                        else if ( ((LA40_93>='\u0000' && LA40_93<='\t')||(LA40_93>='\u000B' && LA40_93<='&')||(LA40_93>='(' && LA40_93<='/')||(LA40_93>='1' && LA40_93<='@')||LA40_93=='['||LA40_93==']'||LA40_93=='`'||(LA40_93>='{' && LA40_93<='\uFFFF')) ) {s = 100;}

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA40_298 = input.LA(1);

                        s = -1;
                        if ( (LA40_298=='\"') ) {s = 250;}

                        else if ( ((LA40_298>='\u0000' && LA40_298<='!')||(LA40_298>='#' && LA40_298<='\uFFFF')) ) {s = 100;}

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA40_181 = input.LA(1);

                        s = -1;
                        if ( (LA40_181=='\'') ) {s = 185;}

                        else if ( (LA40_181=='\\') ) {s = 93;}

                        else if ( (LA40_181=='\n'||LA40_181=='^') ) {s = 98;}

                        else if ( ((LA40_181>='a' && LA40_181<='z')) ) {s = 94;}

                        else if ( ((LA40_181>='A' && LA40_181<='Z')) ) {s = 95;}

                        else if ( (LA40_181=='_') ) {s = 96;}

                        else if ( (LA40_181=='0') ) {s = 97;}

                        else if ( ((LA40_181>='\u0000' && LA40_181<='\t')||(LA40_181>='\u000B' && LA40_181<='&')||(LA40_181>='(' && LA40_181<='/')||(LA40_181>='1' && LA40_181<='@')||LA40_181=='['||LA40_181==']'||LA40_181=='`'||(LA40_181>='{' && LA40_181<='\uFFFF')) ) {s = 100;}

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA40_248 = input.LA(1);

                        s = -1;
                        if ( (LA40_248=='\"') ) {s = 250;}

                        else if ( ((LA40_248>='\u0000' && LA40_248<='!')||(LA40_248>='#' && LA40_248<='\uFFFF')) ) {s = 100;}

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA40_182 = input.LA(1);

                        s = -1;
                        if ( (LA40_182=='\'') ) {s = 185;}

                        else if ( (LA40_182=='\\') ) {s = 93;}

                        else if ( (LA40_182=='\n'||LA40_182=='^') ) {s = 98;}

                        else if ( ((LA40_182>='a' && LA40_182<='z')) ) {s = 94;}

                        else if ( ((LA40_182>='A' && LA40_182<='Z')) ) {s = 95;}

                        else if ( (LA40_182=='_') ) {s = 96;}

                        else if ( (LA40_182=='0') ) {s = 97;}

                        else if ( ((LA40_182>='\u0000' && LA40_182<='\t')||(LA40_182>='\u000B' && LA40_182<='&')||(LA40_182>='(' && LA40_182<='/')||(LA40_182>='1' && LA40_182<='@')||LA40_182=='['||LA40_182==']'||LA40_182=='`'||(LA40_182>='{' && LA40_182<='\uFFFF')) ) {s = 100;}

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA40_249 = input.LA(1);

                        s = -1;
                        if ( (LA40_249=='\"') ) {s = 250;}

                        else if ( ((LA40_249>='\u0000' && LA40_249<='!')||(LA40_249>='#' && LA40_249<='\uFFFF')) ) {s = 100;}

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA40_183 = input.LA(1);

                        s = -1;
                        if ( (LA40_183=='\'') ) {s = 185;}

                        else if ( (LA40_183=='\\') ) {s = 93;}

                        else if ( (LA40_183=='\n'||LA40_183=='^') ) {s = 98;}

                        else if ( ((LA40_183>='a' && LA40_183<='z')) ) {s = 94;}

                        else if ( ((LA40_183>='A' && LA40_183<='Z')) ) {s = 95;}

                        else if ( (LA40_183=='_') ) {s = 96;}

                        else if ( (LA40_183=='0') ) {s = 97;}

                        else if ( ((LA40_183>='\u0000' && LA40_183<='\t')||(LA40_183>='\u000B' && LA40_183<='&')||(LA40_183>='(' && LA40_183<='/')||(LA40_183>='1' && LA40_183<='@')||LA40_183=='['||LA40_183==']'||LA40_183=='`'||(LA40_183>='{' && LA40_183<='\uFFFF')) ) {s = 100;}

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA40_94 = input.LA(1);

                        s = -1;
                        if ( (LA40_94=='\'') ) {s = 185;}

                        else if ( (LA40_94=='\\') ) {s = 93;}

                        else if ( ((LA40_94>='a' && LA40_94<='z')) ) {s = 94;}

                        else if ( ((LA40_94>='A' && LA40_94<='Z')) ) {s = 95;}

                        else if ( (LA40_94=='_') ) {s = 96;}

                        else if ( (LA40_94=='0') ) {s = 97;}

                        else if ( (LA40_94=='\n'||LA40_94=='^') ) {s = 98;}

                        else if ( ((LA40_94>='\u0000' && LA40_94<='\t')||(LA40_94>='\u000B' && LA40_94<='&')||(LA40_94>='(' && LA40_94<='/')||(LA40_94>='1' && LA40_94<='@')||LA40_94=='['||LA40_94==']'||LA40_94=='`'||(LA40_94>='{' && LA40_94<='\uFFFF')) ) {s = 100;}

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA40_95 = input.LA(1);

                        s = -1;
                        if ( (LA40_95=='\'') ) {s = 185;}

                        else if ( (LA40_95=='\\') ) {s = 93;}

                        else if ( (LA40_95=='\n'||LA40_95=='^') ) {s = 98;}

                        else if ( ((LA40_95>='a' && LA40_95<='z')) ) {s = 94;}

                        else if ( ((LA40_95>='A' && LA40_95<='Z')) ) {s = 95;}

                        else if ( (LA40_95=='_') ) {s = 96;}

                        else if ( (LA40_95=='0') ) {s = 97;}

                        else if ( ((LA40_95>='\u0000' && LA40_95<='\t')||(LA40_95>='\u000B' && LA40_95<='&')||(LA40_95>='(' && LA40_95<='/')||(LA40_95>='1' && LA40_95<='@')||LA40_95=='['||LA40_95==']'||LA40_95=='`'||(LA40_95>='{' && LA40_95<='\uFFFF')) ) {s = 100;}

                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA40_96 = input.LA(1);

                        s = -1;
                        if ( (LA40_96=='\'') ) {s = 185;}

                        else if ( (LA40_96=='\\') ) {s = 93;}

                        else if ( (LA40_96=='\n'||LA40_96=='^') ) {s = 98;}

                        else if ( ((LA40_96>='a' && LA40_96<='z')) ) {s = 94;}

                        else if ( ((LA40_96>='A' && LA40_96<='Z')) ) {s = 95;}

                        else if ( (LA40_96=='_') ) {s = 96;}

                        else if ( (LA40_96=='0') ) {s = 97;}

                        else if ( ((LA40_96>='\u0000' && LA40_96<='\t')||(LA40_96>='\u000B' && LA40_96<='&')||(LA40_96>='(' && LA40_96<='/')||(LA40_96>='1' && LA40_96<='@')||LA40_96=='['||LA40_96==']'||LA40_96=='`'||(LA40_96>='{' && LA40_96<='\uFFFF')) ) {s = 100;}

                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA40_297 = input.LA(1);

                        s = -1;
                        if ( (LA40_297=='\'') ) {s = 185;}

                        else if ( (LA40_297=='\\') ) {s = 93;}

                        else if ( ((LA40_297>='a' && LA40_297<='z')) ) {s = 94;}

                        else if ( ((LA40_297>='A' && LA40_297<='Z')) ) {s = 95;}

                        else if ( (LA40_297=='_') ) {s = 96;}

                        else if ( (LA40_297=='0') ) {s = 97;}

                        else if ( (LA40_297=='\n'||LA40_297=='^') ) {s = 98;}

                        else if ( ((LA40_297>='\u0000' && LA40_297<='\t')||(LA40_297>='\u000B' && LA40_297<='&')||(LA40_297>='(' && LA40_297<='/')||(LA40_297>='1' && LA40_297<='@')||LA40_297=='['||LA40_297==']'||LA40_297=='`'||(LA40_297>='{' && LA40_297<='\uFFFF')) ) {s = 100;}

                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA40_28 = input.LA(1);

                        s = -1;
                        if ( (LA40_28=='\\') ) {s = 101;}

                        else if ( ((LA40_28>='a' && LA40_28<='z')) ) {s = 102;}

                        else if ( ((LA40_28>='A' && LA40_28<='Z')) ) {s = 103;}

                        else if ( (LA40_28=='_') ) {s = 104;}

                        else if ( (LA40_28=='0') ) {s = 105;}

                        else if ( (LA40_28=='\"') ) {s = 106;}

                        else if ( (LA40_28=='\n'||LA40_28=='\''||LA40_28=='^') ) {s = 107;}

                        else if ( ((LA40_28>='\u0000' && LA40_28<='\t')||(LA40_28>='\u000B' && LA40_28<='!')||(LA40_28>='#' && LA40_28<='&')||(LA40_28>='(' && LA40_28<='/')||(LA40_28>='1' && LA40_28<='@')||LA40_28=='['||LA40_28==']'||LA40_28=='`'||(LA40_28>='{' && LA40_28<='\uFFFF')) ) {s = 100;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 40, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}