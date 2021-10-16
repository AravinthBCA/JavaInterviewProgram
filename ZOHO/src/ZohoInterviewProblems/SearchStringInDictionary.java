package ZohoInterviewProblems;
import java.util.*;
import java.io.*;
import java.util.Arrays;
import java.util.List;
 
class SearchStringInDictionary
{
    public static void wordBreak(List<String> dict, String word, String out)
    {
        if (word.length() == 0)
        {
            System.out.println("("+out+")");
            return;
        }
        for (int i = 1; i <= word.length(); i++)
        {
            String prefix = word.substring(0, i); 
            if (dict.contains(prefix)) {
                wordBreak(dict, word.substring(i), out + " " + prefix);
            }
        }
    }

    public static void main(String[] args)
    {
    	Scanner in = new Scanner(System.in);
    	System.out.println("Enter the number of Test cases: ");
    	int testCase = in.nextInt();
    	System.out.println("Enter the number of string in dictionary: ");
    	int n = in.nextInt();
    	System.out.println("Enter the Dictionary String: ");
    	ArrayList<String> dict = new ArrayList<String>();
    	for (int i = 0; i < n; i++) {
			dict.add(in.next());
		}
    	System.out.println("Enter the search String: ");
    	in.nextLine();
        String word = in.nextLine();
        wordBreak(dict, word, "");
    }
}
