import java.util.*;
import java.io.*;

public class DuplicatesRemoveArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of arrays: ");
		n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		System.out.println("After Removing Duplicates in array: ");
		for(int i=0;i<n;i++){
			for(int j=0;j<n-1;j++){
				if(arr[i]==arr[j]){
					arr[i]=arr[j+1];
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
	}

}
