package obj;

import java.util.ArrayList;

public class ProgLoader {
	ArrayList<int []> mainList = new ArrayList<int []>();
	public ProgLoader() {
		loadArrList();
	}
	public int[] getChProg(int n) {
		return mainList.get(n-1);
	}
	public void loadArrList() {
		mainList.add(new int[]{1,20,5,6,6,1,10,5,4,5});
		mainList.add(new int[]{6,4,1,5});
		mainList.add(new int[]{1,16,4,5,4});
	}
}
