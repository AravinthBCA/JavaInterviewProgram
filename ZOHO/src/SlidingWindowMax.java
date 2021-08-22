import java.util.*;
import java.io.*;

public class SlidingWindowMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int arr[] = new int[(in.nextInt())*3];
		System.out.println("Enter array elements: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		for (int i = 0; i < arr.length-2; i++) {
			int max = arr[i];
			for (int j = i+1; j <i+3; j++) {
				if(max<arr[j]) {
					max = arr[j];
				}
			}
			System.out.println(max);
		}
	}

}
