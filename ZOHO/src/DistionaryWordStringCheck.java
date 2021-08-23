import java.util.*;
import java.io.*;

public class DistionaryWordStringCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string array limit: ");
		String arr[] = {"i","like","sam","sung","samsung","mobile","ice","cream","icecream","man",
				        "go","mango"};
		System.out.println("Enter the string to find: ");
		String str = in.nextLine();
		StringBuilder bil = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			bil.append(arr[i]);
		}
		int length=0;
		for (int i = 0; i < bil.length(); i++) {
			if(length!=str.length()) {
				if(str.charAt(0)==bil.charAt(i)) {
					length++;
					for (int j = 1; j < str.length(); j++) {
						if(str.charAt(j)==bil.charAt(++i)) {
							length++;
						}
						else {
							break;
						}
					}
				}
			}
		}
		if(length==str.length()) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}

}
