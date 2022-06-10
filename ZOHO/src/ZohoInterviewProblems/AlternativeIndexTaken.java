package ZohoInterviewProblems;

import java.util.*;
import java.io.*;

public class AlternativeIndexTaken {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first array size : ");
		int arr1[] = new int[in.nextInt()];
		System.out.println("Enter the second array size : ");
		int arr2[] = new int[in.nextInt()];
		System.out.println("Enter the first array elements : ");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = in.nextInt();
		}
		System.out.println("Enter the second array elements : ");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = in.nextInt();
		}
		solution(arr1,arr2,arr1.length,arr2.length);
	}
	public static void solution(int arr1[],int arr2[],int n,int m) {
		boolean flag=true;
		int i=0,j=0,index=0;
		int result[] = new int[arr1.length+arr2.length];
		while(i<n&&j<m) {
			result[index++]=arr1[i++];
			result[index++]=arr2[j++];
		}
		while(i<n) {
			result[index++]=arr1[i++];
		}
		while(j<m) {
			result[index++]=arr2[j++];
		}
		System.out.println("Result : "+Arrays.toString(result));
	}

}








