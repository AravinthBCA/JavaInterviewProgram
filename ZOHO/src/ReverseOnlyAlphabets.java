import java.util.Scanner;
import java.util.Stack;

public class ReverseOnlyAlphabets {
    public static String reverseOnlyLetters(String S) {
    	Stack<Character> stack = new Stack<Character>();
    	for (Character c : S.toCharArray()) {
			if(Character.isLetter(c)) {
				stack.push(c);
			}
		}
    	StringBuilder ans = new StringBuilder();
    	for(Character c: S.toCharArray()) {
    		if(Character.isLetter(c)) {
    			ans.append(stack.pop());
    		}
    		else {
    			ans.append(c);
    		}
    	}
        return ans.toString();
    }
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = in.nextLine();
		String s = reverseOnlyLetters(str);
		System.out.println(s);
	}
}