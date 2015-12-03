// Generated from Abc.g4 by ANTLR 4.5.1

package abc.parser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AbcLexer extends Lexer {
  static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache =
    new PredictionContextCache();
  public static final int
    T__0=1, T__1=2, T__2=3, T__3=4, NEWLINE=5, LETTER=6, DURATION=7, OCTAVE=8, 
    ACCIDENTAL=9, DUPLET=10, TRIPLET=11, QUADRUPLET=12, BARLINE=13, BEGIN_REPEAT=14, 
    END_REPEAT=15, ONE_REPEAT=16, TWO_REPEAT=17, VOICE_PREFIX=18, SPACES=19, 
    PERCENT=20;
  public static String[] modeNames = {
    "DEFAULT_MODE"
  };

  public static final String[] ruleNames = {
    "T__0", "T__1", "T__2", "T__3", "NEWLINE", "LETTER", "DURATION", "OCTAVE", 
    "ACCIDENTAL", "DUPLET", "TRIPLET", "QUADRUPLET", "BARLINE", "BEGIN_REPEAT", 
    "END_REPEAT", "ONE_REPEAT", "TWO_REPEAT", "VOICE_PREFIX", "SPACES", 
    "PERCENT"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "' '", "'z'", "'['", "']'", null, null, null, null, null, null, 
    null, null, null, "'|:'", "':|'", "'[1'", "'[2'", "'V:'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, "NEWLINE", "LETTER", "DURATION", "OCTAVE", 
    "ACCIDENTAL", "DUPLET", "TRIPLET", "QUADRUPLET", "BARLINE", "BEGIN_REPEAT", 
    "END_REPEAT", "ONE_REPEAT", "TWO_REPEAT", "VOICE_PREFIX", "SPACES", 
    "PERCENT"
  };
  public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

  /**
   * @deprecated Use {@link #VOCABULARY} instead.
   */
  @Deprecated
  public static final String[] tokenNames;
  static {
    tokenNames = new String[_SYMBOLIC_NAMES.length];
    for (int i = 0; i < tokenNames.length; i++) {
      tokenNames[i] = VOCABULARY.getLiteralName(i);
      if (tokenNames[i] == null) {
        tokenNames[i] = VOCABULARY.getSymbolicName(i);
      }

      if (tokenNames[i] == null) {
        tokenNames[i] = "<INVALID>";
      }
    }
  }

  @Override
  @Deprecated
  public String[] getTokenNames() {
    return tokenNames;
  }

  @Override

  public Vocabulary getVocabulary() {
    return VOCABULARY;
  }


      // This method makes the parser stop running if it encounters
      // invalid input and throw a RuntimeException.
      public void reportErrorsAsExceptions() {
          // To prevent any reports to standard error, add this line:
          //removeErrorListeners();
          
          addErrorListener(new BaseErrorListener() {
              public void syntaxError(Recognizer<?, ?> recognizer,
                                      Object offendingSymbol, 
                                      int line, int charPositionInLine,
                                      String msg, RecognitionException e) {
                  throw new ParseCancellationException(msg, e);
              }
          });
      }


  public AbcLexer(CharStream input) {
    super(input);
    _interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
  }

  @Override
  public String getGrammarFileName() { return "Abc.g4"; }

  @Override
  public String[] getRuleNames() { return ruleNames; }

  @Override
  public String getSerializedATN() { return _serializedATN; }

  @Override
  public String[] getModeNames() { return modeNames; }

  @Override
  public ATN getATN() { return _ATN; }

  public static final String _serializedATN =
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\26\u008a\b\1\4"+
      "\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
      "\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
      "\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4"+
      "\3\4\3\5\3\5\3\6\6\6\65\n\6\r\6\16\6\66\3\7\3\7\3\b\6\b<\n\b\r\b\16"+
      "\b=\3\b\3\b\3\b\3\b\7\bD\n\b\f\b\16\bG\13\b\3\b\3\b\7\bK\n\b\f\b\16"+
      "\bN\13\b\5\bP\n\b\3\t\6\tS\n\t\r\t\16\tT\3\n\3\n\3\n\3\n\3\n\3\n\3"+
      "\n\5\n^\n\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16"+
      "\5\16l\n\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22"+
      "\3\22\3\23\3\23\3\23\3\24\6\24~\n\24\r\24\16\24\177\3\24\3\24\3\25"+
      "\6\25\u0085\n\25\r\25\16\25\u0086\3\25\3\25\2\2\26\3\3\5\4\7\5\t\6"+
      "\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
      "%\24\'\25)\26\3\2\b\4\2\f\f\17\17\4\2CIci\3\2\63;\4\2))..\3\2\"\""+
      "\3\2\'\'\u0097\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
      "\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
      "\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
      "\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+"+
      "\3\2\2\2\5-\3\2\2\2\7/\3\2\2\2\t\61\3\2\2\2\13\64\3\2\2\2\r8\3\2\2"+
      "\2\17O\3\2\2\2\21R\3\2\2\2\23]\3\2\2\2\25_\3\2\2\2\27b\3\2\2\2\31"+
      "e\3\2\2\2\33k\3\2\2\2\35m\3\2\2\2\37p\3\2\2\2!s\3\2\2\2#v\3\2\2\2"+
      "%y\3\2\2\2\'}\3\2\2\2)\u0084\3\2\2\2+,\7\"\2\2,\4\3\2\2\2-.\7|\2\2"+
      ".\6\3\2\2\2/\60\7]\2\2\60\b\3\2\2\2\61\62\7_\2\2\62\n\3\2\2\2\63\65"+
      "\t\2\2\2\64\63\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67"+
      "\f\3\2\2\289\t\3\2\29\16\3\2\2\2:<\t\4\2\2;:\3\2\2\2<=\3\2\2\2=;\3"+
      "\2\2\2=>\3\2\2\2>P\3\2\2\2?@\7\"\2\2@A\7\61\2\2AP\7\"\2\2BD\t\4\2"+
      "\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2HL\7"+
      "\61\2\2IK\t\4\2\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MP\3\2\2"+
      "\2NL\3\2\2\2O;\3\2\2\2O?\3\2\2\2OE\3\2\2\2P\20\3\2\2\2QS\t\5\2\2R"+
      "Q\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\22\3\2\2\2V^\7`\2\2WX\7`"+
      "\2\2X^\7`\2\2Y^\7a\2\2Z[\7a\2\2[^\7a\2\2\\^\7?\2\2]V\3\2\2\2]W\3\2"+
      "\2\2]Y\3\2\2\2]Z\3\2\2\2]\\\3\2\2\2^\24\3\2\2\2_`\7*\2\2`a\7\64\2"+
      "\2a\26\3\2\2\2bc\7*\2\2cd\7\65\2\2d\30\3\2\2\2ef\7*\2\2fg\7\66\2\2"+
      "g\32\3\2\2\2hl\7~\2\2ij\7]\2\2jl\7~\2\2kh\3\2\2\2ki\3\2\2\2l\34\3"+
      "\2\2\2mn\7~\2\2no\7<\2\2o\36\3\2\2\2pq\7<\2\2qr\7~\2\2r \3\2\2\2s"+
      "t\7]\2\2tu\7\63\2\2u\"\3\2\2\2vw\7]\2\2wx\7\64\2\2x$\3\2\2\2yz\7X"+
      "\2\2z{\7<\2\2{&\3\2\2\2|~\t\6\2\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2"+
      "\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\b\24\2\2\u0082"+
      "(\3\2\2\2\u0083\u0085\t\7\2\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2"+
      "\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
      "\u0089\b\25\2\2\u0089*\3\2\2\2\r\2\66=ELOT]k\177\u0086\3\b\2\2";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}