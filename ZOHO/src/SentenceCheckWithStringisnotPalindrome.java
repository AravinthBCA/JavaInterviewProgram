import java.util.*;
import java.io.*;

public class SentenceCheckWithStringisnotPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = in.nextLine();
		String out = "",f="";
		String arr[] = str.split(" ");
		int check=0;
		for (int i = 0; i < arr.length; i++) {
			check=0;
			char[] ch = arr[i].toCharArray();
			for (int j = 0; j < ch.length; j++) {
					if(ch[j]!=ch[ch.length-1-j]) {
						check=1;
						out+=String.valueOf(ch);
						break;
					}
				}
			if(check==0) {
				f+=String.valueOf(ch);
			}
		}
		System.out.println("Output not palindrome: "+out);
	}

}
