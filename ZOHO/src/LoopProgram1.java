import java.util.*;
import java.io.*;

public class LoopProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j = 0;
		for(i=0;i<999;i+=3){
			j=i--;
			for(j=1;j<i;j*=3){
			}
		}
		System.out.println("Your Output is: "+j);
	}

}
