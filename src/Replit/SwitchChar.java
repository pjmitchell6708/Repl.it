package Replit;
import java.util.Scanner;
public class SwitchChar {
public static void main(String[] args) {
		
	System.out.println("Enter command:");
	Scanner scan = new Scanner(System.in);
	char response = scan.next().charAt(0);
	switch(response)
	{
		case ('y'):
			System.out.println("Your request is being processed");
		break;
		case ('n'):
			System.out.println("Thank you anyway for your consideration");
		break;
		case ('h'):
			System.out.println("Sorry, no help is currently available");
		break;
		default: System.out.println("Invalid entry, please try again!");
		return;
	
	
	}









}
}
