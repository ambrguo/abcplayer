package abc.sound;

public class PlaybackNote {
	private Pitch pitch;
	private int startTick;
	private int numTicks;
	
	public PlaybackNote(Pitch pitch, int startTick, int numTicks) {
		this.pitch = pitch;
		this.startTick = startTick;
		this.numTicks = numTicks;
	}
	
	public Pitch pitch() {
		return pitch;
	}
	
	public int start() {
		return startTick;
	}
	
	public int ticks() {
		return numTicks;
	}
}
