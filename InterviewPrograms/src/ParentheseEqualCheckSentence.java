import java.util.*;
import java.io.*;

public class ParentheseEqualCheckSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String str = in.nextLine();
		char ch[] = str.toCharArray();
		int left=0,right=0;
		for (int i = 0; i < ch.length; i++) {
			if(ch[i] ==  '{') {
				left++;
			}
			else if(ch[i] == '}') {
				right++;
			}
			else {
				continue;
			}
		}
		if(left == right) {
			System.out.println("Equal Parentheses");
		}
		else {
			System.out.println("Not Equal Parentheses");
		}
	}

}
