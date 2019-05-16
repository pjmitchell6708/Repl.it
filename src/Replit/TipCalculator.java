package Replit;
import java.util.Scanner;
public class TipCalculator {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	double checkPerPerson = 0.0;
	double tipPerPerson = 0.0;
	double totalTip = 0.0;
	String split = "";
	
	
	String symbolPeople = "";
	System.out.println("Split:");
	split = scan.next();
	
	System.out.println("Number of people:");
	int noPeople = scan.nextInt();
	
	System.out.println("Check amount:");
	double total = scan.nextDouble();
	
	System.out.println("Service Quality:");
	String service = scan.next();
	
	
	switch (service) 	
	{
			
		case "Poor":
			totalTip = total *.05;
			break;
		
		case "Fair":
			totalTip = total *.10;
			break;	
		
		case "Good":
			totalTip = total *.15;
			break;
		
		case "Great":
			totalTip = total *.20;
			break;
		
		case "Excellent":
			totalTip = total *.25;
			break;
		
		default: 
			System.out.println("Invalid option");
	}
	
	switch (split)
	{
	
	case "Yes":
			tipPerPerson = totalTip / noPeople;
			checkPerPerson = (total / noPeople) + tipPerPerson;
			total = total + totalTip;
			break;
			 
	case "No":
			checkPerPerson = total;
			tipPerPerson = totalTip;
			total = total + totalTip;
			break;
		
	}
	
	switch (noPeople) 
	{
		case 1:
			symbolPeople = "&";
			break;
		case 2: 
			symbolPeople = "&&";
			break;
		case 3:
			symbolPeople = "&&&";
			break;
		case 4: 
			symbolPeople = "&&&&";
			break;
		case 5:
			symbolPeople = "&&&&&";
			break;
		case 6: 
			symbolPeople = "&&&&&&";
			break;
		case 7:
			symbolPeople = "&&&&&&&";
			break;
		case 8: 
			symbolPeople = "&&&&&&&&";
			break;
		case 9:
			symbolPeople = "&&&&&&&&&";
			break;
		case 10: 
			symbolPeople = "&&&&&&&&&&";
			break;
			
	}	
	
	System.out.println("Number of people entered: " + symbolPeople);
	System.out.println("Total to pay: " + total);
	System.out.println("Total tip: " + totalTip);
	System.out.println("Total per person: "+ checkPerPerson);
	System.out.println("Tip per person: "+ tipPerPerson);
	
		
	
	
	
	
	
}
}




/*Write your code inside the method.
Use the values given as method parameters.
Assign final values.
Then user should select service quality that will correspond to tip percent.
Poor = 5%
Fair = 10%
Good = 15%
Great = 20%
Excellent = 25% 
The program should display the following information based on the user input: 
Split or No split
Number of people entered: &&&&
Service Quality: 
Total to pay:
Total tip:
Total per person:
Tip per person:*/