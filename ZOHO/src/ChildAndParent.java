import java.util.*;
import java.io.*;

public class ChildAndParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
//		System.out.println("Enter the row and column size: ");
		String str[][] = {{"luke","shaw"},{"wayne","rooney"},{"rooney","ronaldo"},{"shaw","rooney"}};
		String find = "ronaldo";
		int child = 0,index;
		ArrayList<String> arList = new ArrayList<String>();
		arList.add("ronaldo");
		index=0;
		System.out.println(str.length);
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 2; j++) {
//					if(find.equals(str[i][j])) {
//						System.out.println("dd" +str[i][j]);
//						child++;
//						index=0;
//						arList.add(str[i][j-1]);
//					}
					if(j==1) {
						for (int j2 = 0; j2 <= index; j2++) {
							if(arList.get(j2) == str[i][j]) {
								child++;
								arList.add(str[i][j]);
//								index++;
								System.out.println("ddd"+str[i][j]);
							}
						}
					}
				}
		}
		System.out.println(child);
	}

}
