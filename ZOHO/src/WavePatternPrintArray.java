import java.util.*;
import java.awt.image.SinglePixelPackedSampleModel;
import java.io.*;

public class WavePatternPrintArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int arr[] = new int[in.nextInt()];
		System.out.println("Enter the array elements: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		Arrays.parallelSort(arr);
		System.out.println("After Array sort Method: ");
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length-1; i+=2) {
			int temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = temp;
		}
		System.out.println("Output: ");
		System.out.println(Arrays.toString(arr));
	}

}
