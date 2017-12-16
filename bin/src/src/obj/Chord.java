package obj;

public class Chord {
	Note root; 
	Note [] notes;
	public Chord() {
		
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
		switch(c) {
		//M
		case 0: notes = new Note[] {root, new Note(root.getNoteNum() + 4), new Note(root.getNoteNum() + 7)};
		break;
		//m
		case 1: notes = new Note[] {root, new Note(root.getNoteNum() + 3), new Note(root.getNoteNum() + 7)};
		break;
		//7th
		case 2: notes = new Note[] {root, new Note(root.getNoteNum() + 4), new Note(root.getNoteNum() + 7), new Note(root.getNoteNum() + 10)};
		break;
		//Dim
		case 3: notes = new Note[] {root, new Note(root.getNoteNum() + 3), new Note(root.getNoteNum() + 6), new Note(root.getNoteNum() + 9)};
		break;
		//Aug
		case 4: notes = new Note[] {root, new Note(root.getNoteNum() + 4), new Note(root.getNoteNum() + 8)};
		break;
		//M6
		case 5: notes = new Note[] {root, new Note(root.getNoteNum() + 4), new Note(root.getNoteNum() + 7), new Note(root.getNoteNum() + 9)};
		break;
		//m6
		case 6: notes = new Note[] {root, new Note(root.getNoteNum() + 3), new Note(root.getNoteNum() + 7), new Note(root.getNoteNum() + 9)};
		break;
		//9th
		case 7: notes = new Note[] {root, new Note(root.getNoteNum() + 2), new Note(root.getNoteNum() + 4), new Note(root.getNoteNum() + 7), new Note(root.getNoteNum() + 10)};
		break;
		default: notes = null;
		break;
		}
	}
	public void setRoot(int n) {
		root = new Note(n);
	}
	public Note[] getNotes() {
		return notes;
	}
}
