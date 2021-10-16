package ZohoInterviewProblems;

import java.util.ArrayList;
import java.util.Scanner;
class FindMaximumProfitThoseDays
{
    public static String combination(int arr[], int n) 
    { 
        int maxProfit = 0,minProfit = 0,temp=1;
        String first = "";
        for (int i = 0; i < n-1; i++) {
        	if(temp==1) {
        		minProfit = i;
        		temp=0;
        	}
            if (arr[i] < arr[i + 1]) {
            }
            else {
            	maxProfit = i;
            	temp = 1;
            	if(maxProfit-minProfit >1) {
                    first = "("+minProfit+","+maxProfit+")";
            	}
            }
        }
        	return first+" "+"("+minProfit+","+(arr.length-1)+")"+"\n";
    } 
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number testcases: ");
        int testCases = in.nextInt();
        String result[] = new String[testCases];
        for (int i = 0; i < testCases; i++) {
        	System.out.println("Enter the Array length: ");
        	int arr[] = new int [in.nextInt()];
        	System.out.println("Enter the array elements: ");
            for(int j=0;j<arr.length;j++)
            {
                arr[j] = in.nextInt();
            }
            result[i] = combination(arr, arr.length);
		} 
        for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
		}
    }
}