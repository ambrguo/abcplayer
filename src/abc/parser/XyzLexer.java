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
    T__0=1, T__1=2, SPECIAL=3, DIGIT=4, SPACE=5, NEWLINE=6, LETTERS=7, SHARP=8, 
    FLAT=9, MINOR=10, C_LETTER=11, CL_LETTER=12, MUSIC_LETTER=13, INDEX_PREFIX=14, 
    TITLE_PREFIX=15, COMPOSER_PREFIX=16, LENGTH_PREFIX=17, METER_PREFIX=18, 
    TEMPO_PREFIX=19, KEY_PREFIX=20, VOICE_PREFIX=21;
  public static String[] modeNames = {
    "DEFAULT_MODE"
  };

  public static final String[] ruleNames = {
    "T__0", "T__1", "SPECIAL", "DIGIT", "SPACE", "NEWLINE", "LETTERS", "SHARP", 
    "FLAT", "MINOR", "C_LETTER", "CL_LETTER", "MUSIC_LETTER", "INDEX_PREFIX", 
    "TITLE_PREFIX", "COMPOSER_PREFIX", "LENGTH_PREFIX", "METER_PREFIX", 
    "TEMPO_PREFIX", "KEY_PREFIX", "VOICE_PREFIX"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'='", "'/'", null, null, "' '", null, null, "'#'", "'b'", "'m'", 
    "'C'", "'C|'", null, "'X:'", "'T:'", "'C:'", "'L:'", "'M:'", "'Q:'", 
    "'K:'", "'V:'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, "SPECIAL", "DIGIT", "SPACE", "NEWLINE", "LETTERS", 
    "SHARP", "FLAT", "MINOR", "C_LETTER", "CL_LETTER", "MUSIC_LETTER", "INDEX_PREFIX", 
    "TITLE_PREFIX", "COMPOSER_PREFIX", "LENGTH_PREFIX", "METER_PREFIX", 
    "TEMPO_PREFIX", "KEY_PREFIX", "VOICE_PREFIX"
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\27c\b\1\4\2\t\2"+
      "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
      "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4"+
      "\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3"+
      "\4\3\4\3\5\3\5\3\6\3\6\3\7\6\79\n\7\r\7\16\7:\3\b\3\b\3\t\3\t\3\n"+
      "\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3"+
      "\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3"+
      "\24\3\25\3\25\3\25\3\26\3\26\3\26\2\2\27\3\3\5\4\7\5\t\6\13\7\r\b"+
      "\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
      ")\26+\27\3\2\7\4\2#a~~\3\2\62;\4\2\f\f\17\17\5\2J\\jnp|\6\2CDFIcc"+
      "eic\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
      "\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
      "\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
      "\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-"+
      "\3\2\2\2\5/\3\2\2\2\7\61\3\2\2\2\t\63\3\2\2\2\13\65\3\2\2\2\r8\3\2"+
      "\2\2\17<\3\2\2\2\21>\3\2\2\2\23@\3\2\2\2\25B\3\2\2\2\27D\3\2\2\2\31"+
      "F\3\2\2\2\33I\3\2\2\2\35K\3\2\2\2\37N\3\2\2\2!Q\3\2\2\2#T\3\2\2\2"+
      "%W\3\2\2\2\'Z\3\2\2\2)]\3\2\2\2+`\3\2\2\2-.\7?\2\2.\4\3\2\2\2/\60"+
      "\7\61\2\2\60\6\3\2\2\2\61\62\t\2\2\2\62\b\3\2\2\2\63\64\t\3\2\2\64"+
      "\n\3\2\2\2\65\66\7\"\2\2\66\f\3\2\2\2\679\t\4\2\28\67\3\2\2\29:\3"+
      "\2\2\2:8\3\2\2\2:;\3\2\2\2;\16\3\2\2\2<=\t\5\2\2=\20\3\2\2\2>?\7%"+
      "\2\2?\22\3\2\2\2@A\7d\2\2A\24\3\2\2\2BC\7o\2\2C\26\3\2\2\2DE\7E\2"+
      "\2E\30\3\2\2\2FG\7E\2\2GH\7~\2\2H\32\3\2\2\2IJ\t\6\2\2J\34\3\2\2\2"+
      "KL\7Z\2\2LM\7<\2\2M\36\3\2\2\2NO\7V\2\2OP\7<\2\2P \3\2\2\2QR\7E\2"+
      "\2RS\7<\2\2S\"\3\2\2\2TU\7N\2\2UV\7<\2\2V$\3\2\2\2WX\7O\2\2XY\7<\2"+
      "\2Y&\3\2\2\2Z[\7S\2\2[\\\7<\2\2\\(\3\2\2\2]^\7M\2\2^_\7<\2\2_*\3\2"+
      "\2\2`a\7X\2\2ab\7<\2\2b,\3\2\2\2\4\2:\2";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}