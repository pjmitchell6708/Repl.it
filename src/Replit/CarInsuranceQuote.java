package Replit;
import java.util.*;
public class CarInsuranceQuote {
	public static void main(String[] args) {
	    //DO NOT CHANGE
	    double premium = 0;
			int age = 0;
	    	int zipCode= 0;
	    	int accidentsAmount = 0;
			int daysDrivenToWorkOrSchool = 0;
			int milesToWorkOrSchool = 0;
			String vehicleOwnership = "";
			String vehicleUsage = "";
			String continuousInsurance = "";
			String education = "";
			String name = "";
			String referenceNumber = "";
			String driversLicense = "";
			Scanner scan = new Scanner(System.in);
			
			
			System.out.println("Welcome to the CountyFarm car insurance!");
	    
			System.out.println("Enter your name");
			name = scan.nextLine();
			
			System.out.println("Do you have a US drivers license?");
			driversLicense = scan.next();
			if (driversLicense.equalsIgnoreCase("no")){
				System.out.println("Invalid data!");
				System.exit(0);;
			}else {
			System.out.println("Please enter your zip code");
			}
			zipCode = scan.nextInt();
			if(zipCode == 20910 ) {
				premium = 60;
			}else if(zipCode == 20740) {
			premium = 60;	
			}else{ 
				premium = 50;
			}
			
			if(zipCode == 22102) {
				premium = 30;
			}else if(zipCode == 22103) {
				premium = 30;
			}else{ 
				premium = 50;
			}
			
			System.out.println("Is this vehicle Owned, Financed, or Leased?");
			vehicleOwnership = scan.nextLine();
			if(vehicleOwnership.equalsIgnoreCase("owned")) {
				premium += 10;
			}else {
				premium+= 20;
			}
			System.out.println("How is this vehicle primarily used?");
			vehicleUsage = scan.nextLine();
			if(vehicleUsage.equalsIgnoreCase("business")) {
				premium+= 50;
			}else if(vehicleUsage.equalsIgnoreCase("pleasure")) {
				premium +=10;
			}else if(vehicleUsage.equalsIgnoreCase("commute")) {
				premium += 20;
			}else { 
				System.out.println("Error: Invalid Vehicle Usage Entered");
			}
			
			System.out.println("Days Driven To Work And/Or School");
			daysDrivenToWorkOrSchool = scan.nextInt();
			premium += daysDrivenToWorkOrSchool;
			
			System.out.println("Miles Driven To Work And/Or School");
			milesToWorkOrSchool = scan.nextInt();
			premium += milesToWorkOrSchool;
			
			System.out.println("How old are you?");
			age = scan.nextInt();
			if (age < 16) {
				System.out.println("Invalid Data!");
				System.exit(0);
			}if (age >= 16 && age <18) {
				premium *= 20;
			}else if (age >= 18 && age <= 21) {
				premium *= 6;
			}else if(age >21 && age < 25) {
				premium *= 2;
			}else {
				System.out.println("Invalid age!");
			} 
			System.out.println("Please enter # of years of driving experience");
				int experience = scan.nextInt();
			if(experience > 0 && age - experience >= 16) {
				premium = premium - experience *5;
			}else {
				System.out.println("Invaid data!");
				System.exit(0);
			}
			System.out.println("Have you had any accidents in the last 5 years?");
			String accidents = scan.next();
			if (accidents.equalsIgnoreCase("yes")) {
				System.out.println("How many?");
				accidentsAmount = scan.nextInt();
				premium = accidentsAmount * .2;
			}
			
			System.out.println("Have you had continuous insurance for the past 12 months?");
			continuousInsurance = scan.next();
			if (continuousInsurance.equalsIgnoreCase("no")) {
				premium *= 2;
			}
			
			System.out.println("What is the highest level of education you have completed?");
			education = scan.nextLine();
			if(education.equalsIgnoreCase("PhD")) {
				premium = premium * -.05;
			}else if(education.equalsIgnoreCase("Bachelors")){
				premium = premium * -.05;
			}else if(education.equalsIgnoreCase("Masters")){
				premium = premium * -.05;
			}else if(education.equalsIgnoreCase("Doctors")){
				premium = premium * -.1;
			}else if(education.equalsIgnoreCase("Less than High School")) {
				premium = premium * .05;
			}
			
			System.out.println(name+", here's your quote");
			System.out.println("Start Your Policy Today For: "+ premium);
			referenceNumber = name.toUpperCase().substring(0,1)+age + name.toUpperCase().substring
					(name.length()-2, name.length()-1)+ zipCode +education.toUpperCase();
			System.out.println(referenceNumber);
			System.exit(0);
	
	}
	}

