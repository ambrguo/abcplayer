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
   * Enter a parse tree produced by {@link XyzParser#index}.
   * @param ctx the parse tree
   */
  void enterIndex(XyzParser.IndexContext ctx);
  /**
   * Exit a parse tree produced by {@link XyzParser#index}.
   * @param ctx the parse tree
   */
  void exitIndex(XyzParser.IndexContext ctx);
  /**
   * Enter a parse tree produced by {@link XyzParser#title}.
   * @param ctx the parse tree
   */
  void enterTitle(XyzParser.TitleContext ctx);
  /**
   * Exit a parse tree produced by {@link XyzParser#title}.
   * @param ctx the parse tree
   */
  void exitTitle(XyzParser.TitleContext ctx);
  /**
   * Enter a parse tree produced by {@link XyzParser#composer}.
   * @param ctx the parse tree
   */
  void enterComposer(XyzParser.ComposerContext ctx);
  /**
   * Exit a parse tree produced by {@link XyzParser#composer}.
   * @param ctx the parse tree
   */
  void exitComposer(XyzParser.ComposerContext ctx);
  /**
   * Enter a parse tree produced by {@link XyzParser#length}.
   * @param ctx the parse tree
   */
  void enterLength(XyzParser.LengthContext ctx);
  /**
   * Exit a parse tree produced by {@link XyzParser#length}.
   * @param ctx the parse tree
   */
  void exitLength(XyzParser.LengthContext ctx);
  /**
   * Enter a parse tree produced by {@link XyzParser#meter}.
   * @param ctx the parse tree
   */
  void enterMeter(XyzParser.MeterContext ctx);
  /**
   * Exit a parse tree produced by {@link XyzParser#meter}.
   * @param ctx the parse tree
   */
  void exitMeter(XyzParser.MeterContext ctx);
  /**
   * Enter a parse tree produced by {@link XyzParser#tempo}.
   * @param ctx the parse tree
   */
  void enterTempo(XyzParser.TempoContext ctx);
  /**
   * Exit a parse tree produced by {@link XyzParser#tempo}.
   * @param ctx the parse tree
   */
  void exitTempo(XyzParser.TempoContext ctx);
  /**
   * Enter a parse tree produced by {@link XyzParser#key}.
   * @param ctx the parse tree
   */
  void enterKey(XyzParser.KeyContext ctx);
  /**
   * Exit a parse tree produced by {@link XyzParser#key}.
   * @param ctx the parse tree
   */
  void exitKey(XyzParser.KeyContext ctx);
  /**
   * Enter a parse tree produced by {@link XyzParser#voice}.
   * @param ctx the parse tree
   */
  void enterVoice(XyzParser.VoiceContext ctx);
  /**
   * Exit a parse tree produced by {@link XyzParser#voice}.
   * @param ctx the parse tree
   */
  void exitVoice(XyzParser.VoiceContext ctx);
  /**
   * Enter a parse tree produced by {@link XyzParser#characters}.
   * @param ctx the parse tree
   */
  void enterCharacters(XyzParser.CharactersContext ctx);
  /**
   * Exit a parse tree produced by {@link XyzParser#characters}.
   * @param ctx the parse tree
   */
  void exitCharacters(XyzParser.CharactersContext ctx);
  /**
   * Enter a parse tree produced by {@link XyzParser#temp_bpm}.
   * @param ctx the parse tree
   */
  void enterTemp_bpm(XyzParser.Temp_bpmContext ctx);
  /**
   * Exit a parse tree produced by {@link XyzParser#temp_bpm}.
   * @param ctx the parse tree
   */
  void exitTemp_bpm(XyzParser.Temp_bpmContext ctx);
  /**
   * Enter a parse tree produced by {@link XyzParser#number}.
   * @param ctx the parse tree
   */
  void enterNumber(XyzParser.NumberContext ctx);
  /**
   * Exit a parse tree produced by {@link XyzParser#number}.
   * @param ctx the parse tree
   */
  void exitNumber(XyzParser.NumberContext ctx);
}