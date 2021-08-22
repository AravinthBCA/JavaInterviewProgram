import java.util.*;
import java.io.*;

public class StringVowelArrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = in.nextLine();
		char vowel[] = {'a','e','i','o','u','A','E','I','O','U'};
		char ch[] = str.toCharArray();
		int count=0,vower=0;
		for (int i = ch.length-2; i >= 0; i--) {
				for (int j = 0; j < vowel.length; j++) {
					if(ch[i]==vowel[j]) {
						vower=1;
						System.out.print("i: "+ch[i]);
						for (int j2 = i+1; j2 < ch.length; j2++) {
							for (int k = 0; k < vowel.length; k++) {
								if(vowel[k]==ch[j2]) {
									System.out.println("hii");
									count=1;
								}
							}
							if(count==1) {
								break;
							}
							else if(count!=1) {
								System.out.println("soory");
								System.out.print(ch[j2]);
							}
							count=0;
						}
						
					}
				}
				if(vower==1) {
					System.out.println();
				}
				
		}
	}

}
