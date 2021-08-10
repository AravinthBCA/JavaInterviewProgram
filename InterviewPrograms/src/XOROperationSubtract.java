
public class XOROperationSubtract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5,b=3,diff = 0,borr=0;
		while(b!=0){
			diff=a^b;
			borr=~a&b;
			a=a^b;
			b=borr<<1;
		}
		System.out.print("Difference is: "+diff);
	}

}
