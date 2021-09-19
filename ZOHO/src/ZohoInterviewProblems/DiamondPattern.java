package ZohoInterviewProblems;

import java.util.*;
import java.io.*;

public class DiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int rows=in.nextInt();
		int temp=0;
		for (int i = 1; i <= rows; i++)
        {
            for (int j = rows; j > i; j--)
            {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--)
            {
            	if(i==1) {
            		temp=i;
            		System.out.print(i);
            	}
            	else if(i==2 && k==1) {
            		temp=i;
            		System.out.print(temp);
            	}
            	else if(k==1) {
            		temp=temp+i;
            		System.out.print(temp);
            	}
            	else {
                    System.out.print(k);
            	}
            }
            if(i!=1) {
            	for (int k = 2; k <= i; k++)
                {
            		System.out.print(k);
                }
            }
            System.out.println();
        }
		for (int i = rows-1; i >=1; i--)
        {
            for (int j = rows; j > i; j--)
            {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--)
            {
            	if(i==1) {
            		temp=i;
            		System.out.print(i);
            	}
            	else if(i==2 && k==1) {
            		temp=i;
            		System.out.print(temp);
            	}
            	else if(k==1) {
            		temp=temp-i-1;
            		System.out.print(temp);
            	}
            	else {
                    System.out.print(k);
            	}
            }
            if(i!=1) {
            	for (int k = 2; k <= i; k++)
                {
            		System.out.print(k);
                }
            }
            System.out.println();
        }
	}

}
