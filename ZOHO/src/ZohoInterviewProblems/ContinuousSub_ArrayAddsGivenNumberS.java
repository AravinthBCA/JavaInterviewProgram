package ZohoInterviewProblems;
import java.util.*;
import java.io.*;

class ContinuousSub_ArrayAddsGivenNumberS {
	int subArraySum(int arr[], int n, int sum)
	{
		int curr_sum = arr[0], start = 0, i;
		for (i = 1; i <= n; i++) {
			while (curr_sum > sum && start < i - 1) {
				curr_sum = curr_sum - arr[start];
				start++;
			}
			if (curr_sum == sum) {
				int p = i - 1;
				System.out.println(
					"Sum found between indexes " + (start+1)
					+ " and " + (p+1));
				System.out.println("-----------------------------------------------------");
				return 1;
			}

			// Add this element to curr_sum
			if (i < n)
				curr_sum = curr_sum + arr[i];
		}

		System.out.println("No subarray found");
		return 0;
	}

	public static void main(String[] args)
	{
		ContinuousSub_ArrayAddsGivenNumberS arraysum = new ContinuousSub_ArrayAddsGivenNumberS();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of test cases: ");
		int testCases = in.nextInt();
		for (int i = 0; i < testCases; i++) {
			System.out.println("Enter the size of array and sum of sub-array: ");
			int arr[] = new int[in.nextInt()];
			int sum = in.nextInt();
			System.out.println("Enter the array elements: ");
			for (int j = 0; j < arr.length; j++) {
				arr[j] = in.nextInt();
			}
			arraysum.subArraySum(arr, arr.length, sum);
		}
	}
}

