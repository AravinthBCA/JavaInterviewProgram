package ZohoInterviewProblems;

import java.util.*;
import java.io.*;

public class MoveZeroAtLast {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int arr[] = new int[in.nextInt()]; //{1,2,0,3,0,5}
		System.out.println("Enter the array elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==0) {
				for (int j = i+1; j < arr.length; j++) {
					if(arr[j]!=0) {
						arr[i] = arr[j];
						arr[j] = 0;
						break;
					}
				}
			}
		}
		System.out.println("Result : "+Arrays.toString(arr));		
	}

}
