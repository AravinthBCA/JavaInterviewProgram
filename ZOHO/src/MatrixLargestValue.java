// Reference: https://manimaran96.wordpress.com/2019/03/03/zoho-2nd-round-interview-questions-programming-round-2-mar-2019/

import java.util.*;
import java.io.*;

public class MatrixLargestValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the row and column size: ");
		int arr[][] = new int[in.nextInt()][in.nextInt()];
//		int arr[][] = {{1,2,4},{2,6,9},{8,3,7}};
		System.out.println("Enter the array elements: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j]=in.nextInt();
			}
		}
		System.out.println("Enter the find x and y value: ");
		int x = in.nextInt();
		int y = in.nextInt();
		int value = arr[x][y];
		int top=0;
		if(x!=0) {
			top = arr[x-1][y];
		}
	   
		int right = arr[x][y+1], left = arr[x][y-1], down = arr[x+1][y];
		if(x!=0) {
			if(top > right && top > down && top > left) {
				arr[x][y] = top;
			}
		}
		else if(down > right && down > top && down > left) {
			arr[x][y] = down;
		}
		else if(right > down && right > top && right > left) {
			arr[x][y] = right;
		}
		else {
			arr[x][y] = left;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

}
