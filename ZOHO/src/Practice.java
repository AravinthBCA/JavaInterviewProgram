// Java program to sort an array in
// decreasing order of their frequency
import java.util.*;

class Practice{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[] = { 4, 4, 5, 6, 4, 2, 2, 8, 5};
		ArrayList<Integer> check = new ArrayList<Integer>();
		ArrayList<Integer> count = new ArrayList<Integer>();
		int c=0,index=0,value=0;
		boolean boo=true;
		for (int i = 0; i < arr.length; i++) {
			if(index==0) {
				check.add(arr[i]);
				System.out.println("check: "+arr[i]);
				value=arr[i];
				index+=1;
				c=1;
				for (int j = i+1; j < arr.length; j++) {
					if(arr[i]==arr[j]) {
						c++;
					}
				}
				count.add(c);
				System.out.println("count: "+c);
			}
			else {
				for (int j = 0; j <index; j++) {
					if(arr[i]==check.get(j)) {
						System.out.println("false"+arr[i]);
						boo=false;
					}
					else {
						check.add(arr[i]);
						System.out.println("check: "+arr[i]);
						index+=1;
						c=1;
						for (int k = i+1; k < arr.length; k++) {
							if(arr[i]==arr[k]) {
								c++;
							}
						}
						count.add(c);
						System.out.println("count: "+c);
					}
					if(boo==false) {
						break;
					}
				}
				
			}
		}
//		for (int i = 0; i < index; i++) {
//			System.out.println(count.get(i));
//		}
	}
}

