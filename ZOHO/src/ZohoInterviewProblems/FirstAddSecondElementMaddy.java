package ZohoInterviewProblems;

import java.util.*;
import java.io.*;

public class FirstAddSecondElementMaddy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int arr[] = new int[in.nextInt()];
		int result[] = new int[arr.length];
		int first,second=0,temp=0;
		System.out.println("Enter the array elements: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=in.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			first=0;second=0;temp=0;
			if(i==0) {
				first=arr[i];
				second=arr[i+1];
				temp=first>second?first:second;
			}
			else if(i==arr.length-1) {
				first=arr[i];
				second=arr[i-1];
				temp=first>second?first:second;
			}
			else {
				first=arr[i-1];
				second=arr[i+1];
				temp=first>second?first:second;
			}
			result[i]=temp;
		}
		System.out.println("Result: "+Arrays.toString(result));
	}

}
