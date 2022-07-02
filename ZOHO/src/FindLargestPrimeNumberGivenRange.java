import java.util.*;
import java.io.*;

public class FindLargestPrimeNumberGivenRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Starting and Ending Number: ");
		int start = in.nextInt();
		int end = in.nextInt();
		int max = 0;
		boolean flag = true;
		for (int i = start; i <= end; i++) {
			flag = true;
			for (int j = 2; j <=i/2; j++) {
				if(i%j==0) {
					flag = false;
				}
			}
			if(flag && max < i) {
				max = i;
			}
		}
		System.out.println("Max : "+max);
	}
}
