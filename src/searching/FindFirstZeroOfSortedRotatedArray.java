package searching;

public class FindFirstZeroOfSortedRotatedArray {
	public static void main(String[] args) {
		int arr1[] = { 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 };
		int arr[] = { 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0};
		if(arr[0] == 0){
			System.out.println("found at position :"+0);
			return;
		}
		int low = 0;
		int high =2;
		int n = arr.length-1;
		while(low<=high){
			if(arr[high]!=0){
				low = high;
				high = high*2;
			}
			if(arr[low++] == 0){
				System.out.println("found at :"+(low-1));
				return;
			}
			if(high > n){
				high = n;
			}
		}
	}
}
