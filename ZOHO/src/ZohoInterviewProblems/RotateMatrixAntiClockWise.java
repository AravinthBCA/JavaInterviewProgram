package ZohoInterviewProblems;

import java.util.*;
import java.io.*;

class RotateMatrixAntiClockWise {
	static void rotateMatrix(int n, int matrix[][]) {
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
			}
		}
		for (int i = 0; i < n; i++) {
			int top = 0;
			int bottom = n - 1;
			while (top < bottom) {
				int temp = matrix[top][i];
				matrix[top][i] = matrix[bottom][i];
				matrix[bottom][i] = temp;
				top++;
				bottom--;
			}
		}
	}

	static void displayMatrix(int N, int mat[][]) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++)
				System.out.print(" " + mat[i][j]);
			System.out.print("\n");
		}
		System.out.print("\n");
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the row and column size: ");
		int mat[][] = new int[in.nextInt()][in.nextInt()];
		System.out.println("Enter the matrix elements: ");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				mat[i][j] = in.nextInt();
			}
		}
		rotateMatrix(mat.length, mat);
		displayMatrix(mat.length, mat);
	}
}