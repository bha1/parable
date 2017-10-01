package searching;

import java.util.Arrays;

public class SumClosestToZero {
	public static void main(String[] args) {
		int[] arr = {1,60,-10,80,-85,70};
		Arrays.sort(arr);
		int i = 0;
		int j = arr.length - 1;
		int smallestNegative = Integer.MIN_VALUE;
		int biggestPositive = Integer.MAX_VALUE;
		int temp;
		while (i < j) {
			temp = arr[i] + arr[j];
			if (temp > 0) {
				if (temp < biggestPositive) {
					biggestPositive = temp;
				}
				j--;
			} else if (temp < 0) {
				if (temp > smallestNegative) {
					smallestNegative = temp;
				}
				i++;
			} else if(temp == 0){
				System.out.println("sum zero for :" + arr[i] + " " + arr[j]);
				return;
			}
		}
		System.out.println("nearest to zero : "
				+ (Math.abs(smallestNegative) > biggestPositive ? biggestPositive : smallestNegative));
	}
}
