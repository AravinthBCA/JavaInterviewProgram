import java.util.*;
import java.io.*;

public class ArrayProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]={1,10,50,39,80,78,34,54,56},n=9,i,j=0,a,b;
		a=0;
		for(i=0;i<n;i++){
			if(a<arr1[i]){
				a=arr1[i];
				j=i;
			}
		}
		b=0;
		for(i=0;i<n;i++){
			if(i==j){
				i++;
				i--;
			}
			else{
				if(b<arr1[i]){
					b=arr1[i];
				}
			}
		}
		System.out.println("Your output is: "+b);
	}

}
