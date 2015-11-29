package abc.sound;

import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

public class Piece {
	private final List<Voice> voices;
	
	public Piece(List<Voice> voices) {
		this.voices = voices;
	}
	
	public List<Voice> getVoices() {
		return new ArrayList<Voice>(voices);
	}
	
	public SequencePlayer play() throws MidiUnavailableException, InvalidMidiDataException {
		int bpm = 0; // TODO initialize
		int tpb = 0; // TODO initialize
		SequencePlayer sp = new SequencePlayer(bpm, tpb);
		// TODO implement
		return sp;
	}
}
