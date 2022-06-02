import java.util.*;
import java.io.*;

//https://www.enjoyalgorithms.com/blog/rotate-a-matrix-by-90-degrees-in-an-anticlockwise-direction
//the first row in the input matrix : 1 2 3 4
//the first column in the output matrix : 4 3 2 1
//Input = [1 2 3][4 5 6][7 8 9]
//Output = [3 6 9] [2 5 8] [1 4 7]

public class RotateMatrix90AntiClock1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the row and column limit : ");
		int arr[][] = new int[in.nextInt()][in.nextInt()];
		System.out.println("Enter the array elements : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		for (int[] i : arr) {
			System.out.println("Input array : "+Arrays.toString(i));
		}
		int output[][] = new int[arr.length][arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				output[arr.length-j-1][i] = arr[i][j];
			}
		}
		System.out.println("");
		for (int[] i : output) {
			System.out.println("Output array : "+Arrays.toString(i));
		}
	}
}
