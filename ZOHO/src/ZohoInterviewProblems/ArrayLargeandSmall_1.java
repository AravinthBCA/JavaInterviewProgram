package ZohoInterviewProblems;

import java.util.*;
import java.io.*;
public class ArrayLargeandSmall_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first array size : ");
		int arr[] = new int[in.nextInt()];
		System.out.println("Enter the first array elements : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = in.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length-1; i=i) {
			if(i!=0) {
				if(arr[i]<arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					i+=2;
				}
			}
			else {
				i++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
