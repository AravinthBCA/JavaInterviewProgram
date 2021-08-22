import java.util.*;
import java.io.*;

public class Repeated_letter {
	static char repeate(){
		char count = 0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the String: ");
		char[]a=in.next().toCharArray();
		for(int i=0;i<a.length;i++){
			int cmp=Character.compare(count,a[i]);
			System.out.print(cmp);
			if(cmp==0){
				return (char) cmp;
			}
			else{
				count=a[i];
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Repeated_letter obj=new Repeated_letter();
		System.out.print("Your Output is: "+ obj.repeate());
	}
}
