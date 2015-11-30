package abc.sound;

import java.util.List;
import java.util.ArrayList;

/**
 * Represents a bar of music
 */
public class Measure {
	// Abstraction function: TODO
	// Rep invariant: TODO
	// Safety from rep exposure: TODO
	
	private final List<Playable> playables;
	private final boolean beginRepeat;
	private final boolean endRepeat;
	private final boolean hasAlternateEnding;
	
	public Measure(List<Playable> playables, boolean beginRepeat, boolean endRepeat, boolean hasAlternateEnding) {
		if (beginRepeat || endRepeat) {
			playables.add(0, new Repeat(beginRepeat, endRepeat, hasAlternateEnding, 0));
		}
		this.playables = playables;
		this.beginRepeat = beginRepeat;
		this.endRepeat = endRepeat;
		this.hasAlternateEnding = hasAlternateEnding;
	}
	
	public List<Playable> getPlayables() {
		return new ArrayList<Playable>(playables);
	}
	
	public boolean getBeginRepeat() {
		return beginRepeat;
	}
	
	public boolean getEndRepeat() {
		return endRepeat;
	}
	
	public boolean getHasAlternateEnding() {
		return hasAlternateEnding;
	}
	
	public List<PlaybackNote> play(int startTick, int numTicks, RatNum defaultLength) {
		List<Playable> toPlay = new ArrayList<Playable>(playables);
		List<PlaybackNote> playbackNotes = new ArrayList<PlaybackNote>();
 		if (toPlay.get(0).isRepeat()) {
 			toPlay.remove(0);
 		}
 		// TODO handle changing startTicks
 		// TODO handle accidentals
		for (Playable playable : toPlay) {
			playbackNotes.addAll(playable.play(startTick, numTicks, defaultLength));
		}
		return playbackNotes;
	}
}
