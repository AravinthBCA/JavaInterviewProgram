import java.util.Arrays;
import java.util.Iterator;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{1,2,3,4},
				       {5,6,7,8},
				       {9,10,11,12},
				       {13,14,15,16}};
		System.out.println("Input : ");
		for (int[] is : arr) {
			System.out.println(Arrays.toString(is));
		}
		System.out.println("-----------------------------------");
		System.out.println("Output : ");
		int n = arr.length;
		for (int i = 0; i < n/2; i++) {
			for (int j = i; j < n-i-1; j++) {
				int temp = arr[i][j];//1,2
				arr[i][j] = arr[j][n-1-i];//4,8
				arr[j][n-1-i] = arr[n-1-i][n-1-j];//16,15
				arr[n-1-i][n-1-j] = arr[n-1-j][i];//13,9
				arr[n-1-j][i] = temp;//1
			}
			for (int[] is : arr) {
				System.out.println(Arrays.toString(is));
			}
			System.out.println("---------------------------------");
		}
		}
}














