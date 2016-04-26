package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslLexer extends Lexer {
    public static final int RULE_A=9;
    public static final int RULE_CP=16;
    public static final int RULE_STRING=20;
    public static final int RULE_SL_COMMENT=22;
    public static final int RULE_IS=15;
    public static final int RULE_SP=17;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_ID=4;
    public static final int RULE_WS=18;
    public static final int RULE_FS=14;
    public static final int RULE_ANY_OTHER=23;
    public static final int RULE_HP=11;
    public static final int RULE_O=5;
    public static final int RULE_P=13;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_NZ=7;
    public static final int T__28=28;
    public static final int RULE_INT=19;
    public static final int T__29=29;
    public static final int RULE_L=8;
    public static final int RULE_ML_COMMENT=21;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_E=12;
    public static final int RULE_F=10;
    public static final int RULE_D=6;

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

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
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
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
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
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13:7: ( 'extends' )
            // InternalMyDsl.g:13:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:14:7: ( '{' )
            // InternalMyDsl.g:14:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:15:7: ( '}' )
            // InternalMyDsl.g:15:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:16:7: ( 'many' )
            // InternalMyDsl.g:16:9: 'many'
            {
            match("many"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:17:7: ( ':' )
            // InternalMyDsl.g:17:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "RULE_O"
    public final void mRULE_O() throws RecognitionException {
        try {
            int _type = RULE_O;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:331:8: ( '0' .. '7' )
            // InternalMyDsl.g:331:10: '0' .. '7'
            {
            matchRange('0','7'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_O"

    // $ANTLR start "RULE_D"
    public final void mRULE_D() throws RecognitionException {
        try {
            // InternalMyDsl.g:333:17: ( '0' .. '9' )
            // InternalMyDsl.g:333:19: '0' .. '9'
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
            int _type = RULE_NZ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:335:9: ( '1' .. '9' )
            // InternalMyDsl.g:335:11: '1' .. '9'
            {
            matchRange('1','9'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NZ"

    // $ANTLR start "RULE_L"
    public final void mRULE_L() throws RecognitionException {
        try {
            // InternalMyDsl.g:337:17: ( 'a' .. 'z' 'A' .. 'Z' '_' )
            // InternalMyDsl.g:337:19: 'a' .. 'z' 'A' .. 'Z' '_'
            {
            matchRange('a','z'); 
            matchRange('A','Z'); 
            match('_'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_L"

    // $ANTLR start "RULE_A"
    public final void mRULE_A() throws RecognitionException {
        try {
            int _type = RULE_A;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:339:8: ( 'a' .. 'z' 'A' .. 'Z' '_' '0' '..' '9' )
            // InternalMyDsl.g:339:10: 'a' .. 'z' 'A' .. 'Z' '_' '0' '..' '9'
            {
            matchRange('a','z'); 
            matchRange('A','Z'); 
            match('_'); 
            match('0'); 
            match(".."); 

            match('9'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_A"

    // $ANTLR start "RULE_F"
    public final void mRULE_F() throws RecognitionException {
        try {
            // InternalMyDsl.g:341:17: ( 'a' .. 'f' 'A' .. 'F' '0' '..' '9' )
            // InternalMyDsl.g:341:19: 'a' .. 'f' 'A' .. 'F' '0' '..' '9'
            {
            matchRange('a','f'); 
            matchRange('A','F'); 
            match('0'); 
            match(".."); 

            match('9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_F"

    // $ANTLR start "RULE_HP"
    public final void mRULE_HP() throws RecognitionException {
        try {
            int _type = RULE_HP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:343:9: ( '0' ( 'x' | 'X' ) )
            // InternalMyDsl.g:343:11: '0' ( 'x' | 'X' )
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HP"

    // $ANTLR start "RULE_E"
    public final void mRULE_E() throws RecognitionException {
        try {
            int _type = RULE_E;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:345:8: ( ( 'E' | 'e' ) ( '+' | '-' )? '{' RULE_D '}' '+' )
            // InternalMyDsl.g:345:10: ( 'E' | 'e' ) ( '+' | '-' )? '{' RULE_D '}' '+'
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyDsl.g:345:20: ( '+' | '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='+'||LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_E"

    // $ANTLR start "RULE_P"
    public final void mRULE_P() throws RecognitionException {
        try {
            int _type = RULE_P;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:347:8: ( ( 'P' | 'p' ) ( '+' | '-' )? '{' RULE_D '}' '+' )
            // InternalMyDsl.g:347:10: ( 'P' | 'p' ) ( '+' | '-' )? '{' RULE_D '}' '+'
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyDsl.g:347:20: ( '+' | '-' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='+'||LA2_0=='-') ) {
                alt2=1;
            }
            switch (alt2) {
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_P"

    // $ANTLR start "RULE_FS"
    public final void mRULE_FS() throws RecognitionException {
        try {
            int _type = RULE_FS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:349:9: ( ( 'f' | RULE_F | 'l' | 'L' ) )
            // InternalMyDsl.g:349:11: ( 'f' | RULE_F | 'l' | 'L' )
            {
            // InternalMyDsl.g:349:11: ( 'f' | RULE_F | 'l' | 'L' )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 'f':
                {
                int LA3_1 = input.LA(2);

                if ( ((LA3_1>='A' && LA3_1<='F')) ) {
                    alt3=2;
                }
                else {
                    alt3=1;}
                }
                break;
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
                {
                alt3=2;
                }
                break;
            case 'l':
                {
                alt3=3;
                }
                break;
            case 'L':
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:349:12: 'f'
                    {
                    match('f'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:349:16: RULE_F
                    {
                    mRULE_F(); 

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:349:23: 'l'
                    {
                    match('l'); 

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:349:27: 'L'
                    {
                    match('L'); 

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
    // $ANTLR end "RULE_FS"

    // $ANTLR start "RULE_IS"
    public final void mRULE_IS() throws RecognitionException {
        try {
            int _type = RULE_IS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:351:9: ( ( ( 'u' | 'U' ) ( 'l' | RULE_L | 'l' 'l' | RULE_L RULE_L )? | ( 'l' | RULE_L | 'l' 'l' | RULE_L RULE_L ) ( 'u' | 'U' )? ) )
            // InternalMyDsl.g:351:11: ( ( 'u' | 'U' ) ( 'l' | RULE_L | 'l' 'l' | RULE_L RULE_L )? | ( 'l' | RULE_L | 'l' 'l' | RULE_L RULE_L ) ( 'u' | 'U' )? )
            {
            // InternalMyDsl.g:351:11: ( ( 'u' | 'U' ) ( 'l' | RULE_L | 'l' 'l' | RULE_L RULE_L )? | ( 'l' | RULE_L | 'l' 'l' | RULE_L RULE_L ) ( 'u' | 'U' )? )
            int alt7=2;
            switch ( input.LA(1) ) {
            case 'u':
                {
                int LA7_1 = input.LA(2);

                if ( ((LA7_1>='A' && LA7_1<='Z')) ) {
                    alt7=2;
                }
                else {
                    alt7=1;}
                }
                break;
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
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                {
                alt7=2;
                }
                break;
            case 'U':
                {
                alt7=1;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:351:12: ( 'u' | 'U' ) ( 'l' | RULE_L | 'l' 'l' | RULE_L RULE_L )?
                    {
                    if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalMyDsl.g:351:22: ( 'l' | RULE_L | 'l' 'l' | RULE_L RULE_L )?
                    int alt4=5;
                    alt4 = dfa4.predict(input);
                    switch (alt4) {
                        case 1 :
                            // InternalMyDsl.g:351:23: 'l'
                            {
                            match('l'); 

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:351:27: RULE_L
                            {
                            mRULE_L(); 

                            }
                            break;
                        case 3 :
                            // InternalMyDsl.g:351:34: 'l' 'l'
                            {
                            match('l'); 
                            match('l'); 

                            }
                            break;
                        case 4 :
                            // InternalMyDsl.g:351:42: RULE_L RULE_L
                            {
                            mRULE_L(); 
                            mRULE_L(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:351:58: ( 'l' | RULE_L | 'l' 'l' | RULE_L RULE_L ) ( 'u' | 'U' )?
                    {
                    // InternalMyDsl.g:351:58: ( 'l' | RULE_L | 'l' 'l' | RULE_L RULE_L )
                    int alt5=4;
                    alt5 = dfa5.predict(input);
                    switch (alt5) {
                        case 1 :
                            // InternalMyDsl.g:351:59: 'l'
                            {
                            match('l'); 

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:351:63: RULE_L
                            {
                            mRULE_L(); 

                            }
                            break;
                        case 3 :
                            // InternalMyDsl.g:351:70: 'l' 'l'
                            {
                            match('l'); 
                            match('l'); 

                            }
                            break;
                        case 4 :
                            // InternalMyDsl.g:351:78: RULE_L RULE_L
                            {
                            mRULE_L(); 
                            mRULE_L(); 

                            }
                            break;

                    }

                    // InternalMyDsl.g:351:93: ( 'u' | 'U' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='U'||LA6_0=='u') ) {
                        alt6=1;
                    }
                    switch (alt6) {
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IS"

    // $ANTLR start "RULE_CP"
    public final void mRULE_CP() throws RecognitionException {
        try {
            int _type = RULE_CP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:353:9: ( ( 'u' | 'U' | RULE_L ) )
            // InternalMyDsl.g:353:11: ( 'u' | 'U' | RULE_L )
            {
            // InternalMyDsl.g:353:11: ( 'u' | 'U' | RULE_L )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 'u':
                {
                int LA8_1 = input.LA(2);

                if ( ((LA8_1>='A' && LA8_1<='Z')) ) {
                    alt8=3;
                }
                else {
                    alt8=1;}
                }
                break;
            case 'U':
                {
                alt8=2;
                }
                break;
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
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:353:12: 'u'
                    {
                    match('u'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:353:16: 'U'
                    {
                    match('U'); 

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:353:20: RULE_L
                    {
                    mRULE_L(); 

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
    // $ANTLR end "RULE_CP"

    // $ANTLR start "RULE_SP"
    public final void mRULE_SP() throws RecognitionException {
        try {
            int _type = RULE_SP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:355:9: ( ( 'u' '8' | 'u' | 'U' | 'L' ) )
            // InternalMyDsl.g:355:11: ( 'u' '8' | 'u' | 'U' | 'L' )
            {
            // InternalMyDsl.g:355:11: ( 'u' '8' | 'u' | 'U' | 'L' )
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
                    // InternalMyDsl.g:355:12: 'u' '8'
                    {
                    match('u'); 
                    match('8'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:355:20: 'u'
                    {
                    match('u'); 

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:355:24: 'U'
                    {
                    match('U'); 

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:355:28: 'L'
                    {
                    match('L'); 

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
    // $ANTLR end "RULE_SP"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:357:9: ( ( ' ' | '\\t' | '\\r' | '\\n' | '\\f' )+ )
            // InternalMyDsl.g:357:11: ( ' ' | '\\t' | '\\r' | '\\n' | '\\f' )+
            {
            // InternalMyDsl.g:357:11: ( ' ' | '\\t' | '\\r' | '\\n' | '\\f' )+
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

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:359:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMyDsl.g:359:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMyDsl.g:359:11: ( '^' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='^') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:359:11: '^'
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

            // InternalMyDsl.g:359:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')||(LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='z')) ) {
                    alt12=1;
                }


                switch (alt12) {
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
            	    break loop12;
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
            // InternalMyDsl.g:361:10: ( ( '0' .. '9' )+ )
            // InternalMyDsl.g:361:12: ( '0' .. '9' )+
            {
            // InternalMyDsl.g:361:12: ( '0' .. '9' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:361:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
            // InternalMyDsl.g:363:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMyDsl.g:363:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMyDsl.g:363:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\"') ) {
                alt16=1;
            }
            else if ( (LA16_0=='\'') ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:363:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMyDsl.g:363:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop14:
                    do {
                        int alt14=3;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0=='\\') ) {
                            alt14=1;
                        }
                        else if ( ((LA14_0>='\u0000' && LA14_0<='!')||(LA14_0>='#' && LA14_0<='[')||(LA14_0>=']' && LA14_0<='\uFFFF')) ) {
                            alt14=2;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalMyDsl.g:363:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:363:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop14;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:363:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMyDsl.g:363:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop15:
                    do {
                        int alt15=3;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0=='\\') ) {
                            alt15=1;
                        }
                        else if ( ((LA15_0>='\u0000' && LA15_0<='&')||(LA15_0>='(' && LA15_0<='[')||(LA15_0>=']' && LA15_0<='\uFFFF')) ) {
                            alt15=2;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalMyDsl.g:363:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:363:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop15;
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
            // InternalMyDsl.g:365:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMyDsl.g:365:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMyDsl.g:365:24: ( options {greedy=false; } : . )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0=='*') ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1=='/') ) {
                        alt17=2;
                    }
                    else if ( ((LA17_1>='\u0000' && LA17_1<='.')||(LA17_1>='0' && LA17_1<='\uFFFF')) ) {
                        alt17=1;
                    }


                }
                else if ( ((LA17_0>='\u0000' && LA17_0<=')')||(LA17_0>='+' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:365:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop17;
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
            // InternalMyDsl.g:367:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyDsl.g:367:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMyDsl.g:367:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\u0000' && LA18_0<='\t')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\uFFFF')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:367:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop18;
                }
            } while (true);

            // InternalMyDsl.g:367:40: ( ( '\\r' )? '\\n' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\n'||LA20_0=='\r') ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:367:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyDsl.g:367:41: ( '\\r' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0=='\r') ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalMyDsl.g:367:41: '\\r'
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
            // InternalMyDsl.g:369:16: ( . )
            // InternalMyDsl.g:369:18: .
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
        // InternalMyDsl.g:1:8: ( T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | RULE_O | RULE_NZ | RULE_A | RULE_HP | RULE_E | RULE_P | RULE_FS | RULE_IS | RULE_CP | RULE_SP | RULE_WS | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_ANY_OTHER )
        int alt21=24;
        alt21 = dfa21.predict(input);
        switch (alt21) {
            case 1 :
                // InternalMyDsl.g:1:10: T__24
                {
                mT__24(); 

                }
                break;
            case 2 :
                // InternalMyDsl.g:1:16: T__25
                {
                mT__25(); 

                }
                break;
            case 3 :
                // InternalMyDsl.g:1:22: T__26
                {
                mT__26(); 

                }
                break;
            case 4 :
                // InternalMyDsl.g:1:28: T__27
                {
                mT__27(); 

                }
                break;
            case 5 :
                // InternalMyDsl.g:1:34: T__28
                {
                mT__28(); 

                }
                break;
            case 6 :
                // InternalMyDsl.g:1:40: T__29
                {
                mT__29(); 

                }
                break;
            case 7 :
                // InternalMyDsl.g:1:46: T__30
                {
                mT__30(); 

                }
                break;
            case 8 :
                // InternalMyDsl.g:1:52: RULE_O
                {
                mRULE_O(); 

                }
                break;
            case 9 :
                // InternalMyDsl.g:1:59: RULE_NZ
                {
                mRULE_NZ(); 

                }
                break;
            case 10 :
                // InternalMyDsl.g:1:67: RULE_A
                {
                mRULE_A(); 

                }
                break;
            case 11 :
                // InternalMyDsl.g:1:74: RULE_HP
                {
                mRULE_HP(); 

                }
                break;
            case 12 :
                // InternalMyDsl.g:1:82: RULE_E
                {
                mRULE_E(); 

                }
                break;
            case 13 :
                // InternalMyDsl.g:1:89: RULE_P
                {
                mRULE_P(); 

                }
                break;
            case 14 :
                // InternalMyDsl.g:1:96: RULE_FS
                {
                mRULE_FS(); 

                }
                break;
            case 15 :
                // InternalMyDsl.g:1:104: RULE_IS
                {
                mRULE_IS(); 

                }
                break;
            case 16 :
                // InternalMyDsl.g:1:112: RULE_CP
                {
                mRULE_CP(); 

                }
                break;
            case 17 :
                // InternalMyDsl.g:1:120: RULE_SP
                {
                mRULE_SP(); 

                }
                break;
            case 18 :
                // InternalMyDsl.g:1:128: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 19 :
                // InternalMyDsl.g:1:136: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 20 :
                // InternalMyDsl.g:1:144: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 21 :
                // InternalMyDsl.g:1:153: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 22 :
                // InternalMyDsl.g:1:165: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 23 :
                // InternalMyDsl.g:1:181: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 24 :
                // InternalMyDsl.g:1:197: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA4_eotS =
        "\1\3\1\6\5\uffff\1\10\2\uffff";
    static final String DFA4_eofS =
        "\12\uffff";
    static final String DFA4_minS =
        "\1\141\2\101\1\uffff\1\137\2\uffff\1\141\2\uffff";
    static final String DFA4_maxS =
        "\1\172\1\154\1\132\1\uffff\1\137\2\uffff\1\172\2\uffff";
    static final String DFA4_acceptS =
        "\3\uffff\1\5\1\uffff\1\3\1\1\1\uffff\1\2\1\4";
    static final String DFA4_specialS =
        "\12\uffff}>";
    static final String[] DFA4_transitionS = {
            "\13\2\1\1\16\2",
            "\32\4\21\uffff\1\5",
            "\32\4",
            "",
            "\1\7",
            "",
            "",
            "\32\11",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "351:22: ( 'l' | RULE_L | 'l' 'l' | RULE_L RULE_L )?";
        }
    }
    static final String DFA5_eotS =
        "\1\uffff\1\6\1\uffff\1\6\3\uffff\1\10\1\uffff\1\10\1\uffff";
    static final String DFA5_eofS =
        "\13\uffff";
    static final String DFA5_minS =
        "\1\141\2\101\1\137\1\uffff\1\137\1\uffff\1\141\1\uffff\1\101\1\uffff";
    static final String DFA5_maxS =
        "\1\172\1\154\1\132\1\137\1\uffff\1\137\1\uffff\1\172\1\uffff\1\132\1\uffff";
    static final String DFA5_acceptS =
        "\4\uffff\1\3\1\uffff\1\1\1\uffff\1\2\1\uffff\1\4";
    static final String DFA5_specialS =
        "\13\uffff}>";
    static final String[] DFA5_transitionS = {
            "\13\2\1\1\16\2",
            "\24\5\1\3\5\5\21\uffff\1\4",
            "\32\5",
            "\1\7",
            "",
            "\1\7",
            "",
            "\24\12\1\11\5\12",
            "",
            "\32\12",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "351:58: ( 'l' | RULE_L | 'l' 'l' | RULE_L RULE_L )";
        }
    }
    static final String DFA21_eotS =
        "\1\uffff\2\36\2\uffff\1\36\1\uffff\2\46\1\51\2\36\1\53\2\36\1\53\1\60\1\53\1\36\1\60\1\uffff\1\32\1\uffff\3\32\1\uffff\3\36\1\uffff\2\36\3\uffff\1\36\7\uffff\3\60\1\75\1\uffff\1\60\1\36\4\uffff\1\36\1\60\4\36\1\uffff\1\36\1\60\2\36\1\60\3\36\1\115\1\60\1\36\1\uffff\3\36\1\uffff\2\36\1\60\1\125\3\36\1\uffff\1\131\1\60\1\132\2\uffff";
    static final String DFA21_eofS =
        "\133\uffff";
    static final String DFA21_minS =
        "\1\0\1\101\1\53\2\uffff\1\101\1\uffff\3\60\2\53\1\60\1\53\1\101\3\60\1\101\1\60\1\uffff\1\101\1\uffff\2\0\1\52\1\uffff\1\164\1\60\1\137\1\uffff\2\164\3\uffff\1\156\7\uffff\4\60\1\uffff\1\60\1\101\4\uffff\1\141\1\60\1\56\1\151\1\145\1\171\1\uffff\1\137\1\60\1\164\1\56\1\60\1\101\1\164\1\156\2\60\1\171\1\uffff\1\137\1\171\1\144\1\uffff\1\101\1\160\2\60\1\163\1\137\1\145\1\uffff\3\60\2\uffff";
    static final String DFA21_maxS =
        "\1\uffff\1\141\1\173\2\uffff\1\141\1\uffff\1\71\1\170\1\71\2\173\1\172\1\173\1\132\3\172\1\132\1\172\1\uffff\1\172\1\uffff\2\uffff\1\57\1\uffff\1\164\2\137\1\uffff\2\164\3\uffff\1\156\7\uffff\4\172\1\uffff\1\172\1\132\4\uffff\1\141\1\172\1\56\1\151\1\145\1\171\1\uffff\1\137\1\172\1\164\1\56\1\172\1\132\1\164\1\156\2\172\1\171\1\uffff\1\137\1\171\1\144\1\uffff\1\132\1\160\2\172\1\163\1\137\1\145\1\uffff\3\172\2\uffff";
    static final String DFA21_acceptS =
        "\3\uffff\1\4\1\5\1\uffff\1\7\15\uffff\1\22\1\uffff\1\23\3\uffff\1\30\3\uffff\1\23\2\uffff\1\14\1\4\1\5\1\uffff\1\7\1\10\1\24\1\13\1\11\1\15\1\16\4\uffff\1\17\2\uffff\1\22\1\25\1\26\1\27\6\uffff\1\21\13\uffff\1\12\3\uffff\1\6\7\uffff\1\2\3\uffff\1\3\1\1";
    static final String DFA21_specialS =
        "\1\1\26\uffff\1\0\1\2\102\uffff}>";
    static final String[] DFA21_transitionS = {
            "\11\32\2\24\1\32\2\24\22\32\1\24\1\32\1\27\4\32\1\30\7\32\1\31\1\10\7\7\2\11\1\6\6\32\4\26\1\13\6\26\1\21\3\26\1\15\4\26\1\23\5\26\3\32\1\25\1\26\1\32\3\16\1\1\1\2\1\14\5\22\1\17\1\5\2\22\1\12\4\22\1\20\5\22\1\3\1\32\1\4\uff82\32",
            "\6\34\24\35\6\uffff\1\33",
            "\1\41\1\uffff\1\41\23\uffff\6\34\24\35\23\uffff\1\37\11\uffff\1\40\2\uffff\1\41",
            "",
            "",
            "\32\35\6\uffff\1\44",
            "",
            "\12\47",
            "\12\47\36\uffff\1\50\37\uffff\1\50",
            "\12\47",
            "\1\52\1\uffff\1\52\23\uffff\32\35\40\uffff\1\52",
            "\1\41\1\uffff\1\41\115\uffff\1\41",
            "\12\36\7\uffff\6\34\24\35\4\uffff\1\36\1\uffff\32\36",
            "\1\52\1\uffff\1\52\115\uffff\1\52",
            "\6\34\24\35",
            "\12\36\7\uffff\24\35\1\54\5\35\4\uffff\1\36\1\uffff\13\36\1\55\10\36\1\56\5\36",
            "\10\36\1\57\1\36\7\uffff\32\35\4\uffff\1\36\1\uffff\13\62\1\61\16\62",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\32\35",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\13\62\1\61\16\62",
            "",
            "\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\0\64",
            "\0\64",
            "\1\65\4\uffff\1\66",
            "",
            "\1\67",
            "\1\71\56\uffff\1\70",
            "\1\70",
            "",
            "\1\72",
            "\1\73",
            "",
            "",
            "",
            "\1\74",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\70\1\uffff\32\36",
            "\12\36\7\uffff\24\36\1\56\5\36\4\uffff\1\36\1\uffff\24\36\1\56\5\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\12\36\7\uffff\32\76\4\uffff\1\36\1\uffff\13\36\1\77\16\36",
            "\32\76",
            "",
            "",
            "",
            "",
            "\1\100",
            "\1\101\11\36\7\uffff\24\36\1\56\5\36\4\uffff\1\36\1\uffff\24\103\1\102\5\103",
            "\1\53",
            "\1\104",
            "\1\105",
            "\1\106",
            "",
            "\1\107",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\110",
            "\1\111",
            "\12\36\7\uffff\32\112\4\uffff\1\36\1\uffff\32\36",
            "\32\112",
            "\1\113",
            "\1\114",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\116",
            "\1\117",
            "",
            "\1\120",
            "\1\121",
            "\1\122",
            "",
            "\32\123",
            "\1\124",
            "\12\36\7\uffff\24\36\1\56\5\36\4\uffff\1\36\1\uffff\24\36\1\56\5\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\126",
            "\1\127",
            "\1\130",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | RULE_O | RULE_NZ | RULE_A | RULE_HP | RULE_E | RULE_P | RULE_FS | RULE_IS | RULE_CP | RULE_SP | RULE_WS | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_23 = input.LA(1);

                        s = -1;
                        if ( ((LA21_23>='\u0000' && LA21_23<='\uFFFF')) ) {s = 52;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA21_0 = input.LA(1);

                        s = -1;
                        if ( (LA21_0=='d') ) {s = 1;}

                        else if ( (LA21_0=='e') ) {s = 2;}

                        else if ( (LA21_0=='{') ) {s = 3;}

                        else if ( (LA21_0=='}') ) {s = 4;}

                        else if ( (LA21_0=='m') ) {s = 5;}

                        else if ( (LA21_0==':') ) {s = 6;}

                        else if ( ((LA21_0>='1' && LA21_0<='7')) ) {s = 7;}

                        else if ( (LA21_0=='0') ) {s = 8;}

                        else if ( ((LA21_0>='8' && LA21_0<='9')) ) {s = 9;}

                        else if ( (LA21_0=='p') ) {s = 10;}

                        else if ( (LA21_0=='E') ) {s = 11;}

                        else if ( (LA21_0=='f') ) {s = 12;}

                        else if ( (LA21_0=='P') ) {s = 13;}

                        else if ( ((LA21_0>='a' && LA21_0<='c')) ) {s = 14;}

                        else if ( (LA21_0=='l') ) {s = 15;}

                        else if ( (LA21_0=='u') ) {s = 16;}

                        else if ( (LA21_0=='L') ) {s = 17;}

                        else if ( ((LA21_0>='g' && LA21_0<='k')||(LA21_0>='n' && LA21_0<='o')||(LA21_0>='q' && LA21_0<='t')||(LA21_0>='v' && LA21_0<='z')) ) {s = 18;}

                        else if ( (LA21_0=='U') ) {s = 19;}

                        else if ( ((LA21_0>='\t' && LA21_0<='\n')||(LA21_0>='\f' && LA21_0<='\r')||LA21_0==' ') ) {s = 20;}

                        else if ( (LA21_0=='^') ) {s = 21;}

                        else if ( ((LA21_0>='A' && LA21_0<='D')||(LA21_0>='F' && LA21_0<='K')||(LA21_0>='M' && LA21_0<='O')||(LA21_0>='Q' && LA21_0<='T')||(LA21_0>='V' && LA21_0<='Z')||LA21_0=='_') ) {s = 22;}

                        else if ( (LA21_0=='\"') ) {s = 23;}

                        else if ( (LA21_0=='\'') ) {s = 24;}

                        else if ( (LA21_0=='/') ) {s = 25;}

                        else if ( ((LA21_0>='\u0000' && LA21_0<='\b')||LA21_0=='\u000B'||(LA21_0>='\u000E' && LA21_0<='\u001F')||LA21_0=='!'||(LA21_0>='#' && LA21_0<='&')||(LA21_0>='(' && LA21_0<='.')||(LA21_0>=';' && LA21_0<='@')||(LA21_0>='[' && LA21_0<=']')||LA21_0=='`'||LA21_0=='|'||(LA21_0>='~' && LA21_0<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA21_24 = input.LA(1);

                        s = -1;
                        if ( ((LA21_24>='\u0000' && LA21_24<='\uFFFF')) ) {s = 52;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}