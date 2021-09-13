package ZohoInterviewProblems;

import java.util.*;
import java.io.*;
public class Z_Traverse_Matrix {

	public static void printZform(int arr[][],int n) {
		int i=0,j,k;
		boolean flag=true;
		for (j = n-1; j >=0; j--) {
			System.out.print(arr[i][j]+" ");
		}
		if(n>2) {
		k=n-1;
		for (i = 1; i <n-1; i++) {
			for (j = i; j >=i ; j--) {
					System.out.print(arr[i][j]+" ");
			}
			k++;
			System.out.println();
		}
		i=n-1;
		for (j = n-1;  j>=0; j--) {
			System.out.print(arr[i][j]+" ");
		}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the array row and column size: ");
//		int arr[][] ={{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6}};
		int arr[][] = new int[in.nextInt()][in.nextInt()];
		System.out.println("Enter array elements: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j]=in.nextInt();
			}
		}
		System.out.println("Z Traverse: ");
		printZform(arr,arr.length);
	}

}
