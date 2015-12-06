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
    T__0=1, T__1=2, NEWLINE=3, LETTER=4, REST=5, SPACE=6, DURATION=7, OCTAVE=8, 
    ACCIDENTAL=9, DUPLET=10, TRIPLET=11, QUADRUPLET=12, BARLINE=13, BEGIN_REPEAT=14, 
    END_REPEAT=15, ONE_REPEAT=16, TWO_REPEAT=17, VOICE_PREFIX=18, SPACES=19, 
    PERCENT=20;
  public static String[] modeNames = {
    "DEFAULT_MODE"
  };

  public static final String[] ruleNames = {
    "T__0", "T__1", "NEWLINE", "LETTER", "REST", "SPACE", "DURATION", "OCTAVE", 
    "ACCIDENTAL", "DUPLET", "TRIPLET", "QUADRUPLET", "BARLINE", "BEGIN_REPEAT", 
    "END_REPEAT", "ONE_REPEAT", "TWO_REPEAT", "VOICE_PREFIX", "SPACES", 
    "PERCENT"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'['", "']'", null, null, "'z'", "' '", null, null, null, null, 
    null, null, null, "'|:'", "':|'", "'[1'", "'[2'", "'V:'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, "NEWLINE", "LETTER", "REST", "SPACE", "DURATION", 
    "OCTAVE", "ACCIDENTAL", "DUPLET", "TRIPLET", "QUADRUPLET", "BARLINE", 
    "BEGIN_REPEAT", "END_REPEAT", "ONE_REPEAT", "TWO_REPEAT", "VOICE_PREFIX", 
    "SPACES", "PERCENT"
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\26\u0087\b\1\4"+
      "\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
      "\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
      "\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4"+
      "\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\6\b9\n\b\r\b\16\b:\3\b\3\b\3\b\3"+
      "\b\7\bA\n\b\f\b\16\bD\13\b\3\b\3\b\7\bH\n\b\f\b\16\bK\13\b\5\bM\n"+
      "\b\3\t\6\tP\n\t\r\t\16\tQ\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n[\n\n\3\13"+
      "\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\5\16i\n\16\3\17"+
      "\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23"+
      "\3\23\3\24\6\24{\n\24\r\24\16\24|\3\24\3\24\3\25\6\25\u0082\n\25\r"+
      "\25\16\25\u0083\3\25\3\25\2\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
      "\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26\3"+
      "\2\b\4\2\f\f\17\17\4\2CIci\3\2\63;\4\2))..\3\2\"\"\3\2\'\'\u0093\2"+
      "\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3"+
      "\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
      "\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
      "\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5-\3"+
      "\2\2\2\7/\3\2\2\2\t\61\3\2\2\2\13\63\3\2\2\2\r\65\3\2\2\2\17L\3\2"+
      "\2\2\21O\3\2\2\2\23Z\3\2\2\2\25\\\3\2\2\2\27_\3\2\2\2\31b\3\2\2\2"+
      "\33h\3\2\2\2\35j\3\2\2\2\37m\3\2\2\2!p\3\2\2\2#s\3\2\2\2%v\3\2\2\2"+
      "\'z\3\2\2\2)\u0081\3\2\2\2+,\7]\2\2,\4\3\2\2\2-.\7_\2\2.\6\3\2\2\2"+
      "/\60\t\2\2\2\60\b\3\2\2\2\61\62\t\3\2\2\62\n\3\2\2\2\63\64\7|\2\2"+
      "\64\f\3\2\2\2\65\66\7\"\2\2\66\16\3\2\2\2\679\t\4\2\28\67\3\2\2\2"+
      "9:\3\2\2\2:8\3\2\2\2:;\3\2\2\2;M\3\2\2\2<=\7\"\2\2=>\7\61\2\2>M\7"+
      "\"\2\2?A\t\4\2\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2"+
      "DB\3\2\2\2EI\7\61\2\2FH\t\4\2\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3"+
      "\2\2\2JM\3\2\2\2KI\3\2\2\2L8\3\2\2\2L<\3\2\2\2LB\3\2\2\2M\20\3\2\2"+
      "\2NP\t\5\2\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\22\3\2\2\2S"+
      "[\7`\2\2TU\7`\2\2U[\7`\2\2V[\7a\2\2WX\7a\2\2X[\7a\2\2Y[\7?\2\2ZS\3"+
      "\2\2\2ZT\3\2\2\2ZV\3\2\2\2ZW\3\2\2\2ZY\3\2\2\2[\24\3\2\2\2\\]\7*\2"+
      "\2]^\7\64\2\2^\26\3\2\2\2_`\7*\2\2`a\7\65\2\2a\30\3\2\2\2bc\7*\2\2"+
      "cd\7\66\2\2d\32\3\2\2\2ei\7~\2\2fg\7]\2\2gi\7~\2\2he\3\2\2\2hf\3\2"+
      "\2\2i\34\3\2\2\2jk\7~\2\2kl\7<\2\2l\36\3\2\2\2mn\7<\2\2no\7~\2\2o"+
      " \3\2\2\2pq\7]\2\2qr\7\63\2\2r\"\3\2\2\2st\7]\2\2tu\7\64\2\2u$\3\2"+
      "\2\2vw\7X\2\2wx\7<\2\2x&\3\2\2\2y{\t\6\2\2zy\3\2\2\2{|\3\2\2\2|z\3"+
      "\2\2\2|}\3\2\2\2}~\3\2\2\2~\177\b\24\2\2\177(\3\2\2\2\u0080\u0082"+
      "\t\7\2\2\u0081\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2"+
      "\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\b\25\2\2\u0086"+
      "*\3\2\2\2\f\2:BILQZh|\u0083\3\b\2\2";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}