package obj;

public class Scale {
	Mode m = new Mode();
	Note[] scaleNotes = new Note [8];
	Note key;
	Note [] outScale = new Note[5];
	public Scale() {
		
	}
	public Scale(int n, int m) {
		setKey(n);
		setMode(m);
	}
	public void setKey(int n) {
		key = new Note(n);
	}
	public Note getKey() {
		return key;
	}
	public void setMode(int n) {
		m.setModeTo(n);
		setScale(scaleNotes, m.getMode());
		setOutScale(scaleNotes, outScale);
	}
	public Note[] getScale() {
		return scaleNotes;
	}
	public void setScale(Note[] scale, int[] mode) {
		scale[0] = key;
		for(int i = 0; i < scale.length-1; i++) {
			int num;
			num = mode[i];
			scale[i+1] = new Note(scale[i].getNoteNum()+num);
		}
	}
	public void setOutScale(Note[] scale, Note[] outScale) {
		int count = 0; 
		for(int i = key.getNoteNum(); i < key.getNoteNum()+13; i++) {
			for(int j = 0; j < scale.length; j++) {
				if(i == scale[j].getNoteNum()) {
				}
				else {
					outScale[count] = new Note(i);
				}
			}
		}
	}
	public Note[] getOutScale() {
		return outScale;
	}
	public int getModeNum() {
		return m.getModeNum();
	}
}
