import java.util.*;
import java.io.*;

public class ReverseStringRecursion {
	static public String[] reverse(String[] arr,int i,int j) {
		if(i==arr.length/2) {
			return arr;
		}
		String temp="";
		temp=arr[j];
		arr[j]=arr[i];
		arr[i]=temp;
		return reverse(arr,++i,--j);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = in.nextLine();
		String arr[] = str.split("\\s+");
		arr=reverse(arr,0,arr.length-1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
