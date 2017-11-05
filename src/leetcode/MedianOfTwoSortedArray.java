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
	int n = scan.nextInt();
	int m = scan.nextInt();
	int arr[] = new int[n];
	int krr[] = new int[m];
	int loop = 0;
	while(loop<n){
		arr[loop] = scan.nextInt();
		loop++;
	}
	loop=0;
	while(loop<m){
		krr[loop] = scan.nextInt();
		loop++;
	}
	
	boolean isEven = false;
	int halfPoint = (n+m)/2;
	if((m+n)%2 == 0){
		isEven = true;
	}
	int a = 0;
	int b = 0;
	int median = 0;
	int preMedian = 0;
	for(loop = 0;loop<=halfPoint;loop++){
		
		if(a==n){
			preMedian = median;
			median = krr[b++];
		}else if(b==n){
			preMedian = median;
			median = arr[a++];
		}else if(arr[a]>krr[b]){
			preMedian = median;
			median = krr[b++];
		}else{
			preMedian = median;
			median = arr[a++];
		}
	}
	if(isEven){
		System.out.println((float)(median+preMedian)/2);
	}else{
		System.out.println((float)median);
	}
}
}
