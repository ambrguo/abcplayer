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
   * Enter a parse tree produced by {@link AbcParser#header}.
   * @param ctx the parse tree
   */
  void enterHeader(AbcParser.HeaderContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#header}.
   * @param ctx the parse tree
   */
  void exitHeader(AbcParser.HeaderContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#field_number}.
   * @param ctx the parse tree
   */
  void enterField_number(AbcParser.Field_numberContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#field_number}.
   * @param ctx the parse tree
   */
  void exitField_number(AbcParser.Field_numberContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#field_title}.
   * @param ctx the parse tree
   */
  void enterField_title(AbcParser.Field_titleContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#field_title}.
   * @param ctx the parse tree
   */
  void exitField_title(AbcParser.Field_titleContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#field_other}.
   * @param ctx the parse tree
   */
  void enterField_other(AbcParser.Field_otherContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#field_other}.
   * @param ctx the parse tree
   */
  void exitField_other(AbcParser.Field_otherContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#field_composer}.
   * @param ctx the parse tree
   */
  void enterField_composer(AbcParser.Field_composerContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#field_composer}.
   * @param ctx the parse tree
   */
  void exitField_composer(AbcParser.Field_composerContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#field_length}.
   * @param ctx the parse tree
   */
  void enterField_length(AbcParser.Field_lengthContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#field_length}.
   * @param ctx the parse tree
   */
  void exitField_length(AbcParser.Field_lengthContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#field_meter}.
   * @param ctx the parse tree
   */
  void enterField_meter(AbcParser.Field_meterContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#field_meter}.
   * @param ctx the parse tree
   */
  void exitField_meter(AbcParser.Field_meterContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#field_tempo}.
   * @param ctx the parse tree
   */
  void enterField_tempo(AbcParser.Field_tempoContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#field_tempo}.
   * @param ctx the parse tree
   */
  void exitField_tempo(AbcParser.Field_tempoContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#field_key}.
   * @param ctx the parse tree
   */
  void enterField_key(AbcParser.Field_keyContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#field_key}.
   * @param ctx the parse tree
   */
  void exitField_key(AbcParser.Field_keyContext ctx);
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