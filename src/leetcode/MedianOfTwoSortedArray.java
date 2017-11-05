package leetcode;
//median-of-two-sorted-arrays

import java.util.Scanner;

/*There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

Example 1:

nums1 = [1, 3]
nums2 = [2]

The median is 2.0

Example 2:

nums1 = [1, 2]
nums2 = [3, 4]

The median is (2 + 3)/2 = 2.5
*/
public class MedianOfTwoSortedArray {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int lengthArrA = scan.nextInt();
	int lengthArrB = scan.nextInt();
	int arrayA[] = new int[lengthArrA];
	int arrayB[] = new int[lengthArrB];
	int loop = 0;
	while(loop<lengthArrA){
		arrayA[loop] = scan.nextInt();
		loop++;
	}
	loop=0;
	while(loop<lengthArrB){
		arrayB[loop] = scan.nextInt();
		loop++;
	}
	
	boolean isEven = false;
	int halfPoint = (lengthArrA+lengthArrB)/2;
	if((lengthArrB+lengthArrA)%2 == 0){
		isEven = true;
	}
	int positionInArrayA = 0;
	int positionInArrayB = 0;
	int median = 0;
	int preMedian = 0;
	for(loop = 0;loop<=halfPoint;loop++){
		preMedian = median;
		if(positionInArrayA==lengthArrA){
			median = arrayB[positionInArrayB++];
		}else if(positionInArrayB==lengthArrB){
			median = arrayA[positionInArrayA++];
		}else if(arrayA[positionInArrayA]>arrayB[positionInArrayB]){
			median = arrayB[positionInArrayB++];
		}else{
			median = arrayA[positionInArrayA++];
		}
	}
	if(isEven){
		System.out.println((float)(median+preMedian)/2);
	}else{
		System.out.println((float)median);
	}
}
}
