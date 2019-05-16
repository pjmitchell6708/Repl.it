package Replit;
import java.util.Scanner;
public class CaffineOverdose {
public static void main(String[] args) {
	int milligrams;
	int death = 10000;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter number of miligrams in drink: ");
	
	milligrams = scan.nextInt();
	
	if (milligrams > 0)
		System.out.println("It would take about " + death / milligrams+ " drinks for a lethal overdose.");
	
				 
	
	
	
}
}
