import java.util.*;
import java.io.*;

public class Sum_of_elements_in_a_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row,col,value=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of rows and columns: ");
		row=in.nextInt();
		col=in.nextInt();
		int arr[][]=new int[row][col];
		int out[]=new int[row];
		System.out.println("Enter the values of rows and columns: ");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				arr[i][j]=in.nextInt();
			}
		}
		for(int i=0;i<row;i++,value=0){
			for(int j=0;j<col-1;j++){
				value=arr[i][j]+arr[i][j+1]+value;
			}
			out[i]=value;
		}
		for(int i=0;i<row;i++,value=0){
			System.out.print(out[i]+" ");
		}
	}

}
