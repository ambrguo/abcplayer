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
    T__0=1, T__1=2, NEWLINE=3, LETTER=4, OTHER_LETTERS=5, REST=6, ZERO=7, 
    DURATION=8, OCTAVE=9, ACCIDENTAL=10, DUPLET=11, TRIPLET=12, QUADRUPLET=13, 
    BARLINE=14, BEGIN_REPEAT=15, END_REPEAT=16, ONE_REPEAT=17, TWO_REPEAT=18, 
    VOICE_PREFIX=19, SPACES=20, PERCENT=21, LETTERS=22;
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
    null, "'['", "']'", null, null, null, "'z'", "'0'", null, null, null, 
    null, null, null, null, "'|:'", "':|'", "'[1'", "'[2'", "'V:'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, "NEWLINE", "LETTER", "OTHER_LETTERS", "REST", "ZERO", 
    "DURATION", "OCTAVE", "ACCIDENTAL", "DUPLET", "TRIPLET", "QUADRUPLET", 
    "BARLINE", "BEGIN_REPEAT", "END_REPEAT", "ONE_REPEAT", "TWO_REPEAT", 
    "VOICE_PREFIX", "SPACES", "PERCENT", "LETTERS"
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
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NEWLINE) | (1L << LETTER) | (1L << REST) | (1L << ACCIDENTAL) | (1L << DUPLET) | (1L << TRIPLET) | (1L << QUADRUPLET) | (1L << BARLINE) | (1L << BEGIN_REPEAT) | (1L << ONE_REPEAT) | (1L << TWO_REPEAT) | (1L << VOICE_PREFIX))) != 0) );
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
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(43);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==NEWLINE) {
        {
        {
        setState(40);
        match(NEWLINE);
        }
        }
        setState(45);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(52);
      switch (_input.LA(1)) {
      case T__0:
      case LETTER:
      case REST:
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
        _la = _input.LA(1);
        do {
          {
          {
          setState(46);
          measure();
          }
          }
          setState(49); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << LETTER) | (1L << REST) | (1L << ACCIDENTAL) | (1L << DUPLET) | (1L << TRIPLET) | (1L << QUADRUPLET) | (1L << BARLINE) | (1L << BEGIN_REPEAT) | (1L << ONE_REPEAT) | (1L << TWO_REPEAT))) != 0) );
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
    public List<ElementContext> element() {
      return getRuleContexts(ElementContext.class);
    }
    public ElementContext element(int i) {
      return getRuleContext(ElementContext.class,i);
    }
    public TerminalNode BEGIN_REPEAT() { return getToken(AbcParser.BEGIN_REPEAT, 0); }
    public TerminalNode ONE_REPEAT() { return getToken(AbcParser.ONE_REPEAT, 0); }
    public TerminalNode TWO_REPEAT() { return getToken(AbcParser.TWO_REPEAT, 0); }
    public List<TerminalNode> BARLINE() { return getTokens(AbcParser.BARLINE); }
    public TerminalNode BARLINE(int i) {
      return getToken(AbcParser.BARLINE, i);
    }
    public TerminalNode END_REPEAT() { return getToken(AbcParser.END_REPEAT, 0); }
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
      setState(57);
      _la = _input.LA(1);
      if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BARLINE) | (1L << BEGIN_REPEAT) | (1L << ONE_REPEAT) | (1L << TWO_REPEAT))) != 0)) {
        {
        setState(56);
        _la = _input.LA(1);
        if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BARLINE) | (1L << BEGIN_REPEAT) | (1L << ONE_REPEAT) | (1L << TWO_REPEAT))) != 0)) ) {
        _errHandler.recoverInline(this);
        } else {
          consume();
        }
        }
      }

      setState(60); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(59);
          element();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(62); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,5,_ctx);
      } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
      setState(65);
      switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
      case 1:
        {
        setState(64);
        _la = _input.LA(1);
        if ( !(_la==BARLINE || _la==END_REPEAT) ) {
        _errHandler.recoverInline(this);
        } else {
          consume();
        }
        }
        break;
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
    public List<TerminalNode> LETTERS() { return getTokens(AbcParser.LETTERS); }
    public TerminalNode LETTERS(int i) {
      return getToken(AbcParser.LETTERS, i);
    }
    public List<TerminalNode> OTHER_LETTERS() { return getTokens(AbcParser.OTHER_LETTERS); }
    public TerminalNode OTHER_LETTERS(int i) {
      return getToken(AbcParser.OTHER_LETTERS, i);
    }
    public List<TerminalNode> DURATION() { return getTokens(AbcParser.DURATION); }
    public TerminalNode DURATION(int i) {
      return getToken(AbcParser.DURATION, i);
    }
    public List<TerminalNode> OCTAVE() { return getTokens(AbcParser.OCTAVE); }
    public TerminalNode OCTAVE(int i) {
      return getToken(AbcParser.OCTAVE, i);
    }
    public List<TerminalNode> ACCIDENTAL() { return getTokens(AbcParser.ACCIDENTAL); }
    public TerminalNode ACCIDENTAL(int i) {
      return getToken(AbcParser.ACCIDENTAL, i);
    }
    public List<TerminalNode> ZERO() { return getTokens(AbcParser.ZERO); }
    public TerminalNode ZERO(int i) {
      return getToken(AbcParser.ZERO, i);
    }
    public List<TerminalNode> BARLINE() { return getTokens(AbcParser.BARLINE); }
    public TerminalNode BARLINE(int i) {
      return getToken(AbcParser.BARLINE, i);
    }
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
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(67);
      match(VOICE_PREFIX);
      setState(69); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(68);
        _la = _input.LA(1);
        if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OTHER_LETTERS) | (1L << ZERO) | (1L << DURATION) | (1L << OCTAVE) | (1L << ACCIDENTAL) | (1L << BARLINE) | (1L << LETTERS))) != 0)) ) {
        _errHandler.recoverInline(this);
        } else {
          consume();
        }
        }
        }
        setState(71); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OTHER_LETTERS) | (1L << ZERO) | (1L << DURATION) | (1L << OCTAVE) | (1L << ACCIDENTAL) | (1L << BARLINE) | (1L << LETTERS))) != 0) );
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
      setState(77);
      switch (_input.LA(1)) {
      case LETTER:
      case ACCIDENTAL:
        enterOuterAlt(_localctx, 1);
        {
        setState(73);
        note();
        }
        break;
      case REST:
        enterOuterAlt(_localctx, 2);
        {
        setState(74);
        rest();
        }
        break;
      case T__0:
        enterOuterAlt(_localctx, 3);
        {
        setState(75);
        chord();
        }
        break;
      case DUPLET:
      case TRIPLET:
      case QUADRUPLET:
        enterOuterAlt(_localctx, 4);
        {
        setState(76);
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
      setState(82);
      switch (_input.LA(1)) {
      case DUPLET:
        enterOuterAlt(_localctx, 1);
        {
        setState(79);
        duplet();
        }
        break;
      case TRIPLET:
        enterOuterAlt(_localctx, 2);
        {
        setState(80);
        triplet();
        }
        break;
      case QUADRUPLET:
        enterOuterAlt(_localctx, 3);
        {
        setState(81);
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
      setState(85);
      _la = _input.LA(1);
      if (_la==ACCIDENTAL) {
        {
        setState(84);
        accidental();
        }
      }

      setState(87);
      match(LETTER);
      setState(89);
      _la = _input.LA(1);
      if (_la==OCTAVE) {
        {
        setState(88);
        octave();
        }
      }

      setState(92);
      _la = _input.LA(1);
      if (_la==DURATION) {
        {
        setState(91);
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
    public TerminalNode REST() { return getToken(AbcParser.REST, 0); }
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
      setState(94);
      match(REST);
      setState(96);
      _la = _input.LA(1);
      if (_la==DURATION) {
        {
        setState(95);
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
      setState(98);
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
      setState(100);
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
      setState(102);
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
      setState(104);
      match(T__0);
      setState(106); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(105);
        note();
        }
        }
        setState(108); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==LETTER || _la==ACCIDENTAL );
      setState(110);
      match(T__1);
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
      setState(112);
      match(DUPLET);
      setState(115);
      switch (_input.LA(1)) {
      case LETTER:
      case ACCIDENTAL:
        {
        setState(113);
        note();
        }
        break;
      case T__0:
        {
        setState(114);
        chord();
        }
        break;
      default:
        throw new NoViableAltException(this);
      }
      setState(119);
      switch (_input.LA(1)) {
      case LETTER:
      case ACCIDENTAL:
        {
        setState(117);
        note();
        }
        break;
      case T__0:
        {
        setState(118);
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
      setState(121);
      match(TRIPLET);
      setState(124);
      switch (_input.LA(1)) {
      case LETTER:
      case ACCIDENTAL:
        {
        setState(122);
        note();
        }
        break;
      case T__0:
        {
        setState(123);
        chord();
        }
        break;
      default:
        throw new NoViableAltException(this);
      }
      setState(128);
      switch (_input.LA(1)) {
      case LETTER:
      case ACCIDENTAL:
        {
        setState(126);
        note();
        }
        break;
      case T__0:
        {
        setState(127);
        chord();
        }
        break;
      default:
        throw new NoViableAltException(this);
      }
      setState(132);
      switch (_input.LA(1)) {
      case LETTER:
      case ACCIDENTAL:
        {
        setState(130);
        note();
        }
        break;
      case T__0:
        {
        setState(131);
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
      setState(134);
      match(QUADRUPLET);
      setState(137);
      switch (_input.LA(1)) {
      case LETTER:
      case ACCIDENTAL:
        {
        setState(135);
        note();
        }
        break;
      case T__0:
        {
        setState(136);
        chord();
        }
        break;
      default:
        throw new NoViableAltException(this);
      }
      setState(141);
      switch (_input.LA(1)) {
      case LETTER:
      case ACCIDENTAL:
        {
        setState(139);
        note();
        }
        break;
      case T__0:
        {
        setState(140);
        chord();
        }
        break;
      default:
        throw new NoViableAltException(this);
      }
      setState(145);
      switch (_input.LA(1)) {
      case LETTER:
      case ACCIDENTAL:
        {
        setState(143);
        note();
        }
        break;
      case T__0:
        {
        setState(144);
        chord();
        }
        break;
      default:
        throw new NoViableAltException(this);
      }
      setState(149);
      switch (_input.LA(1)) {
      case LETTER:
      case ACCIDENTAL:
        {
        setState(147);
        note();
        }
        break;
      case T__0:
        {
        setState(148);
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\30\u009a\4\2\t"+
      "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
      "\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
      "\3\2\3\2\3\2\3\3\6\3\'\n\3\r\3\16\3(\3\4\7\4,\n\4\f\4\16\4/\13\4\3"+
      "\4\6\4\62\n\4\r\4\16\4\63\3\4\5\4\67\n\4\3\4\3\4\3\5\5\5<\n\5\3\5"+
      "\6\5?\n\5\r\5\16\5@\3\5\5\5D\n\5\3\6\3\6\6\6H\n\6\r\6\16\6I\3\7\3"+
      "\7\3\7\3\7\5\7P\n\7\3\b\3\b\3\b\5\bU\n\b\3\t\5\tX\n\t\3\t\3\t\5\t"+
      "\\\n\t\3\t\5\t_\n\t\3\n\3\n\5\nc\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
      "\3\16\6\16m\n\16\r\16\16\16n\3\16\3\16\3\17\3\17\3\17\5\17v\n\17\3"+
      "\17\3\17\5\17z\n\17\3\20\3\20\3\20\5\20\177\n\20\3\20\3\20\5\20\u0083"+
      "\n\20\3\20\3\20\5\20\u0087\n\20\3\21\3\21\3\21\5\21\u008c\n\21\3\21"+
      "\3\21\5\21\u0090\n\21\3\21\3\21\5\21\u0094\n\21\3\21\3\21\5\21\u0098"+
      "\n\21\3\21\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\5\4\2"+
      "\20\21\23\24\4\2\20\20\22\22\6\2\7\7\t\f\20\20\30\30\u00a4\2\"\3\2"+
      "\2\2\4&\3\2\2\2\6-\3\2\2\2\b;\3\2\2\2\nE\3\2\2\2\fO\3\2\2\2\16T\3"+
      "\2\2\2\20W\3\2\2\2\22`\3\2\2\2\24d\3\2\2\2\26f\3\2\2\2\30h\3\2\2\2"+
      "\32j\3\2\2\2\34r\3\2\2\2\36{\3\2\2\2 \u0088\3\2\2\2\"#\5\4\3\2#$\7"+
      "\2\2\3$\3\3\2\2\2%\'\5\6\4\2&%\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2"+
      "\2\2)\5\3\2\2\2*,\7\5\2\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2"+
      ".\66\3\2\2\2/-\3\2\2\2\60\62\5\b\5\2\61\60\3\2\2\2\62\63\3\2\2\2\63"+
      "\61\3\2\2\2\63\64\3\2\2\2\64\67\3\2\2\2\65\67\5\n\6\2\66\61\3\2\2"+
      "\2\66\65\3\2\2\2\678\3\2\2\289\7\5\2\29\7\3\2\2\2:<\t\2\2\2;:\3\2"+
      "\2\2;<\3\2\2\2<>\3\2\2\2=?\5\f\7\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@"+
      "A\3\2\2\2AC\3\2\2\2BD\t\3\2\2CB\3\2\2\2CD\3\2\2\2D\t\3\2\2\2EG\7\25"+
      "\2\2FH\t\4\2\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\13\3\2\2\2"+
      "KP\5\20\t\2LP\5\22\n\2MP\5\32\16\2NP\5\16\b\2OK\3\2\2\2OL\3\2\2\2"+
      "OM\3\2\2\2ON\3\2\2\2P\r\3\2\2\2QU\5\34\17\2RU\5\36\20\2SU\5 \21\2"+
      "TQ\3\2\2\2TR\3\2\2\2TS\3\2\2\2U\17\3\2\2\2VX\5\30\r\2WV\3\2\2\2WX"+
      "\3\2\2\2XY\3\2\2\2Y[\7\6\2\2Z\\\5\26\f\2[Z\3\2\2\2[\\\3\2\2\2\\^\3"+
      "\2\2\2]_\5\24\13\2^]\3\2\2\2^_\3\2\2\2_\21\3\2\2\2`b\7\b\2\2ac\5\24"+
      "\13\2ba\3\2\2\2bc\3\2\2\2c\23\3\2\2\2de\7\n\2\2e\25\3\2\2\2fg\7\13"+
      "\2\2g\27\3\2\2\2hi\7\f\2\2i\31\3\2\2\2jl\7\3\2\2km\5\20\t\2lk\3\2"+
      "\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2op\3\2\2\2pq\7\4\2\2q\33\3\2\2\2"+
      "ru\7\r\2\2sv\5\20\t\2tv\5\32\16\2us\3\2\2\2ut\3\2\2\2vy\3\2\2\2wz"+
      "\5\20\t\2xz\5\32\16\2yw\3\2\2\2yx\3\2\2\2z\35\3\2\2\2{~\7\16\2\2|"+
      "\177\5\20\t\2}\177\5\32\16\2~|\3\2\2\2~}\3\2\2\2\177\u0082\3\2\2\2"+
      "\u0080\u0083\5\20\t\2\u0081\u0083\5\32\16\2\u0082\u0080\3\2\2\2\u0082"+
      "\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0087\5\20\t\2\u0085\u0087"+
      "\5\32\16\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\37\3\2\2"+
      "\2\u0088\u008b\7\17\2\2\u0089\u008c\5\20\t\2\u008a\u008c\5\32\16\2"+
      "\u008b\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d"+
      "\u0090\5\20\t\2\u008e\u0090\5\32\16\2\u008f\u008d\3\2\2\2\u008f\u008e"+
      "\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u0094\5\20\t\2\u0092\u0094\5\32"+
      "\16\2\u0093\u0091\3\2\2\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2"+
      "\u0095\u0098\5\20\t\2\u0096\u0098\5\32\16\2\u0097\u0095\3\2\2\2\u0097"+
      "\u0096\3\2\2\2\u0098!\3\2\2\2\32(-\63\66;@CIOTW[^bnuy~\u0082\u0086"+
      "\u008b\u008f\u0093\u0097";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}