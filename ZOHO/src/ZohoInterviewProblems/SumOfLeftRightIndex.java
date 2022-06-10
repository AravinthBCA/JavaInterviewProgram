package ZohoInterviewProblems;

import java.util.*;
import java.io.*;

public class SumOfLeftRightIndex {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of test cases : ");
		int t= in.nextInt();
		for (int k = 0; k <t ; k++) {
			System.out.println("Enter the array size : ");
			int arr[] = new int[in.nextInt()];
			System.out.println("Enter the array elements : ");
			for (int i = 0; i < arr.length; i++) {
				arr[i] = in.nextInt();
			}
			int leftSum = 0, rightSum = 0;
			for (int i = 0; i < arr.length; i++) {
				leftSum=0;rightSum=0;	
				for (int j = 0; j < i; j++) {
					leftSum += arr[j];
				}
				for (int j = i+1; j < arr.length; j++) {
					rightSum += arr[j];
				}
				if (leftSum == rightSum) {
					System.out.println("Both the sides are same sum : "+arr[i]);
					System.out.println("Left Side : " + leftSum);
					System.out.println("Right Side : " + rightSum);
				}
			}
			System.out.println("Both the side are not equal....");
		}
	}
}
