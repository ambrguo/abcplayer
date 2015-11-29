package abc.sound;

public class PlaybackNote {
	private Pitch pitch;
	private int start;
	private int ticks;
	
	public PlaybackNote(Pitch pitch, int start, int ticks) {
		this.pitch = pitch;
		this.start = start;
		this.ticks = ticks;
	}
	
	public Pitch pitch() {
		return pitch;
	}
	
	public int start() {
		return start;
	}
	
	public int ticks() {
		return ticks;
	}
}
