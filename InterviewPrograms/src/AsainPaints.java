import java.util.*;
import java.io.*;

public class AsainPaints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Array Size Row and Column: ");
		char[][] arr=new char[in.nextInt()][in.nextInt()];
		boolean loop=true;
		do {
			System.out.println("Enter the Array Element: ");
			for (int i = 0; i <arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if(i==0 && j==0) {
						arr[i][j]=0;
					}
					else {
						arr[i][j]=in.next().charAt(0);
					}
				}
			}
			System.out.println("Array Elements: ");
			for (int i = 0; i <arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					System.out.print(arr[i][j]);
				}
				System.out.println("");
			}
			System.out.println("Enter the search Element: ");
			char k=in.next().charAt(0);
			int icount=0,jcount=0;
			boolean check=false;
			for (int i = 0; i < arr.length; i++) {
				icount++;
				jcount=0;
				System.out.println("DOWN -> ");
				for (int j = 0; j < arr.length; j++) {
					jcount++;
					if(k==arr[i][j]) {
						if(i==0) {
							icount--;
						}
						check=true;
					}
				}
				if(check==true) {
					break;
				}
				System.out.println("icount and jcount : "+icount+jcount);
			}
			System.out.println("Output: "+((icount+jcount)-2));
			System.out.println("press 1 to continue: ");
			int value=in.nextInt();
			if(value!=1) {
				loop=false;
			}
		}while(loop);		
	}

}
