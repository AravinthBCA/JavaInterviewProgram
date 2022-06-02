// Java implementation of above approach
import java.io.*;
import java.util.Arrays;

class RotateMatrix90ClockWise1
{
	
static int N = 4;

// Function to rotate the matrix 90 degree clockwise
static void rotate90Clockwise(int a[][])
{

	// Traverse each cycle
	for (int i = 0; i < N / 2; i++)
	{
		for (int[] is : a) {
			System.out.println(Arrays.toString(is));
		}
		System.out.println("----------------------------------");
		for (int j = i; j < N - i - 1; j++)
		{

			// Swap elements of each cycle
			// in clockwise direction
			int temp = a[i][j]; //1,2,3,6
			a[i][j] = a[N - 1 - j][i]; //13,9,5,10
			a[N - 1 - j][i] = a[N - 1 - i][N - 1 - j]; //16,15,14,11
			a[N - 1 - i][N - 1 - j] = a[j][N - 1 - i]; //4,8,12,7
			a[j][N - 1 - i] = temp;//1,2,3,6
		}
	}
}

// Function for print matrix
static void printMatrix(int arr[][])
{
	for (int i = 0; i < N; i++)
	{
		for (int j = 0; j < N; j++)
		System.out.print( arr[i][j] + " ");
		System.out.println();
	}
}

// Driver code

	public static void main (String[] args)
	{
			int arr[][] = { { 1, 2, 3, 4 },
					      { 5, 6, 7, 8 },
					      { 9, 10, 11, 12 },
					      { 13, 14, 15, 16 } };
	rotate90Clockwise(arr);
	printMatrix(arr);
	}
}

// This code has been contributed by inder_verma.
