import java.util.*;


public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);		
		int n1=0,n2=1,n3=0,limit;
		System.out.println("Enter the fibonacci Series limit: ");
		limit=in.nextInt();
		System.out.println("your fibonacci series is: ");
		System.out.println(n1+"\n"+n2);
		limit=limit-2;
		while(limit>0){
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(n3);
			limit--;
		}
	}

}
