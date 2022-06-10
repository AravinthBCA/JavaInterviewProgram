package ZohoInterviewProblems;

import java.util.*;
import java.io.*;

public class NumberPattern {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the input numbers : ");
		int n = in.nextInt();
		int temp = 0;
		for (int i = n; i >= 1; i--) {
			for (int j = n; j >= i; j--) {
				System.out.print(j + " ");
				temp = j;
			}
			int j;
			for (j = n - i + 1; j < n ; j++) {
				System.out.print(temp + " ");
			}
			for (j = n - i + 1; j < n ; j++) {
				System.out.print(temp + " ");
			}
			for (int k = i; k <n; k++) {
				System.out.print(k+1 + " ");
				temp = j;
			}
			System.out.println();
		}
//		---------------------------------------------------------------------------
		for (int i = n-1; i>=1; i--) {
			for (int j = n; j<i+n; j++) {
				System.out.print(n+n-j + " ");
				temp = n+n-j	;
			}
			int j;
			for (j = i; j < n ; j++) {
				System.out.print(temp + " ");
			}
			for (j = 1 ; j <temp ; j++) {
				System.out.print(temp + " ");
			}
			for (int k =temp+1; k <=n; k++) {
				System.out.print(k + " ");
				temp = j;
			}
			System.out.println();
		}
		
	}

}
