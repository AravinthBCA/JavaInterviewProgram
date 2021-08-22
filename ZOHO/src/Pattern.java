import java.util.*;
import java.io.*;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter your row limit: ");
		n=in.nextInt();
		for(int row=0;row<n;row++){
			for(int col=0;col<=row;col++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int row=n-1;row>=1;row--){
			for(int col=0;col<row;col++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
