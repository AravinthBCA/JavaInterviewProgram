import java.util.*;
import java.io.*;

public class FindStringInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = in.nextLine();
		char[][] ch = new char[5][5];
		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < 5; j++) {
				ch[i][j] = str.charAt(j);
			}
		}
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length; j++) {
				System.out.println(ch[i][j]);
			}
		}
	}

}
