import java.util.*;
import java.io.*;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,temp = 1;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number: ");
		n=in.nextInt();
		for(int i=1;i<=n;i++){
			temp=temp*i;
		}
		System.out.println("Factorial value is : "+temp);
	}

}
