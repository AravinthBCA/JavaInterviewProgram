// Reference: https://manimaran96.wordpress.com/2019/03/03/zoho-2nd-round-interview-questions-programming-round-2-mar-2019/
import java.util.*;
import java.io.*;

public class MatrixTraverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the array row and column size: ");
		int row = in.nextInt();
		int column = in.nextInt();
		int arr[][] = new int[row][column];
		System.out.println("Enter the array elements: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				arr[i][j]=in.nextInt();
			}
		}
		System.out.println("Enter the x and y: ");
		int x = in.nextInt();
		int y = in.nextInt();
		System.out.println(Math.abs(y - column));
	}

}
