
import java.util.Scanner;
public class StringPalindromeWithOutUsingReverseMethod 
{
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter string to check palindrome: ");
      String strInput = sc.nextLine();
      // converting string to char array
      char[] chString = strInput.toCharArray();       
      // storing reverse string
      String strReverse = "";         
      // reading char by char
      for(int a = chString.length - 1; a >= 0; a--) 
      {
         strReverse = strReverse + chString[a];
      } 
      // printing given string and reversed string
      System.out.println("Given string: " + strInput);
      System.out.println("Reverse String: " + strReverse); 
      // check if given string is palindrome
      if(strInput.equals(strReverse))
      {
         System.out.println("string is palindrome.");
      }
      else
      {
         System.out.println("string is not palindrome.");
      }
   }
}


