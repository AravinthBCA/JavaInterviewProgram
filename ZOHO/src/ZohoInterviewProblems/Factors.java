package ZohoInterviewProblems;

import java.util.*;
import java.awt.image.SinglePixelPackedSampleModel;
import java.io.*;
public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int arr[] = new int[in.nextInt()];
		int out[] = new int[arr.length];
		int fac[] = new int[arr.length];
		int f=0;
		System.out.println("Input array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=in.nextInt();
		}
		int count=0,temp=0;
		for (int i = 0; i < arr.length; i++) {
			count=0;
			f=0;
			for (int j = 1; j <=arr[i]; j++) {
				if(arr[i]%j==0) {
					count+=j;
					f++;
				}
			}
			out[i]=count;
			fac[i]=f;
			if(i!=0) {
				if(out[i]==out[i-1]) {
					if(fac[i]>fac[i-1]) {
						temp=arr[i-1];
						arr[i-1]=arr[i];
						arr[i]=temp;
					}
				}
			}
		}
		temp=0;
		for (int i = 0; i < out.length; i++) {
			for (int j = 0; j < out.length-1; j++) {
				if(out[j]<out[j+1]) {
					temp=out[j];
					out[j]=out[j+1];
					out[j+1]=temp;
				}
			}
		}
		int print[] = new int[arr.length];
		int length=0;
		for (int i = 0; i < out.length; i++) {
			for (int j2 = 0; j2 < arr.length; j2++) {
				count=0;
				for (int j = 1; j <=arr[j2]; j++) {
					if(arr[j2]%j==0) {
						count+=j;
					}
				}
				if(out[i]==count) {
					length=0;
					for (int j = 0; j < print.length; j++) {
						if(print[j]!=arr[j2]) {
							length++;
						}
					}
					print[i]=arr[j2];https://meeting.zoho.com/join?key=1083484012&t=7107de878a201be8f825c6c9533888c70c34bdaa2589c3d91dacd427f8ffd4c9
					if(length==print.length) {
						System.out.print(arr[j2]+" ");
						break;
					}
				}
				
			}
		}
	}

}
