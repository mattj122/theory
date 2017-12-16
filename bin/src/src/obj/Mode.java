package obj;

public class Mode {
	int [] steps;
	public Mode() {
		
	}
	/*
	 * 0 = Ionian (Major)
	 * 1 = Dorian
	 * 2 = Phrygian
	 * 3 = Lydian
	 * 4 = Mixolydian
	 * 5 = Aeolian (Minor)
	 * 6 = Locrian
	 */
	public void setModeTo(int n) {
		switch(n) {
		case 0: 
			steps = new int[] {1,1,0,1,1,1,0};
		break;
		case 1: 
			steps = new int[] {1,0,1,1,1,0,1};
		break;
		case 2: 
			steps = new int[] {0,1,1,1,0,1,1};
		break;
		case 3: 
			steps = new int[] {1,1,1,0,1,1,0};
		break;
		case 4: 
			steps = new int[] {1,1,0,1,1,0,1};
		break;
		case 5: 
			steps = new int[] {1,0,1,1,0,1,1};
		break;
		case 6: 
			steps = new int[] {0,1,1,0,1,1,1};
		break;
		
		}
	}
	public int[] getMode(){
		return steps;
	}
	public void print() {
		for(int i = 0; i < steps.length; i ++) {
			System.out.println(steps[i]);
		}
		
	}
}
