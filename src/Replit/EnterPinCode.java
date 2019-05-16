package Replit;
import java.util.Scanner;
public class EnterPinCode {
	public static void main(String[] args) {
		
	
	Scanner scan = new Scanner(System.in);
	int secretCode = 1234;
	int pinCode = 0;
	
	while (pinCode != secretCode) {
		System.out.println("Enter pincode");
		pinCode = scan.nextInt();
	}
		
	System.out.println("Access Granted");
	
	
		

		}

}
