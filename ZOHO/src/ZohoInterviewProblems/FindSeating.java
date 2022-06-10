package ZohoInterviewProblems;

import java.util.*;
import java.io.*;

public class FindSeating {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the seat number : ");
		int number = in.nextInt();
		int temp = number % 6;
		if (temp == 1 || temp == 0) {
			System.out.println("WS");
		}
		else if(temp==5 || temp==2 ) {
			System.out.println("MS");
		}
		else {
			System.out.println("AS");
		}
	}

}
