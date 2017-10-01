package searching;

import java.util.HashMap;

public class FindTwoElementsWithSum {
public static void main(String[] args) {
	int[] arr = {1,4,2,6,9,8,0,3,7,8};
	HashMap<Integer, Integer> map = new HashMap<>();
	int givenNumber = 13;
	for(int i =0; i<arr.length-1;i++){
		if(map.containsKey(givenNumber - arr[i])){
			System.out.println("pair that adds up to the sum :"+arr[i]+":"+(givenNumber-arr[i]));
		}else{
			map.put(arr[i], arr[i]);
		}
	}
}
}
