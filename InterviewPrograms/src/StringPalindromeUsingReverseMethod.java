public class StringPalindromeUsingReverseMethod {  
    public boolean isPalindrome(String str){  
        StringBuilder sb=new StringBuilder(str);  
        sb.reverse();  
        String rev=sb.toString();  
        if(str.equals(rev)){  
            return true;  
        }else{  
            return false;  
        }  
    }  
    public static void main(String args[]){
    	StringPalindromeUsingReverseMethod obj=new StringPalindromeUsingReverseMethod();
    	System.out.println(obj.isPalindrome("nitin"));
    	System.out.println(obj.isPalindrome("jatin"));
    }
    }  