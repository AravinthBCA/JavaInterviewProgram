import java.util.*;
import java.io.*;

public class ZeroAtLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int arr[] = new int[in.nextInt()];
		int count=0;
		System.out.println("Enter the array elements: ");
		for (int a = 0; a < arr.length; a++) {
			arr[a] = in.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0) {
				arr[count]=arr[i];
				count++;
			}
			
		}
		for (int i = count; i < arr.length; i++) {
			arr[i] = 0;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
