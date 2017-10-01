package searching;

public class BinarySearchIterative {
public static void main(String[] args) {
	int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
	int low = 0;
	int high = arr.length - 1;
	int data = -10;
	while(low <= high){
		int mid = low + (high-low)/2;
		if(arr[mid] == data){
			System.out.println("found "+data+" at :" + mid);
			break;
		}else if(arr[mid] < data){
			low = mid+1;
		}else{
			high = mid-1;
		}
		
	}
	System.out.println("found "+data+" at :" + -1);
}
}
