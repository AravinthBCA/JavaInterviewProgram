import java.util.*;
import java.io.*;

public class SubString_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		PrintStream out=System.out;
		String str = null,str1;
		int count=0;
		out.print("Enter the String: ");
		str=in.next();
		char ch[]=str.toCharArray();
		out.println("Enter the next String: ");
		str1=in.next();
		char ch1[]=str1.toCharArray();
		for(int i=0;i<ch.length;i++){
			if(count!=ch1.length){
				if(ch[i]==ch1[0]){
					count=1;
					for(int j=1;j<ch1.length;j++){
						if(ch[++i]!=ch1[j]){
							break;
						}
						else{
							count++;
						}
					}
				}
			}
		}
		if(count==ch1.length){
			System.out.println("Successful your substring appear in the mainstring...");
		}
		else{
			System.out.println("Invalid!!!");
		}
	}

}
