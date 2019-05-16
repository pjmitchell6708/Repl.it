package Replit;
import java.util.Scanner;

public class FunHouse {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	
	
	
	System.out.println("Enter your height in feet");
	int heightFeet = scan.nextInt();
	
	System.out.println("Enter your height in inches");
	int heightInches = scan.nextInt();
	
	
	if(heightFeet >= 5 && heightInches >= 5) {
		System.out.println("Your are tall");
    }else {
    	System.out.println("You are a short ");
    }
    	
	
	
	
}
}
