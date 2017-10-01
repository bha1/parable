package searching;

public class UnorderedLinearSearch {
	public static void main(String[] args) {
		int find = 8;
		int[] arr = { 2, 5, 4, 8, 9, 1, 6, 11 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == find) {
				System.out.println("found at : "+i);
			}
		}
		
	}
}
