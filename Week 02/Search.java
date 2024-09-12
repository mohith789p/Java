import java.util.*;

public class Search {
	public static int binarySearch(int a[], int n, int key) {
		int low = 0;
		int high = n - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (a[mid] == key)
				return mid;
			else if (a[mid] < key)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements: ");
		int i;
		for (i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the key: ");
		int key = sc.nextInt();
		;
		int pos = binarySearch(arr, n, key);
		if (pos == -1)
			System.out.println("key is not found.");
		else
			System.out.println("key is found at " + pos);
		sc.close();
	}
}
