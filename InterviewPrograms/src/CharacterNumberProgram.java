import java.util.*;
import java.io.*;

public class CharacterNumberProgram {
	
	public static String comb(char c,String str) {
		if(c<=99) {
			return str;
		}
		else if(c%4==0){
			c=(char)(c-3);
			str=str+Character.toString(c);
			return comb(c,str);
		}
		else if(c%3==0){
			c=(char)(c-4);
			str=str+Character.toString(c);
			return comb(c,str);
		}
		else {
			c=(char)(c-1);
			str=str+Character.toString(c);
			return comb(c,str);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str="";
		char input=122;
//		System.out.println(comb(input,str));
		System.out.println(input<
				90);
	}

}
