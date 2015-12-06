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
    T__0=1, T__1=2, SPECIAL=3, DIGIT=4, SPACE=5, NEWLINE=6, LETTERS=7, SHARP=8, 
    FLAT=9, MINOR=10, C_LETTER=11, CL_LETTER=12, MUSIC_LETTER=13, INDEX_PREFIX=14, 
    TITLE_PREFIX=15, COMPOSER_PREFIX=16, LENGTH_PREFIX=17, METER_PREFIX=18, 
    TEMPO_PREFIX=19, KEY_PREFIX=20, VOICE_PREFIX=21;
  public static final int
    RULE_root = 0, RULE_header = 1, RULE_index = 2, RULE_title = 3, RULE_composer = 4, 
    RULE_length = 5, RULE_meter = 6, RULE_tempo = 7, RULE_key = 8, RULE_voice = 9, 
    RULE_characters = 10, RULE_temp_bpm = 11, RULE_number = 12;
  public static final String[] ruleNames = {
    "root", "header", "index", "title", "composer", "length", "meter", "tempo", 
    "key", "voice", "characters", "temp_bpm", "number"
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
      setState(26);
      header();
      setState(27);
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
      setState(29);
      index();
      setState(30);
      title();
      setState(38);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMPOSER_PREFIX) | (1L << LENGTH_PREFIX) | (1L << METER_PREFIX) | (1L << TEMPO_PREFIX) | (1L << VOICE_PREFIX))) != 0)) {
        {
        setState(36);
        switch (_input.LA(1)) {
        case COMPOSER_PREFIX:
          {
          setState(31);
          composer();
          }
          break;
        case LENGTH_PREFIX:
          {
          setState(32);
          length();
          }
          break;
        case METER_PREFIX:
          {
          setState(33);
          meter();
          }
          break;
        case TEMPO_PREFIX:
          {
          setState(34);
          tempo();
          }
          break;
        case VOICE_PREFIX:
          {
          setState(35);
          voice();
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        }
        setState(40);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(41);
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
    public NumberContext number() {
      return getRuleContext(NumberContext.class,0);
    }
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
      setState(43);
      match(INDEX_PREFIX);
      setState(47);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==SPACE) {
        {
        {
        setState(44);
        match(SPACE);
        }
        }
        setState(49);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(50);
      number();
      setState(54);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==SPACE) {
        {
        {
        setState(51);
        match(SPACE);
        }
        }
        setState(56);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
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
      setState(59);
      match(TITLE_PREFIX);
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
      setState(63);
      match(COMPOSER_PREFIX);
      setState(64);
      characters();
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

  public static class LengthContext extends ParserRuleContext {
    public TerminalNode LENGTH_PREFIX() { return getToken(XyzParser.LENGTH_PREFIX, 0); }
    public NumberContext number() {
      return getRuleContext(NumberContext.class,0);
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
      setState(67);
      match(LENGTH_PREFIX);
      setState(68);
      number();
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

  public static class MeterContext extends ParserRuleContext {
    public TerminalNode METER_PREFIX() { return getToken(XyzParser.METER_PREFIX, 0); }
    public TerminalNode NEWLINE() { return getToken(XyzParser.NEWLINE, 0); }
    public TerminalNode C_LETTER() { return getToken(XyzParser.C_LETTER, 0); }
    public TerminalNode CL_LETTER() { return getToken(XyzParser.CL_LETTER, 0); }
    public NumberContext number() {
      return getRuleContext(NumberContext.class,0);
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
      setState(71);
      match(METER_PREFIX);
      setState(75);
      switch (_input.LA(1)) {
      case C_LETTER:
        {
        setState(72);
        match(C_LETTER);
        }
        break;
      case CL_LETTER:
        {
        setState(73);
        match(CL_LETTER);
        }
        break;
      case DIGIT:
        {
        setState(74);
        number();
        }
        break;
      default:
        throw new NoViableAltException(this);
      }
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

  public static class TempoContext extends ParserRuleContext {
    public TerminalNode TEMPO_PREFIX() { return getToken(XyzParser.TEMPO_PREFIX, 0); }
    public Temp_bpmContext temp_bpm() {
      return getRuleContext(Temp_bpmContext.class,0);
    }
    public TerminalNode NEWLINE() { return getToken(XyzParser.NEWLINE, 0); }
    public NumberContext number() {
      return getRuleContext(NumberContext.class,0);
    }
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
      setState(79);
      match(TEMPO_PREFIX);
      setState(83);
      switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
      case 1:
        {
        setState(80);
        number();
        setState(81);
        match(T__0);
        }
        break;
      }
      setState(85);
      temp_bpm();
      setState(86);
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
      setState(88);
      match(KEY_PREFIX);
      setState(89);
      _la = _input.LA(1);
      if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FLAT) | (1L << C_LETTER) | (1L << MUSIC_LETTER))) != 0)) ) {
      _errHandler.recoverInline(this);
      } else {
        consume();
      }
      setState(91);
      _la = _input.LA(1);
      if (_la==SHARP || _la==FLAT) {
        {
        setState(90);
        _la = _input.LA(1);
        if ( !(_la==SHARP || _la==FLAT) ) {
        _errHandler.recoverInline(this);
        } else {
          consume();
        }
        }
      }

      setState(94);
      _la = _input.LA(1);
      if (_la==MINOR) {
        {
        setState(93);
        match(MINOR);
        }
      }

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
      setState(98);
      match(VOICE_PREFIX);
      setState(99);
      characters();
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
    public List<TerminalNode> DIGIT() { return getTokens(XyzParser.DIGIT); }
    public TerminalNode DIGIT(int i) {
      return getToken(XyzParser.DIGIT, i);
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
      setState(103); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(102);
        _la = _input.LA(1);
        if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPECIAL) | (1L << DIGIT) | (1L << SPACE) | (1L << LETTERS) | (1L << SHARP) | (1L << FLAT) | (1L << MINOR) | (1L << C_LETTER) | (1L << MUSIC_LETTER))) != 0)) ) {
        _errHandler.recoverInline(this);
        } else {
          consume();
        }
        }
        }
        setState(105); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPECIAL) | (1L << DIGIT) | (1L << SPACE) | (1L << LETTERS) | (1L << SHARP) | (1L << FLAT) | (1L << MINOR) | (1L << C_LETTER) | (1L << MUSIC_LETTER))) != 0) );
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

  public static class Temp_bpmContext extends ParserRuleContext {
    public List<TerminalNode> DIGIT() { return getTokens(XyzParser.DIGIT); }
    public TerminalNode DIGIT(int i) {
      return getToken(XyzParser.DIGIT, i);
    }
    public Temp_bpmContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_temp_bpm; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof XyzListener ) ((XyzListener)listener).enterTemp_bpm(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof XyzListener ) ((XyzListener)listener).exitTemp_bpm(this);
    }
  }

  public final Temp_bpmContext temp_bpm() throws RecognitionException {
    Temp_bpmContext _localctx = new Temp_bpmContext(_ctx, getState());
    enterRule(_localctx, 22, RULE_temp_bpm);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(108); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(107);
        match(DIGIT);
        }
        }
        setState(110); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
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

  public static class NumberContext extends ParserRuleContext {
    public List<TerminalNode> DIGIT() { return getTokens(XyzParser.DIGIT); }
    public TerminalNode DIGIT(int i) {
      return getToken(XyzParser.DIGIT, i);
    }
    public NumberContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_number; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof XyzListener ) ((XyzListener)listener).enterNumber(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof XyzListener ) ((XyzListener)listener).exitNumber(this);
    }
  }

  public final NumberContext number() throws RecognitionException {
    NumberContext _localctx = new NumberContext(_ctx, getState());
    enterRule(_localctx, 24, RULE_number);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(113); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(112);
          match(DIGIT);
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(115); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,10,_ctx);
      } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
      setState(118);
      _la = _input.LA(1);
      if (_la==T__1) {
        {
        setState(117);
        match(T__1);
        }
      }

      setState(123);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==DIGIT) {
        {
        {
        setState(120);
        match(DIGIT);
        }
        }
        setState(125);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\27\u0081\4\2\t"+
      "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
      "\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
      "\3\3\3\3\3\7\3\'\n\3\f\3\16\3*\13\3\3\3\3\3\3\4\3\4\7\4\60\n\4\f\4"+
      "\16\4\63\13\4\3\4\3\4\7\4\67\n\4\f\4\16\4:\13\4\3\4\3\4\3\5\3\5\3"+
      "\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\bN\n\b\3"+
      "\b\3\b\3\t\3\t\3\t\3\t\5\tV\n\t\3\t\3\t\3\t\3\n\3\n\3\n\5\n^\n\n\3"+
      "\n\5\na\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\6\fj\n\f\r\f\16\fk\3\r"+
      "\6\ro\n\r\r\r\16\rp\3\16\6\16t\n\16\r\16\16\16u\3\16\5\16y\n\16\3"+
      "\16\7\16|\n\16\f\16\16\16\177\13\16\3\16\2\2\17\2\4\6\b\n\f\16\20"+
      "\22\24\26\30\32\2\5\5\2\13\13\r\r\17\17\3\2\n\13\5\2\5\7\t\r\17\17"+
      "\u0084\2\34\3\2\2\2\4\37\3\2\2\2\6-\3\2\2\2\b=\3\2\2\2\nA\3\2\2\2"+
      "\fE\3\2\2\2\16I\3\2\2\2\20Q\3\2\2\2\22Z\3\2\2\2\24d\3\2\2\2\26i\3"+
      "\2\2\2\30n\3\2\2\2\32s\3\2\2\2\34\35\5\4\3\2\35\36\7\2\2\3\36\3\3"+
      "\2\2\2\37 \5\6\4\2 (\5\b\5\2!\'\5\n\6\2\"\'\5\f\7\2#\'\5\16\b\2$\'"+
      "\5\20\t\2%\'\5\24\13\2&!\3\2\2\2&\"\3\2\2\2&#\3\2\2\2&$\3\2\2\2&%"+
      "\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2)+\3\2\2\2*(\3\2\2\2+,\5\22"+
      "\n\2,\5\3\2\2\2-\61\7\20\2\2.\60\7\7\2\2/.\3\2\2\2\60\63\3\2\2\2\61"+
      "/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63\61\3\2\2\2\648\5\32\16\2"+
      "\65\67\7\7\2\2\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29;\3"+
      "\2\2\2:8\3\2\2\2;<\7\b\2\2<\7\3\2\2\2=>\7\21\2\2>?\5\26\f\2?@\7\b"+
      "\2\2@\t\3\2\2\2AB\7\22\2\2BC\5\26\f\2CD\7\b\2\2D\13\3\2\2\2EF\7\23"+
      "\2\2FG\5\32\16\2GH\7\b\2\2H\r\3\2\2\2IM\7\24\2\2JN\7\r\2\2KN\7\16"+
      "\2\2LN\5\32\16\2MJ\3\2\2\2MK\3\2\2\2ML\3\2\2\2NO\3\2\2\2OP\7\b\2\2"+
      "P\17\3\2\2\2QU\7\25\2\2RS\5\32\16\2ST\7\3\2\2TV\3\2\2\2UR\3\2\2\2"+
      "UV\3\2\2\2VW\3\2\2\2WX\5\30\r\2XY\7\b\2\2Y\21\3\2\2\2Z[\7\26\2\2["+
      "]\t\2\2\2\\^\t\3\2\2]\\\3\2\2\2]^\3\2\2\2^`\3\2\2\2_a\7\f\2\2`_\3"+
      "\2\2\2`a\3\2\2\2ab\3\2\2\2bc\7\b\2\2c\23\3\2\2\2de\7\27\2\2ef\5\26"+
      "\f\2fg\7\b\2\2g\25\3\2\2\2hj\t\4\2\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2"+
      "kl\3\2\2\2l\27\3\2\2\2mo\7\6\2\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3"+
      "\2\2\2q\31\3\2\2\2rt\7\6\2\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2"+
      "\2vx\3\2\2\2wy\7\4\2\2xw\3\2\2\2xy\3\2\2\2y}\3\2\2\2z|\7\6\2\2{z\3"+
      "\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\33\3\2\2\2\177}\3\2\2\2\17"+
      "&(\618MU]`kpux}";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}