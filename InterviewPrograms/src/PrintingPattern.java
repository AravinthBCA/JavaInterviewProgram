import java.util.*;
import java.io.*;

public class PrintingPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n;
		System.out.println("Enter the number of rows: ");
		n=in.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
