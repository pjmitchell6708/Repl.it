package Replit;
import java.util.Scanner;
public class VideoGameCoupon {
public static void main(String[] args) {
	int coupons, candies, gumballs;
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter number of coupons:");
	coupons = scan.nextInt();
	candies = 10;
	gumballs = 3;
	
	if (coupons >= 10) {
		candies = coupons /10 ;
		gumballs = (coupons % 10)  / 3;
		
		System.out.println("Number of Candies: "+candies);
		System.out.println("Number of Gumballs: " +gumballs);
	
	}else { 
		System.out.println("Not enough coupons");
		
	}
	
}
}
