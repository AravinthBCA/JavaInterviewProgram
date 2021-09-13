package ZohoInterviewProblems;

import java.util.*;
import java.io.*;
public class ArrayLargeandSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the array limit: ");
		int arr[] = new int[in.nextInt()];
		int temp=0,large=arr.length-1,small=0;
		boolean flag=true;
		System.out.println("Enter the array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=in.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		int temporaryArray[] = arr.clone();
		for (int p = 0; p < arr.length; p++) {
			if(flag) {
				arr[p]=temporaryArray[small++];
				flag=false;
			}
			else {
				arr[p]=temporaryArray[large--];
				flag=true;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
