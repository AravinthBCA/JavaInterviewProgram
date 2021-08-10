import java.util.*;
import java.io.*;

public class Power {
	static void findpower(int n,int p){
		int number=n;
		for(int i=1;i<p;i++){
			number=number*n;
		}
		if(number==0){
			throw new ArithmeticException("Please enter non-zero values...");
		}
		else if(number<=0){
			throw new ArithmeticException("Please enter positive values...");
		}
		else{
			System.out.println("Your power value is: "+number);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,p;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		n=in.nextInt();
		p=in.nextInt();
		findpower(n,p);
	}

}
