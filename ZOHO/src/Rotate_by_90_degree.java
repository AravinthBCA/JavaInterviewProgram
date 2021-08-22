import java.util.*;
import java.io.*;

public class Rotate_by_90_degree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row,column,n;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of rows and columns: ");
		row=in.nextInt();
		column=in.nextInt();
		int arr[][]=new int[row][column];
		int output[][]=new int[row][column];
		System.out.println("Enter the rows and columns values: ");
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				arr[i][j]=in.nextInt();
			}
		}
		for(int i=0;i<row;i++){
			for(int j=column-1;j<=column-1;j++){
				output[i][i-j]=arr[i][j];
			}
		}
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				System.out.print(output[i][j]+" ");
			}
			System.out.println();
		}

	}

}
