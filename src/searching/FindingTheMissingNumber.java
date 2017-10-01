package searching;

public class FindingTheMissingNumber {
public static void main(String[] args) {
	int[] arr = {1,2,3,4,5,6,7,9,10,11,12};
	int xorArr = arr[0];
	for (int i = 1; i < arr.length; i++) {
		xorArr ^= arr[i];
	}
	int xorN = 1;
	for (int i = 2; i <= arr[arr.length-1]; i++) {
		xorN ^= i;
	}	
	System.out.println(xorArr^xorN);
}
}
