package Practise;

import java.util.*;
import java.io.*;

public class LookAndSayPattern {
	public static void main(String[] args) {
		int n = 6,i=1;
		String str = "1";
		System.out.println("1");
		while(i<n) {
			char ch = str.charAt(0);
			String temp  = "";
			int count = 1; 
			for (int j = 1; j < str.length(); j++) {
				if(str.charAt(j) != str.charAt(j-1)) {
					System.out.print(count+""+str.charAt(j-1));
					temp += ""+count+str.charAt(j-1);
					count=1;
					ch=str.charAt(j);
				}else {
					count++;
				}
			}
			System.out.println(count+""+ch);
			temp += ""+count+ch;
			str = temp;
			i++;
		}
	}
}
