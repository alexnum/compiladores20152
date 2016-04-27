package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_O", "RULE_D", "RULE_NZ", "RULE_L", "RULE_A", "RULE_H", "RULE_HP", "RULE_E", "RULE_P", "RULE_FS", "RULE_ES", "RULE_IS", "RULE_CP", "RULE_SP", "RULE_WS", "RULE_AUTO", "RULE_BREAK", "RULE_CASE", "RULE_CHAR", "RULE_CONST", "RULE_CONTINUE", "RULE_DEFAULT", "RULE_DO", "RULE_DOUBLE", "RULE_ELSE", "RULE_ENUM", "RULE_EXTERN", "RULE_FLOAT", "RULE_FOR", "RULE_GOTO", "RULE_IF", "RULE_INLINE", "RULE_INTZ", "RULE_LONG", "RULE_REGISTER", "RULE_RESTRICT", "RULE_RETURN", "RULE_SHORT", "RULE_SIGNED", "RULE_SIZEOF", "RULE_STATIC", "RULE_STRUCT", "RULE_SWITCH", "RULE_TYPEDEF", "RULE_UNION", "RULE_UNSIGNED", "RULE_VOID", "RULE_VOLATILE", "RULE_WHILE", "RULE_ALIGNAS", "RULE_ALIGNOF", "RULE_ATOMIC", "RULE_BOOL", "RULE_COMPLEX", "RULE_GENERIC", "RULE_IMAGINARY", "RULE_NORETURN", "RULE_STATIC_ASSERT", "RULE_THREAD_LOCAL", "RULE_FUNC_NAME", "RULE_I_CONSTANT", "RULE_F_CONSTANT", "RULE_STRING_LITERAL", "RULE_ELLIPSIS", "RULE_RIGHT_ASSIGN", "RULE_LEFT_ASSIGN", "RULE_ADD_ASSIGN", "RULE_SUB_ASSIGN", "RULE_MUL_ASSIGN", "RULE_DIV_ASSIGN", "RULE_MOD_ASSIGN", "RULE_AND_ASSIGN", "RULE_XOR_ASSIGN", "RULE_OR_ASSIGN", "RULE_RIGHT_OP", "RULE_LEFT_OP", "RULE_INC_OP", "RULE_DEC_OP", "RULE_PTR_OP", "RULE_AND_OP", "RULE_OR_OP", "RULE_LE_OP", "RULE_GE_OP", "RULE_EQ_OP", "RULE_NE_OP", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'datatype'", "'entity'", "'extends'", "'{'", "'}'", "'many'", "':'"
    };
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


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Domainmodel";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDomainmodel"
    // InternalMyDsl.g:64:1: entryRuleDomainmodel returns [EObject current=null] : iv_ruleDomainmodel= ruleDomainmodel EOF ;
    public final EObject entryRuleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainmodel = null;


        try {
            // InternalMyDsl.g:64:52: (iv_ruleDomainmodel= ruleDomainmodel EOF )
            // InternalMyDsl.g:65:2: iv_ruleDomainmodel= ruleDomainmodel EOF
            {
             newCompositeNode(grammarAccess.getDomainmodelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomainmodel=ruleDomainmodel();

            state._fsp--;

             current =iv_ruleDomainmodel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // InternalMyDsl.g:71:1: ruleDomainmodel returns [EObject current=null] : ( (lv_elements_0_0= ruleType ) )* ;
    public final EObject ruleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_elements_0_0= ruleType ) )* )
            // InternalMyDsl.g:78:2: ( (lv_elements_0_0= ruleType ) )*
            {
            // InternalMyDsl.g:78:2: ( (lv_elements_0_0= ruleType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=95 && LA1_0<=96)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: (lv_elements_0_0= ruleType )
            	    {
            	    // InternalMyDsl.g:79:3: (lv_elements_0_0= ruleType )
            	    // InternalMyDsl.g:80:4: lv_elements_0_0= ruleType
            	    {

            	    				newCompositeNode(grammarAccess.getDomainmodelAccess().getElementsTypeParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleType();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getDomainmodelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"org.xtext.example.mydsl.MyDsl.Type");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRuleType"
    // InternalMyDsl.g:100:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalMyDsl.g:100:45: (iv_ruleType= ruleType EOF )
            // InternalMyDsl.g:101:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalMyDsl.g:107:1: ruleType returns [EObject current=null] : (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_DataType_0 = null;

        EObject this_Entity_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity ) )
            // InternalMyDsl.g:114:2: (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity )
            {
            // InternalMyDsl.g:114:2: (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==95) ) {
                alt2=1;
            }
            else if ( (LA2_0==96) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:115:3: this_DataType_0= ruleDataType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataType_0=ruleDataType();

                    state._fsp--;


                    			current = this_DataType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:124:3: this_Entity_1= ruleEntity
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getEntityParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Entity_1=ruleEntity();

                    state._fsp--;


                    			current = this_Entity_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleDataType"
    // InternalMyDsl.g:136:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalMyDsl.g:136:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalMyDsl.g:137:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalMyDsl.g:143:1: ruleDataType returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:149:2: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:150:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:150:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:151:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,95,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDatatypeKeyword_0());
            		
            // InternalMyDsl.g:155:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:156:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:156:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:157:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleEntity"
    // InternalMyDsl.g:177:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalMyDsl.g:177:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalMyDsl.g:178:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalMyDsl.g:184:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_features_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:190:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' ) )
            // InternalMyDsl.g:191:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' )
            {
            // InternalMyDsl.g:191:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' )
            // InternalMyDsl.g:192:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,96,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalMyDsl.g:196:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:197:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:197:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:198:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:214:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==97) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:215:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,97,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getExtendsKeyword_2_0());
                    			
                    // InternalMyDsl.g:219:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMyDsl.g:220:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMyDsl.g:220:5: (otherlv_3= RULE_ID )
                    // InternalMyDsl.g:221:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,98,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:237:3: ( (lv_features_5_0= ruleFeature ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||LA4_0==100) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:238:4: (lv_features_5_0= ruleFeature )
            	    {
            	    // InternalMyDsl.g:238:4: (lv_features_5_0= ruleFeature )
            	    // InternalMyDsl.g:239:5: lv_features_5_0= ruleFeature
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_features_5_0=ruleFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_5_0,
            	    						"org.xtext.example.mydsl.MyDsl.Feature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,99,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleFeature"
    // InternalMyDsl.g:264:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalMyDsl.g:264:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalMyDsl.g:265:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalMyDsl.g:271:1: ruleFeature returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:277:2: ( ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalMyDsl.g:278:2: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalMyDsl.g:278:2: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            // InternalMyDsl.g:279:3: ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
            {
            // InternalMyDsl.g:279:3: ( (lv_many_0_0= 'many' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==100) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:280:4: (lv_many_0_0= 'many' )
                    {
                    // InternalMyDsl.g:280:4: (lv_many_0_0= 'many' )
                    // InternalMyDsl.g:281:5: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,100,FOLLOW_4); 

                    					newLeafNode(lv_many_0_0, grammarAccess.getFeatureAccess().getManyManyKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFeatureRule());
                    					}
                    					setWithLastConsumed(current, "many", true, "many");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:293:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:294:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:294:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:295:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFeatureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,101,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getFeatureAccess().getColonKeyword_2());
            		
            // InternalMyDsl.g:315:3: ( (otherlv_3= RULE_ID ) )
            // InternalMyDsl.g:316:4: (otherlv_3= RULE_ID )
            {
            // InternalMyDsl.g:316:4: (otherlv_3= RULE_ID )
            // InternalMyDsl.g:317:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFeatureRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getFeatureAccess().getTypeTypeCrossReference_3_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeature"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000002L,0x0000000180000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000000L,0x0000000600000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L,0x0000001800000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});

}