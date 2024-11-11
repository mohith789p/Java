import java.util.*;

public class Search {
	public static int binarySearch(int[] a, int low, int high, int key) {
		while (low <= high) {
			int mid = (low + high) / 2;
			if (a[mid] == key)
				return mid;
			else if (a[mid] < key)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];

		System.out.println("Enter the elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);

		System.out.print("Enter the key: ");
		int key = sc.nextInt();

		int pos = binarySearch(arr, 0, n - 1, key);

		if (pos == -1)
			System.out.println("Key is not found.");
		else
			System.out.println("Key is found at index " + pos);

		sc.close();
	}
}
