import java.util.*;
import java.io.*;

public class MatrixMultiAccenture {
	
	static Scanner in = new Scanner(System.in);
	
	public static int sum(int arr1[],int arr2[]) {
		
		int Mul=0;
		System.out.println("Enter the array1 and array2 values: ");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i]=in.nextInt();
			arr2[i]=in.nextInt();
		}
		for (int  i= 0;  i<1; i++) {
			for (int j = arr2.length-1; j>=0; j--) {
				Mul+=arr1[i]*arr2[j];
				i++;
			}
		}
		return Mul;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the array size: ");
		int arr1[] = new int[in.nextInt()],arr2[] = new int[in.nextInt()];
		int result = sum(arr1,arr2);
		System.out.println("output: "+ result);
	}

}
