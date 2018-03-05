package obj;

public class Mode {
	int [] steps;
	int [] invSteps;
	int modeNum;
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
		modeNum = n;
		int[]stepsTemp = {2,2,1,2,2,2,1};
		incrSt(n, stepsTemp);
		steps = stepsTemp;
	}
	private int [] incrSt(int n, int[] stepsT) {
		int temp = stepsT[0];
		if(n <= 0) {
			return stepsT;
		}
		for(int i = 0; i < stepsT.length; i++) {
			if(i+1 == stepsT.length) {
				stepsT[i] = temp;
			}
			else {
				stepsT[i] = stepsT[i+1];
			}
		}
		return incrSt(n-1, stepsT);
	}
	public int[] getMode(){
		return steps;
	}
	public void print() {
		for(int i = 0; i < steps.length; i ++) {
			System.out.println(steps[i]);
		}	
	}
	public int getModeNum() {
		return modeNum;
	}
	public int[] getInverse() {
		return invSteps;
	}
}
