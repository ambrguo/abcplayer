// Generated from Xyz.g4 by ANTLR 4.5.1

package abc.parser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XyzParser}.
 */
public interface XyzListener extends ParseTreeListener {
  /**
   * Enter a parse tree produced by {@link XyzParser#root}.
   * @param ctx the parse tree
   */
  void enterRoot(XyzParser.RootContext ctx);
  /**
   * Exit a parse tree produced by {@link XyzParser#root}.
   * @param ctx the parse tree
   */
  void exitRoot(XyzParser.RootContext ctx);
  /**
   * Enter a parse tree produced by {@link XyzParser#header}.
   * @param ctx the parse tree
   */
  void enterHeader(XyzParser.HeaderContext ctx);
  /**
   * Exit a parse tree produced by {@link XyzParser#header}.
   * @param ctx the parse tree
   */
  void exitHeader(XyzParser.HeaderContext ctx);
  /**
   * Enter a parse tree produced by {@link XyzParser#field_number}.
   * @param ctx the parse tree
   */
  void enterField_number(XyzParser.Field_numberContext ctx);
  /**
   * Exit a parse tree produced by {@link XyzParser#field_number}.
   * @param ctx the parse tree
   */
  void exitField_number(XyzParser.Field_numberContext ctx);
  /**
   * Enter a parse tree produced by {@link XyzParser#field_title}.
   * @param ctx the parse tree
   */
  void enterField_title(XyzParser.Field_titleContext ctx);
  /**
   * Exit a parse tree produced by {@link XyzParser#field_title}.
   * @param ctx the parse tree
   */
  void exitField_title(XyzParser.Field_titleContext ctx);
  /**
   * Enter a parse tree produced by {@link XyzParser#field_other}.
   * @param ctx the parse tree
   */
  void enterField_other(XyzParser.Field_otherContext ctx);
  /**
   * Exit a parse tree produced by {@link XyzParser#field_other}.
   * @param ctx the parse tree
   */
  void exitField_other(XyzParser.Field_otherContext ctx);
  /**
   * Enter a parse tree produced by {@link XyzParser#field_composer}.
   * @param ctx the parse tree
   */
  void enterField_composer(XyzParser.Field_composerContext ctx);
  /**
   * Exit a parse tree produced by {@link XyzParser#field_composer}.
   * @param ctx the parse tree
   */
  void exitField_composer(XyzParser.Field_composerContext ctx);
  /**
   * Enter a parse tree produced by {@link XyzParser#field_length}.
   * @param ctx the parse tree
   */
  void enterField_length(XyzParser.Field_lengthContext ctx);
  /**
   * Exit a parse tree produced by {@link XyzParser#field_length}.
   * @param ctx the parse tree
   */
  void exitField_length(XyzParser.Field_lengthContext ctx);
  /**
   * Enter a parse tree produced by {@link XyzParser#field_meter}.
   * @param ctx the parse tree
   */
  void enterField_meter(XyzParser.Field_meterContext ctx);
  /**
   * Exit a parse tree produced by {@link XyzParser#field_meter}.
   * @param ctx the parse tree
   */
  void exitField_meter(XyzParser.Field_meterContext ctx);
  /**
   * Enter a parse tree produced by {@link XyzParser#field_tempo}.
   * @param ctx the parse tree
   */
  void enterField_tempo(XyzParser.Field_tempoContext ctx);
  /**
   * Exit a parse tree produced by {@link XyzParser#field_tempo}.
   * @param ctx the parse tree
   */
  void exitField_tempo(XyzParser.Field_tempoContext ctx);
  /**
   * Enter a parse tree produced by {@link XyzParser#field_key}.
   * @param ctx the parse tree
   */
  void enterField_key(XyzParser.Field_keyContext ctx);
  /**
   * Exit a parse tree produced by {@link XyzParser#field_key}.
   * @param ctx the parse tree
   */
  void exitField_key(XyzParser.Field_keyContext ctx);
}