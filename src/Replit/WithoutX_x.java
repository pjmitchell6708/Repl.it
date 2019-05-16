package Replit;
import java.util.*;
public class WithoutX_x {
	public static void  main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    
	    if(word.startsWith("X") || word.startsWith("x")){
	    	
	    	word = word.replaceFirst("X", "");
	    	word = word.replaceFirst("x", "");
	    	if( word.endsWith("X") || word.endsWith("x")  ){
	    	word = word.substring(0, word.length()-1);
	    }
	    	
	   System.out.println(word);
	     }else if (word.endsWith("X") || word.endsWith("x")){
	      word = word.substring(0, word.length()-1);
	      System.out.println(word);
	    }else {
	      System.out.println(word);
	    }
	    
	    }
	    
	  }
	
//Given a string word, if the first or last chars are 'x' or 'X', print the string without those 'x' or 'X' chars,  otherwise print the string unchanged. 
//Example: 
//input: xHiX 
//output: Hi
//Example:
//input: apple 
//output: apple
//input: xUxL
//output: UxL
//input: JavaX
//output: Jav
