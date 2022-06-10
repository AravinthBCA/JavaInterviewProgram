package Practise;

import java.util.*;
import java.io.*;

public class CrossString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = "aravint";
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				if(i==j || i+j==str.length()-1) {
					System.out.print(str.charAt(j));
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
}
