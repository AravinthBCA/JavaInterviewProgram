import java.util.*;
import java.io.*;

public class PalindromAccenture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length of character: ");
		char ch[]=new char[in.nextInt()];
		StringBuilder strBil = new StringBuilder();
		StringBuilder strBil2 = new StringBuilder(strBil);
		for(int i=0;i<ch.length;i++) {
			ch[i]=in.next().charAt(0);
			strBil.append(ch[i]);
		}
		if(strBil.reverse().equals(strBil2)) {
			System.out.println("Null");
		}
		else {
			for(int i=ch.length-2;i>=0;i--) {
				System.out.println(ch[i]);
			}
		}
	}

}
