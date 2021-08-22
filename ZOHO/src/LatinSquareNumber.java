import java.util.*;
import java.io.*;

public class LatinSquareNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int size = in.nextInt();
		for (int i = 0; i < size; i++) {
			for (int j = i; j < size; j++) {
				System.out.print(j+1);
			}
			for (int j = 0; j < i; j++) {
				System.out.print(j+1);
			}
			System.out.println();
		}
	}

}
