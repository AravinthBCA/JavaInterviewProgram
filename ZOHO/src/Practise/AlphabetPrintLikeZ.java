package Practise;

import java.util.*;
import java.io.*;

public class AlphabetPrintLikeZ {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your string diviside of 3 and remaining should be 1 : ");
		char[] ch = in.next().toCharArray();
		for (int i = 0; i <=ch.length/3; i++) {
			for (int j = 0; j <=ch.length/3; j++) {
				if(i==0 || i+j==ch.length/3 || i==ch.length/3) {
					System.out.print(ch[i+j+i]+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}
	
}
