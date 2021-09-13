package ZohoInterviewProblems;

import java.util.*;
import java.io.*;

public class HappyElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int arr[] = new int[in.nextInt()];
		int add=0,time=0,value=0,t=2;
		System.out.println("Input: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=in.nextInt();
		}
		for (int i = 1; i < arr.length; i++) {
			if(i>2) {
				if(add==arr[i]) {
					if(arr[i]>=0) {

						value=add;
						time++;
						add=0;
						System.out.println("f"+add+" "+arr[i]);
					}
				}
			}
			else if(i>t) {
				add=0;
				t+=4;
			}
			else {
				add+=arr[i];
				System.out.println(add);
			}
		}
		if(time==1) {
			for (int i = 0; i < arr.length; i++) {
				if(value==arr[i]) {
					
				}
			}
			System.out.println(value);
		}
		else if(value==0) {
			System.out.println("No elements");
		} 
		else {
			System.out.println(time);
		}
		}
}
