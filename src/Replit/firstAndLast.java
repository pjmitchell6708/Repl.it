package Replit;
import java.util.Scanner;
public class firstAndLast {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	String word = scan.next();
	
	System.out.println(word.charAt(0));
	char lastChar = word.charAt(word.length()-1);
	System.out.println(lastChar);




	}
}
