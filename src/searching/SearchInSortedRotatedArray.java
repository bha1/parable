package searching;

public class SearchInSortedRotatedArray {
	public static void main(String[] args) {
		int arr[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
		int low = 0;
		int high = arr.length - 1;
		int mid;
		int k = 2;
		while (low <= high) {
			mid = low + (high - low) / 2;
			if (arr[mid] == k) {
				System.out.println("found at : " + mid);
				break;
			}
			if (arr[mid] >= arr[low]) {
				if (arr[mid] >= k && arr[low] <= k) {
					high = mid - 1;
					continue;
				}

				low = mid + 1;
				continue;
			}

			if (arr[mid] <= k && arr[high] >= k) {
				low = mid + 1;
				continue;
			}

			high = mid - 1;
			continue;
		}
	}
}
