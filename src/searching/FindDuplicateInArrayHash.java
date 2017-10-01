package searching;

import java.util.Hashtable;
import java.util.Map;

public class FindDuplicateInArrayHash {
	public static void main(String[] args) {
		Hashtable<Integer, Integer> hash = new Hashtable<>();
		int[] arr = {1,2,3,4,9,8,7,6,5,4,9};
		for (int i = 0; i < arr.length; i++) {
			if(hash.containsKey(arr[i])){
				hash.put(arr[i], hash.get(arr[i])+1);
			}else{
				hash.put(arr[i], 1);
			}
		}
		for(Map.Entry<Integer, Integer> entry : hash.entrySet()){
			if(entry.getValue()>1){
				System.out.println("Duplicate element : "+entry.getKey());
			}
		}
	}
}
