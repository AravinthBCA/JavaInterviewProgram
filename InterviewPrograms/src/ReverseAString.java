import java.util.*;
import java.io.*;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str,str1 ="";
		StringBuffer str2=new StringBuffer();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the String: ");
		str=in.next();
		char[] ch=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--){
			str1=str1+ch[i]; 
			str2.append(ch[i]);
		}
		System.out.println(str1);
		System.out.println(str2);
	}

}
