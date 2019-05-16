package Replit;
import java.util.Scanner;
public class LongestWord {
	public static void main(String[] args) {
	    //DO NOT CHANGE
	    Scanner scan = new Scanner(System.in);
	    String word1 = scan.next();
	    String word2 = scan.next();
	    int word1Length = 0;
	    int word2Length = 0;
	    
	    word1Length = (word1.length());
	    word2Length = (word2.length());
	    
	    if (word1Length > word2Length)
	    {
	    	System.out.println(word1);
	    }
	    else 
	    {
	    	System.out.println(word2);
	    }
	    
	    
	    
	    
 }
}

