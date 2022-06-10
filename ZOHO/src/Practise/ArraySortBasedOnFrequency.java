package Practise;

import java.util.*;
import java.io.*;

public class ArraySortBasedOnFrequency {
	
	public static void main(String[] args) {
		int arr[] = {4,4,5,6,4,2,2,3,5};
		int maxE=0;
		for (int i = 0; i < arr.length; i++) {
			maxE = Math.max(maxE, arr[i]);
		}
		System.out.println("Maximum Digits : "+maxE);
		int freq[] = new int[maxE+1];
		for (int i = 0; i < arr.length; i++) {
			freq[arr[i]]++;
		}
		System.out.println("Frequency Array : "+Arrays.toString(freq));
		int index = 0;
		for (int i = 0; i < freq.length; i++) {
			if(freq[i]>0) {
				int value = 1000 - i;
				arr[index] = 1000 * freq[i] + value;
				index++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if(arr[j]<arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		freq = arr.clone();index=0;
		for (int i = 0; i < freq.length; i++) {
			if(freq[i]/1000>0) {
				int fre = freq[i] / 1000;
				int value = 1000 - freq[i] % 1000;
				for (int j = 0; j < fre; j++) {
					arr[index] = value;
					index++;
				}
			}
		}
		System.out.println("Result Array : "+Arrays.toString(arr));
		
	}
	
}
