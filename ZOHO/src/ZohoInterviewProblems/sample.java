package ZohoInterviewProblems;

import java.util.*;
import java.io.*;

public class sample {
	public static int[] Sort(int arr[], int n)
    {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) 
        {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) 
            {
                if (arr[j] > arr[j + 1]) 
                {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
        }
		return arr;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the m, n, x values: ");
		int m=in.nextInt(),n=in.nextInt(),x=in.nextInt();
		int arr[] = new int[x];
		int out[] = new int[x];
		int temp=0,count=0,flag=0;
		System.out.println("Enter the array elements: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=in.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			flag=0;
			if(arr[i]!=0) {
				if(m%arr[i]==0) {
					for (int j = 0; j < out.length; j++) {
						if(arr[i]==out[j]) {
							flag=1;
						}
					}
					if(flag==0) {
						out[count]=arr[i];
						count++;
						System.out.println("count: "+count);
					}
				}
			}
		}
		out=Sort(out,count);
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0) {
				flag=0;
				if(n%arr[i]==0) {
					System.out.println("in");
					for (int j = 0; j < out.length; j++) {
						if(arr[i]==out[j]) {
							System.out.println("flag: "+flag);
							flag=1;
							break;
						}
					}
					if(flag==0) {
						out[count]=arr[i];
						System.out.println("susuus");
						count++;
					}
				}
			}
		}
		flag=0;
		int j=0;
		for (int i = 0; i < arr.length; i++) {
			flag=0;
			for (j = 0; j < out.length; j++) {
				if(arr[i]==out[j]) {
					flag=1;
					break;
				}
			}
			if(flag==0) {
				out[count]=arr[i];
				System.out.println("value: "+out[count]);
				count++;
			}
		}
		for (int i = 0; i < out.length; i++) {
			System.out.println(out[i]);
		}
	}

}
