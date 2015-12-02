package abc.parser;

import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import abc.parser.AbcParser.BodyContext;
import abc.parser.AbcParser.ChordContext;
import abc.parser.AbcParser.DupletContext;
import abc.parser.AbcParser.ElementContext;
import abc.parser.AbcParser.Field_composerContext;
import abc.parser.AbcParser.Field_keyContext;
import abc.parser.AbcParser.Field_lengthContext;
import abc.parser.AbcParser.Field_meterContext;
import abc.parser.AbcParser.Field_numberContext;
import abc.parser.AbcParser.Field_otherContext;
import abc.parser.AbcParser.Field_tempoContext;
import abc.parser.AbcParser.Field_titleContext;
import abc.parser.AbcParser.HeaderContext;
import abc.parser.AbcParser.LineContext;
import abc.parser.AbcParser.MeasureContext;
import abc.parser.AbcParser.NoteContext;
import abc.parser.AbcParser.QuadrupletContext;
import abc.parser.AbcParser.RestContext;
import abc.parser.AbcParser.RootContext;
import abc.parser.AbcParser.TripletContext;
import abc.parser.AbcParser.TupletContext;
import abc.sound.Measure;
import abc.sound.Playable;
import abc.sound.RatNum;
import abc.sound.Rest;

public class MakeHeader implements XyzListener {

    @Override
    public void enterEveryRule(ParserRuleContext arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitEveryRule(ParserRuleContext arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void visitErrorNode(ErrorNode arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void visitTerminal(TerminalNode arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterRoot(abc.parser.XyzParser.RootContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitRoot(abc.parser.XyzParser.RootContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterHeader(abc.parser.XyzParser.HeaderContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitHeader(abc.parser.XyzParser.HeaderContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterField_number(abc.parser.XyzParser.Field_numberContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitField_number(abc.parser.XyzParser.Field_numberContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterField_title(abc.parser.XyzParser.Field_titleContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitField_title(abc.parser.XyzParser.Field_titleContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterField_other(abc.parser.XyzParser.Field_otherContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitField_other(abc.parser.XyzParser.Field_otherContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterField_composer(abc.parser.XyzParser.Field_composerContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitField_composer(abc.parser.XyzParser.Field_composerContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterField_length(abc.parser.XyzParser.Field_lengthContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitField_length(abc.parser.XyzParser.Field_lengthContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterField_meter(abc.parser.XyzParser.Field_meterContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitField_meter(abc.parser.XyzParser.Field_meterContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterField_tempo(abc.parser.XyzParser.Field_tempoContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitField_tempo(abc.parser.XyzParser.Field_tempoContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterField_key(abc.parser.XyzParser.Field_keyContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitField_key(abc.parser.XyzParser.Field_keyContext ctx) {
        // TODO Auto-generated method stub
        
    }
    
}