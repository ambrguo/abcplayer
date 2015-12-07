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
    T__0=1, DIGITS=2, SLASH=3, SPACE=4, NEWLINE=5, LETTERS=6, SHARP=7, FLAT=8, 
    MINOR=9, C_LETTER=10, CL_LETTER=11, MUSIC_LETTER=12, SPECIAL=13, INDEX_PREFIX=14, 
    TITLE_PREFIX=15, COMPOSER_PREFIX=16, LENGTH_PREFIX=17, METER_PREFIX=18, 
    TEMPO_PREFIX=19, KEY_PREFIX=20, VOICE_PREFIX=21;
  public static final int
    RULE_root = 0, RULE_header = 1, RULE_index = 2, RULE_title = 3, RULE_composer = 4, 
    RULE_length = 5, RULE_meter = 6, RULE_tempo = 7, RULE_key = 8, RULE_voice = 9, 
    RULE_characters = 10;
  public static final String[] ruleNames = {
    "root", "header", "index", "title", "composer", "length", "meter", "tempo", 
    "key", "voice", "characters"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'='", null, "'/'", "' '", null, null, "'#'", "'b'", "'m'", "'C'", 
    "'C|'", null, null, "'X:'", "'T:'", "'C:'", "'L:'", "'M:'", "'Q:'", 
    "'K:'", "'V:'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, "DIGITS", "SLASH", "SPACE", "NEWLINE", "LETTERS", "SHARP", 
    "FLAT", "MINOR", "C_LETTER", "CL_LETTER", "MUSIC_LETTER", "SPECIAL", 
    "INDEX_PREFIX", "TITLE_PREFIX", "COMPOSER_PREFIX", "LENGTH_PREFIX", 
    "METER_PREFIX", "TEMPO_PREFIX", "KEY_PREFIX", "VOICE_PREFIX"
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
    public TerminalNode DIGITS() { return getToken(XyzParser.DIGITS, 0); }
    public TerminalNode NEWLINE() { return getToken(XyzParser.NEWLINE, 0); }
    public List<TerminalNode> SPACE() { return getTokens(XyzParser.SPACE); }
    public TerminalNode SPACE(int i) {
      return getToken(XyzParser.SPACE, i);
    }
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
      while (_la==SPACE) {
        {
        {
        setState(40);
        match(SPACE);
        }
        }
        setState(45);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(46);
      match(DIGITS);
      setState(50);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==SPACE) {
        {
        {
        setState(47);
        match(SPACE);
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
    public CharactersContext characters() {
      return getRuleContext(CharactersContext.class,0);
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
      characters();
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
    public CharactersContext characters() {
      return getRuleContext(CharactersContext.class,0);
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
      characters();
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
    public List<TerminalNode> DIGITS() { return getTokens(XyzParser.DIGITS); }
    public TerminalNode DIGITS(int i) {
      return getToken(XyzParser.DIGITS, i);
    }
    public TerminalNode SLASH() { return getToken(XyzParser.SLASH, 0); }
    public TerminalNode NEWLINE() { return getToken(XyzParser.NEWLINE, 0); }
    public List<TerminalNode> SPACE() { return getTokens(XyzParser.SPACE); }
    public TerminalNode SPACE(int i) {
      return getToken(XyzParser.SPACE, i);
    }
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
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(63);
      match(LENGTH_PREFIX);
      setState(67);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==SPACE) {
        {
        {
        setState(64);
        match(SPACE);
        }
        }
        setState(69);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(70);
      match(DIGITS);
      setState(71);
      match(SLASH);
      setState(72);
      match(DIGITS);
      setState(76);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==SPACE) {
        {
        {
        setState(73);
        match(SPACE);
        }
        }
        setState(78);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(79);
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
    public TerminalNode C_LETTER() { return getToken(XyzParser.C_LETTER, 0); }
    public TerminalNode CL_LETTER() { return getToken(XyzParser.CL_LETTER, 0); }
    public List<TerminalNode> DIGITS() { return getTokens(XyzParser.DIGITS); }
    public TerminalNode DIGITS(int i) {
      return getToken(XyzParser.DIGITS, i);
    }
    public TerminalNode SLASH() { return getToken(XyzParser.SLASH, 0); }
    public List<TerminalNode> SPACE() { return getTokens(XyzParser.SPACE); }
    public TerminalNode SPACE(int i) {
      return getToken(XyzParser.SPACE, i);
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
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(81);
      match(METER_PREFIX);
      setState(85);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==SPACE) {
        {
        {
        setState(82);
        match(SPACE);
        }
        }
        setState(87);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(93);
      switch (_input.LA(1)) {
      case C_LETTER:
        {
        setState(88);
        match(C_LETTER);
        }
        break;
      case CL_LETTER:
        {
        setState(89);
        match(CL_LETTER);
        }
        break;
      case DIGITS:
        {
        setState(90);
        match(DIGITS);
        setState(91);
        match(SLASH);
        setState(92);
        match(DIGITS);
        }
        break;
      default:
        throw new NoViableAltException(this);
      }
      setState(98);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==SPACE) {
        {
        {
        setState(95);
        match(SPACE);
        }
        }
        setState(100);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(101);
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
    public List<TerminalNode> DIGITS() { return getTokens(XyzParser.DIGITS); }
    public TerminalNode DIGITS(int i) {
      return getToken(XyzParser.DIGITS, i);
    }
    public TerminalNode NEWLINE() { return getToken(XyzParser.NEWLINE, 0); }
    public List<TerminalNode> SPACE() { return getTokens(XyzParser.SPACE); }
    public TerminalNode SPACE(int i) {
      return getToken(XyzParser.SPACE, i);
    }
    public TerminalNode SLASH() { return getToken(XyzParser.SLASH, 0); }
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
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(103);
      match(TEMPO_PREFIX);
      setState(107);
      _errHandler.sync(this);
      _alt = getInterpreter().adaptivePredict(_input,9,_ctx);
      while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
        if ( _alt==1 ) {
          {
          {
          setState(104);
          match(SPACE);
          }
          } 
        }
        setState(109);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,9,_ctx);
      }
      setState(120);
      switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
      case 1:
        {
        setState(110);
        match(DIGITS);
        setState(111);
        match(SLASH);
        setState(112);
        match(DIGITS);
        setState(116);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la==SPACE) {
          {
          {
          setState(113);
          match(SPACE);
          }
          }
          setState(118);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(119);
        match(T__0);
        }
        break;
      }
      setState(125);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==SPACE) {
        {
        {
        setState(122);
        match(SPACE);
        }
        }
        setState(127);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(128);
      match(DIGITS);
      setState(132);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==SPACE) {
        {
        {
        setState(129);
        match(SPACE);
        }
        }
        setState(134);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(135);
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
    public TerminalNode NEWLINE() { return getToken(XyzParser.NEWLINE, 0); }
    public TerminalNode MUSIC_LETTER() { return getToken(XyzParser.MUSIC_LETTER, 0); }
    public List<TerminalNode> FLAT() { return getTokens(XyzParser.FLAT); }
    public TerminalNode FLAT(int i) {
      return getToken(XyzParser.FLAT, i);
    }
    public TerminalNode C_LETTER() { return getToken(XyzParser.C_LETTER, 0); }
    public List<TerminalNode> SPACE() { return getTokens(XyzParser.SPACE); }
    public TerminalNode SPACE(int i) {
      return getToken(XyzParser.SPACE, i);
    }
    public TerminalNode MINOR() { return getToken(XyzParser.MINOR, 0); }
    public TerminalNode SHARP() { return getToken(XyzParser.SHARP, 0); }
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
      setState(137);
      match(KEY_PREFIX);
      setState(141);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==SPACE) {
        {
        {
        setState(138);
        match(SPACE);
        }
        }
        setState(143);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(144);
      _la = _input.LA(1);
      if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FLAT) | (1L << C_LETTER) | (1L << MUSIC_LETTER))) != 0)) ) {
      _errHandler.recoverInline(this);
      } else {
        consume();
      }
      setState(146);
      _la = _input.LA(1);
      if (_la==SHARP || _la==FLAT) {
        {
        setState(145);
        _la = _input.LA(1);
        if ( !(_la==SHARP || _la==FLAT) ) {
        _errHandler.recoverInline(this);
        } else {
          consume();
        }
        }
      }

      setState(149);
      _la = _input.LA(1);
      if (_la==MINOR) {
        {
        setState(148);
        match(MINOR);
        }
      }

      setState(154);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==SPACE) {
        {
        {
        setState(151);
        match(SPACE);
        }
        }
        setState(156);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(157);
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
    public CharactersContext characters() {
      return getRuleContext(CharactersContext.class,0);
    }
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
      enterOuterAlt(_localctx, 1);
      {
      setState(159);
      match(VOICE_PREFIX);
      setState(160);
      characters();
      setState(161);
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

  public static class CharactersContext extends ParserRuleContext {
    public List<TerminalNode> MUSIC_LETTER() { return getTokens(XyzParser.MUSIC_LETTER); }
    public TerminalNode MUSIC_LETTER(int i) {
      return getToken(XyzParser.MUSIC_LETTER, i);
    }
    public List<TerminalNode> LETTERS() { return getTokens(XyzParser.LETTERS); }
    public TerminalNode LETTERS(int i) {
      return getToken(XyzParser.LETTERS, i);
    }
    public List<TerminalNode> SPECIAL() { return getTokens(XyzParser.SPECIAL); }
    public TerminalNode SPECIAL(int i) {
      return getToken(XyzParser.SPECIAL, i);
    }
    public List<TerminalNode> SLASH() { return getTokens(XyzParser.SLASH); }
    public TerminalNode SLASH(int i) {
      return getToken(XyzParser.SLASH, i);
    }
    public List<TerminalNode> DIGITS() { return getTokens(XyzParser.DIGITS); }
    public TerminalNode DIGITS(int i) {
      return getToken(XyzParser.DIGITS, i);
    }
    public List<TerminalNode> SPACE() { return getTokens(XyzParser.SPACE); }
    public TerminalNode SPACE(int i) {
      return getToken(XyzParser.SPACE, i);
    }
    public List<TerminalNode> SHARP() { return getTokens(XyzParser.SHARP); }
    public TerminalNode SHARP(int i) {
      return getToken(XyzParser.SHARP, i);
    }
    public List<TerminalNode> MINOR() { return getTokens(XyzParser.MINOR); }
    public TerminalNode MINOR(int i) {
      return getToken(XyzParser.MINOR, i);
    }
    public List<TerminalNode> FLAT() { return getTokens(XyzParser.FLAT); }
    public TerminalNode FLAT(int i) {
      return getToken(XyzParser.FLAT, i);
    }
    public List<TerminalNode> C_LETTER() { return getTokens(XyzParser.C_LETTER); }
    public TerminalNode C_LETTER(int i) {
      return getToken(XyzParser.C_LETTER, i);
    }
    public CharactersContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_characters; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof XyzListener ) ((XyzListener)listener).enterCharacters(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof XyzListener ) ((XyzListener)listener).exitCharacters(this);
    }
  }

  public final CharactersContext characters() throws RecognitionException {
    CharactersContext _localctx = new CharactersContext(_ctx, getState());
    enterRule(_localctx, 20, RULE_characters);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(164); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(163);
        _la = _input.LA(1);
        if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGITS) | (1L << SLASH) | (1L << SPACE) | (1L << LETTERS) | (1L << SHARP) | (1L << FLAT) | (1L << MINOR) | (1L << C_LETTER) | (1L << MUSIC_LETTER) | (1L << SPECIAL))) != 0)) ) {
        _errHandler.recoverInline(this);
        } else {
          consume();
        }
        }
        }
        setState(166); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGITS) | (1L << SLASH) | (1L << SPACE) | (1L << LETTERS) | (1L << SHARP) | (1L << FLAT) | (1L << MINOR) | (1L << C_LETTER) | (1L << MUSIC_LETTER) | (1L << SPECIAL))) != 0) );
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\27\u00ab\4\2\t"+
      "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
      "\4\13\t\13\4\f\t\f\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3#\n"+
      "\3\f\3\16\3&\13\3\3\3\3\3\3\4\3\4\7\4,\n\4\f\4\16\4/\13\4\3\4\3\4"+
      "\7\4\63\n\4\f\4\16\4\66\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
      "\6\3\7\3\7\7\7D\n\7\f\7\16\7G\13\7\3\7\3\7\3\7\3\7\7\7M\n\7\f\7\16"+
      "\7P\13\7\3\7\3\7\3\b\3\b\7\bV\n\b\f\b\16\bY\13\b\3\b\3\b\3\b\3\b\3"+
      "\b\5\b`\n\b\3\b\7\bc\n\b\f\b\16\bf\13\b\3\b\3\b\3\t\3\t\7\tl\n\t\f"+
      "\t\16\to\13\t\3\t\3\t\3\t\3\t\7\tu\n\t\f\t\16\tx\13\t\3\t\5\t{\n\t"+
      "\3\t\7\t~\n\t\f\t\16\t\u0081\13\t\3\t\3\t\7\t\u0085\n\t\f\t\16\t\u0088"+
      "\13\t\3\t\3\t\3\n\3\n\7\n\u008e\n\n\f\n\16\n\u0091\13\n\3\n\3\n\5"+
      "\n\u0095\n\n\3\n\5\n\u0098\n\n\3\n\7\n\u009b\n\n\f\n\16\n\u009e\13"+
      "\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\6\f\u00a7\n\f\r\f\16\f\u00a8\3"+
      "\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\5\5\2\n\n\f\f\16\16\3\2\t\n"+
      "\5\2\4\6\b\f\16\17\u00b6\2\30\3\2\2\2\4\33\3\2\2\2\6)\3\2\2\2\b9\3"+
      "\2\2\2\n=\3\2\2\2\fA\3\2\2\2\16S\3\2\2\2\20i\3\2\2\2\22\u008b\3\2"+
      "\2\2\24\u00a1\3\2\2\2\26\u00a6\3\2\2\2\30\31\5\4\3\2\31\32\7\2\2\3"+
      "\32\3\3\2\2\2\33\34\5\6\4\2\34$\5\b\5\2\35#\5\n\6\2\36#\5\f\7\2\37"+
      "#\5\16\b\2 #\5\20\t\2!#\5\24\13\2\"\35\3\2\2\2\"\36\3\2\2\2\"\37\3"+
      "\2\2\2\" \3\2\2\2\"!\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\'\3\2"+
      "\2\2&$\3\2\2\2\'(\5\22\n\2(\5\3\2\2\2)-\7\20\2\2*,\7\6\2\2+*\3\2\2"+
      "\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/-\3\2\2\2\60\64\7\4\2"+
      "\2\61\63\7\6\2\2\62\61\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3"+
      "\2\2\2\65\67\3\2\2\2\66\64\3\2\2\2\678\7\7\2\28\7\3\2\2\29:\7\21\2"+
      "\2:;\5\26\f\2;<\7\7\2\2<\t\3\2\2\2=>\7\22\2\2>?\5\26\f\2?@\7\7\2\2"+
      "@\13\3\2\2\2AE\7\23\2\2BD\7\6\2\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF"+
      "\3\2\2\2FH\3\2\2\2GE\3\2\2\2HI\7\4\2\2IJ\7\5\2\2JN\7\4\2\2KM\7\6\2"+
      "\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QR\7"+
      "\7\2\2R\r\3\2\2\2SW\7\24\2\2TV\7\6\2\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2"+
      "\2WX\3\2\2\2X_\3\2\2\2YW\3\2\2\2Z`\7\f\2\2[`\7\r\2\2\\]\7\4\2\2]^"+
      "\7\5\2\2^`\7\4\2\2_Z\3\2\2\2_[\3\2\2\2_\\\3\2\2\2`d\3\2\2\2ac\7\6"+
      "\2\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2eg\3\2\2\2fd\3\2\2\2g"+
      "h\7\7\2\2h\17\3\2\2\2im\7\25\2\2jl\7\6\2\2kj\3\2\2\2lo\3\2\2\2mk\3"+
      "\2\2\2mn\3\2\2\2nz\3\2\2\2om\3\2\2\2pq\7\4\2\2qr\7\5\2\2rv\7\4\2\2"+
      "su\7\6\2\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2xv\3\2"+
      "\2\2y{\7\3\2\2zp\3\2\2\2z{\3\2\2\2{\177\3\2\2\2|~\7\6\2\2}|\3\2\2"+
      "\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2"+
      "\2\u0081\177\3\2\2\2\u0082\u0086\7\4\2\2\u0083\u0085\7\6\2\2\u0084"+
      "\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087"+
      "\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\7\7\2"+
      "\2\u008a\21\3\2\2\2\u008b\u008f\7\26\2\2\u008c\u008e\7\6\2\2\u008d"+
      "\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090"+
      "\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0094\t\2\2"+
      "\2\u0093\u0095\t\3\2\2\u0094\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
      "\u0097\3\2\2\2\u0096\u0098\7\13\2\2\u0097\u0096\3\2\2\2\u0097\u0098"+
      "\3\2\2\2\u0098\u009c\3\2\2\2\u0099\u009b\7\6\2\2\u009a\u0099\3\2\2"+
      "\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
      "\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7\7\2\2\u00a0\23\3"+
      "\2\2\2\u00a1\u00a2\7\27\2\2\u00a2\u00a3\5\26\f\2\u00a3\u00a4\7\7\2"+
      "\2\u00a4\25\3\2\2\2\u00a5\u00a7\t\4\2\2\u00a6\u00a5\3\2\2\2\u00a7"+
      "\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\27\3"+
      "\2\2\2\25\"$-\64ENW_dmvz\177\u0086\u008f\u0094\u0097\u009c\u00a8";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}