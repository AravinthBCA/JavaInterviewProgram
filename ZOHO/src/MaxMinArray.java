import java.util.*;
import java.io.*;

public class MaxMinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int arr[] = {1,2,3,4,5,6,7};
		int temp[] = arr.clone();
		int large = arr.length-1, small=0;
		boolean flag = true;
		for (int i = 0; i < arr.length; i++) {
			if(flag) {
				arr[i] = temp[large--];
			}
			else {
				arr[i] = temp[small++];
			}
			flag = !flag;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
