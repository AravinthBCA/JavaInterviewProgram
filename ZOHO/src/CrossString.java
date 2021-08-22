import java.util.*;
import java.io.*;

public class CrossString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = in.nextLine();
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length; j++) {
				if(i==j || i+j==ch.length-1) {
					System.out.print(ch[j]);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
