import java.util.*;
import java.io.*;

public class ArrayUnionIntersectionExcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Integer arr1[] = {1,3,6,5,4,8,9};
		Integer arr2[] = {1,5,8,9,2};
		Integer union[] = new Integer[arr1.length+arr2.length];
		Integer inter[] = new Integer[arr1.length+arr2.length];
		System.out.println("Union: ");
		for (int i = 0; i < arr1.length; i++) {
			union[i] = arr1[i];
		}
		for (int i = arr1.length; i < arr2.length+arr1.length; i++) {
			union[i] = arr2[i-arr1.length];
		}
		LinkedHashSet<Integer> h = new LinkedHashSet<Integer>();
		for (int i = 0; i < union.length; i++) {
			h.add(union[i]);
		}
		System.out.println(h); 
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if(arr1[i]==arr2[j]) {
					inter[i]=arr1[i];
				}
			}
		}
		System.out.println("Intersection:");
		for (int i = 0; i < inter.length; i++) {
			if(inter[i]!=null) {
				System.out.print(inter[i]+" ");
			}
		}
		System.out.println("\nExcept: ");
		for (int i = 0; i < arr1.length; i++) {
			if(arr1[i]%2==1) {
				System.out.print(arr1[i]+" ");
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			if(arr2[i]%2==0) {
				System.out.print(arr2[i]+" ");
			}
		}
	}

}
