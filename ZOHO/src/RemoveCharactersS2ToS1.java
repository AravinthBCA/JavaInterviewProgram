import java.util.*;
import java.io.*;

public class RemoveCharactersS2ToS1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String1: ");
		String str1 = in.nextLine();
		System.out.println("Enter the String2: ");
		String str2 = in.nextLine();
		String str3 = "";
		if(str1.contains(str2)) {
			str3 = str2+"";
			str1 = str1.replaceAll(str3, "");
		}
		System.out.println("String1 : "+str1);
	}

}
