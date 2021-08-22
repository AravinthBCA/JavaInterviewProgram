import java.util.*;
import java.io.*;

public class ArrayOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int arr[] = new int[in.nextInt()];
		System.out.println("Enter the array elements: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=in.nextInt();
		}
		System.out.println("Output: ");
		int arrodd[] = new int[arr.length/2],odd=0;
		int arreven[] = new int[arr.length/2],even=0,temp=0;
		for (int i = 0; i < arr.length-1; i++) {
			if(i%2==0) {
				arrodd[odd]=arr[i];
				odd+=1;
			}
			else {
				arreven[even]=arr[i];
				even+=1;
			}
		}
		for (int i = 0; i < arreven.length; i++) {
			for (int j = 0; j < arreven.length-1; j++) {
				if(arreven[j+1]>arreven[j]) {
					temp=arreven[j];
					arreven[j]=arreven[j+1];
					arreven[j+1]=temp;
				}
			}
		}
		for (int i = 0; i < arreven.length; i++) {
			System.out.print(arrodd[i]+" ");
			System.out.print(arreven[i]+" ");
		}
		if(arr.length%2==1) {
			System.out.println(arr[arr.length-1]);
		}
	}

}
