package ZohoInterviewProblems;
import java.util.*;
import java.io.*;

public class AddTheOddFrequencyElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int arr[] = new int[in.nextInt()];
		System.out.println("Enter the array elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		int flag = 0,temp = 0;
		for (int i = 0; i < arr.length; i+=flag) {
			flag = 0;
			for (int j = 0; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					flag++;
				}
			}
			if(flag%2 == 1) {
				temp += arr[i] * flag;
			}
		}
		System.out.println("Result : "+temp);
	}
}

/* Enter the array size n : 7
Input :  1 2 3 3 1 3 2
Output : 9
Explanation : The odd occurring element is 3, and it's number of occurrence is 3. 
Therefore sum of all 3's in the array = 9.

Test Case 2:
Enter the array size n : 6
Input :  10 20 30 40 40 10
Output : 50
Explanation : The elements are 20 30

*/
