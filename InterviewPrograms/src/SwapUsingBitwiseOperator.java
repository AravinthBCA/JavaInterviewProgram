
public class SwapUsingBitwiseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=20;
		System.out.printf("Before swapping a=%d b=%d",a,b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.printf("\nAfter swapping a=%d b=%d",a,b);
	}

}
