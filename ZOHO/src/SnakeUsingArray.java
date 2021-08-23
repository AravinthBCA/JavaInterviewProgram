import java.util.*;
import java.io.*;

public class SnakeUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of lines: ");
		int n = in.nextInt();
		int k=0;
		for (int i = n; i >0; i--) {
			for (int j = 0; j < i-1; j++) {
				System.out.print(" ");
			}
			if(i%2==0) {
				for (int j = 1; j < n+1; j++) {
					++k;
					System.out.print(k+" ");
				}
				k+=5;
			}
			else {
				for (int j = 1; j < n+1; j++) {
					--k;
					System.out.print(k+" ");
				}
				k+=3;
			}
			
			System.out.println();
		}
	}

}
