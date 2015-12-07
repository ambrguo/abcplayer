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
    T__0=1, T__1=2, NEWLINE=3, LETTER=4, OTHER_LETTERS=5, REST=6, ZERO=7, 
    DURATION=8, OCTAVE=9, ACCIDENTAL=10, DUPLET=11, TRIPLET=12, QUADRUPLET=13, 
    BARLINE=14, BEGIN_REPEAT=15, END_REPEAT=16, ONE_REPEAT=17, TWO_REPEAT=18, 
    VOICE_PREFIX=19, SPACES=20, PERCENT=21;
  public static String[] modeNames = {
    "DEFAULT_MODE"
  };

  public static final String[] ruleNames = {
    "T__0", "T__1", "NEWLINE", "LETTER", "OTHER_LETTERS", "REST", "ZERO", 
    "DURATION", "OCTAVE", "ACCIDENTAL", "DUPLET", "TRIPLET", "QUADRUPLET", 
    "BARLINE", "BEGIN_REPEAT", "END_REPEAT", "ONE_REPEAT", "TWO_REPEAT", 
    "VOICE_PREFIX", "SPACES", "PERCENT"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'['", "']'", null, null, null, "'z'", "'0'", null, null, null, 
    null, null, null, null, "'|:'", "':|'", "'[1'", "'[2'", "'V:'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, "NEWLINE", "LETTER", "OTHER_LETTERS", "REST", "ZERO", 
    "DURATION", "OCTAVE", "ACCIDENTAL", "DUPLET", "TRIPLET", "QUADRUPLET", 
    "BARLINE", "BEGIN_REPEAT", "END_REPEAT", "ONE_REPEAT", "TWO_REPEAT", 
    "VOICE_PREFIX", "SPACES", "PERCENT"
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\27\u0090\b\1\4"+
      "\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
      "\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
      "\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3"+
      "\3\3\3\3\4\6\4\63\n\4\r\4\16\4\64\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b"+
      "\3\t\6\t@\n\t\r\t\16\tA\3\t\3\t\3\t\3\t\7\tH\n\t\f\t\16\tK\13\t\3"+
      "\t\3\t\7\tO\n\t\f\t\16\tR\13\t\5\tT\n\t\3\n\6\nW\n\n\r\n\16\nX\3\13"+
      "\3\13\3\13\3\13\3\13\3\13\3\13\5\13b\n\13\3\f\3\f\3\f\3\r\3\r\3\r"+
      "\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17r\n\17\3\20\3\20\3\20"+
      "\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25"+
      "\6\25\u0084\n\25\r\25\16\25\u0085\3\25\3\25\3\26\6\26\u008b\n\26\r"+
      "\26\16\26\u008c\3\26\3\26\2\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
      "\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
      "\3\2\t\4\2\f\f\17\17\4\2CIci\4\2J\\i{\3\2\63;\4\2))..\4\2\13\13\""+
      "\"\4\2\"\"\'\'\u009e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
      "\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
      "\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
      "\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
      "\2\2\2+\3\2\2\2\3-\3\2\2\2\5/\3\2\2\2\7\62\3\2\2\2\t\66\3\2\2\2\13"+
      "8\3\2\2\2\r:\3\2\2\2\17<\3\2\2\2\21S\3\2\2\2\23V\3\2\2\2\25a\3\2\2"+
      "\2\27c\3\2\2\2\31f\3\2\2\2\33i\3\2\2\2\35q\3\2\2\2\37s\3\2\2\2!v\3"+
      "\2\2\2#y\3\2\2\2%|\3\2\2\2\'\177\3\2\2\2)\u0083\3\2\2\2+\u008a\3\2"+
      "\2\2-.\7]\2\2.\4\3\2\2\2/\60\7_\2\2\60\6\3\2\2\2\61\63\t\2\2\2\62"+
      "\61\3\2\2\2\63\64\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\b\3\2\2\2"+
      "\66\67\t\3\2\2\67\n\3\2\2\289\t\4\2\29\f\3\2\2\2:;\7|\2\2;\16\3\2"+
      "\2\2<=\7\62\2\2=\20\3\2\2\2>@\t\5\2\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2"+
      "\2AB\3\2\2\2BT\3\2\2\2CD\7\"\2\2DE\7\61\2\2ET\7\"\2\2FH\t\5\2\2GF"+
      "\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LP\7\61"+
      "\2\2MO\t\5\2\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QT\3\2\2\2R"+
      "P\3\2\2\2S?\3\2\2\2SC\3\2\2\2SI\3\2\2\2T\22\3\2\2\2UW\t\6\2\2VU\3"+
      "\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\24\3\2\2\2Zb\7`\2\2[\\\7`\2"+
      "\2\\b\7`\2\2]b\7a\2\2^_\7a\2\2_b\7a\2\2`b\7?\2\2aZ\3\2\2\2a[\3\2\2"+
      "\2a]\3\2\2\2a^\3\2\2\2a`\3\2\2\2b\26\3\2\2\2cd\7*\2\2de\7\64\2\2e"+
      "\30\3\2\2\2fg\7*\2\2gh\7\65\2\2h\32\3\2\2\2ij\7*\2\2jk\7\66\2\2k\34"+
      "\3\2\2\2lr\7~\2\2mn\7]\2\2nr\7~\2\2op\7~\2\2pr\7_\2\2ql\3\2\2\2qm"+
      "\3\2\2\2qo\3\2\2\2r\36\3\2\2\2st\7~\2\2tu\7<\2\2u \3\2\2\2vw\7<\2"+
      "\2wx\7~\2\2x\"\3\2\2\2yz\7]\2\2z{\7\63\2\2{$\3\2\2\2|}\7]\2\2}~\7"+
      "\64\2\2~&\3\2\2\2\177\u0080\7X\2\2\u0080\u0081\7<\2\2\u0081(\3\2\2"+
      "\2\u0082\u0084\t\7\2\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
      "\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088"+
      "\b\25\2\2\u0088*\3\2\2\2\u0089\u008b\t\b\2\2\u008a\u0089\3\2\2\2\u008b"+
      "\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e"+
      "\3\2\2\2\u008e\u008f\b\26\2\2\u008f,\3\2\2\2\r\2\64AIPSXaq\u0085\u008c"+
      "\3\b\2\2";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}