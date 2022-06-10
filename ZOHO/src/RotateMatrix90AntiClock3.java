import java.util.*;
import java.io.*;

public class RotateMatrix90AntiClock3 {
	
	public static void rotateMatrix(int arr[][]) {
		System.out.println("Input  : ");
		for (int[] is : arr) {
			System.out.println(Arrays.toString(is));
		}
		
		int n = arr.length;
		for (int i = 0; i < arr.length/2; i++) {
			for (int j = i; j<n-i-1; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][n-1-i];
				arr[j][n-1-i] = arr[n-1-i][n-1-j];
				arr[n-1-i][n-1-j] = arr[n-1-j][i];
				arr[n-1-j][i] = temp;
			}
		}
		System.out.println("------------------------------");
		System.out.println("Output : ");
		for (int[] is : arr) {
			System.out.println(Arrays.toString(is));
		}
	}
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int arr[][] = {{1,2,3,4},
				     {5,6,7,8},
				     {9,10,11,12},
				     {13,14,15,16}};
		rotateMatrix(arr);
	}
}
