package ZohoInterviewProblems;

import java.util.*;
import java.io.*;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = in.next();
		char ch[] = str.toCharArray(); //convert string into chararray
		int index=0;
		for (int i = 0; i < ch.length; i++) { //loop will run until  of string
			int j;
			for (j = 0; j < ch.length; j++) {
				if(ch[i]==ch[j]) {
					break;
				}
			}
			if(j==i) {
				ch[index++]=ch[i];
			}
		}
		for (int i = 0; i < index; i++) {
			System.out.print(ch[i]);
		}
	}
}
