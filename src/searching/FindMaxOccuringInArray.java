package searching;

import java.util.HashMap;
import java.util.Map;

public class FindMaxOccuringInArray {
public static void main(String[] args) {
	int[] arr = {1,2,3,4,9,8,8,8,9,9,7,6,5,4,9};
	HashMap<Integer, Integer> map = new HashMap<>();
	for (int i = 0; i < arr.length; i++) {
		if(map.containsKey(arr[i])){
			map.put(arr[i], map.get(arr[i])+1);
		}else{
			map.put(arr[i], 1);
		}
	}
	int maxOccurence = -1;
	int count = -1;
	for(Map.Entry<Integer, Integer> entry:map.entrySet()){
		if(entry.getValue() > count){
			maxOccurence = entry.getKey();
			count = entry.getValue();
		}
	}
	System.out.println("max occurence element :"+maxOccurence);
}
}
