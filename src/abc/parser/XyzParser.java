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
    T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, NUMBER=8, NEWLINE=9, 
    LETTER=10, VARIABLE=11, INDEX_PREFIX=12, TITLE_PREFIX=13, COMPOSER_PREFIX=14, 
    LENGTH_PREFIX=15, METER_PREFIX=16, TEMPO_PREFIX=17, KEY_PREFIX=18, VOICE_PREFIX=19;
  public static final int
    RULE_root = 0, RULE_header = 1, RULE_index = 2, RULE_title = 3, RULE_composer = 4, 
    RULE_length = 5, RULE_meter = 6, RULE_tempo = 7, RULE_key = 8, RULE_voice = 9;
  public static final String[] ruleNames = {
    "root", "header", "index", "title", "composer", "length", "meter", "tempo", 
    "key", "voice"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "' '", "'.'", "'/'", "'='", "'#'", "'b'", "'m'", null, null, null, 
    null, "'X:'", "'T:'", "'C:'", "'L:'", "'M:'", "'Q:'", "'K:'", "'V:'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, null, null, null, "NUMBER", "NEWLINE", 
    "LETTER", "VARIABLE", "INDEX_PREFIX", "TITLE_PREFIX", "COMPOSER_PREFIX", 
    "LENGTH_PREFIX", "METER_PREFIX", "TEMPO_PREFIX", "KEY_PREFIX", "VOICE_PREFIX"
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
    public IndexContext index() {
      return getRuleContext(IndexContext.class,0);
    }
    public TitleContext title() {
      return getRuleContext(TitleContext.class,0);
    }
    public KeyContext key() {
      return getRuleContext(KeyContext.class,0);
    }
    public List<ComposerContext> composer() {
      return getRuleContexts(ComposerContext.class);
    }
    public ComposerContext composer(int i) {
      return getRuleContext(ComposerContext.class,i);
    }
    public List<LengthContext> length() {
      return getRuleContexts(LengthContext.class);
    }
    public LengthContext length(int i) {
      return getRuleContext(LengthContext.class,i);
    }
    public List<MeterContext> meter() {
      return getRuleContexts(MeterContext.class);
    }
    public MeterContext meter(int i) {
      return getRuleContext(MeterContext.class,i);
    }
    public List<TempoContext> tempo() {
      return getRuleContexts(TempoContext.class);
    }
    public TempoContext tempo(int i) {
      return getRuleContext(TempoContext.class,i);
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
      index();
      setState(24);
      title();
      setState(31);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMPOSER_PREFIX) | (1L << LENGTH_PREFIX) | (1L << METER_PREFIX) | (1L << TEMPO_PREFIX))) != 0)) {
        {
        setState(29);
        switch (_input.LA(1)) {
        case COMPOSER_PREFIX:
          {
          setState(25);
          composer();
          }
          break;
        case LENGTH_PREFIX:
          {
          setState(26);
          length();
          }
          break;
        case METER_PREFIX:
          {
          setState(27);
          meter();
          }
          break;
        case TEMPO_PREFIX:
          {
          setState(28);
          tempo();
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        }
        setState(33);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(34);
      key();
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

  public static class IndexContext extends ParserRuleContext {
    public TerminalNode INDEX_PREFIX() { return getToken(XyzParser.INDEX_PREFIX, 0); }
    public TerminalNode NUMBER() { return getToken(XyzParser.NUMBER, 0); }
    public TerminalNode NEWLINE() { return getToken(XyzParser.NEWLINE, 0); }
    public IndexContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_index; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof XyzListener ) ((XyzListener)listener).enterIndex(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof XyzListener ) ((XyzListener)listener).exitIndex(this);
    }
  }

  public final IndexContext index() throws RecognitionException {
    IndexContext _localctx = new IndexContext(_ctx, getState());
    enterRule(_localctx, 4, RULE_index);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(36);
      match(INDEX_PREFIX);
      setState(40);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==T__0) {
        {
        {
        setState(37);
        match(T__0);
        }
        }
        setState(42);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(43);
      match(NUMBER);
      setState(47);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==T__0) {
        {
        {
        setState(44);
        match(T__0);
        }
        }
        setState(49);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(50);
      match(NEWLINE);
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

  public static class TitleContext extends ParserRuleContext {
    public TerminalNode NEWLINE() { return getToken(XyzParser.NEWLINE, 0); }
    public List<TerminalNode> VARIABLE() { return getTokens(XyzParser.VARIABLE); }
    public TerminalNode VARIABLE(int i) {
      return getToken(XyzParser.VARIABLE, i);
    }
    public List<TerminalNode> LETTER() { return getTokens(XyzParser.LETTER); }
    public TerminalNode LETTER(int i) {
      return getToken(XyzParser.LETTER, i);
    }
    public List<TerminalNode> NUMBER() { return getTokens(XyzParser.NUMBER); }
    public TerminalNode NUMBER(int i) {
      return getToken(XyzParser.NUMBER, i);
    }
    public TitleContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_title; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof XyzListener ) ((XyzListener)listener).enterTitle(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof XyzListener ) ((XyzListener)listener).exitTitle(this);
    }
  }

  public final TitleContext title() throws RecognitionException {
    TitleContext _localctx = new TitleContext(_ctx, getState());
    enterRule(_localctx, 6, RULE_title);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(52);
      match(TITLE_PREFIX);
      setState(54); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(53);
        _la = _input.LA(1);
        if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << NUMBER) | (1L << LETTER) | (1L << VARIABLE))) != 0)) ) {
        _errHandler.recoverInline(this);
        } else {
          consume();
        }
        }
        }
        setState(56); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << NUMBER) | (1L << LETTER) | (1L << VARIABLE))) != 0) );
      setState(58);
      match(NEWLINE);
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

  public static class ComposerContext extends ParserRuleContext {
    public TerminalNode COMPOSER_PREFIX() { return getToken(XyzParser.COMPOSER_PREFIX, 0); }
    public TerminalNode NEWLINE() { return getToken(XyzParser.NEWLINE, 0); }
    public ComposerContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_composer; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof XyzListener ) ((XyzListener)listener).enterComposer(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof XyzListener ) ((XyzListener)listener).exitComposer(this);
    }
  }

  public final ComposerContext composer() throws RecognitionException {
    ComposerContext _localctx = new ComposerContext(_ctx, getState());
    enterRule(_localctx, 8, RULE_composer);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(60);
      match(COMPOSER_PREFIX);
      setState(63); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          setState(63);
          switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
          case 1:
            {
            setState(61);
            matchWildcard();
            }
            break;
          case 2:
            {
            setState(62);
            match(T__0);
            }
            break;
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(65); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,6,_ctx);
      } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
      setState(67);
      match(NEWLINE);
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

  public static class LengthContext extends ParserRuleContext {
    public TerminalNode LENGTH_PREFIX() { return getToken(XyzParser.LENGTH_PREFIX, 0); }
    public List<TerminalNode> NUMBER() { return getTokens(XyzParser.NUMBER); }
    public TerminalNode NUMBER(int i) {
      return getToken(XyzParser.NUMBER, i);
    }
    public TerminalNode NEWLINE() { return getToken(XyzParser.NEWLINE, 0); }
    public LengthContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_length; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof XyzListener ) ((XyzListener)listener).enterLength(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof XyzListener ) ((XyzListener)listener).exitLength(this);
    }
  }

  public final LengthContext length() throws RecognitionException {
    LengthContext _localctx = new LengthContext(_ctx, getState());
    enterRule(_localctx, 10, RULE_length);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(69);
      match(LENGTH_PREFIX);
      setState(70);
      match(NUMBER);
      setState(71);
      match(T__2);
      setState(72);
      match(NUMBER);
      setState(73);
      match(NEWLINE);
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

  public static class MeterContext extends ParserRuleContext {
    public TerminalNode METER_PREFIX() { return getToken(XyzParser.METER_PREFIX, 0); }
    public TerminalNode NEWLINE() { return getToken(XyzParser.NEWLINE, 0); }
    public List<TerminalNode> NUMBER() { return getTokens(XyzParser.NUMBER); }
    public TerminalNode NUMBER(int i) {
      return getToken(XyzParser.NUMBER, i);
    }
    public MeterContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_meter; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof XyzListener ) ((XyzListener)listener).enterMeter(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof XyzListener ) ((XyzListener)listener).exitMeter(this);
    }
  }

  public final MeterContext meter() throws RecognitionException {
    MeterContext _localctx = new MeterContext(_ctx, getState());
    enterRule(_localctx, 12, RULE_meter);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(75);
      match(METER_PREFIX);
      {
      setState(76);
      match(NUMBER);
      setState(77);
      match(T__2);
      setState(78);
      match(NUMBER);
      }
      setState(80);
      match(NEWLINE);
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

  public static class TempoContext extends ParserRuleContext {
    public TerminalNode TEMPO_PREFIX() { return getToken(XyzParser.TEMPO_PREFIX, 0); }
    public List<TerminalNode> NUMBER() { return getTokens(XyzParser.NUMBER); }
    public TerminalNode NUMBER(int i) {
      return getToken(XyzParser.NUMBER, i);
    }
    public TerminalNode NEWLINE() { return getToken(XyzParser.NEWLINE, 0); }
    public TempoContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_tempo; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof XyzListener ) ((XyzListener)listener).enterTempo(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof XyzListener ) ((XyzListener)listener).exitTempo(this);
    }
  }

  public final TempoContext tempo() throws RecognitionException {
    TempoContext _localctx = new TempoContext(_ctx, getState());
    enterRule(_localctx, 14, RULE_tempo);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(82);
      match(TEMPO_PREFIX);
      setState(87);
      switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
      case 1:
        {
        setState(83);
        match(NUMBER);
        setState(84);
        match(T__2);
        setState(85);
        match(NUMBER);
        setState(86);
        match(T__3);
        }
        break;
      }
      setState(89);
      match(NUMBER);
      setState(90);
      match(NEWLINE);
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

  public static class KeyContext extends ParserRuleContext {
    public TerminalNode KEY_PREFIX() { return getToken(XyzParser.KEY_PREFIX, 0); }
    public TerminalNode LETTER() { return getToken(XyzParser.LETTER, 0); }
    public TerminalNode NEWLINE() { return getToken(XyzParser.NEWLINE, 0); }
    public KeyContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_key; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof XyzListener ) ((XyzListener)listener).enterKey(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof XyzListener ) ((XyzListener)listener).exitKey(this);
    }
  }

  public final KeyContext key() throws RecognitionException {
    KeyContext _localctx = new KeyContext(_ctx, getState());
    enterRule(_localctx, 16, RULE_key);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(92);
      match(KEY_PREFIX);
      setState(93);
      match(LETTER);
      setState(95);
      _la = _input.LA(1);
      if (_la==T__4 || _la==T__5) {
        {
        setState(94);
        _la = _input.LA(1);
        if ( !(_la==T__4 || _la==T__5) ) {
        _errHandler.recoverInline(this);
        } else {
          consume();
        }
        }
      }

      setState(98);
      _la = _input.LA(1);
      if (_la==T__6) {
        {
        setState(97);
        match(T__6);
        }
      }

      setState(100);
      match(NEWLINE);
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

  public static class VoiceContext extends ParserRuleContext {
    public TerminalNode VOICE_PREFIX() { return getToken(XyzParser.VOICE_PREFIX, 0); }
    public TerminalNode NEWLINE() { return getToken(XyzParser.NEWLINE, 0); }
    public VoiceContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_voice; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof XyzListener ) ((XyzListener)listener).enterVoice(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof XyzListener ) ((XyzListener)listener).exitVoice(this);
    }
  }

  public final VoiceContext voice() throws RecognitionException {
    VoiceContext _localctx = new VoiceContext(_ctx, getState());
    enterRule(_localctx, 18, RULE_voice);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(102);
      match(VOICE_PREFIX);
      setState(105); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          setState(105);
          switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
          case 1:
            {
            setState(103);
            matchWildcard();
            }
            break;
          case 2:
            {
            setState(104);
            match(T__0);
            }
            break;
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(107); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,11,_ctx);
      } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
      setState(109);
      match(NEWLINE);
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\25r\4\2\t\2\4\3"+
      "\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
      "\t\13\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3 \n\3\f\3\16\3#\13\3"+
      "\3\3\3\3\3\4\3\4\7\4)\n\4\f\4\16\4,\13\4\3\4\3\4\7\4\60\n\4\f\4\16"+
      "\4\63\13\4\3\4\3\4\3\5\3\5\6\59\n\5\r\5\16\5:\3\5\3\5\3\6\3\6\3\6"+
      "\6\6B\n\6\r\6\16\6C\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
      "\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\tZ\n\t\3\t\3\t\3\t\3\n\3\n\3"+
      "\n\5\nb\n\n\3\n\5\ne\n\n\3\n\3\n\3\13\3\13\3\13\6\13l\n\13\r\13\16"+
      "\13m\3\13\3\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\4\5\2\3\4\n\n"+
      "\f\r\3\2\7\bu\2\26\3\2\2\2\4\31\3\2\2\2\6&\3\2\2\2\b\66\3\2\2\2\n"+
      ">\3\2\2\2\fG\3\2\2\2\16M\3\2\2\2\20T\3\2\2\2\22^\3\2\2\2\24h\3\2\2"+
      "\2\26\27\5\4\3\2\27\30\7\2\2\3\30\3\3\2\2\2\31\32\5\6\4\2\32!\5\b"+
      "\5\2\33 \5\n\6\2\34 \5\f\7\2\35 \5\16\b\2\36 \5\20\t\2\37\33\3\2\2"+
      "\2\37\34\3\2\2\2\37\35\3\2\2\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2"+
      "!\"\3\2\2\2\"$\3\2\2\2#!\3\2\2\2$%\5\22\n\2%\5\3\2\2\2&*\7\16\2\2"+
      "\')\7\3\2\2(\'\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+-\3\2\2\2,*\3"+
      "\2\2\2-\61\7\n\2\2.\60\7\3\2\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2"+
      "\61\62\3\2\2\2\62\64\3\2\2\2\63\61\3\2\2\2\64\65\7\13\2\2\65\7\3\2"+
      "\2\2\668\7\17\2\2\679\t\2\2\28\67\3\2\2\29:\3\2\2\2:8\3\2\2\2:;\3"+
      "\2\2\2;<\3\2\2\2<=\7\13\2\2=\t\3\2\2\2>A\7\20\2\2?B\13\2\2\2@B\7\3"+
      "\2\2A?\3\2\2\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2DE\3\2\2\2E"+
      "F\7\13\2\2F\13\3\2\2\2GH\7\21\2\2HI\7\n\2\2IJ\7\5\2\2JK\7\n\2\2KL"+
      "\7\13\2\2L\r\3\2\2\2MN\7\22\2\2NO\7\n\2\2OP\7\5\2\2PQ\7\n\2\2QR\3"+
      "\2\2\2RS\7\13\2\2S\17\3\2\2\2TY\7\23\2\2UV\7\n\2\2VW\7\5\2\2WX\7\n"+
      "\2\2XZ\7\6\2\2YU\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\7\n\2\2\\]\7\13\2"+
      "\2]\21\3\2\2\2^_\7\24\2\2_a\7\f\2\2`b\t\3\2\2a`\3\2\2\2ab\3\2\2\2"+
      "bd\3\2\2\2ce\7\t\2\2dc\3\2\2\2de\3\2\2\2ef\3\2\2\2fg\7\13\2\2g\23"+
      "\3\2\2\2hk\7\25\2\2il\13\2\2\2jl\7\3\2\2ki\3\2\2\2kj\3\2\2\2lm\3\2"+
      "\2\2mk\3\2\2\2mn\3\2\2\2no\3\2\2\2op\7\13\2\2p\25\3\2\2\2\16\37!*"+
      "\61:ACYadkm";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}