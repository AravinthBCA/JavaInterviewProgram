package ZohoInterviewProblems;

import java.util.*;
import java.io.*;
public class Practice {
	static Scanner in = new Scanner(System.in);
	
	public static void carEntry(int arr[][],int length,int width) {
		System.out.println("Enter Car Number: ");
		int carNumber = in.nextInt();
		int row=0,column=0,j=0,set=0,s=length;
		int print=0,len=0,find=0,k=0,start=0;
		if(carNumber>=1000 || carNumber<=9999) {
			System.out.println("Path Traveld: ");
			for (int i = length; i>=0; i--) {
				for (j = 0; j <width; j++) {
						if(j%2==0) {
							row=0;
							System.out.print("("+(i-length+j));
							if(j==0) {
								System.out.print(","+j+")"+" ");
							}
							else {
								System.out.print(","+(row)+")"+"  ");
							}
							if(arr[i-1][j]==1) {
								System.out.print("("+(i-length+j));
								System.out.print(","+(row+1)+")"+"  ");
								arr[i-1][j]=carNumber;
								set=1;
								break;
							}
						}
						else {
							s=length;
							System.out.print("("+(i-length+j));
							System.out.print(","+(s)+")");
							if(arr[i-1][j]==1) {
								System.out.print("("+(i-length+j));
								System.out.print(","+(s-1)+")"+"  ");
								arr[i-1][j]=carNumber;
								set=1;
								break;
							}
						}
				}
				if(set==1) {
					System.out.println("\nCar Parked...");
					floorMap(arr,length,width);
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
		int print=1;
		if(carNumber>=1000 || carNumber<=9999) {
			System.out.println("Path Traveled: ");
			for (int i = length; i>=0; i--) {
				for (int j = 0; j <width; j++) {
					if(arr[i][j]==carNumber){
						if(i%2==0) {
							System.out.print("("+(length-i)+","+j+")");
							if(arr[i-1][j]==0) {
								System.out.print("("+(length-i-1)+","+j+")");
								for(int k=j;k<width;j++) {
									System.out.print("("+(length-i+1)+","+k+")");
								}
							}
						}
						else {
							System.out.println("odd");
							print=1;
							arr[i][j]=1;
							System.out.print("("+(length-i)+","+(length-j)+")");
							if(arr[i+1][j]==0) {
								System.out.print("("+(length-i)+","+(i+j)+")");
								for(int k=1;k<=width-j-1;k++) {
									if(k%2==0) {
										System.out.print("("+(length-i+k)+","+0+")");
									}
									else {
										System.out.print("("+(length-i+k)+","+length+")");
									}
								}
							}
						}
					}
				}
			}
			if(print==0) {
				System.out.println("Car Number not found...");
			}
			else {
				System.out.println();
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
		while(flag) {
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
