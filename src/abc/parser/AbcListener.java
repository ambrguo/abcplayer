// Generated from Abc.g4 by ANTLR 4.5.1

package abc.parser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AbcParser}.
 */
public interface AbcListener extends ParseTreeListener {
  /**
   * Enter a parse tree produced by {@link AbcParser#root}.
   * @param ctx the parse tree
   */
  void enterRoot(AbcParser.RootContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#root}.
   * @param ctx the parse tree
   */
  void exitRoot(AbcParser.RootContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#body}.
   * @param ctx the parse tree
   */
  void enterBody(AbcParser.BodyContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#body}.
   * @param ctx the parse tree
   */
  void exitBody(AbcParser.BodyContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#line}.
   * @param ctx the parse tree
   */
  void enterLine(AbcParser.LineContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#line}.
   * @param ctx the parse tree
   */
  void exitLine(AbcParser.LineContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#measure}.
   * @param ctx the parse tree
   */
  void enterMeasure(AbcParser.MeasureContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#measure}.
   * @param ctx the parse tree
   */
  void exitMeasure(AbcParser.MeasureContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#voice}.
   * @param ctx the parse tree
   */
  void enterVoice(AbcParser.VoiceContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#voice}.
   * @param ctx the parse tree
   */
  void exitVoice(AbcParser.VoiceContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#element}.
   * @param ctx the parse tree
   */
  void enterElement(AbcParser.ElementContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#element}.
   * @param ctx the parse tree
   */
  void exitElement(AbcParser.ElementContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#tuplet}.
   * @param ctx the parse tree
   */
  void enterTuplet(AbcParser.TupletContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#tuplet}.
   * @param ctx the parse tree
   */
  void exitTuplet(AbcParser.TupletContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#note}.
   * @param ctx the parse tree
   */
  void enterNote(AbcParser.NoteContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#note}.
   * @param ctx the parse tree
   */
  void exitNote(AbcParser.NoteContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#rest}.
   * @param ctx the parse tree
   */
  void enterRest(AbcParser.RestContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#rest}.
   * @param ctx the parse tree
   */
  void exitRest(AbcParser.RestContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#duration}.
   * @param ctx the parse tree
   */
  void enterDuration(AbcParser.DurationContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#duration}.
   * @param ctx the parse tree
   */
  void exitDuration(AbcParser.DurationContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#octave}.
   * @param ctx the parse tree
   */
  void enterOctave(AbcParser.OctaveContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#octave}.
   * @param ctx the parse tree
   */
  void exitOctave(AbcParser.OctaveContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#accidental}.
   * @param ctx the parse tree
   */
  void enterAccidental(AbcParser.AccidentalContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#accidental}.
   * @param ctx the parse tree
   */
  void exitAccidental(AbcParser.AccidentalContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#chord}.
   * @param ctx the parse tree
   */
  void enterChord(AbcParser.ChordContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#chord}.
   * @param ctx the parse tree
   */
  void exitChord(AbcParser.ChordContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#duplet}.
   * @param ctx the parse tree
   */
  void enterDuplet(AbcParser.DupletContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#duplet}.
   * @param ctx the parse tree
   */
  void exitDuplet(AbcParser.DupletContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#triplet}.
   * @param ctx the parse tree
   */
  void enterTriplet(AbcParser.TripletContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#triplet}.
   * @param ctx the parse tree
   */
  void exitTriplet(AbcParser.TripletContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#quadruplet}.
   * @param ctx the parse tree
   */
  void enterQuadruplet(AbcParser.QuadrupletContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#quadruplet}.
   * @param ctx the parse tree
   */
  void exitQuadruplet(AbcParser.QuadrupletContext ctx);
}