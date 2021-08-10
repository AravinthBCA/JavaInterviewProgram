
public class SwapWithOutThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=20;
		System.out.printf("Before Swapping : a=%d b=%d",a,b);
		a=a+b;  //(or) a=a*b; 
		b=a-b;  //(or) b=a/b;
		a=a-b;  //(or) a=a/b;
		System.out.printf("\nAfter Swapping  : a=%d b=%d",a,b);
	}

}
