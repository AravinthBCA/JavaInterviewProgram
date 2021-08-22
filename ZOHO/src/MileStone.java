/*  1)number of rows and columns
 *  2)give a square like 3*3 in 3
 *  3)to fit how many 3fits in the rows and columns 
 *  4)to print how many square to fill the rows and columns
 *  5)example: 
 *         rows=6  columns=3
 *         square=2  output=6
 * */





import java.util.*;
import java.io.*;

public class MileStone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int rows,col,square,rowvalue,colvalue;
		System.out.println("Enter the number of rows and columns: ");
		rows=in.nextInt();
		col=in.nextInt();
		System.out.println("Enter the square value: ");
		square=in.nextInt();
		rowvalue=rows/square;
		colvalue=col/square;
		if(rows%square!=0){
			rowvalue+=1;
		}
		if(col%square!=0){
			colvalue+=1;
		}
		System.out.println("Output is: "+rowvalue*colvalue);
	}

}
