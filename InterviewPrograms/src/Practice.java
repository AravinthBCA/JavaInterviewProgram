import java.util.*;
import java.io.*;

class Practice{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of string: ");
		String str[] = new String[in.nextInt()+1];
		for (int i = 0; i < str.length; i++) {
			str[i] = in.nextLine();
		}
		System.out.println("Enter the number: ");
		int n = in.nextInt();
		int repeat=0;
		boolean flag=false;
		for (int i = 0; i <str.length; i++) {
			repeat=0;
			for (int k = 0; k < i-1; k++) {
				if(str[k].equals(str[i])) {
					flag=true;
				}
			}
			if(flag==false) {
				for (int j = 0; j < str.length; j++) {
					if(i!=j) 
					{	
						if(str[i].equals(str[j])){
						   repeat++;
						}
					}
				}			
				if(repeat>=(n-1)) {
					System.out.println(str[i]);
				}
			}
		}
	}
}