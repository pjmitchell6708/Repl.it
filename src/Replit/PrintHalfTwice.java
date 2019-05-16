package Replit;
import java.util.*;
public class PrintHalfTwice {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	   String chars= word.substring(0,word.length()/2);
	   System.out.print(chars+chars);
	  }
	}