package ZohoInterviewProblems;

import java.util.Arrays;
import java.util.Scanner;

//Question -> 8

public class Q8_Divide2_Divide3_EvenReminder {
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter the array size : ");
	    int arr[] = new int[in.nextInt()];
	    System.out.println("Enter the array elements : ");
	    for(int i=0; i<arr.length; i++){
	        arr[i] = in.nextInt();
	    }
	   int temp=0,j=0,first=0;
	   for(int i=0; first!=arr[i]; i++){
	       if(((arr[i]/2)%2==0) && ((arr[i]/3)%2==0)){
	           temp = arr[i];
	           for(j=i; j<arr.length-1; j++){
	                arr[j] = arr[j+1];
	           }
	           arr[j]=temp;
	           if(first==0){
	               first=temp;
	           }
	           i--;
	       }
	   }
	   System.out.println(Arrays.toString(arr));
	}
}
