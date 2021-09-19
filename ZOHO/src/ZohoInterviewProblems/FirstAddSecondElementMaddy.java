package ZohoInterviewProblems;

import java.util.*;
import java.io.*;

public class FirstAddSecondElementMaddy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int arr[] = new int[in.nextInt()];
		System.out.println("Enter the array elements: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=in.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if(i==0) {
				arr[i]=arr[i]>arr[i+1]?arr[i]:arr[i+1];
			}
			else if(i==arr.length-1) {
				arr[i]=arr[i]>arr[i-1]?arr[i]:arr[i-1];
			}
			else {
				arr[i]=arr[i-1]>arr[i+1]?arr[i-1]:arr[i+1];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
