import java.util.*;
import java.io.*;

public class FindExtraElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the array and array1 size: ");
		int[] arr = new int[in.nextInt()];
		int[] arr1 = new int[in.nextInt()];
		int count=0,find=0;
		System.out.println("Enter the 1st array elements: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		System.out.println("Enter the 2nd array elements: ");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = in.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			count=0;
			for (int j = 0; j < arr1.length; j++) {
				if(arr[i]==arr1[j]) {
					break;
				}
				else {
					count++;
					find=i;
				}
			}
			if(count==arr1.length) {
				System.out.println("Index: "+find);
				break;
			}
		}
	}

}
