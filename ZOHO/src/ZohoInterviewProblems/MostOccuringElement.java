package ZohoInterviewProblems;
import java.util.*;
import java.io.*;

public class MostOccuringElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int arr[] = new int[in.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
	 // Sort the array
		for (int i = 0; i < arr.length; i++) {
			int temp;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Sorted array: "+Arrays.toString(arr));
		int max_count = 1, res = arr[0],count=1;
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]==arr[i-1]) {
				count++;
			}
			else {
				if(count>=max_count) {
					max_count=count;
					res=arr[i-1];
				}
				count=1;
			}
		}
		if(count==1) {
			System.out.println(-1);
		}
		else {
			if(count>max_count) {
				max_count=count;
				res=arr[arr.length-1];
			}
			System.out.println(res);
		}
	}

}
