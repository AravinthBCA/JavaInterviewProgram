import java.util.*;
import java.io.*;
//https://www.enjoyalgorithms.com/blog/rotate-a-matrix-by-90-degrees-in-an-anticlockwise-direction
//Step 1 : Find the transpose of the matrix.
//Step 2 : Reverse the columns of the transpose matrix.
public class RotateMatrix90AntiClock2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{1,2,3},
				       {4,5,6},
				       {7,8,9}};
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		int column = 0;
		while(column < arr.length) {
			int i=0,j=arr.length-1;
			while(i<j) {
				int temp = arr[i][column];
				arr[i][column] = arr[j][column];
				arr[j][column] = temp;
				i++;
				j--;
			}
			column++;	
		}
		for (int[] is : arr) {
			System.out.println("output : "+Arrays.toString(is));
		}
	}

}
