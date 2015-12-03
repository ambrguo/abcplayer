package abc.parser;

import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import abc.parser.AbcParser.BodyContext;
import abc.parser.AbcParser.ChordContext;
import abc.parser.AbcParser.DupletContext;
import abc.parser.AbcParser.ElementContext;

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

/**
 * @category no_didit
 * @author Amber
 *
 */
public class MakeMeasure implements AbcListener {
    private Stack<Playable> playables = new Stack<>();
    private Stack<Measure> measures = new Stack<>(); 
    
    public Measure getMeasure() {
        return measures.get(0);
    }

    @Override
    public void exitMeasure(MeasureContext ctx) {
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
        if (ctx.REST() != null) {
            // figure out what the duration is
            String duration = ctx.REST().getText().substring(1); //ignore 'z', just want number
            int numerator = 0;
            int denominator = 0;
            if (duration.contains("/")) {
                if (duration.matches("[0-9]+/")){ //xx/
                    numerator = Integer.parseInt(duration.substring(0, duration.length()-1));
                    denominator = 1;
                } else if (duration.matches("/[0-9]+")){ // /xx
                    numerator = 1;
                    denominator = Integer.parseInt(duration.substring(1));
                } else {
                    String[] rational = duration.split("/");
                    numerator = Integer.parseInt(rational[0]);
                    denominator = Integer.parseInt(rational[1]);
                }
          
            } else if (!duration.contains("/")){ // xx
                numerator = Integer.parseInt(duration);
                denominator = 1;
            }
            RatNum rational = new RatNum(numerator, denominator);
            Playable x = new Rest(rational);
            playables.push(x);
        } else {}
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
    public void enterRoot(RootContext ctx) {
    }

    @Override
    public void exitRoot(RootContext ctx) {
    }

    @Override
    public void enterEveryRule(ParserRuleContext arg0) {
    }

    @Override
    public void exitEveryRule(ParserRuleContext arg0) {
    }

    @Override
    public void visitErrorNode(ErrorNode arg0) {
    }

    @Override
    public void visitTerminal(TerminalNode arg0) {
    }

   

    @Override
    public void enterBody(BodyContext ctx) {
    }

    @Override
    public void exitBody(BodyContext ctx) {
    }

    @Override
    public void enterLine(LineContext ctx) {
    }

    @Override
    public void exitLine(LineContext ctx) {
    }

    @Override
    public void enterMeasure(MeasureContext ctx) {
    }

    @Override
    public void enterElement(ElementContext ctx) {
    }

    @Override
    public void enterTuplet(TupletContext ctx) {
    }

    @Override
    public void enterNote(NoteContext ctx) {
    }

    @Override
    public void enterRest(RestContext ctx) {
    }

    @Override
    public void enterChord(ChordContext ctx) {
    }

    @Override
    public void enterDuplet(DupletContext ctx) {
    }

    @Override
    public void enterTriplet(TripletContext ctx) {
    }

    @Override
    public void enterQuadruplet(QuadrupletContext ctx) {
    }
}
