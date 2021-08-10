import java.util.*;
import java.io.*;

public class XOROperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=52,b=13,sum=0,carry=0;
		while(b!=0){
			sum=a^b;
			carry=a & b;
			a=a^b;
			b=carry<<1;
		}
		System.out.print("Difference: "+sum);
	}

}
