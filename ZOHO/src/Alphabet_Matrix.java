import java.util.*;
import java.io.*;

public class Alphabet_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the String: ");
		char[] ch=in.next().toCharArray();
		int n=ch.length;
		if(ch.length%3==1){
			for(int i=0;i<=n/3;i++,System.out.println()){
				for(int j=0;j<=n/3;j++){
					if((i==0)||(i==n/3)||(i+j==n/3)){
						System.out.print(ch[i+i+j]+" ");
					}
					else{
						System.out.print("  ");
					}
				}
			}
		}
		else{
			System.out.print("None");
		}
		System.out.println();
	}

}
