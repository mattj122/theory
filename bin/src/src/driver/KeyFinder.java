package driver;

import java.util.ArrayList;
import java.util.Scanner;
import obj.*;

public class KeyFinder {
	public ArrayList<Scale> inKey = new ArrayList<Scale>();
	public static void main(String[] args) {
		KeyFinder kF = new KeyFinder(new Scanner(System.in));
	}
	public KeyFinder(Scanner s) {
		ArrayList<Note>searchNotes = new ArrayList<Note>();
		String input = s.nextLine();
		for(int i = 0; i < input.length(); i++) {
			if(input.substring(i, i+1).equals(",")) {
				
			}
			else {
				if(!(input.substring(i, i+1).equals("#"))) {
					int x = getNoteFromNum(input.substring(i, i+1));
					if(input.substring(i, i+1).equals("#")) {
						x++;
					}
					searchNotes.add(new Note(x));
				}
			}
		}
		search(searchNotes);
	}
	public void search(ArrayList<Note> arr) {
		Scale sc;
		Note [] scaleNotes;
		
		for(int i = 0; i < 7; i++) {
			for(int j = 0; j < 7; j++) {
				sc = new Scale(i,j);
				scaleNotes = sc.getScale();
				for(int k = 0; k < scaleNotes.length; k++) {
					
				}
			}
		}
	}
	public int getNoteFromNum(String s) {
		switch(s) {
		case "C": return 0;
		case "D": return 2;
		case "E": return 4;
		case "F": return 5;
		case "G": return 7;
		case "A": return 9;
		case "B": return 11;
		default: return -1;
		}
	}
}
