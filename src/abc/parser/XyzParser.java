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
    T__0=1, T__1=2, T__2=3, NUMBER=4, NEWLINE=5, LETTERS=6, SHARP=7, FLAT=8, 
    MINOR=9, METER_LETTER=10, MUSIC_LETTER=11, INDEX_PREFIX=12, TITLE_PREFIX=13, 
    COMPOSER_PREFIX=14, LENGTH_PREFIX=15, METER_PREFIX=16, TEMPO_PREFIX=17, 
    KEY_PREFIX=18, VOICE_PREFIX=19;
  public static final int
    RULE_root = 0, RULE_header = 1, RULE_index = 2, RULE_title = 3, RULE_composer = 4, 
    RULE_length = 5, RULE_meter = 6, RULE_tempo = 7, RULE_key = 8, RULE_voice = 9, 
    RULE_name = 10;
  public static final String[] ruleNames = {
    "root", "header", "index", "title", "composer", "length", "meter", "tempo", 
    "key", "voice", "name"
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
      setState(22);
      header();
      setState(23);
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
    public List<VoiceContext> voice() {
      return getRuleContexts(VoiceContext.class);
    }
    public VoiceContext voice(int i) {
      return getRuleContext(VoiceContext.class,i);
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
      setState(25);
      index();
      setState(26);
      title();
      setState(34);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMPOSER_PREFIX) | (1L << LENGTH_PREFIX) | (1L << METER_PREFIX) | (1L << TEMPO_PREFIX) | (1L << VOICE_PREFIX))) != 0)) {
        {
        setState(32);
        switch (_input.LA(1)) {
        case COMPOSER_PREFIX:
          {
          setState(27);
          composer();
          }
          break;
        case LENGTH_PREFIX:
          {
          setState(28);
          length();
          }
          break;
        case METER_PREFIX:
          {
          setState(29);
          meter();
          }
          break;
        case TEMPO_PREFIX:
          {
          setState(30);
          tempo();
          }
          break;
        case VOICE_PREFIX:
          {
          setState(31);
          voice();
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        }
        setState(36);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(37);
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
      setState(39);
      match(INDEX_PREFIX);
      setState(43);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==T__0) {
        {
        {
        setState(40);
        match(T__0);
        }
        }
        setState(45);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(46);
      match(NUMBER);
      setState(50);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==T__0) {
        {
        {
        setState(47);
        match(T__0);
        }
        }
        setState(52);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(53);
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
    public TerminalNode TITLE_PREFIX() { return getToken(XyzParser.TITLE_PREFIX, 0); }
    public NameContext name() {
      return getRuleContext(NameContext.class,0);
    }
    public TerminalNode NEWLINE() { return getToken(XyzParser.NEWLINE, 0); }
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
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(55);
      match(TITLE_PREFIX);
      setState(56);
      name();
      setState(57);
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
    public NameContext name() {
      return getRuleContext(NameContext.class,0);
    }
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
      enterOuterAlt(_localctx, 1);
      {
      setState(59);
      match(COMPOSER_PREFIX);
      setState(60);
      name();
      setState(61);
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
    public TerminalNode NUMBER() { return getToken(XyzParser.NUMBER, 0); }
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
      setState(63);
      match(LENGTH_PREFIX);
      setState(64);
      match(NUMBER);
      setState(65);
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
    public TerminalNode METER_LETTER() { return getToken(XyzParser.METER_LETTER, 0); }
    public TerminalNode NUMBER() { return getToken(XyzParser.NUMBER, 0); }
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
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(67);
      match(METER_PREFIX);
      setState(68);
      _la = _input.LA(1);
      if ( !(_la==NUMBER || _la==METER_LETTER) ) {
      _errHandler.recoverInline(this);
      } else {
        consume();
      }
      setState(69);
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
      setState(71);
      match(TEMPO_PREFIX);
      setState(74);
      switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
      case 1:
        {
        setState(72);
        match(NUMBER);
        setState(73);
        match(T__1);
        }
        break;
      }
      setState(76);
      match(NUMBER);
      setState(77);
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
    public TerminalNode MUSIC_LETTER() { return getToken(XyzParser.MUSIC_LETTER, 0); }
    public TerminalNode NEWLINE() { return getToken(XyzParser.NEWLINE, 0); }
    public TerminalNode MINOR() { return getToken(XyzParser.MINOR, 0); }
    public TerminalNode SHARP() { return getToken(XyzParser.SHARP, 0); }
    public TerminalNode FLAT() { return getToken(XyzParser.FLAT, 0); }
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
      setState(79);
      match(KEY_PREFIX);
      setState(80);
      match(MUSIC_LETTER);
      setState(82);
      _la = _input.LA(1);
      if (_la==SHARP || _la==FLAT) {
        {
        setState(81);
        _la = _input.LA(1);
        if ( !(_la==SHARP || _la==FLAT) ) {
        _errHandler.recoverInline(this);
        } else {
          consume();
        }
        }
      }

      setState(85);
      _la = _input.LA(1);
      if (_la==MINOR) {
        {
        setState(84);
        match(MINOR);
        }
      }

      setState(87);
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
      setState(89);
      match(VOICE_PREFIX);
      setState(92); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          setState(92);
          switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
          case 1:
            {
            setState(90);
            matchWildcard();
            }
            break;
          case 2:
            {
            setState(91);
            match(T__0);
            }
            break;
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(94); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,8,_ctx);
      } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
      setState(96);
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

  public static class NameContext extends ParserRuleContext {
    public List<TerminalNode> LETTERS() { return getTokens(XyzParser.LETTERS); }
    public TerminalNode LETTERS(int i) {
      return getToken(XyzParser.LETTERS, i);
    }
    public List<TerminalNode> MUSIC_LETTER() { return getTokens(XyzParser.MUSIC_LETTER); }
    public TerminalNode MUSIC_LETTER(int i) {
      return getToken(XyzParser.MUSIC_LETTER, i);
    }
    public List<TerminalNode> NUMBER() { return getTokens(XyzParser.NUMBER); }
    public TerminalNode NUMBER(int i) {
      return getToken(XyzParser.NUMBER, i);
    }
    public NameContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_name; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof XyzListener ) ((XyzListener)listener).enterName(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof XyzListener ) ((XyzListener)listener).exitName(this);
    }
  }

  public final NameContext name() throws RecognitionException {
    NameContext _localctx = new NameContext(_ctx, getState());
    enterRule(_localctx, 20, RULE_name);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(99); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(98);
        _la = _input.LA(1);
        if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << NUMBER) | (1L << LETTERS) | (1L << MUSIC_LETTER))) != 0)) ) {
        _errHandler.recoverInline(this);
        } else {
          consume();
        }
        }
        }
        setState(101); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << NUMBER) | (1L << LETTERS) | (1L << MUSIC_LETTER))) != 0) );
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\25j\4\2\t\2\4\3"+
      "\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
      "\t\13\4\f\t\f\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3#\n\3\f\3"+
      "\16\3&\13\3\3\3\3\3\3\4\3\4\7\4,\n\4\f\4\16\4/\13\4\3\4\3\4\7\4\63"+
      "\n\4\f\4\16\4\66\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7"+
      "\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\5\tM\n\t\3\t\3\t\3\t\3\n"+
      "\3\n\3\n\5\nU\n\n\3\n\5\nX\n\n\3\n\3\n\3\13\3\13\3\13\6\13_\n\13\r"+
      "\13\16\13`\3\13\3\13\3\f\6\ff\n\f\r\f\16\fg\3\f\2\2\r\2\4\6\b\n\f"+
      "\16\20\22\24\26\2\5\4\2\6\6\f\f\3\2\t\n\6\2\3\3\5\6\b\b\r\rk\2\30"+
      "\3\2\2\2\4\33\3\2\2\2\6)\3\2\2\2\b9\3\2\2\2\n=\3\2\2\2\fA\3\2\2\2"+
      "\16E\3\2\2\2\20I\3\2\2\2\22Q\3\2\2\2\24[\3\2\2\2\26e\3\2\2\2\30\31"+
      "\5\4\3\2\31\32\7\2\2\3\32\3\3\2\2\2\33\34\5\6\4\2\34$\5\b\5\2\35#"+
      "\5\n\6\2\36#\5\f\7\2\37#\5\16\b\2 #\5\20\t\2!#\5\24\13\2\"\35\3\2"+
      "\2\2\"\36\3\2\2\2\"\37\3\2\2\2\" \3\2\2\2\"!\3\2\2\2#&\3\2\2\2$\""+
      "\3\2\2\2$%\3\2\2\2%\'\3\2\2\2&$\3\2\2\2\'(\5\22\n\2(\5\3\2\2\2)-\7"+
      "\16\2\2*,\7\3\2\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\60\3\2"+
      "\2\2/-\3\2\2\2\60\64\7\6\2\2\61\63\7\3\2\2\62\61\3\2\2\2\63\66\3\2"+
      "\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\67\3\2\2\2\66\64\3\2\2\2\678\7"+
      "\7\2\28\7\3\2\2\29:\7\17\2\2:;\5\26\f\2;<\7\7\2\2<\t\3\2\2\2=>\7\20"+
      "\2\2>?\5\26\f\2?@\7\7\2\2@\13\3\2\2\2AB\7\21\2\2BC\7\6\2\2CD\7\7\2"+
      "\2D\r\3\2\2\2EF\7\22\2\2FG\t\2\2\2GH\7\7\2\2H\17\3\2\2\2IL\7\23\2"+
      "\2JK\7\6\2\2KM\7\4\2\2LJ\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\7\6\2\2OP\7"+
      "\7\2\2P\21\3\2\2\2QR\7\24\2\2RT\7\r\2\2SU\t\3\2\2TS\3\2\2\2TU\3\2"+
      "\2\2UW\3\2\2\2VX\7\13\2\2WV\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ\7\7\2\2"+
      "Z\23\3\2\2\2[^\7\25\2\2\\_\13\2\2\2]_\7\3\2\2^\\\3\2\2\2^]\3\2\2\2"+
      "_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\7\7\2\2c\25\3\2\2\2df\t"+
      "\4\2\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\27\3\2\2\2\f\"$-\64"+
      "LTW^`g";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}