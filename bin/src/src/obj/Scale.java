package obj;

public class Scale {
	Mode m = new Mode();
	Note[] scaleNotes = new Note [8];
	Note key;
	public Scale() {
		
	}
	public void setKey(int n) {
		key = new Note(n);
	}
	public Note getKey() {
		return key;
	}
	public void setMode(int n) {
		m.setModeTo(n);
		setScale();
	}
	public Note[] getScale() {
		return scaleNotes;
	}
	public void setScale() {
		scaleNotes[0] = key;
		scaleNotes[7] = new Note(key.getNoteNum() + 12);
		int num = key.getNoteNum();
		for(int i = 1; i < scaleNotes.length - 1; i++) {
			if(m.getMode()[i -1] == 1) {
				num += 2;
			}
			else {
				num++;
			}
			scaleNotes[i] = new Note(num);
		}
	}
}
