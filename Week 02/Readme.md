# Exercise - 2

> ### a) Write a Java program to search for an element in a given list of elements using the binary search mechanism.

## Code

```java
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

```

## Output

```text
Enter the number of elements in the array: 5
Enter the elements:
10 20 30 40 50
Enter the key: 40
Key is found at index 3
```

> ### b) Write a Java program to sort a given list of elements using the bubble sort algorithm.

## Code

```java
import java.util.*;

class Sort {
    private int[] a;

    public void getValues(int[] a) {
                this.a = a;
    }

    void bubbleSort() {
        int i, j, temp;
        int n = a.length;
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
}

public class Bubble {
    public static void main(String[] args) {
        Sort obj = new Sort();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        obj.getValues(arr);
        obj.bubbleSort();

        System.out.println("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}

```

## Output

```text
Enter the number of elements in the array: 5
Enter the elements:
20 78 18 92 10
Sorted array:
10 18 20 78 92
```

> ### c) Write a JAVA program using String Buffer to delete, remove character.

## Code

```java
public class Buffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello World");
        System.out.println("Original: " + stringBuffer);
        stringBuffer.delete(5, 12);
        System.out.println("After deletion: " + stringBuffer);
        stringBuffer.deleteCharAt(4);
        System.out.println("After Removing: " + stringBuffer);
    }
}

```

## Output

```text
Original: Hello World
After deletion: Hello
After Removing: Hell
```
