import java.util.*;
class Sort {
	void bubbleSort(int a[], int n){
		int i,j,temp;
		for(i = 0; i < n; i++)
			for(j = 0; j < n -1 -i;  j++)
				if(a[j] > a[j+1]){
					temp = a[j];
					a[j] = a[j +1];
					a[j+1] = temp;
				}
	}
}

public class bubble{
	public static void main(String[] args){
		Sort obj = new Sort();
        	Scanner sc = new Scanner(System.in);
        	System.out.print("Enter the number of elements in the array: ");
        	int n = sc.nextInt();
        	int arr[] = new int[n];
       	 	System.out.println("Enter the elements: ");
        	int i;
        	for(i = 0; i < n; i++){
            		arr[i] = sc.nextInt();
        	}
 		obj.bubbleSort(arr, n);
 		for(i = 0; i < n; i++){
            		System.out.print(arr[i] + " ");
		}
	}
}
