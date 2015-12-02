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
    INDEX=1, TITLE=2, COMPOSER=3, LENGTH=4, METER=5, TEMPO=6, KEY=7, NUMBER=8, 
    NEWLINE=9, LETTER=10;
  public static String[] modeNames = {
    "DEFAULT_MODE"
  };

  public static final String[] ruleNames = {
    "INDEX", "TITLE", "COMPOSER", "LENGTH", "METER", "TEMPO", "KEY", "NUMBER", 
    "NEWLINE", "LETTER"
  };

  private static final String[] _LITERAL_NAMES = {
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, "INDEX", "TITLE", "COMPOSER", "LENGTH", "METER", "TEMPO", "KEY", 
    "NUMBER", "NEWLINE", "LETTER"
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\fr\b\1\4\2\t\2"+
      "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
      "\13\t\13\3\2\3\2\3\2\3\2\3\2\7\2\35\n\2\f\2\16\2 \13\2\3\2\3\2\3\3"+
      "\3\3\3\3\3\3\6\3(\n\3\r\3\16\3)\3\3\3\3\3\4\3\4\3\4\3\4\6\4\62\n\4"+
      "\r\4\16\4\63\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
      "\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6J\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
      "\7\3\7\3\7\5\7V\n\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\b`\n\b\3\b\5"+
      "\bc\n\b\3\b\3\b\3\t\6\th\n\t\r\t\16\ti\3\n\6\nm\n\n\r\n\16\nn\3\13"+
      "\3\13\2\2\f\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\3\2\b\13"+
      "\2\"#%%(+..\60\60\62;AAC\\c|\b\2\"\"))\60\60\62;C\\c|\5\2%%))dd\3"+
      "\2\62;\4\2\f\f\17\17\4\2CIci{\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
      "\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
      "\23\3\2\2\2\2\25\3\2\2\2\3\27\3\2\2\2\5#\3\2\2\2\7-\3\2\2\2\t\67\3"+
      "\2\2\2\13?\3\2\2\2\rM\3\2\2\2\17Z\3\2\2\2\21g\3\2\2\2\23l\3\2\2\2"+
      "\25p\3\2\2\2\27\30\7Z\2\2\30\31\7<\2\2\31\32\3\2\2\2\32\36\5\21\t"+
      "\2\33\35\7\"\2\2\34\33\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2"+
      "\2\2\37!\3\2\2\2 \36\3\2\2\2!\"\5\23\n\2\"\4\3\2\2\2#$\7V\2\2$%\7"+
      "<\2\2%\'\3\2\2\2&(\t\2\2\2\'&\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2"+
      "\2*+\3\2\2\2+,\5\23\n\2,\6\3\2\2\2-.\7E\2\2./\7<\2\2/\61\3\2\2\2\60"+
      "\62\t\3\2\2\61\60\3\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2"+
      "\2\64\65\3\2\2\2\65\66\5\23\n\2\66\b\3\2\2\2\678\7N\2\289\7<\2\29"+
      ":\3\2\2\2:;\5\21\t\2;<\7\61\2\2<=\5\21\t\2=>\5\23\n\2>\n\3\2\2\2?"+
      "@\7O\2\2@A\7<\2\2AI\3\2\2\2BJ\7E\2\2CD\7E\2\2DJ\7~\2\2EF\5\21\t\2"+
      "FG\7\61\2\2GH\5\21\t\2HJ\3\2\2\2IB\3\2\2\2IC\3\2\2\2IE\3\2\2\2JK\3"+
      "\2\2\2KL\5\23\n\2L\f\3\2\2\2MN\7S\2\2NO\7<\2\2OU\3\2\2\2PQ\5\21\t"+
      "\2QR\7\61\2\2RS\5\21\t\2ST\7?\2\2TV\3\2\2\2UP\3\2\2\2UV\3\2\2\2VW"+
      "\3\2\2\2WX\5\21\t\2XY\5\23\n\2Y\16\3\2\2\2Z[\7M\2\2[\\\7<\2\2\\]\3"+
      "\2\2\2]_\5\25\13\2^`\t\4\2\2_^\3\2\2\2_`\3\2\2\2`b\3\2\2\2ac\7o\2"+
      "\2ba\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\5\23\n\2e\20\3\2\2\2fh\t\5\2\2"+
      "gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\22\3\2\2\2km\t\6\2\2lk\3"+
      "\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2o\24\3\2\2\2pq\t\7\2\2q\26\3\2"+
      "\2\2\f\2\36)\63IU_bin\2";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}