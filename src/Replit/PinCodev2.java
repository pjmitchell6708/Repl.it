package Replit;
import java.util.Scanner;
public class PinCodev2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int pinCode = 0;
		int secretCode = 1234;
		int attempts = 0;
		
		while (attempts <=3 && pinCode != secretCode) {
			System.out.println("Enter Pin Code");
			pinCode = scan.nextInt();
			attempts++;
			
			if (attempts == 3 &&  pinCode != secretCode) {
				System.out.println("card is blocked");
				return;
			}
			
			
			
		}
		
		System.out.println("Acess Granted");
		
		
	}

}
