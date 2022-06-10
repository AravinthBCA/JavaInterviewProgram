import java.util.*;
import java.io.*;

public class NumberToWords {

	  public void pw(int n, String ch)
	  {
	    String one[] = { " ", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine", " Ten",
	        " Eleven", " Twelve", " Thirteen", " Fourteen", "Fifteen", " Sixteen", " Seventeen", " Eighteen",
	        " Nineteen" };
	 
	    String ten[] = { " ", " ", " Twenty", " Thirty", " Forty", " Fifty", " Sixty", "Seventy", " Eighty", " Ninety" };
//	    System.out.println("n : "+n);
	    if (n > 19)
	    {
	      System.out.print(ten[n / 10] + " " + one[n % 10]);
	    }
	    else
	    {
	      System.out.print(one[n]);
	    }
	    if (n > 0)
	      System.out.print(ch);
	  }
	 
	  public static void main(String[] args)
	  {
	    int n = 0;
	    Scanner scanf = new Scanner(System.in);
	    System.out.println("Enter an integer number: ");
	    n = 1100;
	 
	    if (n <= 0)
	    {
	      System.out.println("Enter numbers greater than 0");
	    }
	    else
	    {
	      NumberToWords a = new NumberToWords();
//	      System.out.println("value hund: "+n/1000000000);
	      a.pw((n / 1000000000)%100, " Hundred");
//	      System.out.println("value cro: "+n/10000000);
	      a.pw((n / 10000000)%100, " crore");
//	      System.out.println("value lak: "+n/100000);
	      a.pw((n / 100000)%100, " lakh");
//	      System.out.println("value thou: "+(n/1000)%100);
	      a.pw((n / 1000) , " thousand");
//	      System.out.println("value hun: "+n/100);
	      a.pw((n / 100)%10, " hundred");
//	      System.out.println("value: "+(n%100));
	      a.pw((n % 100), " ");
	      
	    }
	  }
}
