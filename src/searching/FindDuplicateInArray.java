package searching;

import java.util.Arrays;

public class FindDuplicateInArray {
public static void main(String[] args) {
	int[] arr = {1,2,3,4,9,8,7,6,5,4,9};
	if(arr.length<2){
		System.out.println("no duplicates found.");
		return;
	}
	Arrays.sort(arr);
	boolean flag = false;
	for(int i = 0; i<arr.length-1;i++){
		if(arr[i] == arr[i+1]){
			System.out.println("found duplicate of : "+arr[i]);
			flag = true;
		}
	}
	if(!flag){
		System.out.println("No duplicates found.");
	}
	
}
}
