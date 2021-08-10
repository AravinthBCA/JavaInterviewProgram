
public class SwapThreeVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=6,c=2;
		System.out.printf("Before swapping a=%d b=%d c=%d",a,b,c);
		a=a^b^(b=a);
		b=b^c^(c=b);
		System.out.printf("\nAfter swapping a=%d b=%d c=%d",a,b,c);
	}

}
