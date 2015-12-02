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
    T__0=1, T__1=2, INDEX=3, TITLE=4, COMPOSER=5, LENGTH=6, METER=7, TEMPO=8, 
    KEY=9, NUMBER=10, NEWLINE=11, LETTER=12, NOTE=13, REST=14, OCTAVE=15, 
    ACCIDENTAL=16, DUPLET=17, TRIPLET=18, QUADRUPLET=19, BARLINE=20, BEGIN_REPEAT=21, 
    END_REPEAT=22, ONE_REPEAT=23, TWO_REPEAT=24, SPACES=25, END_NOTES=26;
  public static final int
    RULE_root = 0, RULE_header = 1, RULE_field_number = 2, RULE_field_title = 3, 
    RULE_field_other = 4, RULE_field_composer = 5, RULE_field_length = 6, 
    RULE_field_meter = 7, RULE_field_tempo = 8, RULE_field_key = 9, RULE_body = 10, 
    RULE_line = 11, RULE_measure = 12, RULE_element = 13, RULE_tuplet = 14, 
    RULE_note = 15, RULE_rest = 16, RULE_chord = 17, RULE_duplet = 18, RULE_triplet = 19, 
    RULE_quadruplet = 20;
  public static final String[] ruleNames = {
    "root", "header", "field_number", "field_title", "field_other", "field_composer", 
    "field_length", "field_meter", "field_tempo", "field_key", "body", "line", 
    "measure", "element", "tuplet", "note", "rest", "chord", "duplet", "triplet", 
    "quadruplet"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'['", "']'", null, null, null, null, null, null, null, null, 
    null, null, null, null, null, null, null, null, null, null, "'|:'", 
    "':|'", "'[1'", "'[2'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, "INDEX", "TITLE", "COMPOSER", "LENGTH", "METER", "TEMPO", 
    "KEY", "NUMBER", "NEWLINE", "LETTER", "NOTE", "REST", "OCTAVE", "ACCIDENTAL", 
    "DUPLET", "TRIPLET", "QUADRUPLET", "BARLINE", "BEGIN_REPEAT", "END_REPEAT", 
    "ONE_REPEAT", "TWO_REPEAT", "SPACES", "END_NOTES"
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
    public HeaderContext header() {
      return getRuleContext(HeaderContext.class,0);
    }
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
      setState(42);
      header();
      setState(43);
      body();
      setState(44);
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
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterHeader(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitHeader(this);
    }
  }

  public final HeaderContext header() throws RecognitionException {
    HeaderContext _localctx = new HeaderContext(_ctx, getState());
    enterRule(_localctx, 2, RULE_header);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(46);
      field_number();
      setState(47);
      field_title();
      setState(51);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMPOSER) | (1L << LENGTH) | (1L << METER) | (1L << TEMPO))) != 0)) {
        {
        {
        setState(48);
        field_other();
        }
        }
        setState(53);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(54);
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
    public TerminalNode INDEX() { return getToken(AbcParser.INDEX, 0); }
    public Field_numberContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_field_number; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterField_number(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitField_number(this);
    }
  }

  public final Field_numberContext field_number() throws RecognitionException {
    Field_numberContext _localctx = new Field_numberContext(_ctx, getState());
    enterRule(_localctx, 4, RULE_field_number);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(56);
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
    public TerminalNode TITLE() { return getToken(AbcParser.TITLE, 0); }
    public Field_titleContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_field_title; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterField_title(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitField_title(this);
    }
  }

  public final Field_titleContext field_title() throws RecognitionException {
    Field_titleContext _localctx = new Field_titleContext(_ctx, getState());
    enterRule(_localctx, 6, RULE_field_title);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(58);
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
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterField_other(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitField_other(this);
    }
  }

  public final Field_otherContext field_other() throws RecognitionException {
    Field_otherContext _localctx = new Field_otherContext(_ctx, getState());
    enterRule(_localctx, 8, RULE_field_other);
    try {
      setState(64);
      switch (_input.LA(1)) {
      case COMPOSER:
        enterOuterAlt(_localctx, 1);
        {
        setState(60);
        field_composer();
        }
        break;
      case LENGTH:
        enterOuterAlt(_localctx, 2);
        {
        setState(61);
        field_length();
        }
        break;
      case METER:
        enterOuterAlt(_localctx, 3);
        {
        setState(62);
        field_meter();
        }
        break;
      case TEMPO:
        enterOuterAlt(_localctx, 4);
        {
        setState(63);
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
    public TerminalNode COMPOSER() { return getToken(AbcParser.COMPOSER, 0); }
    public Field_composerContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_field_composer; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterField_composer(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitField_composer(this);
    }
  }

  public final Field_composerContext field_composer() throws RecognitionException {
    Field_composerContext _localctx = new Field_composerContext(_ctx, getState());
    enterRule(_localctx, 10, RULE_field_composer);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(66);
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
    public TerminalNode LENGTH() { return getToken(AbcParser.LENGTH, 0); }
    public Field_lengthContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_field_length; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterField_length(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitField_length(this);
    }
  }

  public final Field_lengthContext field_length() throws RecognitionException {
    Field_lengthContext _localctx = new Field_lengthContext(_ctx, getState());
    enterRule(_localctx, 12, RULE_field_length);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(68);
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
    public TerminalNode METER() { return getToken(AbcParser.METER, 0); }
    public Field_meterContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_field_meter; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterField_meter(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitField_meter(this);
    }
  }

  public final Field_meterContext field_meter() throws RecognitionException {
    Field_meterContext _localctx = new Field_meterContext(_ctx, getState());
    enterRule(_localctx, 14, RULE_field_meter);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(70);
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
    public TerminalNode TEMPO() { return getToken(AbcParser.TEMPO, 0); }
    public Field_tempoContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_field_tempo; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterField_tempo(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitField_tempo(this);
    }
  }

  public final Field_tempoContext field_tempo() throws RecognitionException {
    Field_tempoContext _localctx = new Field_tempoContext(_ctx, getState());
    enterRule(_localctx, 16, RULE_field_tempo);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(72);
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
    public TerminalNode KEY() { return getToken(AbcParser.KEY, 0); }
    public Field_keyContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_field_key; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterField_key(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitField_key(this);
    }
  }

  public final Field_keyContext field_key() throws RecognitionException {
    Field_keyContext _localctx = new Field_keyContext(_ctx, getState());
    enterRule(_localctx, 18, RULE_field_key);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(74);
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
    enterRule(_localctx, 20, RULE_body);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(77); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(76);
        line();
        }
        }
        setState(79); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NEWLINE) | (1L << NOTE) | (1L << REST) | (1L << DUPLET) | (1L << TRIPLET) | (1L << QUADRUPLET) | (1L << BARLINE) | (1L << BEGIN_REPEAT) | (1L << ONE_REPEAT) | (1L << TWO_REPEAT))) != 0) );
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
    enterRule(_localctx, 22, RULE_line);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(84);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==NEWLINE) {
        {
        {
        setState(81);
        match(NEWLINE);
        }
        }
        setState(86);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(88); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(87);
          measure();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(90); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,4,_ctx);
      } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
      setState(95);
      _errHandler.sync(this);
      _alt = getInterpreter().adaptivePredict(_input,5,_ctx);
      while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
        if ( _alt==1 ) {
          {
          {
          setState(92);
          match(NEWLINE);
          }
          } 
        }
        setState(97);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
    public TerminalNode END_NOTES() { return getToken(AbcParser.END_NOTES, 0); }
    public TerminalNode NEWLINE() { return getToken(AbcParser.NEWLINE, 0); }
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
    enterRule(_localctx, 24, RULE_measure);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(99);
      _la = _input.LA(1);
      if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BARLINE) | (1L << BEGIN_REPEAT) | (1L << ONE_REPEAT) | (1L << TWO_REPEAT))) != 0)) {
        {
        setState(98);
        _la = _input.LA(1);
        if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BARLINE) | (1L << BEGIN_REPEAT) | (1L << ONE_REPEAT) | (1L << TWO_REPEAT))) != 0)) ) {
        _errHandler.recoverInline(this);
        } else {
          consume();
        }
        }
      }

      setState(102); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(101);
          element();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(104); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,7,_ctx);
      } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
      setState(107);
      switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
      case 1:
        {
        setState(106);
        _la = _input.LA(1);
        if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEWLINE) | (1L << BARLINE) | (1L << END_REPEAT) | (1L << END_NOTES))) != 0)) ) {
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
    enterRule(_localctx, 26, RULE_element);
    try {
      setState(113);
      switch (_input.LA(1)) {
      case NOTE:
        enterOuterAlt(_localctx, 1);
        {
        setState(109);
        note();
        }
        break;
      case REST:
        enterOuterAlt(_localctx, 2);
        {
        setState(110);
        rest();
        }
        break;
      case T__0:
        enterOuterAlt(_localctx, 3);
        {
        setState(111);
        chord();
        }
        break;
      case DUPLET:
      case TRIPLET:
      case QUADRUPLET:
        enterOuterAlt(_localctx, 4);
        {
        setState(112);
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
    enterRule(_localctx, 28, RULE_tuplet);
    try {
      setState(118);
      switch (_input.LA(1)) {
      case DUPLET:
        enterOuterAlt(_localctx, 1);
        {
        setState(115);
        duplet();
        }
        break;
      case TRIPLET:
        enterOuterAlt(_localctx, 2);
        {
        setState(116);
        triplet();
        }
        break;
      case QUADRUPLET:
        enterOuterAlt(_localctx, 3);
        {
        setState(117);
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
    public TerminalNode NOTE() { return getToken(AbcParser.NOTE, 0); }
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
    enterRule(_localctx, 30, RULE_note);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(120);
      match(NOTE);
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
    enterRule(_localctx, 32, RULE_rest);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(122);
      match(REST);
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
    enterRule(_localctx, 34, RULE_chord);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(124);
      match(T__0);
      setState(126); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(125);
        note();
        }
        }
        setState(128); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==NOTE );
      setState(130);
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
    enterRule(_localctx, 36, RULE_duplet);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(132);
      match(DUPLET);
      setState(135);
      switch (_input.LA(1)) {
      case NOTE:
        {
        setState(133);
        note();
        }
        break;
      case T__0:
        {
        setState(134);
        chord();
        }
        break;
      default:
        throw new NoViableAltException(this);
      }
      setState(139);
      switch (_input.LA(1)) {
      case NOTE:
        {
        setState(137);
        note();
        }
        break;
      case T__0:
        {
        setState(138);
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
    enterRule(_localctx, 38, RULE_triplet);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(141);
      match(TRIPLET);
      setState(144);
      switch (_input.LA(1)) {
      case NOTE:
        {
        setState(142);
        note();
        }
        break;
      case T__0:
        {
        setState(143);
        chord();
        }
        break;
      default:
        throw new NoViableAltException(this);
      }
      setState(148);
      switch (_input.LA(1)) {
      case NOTE:
        {
        setState(146);
        note();
        }
        break;
      case T__0:
        {
        setState(147);
        chord();
        }
        break;
      default:
        throw new NoViableAltException(this);
      }
      setState(152);
      switch (_input.LA(1)) {
      case NOTE:
        {
        setState(150);
        note();
        }
        break;
      case T__0:
        {
        setState(151);
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
    enterRule(_localctx, 40, RULE_quadruplet);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(154);
      match(QUADRUPLET);
      setState(157);
      switch (_input.LA(1)) {
      case NOTE:
        {
        setState(155);
        note();
        }
        break;
      case T__0:
        {
        setState(156);
        chord();
        }
        break;
      default:
        throw new NoViableAltException(this);
      }
      setState(161);
      switch (_input.LA(1)) {
      case NOTE:
        {
        setState(159);
        note();
        }
        break;
      case T__0:
        {
        setState(160);
        chord();
        }
        break;
      default:
        throw new NoViableAltException(this);
      }
      setState(165);
      switch (_input.LA(1)) {
      case NOTE:
        {
        setState(163);
        note();
        }
        break;
      case T__0:
        {
        setState(164);
        chord();
        }
        break;
      default:
        throw new NoViableAltException(this);
      }
      setState(169);
      switch (_input.LA(1)) {
      case NOTE:
        {
        setState(167);
        note();
        }
        break;
      case T__0:
        {
        setState(168);
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\34\u00ae\4\2\t"+
      "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
      "\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
      "\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2"+
      "\3\3\3\3\3\3\7\3\64\n\3\f\3\16\3\67\13\3\3\3\3\3\3\4\3\4\3\5\3\5\3"+
      "\6\3\6\3\6\3\6\5\6C\n\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13"+
      "\3\f\6\fP\n\f\r\f\16\fQ\3\r\7\rU\n\r\f\r\16\rX\13\r\3\r\6\r[\n\r\r"+
      "\r\16\r\\\3\r\7\r`\n\r\f\r\16\rc\13\r\3\16\5\16f\n\16\3\16\6\16i\n"+
      "\16\r\16\16\16j\3\16\5\16n\n\16\3\17\3\17\3\17\3\17\5\17t\n\17\3\20"+
      "\3\20\3\20\5\20y\n\20\3\21\3\21\3\22\3\22\3\23\3\23\6\23\u0081\n\23"+
      "\r\23\16\23\u0082\3\23\3\23\3\24\3\24\3\24\5\24\u008a\n\24\3\24\3"+
      "\24\5\24\u008e\n\24\3\25\3\25\3\25\5\25\u0093\n\25\3\25\3\25\5\25"+
      "\u0097\n\25\3\25\3\25\5\25\u009b\n\25\3\26\3\26\3\26\5\26\u00a0\n"+
      "\26\3\26\3\26\5\26\u00a4\n\26\3\26\3\26\5\26\u00a8\n\26\3\26\3\26"+
      "\5\26\u00ac\n\26\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
      " \"$&(*\2\4\4\2\26\27\31\32\6\2\r\r\26\26\30\30\34\34\u00b2\2,\3\2"+
      "\2\2\4\60\3\2\2\2\6:\3\2\2\2\b<\3\2\2\2\nB\3\2\2\2\fD\3\2\2\2\16F"+
      "\3\2\2\2\20H\3\2\2\2\22J\3\2\2\2\24L\3\2\2\2\26O\3\2\2\2\30V\3\2\2"+
      "\2\32e\3\2\2\2\34s\3\2\2\2\36x\3\2\2\2 z\3\2\2\2\"|\3\2\2\2$~\3\2"+
      "\2\2&\u0086\3\2\2\2(\u008f\3\2\2\2*\u009c\3\2\2\2,-\5\4\3\2-.\5\26"+
      "\f\2./\7\2\2\3/\3\3\2\2\2\60\61\5\6\4\2\61\65\5\b\5\2\62\64\5\n\6"+
      "\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\668\3\2"+
      "\2\2\67\65\3\2\2\289\5\24\13\29\5\3\2\2\2:;\7\5\2\2;\7\3\2\2\2<=\7"+
      "\6\2\2=\t\3\2\2\2>C\5\f\7\2?C\5\16\b\2@C\5\20\t\2AC\5\22\n\2B>\3\2"+
      "\2\2B?\3\2\2\2B@\3\2\2\2BA\3\2\2\2C\13\3\2\2\2DE\7\7\2\2E\r\3\2\2"+
      "\2FG\7\b\2\2G\17\3\2\2\2HI\7\t\2\2I\21\3\2\2\2JK\7\n\2\2K\23\3\2\2"+
      "\2LM\7\13\2\2M\25\3\2\2\2NP\5\30\r\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2"+
      "QR\3\2\2\2R\27\3\2\2\2SU\7\r\2\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3"+
      "\2\2\2WZ\3\2\2\2XV\3\2\2\2Y[\5\32\16\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2"+
      "\2\2\\]\3\2\2\2]a\3\2\2\2^`\7\r\2\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2"+
      "ab\3\2\2\2b\31\3\2\2\2ca\3\2\2\2df\t\2\2\2ed\3\2\2\2ef\3\2\2\2fh\3"+
      "\2\2\2gi\5\34\17\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2"+
      "\2ln\t\3\2\2ml\3\2\2\2mn\3\2\2\2n\33\3\2\2\2ot\5 \21\2pt\5\"\22\2"+
      "qt\5$\23\2rt\5\36\20\2so\3\2\2\2sp\3\2\2\2sq\3\2\2\2sr\3\2\2\2t\35"+
      "\3\2\2\2uy\5&\24\2vy\5(\25\2wy\5*\26\2xu\3\2\2\2xv\3\2\2\2xw\3\2\2"+
      "\2y\37\3\2\2\2z{\7\17\2\2{!\3\2\2\2|}\7\20\2\2}#\3\2\2\2~\u0080\7"+
      "\3\2\2\177\u0081\5 \21\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
      "\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085"+
      "\7\4\2\2\u0085%\3\2\2\2\u0086\u0089\7\23\2\2\u0087\u008a\5 \21\2\u0088"+
      "\u008a\5$\23\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a\u008d"+
      "\3\2\2\2\u008b\u008e\5 \21\2\u008c\u008e\5$\23\2\u008d\u008b\3\2\2"+
      "\2\u008d\u008c\3\2\2\2\u008e\'\3\2\2\2\u008f\u0092\7\24\2\2\u0090"+
      "\u0093\5 \21\2\u0091\u0093\5$\23\2\u0092\u0090\3\2\2\2\u0092\u0091"+
      "\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0097\5 \21\2\u0095\u0097\5$\23"+
      "\2\u0096\u0094\3\2\2\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098"+
      "\u009b\5 \21\2\u0099\u009b\5$\23\2\u009a\u0098\3\2\2\2\u009a\u0099"+
      "\3\2\2\2\u009b)\3\2\2\2\u009c\u009f\7\25\2\2\u009d\u00a0\5 \21\2\u009e"+
      "\u00a0\5$\23\2\u009f\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\u00a3"+
      "\3\2\2\2\u00a1\u00a4\5 \21\2\u00a2\u00a4\5$\23\2\u00a3\u00a1\3\2\2"+
      "\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a8\5 \21\2\u00a6"+
      "\u00a8\5$\23\2\u00a7\u00a5\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab"+
      "\3\2\2\2\u00a9\u00ac\5 \21\2\u00aa\u00ac\5$\23\2\u00ab\u00a9\3\2\2"+
      "\2\u00ab\u00aa\3\2\2\2\u00ac+\3\2\2\2\27\65BQV\\aejmsx\u0082\u0089"+
      "\u008d\u0092\u0096\u009a\u009f\u00a3\u00a7\u00ab";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}