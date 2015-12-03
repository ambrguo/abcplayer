// Generated from Xyz.g4 by ANTLR 4.5.1

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
public class XyzLexer extends Lexer {
  static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache =
    new PredictionContextCache();
  public static final int
    T__0=1, T__1=2, T__2=3, NUMBER=4, NEWLINE=5, LETTERS=6, SHARP=7, FLAT=8, 
    MINOR=9, METER_LETTER=10, MUSIC_LETTER=11, INDEX_PREFIX=12, TITLE_PREFIX=13, 
    COMPOSER_PREFIX=14, LENGTH_PREFIX=15, METER_PREFIX=16, TEMPO_PREFIX=17, 
    KEY_PREFIX=18, VOICE_PREFIX=19;
  public static String[] modeNames = {
    "DEFAULT_MODE"
  };

  public static final String[] ruleNames = {
    "T__0", "T__1", "T__2", "NUMBER", "NEWLINE", "LETTERS", "SHARP", "FLAT", 
    "MINOR", "METER_LETTER", "MUSIC_LETTER", "INDEX_PREFIX", "TITLE_PREFIX", 
    "COMPOSER_PREFIX", "LENGTH_PREFIX", "METER_PREFIX", "TEMPO_PREFIX", 
    "KEY_PREFIX", "VOICE_PREFIX"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "' '", "'='", "'.'", null, null, null, "'#'", "'b'", "'m'", null, 
    null, "'X:'", "'T:'", "'C:'", "'L:'", "'M:'", "'Q:'", "'K:'", "'V:'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, "NUMBER", "NEWLINE", "LETTERS", "SHARP", "FLAT", 
    "MINOR", "METER_LETTER", "MUSIC_LETTER", "INDEX_PREFIX", "TITLE_PREFIX", 
    "COMPOSER_PREFIX", "LENGTH_PREFIX", "METER_PREFIX", "TEMPO_PREFIX", 
    "KEY_PREFIX", "VOICE_PREFIX"
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


  public XyzLexer(CharStream input) {
    super(input);
    _interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
  }

  @Override
  public String getGrammarFileName() { return "Xyz.g4"; }

  @Override
  public String[] getRuleNames() { return ruleNames; }

  @Override
  public String getSerializedATN() { return _serializedATN; }

  @Override
  public String[] getModeNames() { return modeNames; }

  @Override
  public ATN getATN() { return _ATN; }

  public static final String _serializedATN =
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\25i\b\1\4\2\t\2"+
      "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
      "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4"+
      "\22\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\4\3\4\3\5\6\5\61\n"+
      "\5\r\5\16\5\62\3\5\5\5\66\n\5\3\5\7\59\n\5\f\5\16\5<\13\5\3\6\6\6"+
      "?\n\6\r\6\16\6@\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\5\13"+
      "N\n\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20"+
      "\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24"+
      "\2\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
      "\17\35\20\37\21!\22#\23%\24\'\25\3\2\6\3\2\62;\4\2\f\f\17\17\4\2J"+
      "\\j|\4\2CIcim\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
      "\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
      "\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
      "\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5+"+
      "\3\2\2\2\7-\3\2\2\2\t\60\3\2\2\2\13>\3\2\2\2\rB\3\2\2\2\17D\3\2\2"+
      "\2\21F\3\2\2\2\23H\3\2\2\2\25M\3\2\2\2\27O\3\2\2\2\31Q\3\2\2\2\33"+
      "T\3\2\2\2\35W\3\2\2\2\37Z\3\2\2\2!]\3\2\2\2#`\3\2\2\2%c\3\2\2\2\'"+
      "f\3\2\2\2)*\7\"\2\2*\4\3\2\2\2+,\7?\2\2,\6\3\2\2\2-.\7\60\2\2.\b\3"+
      "\2\2\2/\61\t\2\2\2\60/\3\2\2\2\61\62\3\2\2\2\62\60\3\2\2\2\62\63\3"+
      "\2\2\2\63\65\3\2\2\2\64\66\7\61\2\2\65\64\3\2\2\2\65\66\3\2\2\2\66"+
      ":\3\2\2\2\679\t\2\2\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\n"+
      "\3\2\2\2<:\3\2\2\2=?\t\3\2\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2"+
      "\2A\f\3\2\2\2BC\t\4\2\2C\16\3\2\2\2DE\7%\2\2E\20\3\2\2\2FG\7d\2\2"+
      "G\22\3\2\2\2HI\7o\2\2I\24\3\2\2\2JN\7E\2\2KL\7E\2\2LN\7~\2\2MJ\3\2"+
      "\2\2MK\3\2\2\2N\26\3\2\2\2OP\t\5\2\2P\30\3\2\2\2QR\7Z\2\2RS\7<\2\2"+
      "S\32\3\2\2\2TU\7V\2\2UV\7<\2\2V\34\3\2\2\2WX\7E\2\2XY\7<\2\2Y\36\3"+
      "\2\2\2Z[\7N\2\2[\\\7<\2\2\\ \3\2\2\2]^\7O\2\2^_\7<\2\2_\"\3\2\2\2"+
      "`a\7S\2\2ab\7<\2\2b$\3\2\2\2cd\7M\2\2de\7<\2\2e&\3\2\2\2fg\7X\2\2"+
      "gh\7<\2\2h(\3\2\2\2\b\2\62\65:@M\2";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}