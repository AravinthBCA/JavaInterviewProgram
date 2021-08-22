import java.util.*;
import java.io.*;

public class FindLargestPrimeNumberGivenRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = in.nextInt();
		int[] num = new int[4];
		int find[] = {99,999,9999};
		int temp=number,count=0,k=0,cas=0;
		while(temp!=0) {
			num[k]=temp%10;
			temp/=10;
			count++;
			k++;
		}
		count-=2;
		temp=number;
		ArrayList<Integer> a=new ArrayList<>();
		  for(int n=number; n<=find[count]; n++){
		  int c = 0;
		  for (int i = 1; i <= n; i++)
		      if (n % i == 0)
		          c++;
		  if (c == 2) {
			  a.add(n);
			  while(n!=0) {
				  temp=n%10;
				  for (int i = 0; i < num.length; i++) {
					if(num[i]==temp) {
						cas++;
					}
				}
				  n/=10;
				  if(cas==0) {
					  break;
				  }
			  }
			  if(cas==4) {
				  System.out.println("find");
			  }
		  }
		  else {
			  continue;
		  }
		  }
		  System.out.println(a);
	}
}
