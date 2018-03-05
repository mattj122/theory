package obj;

public class Chord {
	Note root; 
	Note [] notes;
	int type;
	public Chord() {
	}
	public Chord(int n) {
		root = new Note(n);
	}
	/*
	 * 0 = Major
	 * 1 = minor
	 * 2 = Seventh
	 * 3 = Diminished
	 * 4 = Augmented
	 * 5 = Major 6th
	 * 6 = minor 6th
	 * 7 = Ninth
	 */
	public void setChord(int c) {
		type = c;
		switch(c) {
		//M
		case 0: notes = new Note[] {root, new Note(root.getNoteNumWOct() + 4), new Note(root.getNoteNumWOct() + 7)};
		break;
		//m
		case 1: notes = new Note[] {root, new Note(root.getNoteNumWOct() + 3), new Note(root.getNoteNumWOct() + 7)};
		break;
		//7th
		case 2: notes = new Note[] {root, new Note(root.getNoteNumWOct() + 4), new Note(root.getNoteNumWOct() + 7), new Note(root.getNoteNumWOct() + 10)};
		break;
		//Dim
		case 3: notes = new Note[] {root, new Note(root.getNoteNumWOct() + 3), new Note(root.getNoteNumWOct() + 6), new Note(root.getNoteNumWOct() + 9)};
		break;
		//Aug
		case 4: notes = new Note[] {root, new Note(root.getNoteNumWOct() + 4), new Note(root.getNoteNumWOct() + 8)};
		break;
		//M6
		case 5: notes = new Note[] {root, new Note(root.getNoteNumWOct() + 4), new Note(root.getNoteNumWOct() + 7), new Note(root.getNoteNumWOct() + 9)};
		break;
		//m6
		case 6: notes = new Note[] {root, new Note(root.getNoteNumWOct() + 3), new Note(root.getNoteNumWOct() + 7), new Note(root.getNoteNumWOct() + 9)};
		break;
		//9th
		case 7: notes = new Note[] {root, new Note(root.getNoteNumWOct() + 2), new Note(root.getNoteNumWOct() + 4), new Note(root.getNoteNumWOct() + 7), new Note(root.getNoteNumWOct() + 10)};
		break;
		default: notes = null;
		break;
		}
	}
	public void setRoot(int n) {
		root = new Note(n);
	}
	public Note getRoot() {
		return root;
	}
	public Note[] getNotes() {
		return notes;
	}
	public String toString() {
		String output = root.toString();
		switch(type) {
		//M
		case 0: output += "Maj: \t";
		break;
		//m
		case 1: output += "min: \t";
		break;
		//7th
		case 2: output += "7th: \t";;
		break;
		//Dim
		case 3: output += "Dim: \t";;
		break;
		//Aug
		case 4: output += "Aug: \t";
		break;
		//M6
		case 5: output += "Maj6: \t";
		break;
		//m6
		case 6: output += "min6: \t";
		break;
		//9th
		case 7: output += "9th: \t";
		break;
		}
		for(int i = 0; i < notes.length; i++) {
			output += notes[i].toString() + "\t";
		}
		return output;
	}
}
