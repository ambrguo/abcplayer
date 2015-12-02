// Generated from Xyz.g4 by ANTLR 4.5.1

package abc.parser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XyzParser extends Parser {
  static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache =
    new PredictionContextCache();
  public static final int
    INDEX=1, TITLE=2, COMPOSER=3, LENGTH=4, METER=5, TEMPO=6, KEY=7, NUMBER=8, 
    NEWLINE=9, LETTER=10;
  public static final int
    RULE_root = 0, RULE_header = 1, RULE_field_number = 2, RULE_field_title = 3, 
    RULE_field_other = 4, RULE_field_composer = 5, RULE_field_length = 6, 
    RULE_field_meter = 7, RULE_field_tempo = 8, RULE_field_key = 9;
  public static final String[] ruleNames = {
    "root", "header", "field_number", "field_title", "field_other", "field_composer", 
    "field_length", "field_meter", "field_tempo", "field_key"
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

  @Override
  public String getGrammarFileName() { return "Xyz.g4"; }

  @Override
  public String[] getRuleNames() { return ruleNames; }

  @Override
  public String getSerializedATN() { return _serializedATN; }

  @Override
  public ATN getATN() { return _ATN; }


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

  public XyzParser(TokenStream input) {
    super(input);
    _interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
  }
  public static class RootContext extends ParserRuleContext {
    public HeaderContext header() {
      return getRuleContext(HeaderContext.class,0);
    }
    public TerminalNode EOF() { return getToken(XyzParser.EOF, 0); }
    public RootContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_root; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof XyzListener ) ((XyzListener)listener).enterRoot(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof XyzListener ) ((XyzListener)listener).exitRoot(this);
    }
  }

  public final RootContext root() throws RecognitionException {
    RootContext _localctx = new RootContext(_ctx, getState());
    enterRule(_localctx, 0, RULE_root);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(20);
      header();
      setState(21);
      match(EOF);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class HeaderContext extends ParserRuleContext {
    public Field_numberContext field_number() {
      return getRuleContext(Field_numberContext.class,0);
    }
    public Field_titleContext field_title() {
      return getRuleContext(Field_titleContext.class,0);
    }
    public Field_keyContext field_key() {
      return getRuleContext(Field_keyContext.class,0);
    }
    public List<Field_otherContext> field_other() {
      return getRuleContexts(Field_otherContext.class);
    }
    public Field_otherContext field_other(int i) {
      return getRuleContext(Field_otherContext.class,i);
    }
    public HeaderContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_header; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof XyzListener ) ((XyzListener)listener).enterHeader(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof XyzListener ) ((XyzListener)listener).exitHeader(this);
    }
  }

  public final HeaderContext header() throws RecognitionException {
    HeaderContext _localctx = new HeaderContext(_ctx, getState());
    enterRule(_localctx, 2, RULE_header);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(23);
      field_number();
      setState(24);
      field_title();
      setState(28);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMPOSER) | (1L << LENGTH) | (1L << METER) | (1L << TEMPO))) != 0)) {
        {
        {
        setState(25);
        field_other();
        }
        }
        setState(30);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(31);
      field_key();
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class Field_numberContext extends ParserRuleContext {
    public TerminalNode INDEX() { return getToken(XyzParser.INDEX, 0); }
    public Field_numberContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_field_number; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof XyzListener ) ((XyzListener)listener).enterField_number(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof XyzListener ) ((XyzListener)listener).exitField_number(this);
    }
  }

  public final Field_numberContext field_number() throws RecognitionException {
    Field_numberContext _localctx = new Field_numberContext(_ctx, getState());
    enterRule(_localctx, 4, RULE_field_number);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(33);
      match(INDEX);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class Field_titleContext extends ParserRuleContext {
    public TerminalNode TITLE() { return getToken(XyzParser.TITLE, 0); }
    public Field_titleContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_field_title; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof XyzListener ) ((XyzListener)listener).enterField_title(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof XyzListener ) ((XyzListener)listener).exitField_title(this);
    }
  }

  public final Field_titleContext field_title() throws RecognitionException {
    Field_titleContext _localctx = new Field_titleContext(_ctx, getState());
    enterRule(_localctx, 6, RULE_field_title);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(35);
      match(TITLE);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class Field_otherContext extends ParserRuleContext {
    public Field_composerContext field_composer() {
      return getRuleContext(Field_composerContext.class,0);
    }
    public Field_lengthContext field_length() {
      return getRuleContext(Field_lengthContext.class,0);
    }
    public Field_meterContext field_meter() {
      return getRuleContext(Field_meterContext.class,0);
    }
    public Field_tempoContext field_tempo() {
      return getRuleContext(Field_tempoContext.class,0);
    }
    public Field_otherContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_field_other; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof XyzListener ) ((XyzListener)listener).enterField_other(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof XyzListener ) ((XyzListener)listener).exitField_other(this);
    }
  }

  public final Field_otherContext field_other() throws RecognitionException {
    Field_otherContext _localctx = new Field_otherContext(_ctx, getState());
    enterRule(_localctx, 8, RULE_field_other);
    try {
      setState(41);
      switch (_input.LA(1)) {
      case COMPOSER:
        enterOuterAlt(_localctx, 1);
        {
        setState(37);
        field_composer();
        }
        break;
      case LENGTH:
        enterOuterAlt(_localctx, 2);
        {
        setState(38);
        field_length();
        }
        break;
      case METER:
        enterOuterAlt(_localctx, 3);
        {
        setState(39);
        field_meter();
        }
        break;
      case TEMPO:
        enterOuterAlt(_localctx, 4);
        {
        setState(40);
        field_tempo();
        }
        break;
      default:
        throw new NoViableAltException(this);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class Field_composerContext extends ParserRuleContext {
    public TerminalNode COMPOSER() { return getToken(XyzParser.COMPOSER, 0); }
    public Field_composerContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_field_composer; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof XyzListener ) ((XyzListener)listener).enterField_composer(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof XyzListener ) ((XyzListener)listener).exitField_composer(this);
    }
  }

  public final Field_composerContext field_composer() throws RecognitionException {
    Field_composerContext _localctx = new Field_composerContext(_ctx, getState());
    enterRule(_localctx, 10, RULE_field_composer);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(43);
      match(COMPOSER);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class Field_lengthContext extends ParserRuleContext {
    public TerminalNode LENGTH() { return getToken(XyzParser.LENGTH, 0); }
    public Field_lengthContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_field_length; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof XyzListener ) ((XyzListener)listener).enterField_length(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof XyzListener ) ((XyzListener)listener).exitField_length(this);
    }
  }

  public final Field_lengthContext field_length() throws RecognitionException {
    Field_lengthContext _localctx = new Field_lengthContext(_ctx, getState());
    enterRule(_localctx, 12, RULE_field_length);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(45);
      match(LENGTH);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class Field_meterContext extends ParserRuleContext {
    public TerminalNode METER() { return getToken(XyzParser.METER, 0); }
    public Field_meterContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_field_meter; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof XyzListener ) ((XyzListener)listener).enterField_meter(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof XyzListener ) ((XyzListener)listener).exitField_meter(this);
    }
  }

  public final Field_meterContext field_meter() throws RecognitionException {
    Field_meterContext _localctx = new Field_meterContext(_ctx, getState());
    enterRule(_localctx, 14, RULE_field_meter);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(47);
      match(METER);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class Field_tempoContext extends ParserRuleContext {
    public TerminalNode TEMPO() { return getToken(XyzParser.TEMPO, 0); }
    public Field_tempoContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_field_tempo; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof XyzListener ) ((XyzListener)listener).enterField_tempo(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof XyzListener ) ((XyzListener)listener).exitField_tempo(this);
    }
  }

  public final Field_tempoContext field_tempo() throws RecognitionException {
    Field_tempoContext _localctx = new Field_tempoContext(_ctx, getState());
    enterRule(_localctx, 16, RULE_field_tempo);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(49);
      match(TEMPO);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class Field_keyContext extends ParserRuleContext {
    public TerminalNode KEY() { return getToken(XyzParser.KEY, 0); }
    public Field_keyContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_field_key; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof XyzListener ) ((XyzListener)listener).enterField_key(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof XyzListener ) ((XyzListener)listener).exitField_key(this);
    }
  }

  public final Field_keyContext field_key() throws RecognitionException {
    Field_keyContext _localctx = new Field_keyContext(_ctx, getState());
    enterRule(_localctx, 18, RULE_field_key);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(51);
      match(KEY);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static final String _serializedATN =
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\f8\4\2\t\2\4\3"+
      "\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
      "\t\13\3\2\3\2\3\2\3\3\3\3\3\3\7\3\35\n\3\f\3\16\3 \13\3\3\3\3\3\3"+
      "\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\5\6,\n\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
      "\n\3\n\3\13\3\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\2\61\2\26\3"+
      "\2\2\2\4\31\3\2\2\2\6#\3\2\2\2\b%\3\2\2\2\n+\3\2\2\2\f-\3\2\2\2\16"+
      "/\3\2\2\2\20\61\3\2\2\2\22\63\3\2\2\2\24\65\3\2\2\2\26\27\5\4\3\2"+
      "\27\30\7\2\2\3\30\3\3\2\2\2\31\32\5\6\4\2\32\36\5\b\5\2\33\35\5\n"+
      "\6\2\34\33\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37!\3\2"+
      "\2\2 \36\3\2\2\2!\"\5\24\13\2\"\5\3\2\2\2#$\7\3\2\2$\7\3\2\2\2%&\7"+
      "\4\2\2&\t\3\2\2\2\',\5\f\7\2(,\5\16\b\2),\5\20\t\2*,\5\22\n\2+\'\3"+
      "\2\2\2+(\3\2\2\2+)\3\2\2\2+*\3\2\2\2,\13\3\2\2\2-.\7\5\2\2.\r\3\2"+
      "\2\2/\60\7\6\2\2\60\17\3\2\2\2\61\62\7\7\2\2\62\21\3\2\2\2\63\64\7"+
      "\b\2\2\64\23\3\2\2\2\65\66\7\t\2\2\66\25\3\2\2\2\4\36+";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}