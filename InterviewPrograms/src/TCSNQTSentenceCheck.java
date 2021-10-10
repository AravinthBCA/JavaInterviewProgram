import java.util.*;
import java.io.*;

public class TCSNQTSentenceCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String str = in.nextLine();
		char ch[] = str.toCharArray();
		if((Character.isUpperCase(ch[0])) && (ch[str.length()-1]=='.') && (str.length()<50)) {
			System.out.println("True");			
		}
		else {
			System.out.println("False");
		}
	}

}
