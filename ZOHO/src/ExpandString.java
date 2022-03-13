import java.util.*;
import java.io.*;

public class ExpandString {
/*you can enter one char followed by integer based on the integer the char was printed
 * sample input = a5b3c8
 *        input =aa
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = in.nextLine();
		String ans = "";
		for (int i = 0; i < str.length()-1; i+=2) {
			char letter = str.charAt(i);
			int times = Integer.parseInt(String.valueOf(str.charAt(i+1)));
			for (int j = 0; j < times; j++) {
				ans+=letter;
			}
		}
		System.out.println(ans);
	}
}
