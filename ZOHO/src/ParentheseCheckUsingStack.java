import java.util.*;
import java.io.*;

public class ParentheseCheckUsingStack {
	
	public static boolean ParentheseCheck(String str) {
		int head = 0, tail =0;
		char arr[] = new char[str.length()];
		for (int i = 0; i < arr.length; i++) {
			if( (str.charAt(i) == '{') || 
				(str.charAt(i) == '[') || 
				(str.charAt(i) == '(') ){
					arr[head] = str.charAt(i);
					tail = head;
					head++;
			}
			else {
				try {
					switch(str.charAt(i)) {
					case '}':
						if(arr[tail] != '{') {
							return false;						
						}
						else {
							tail--;head--;
						}
						break;
					case ']':
						if(arr[tail] != '[') {
							return false;						
						}
						else {
							tail--;head--;
						}
						break;
					case ')':
						if(arr[tail] != '(') {
							return false;						
						}
						else {
							tail--;head--;
						}
						break;
					default: 
						break;
					}
				}
				catch(Exception e) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Parentheses String : ");
		String str = in.next();
		System.out.println(ParentheseCheck(str));
	}
}
