package searching;

import java.util.HashMap;
import java.util.Map;

class Occurence {
	int position;
	boolean duplicate;

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public boolean isDuplicate() {
		return duplicate;
	}

	public void setDuplicate(boolean duplicate) {
		this.duplicate = duplicate;
	}

}

public class FindRepeatingNumberWhichOccursFirst {
	public static void main(String[] args) {
		int[] arr = { 3, 1, 2, 2, 3 };
		HashMap<Integer, Occurence> hash = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (hash.containsKey(arr[i])) {
				Occurence occ = hash.get(arr[i]);
				if (!occ.isDuplicate()) {
					occ.setDuplicate(true);
				}
				hash.put(arr[i], occ);
			} else {
				Occurence occ = new Occurence();
				occ.setDuplicate(false);
				occ.setPosition(i);
				hash.put(arr[i], occ);
			}
		}
		int position = -1;
		int element = -1;
		for (Map.Entry<Integer, Occurence> entry : hash.entrySet()) {
			
			if(entry.getValue().isDuplicate() && ( (entry.getValue().getPosition() < position) || (position == -1) )){
				position = entry.getValue().getPosition();
				element = entry.getKey();
			}
		}
		
		System.out.println(" first occuring duplicate lement is :"+element +" at "+position);
	}
}
