package Replit;
import java.util.Scanner;
public class VendingMachine {
public static void main(String[] args) {
	
		   int itemPrice, quarters, dimes, nickels;
			itemPrice = 0;
			quarters = 0;
			dimes = 0;
			nickels = 0;
				
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter price in cents:");
			itemPrice = scan.nextInt();
			
			if (itemPrice < 25){
				System.out.println("Invalid price!");
			
			}else if (itemPrice >100) {
				System.out.println("Invalid price!");
			
			
			}else if (itemPrice % 5 != 0) { 
				System.out.println("Invalid Price!");
			
			}else {	
				  quarters = ((100 - itemPrice) / 25);
		    	dimes = ((100 - itemPrice) % 25 ) / 10;
		    	nickels =((100 - itemPrice) % 25 % 10) /5;
		    System.out.print("Your change is " +quarters + " quarters, ");
		    System.out.print( +dimes + " dimes, and ");
		    System.out.print(nickels + " nickels.");
			}
		  }
}
		  
   
    /*quarters = itemPrice % 100;
	itemPrice = itemPrice / 25;
	itemPrice = itemPrice % 10;
	itemPrice = itemPrice / 100;
	nickels = itemPrice % 5;
	itemPrice = itemPrice / 5;*/


