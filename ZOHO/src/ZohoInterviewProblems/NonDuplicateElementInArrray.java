package ZohoInterviewProblems;

import java.util.*;
import java.io.*;

public class NonDuplicateElementInArrray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int arr[] = new int[in.nextInt()];
		int temp=0;
		System.out.println("Enter the array elements: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		System.out.println("Non-Duplicate Element: ");
		for (int i = 0; i < arr.length; i++) {
			temp=0;
			for (int j = 0; j < arr.length; j++) {
				if(i!=j) {
					if(arr[i]==arr[j]) {
						temp=1;
					}
				}
			}
			if(temp==0) {
				System.out.println(arr[i]);
			}
		}
	}

}
