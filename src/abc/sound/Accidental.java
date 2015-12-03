package abc.sound;

/**
 * Represents an accidental in the music, which can temporarily override the effect of the key signature. An accidental can be a sharp, a flat, or a natural. 
 * A sharp causes a note to be played one semitone higher, a flat one semitone lower, and a natural causes the note to be played as if they key were in C 
 * without any accidental. Double sharps and flats are also allowed. An accidental only affects a single octave. The effect of an accidental on a note lasts 
 * through the remainder of the current bar, and can be overridden by another accidental that occurs in the same bar.
 */
public enum Accidental {
	DOUBLESHARP, SHARP, NATURAL, FLAT, DOUBLEFLAT, NONE
}
