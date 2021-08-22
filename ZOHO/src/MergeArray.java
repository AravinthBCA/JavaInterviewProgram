import java.util.*;
import java.io.*;

public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
//		System.out.println("Enter the ");
		Integer arr1[] = {2,4,5,6,9,8,10,13};
		Integer arr2[] = {2,3,4,5,6,7,8,9,11,15};
		Integer merge[] = new Integer[arr1.length + arr2.length];
		for (int i = 0; i < arr1.length; i++) {
			merge[i]=arr1[i];
		}
		int j=0;
		for (int i = arr1.length; i < arr2.length+arr1.length; i++) {
			merge[i]=arr2[j];
			j++;
		}

//		for (int i = 0; i < merge.length; i++) {
//			System.out.println(merge[i]);
//		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println("After merge and duplicate remove: ");

		for (int i = 0; i < merge.length; i++) {
			System.out.println(merge[i]);
		}

		TreeSet<Integer> s = new TreeSet<Integer>();
		for (int i = 0; i < merge.length; i++) {
			s.add(merge[i]);
		}
		System.out.println(s);
	}

}
