package driver;

import obj.*;

public class TesterConsole {
	public static void main(String[] args) {
		/*
		int [] chordTypes = {0,1,1,0,0,1,3};
		chordTypes = incrCT(1, chordTypes);
		Chord[] chords = chordsInKey(new Scale(0, 0));
		Note[] scaleNotes = new Scale(0,0).getScale();
		ProgLoader pl = new ProgLoader();
		int [] chordProg = pl.getChProg(3);
		for(int i = 0; i < chordProg.length; i++) {
			if(chordProg[i] > 7) {
				int tempRoot = scaleNotes[chordProg[i+1]-1].getNoteNum();
				Chord c = new Chord(tempRoot);
				c.setChord(chordProg[i] - 9 - tempRoot);
				System.out.println(c.toString());
				i++;
			}
			else {
				System.out.println(chords[chordProg[i]-1].toString());
			}
		}
		*/
		Scale sc = new Scale(9,1);
		System.out.println("In Key: ");
		for(int i = 0; i < sc.getScale().length; i++) {
			System.out.println(sc.getScale()[i]);
		}
		System.out.println("Out of Key: ");
		for(int i = 0; i < sc.getOutScale().length; i++) {
			System.out.println(sc.getOutScale()[i]);
		}
	}
	public static Chord[] chordsInKey(Scale sc) {
		int [] chordTypes = {0,1,1,0,0,1,3};
		incrCT(sc.getModeNum(), chordTypes);
		Chord[] chords = new Chord[7];
		Note [] scaleNotes = sc.getScale();
		for(int i = 0; i < chords.length; i++) {
			chords[i] = new Chord(scaleNotes[i].getNoteNumWOct());
			chords[i].setChord(chordTypes[i]);
		}
		return chords;
	}
	public static int [] incrCT(int n, int [] chordTypes) {
		int temp = chordTypes[0];
		if(n == 0) {
			return chordTypes;
		}
		for(int i = 0; i < chordTypes.length; i++) {
			if(i+1 == chordTypes.length) {
				chordTypes[i] = temp;
			}
			else {
				chordTypes[i] = chordTypes[i+1];
			}
		}
		return incrCT(n-1, chordTypes);
	}
}
