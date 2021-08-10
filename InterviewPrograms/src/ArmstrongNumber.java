import java.util.*;
import java.io.*;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,number,armstrong = 0,temp;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number : ");
		n=in.nextInt();
		temp=n;
		while(n!=0){
			number=n%10;
			armstrong+=number*number*number;
			n=n/10;
		}
		if(armstrong==temp){
			System.out.println("Entered number is a Armstrong number...");
		}
		else{
			System.out.println("Entered number is a Not a Armstrong number!!!");
		}
	}

}
