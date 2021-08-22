// Reference: https://manimaran96.wordpress.com/2019/03/03/zoho-2nd-round-interview-questions-programming-round-2-mar-2019/

import java.util.*;
import java.io.*;

public class MatrixLargestValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the row and column size: ");

//		int arr[][] = new int[in.nextInt()][in.nextInt()];
		int arr[][] = {{1,2,4},{2,6,9},{8,3,7}};
		System.out.println("Enter the array elements: ");
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				arr[i][j]=in.nextInt();
//			}
//		}

		int arr1[][] = new int[in.nextInt()][in.nextInt()];
//		int arr[][] = {{1,2,4},{2,6,9},{8,3,7}};
		System.out.println("Enter the array elements: ");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				arr1[i][j]=in.nextInt();
			}
		}

		System.out.println("Enter the find x and y value: ");
		int x = in.nextInt();
		int y = in.nextInt();
		int value = arr1[x][y];
		int top=0;
		if(x!=0) {
			top = arr1[x-1][y];
		}
	   
		int right = arr1[x][y+1], left = arr1[x][y-1], down = arr1[x+1][y];
		if(x!=0) {
			if(top > right && top > down && top > left) {
				arr1[x][y] = top;
			}
		}
		else if(down > right && down > top && down > left) {
			arr1[x][y] = down;
		}
		else if(right > down && right > top && right > left) {
			arr1[x][y] = right;
		}
		else {
			arr1[x][y] = left;
		}
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				System.out.print(arr1[i][j]);
			}
			System.out.println();
		}
	}

}
