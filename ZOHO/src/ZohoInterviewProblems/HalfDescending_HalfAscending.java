package ZohoInterviewProblems;

import java.util.*;
import java.io.*;

//Question -> 7

public class HalfDescending_HalfAscending {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your array size : ");
		int arr[] ={1,3,5,2,4,6};
// 		System.out.println("Enter the array elements : "); // 1 2 3 4 5 6  // 6 5 4 1 2 3
// 		for (int i = 0; i < arr.length; i++) {
// 			arr[i] = in.nextInt();
// 		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		for(int i=0,j=arr.length-1; i<arr.length; i++){
		    int temp = arr[i];
		    arr[i] = arr[j];
		    for(int k=arr.length/2; true; k++){
		        int temp1 = arr[k+1];
		        arr[k+1] = arr[k];
		        arr[arr.length-1] = temp1;
		        arr[k] = temp;
		        break;
		    }
		    arr[arr.length/2] = temp;
		    System.out.println(Arrays.toString(arr));
		}
		for (int i = arr.length/2; i < arr.length; i++) {
			for (int j = arr.length/2; j < arr.length-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
