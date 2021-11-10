import java.util.*;
import java.io.*;

public class Practice2 {
	public static int GetToatalPoints(int a, int b, int c, int d) throws java.lang.Exception{
		a = a==11 ? 3 : a==9 ? 2 : a==1 ? 1 : a ==10 ? 1 : 0;
		b = b==11 ? 3 : b==9 ? 2 : b==1 ? 1 : b ==10 ? 1 : 0;
		c = c==11 ? 3 : c==9 ? 2 : c==1 ? 1 : c ==10 ? 1 : 0;
		d = d==11 ? 3 : d==9 ? 2 : d==1 ? 1 : d ==10 ? 1 : 0;
		return a+b+c+d;
	}
	public static void main(String[] args) { 
		Scanner in = new Scanner(System.in);
	}
}
