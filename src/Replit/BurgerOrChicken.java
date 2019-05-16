package Replit;
import java.util.Scanner;
public class BurgerOrChicken {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	String in = scan.next();
	
	
	if (in.equalsIgnoreCase("chicken") || in.equalsIgnoreCase ("burger") )
	{
		System.out.println("in =  \""+in+"\"") ;
		System.out.println("output: 1.0");
	}
	if (in.equalsIgnoreCase("soda"))
	{
		System.out.println("in = \"soda\"");
		System.out.println("output: 2.0");
	}
	
	
}
}
