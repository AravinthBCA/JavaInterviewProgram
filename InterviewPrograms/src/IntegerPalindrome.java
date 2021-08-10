import java.util.*;
public class IntegerPalindrome {
	static int palindrome(int i){
		int reverse = 0;
		while(i!=0){
			int reminder=i%10;
			reverse=reverse*10+reminder;
			i=i/10;
		}
		return reverse;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n;
		System.out.println("Enter the number: ");
		n=in.nextInt();
		if(palindrome(n)==n){
			System.out.println("Entered number is palindrome...");
		}
		else{
			System.out.println("Entered number is not palindrome!!!");
		}
	}

}
