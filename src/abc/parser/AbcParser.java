// Generated from Abc.g4 by ANTLR 4.5.1

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
public class AbcParser extends Parser {
  static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache =
    new PredictionContextCache();
  public static final int
    T__0=1, T__1=2, T__2=3, T__3=4, NEWLINE=5, LETTER=6, DURATION=7, OCTAVE=8, 
    ACCIDENTAL=9, DUPLET=10, TRIPLET=11, QUADRUPLET=12, BARLINE=13, BEGIN_REPEAT=14, 
    END_REPEAT=15, ONE_REPEAT=16, TWO_REPEAT=17, VOICE_PREFIX=18, SPACES=19, 
    PERCENT=20;
  public static final int
    RULE_root = 0, RULE_body = 1, RULE_line = 2, RULE_measure = 3, RULE_voice = 4, 
    RULE_element = 5, RULE_tuplet = 6, RULE_note = 7, RULE_rest = 8, RULE_duration = 9, 
    RULE_octave = 10, RULE_accidental = 11, RULE_chord = 12, RULE_duplet = 13, 
    RULE_triplet = 14, RULE_quadruplet = 15;
  public static final String[] ruleNames = {
    "root", "body", "line", "measure", "voice", "element", "tuplet", "note", 
    "rest", "duration", "octave", "accidental", "chord", "duplet", "triplet", 
    "quadruplet"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "' '", "'z'", "'['", "']'", null, null, null, null, null, null, 
    null, null, null, "'|:'", "':|'", "'[1'", "'[2'", "'V:'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, "NEWLINE", "LETTER", "DURATION", "OCTAVE", 
    "ACCIDENTAL", "DUPLET", "TRIPLET", "QUADRUPLET", "BARLINE", "BEGIN_REPEAT", 
    "END_REPEAT", "ONE_REPEAT", "TWO_REPEAT", "VOICE_PREFIX", "SPACES", 
    "PERCENT"
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
  public String getGrammarFileName() { return "Abc.g4"; }

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

  public AbcParser(TokenStream input) {
    super(input);
    _interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
  }
  public static class RootContext extends ParserRuleContext {
    public BodyContext body() {
      return getRuleContext(BodyContext.class,0);
    }
    public TerminalNode EOF() { return getToken(AbcParser.EOF, 0); }
    public RootContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_root; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterRoot(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitRoot(this);
    }
  }

  public final RootContext root() throws RecognitionException {
    RootContext _localctx = new RootContext(_ctx, getState());
    enterRule(_localctx, 0, RULE_root);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(32);
      body();
      setState(33);
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

  public static class BodyContext extends ParserRuleContext {
    public List<LineContext> line() {
      return getRuleContexts(LineContext.class);
    }
    public LineContext line(int i) {
      return getRuleContext(LineContext.class,i);
    }
    public BodyContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_body; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterBody(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitBody(this);
    }
  }

  public final BodyContext body() throws RecognitionException {
    BodyContext _localctx = new BodyContext(_ctx, getState());
    enterRule(_localctx, 2, RULE_body);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(36); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(35);
        line();
        }
        }
        setState(38); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << NEWLINE) | (1L << LETTER) | (1L << ACCIDENTAL) | (1L << DUPLET) | (1L << TRIPLET) | (1L << QUADRUPLET) | (1L << BARLINE) | (1L << BEGIN_REPEAT) | (1L << ONE_REPEAT) | (1L << TWO_REPEAT) | (1L << VOICE_PREFIX))) != 0) );
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

  public static class LineContext extends ParserRuleContext {
    public List<TerminalNode> NEWLINE() { return getTokens(AbcParser.NEWLINE); }
    public TerminalNode NEWLINE(int i) {
      return getToken(AbcParser.NEWLINE, i);
    }
    public VoiceContext voice() {
      return getRuleContext(VoiceContext.class,0);
    }
    public List<MeasureContext> measure() {
      return getRuleContexts(MeasureContext.class);
    }
    public MeasureContext measure(int i) {
      return getRuleContext(MeasureContext.class,i);
    }
    public LineContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_line; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterLine(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitLine(this);
    }
  }

  public final LineContext line() throws RecognitionException {
    LineContext _localctx = new LineContext(_ctx, getState());
    enterRule(_localctx, 4, RULE_line);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(43);
      _errHandler.sync(this);
      _alt = getInterpreter().adaptivePredict(_input,1,_ctx);
      while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
        if ( _alt==1 ) {
          {
          {
          setState(40);
          match(NEWLINE);
          }
          } 
        }
        setState(45);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,1,_ctx);
      }
      setState(52);
      switch (_input.LA(1)) {
      case T__0:
      case T__1:
      case T__2:
      case NEWLINE:
      case LETTER:
      case ACCIDENTAL:
      case DUPLET:
      case TRIPLET:
      case QUADRUPLET:
      case BARLINE:
      case BEGIN_REPEAT:
      case ONE_REPEAT:
      case TWO_REPEAT:
        {
        setState(47); 
        _errHandler.sync(this);
        _alt = 1;
        do {
          switch (_alt) {
          case 1:
            {
            {
            setState(46);
            measure();
            }
            }
            break;
          default:
            throw new NoViableAltException(this);
          }
          setState(49); 
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input,2,_ctx);
        } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
        }
        break;
      case VOICE_PREFIX:
        {
        setState(51);
        voice();
        }
        break;
      default:
        throw new NoViableAltException(this);
      }
      setState(54);
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

  public static class MeasureContext extends ParserRuleContext {
    public List<TerminalNode> BARLINE() { return getTokens(AbcParser.BARLINE); }
    public TerminalNode BARLINE(int i) {
      return getToken(AbcParser.BARLINE, i);
    }
    public TerminalNode END_REPEAT() { return getToken(AbcParser.END_REPEAT, 0); }
    public List<TerminalNode> NEWLINE() { return getTokens(AbcParser.NEWLINE); }
    public TerminalNode NEWLINE(int i) {
      return getToken(AbcParser.NEWLINE, i);
    }
    public List<ElementContext> element() {
      return getRuleContexts(ElementContext.class);
    }
    public ElementContext element(int i) {
      return getRuleContext(ElementContext.class,i);
    }
    public TerminalNode BEGIN_REPEAT() { return getToken(AbcParser.BEGIN_REPEAT, 0); }
    public TerminalNode ONE_REPEAT() { return getToken(AbcParser.ONE_REPEAT, 0); }
    public TerminalNode TWO_REPEAT() { return getToken(AbcParser.TWO_REPEAT, 0); }
    public MeasureContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_measure; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterMeasure(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitMeasure(this);
    }
  }

  public final MeasureContext measure() throws RecognitionException {
    MeasureContext _localctx = new MeasureContext(_ctx, getState());
    enterRule(_localctx, 6, RULE_measure);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(59);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==NEWLINE) {
        {
        {
        setState(56);
        match(NEWLINE);
        }
        }
        setState(61);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(63);
      _la = _input.LA(1);
      if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BARLINE) | (1L << BEGIN_REPEAT) | (1L << ONE_REPEAT) | (1L << TWO_REPEAT))) != 0)) {
        {
        setState(62);
        _la = _input.LA(1);
        if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BARLINE) | (1L << BEGIN_REPEAT) | (1L << ONE_REPEAT) | (1L << TWO_REPEAT))) != 0)) ) {
        _errHandler.recoverInline(this);
        } else {
          consume();
        }
        }
      }

      setState(68);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==T__0) {
        {
        {
        setState(65);
        match(T__0);
        }
        }
        setState(70);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(78); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(71);
        element();
        setState(75);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,7,_ctx);
        while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
          if ( _alt==1 ) {
            {
            {
            setState(72);
            match(T__0);
            }
            } 
          }
          setState(77);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input,7,_ctx);
        }
        }
        }
        setState(80); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << LETTER) | (1L << ACCIDENTAL) | (1L << DUPLET) | (1L << TRIPLET) | (1L << QUADRUPLET))) != 0) );
      setState(85);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==T__0) {
        {
        {
        setState(82);
        match(T__0);
        }
        }
        setState(87);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(88);
      _la = _input.LA(1);
      if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEWLINE) | (1L << BARLINE) | (1L << END_REPEAT))) != 0)) ) {
      _errHandler.recoverInline(this);
      } else {
        consume();
      }
      setState(92);
      _errHandler.sync(this);
      _alt = getInterpreter().adaptivePredict(_input,10,_ctx);
      while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
        if ( _alt==1 ) {
          {
          {
          setState(89);
          match(T__0);
          }
          } 
        }
        setState(94);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

  public static class VoiceContext extends ParserRuleContext {
    public TerminalNode VOICE_PREFIX() { return getToken(AbcParser.VOICE_PREFIX, 0); }
    public TerminalNode NEWLINE() { return getToken(AbcParser.NEWLINE, 0); }
    public VoiceContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_voice; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterVoice(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitVoice(this);
    }
  }

  public final VoiceContext voice() throws RecognitionException {
    VoiceContext _localctx = new VoiceContext(_ctx, getState());
    enterRule(_localctx, 8, RULE_voice);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(95);
      match(VOICE_PREFIX);
      setState(98); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          setState(98);
          switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
          case 1:
            {
            setState(96);
            matchWildcard();
            }
            break;
          case 2:
            {
            setState(97);
            match(T__0);
            }
            break;
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(100); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,12,_ctx);
      } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
      setState(102);
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

  public static class ElementContext extends ParserRuleContext {
    public NoteContext note() {
      return getRuleContext(NoteContext.class,0);
    }
    public RestContext rest() {
      return getRuleContext(RestContext.class,0);
    }
    public ChordContext chord() {
      return getRuleContext(ChordContext.class,0);
    }
    public TupletContext tuplet() {
      return getRuleContext(TupletContext.class,0);
    }
    public ElementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_element; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterElement(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitElement(this);
    }
  }

  public final ElementContext element() throws RecognitionException {
    ElementContext _localctx = new ElementContext(_ctx, getState());
    enterRule(_localctx, 10, RULE_element);
    try {
      setState(108);
      switch (_input.LA(1)) {
      case LETTER:
      case ACCIDENTAL:
        enterOuterAlt(_localctx, 1);
        {
        setState(104);
        note();
        }
        break;
      case T__1:
        enterOuterAlt(_localctx, 2);
        {
        setState(105);
        rest();
        }
        break;
      case T__2:
        enterOuterAlt(_localctx, 3);
        {
        setState(106);
        chord();
        }
        break;
      case DUPLET:
      case TRIPLET:
      case QUADRUPLET:
        enterOuterAlt(_localctx, 4);
        {
        setState(107);
        tuplet();
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

  public static class TupletContext extends ParserRuleContext {
    public DupletContext duplet() {
      return getRuleContext(DupletContext.class,0);
    }
    public TripletContext triplet() {
      return getRuleContext(TripletContext.class,0);
    }
    public QuadrupletContext quadruplet() {
      return getRuleContext(QuadrupletContext.class,0);
    }
    public TupletContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_tuplet; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterTuplet(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitTuplet(this);
    }
  }

  public final TupletContext tuplet() throws RecognitionException {
    TupletContext _localctx = new TupletContext(_ctx, getState());
    enterRule(_localctx, 12, RULE_tuplet);
    try {
      setState(113);
      switch (_input.LA(1)) {
      case DUPLET:
        enterOuterAlt(_localctx, 1);
        {
        setState(110);
        duplet();
        }
        break;
      case TRIPLET:
        enterOuterAlt(_localctx, 2);
        {
        setState(111);
        triplet();
        }
        break;
      case QUADRUPLET:
        enterOuterAlt(_localctx, 3);
        {
        setState(112);
        quadruplet();
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

  public static class NoteContext extends ParserRuleContext {
    public TerminalNode LETTER() { return getToken(AbcParser.LETTER, 0); }
    public AccidentalContext accidental() {
      return getRuleContext(AccidentalContext.class,0);
    }
    public OctaveContext octave() {
      return getRuleContext(OctaveContext.class,0);
    }
    public DurationContext duration() {
      return getRuleContext(DurationContext.class,0);
    }
    public NoteContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_note; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterNote(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitNote(this);
    }
  }

  public final NoteContext note() throws RecognitionException {
    NoteContext _localctx = new NoteContext(_ctx, getState());
    enterRule(_localctx, 14, RULE_note);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      {
      setState(116);
      _la = _input.LA(1);
      if (_la==ACCIDENTAL) {
        {
        setState(115);
        accidental();
        }
      }

      setState(118);
      match(LETTER);
      setState(120);
      _la = _input.LA(1);
      if (_la==OCTAVE) {
        {
        setState(119);
        octave();
        }
      }

      setState(123);
      _la = _input.LA(1);
      if (_la==DURATION) {
        {
        setState(122);
        duration();
        }
      }

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

  public static class RestContext extends ParserRuleContext {
    public DurationContext duration() {
      return getRuleContext(DurationContext.class,0);
    }
    public RestContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_rest; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterRest(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitRest(this);
    }
  }

  public final RestContext rest() throws RecognitionException {
    RestContext _localctx = new RestContext(_ctx, getState());
    enterRule(_localctx, 16, RULE_rest);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(125);
      match(T__1);
      setState(127);
      _la = _input.LA(1);
      if (_la==DURATION) {
        {
        setState(126);
        duration();
        }
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

  public static class DurationContext extends ParserRuleContext {
    public TerminalNode DURATION() { return getToken(AbcParser.DURATION, 0); }
    public DurationContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_duration; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterDuration(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitDuration(this);
    }
  }

  public final DurationContext duration() throws RecognitionException {
    DurationContext _localctx = new DurationContext(_ctx, getState());
    enterRule(_localctx, 18, RULE_duration);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(129);
      match(DURATION);
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

  public static class OctaveContext extends ParserRuleContext {
    public TerminalNode OCTAVE() { return getToken(AbcParser.OCTAVE, 0); }
    public OctaveContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_octave; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterOctave(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitOctave(this);
    }
  }

  public final OctaveContext octave() throws RecognitionException {
    OctaveContext _localctx = new OctaveContext(_ctx, getState());
    enterRule(_localctx, 20, RULE_octave);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(131);
      match(OCTAVE);
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

  public static class AccidentalContext extends ParserRuleContext {
    public TerminalNode ACCIDENTAL() { return getToken(AbcParser.ACCIDENTAL, 0); }
    public AccidentalContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_accidental; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterAccidental(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitAccidental(this);
    }
  }

  public final AccidentalContext accidental() throws RecognitionException {
    AccidentalContext _localctx = new AccidentalContext(_ctx, getState());
    enterRule(_localctx, 22, RULE_accidental);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(133);
      match(ACCIDENTAL);
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

  public static class ChordContext extends ParserRuleContext {
    public List<NoteContext> note() {
      return getRuleContexts(NoteContext.class);
    }
    public NoteContext note(int i) {
      return getRuleContext(NoteContext.class,i);
    }
    public ChordContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_chord; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterChord(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitChord(this);
    }
  }

  public final ChordContext chord() throws RecognitionException {
    ChordContext _localctx = new ChordContext(_ctx, getState());
    enterRule(_localctx, 24, RULE_chord);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(135);
      match(T__2);
      setState(137); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(136);
        note();
        }
        }
        setState(139); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==LETTER || _la==ACCIDENTAL );
      setState(141);
      match(T__3);
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

  public static class DupletContext extends ParserRuleContext {
    public TerminalNode DUPLET() { return getToken(AbcParser.DUPLET, 0); }
    public List<NoteContext> note() {
      return getRuleContexts(NoteContext.class);
    }
    public NoteContext note(int i) {
      return getRuleContext(NoteContext.class,i);
    }
    public List<ChordContext> chord() {
      return getRuleContexts(ChordContext.class);
    }
    public ChordContext chord(int i) {
      return getRuleContext(ChordContext.class,i);
    }
    public DupletContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_duplet; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterDuplet(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitDuplet(this);
    }
  }

  public final DupletContext duplet() throws RecognitionException {
    DupletContext _localctx = new DupletContext(_ctx, getState());
    enterRule(_localctx, 26, RULE_duplet);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(143);
      match(DUPLET);
      setState(146);
      switch (_input.LA(1)) {
      case LETTER:
      case ACCIDENTAL:
        {
        setState(144);
        note();
        }
        break;
      case T__2:
        {
        setState(145);
        chord();
        }
        break;
      default:
        throw new NoViableAltException(this);
      }
      setState(150);
      switch (_input.LA(1)) {
      case LETTER:
      case ACCIDENTAL:
        {
        setState(148);
        note();
        }
        break;
      case T__2:
        {
        setState(149);
        chord();
        }
        break;
      default:
        throw new NoViableAltException(this);
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

  public static class TripletContext extends ParserRuleContext {
    public TerminalNode TRIPLET() { return getToken(AbcParser.TRIPLET, 0); }
    public List<NoteContext> note() {
      return getRuleContexts(NoteContext.class);
    }
    public NoteContext note(int i) {
      return getRuleContext(NoteContext.class,i);
    }
    public List<ChordContext> chord() {
      return getRuleContexts(ChordContext.class);
    }
    public ChordContext chord(int i) {
      return getRuleContext(ChordContext.class,i);
    }
    public TripletContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_triplet; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterTriplet(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitTriplet(this);
    }
  }

  public final TripletContext triplet() throws RecognitionException {
    TripletContext _localctx = new TripletContext(_ctx, getState());
    enterRule(_localctx, 28, RULE_triplet);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(152);
      match(TRIPLET);
      setState(155);
      switch (_input.LA(1)) {
      case LETTER:
      case ACCIDENTAL:
        {
        setState(153);
        note();
        }
        break;
      case T__2:
        {
        setState(154);
        chord();
        }
        break;
      default:
        throw new NoViableAltException(this);
      }
      setState(159);
      switch (_input.LA(1)) {
      case LETTER:
      case ACCIDENTAL:
        {
        setState(157);
        note();
        }
        break;
      case T__2:
        {
        setState(158);
        chord();
        }
        break;
      default:
        throw new NoViableAltException(this);
      }
      setState(163);
      switch (_input.LA(1)) {
      case LETTER:
      case ACCIDENTAL:
        {
        setState(161);
        note();
        }
        break;
      case T__2:
        {
        setState(162);
        chord();
        }
        break;
      default:
        throw new NoViableAltException(this);
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

  public static class QuadrupletContext extends ParserRuleContext {
    public TerminalNode QUADRUPLET() { return getToken(AbcParser.QUADRUPLET, 0); }
    public List<NoteContext> note() {
      return getRuleContexts(NoteContext.class);
    }
    public NoteContext note(int i) {
      return getRuleContext(NoteContext.class,i);
    }
    public List<ChordContext> chord() {
      return getRuleContexts(ChordContext.class);
    }
    public ChordContext chord(int i) {
      return getRuleContext(ChordContext.class,i);
    }
    public QuadrupletContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_quadruplet; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterQuadruplet(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitQuadruplet(this);
    }
  }

  public final QuadrupletContext quadruplet() throws RecognitionException {
    QuadrupletContext _localctx = new QuadrupletContext(_ctx, getState());
    enterRule(_localctx, 30, RULE_quadruplet);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(165);
      match(QUADRUPLET);
      setState(168);
      switch (_input.LA(1)) {
      case LETTER:
      case ACCIDENTAL:
        {
        setState(166);
        note();
        }
        break;
      case T__2:
        {
        setState(167);
        chord();
        }
        break;
      default:
        throw new NoViableAltException(this);
      }
      setState(172);
      switch (_input.LA(1)) {
      case LETTER:
      case ACCIDENTAL:
        {
        setState(170);
        note();
        }
        break;
      case T__2:
        {
        setState(171);
        chord();
        }
        break;
      default:
        throw new NoViableAltException(this);
      }
      setState(176);
      switch (_input.LA(1)) {
      case LETTER:
      case ACCIDENTAL:
        {
        setState(174);
        note();
        }
        break;
      case T__2:
        {
        setState(175);
        chord();
        }
        break;
      default:
        throw new NoViableAltException(this);
      }
      setState(180);
      switch (_input.LA(1)) {
      case LETTER:
      case ACCIDENTAL:
        {
        setState(178);
        note();
        }
        break;
      case T__2:
        {
        setState(179);
        chord();
        }
        break;
      default:
        throw new NoViableAltException(this);
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\26\u00b9\4\2\t"+
      "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
      "\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
      "\3\2\3\2\3\2\3\3\6\3\'\n\3\r\3\16\3(\3\4\7\4,\n\4\f\4\16\4/\13\4\3"+
      "\4\6\4\62\n\4\r\4\16\4\63\3\4\5\4\67\n\4\3\4\3\4\3\5\7\5<\n\5\f\5"+
      "\16\5?\13\5\3\5\5\5B\n\5\3\5\7\5E\n\5\f\5\16\5H\13\5\3\5\3\5\7\5L"+
      "\n\5\f\5\16\5O\13\5\6\5Q\n\5\r\5\16\5R\3\5\7\5V\n\5\f\5\16\5Y\13\5"+
      "\3\5\3\5\7\5]\n\5\f\5\16\5`\13\5\3\6\3\6\3\6\6\6e\n\6\r\6\16\6f\3"+
      "\6\3\6\3\7\3\7\3\7\3\7\5\7o\n\7\3\b\3\b\3\b\5\bt\n\b\3\t\5\tw\n\t"+
      "\3\t\3\t\5\t{\n\t\3\t\5\t~\n\t\3\n\3\n\5\n\u0082\n\n\3\13\3\13\3\f"+
      "\3\f\3\r\3\r\3\16\3\16\6\16\u008c\n\16\r\16\16\16\u008d\3\16\3\16"+
      "\3\17\3\17\3\17\5\17\u0095\n\17\3\17\3\17\5\17\u0099\n\17\3\20\3\20"+
      "\3\20\5\20\u009e\n\20\3\20\3\20\5\20\u00a2\n\20\3\20\3\20\5\20\u00a6"+
      "\n\20\3\21\3\21\3\21\5\21\u00ab\n\21\3\21\3\21\5\21\u00af\n\21\3\21"+
      "\3\21\5\21\u00b3\n\21\3\21\3\21\5\21\u00b7\n\21\3\21\2\2\22\2\4\6"+
      "\b\n\f\16\20\22\24\26\30\32\34\36 \2\4\4\2\17\20\22\23\5\2\7\7\17"+
      "\17\21\21\u00c8\2\"\3\2\2\2\4&\3\2\2\2\6-\3\2\2\2\b=\3\2\2\2\na\3"+
      "\2\2\2\fn\3\2\2\2\16s\3\2\2\2\20v\3\2\2\2\22\177\3\2\2\2\24\u0083"+
      "\3\2\2\2\26\u0085\3\2\2\2\30\u0087\3\2\2\2\32\u0089\3\2\2\2\34\u0091"+
      "\3\2\2\2\36\u009a\3\2\2\2 \u00a7\3\2\2\2\"#\5\4\3\2#$\7\2\2\3$\3\3"+
      "\2\2\2%\'\5\6\4\2&%\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2\2\2)\5\3\2"+
      "\2\2*,\7\7\2\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\66\3\2\2\2"+
      "/-\3\2\2\2\60\62\5\b\5\2\61\60\3\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2"+
      "\63\64\3\2\2\2\64\67\3\2\2\2\65\67\5\n\6\2\66\61\3\2\2\2\66\65\3\2"+
      "\2\2\678\3\2\2\289\7\7\2\29\7\3\2\2\2:<\7\7\2\2;:\3\2\2\2<?\3\2\2"+
      "\2=;\3\2\2\2=>\3\2\2\2>A\3\2\2\2?=\3\2\2\2@B\t\2\2\2A@\3\2\2\2AB\3"+
      "\2\2\2BF\3\2\2\2CE\7\3\2\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2"+
      "GP\3\2\2\2HF\3\2\2\2IM\5\f\7\2JL\7\3\2\2KJ\3\2\2\2LO\3\2\2\2MK\3\2"+
      "\2\2MN\3\2\2\2NQ\3\2\2\2OM\3\2\2\2PI\3\2\2\2QR\3\2\2\2RP\3\2\2\2R"+
      "S\3\2\2\2SW\3\2\2\2TV\7\3\2\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2"+
      "\2\2XZ\3\2\2\2YW\3\2\2\2Z^\t\3\2\2[]\7\3\2\2\\[\3\2\2\2]`\3\2\2\2"+
      "^\\\3\2\2\2^_\3\2\2\2_\t\3\2\2\2`^\3\2\2\2ad\7\24\2\2be\13\2\2\2c"+
      "e\7\3\2\2db\3\2\2\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2gh\3\2"+
      "\2\2hi\7\7\2\2i\13\3\2\2\2jo\5\20\t\2ko\5\22\n\2lo\5\32\16\2mo\5\16"+
      "\b\2nj\3\2\2\2nk\3\2\2\2nl\3\2\2\2nm\3\2\2\2o\r\3\2\2\2pt\5\34\17"+
      "\2qt\5\36\20\2rt\5 \21\2sp\3\2\2\2sq\3\2\2\2sr\3\2\2\2t\17\3\2\2\2"+
      "uw\5\30\r\2vu\3\2\2\2vw\3\2\2\2wx\3\2\2\2xz\7\b\2\2y{\5\26\f\2zy\3"+
      "\2\2\2z{\3\2\2\2{}\3\2\2\2|~\5\24\13\2}|\3\2\2\2}~\3\2\2\2~\21\3\2"+
      "\2\2\177\u0081\7\4\2\2\u0080\u0082\5\24\13\2\u0081\u0080\3\2\2\2\u0081"+
      "\u0082\3\2\2\2\u0082\23\3\2\2\2\u0083\u0084\7\t\2\2\u0084\25\3\2\2"+
      "\2\u0085\u0086\7\n\2\2\u0086\27\3\2\2\2\u0087\u0088\7\13\2\2\u0088"+
      "\31\3\2\2\2\u0089\u008b\7\5\2\2\u008a\u008c\5\20\t\2\u008b\u008a\3"+
      "\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2"+
      "\u008e\u008f\3\2\2\2\u008f\u0090\7\6\2\2\u0090\33\3\2\2\2\u0091\u0094"+
      "\7\f\2\2\u0092\u0095\5\20\t\2\u0093\u0095\5\32\16\2\u0094\u0092\3"+
      "\2\2\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0099\5\20\t"+
      "\2\u0097\u0099\5\32\16\2\u0098\u0096\3\2\2\2\u0098\u0097\3\2\2\2\u0099"+
      "\35\3\2\2\2\u009a\u009d\7\r\2\2\u009b\u009e\5\20\t\2\u009c\u009e\5"+
      "\32\16\2\u009d\u009b\3\2\2\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2"+
      "\2\u009f\u00a2\5\20\t\2\u00a0\u00a2\5\32\16\2\u00a1\u009f\3\2\2\2"+
      "\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a6\5\20\t\2\u00a4"+
      "\u00a6\5\32\16\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\37"+
      "\3\2\2\2\u00a7\u00aa\7\16\2\2\u00a8\u00ab\5\20\t\2\u00a9\u00ab\5\32"+
      "\16\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2"+
      "\u00ac\u00af\5\20\t\2\u00ad\u00af\5\32\16\2\u00ae\u00ac\3\2\2\2\u00ae"+
      "\u00ad\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00b3\5\20\t\2\u00b1\u00b3"+
      "\5\32\16\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2"+
      "\2\2\u00b4\u00b7\5\20\t\2\u00b5\u00b7\5\32\16\2\u00b6\u00b4\3\2\2"+
      "\2\u00b6\u00b5\3\2\2\2\u00b7!\3\2\2\2\37(-\63\66=AFMRW^dfnsvz}\u0081"+
      "\u008d\u0094\u0098\u009d\u00a1\u00a5\u00aa\u00ae\u00b2\u00b6";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}