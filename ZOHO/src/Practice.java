// Java program to sort an array in
// decreasing order of their frequency
import java.util.*;

class Practice{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[] = { 1,2,3,4,5,6,7 };
		for (int i = 0; i < arr.length-1; i+=2) {
			int temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}

