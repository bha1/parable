package hackerrank.arrays;

import java.util.Arrays;

public class LeftRotation {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int[] newArr = new int[arr.length];
		int pivot = 2;
		int j = 0;
		for(int i = pivot; i<arr.length;i++){
			newArr[j++]=arr[i];
		}
		for(int i = 0; i<pivot;i++){
			newArr[j++]=arr[i];
		}		
		System.out.println(Arrays.toString(newArr));
	}
}
