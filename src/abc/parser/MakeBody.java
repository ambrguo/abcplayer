package abc.parser;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import abc.parser.AbcParser.AccidentalContext;
import abc.parser.AbcParser.BodyContext;
import abc.parser.AbcParser.ChordContext;
import abc.parser.AbcParser.DupletContext;
import abc.parser.AbcParser.DurationContext;
import abc.parser.AbcParser.ElementContext;
import abc.parser.AbcParser.LineContext;
import abc.parser.AbcParser.MeasureContext;
import abc.parser.AbcParser.NoteContext;
import abc.parser.AbcParser.OctaveContext;
import abc.parser.AbcParser.QuadrupletContext;
import abc.parser.AbcParser.RestContext;
import abc.parser.AbcParser.RootContext;
import abc.parser.AbcParser.TripletContext;
import abc.parser.AbcParser.TupletContext;
import abc.parser.AbcParser.VoiceContext;

public class MakeBody implements AbcListener {
    
    @Override
    public void exitRoot(RootContext ctx) {
        // TODO Auto-generated method stub
        
    }
    
    @Override
    public void exitBody(BodyContext ctx) {
        // TODO Auto-generated method stub
        
    }

    

    @Override
    public void exitLine(LineContext ctx) {
        // TODO Auto-generated method stub
        
    }
    

    @Override
    public void exitMeasure(MeasureContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitVoice(VoiceContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitElement(ElementContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitTuplet(TupletContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitNote(NoteContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitRest(RestContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitDuration(DurationContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitOctave(OctaveContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitAccidental(AccidentalContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitChord(ChordContext ctx) {
        // TODO Auto-generated method stub
        
    }

    

    @Override
    public void exitDuplet(DupletContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitTriplet(TripletContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitQuadruplet(QuadrupletContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void enterEveryRule(ParserRuleContext arg0) {}
    @Override
    public void exitEveryRule(ParserRuleContext arg0) {}
    @Override
    public void visitErrorNode(ErrorNode arg0) {}
    @Override
    public void visitTerminal(TerminalNode arg0) {}
    @Override
    public void enterRoot(RootContext ctx) {}
    @Override
    public void enterBody(BodyContext ctx) {}
    @Override
    public void enterLine(LineContext ctx) {}
    @Override
    public void enterMeasure(MeasureContext ctx) {}
    @Override
    public void enterVoice(VoiceContext ctx) {}
    @Override
    public void enterElement(ElementContext ctx) {}
    @Override
    public void enterTuplet(TupletContext ctx) {}
    @Override
    public void enterNote(NoteContext ctx) {}
    @Override
    public void enterRest(RestContext ctx) {}
    @Override
    public void enterDuration(DurationContext ctx) {}
    @Override
    public void enterOctave(OctaveContext ctx) {}
    @Override
    public void enterAccidental(AccidentalContext ctx) {}
    @Override
    public void enterChord(ChordContext ctx) {}
    @Override
    public void enterDuplet(DupletContext ctx) {}
    @Override
    public void enterTriplet(TripletContext ctx) {}
    @Override
    public void enterQuadruplet(QuadrupletContext ctx) {}

}
