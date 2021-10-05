package ZohoInterviewProblems;

import java.util.*;
import java.io.*;
public class Parking {
	static Scanner in = new Scanner(System.in);
	
	public static void carEntry(int arr[][],int length,int width) {
		System.out.println("Enter Car Number: ");
		int carNumber = in.nextInt();
		int row=0,column=0,j=0,set=0;
		int print=0,len=0,find=0,k=0,start=0;
		if(carNumber>=1000 || carNumber<=9999) {
			for (int i = 1; i<length; i++) {
				System.out.print("Car Parked at: "+"("+(i));
				for (j = 1; j <width-1; j++) {
					if(arr[i][j]==1) {
						System.out.print(","+j+")"+"\n");
						arr[i][j]=carNumber;
						print=1;
						break;
					}
				}
				if(print==1) {
					floorMap(arr, length, width);
					break;
				}
			}
		}
		else {
			System.out.println("Not valid Car Number");
			System.exit(0);
		}
	}

	public static void floorMap(int arr[][],int length,int width) {
		for (int i = 0; i <length+1; i++) {
			for (int j = 0; j < width; j++) {
				if(arr[i][j]==0) {
					System.out.print("X"+" ");
				}
				else if(arr[i][j]==1){
					System.out.print("-"+" ");
				}
				else {
					System.out.print(arr[i][j]+" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void carExit(int arr[][],int length,int width) {
		System.out.println("Enter the Car Number: ");
		int carNumber = in.nextInt();
		if(carNumber>=1000 || carNumber<=9999) {
			boolean flag = false;
			for (int i = 0; i < length+1; i++) {
				for (int j = 0; j < width; j++) {
						if(arr[i][j]==carNumber) {
							arr[i][j]=1;
							System.out.println("Car exited from the parking area: ("+i+","+j+")"+"\n");
							if(arr[i-1][j]==0) {
								for (int j2 = i-1; j2 < i; j2++) {
									for (int k = j; k < arr.length; k++) {
										System.out.print("("+(i-1)+","+k+")"+" -> ");
										if(k==(arr.length)-1) {
											for (int k2 = i; k2 <(arr.length); k2++) {
												System.out.print("("+k2+","+((arr.length)-1)+")"+" -> ");
											}
										}
									}
								}
							}
							else if(arr[i][j+1]==0) {
								for (int j2 = i; j2 < arr.length; j2++) {
									System.out.print("("+j2+","+(j+1)+")"+" -> ");
								}
							}
							else if(arr[i+1][j]==0) {
								System.out.println("length: "+arr.length);
								for (int j2 = j; j2 < arr.length; j2++) {
									System.out.print("("+(i+1)+","+j2+")"+" -> ");
								}
								for (int j2 = i+2; j2 < arr.length; j2++) {
									System.out.print("("+j2+","+(arr.length-2)+")"+" -> ");
								}
							}
							flag = true;
							break;
						}
						else {
							flag = false;
						}
					}
				if(flag) {
					break;
				}
				}
			if(!flag) {
				System.out.println("Invalid Vehicle Number");
			}
			else {
				System.out.println("");
				floorMap(arr,length,width);
			}
		}
		else {
			System.out.println("Not valid Car Number");
			System.exit(0);
		}		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length and width of car parking: ");
		int length = in.nextInt();
		if(length<1) {
			System.out.println("Not valid length");
			System.exit(0);
		}
		int width = in.nextInt();
		if(width<1) {
			System.out.println("Not valid width");
			System.exit(0);
		}
		length +=2;
		width +=(width/2)+1;
		int[][] arr = new int[length+1][width];
		for (int i = 0; i <length+1; i++) {
			for (int j = 0; j < width; j++) {
				if(i==0 || j==0 || i==length || j==arr.length-1 || i==arr.length || i==3 || j==width-1) {
					arr[i][j]=0;
				}
				else {
					arr[i][j]=1;
				}
			}
			System.out.println();
		}
		boolean flag=true;
		while(true) {
			System.out.println("Select any one of the following options: ");
			System.out.println("1. Entry");
			System.out.println("2. Exit");
			System.out.println("3. PrintFloor Map");
			int choice = in.nextInt();
			if(choice==1) {
				carEntry(arr,length,width);
			}
			else if(choice==3) {
				floorMap(arr,length,width);
			}
			else if(choice==2){
				carExit(arr,length,width);
			}
			else {
				System.out.println("Invalid Choice...");
			}
			System.out.println("You want to continue: Y");
			char c = in.next().charAt(0);
			if(c=='Y'||c=='y') {
				flag=true;
			}
			else {
				flag=false;
			}
		}
	}

}
