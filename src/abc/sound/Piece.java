package abc.sound;



import java.util.ArrayList;

import java.util.List;
import java.util.Set;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;



public class Piece {
	private final Set<Voice> voices;
	
	
	public Piece(Set<Voice> voices) {
		this.voices = voices;

	}
	
	public List<Voice> getVoices() {
		return new ArrayList<Voice>(voices);
	}
	
	
	
	
	public SequencePlayer play() throws MidiUnavailableException, InvalidMidiDataException {
		int bpm = 0; // TODO initialize
		int tpb = 0; // TODO initialize
		SequencePlayer sp = new SequencePlayer(bpm, tpb);
		for (Voice voice : voices) {
			List<PlaybackNote> playbackNotes = voice.play();
			for (PlaybackNote playbackNote: playbackNotes) {
				sp.addNote(playbackNote.pitch().toMidiNote(), playbackNote.start(), playbackNote.ticks());
			}
		}
		return sp;
	}
	
	
	
	
}
