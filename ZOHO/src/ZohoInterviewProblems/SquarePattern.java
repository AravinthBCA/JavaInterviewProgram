package ZohoInterviewProblems;

import java.util.Scanner;

public class SquarePattern {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the input numbers : ");
		int n = in.nextInt();
		for (int i = n; i > 0; i--) {
			for (int j = n; j >=i; j--) {	
				System.out.print(j+" ");
			}
			for (int j = n-i+1; j < (n*2-1)-(n-i); j++) {
				System.out.print(i+" ");
			}
			for (int j = i; j < n; j++) {
				System.out.print(j+1+" ");
			}
			System.out.println();
		}
// -------------------------------------------------------------
		for (int i = 2; i <=n; i++) {
			for (int j = n; j >=i; j--) {	
				System.out.print(j+" ");
			}
			for (int j = n-i+1; j < (n*2-1)-(n-i); j++) {
				System.out.print(i+" ");
			}
			for (int j = i; j < n; j++) {
				System.out.print(j+1+" ");
			}
			System.out.println();
		}
	} 
}
