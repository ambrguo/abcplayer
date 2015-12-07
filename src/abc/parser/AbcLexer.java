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
    END_REPEAT=15, ONE_REPEAT=16, TWO_REPEAT=17, VOICE_PREFIX=18, SPACES=19;
  public static String[] modeNames = {
    "DEFAULT_MODE"
  };

  public static final String[] ruleNames = {
    "T__0", "T__1", "NEWLINE", "LETTER", "REST", "SPACE", "DURATION", "OCTAVE", 
    "ACCIDENTAL", "DUPLET", "TRIPLET", "QUADRUPLET", "BARLINE", "BEGIN_REPEAT", 
    "END_REPEAT", "ONE_REPEAT", "TWO_REPEAT", "VOICE_PREFIX", "SPACES"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'['", "']'", null, null, "'z'", "' '", null, null, null, null, 
    null, null, null, "'|:'", "':|'", "'[1'", "'[2'", "'V:'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, "NEWLINE", "LETTER", "REST", "SPACE", "DURATION", 
    "OCTAVE", "ACCIDENTAL", "DUPLET", "TRIPLET", "QUADRUPLET", "BARLINE", 
    "BEGIN_REPEAT", "END_REPEAT", "ONE_REPEAT", "TWO_REPEAT", "VOICE_PREFIX", 
    "SPACES"
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\25\u0081\b\1\4"+
      "\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
      "\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
      "\t\21\4\22\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\4\6\4/\n\4\r"+
      "\4\16\4\60\3\5\3\5\3\6\3\6\3\7\3\7\3\b\6\b:\n\b\r\b\16\b;\3\b\3\b"+
      "\3\b\3\b\7\bB\n\b\f\b\16\bE\13\b\3\b\3\b\7\bI\n\b\f\b\16\bL\13\b\5"+
      "\bN\n\b\3\t\6\tQ\n\t\r\t\16\tR\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\\\n"+
      "\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\5\16j\n\16"+
      "\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23"+
      "\3\23\3\23\3\24\6\24|\n\24\r\24\16\24}\3\24\3\24\2\2\25\3\3\5\4\7"+
      "\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
      "!\22#\23%\24\'\25\3\2\7\4\2\f\f\17\17\4\2CIci\3\2\63;\4\2))..\3\2"+
      "\"\"\u008d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
      "\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2"+
      "\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
      "\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5+\3"+
      "\2\2\2\7.\3\2\2\2\t\62\3\2\2\2\13\64\3\2\2\2\r\66\3\2\2\2\17M\3\2"+
      "\2\2\21P\3\2\2\2\23[\3\2\2\2\25]\3\2\2\2\27`\3\2\2\2\31c\3\2\2\2\33"+
      "i\3\2\2\2\35k\3\2\2\2\37n\3\2\2\2!q\3\2\2\2#t\3\2\2\2%w\3\2\2\2\'"+
      "{\3\2\2\2)*\7]\2\2*\4\3\2\2\2+,\7_\2\2,\6\3\2\2\2-/\t\2\2\2.-\3\2"+
      "\2\2/\60\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\b\3\2\2\2\62\63\t\3"+
      "\2\2\63\n\3\2\2\2\64\65\7|\2\2\65\f\3\2\2\2\66\67\7\"\2\2\67\16\3"+
      "\2\2\28:\t\4\2\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<N\3\2\2\2"+
      "=>\7\"\2\2>?\7\61\2\2?N\7\"\2\2@B\t\4\2\2A@\3\2\2\2BE\3\2\2\2CA\3"+
      "\2\2\2CD\3\2\2\2DF\3\2\2\2EC\3\2\2\2FJ\7\61\2\2GI\t\4\2\2HG\3\2\2"+
      "\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KN\3\2\2\2LJ\3\2\2\2M9\3\2\2\2M=\3"+
      "\2\2\2MC\3\2\2\2N\20\3\2\2\2OQ\t\5\2\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2"+
      "\2RS\3\2\2\2S\22\3\2\2\2T\\\7`\2\2UV\7`\2\2V\\\7`\2\2W\\\7a\2\2XY"+
      "\7a\2\2Y\\\7a\2\2Z\\\7?\2\2[T\3\2\2\2[U\3\2\2\2[W\3\2\2\2[X\3\2\2"+
      "\2[Z\3\2\2\2\\\24\3\2\2\2]^\7*\2\2^_\7\64\2\2_\26\3\2\2\2`a\7*\2\2"+
      "ab\7\65\2\2b\30\3\2\2\2cd\7*\2\2de\7\66\2\2e\32\3\2\2\2fj\7~\2\2g"+
      "h\7]\2\2hj\7~\2\2if\3\2\2\2ig\3\2\2\2j\34\3\2\2\2kl\7~\2\2lm\7<\2"+
      "\2m\36\3\2\2\2no\7<\2\2op\7~\2\2p \3\2\2\2qr\7]\2\2rs\7\63\2\2s\""+
      "\3\2\2\2tu\7]\2\2uv\7\64\2\2v$\3\2\2\2wx\7X\2\2xy\7<\2\2y&\3\2\2\2"+
      "z|\t\6\2\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177"+
      "\u0080\b\24\2\2\u0080(\3\2\2\2\f\2\60;CJMR[i}\3\b\2\2";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}