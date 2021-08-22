import java.util.*;
import java.io.*;

public class Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = null;
		int len,start=0,end=0,open=0,close=0;
		System.out.println("Enter the String: ");
		Scanner in=new Scanner(System.in);
		str=in.next();
		char ch[]=str.toCharArray();
		len=ch.length;
		for(start=0,end=len-1;start<len;start++,end--){
			if(ch[start]=='('){
				open++;
			}
			else if(ch[start]==')'){
				open--;
			}
			
			if(ch[end]==')'){
				close++;
			}
			else if(ch[start]=='('){
				close--;
			}
			if(open<0){
				ch[start]=(char) -1;
				open=0;
			}
			if(close<0){
				ch[end]=(char) -1;
				close=0;
			}
		}
	for(int ind=0;ind<ch.length;ind++){
		if(ch[ind]!=-1){
			System.out.print(ch[ind]);
		}
	}
}

}