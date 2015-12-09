package abc.parser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

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
import abc.sound.Accidental;
import abc.sound.Chord;
import abc.sound.Measure;
import abc.sound.Note;
import abc.sound.Pitch;
import abc.sound.Playable;
import abc.sound.RatNum;
import abc.sound.Rest;
import abc.sound.Tuplet;
import abc.sound.Voice;

public class MakeBody implements AbcListener {
    private RatNum duration = new RatNum(1, 1);
    private Accidental accidental = Accidental.NONE;
    private int octave = 0;
    private boolean chordN = false;
    private boolean chordT = false;
    private boolean tupletN = false;
    private boolean def = true;
    private Map<String,Accidental> accidentalMeasure;

    private Stack<Note> chord = new Stack<>();
    private Stack<Playable> tuplet = new Stack<>();
    private Stack<Playable> playable = new Stack<>();
    String key = "";
    private Map<String, List<Measure>> voices = new HashMap<String, List<Measure>>();

    public Set<Voice> getVoices() {
        Set<Voice> voice = new HashSet<>();
        for (String key : voices.keySet()) {
            Voice v = new Voice(voices.get(key), key);
            voice.add(v);
        }
        return voice;
    }

    @Override
    public void enterLine(LineContext ctx) {
        if (def) {
            voices.put("DEFAULT_VOICE", new ArrayList<Measure>());
        }
        def = false;
    }

    @Override
    public void enterTuplet(TupletContext ctx) {
        tupletN = true;
        chordT = true;
    }

    @Override
    public void enterChord(ChordContext ctx) {
        chordN = true;
    }

    @Override
    public void enterMeasure(MeasureContext ctx) {
        accidentalMeasure= new HashMap<String,Accidental>();
    }

    @Override
    public void exitMeasure(MeasureContext ctx) {
        boolean beginR = false;
        boolean endR = false;
        boolean firstE = false;
        boolean secondE = false;

        List<Playable> playables = new ArrayList<Playable>();
        if (ctx.BEGIN_REPEAT() != null) {
            beginR = true;
        }
        if (ctx.END_REPEAT() != null) {
            endR = true;
        }
        if (ctx.ONE_REPEAT() != null) {
            firstE = true;
        }
        if (ctx.TWO_REPEAT() != null) {
            secondE = true;
        }
        while (!playable.isEmpty()) {
            playables.add(playable.pop());
        }
        Collections.reverse(playables);
        Measure m = new Measure(playables, beginR, endR, firstE, secondE);
        if (voices.size() > 1) {
            voices.get(key).add(m);
        } else {
            voices.get("DEFAULT_VOICE").add(m);
        }
        //accidental = Accidental.NONE;
    }

    @Override
    public void enterVoice(VoiceContext ctx) {
        String v = ctx.getText().trim();
        key = v;
        if (!voices.containsKey(v)) {
            voices.put(v, new ArrayList<Measure>());
        }
    }

    @Override
    public void exitVoice(VoiceContext ctx) {
    }

    @Override
    public void exitElement(ElementContext ctx) {
    }

    @Override
    public void exitTuplet(TupletContext ctx) {
    }

    @Override
    public void exitNote(NoteContext ctx) {
        String pitch = ctx.LETTER().getText().trim();
        Pitch p = new Pitch('C');
        if (accidentalMeasure.containsKey(pitch.toUpperCase())){
            if (accidental == accidental.NONE){ 
                accidental = accidentalMeasure.get(pitch.toUpperCase()); 
            } else {
                accidentalMeasure.put(pitch.toUpperCase(), accidental);
            }
              
        } else if (!accidentalMeasure.containsKey(pitch.toUpperCase())){
            if (accidental != accidental.NONE){
                accidentalMeasure.put(pitch.toUpperCase(), accidental);
            }
        }
        if (pitch.matches("[a-g]")) {
            octave = octave + 12;
            pitch = pitch.toUpperCase();
            char charPitch = pitch.charAt(0);
            p = new Pitch(charPitch);
            p = p.transpose(octave); // return new?
        } else {
            char charPitch = pitch.charAt(0);
            p = new Pitch(charPitch);
            p = p.transpose(octave);
        }
        if (chordN) {
            Note note = new Note(p, duration, accidental);
            chord.push(note);
        } else if (tupletN) {
            Note note = new Note(p, duration, accidental);
            tuplet.push(note);
        } else {
            Note note = new Note(p, duration, accidental);
            playable.push(note);
        }
        octave = 0;
        duration = new RatNum(1, 1);
        accidental = accidental.NONE;
    }

    @Override
    public void exitRest(RestContext ctx) {
        Rest rest = new Rest(new RatNum(1, 1));
        if (ctx.duration() != null) {
            rest = new Rest(duration);
        }
        playable.push(rest);
        duration = new RatNum(1, 1);
    }

    @Override
    public void exitDuration(DurationContext ctx) {
        String rational = ctx.DURATION().getText().trim();
        if (rational.matches("[0-9]+")) { // x
            duration = new RatNum(Integer.parseInt(rational), 1);
        } else if (rational.matches("[0-9]+/")) { // x/
            int slash = rational.indexOf("/");
            String numerator = rational.substring(0, slash);
            duration = new RatNum(Integer.parseInt(numerator), 2);
        } else if (rational.matches("/[0-9]+")) {// /x
            String denominator = rational.substring(1);
            duration = new RatNum(1, Integer.parseInt(denominator));
        } else if (rational.matches("[0-9]+/[0-9]+")) {// x/x
            int slash = rational.indexOf("/");
            int numerator = Integer.parseInt(rational.substring(0, slash));
            int denominator = Integer.parseInt(rational.substring(slash + 1));
            duration = new RatNum(numerator, denominator);
        } else if (rational.equals("/")) {// /
            duration = new RatNum(1, 2);
        }
    }

    @Override
    public void exitOctave(OctaveContext ctx) {
        String oct = ctx.OCTAVE().getText().trim();
        if (oct.matches("[']+")) {
            for (int count = 0; count < oct.length(); ++count) {
                if (oct.charAt(count) == '\'') {
                    octave = octave + 12;
                }
            }
        } else if (oct.matches("[,]+")) {
            for (int count = 0; count < oct.length(); ++count) {
                if (oct.charAt(count) == ',') {
                    octave = octave - 12;
                }
            }
        }
    }

    @Override
    public void exitAccidental(AccidentalContext ctx) {
        String acc = ctx.ACCIDENTAL().getText().trim();
        if (acc.equals("^")) {
            accidental = Accidental.SHARP;
        } else if (acc.equals("^^")) {
            accidental = Accidental.DOUBLESHARP;
        } else if (acc.equals("_")) {
            accidental = Accidental.FLAT;
        } else if (acc.equals("__")) {
            accidental = Accidental.DOUBLEFLAT;
        } else if (acc.equals("=")) {
            accidental = Accidental.NATURAL;
        }
    }

    @Override
    public void exitChord(ChordContext ctx) {
        List<Note> notes = new ArrayList<Note>();
        while (!chord.empty()) {
            notes.add(chord.pop());
        }
        Collections.reverse(notes);
        Chord c = new Chord(notes);
        if (chordT) { // add to Tuplet
            tuplet.push(c);
        } else {
            playable.push(c);
        }
        chordN = false;
        //System.out.println("chord done");
    }

    @Override
    public void exitDuplet(DupletContext ctx) {
        List<Playable> notes = new ArrayList<Playable>();
        while (!tuplet.empty()) {
            notes.add(tuplet.pop());
        }
        Collections.reverse(notes);
        Tuplet tuplet = new Tuplet(notes);
        playable.push(tuplet);
        tupletN = false;
        chordT = false;
    }

    @Override
    public void exitTriplet(TripletContext ctx) {
        List<Playable> notes = new ArrayList<Playable>();
        while (!tuplet.empty()) {
            notes.add(tuplet.pop());
        }
        Collections.reverse(notes);
        Tuplet tuplet = new Tuplet(notes);
        playable.push(tuplet);
        tupletN = false;
        chordT = false;

    }

    @Override
    public void exitQuadruplet(QuadrupletContext ctx) {
        List<Playable> notes = new ArrayList<Playable>();
        while (!tuplet.empty()) {
            notes.add(tuplet.pop());
        }
        Collections.reverse(notes);
        Tuplet tuplet = new Tuplet(notes);
        playable.push(tuplet);
        tupletN = false;
        chordT = false;
    }

    @Override
    public void exitRoot(RootContext ctx) {
    }

    @Override
    public void exitBody(BodyContext ctx) {
    }

    @Override
    public void exitLine(LineContext ctx) {
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
    public void enterRoot(RootContext ctx) {
    }

    @Override
    public void enterBody(BodyContext ctx) {
    }

    @Override
    public void enterElement(ElementContext ctx) {
    }

    @Override
    public void enterNote(NoteContext ctx) {
    }

    @Override
    public void enterRest(RestContext ctx) {
    }

    @Override
    public void enterDuration(DurationContext ctx) {
    }

    @Override
    public void enterOctave(OctaveContext ctx) {
    }

    @Override
    public void enterAccidental(AccidentalContext ctx) {
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
