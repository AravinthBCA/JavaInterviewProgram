import java.util.*;
import java.io.*;

public class LookAndSayPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = in.nextInt(),i=1;
		int count = 1;
		String str = "1";
		System.out.println(1);
		while(i<n) {
			String new_s="";
			count=1;
			char a = str.charAt(0);
			for (int j = 1; j < str.length(); j++) {
				if(str.charAt(j) != str.charAt(j-1)) {
					System.out.print(""+count+""+a);
					new_s += ""+count+""+a;
					a = str.charAt(j);
					count = 1;
				}
				else {
					count++;
				}
			}
			System.out.println(""+count+""+a);
			new_s+=""+count+""+a;
			str = new_s;
			i++;
		}
	}

}
