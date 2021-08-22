// Reference: https://manimaran96.wordpress.com/2019/03/03/zoho-2nd-round-interview-questions-programming-round-2-mar-2019/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
 
public class ArraySortBasedFrequency 
{
	//Function that return the index
	//upto all the array elements are
	//updated.
	static int sortByFreq(Integer []arr, int n)
	{

		// Initialise maxE = -1
		int maxE = -1;

		// Find the maximum element of
		// arr[]
		for (int i = 0; i < n; i++) {
			maxE = Math.max(maxE, arr[i]);
		}

		// Create frequency array freq[]
		int freq[] = new int[maxE + 1];

		// Update the frequency array as
		// per the occurence of element in
		// arr[]
		for (int i = 0; i < n; i++) {
			freq[arr[i]]++;
		}

		// Initialise cnt to 0
		int cnt = 0;

		// Traversing freq[]
		for (int i = 0; i <= maxE; i++) {

			// If freq of an element is
			// greater than 0 update the
			// value of arr[] at index cnt
			// & increment cnt
			if (freq[i] > 0) {

				int value = 100000 - i;
				arr[cnt] = 100000 * freq[i] + value;
				cnt++;
			}
		}

		// Return cnt
		return cnt;
	}

	//Function that print array arr[]
	//elements in sorted order
	static void printSortedArray(Integer []arr, int cnt)
	{

		// Traversing arr[] till index cnt
		for (int i = 0; i < cnt; i++) {

			// Find frequency of elements
			int frequency = arr[i] / 100000;

			// Find value at index i
			int value = 100000 - (arr[i] % 100000);

			// Traversing till frequency
			// to print value at index i
			for (int j = 0; j < frequency; j++) {
				System.out.print(value + " ");
			}
		}
	}

	//Driver code
	public static void main(String[] args)
	{

		Integer arr[] = { 4, 4, 5, 6, 4, 2, 2, 8, 5 };

		// Size of array arr[]
		int n = arr.length;
		System.out.println("your input: "+Arrays.toString(arr)+"\n");

		// Function call to get cnt
		int cnt = sortByFreq(arr, n);

		// Sort the arr[] in decreasing order
		Arrays.sort(arr, Collections.reverseOrder());

		// Function that prints elements
		// in decreasing order
		printSortedArray(arr, cnt);

	}

}
