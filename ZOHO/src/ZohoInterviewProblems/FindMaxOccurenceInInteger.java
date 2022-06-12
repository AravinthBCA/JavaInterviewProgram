package ZohoInterviewProblems;

import java.util.Scanner;

// without using string
//  Question -> 9

public class FindMaxOccurenceInInteger {
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter the input : ");
	    int input = in.nextInt();
	    int length = 0,temp1=input;
	    while(input>0){
	        int temp = input % 10;
	        input = input/10;
	        length++;
	    }
	    int arr[] = new int[length+1];
	    length=0;input=temp1;
	    while(input>0){
	        int temp = input % 10;
	        input = input/10;
	        arr[length] = temp;
	        length++;
	    }
	    int count=0,prevCount=0,value=0;
	    for(int i=0; i<arr.length; i++,count=0){
	        for(int j=i; j<arr.length; j++){
	            if(arr[i]==arr[j]){
	                count++;
	            }
	        }
	        if(count>=prevCount && arr[i]>value){
	            prevCount=count;
	            value=arr[i];
	        }
	    }
	    System.out.println("output : "+value);
	}
}
