package searching;

public class BinarySearchRecursive {
public static void main(String[] args) {
	int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
	System.out.println("found 8 at : "+BinarySearch(arr, 0, arr.length-1, 8));
	System.out.println("found 150 at : "+BinarySearch(arr, 0, arr.length-1, 150));
	System.out.println("found -10 at : "+BinarySearch(arr, 0, arr.length-1, -10));
}
public static int BinarySearch(int[] arr, int low, int high, int data){
	if(!(low <= high)){
		return -1;
	}
	int mid = low + (high-low)/2;
	if(arr[mid] == data) return mid;
	else if(arr[mid]<data){
		return BinarySearch(arr, mid+1, high, data);
	}else{
		return BinarySearch(arr, low, mid-1, data);
	}
}
}
