import java.util.Arrays;

public class MergeArrayWithourExtraSpaces {
	
	// Function to merge two arrays
	static void merge(int arr1[],int m,int arr2[], int n)
	{
		int i = 0, j = 0, k = m - 1;
		while (i <= k && j < n) {
			if (arr1[i] < arr2[j])
				i++;
			else {
				int temp = arr2[j];
				arr2[j] = arr1[k];
				arr1[k] = temp;
				j++;
				k--;
			}
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
	}

	public static void main(String[] args)
	{
		int arr1[] = new int[] { 0, 3, 9, 20, 15, 1 };
		int arr2[] = new int[] { 1, 2, 8, 13 };
		merge(arr1,arr1.length,arr2,arr2.length);
		System.out.print("After Merging \nFirst Array: ");
		System.out.println(Arrays.toString(arr1));
		System.out.print("Second Array: ");
		System.out.println(Arrays.toString(arr2));
	}
}
