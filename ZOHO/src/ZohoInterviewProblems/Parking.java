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
			for (int i = length; i>=0; i--) {
				System.out.print("Car Parked at: "+"("+(i-length));
				for (j = 0; j <width; j++) {
					if(j==0) {
						System.out.print(","+j+")");
					}
					if(arr[i-1][j]==1) {
						arr[i-1][j]=carNumber;
						set=1;
					}
//					if(arr[i][j]==1) {
//						print=1;
//					}
//				}
//				if(print==0) {
//					j=0;
//					
//				}
//					System.out.print(j+")");
//					if(i==length) {
//						if(arr[i-1][j]==1) {
//							arr[i-1][j]=carNumber;
//						}
//					}
//						if(arr[i][j]==1) {
//							arr[i][j]=carNumber;
//							row=i-length;
//							column=j;
//							print=1;
//							System.out.println("Car Parked at: "+"("+Math.abs(row)+","+Math.abs(width-column-1)+")");
//							for (int j2 = length; j2 >=0; j2--) {
//								start=k;
//								k=0;
//								for (k = 0; k < width; k++) {
//									if(arr[j2][k]==carNumber) {
//										find=1;
//									}
//									if(find==0) {
//										System.out.println("Path traveled: "+"("+(length-j2)+","+(start)+")");
//									}
//								}		
//								if(find==1){
//									System.out.print("("+(length-j2)+","+(start)+")");
//								}
//							}
//						}
//						else {
//							len++;
//						}
//						if(print==1) {
//							break;
//						}
//					}
//				if(print==1) {
//					break;
//				}
//				}
//			if(print==1) {
//				floorMap(arr,length,width);
//			}
//			if(len==((length+1)+(width))) {
//				System.out.println("Parking Full!");
//				floorMap(arr,length,width);
//			}
//		}
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
//				System.out.print(arr[i][j]+" ");
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
							flag = true;
						}
						else {
							flag = false;
						}
						if(flag) {
							break;
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
				System.out.println("Car exited from the parking area");
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
