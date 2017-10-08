package searching;

public class CountOccurenceOfElement {
	
	public static int binarySearch(int[] arr, int low, int high, int data){
		int pivot = low + (high-low)/2;
		int foundAt = -1;
			if(arr[pivot] == data){
				foundAt = pivot;
			}else if (data < arr[pivot]){
				foundAt = binarySearch(arr, low, pivot-1, data);
			}else if(arr[pivot] < data){
				foundAt = binarySearch(arr, pivot+1, high, data);
			}
		return foundAt;
	}
	
	public static int countDuplicate(int[] arr, int data){
		int occurence = 0;
		int low = 0;
		int high = arr.length-1;
		int foundAt = binarySearch(arr, low, high, data);
		if(foundAt > -1){
			occurence++;
			int i = foundAt-1;
			while(i>=low){
				if(arr[i]==data){
					occurence++;
					i--;
				}else{
					break;
				}
			}
			i = foundAt+1;
			while(i<=high){
				if(arr[i]==data){
					occurence++;
					i++;
				}else{
					break;
				}
			}
		}
		return occurence;
	}
	
	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 2, 3, 3, 4, 5, 5, 5, 6, 7, 8, 8, 8, 8, 9 };
		System.out.println(countDuplicate(arr,8));

	}
}
