import java.util.*;
import java.io.*;

public class RemoveDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,temp;
		Scanner in=new Scanner(System.in);
		ArrayList<Integer> arl=new ArrayList<Integer>();
		System.out.println("Enter the number elements you want: ");
		n=in.nextInt();
		for(int i=0;i<n;i++){
			temp=in.nextInt();
			arl.add(temp);
		}
		LinkedHashSet lhs=new LinkedHashSet(arl);
		arl.clear();
		arl.addAll(lhs);
		System.out.println(arl);
	}

}
