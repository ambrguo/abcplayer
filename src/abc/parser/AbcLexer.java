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
    T__0=1, T__1=2, INDEX=3, TITLE=4, COMPOSER=5, LENGTH=6, METER=7, TEMPO=8, 
    KEY=9, NUMBER=10, NEWLINE=11, LETTER=12, NOTE=13, REST=14, OCTAVE=15, 
    ACCIDENTAL=16, DUPLET=17, TRIPLET=18, QUADRUPLET=19, BARLINE=20, BEGIN_REPEAT=21, 
    END_REPEAT=22, ONE_REPEAT=23, TWO_REPEAT=24, SPACES=25;
  public static String[] modeNames = {
    "DEFAULT_MODE"
  };

  public static final String[] ruleNames = {
    "T__0", "T__1", "INDEX", "TITLE", "COMPOSER", "LENGTH", "METER", "TEMPO", 
    "KEY", "NUMBER", "NEWLINE", "LETTER", "NOTE", "REST", "OCTAVE", "ACCIDENTAL", 
    "DUPLET", "TRIPLET", "QUADRUPLET", "BARLINE", "BEGIN_REPEAT", "END_REPEAT", 
    "ONE_REPEAT", "TWO_REPEAT", "SPACES"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'['", "']'", null, null, null, null, null, null, null, null, 
    null, null, null, null, null, null, null, null, null, null, "'|:'", 
    "':|'", "'[1'", "'[2'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, "INDEX", "TITLE", "COMPOSER", "LENGTH", "METER", "TEMPO", 
    "KEY", "NUMBER", "NEWLINE", "LETTER", "NOTE", "REST", "OCTAVE", "ACCIDENTAL", 
    "DUPLET", "TRIPLET", "QUADRUPLET", "BARLINE", "BEGIN_REPEAT", "END_REPEAT", 
    "ONE_REPEAT", "TWO_REPEAT", "SPACES"
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\33\u00f6\b\1\4"+
      "\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
      "\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
      "\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
      "\4\30\t\30\4\31\t\31\4\32\t\32\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
      "\7\4?\n\4\f\4\16\4B\13\4\3\4\3\4\3\5\3\5\3\5\3\5\6\5J\n\5\r\5\16\5"+
      "K\3\5\3\5\3\6\3\6\3\6\3\6\6\6T\n\6\r\6\16\6U\3\6\3\6\3\7\3\7\3\7\3"+
      "\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bl\n"+
      "\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tx\n\t\3\t\3\t\3\t\3"+
      "\n\3\n\3\n\3\n\3\n\5\n\u0082\n\n\3\n\5\n\u0085\n\n\3\n\3\n\3\13\6"+
      "\13\u008a\n\13\r\13\16\13\u008b\3\f\6\f\u008f\n\f\r\f\16\f\u0090\3"+
      "\r\3\r\3\16\3\16\3\16\3\16\7\16\u0099\n\16\f\16\16\16\u009c\13\16"+
      "\3\16\3\16\6\16\u00a0\n\16\r\16\16\16\u00a1\3\16\6\16\u00a5\n\16\r"+
      "\16\16\16\u00a6\3\16\5\16\u00aa\n\16\3\16\5\16\u00ad\n\16\3\17\3\17"+
      "\7\17\u00b1\n\17\f\17\16\17\u00b4\13\17\3\17\3\17\6\17\u00b8\n\17"+
      "\r\17\16\17\u00b9\3\17\6\17\u00bd\n\17\r\17\16\17\u00be\3\17\5\17"+
      "\u00c2\n\17\3\17\5\17\u00c5\n\17\3\20\7\20\u00c8\n\20\f\20\16\20\u00cb"+
      "\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00d4\n\21\3\22\3\22"+
      "\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\5\25\u00e2\n\25"+
      "\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32"+
      "\6\32\u00f1\n\32\r\32\16\32\u00f2\3\32\3\32\2\2\33\3\3\5\4\7\5\t\6"+
      "\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
      "%\24\'\25)\26+\27-\30/\31\61\32\63\33\3\2\13\13\2\"#%%(+..\60\60\62"+
      ";AAC\\c|\b\2\"\"))\60\60\62;C\\c|\5\2%%))dd\3\2\62;\4\2\f\f\17\17"+
      "\4\2CIci\3\2\63;\4\2))..\3\2\"\"\u0115\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
      "\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
      "\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
      "\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
      "\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
      "\2\2\2\63\3\2\2\2\3\65\3\2\2\2\5\67\3\2\2\2\79\3\2\2\2\tE\3\2\2\2"+
      "\13O\3\2\2\2\rY\3\2\2\2\17a\3\2\2\2\21o\3\2\2\2\23|\3\2\2\2\25\u0089"+
      "\3\2\2\2\27\u008e\3\2\2\2\31\u0092\3\2\2\2\33\u0094\3\2\2\2\35\u00ae"+
      "\3\2\2\2\37\u00c9\3\2\2\2!\u00d3\3\2\2\2#\u00d5\3\2\2\2%\u00d8\3\2"+
      "\2\2\'\u00db\3\2\2\2)\u00e1\3\2\2\2+\u00e3\3\2\2\2-\u00e6\3\2\2\2"+
      "/\u00e9\3\2\2\2\61\u00ec\3\2\2\2\63\u00f0\3\2\2\2\65\66\7]\2\2\66"+
      "\4\3\2\2\2\678\7_\2\28\6\3\2\2\29:\7Z\2\2:;\7<\2\2;<\3\2\2\2<@\5\25"+
      "\13\2=?\7\"\2\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2"+
      "B@\3\2\2\2CD\5\27\f\2D\b\3\2\2\2EF\7V\2\2FG\7<\2\2GI\3\2\2\2HJ\t\2"+
      "\2\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2LM\3\2\2\2MN\5\27\f\2"+
      "N\n\3\2\2\2OP\7E\2\2PQ\7<\2\2QS\3\2\2\2RT\t\3\2\2SR\3\2\2\2TU\3\2"+
      "\2\2US\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\5\27\f\2X\f\3\2\2\2YZ\7N\2\2"+
      "Z[\7<\2\2[\\\3\2\2\2\\]\5\25\13\2]^\7\61\2\2^_\5\25\13\2_`\5\27\f"+
      "\2`\16\3\2\2\2ab\7O\2\2bc\7<\2\2ck\3\2\2\2dl\7E\2\2ef\7E\2\2fl\7~"+
      "\2\2gh\5\25\13\2hi\7\61\2\2ij\5\25\13\2jl\3\2\2\2kd\3\2\2\2ke\3\2"+
      "\2\2kg\3\2\2\2lm\3\2\2\2mn\5\27\f\2n\20\3\2\2\2op\7S\2\2pq\7<\2\2"+
      "qw\3\2\2\2rs\5\25\13\2st\7\61\2\2tu\5\25\13\2uv\7?\2\2vx\3\2\2\2w"+
      "r\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\5\25\13\2z{\5\27\f\2{\22\3\2\2\2|"+
      "}\7M\2\2}~\7<\2\2~\177\3\2\2\2\177\u0081\5\31\r\2\u0080\u0082\t\4"+
      "\2\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083"+
      "\u0085\7o\2\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086"+
      "\3\2\2\2\u0086\u0087\5\27\f\2\u0087\24\3\2\2\2\u0088\u008a\t\5\2\2"+
      "\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b"+
      "\u008c\3\2\2\2\u008c\26\3\2\2\2\u008d\u008f\t\6\2\2\u008e\u008d\3"+
      "\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2"+
      "\u0091\30\3\2\2\2\u0092\u0093\t\7\2\2\u0093\32\3\2\2\2\u0094\u0095"+
      "\5!\21\2\u0095\u0096\5\31\r\2\u0096\u00ac\5\37\20\2\u0097\u0099\t"+
      "\b\2\2\u0098\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2"+
      "\u009a\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d"+
      "\u009f\7\61\2\2\u009e\u00a0\t\b\2\2\u009f\u009e\3\2\2\2\u00a0\u00a1"+
      "\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00ad\3\2\2"+
      "\2\u00a3\u00a5\t\b\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
      "\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00aa"+
      "\7\61\2\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ad\3\2"+
      "\2\2\u00ab\u00ad\7\61\2\2\u00ac\u009a\3\2\2\2\u00ac\u00a4\3\2\2\2"+
      "\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\34\3\2\2\2\u00ae\u00c4"+
      "\7|\2\2\u00af\u00b1\t\b\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b4\3\2\2"+
      "\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4"+
      "\u00b2\3\2\2\2\u00b5\u00b7\7\61\2\2\u00b6\u00b8\t\b\2\2\u00b7\u00b6"+
      "\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2"+
      "\2\u00ba\u00c5\3\2\2\2\u00bb\u00bd\t\b\2\2\u00bc\u00bb\3\2\2\2\u00bd"+
      "\u00be\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1"+
      "\3\2\2\2\u00c0\u00c2\7\61\2\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2"+
      "\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c5\7\61\2\2\u00c4\u00b2\3\2\2\2"+
      "\u00c4\u00bc\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
      "\36\3\2\2\2\u00c6\u00c8\t\t\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3"+
      "\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca \3\2\2\2\u00cb"+
      "\u00c9\3\2\2\2\u00cc\u00d4\7`\2\2\u00cd\u00ce\7`\2\2\u00ce\u00d4\7"+
      "`\2\2\u00cf\u00d4\7a\2\2\u00d0\u00d1\7a\2\2\u00d1\u00d4\7a\2\2\u00d2"+
      "\u00d4\7?\2\2\u00d3\u00cc\3\2\2\2\u00d3\u00cd\3\2\2\2\u00d3\u00cf"+
      "\3\2\2\2\u00d3\u00d0\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2"+
      "\2\u00d4\"\3\2\2\2\u00d5\u00d6\7*\2\2\u00d6\u00d7\7\64\2\2\u00d7$"+
      "\3\2\2\2\u00d8\u00d9\7*\2\2\u00d9\u00da\7\65\2\2\u00da&\3\2\2\2\u00db"+
      "\u00dc\7*\2\2\u00dc\u00dd\7\66\2\2\u00dd(\3\2\2\2\u00de\u00e2\7~\2"+
      "\2\u00df\u00e0\7]\2\2\u00e0\u00e2\7~\2\2\u00e1\u00de\3\2\2\2\u00e1"+
      "\u00df\3\2\2\2\u00e2*\3\2\2\2\u00e3\u00e4\7~\2\2\u00e4\u00e5\7<\2"+
      "\2\u00e5,\3\2\2\2\u00e6\u00e7\7<\2\2\u00e7\u00e8\7~\2\2\u00e8.\3\2"+
      "\2\2\u00e9\u00ea\7]\2\2\u00ea\u00eb\7\63\2\2\u00eb\60\3\2\2\2\u00ec"+
      "\u00ed\7]\2\2\u00ed\u00ee\7\64\2\2\u00ee\62\3\2\2\2\u00ef\u00f1\t"+
      "\n\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f0\3\2\2\2"+
      "\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\b\32\2\2\u00f5"+
      "\64\3\2\2\2\32\2@KUkw\u0081\u0084\u008b\u0090\u009a\u00a1\u00a6\u00a9"+
      "\u00ac\u00b2\u00b9\u00be\u00c1\u00c4\u00c9\u00d3\u00e1\u00f2\3\b\2"+
      "\2";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}