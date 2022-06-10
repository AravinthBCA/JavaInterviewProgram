package ZohoInterviewProblems;

import java.util.*;
import java.io.*;

public class SumOfArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int arr1[] = new int[in.nextInt()];
		int arr2[] = new int[in.nextInt()];
		System.out.println("Enter first array elements : ");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = in.nextInt();
		}
		System.out.println("Enter second array elements : ");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = in.nextInt();
		}
		int prevSum=Integer.MAX_VALUE;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if(arr1[i]+arr2[j]<prevSum && i!=j) {
					prevSum=arr1[i]+arr2[j];
				}
			}
		}
		System.out.println("Result : "+prevSum);
	}
}






