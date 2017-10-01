package searching;

public class OrderedListSearch {
	public static void main(String[] args) {
		int[] arr = {2,3,4,5,6,7,9,10};
		for(int i = 0;i<arr.length;i++){
			if(arr[i]==8){
				System.out.println("found at : "+i);
				break;
			}
			
			if(arr[i]>8){
				break;
			}
		}
	}
}
