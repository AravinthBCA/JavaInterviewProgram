import java.util.*;

public class FibonacciSeriesUsingRecursion {
	static int n1=0,n2=1,n3=0;
	static void fibo(int l){
		while(l>0){
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(n3);
			l--;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int limit;
		System.out.println("Enter the fibonacci series limit: ");
		limit=in.nextInt();
		System.out.println("Your series are: "+n1+"\n"+n2);
		FibonacciSeriesUsingRecursion.fibo(limit-2);
	}

}
