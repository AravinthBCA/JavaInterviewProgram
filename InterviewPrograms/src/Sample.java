
public class Sample {
	static void checkAge(int age){
		if(age<18){
			throw new ArithmeticException("Access denied");
		}
		else{
			System.out.println("Access granted");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkAge(15);
	}

}
