package obj;

public class Note {
	int num;
	int octave;
	public Note(int n) {
		num = n;
		octave = 1 + (num / 12);
	}
	public String toString() {
		num %= 12;
		switch(num) {
		case 0: return "C";
		case 1: return "C#";
		case 2: return "D";
		case 3: return "D#";
		case 4: return "E";
		case 5: return "F";
		case 6: return "F#";
		case 7: return "G";
		case 8: return "G#";
		case 9: return "A";
		case 10: return "A#";
		case 11: return "B";
		default: return null;
		}
	}
	public int getNoteNumWOct(){
		return num;
	}
	public int getNoteNum() {
		return num %= 12;
	}
	public int getOctave() {
		return octave;
	}
}
