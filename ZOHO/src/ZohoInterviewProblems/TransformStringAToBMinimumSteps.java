package ZohoInterviewProblems;

import java.io.*;
import java.util.*;

public class TransformStringAToBMinimumSteps {
	public static int minOps(String A, String B)
	{
		if(A.length() != B.length())
			return -1;
		
		int i, j, res = 0;
		int count [] = new int [256];
		
		// count characters in A
		
		// subtract count for every character in B
		for(i = 0; i < A.length(); i++)
		{
			count[A.charAt(i)]++;
			count[B.charAt(i)]--;
		}
		
		// Check if all counts become 0
		for(i = 0; i < 256; i++)
			if(count[i] != 0)
				return -1;
		
		i = A.length() - 1;
		j = B.length() - 1;

		while(i >= 0)
		{
			// If there is a mismatch, then
			// keep incrementing result 'res'
			// until B[j] is not found in A[0..i]
			if(A.charAt(i) != B.charAt(j))
				res++;
			else
				j--;
			i--;		
		}
		return res;	
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of test cases: ");
		int testCases = in.nextInt();
		for (int i = 0; i < testCases; i++) {
			System.out.println("Enter the String A: ");
			String A = in.next();
			System.out.println("Enter the String B: ");
			String B = in.next();		
			System.out.println("Operation's required: "+minOps(A, B));
			System.out.println("----------------------------------");
		}
	}
}

