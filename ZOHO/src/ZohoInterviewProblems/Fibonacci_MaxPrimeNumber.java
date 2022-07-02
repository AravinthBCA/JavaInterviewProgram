package ZohoInterviewProblems;

import java.util.Scanner;

// find max prime number of fibonacci series
// 0,1,1,2,3,5,8,13,21,34,55

public class Fibonacci_MaxPrimeNumber {
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter your input number : ");
	    int input = in.nextInt();
	    System.out.println(Math.sqrt(input));
	    int temp=0,first=0,second=1,count=1,max=0;
	    System.out.println(first+"\n"+second);
	    for(int i=0; temp<=input; i++){
	        temp = first+second;
	        first = second;
	        second = temp;
	        System.out.println(temp);
	        count=1;
	        for(int j=2; j<=temp; j++){
	            if(temp%j==0){
	                count++;
	            }
	        }
	        if(count==2){
	            max=temp;
	        }
	    }
	    System.out.println("Max Prime Number of Fibonacci Series : "+max);
	}
}
