package Replit;
import java.util.Scanner;
public class giveMeFiveDollars {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dollars = 0;
		
		
		while (dollars != 5) {
			System.out.println("Give me $5");
			dollars = scan.nextInt();
			
		}
	System.out.println("Thank you for five dollars ");
	}

}
