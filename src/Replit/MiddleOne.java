package Replit;
import java.util.Scanner;
public class MiddleOne {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    String word = scan.next();
    char letter1;
    char letter2;
    if (word.length() % 2 == 0 && word.length() >= 4) {
    	
    	letter2 = word.charAt(word.length()/ 2 );
    	letter1 = word.charAt(word.length() / 2 -1);
    	System.out.print(letter1+ "" +letter2);
    	
    	//System.out.println(word.charAt((word.length()-1 / 2)));
    }
    else if (word.length() % 2 != 0 && word.length() >= 3) {
		//letter1 = word.charAt(word.length() / 2 -1);
		letter2 = word.charAt(word.length() / 2  );
		System.out.println( letter2);
	}	
    if (word.length() ==1) {
    	System.out.print(word.charAt(0));
    	System.out.print(word.charAt(0));
    	System.out.print(word.charAt(0));
    }
    else if (word.length() == 2) {
    	System.out.print(word.charAt(0));
    	System.out.print(word.charAt(1));
    	System.out.print(word.charAt(0));
    	System.out.print(word.charAt(1));
    }
}
}
