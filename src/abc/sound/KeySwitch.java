package abc.sound;

import java.util.HashMap;
import java.util.Map;

public class KeySwitch {
	/**
	 * Maps a key signature to the associated accidentals
	 * @param k key signature
	 * @return a mapping of the affected note bases to the appropriate accidentals
	 */
	public Map<String, Accidental> keySwitch(Key k) {
		Map<String, Accidental> transposeMap = new HashMap<>();
		switch (k) {
			case C_SHARP_MAJOR: transposeMap.put("F", Accidental.SHARP);
								transposeMap.put("C", Accidental.SHARP);
								transposeMap.put("G", Accidental.SHARP);
								transposeMap.put("D", Accidental.SHARP);
								transposeMap.put("A", Accidental.SHARP);
								transposeMap.put("E", Accidental.SHARP);
								transposeMap.put("B", Accidental.SHARP);
								break;
			case F_SHARP_MAJOR: transposeMap.put("F", Accidental.SHARP);
								transposeMap.put("C", Accidental.SHARP);
								transposeMap.put("G", Accidental.SHARP);
								transposeMap.put("D", Accidental.SHARP);
								transposeMap.put("A", Accidental.SHARP);
								transposeMap.put("E", Accidental.SHARP);
								break;
			case B_MAJOR: 		transposeMap.put("F", Accidental.SHARP);
								transposeMap.put("C", Accidental.SHARP);
								transposeMap.put("G", Accidental.SHARP);
								transposeMap.put("D", Accidental.SHARP);
								transposeMap.put("A", Accidental.SHARP);
								break;
			case E_MAJOR: 		transposeMap.put("F", Accidental.SHARP);
								transposeMap.put("C", Accidental.SHARP);
								transposeMap.put("G", Accidental.SHARP);
								transposeMap.put("D", Accidental.SHARP);
								break;
			case A_MAJOR: 		transposeMap.put("F", Accidental.SHARP);
								transposeMap.put("C", Accidental.SHARP);
								transposeMap.put("G", Accidental.SHARP);
								break;
			case D_MAJOR: 		transposeMap.put("F", Accidental.SHARP);
								transposeMap.put("C", Accidental.SHARP);
								break;
			case G_MAJOR: 		transposeMap.put("F", Accidental.SHARP);
								break;
			case C_MAJOR: 		break;
			case F_MAJOR: 		transposeMap.put("B", Accidental.FLAT);
								break;
			case B_FLAT_MAJOR: 	transposeMap.put("B", Accidental.FLAT);
								transposeMap.put("E", Accidental.FLAT);
								break;
			case E_FLAT_MAJOR: 	transposeMap.put("B", Accidental.FLAT);
								transposeMap.put("E", Accidental.FLAT);
								transposeMap.put("A", Accidental.FLAT);
								break;
			case A_FLAT_MAJOR: 	transposeMap.put("B", Accidental.FLAT);
								transposeMap.put("E", Accidental.FLAT);
								transposeMap.put("A", Accidental.FLAT);
								transposeMap.put("D", Accidental.FLAT);
								break;
			case D_FLAT_MAJOR: 	transposeMap.put("B", Accidental.FLAT);
								transposeMap.put("E", Accidental.FLAT);
								transposeMap.put("A", Accidental.FLAT);
								transposeMap.put("D", Accidental.FLAT);
								transposeMap.put("G", Accidental.FLAT);
								break;
			case G_FLAT_MAJOR: 	transposeMap.put("B", Accidental.FLAT);
								transposeMap.put("E", Accidental.FLAT);
								transposeMap.put("A", Accidental.FLAT);
								transposeMap.put("D", Accidental.FLAT);
								transposeMap.put("G", Accidental.FLAT);
								transposeMap.put("C", Accidental.FLAT);
								break;
			case C_FLAT_MAJOR: 	transposeMap.put("B", Accidental.FLAT);
								transposeMap.put("E", Accidental.FLAT);
								transposeMap.put("A", Accidental.FLAT);
								transposeMap.put("D", Accidental.FLAT);
								transposeMap.put("G", Accidental.FLAT);
								transposeMap.put("C", Accidental.FLAT);
								transposeMap.put("F", Accidental.FLAT);
								break;
			
			case A_SHARP_MINOR: transposeMap.put("F", Accidental.SHARP);
								transposeMap.put("C", Accidental.SHARP);
								transposeMap.put("G", Accidental.SHARP);
								transposeMap.put("D", Accidental.SHARP);
								transposeMap.put("A", Accidental.SHARP);
								transposeMap.put("E", Accidental.SHARP);
								transposeMap.put("B", Accidental.SHARP);
								break;
			case D_SHARP_MINOR: transposeMap.put("F", Accidental.SHARP);
								transposeMap.put("C", Accidental.SHARP);
								transposeMap.put("G", Accidental.SHARP);
								transposeMap.put("D", Accidental.SHARP);
								transposeMap.put("A", Accidental.SHARP);
								transposeMap.put("E", Accidental.SHARP);
								break;
			case G_SHARP_MINOR: transposeMap.put("F", Accidental.SHARP);
								transposeMap.put("C", Accidental.SHARP);
								transposeMap.put("G", Accidental.SHARP);
								transposeMap.put("D", Accidental.SHARP);
								transposeMap.put("A", Accidental.SHARP);
								break;
			case C_SHARP_MINOR: transposeMap.put("F", Accidental.SHARP);
								transposeMap.put("C", Accidental.SHARP);
								transposeMap.put("G", Accidental.SHARP);
								transposeMap.put("D", Accidental.SHARP);
								break;
			case F_SHARP_MINOR: transposeMap.put("F", Accidental.SHARP);
								transposeMap.put("C", Accidental.SHARP);
								transposeMap.put("G", Accidental.SHARP);
								break;
			case B_MINOR: 		transposeMap.put("F", Accidental.SHARP);
								transposeMap.put("C", Accidental.SHARP);
								break;
			case E_MINOR: 		transposeMap.put("F", Accidental.SHARP);
								break;
			case A_MINOR: 		break;
			case D_MINOR: 		transposeMap.put("B", Accidental.FLAT);
								break;
			case G_MINOR: 		transposeMap.put("B", Accidental.FLAT);
								transposeMap.put("E", Accidental.FLAT);
								break;
			case C_MINOR: 		transposeMap.put("B", Accidental.FLAT);
								transposeMap.put("E", Accidental.FLAT);
								transposeMap.put("A", Accidental.FLAT);
								break;
			case F_MINOR: 		transposeMap.put("B", Accidental.FLAT);
								transposeMap.put("E", Accidental.FLAT);
								transposeMap.put("A", Accidental.FLAT);
								transposeMap.put("D", Accidental.FLAT);
								break;
			case B_FLAT_MINOR: 	transposeMap.put("B", Accidental.FLAT);
								transposeMap.put("E", Accidental.FLAT);
								transposeMap.put("A", Accidental.FLAT);
								transposeMap.put("D", Accidental.FLAT);
								transposeMap.put("G", Accidental.FLAT);
								break;
			case E_FLAT_MINOR: 	transposeMap.put("B", Accidental.FLAT);
								transposeMap.put("E", Accidental.FLAT);
								transposeMap.put("A", Accidental.FLAT);
								transposeMap.put("D", Accidental.FLAT);
								transposeMap.put("G", Accidental.FLAT);
								transposeMap.put("C", Accidental.FLAT);
								break;
			case A_FLAT_MINOR: 	transposeMap.put("B", Accidental.FLAT);
								transposeMap.put("E", Accidental.FLAT);
								transposeMap.put("A", Accidental.FLAT);
								transposeMap.put("D", Accidental.FLAT);
								transposeMap.put("G", Accidental.FLAT);
								transposeMap.put("C", Accidental.FLAT);
								transposeMap.put("F", Accidental.FLAT);
								break;
			
			case A_SHARP_MAJOR: transposeMap.put("A", Accidental.SHARP);
								transposeMap.put("B", Accidental.SHARP);
								transposeMap.put("C", Accidental.DOUBLESHARP);
								transposeMap.put("D", Accidental.SHARP);
								transposeMap.put("E", Accidental.SHARP);
								transposeMap.put("F", Accidental.DOUBLESHARP);
								transposeMap.put("G", Accidental.DOUBLESHARP);
								break;
			case B_SHARP_MAJOR: transposeMap.put("A", Accidental.DOUBLESHARP);
								transposeMap.put("B", Accidental.SHARP);
								transposeMap.put("C", Accidental.DOUBLESHARP);
								transposeMap.put("E", Accidental.SHARP);
								transposeMap.put("F", Accidental.DOUBLESHARP);
								transposeMap.put("G", Accidental.DOUBLESHARP);
								break;
			case D_SHARP_MAJOR: transposeMap.put("A", Accidental.SHARP);
								transposeMap.put("B", Accidental.SHARP);
								transposeMap.put("C", Accidental.DOUBLESHARP);
								transposeMap.put("D", Accidental.SHARP);
								transposeMap.put("E", Accidental.SHARP);
								transposeMap.put("F", Accidental.DOUBLESHARP);
								transposeMap.put("G", Accidental.SHARP);
								break;
			case E_SHARP_MAJOR: transposeMap.put("A", Accidental.SHARP);
								transposeMap.put("B", Accidental.SHARP);
								transposeMap.put("C", Accidental.DOUBLESHARP);
								transposeMap.put("D", Accidental.DOUBLESHARP);
								transposeMap.put("E", Accidental.SHARP);
								transposeMap.put("F", Accidental.DOUBLESHARP);
								transposeMap.put("G", Accidental.DOUBLESHARP);
								break;
			case F_FLAT_MAJOR: 	transposeMap.put("A", Accidental.FLAT);
								transposeMap.put("B", Accidental.DOUBLEFLAT);
								transposeMap.put("C", Accidental.FLAT);
								transposeMap.put("D", Accidental.FLAT);
								transposeMap.put("E", Accidental.FLAT);
								transposeMap.put("F", Accidental.FLAT);
								transposeMap.put("G", Accidental.FLAT);
								break;
			case B_SHARP_MINOR: transposeMap.put("A", Accidental.SHARP);
								transposeMap.put("B", Accidental.SHARP);
								transposeMap.put("C", Accidental.DOUBLESHARP);
								transposeMap.put("D", Accidental.SHARP);
								transposeMap.put("E", Accidental.SHARP);
								transposeMap.put("F", Accidental.DOUBLESHARP);
								transposeMap.put("G", Accidental.SHARP);
								break;
			case C_FLAT_MINOR: 	transposeMap.put("A", Accidental.DOUBLEFLAT);
								transposeMap.put("B", Accidental.DOUBLEFLAT);
								transposeMap.put("C", Accidental.FLAT);
								transposeMap.put("D", Accidental.FLAT);
								transposeMap.put("E", Accidental.DOUBLEFLAT);
								transposeMap.put("F", Accidental.FLAT);
								transposeMap.put("G", Accidental.FLAT);
								break;
			case D_FLAT_MINOR: 	transposeMap.put("A", Accidental.FLAT);
								transposeMap.put("B", Accidental.DOUBLEFLAT);
								transposeMap.put("C", Accidental.FLAT);
								transposeMap.put("D", Accidental.FLAT);
								transposeMap.put("E", Accidental.FLAT);
								transposeMap.put("F", Accidental.FLAT);
								transposeMap.put("G", Accidental.FLAT);
								break;
			case E_SHARP_MINOR: transposeMap.put("A", Accidental.SHARP);
								transposeMap.put("B", Accidental.SHARP);
								transposeMap.put("C", Accidental.SHARP);
								transposeMap.put("D", Accidental.SHARP);
								transposeMap.put("E", Accidental.SHARP);
								transposeMap.put("F", Accidental.DOUBLESHARP);
								transposeMap.put("G", Accidental.SHARP);
								break;
			case F_FLAT_MINOR: 	transposeMap.put("A", Accidental.DOUBLEFLAT);
								transposeMap.put("B", Accidental.DOUBLEFLAT);
								transposeMap.put("C", Accidental.FLAT);
								transposeMap.put("D", Accidental.DOUBLEFLAT);
								transposeMap.put("E", Accidental.DOUBLEFLAT);
								transposeMap.put("F", Accidental.FLAT);
								transposeMap.put("G", Accidental.FLAT);
								break;
		}
		
		return transposeMap;
	}
}
