package Replit;
import java.util.Scanner;
public class laptopConfigurator {
	public static void main(String[] args) {
		String screenSize = "";
		String cpu = "";
		int ram = 0;
		String storageType = "";
		String screenResolution = "";
		int memorySize = 0;
		double total= 0.0;
	
	
	Scanner scan = new Scanner(System.in);
	
	
	System.out.print("Select screen size:");
	screenSize = scan.next(); 
	switch(screenSize)
	
	{
		
		case("13.3"):
			total += 200;
			break;
		case("15.0"):
			total += 300;
			break;
		case("17.3"):
			total += 400;
			break;
		default: System.out.println("Invalid choice");
	}
	System.out.println(total);
	System.out.print("Select CPU type:");
	cpu = scan.next();
	switch (cpu)
	{
		case("i3"):
			total += 150;
			break;
		case("i5"):
			total += 250;
			break;
		case("i7"):
			total += 350;
			break;
		default: System.out.println("Invalid choice");
		
	}
	System.out.println(total);
	System.out.print("Select RAM size:");
	ram = scan.nextInt();
	total = total + ram /  4 * 50;
	System.out.println(total);
	System.out.println("Select storage type:");
	storageType = scan.next();
	switch(storageType)
	{
		case "SSD":
			storageType = "SSD";
			break;
		case "HDD":
			storageType = "HDD";
			break;
		default: System.out.println("Invalid choice");
			
	}
	System.out.println(total);
	System.out.println("Enter memory size:");
	
	memorySize = scan.nextInt();
	
	if (storageType.equals("SSD"))
	{
	memorySize = memorySize * 100 /500;
	total = total + memorySize;
	}
	else if (storageType.equals("HDD"));
	memorySize = memorySize * 50 / 500;
	total = total + memorySize;
	System.out.println(total);
	System.out.println("Enter screen resolution:");
	screenResolution = scan.next();
	if (screenResolution.equals ("FULLHD"))
	{
		total = total +100;
	}
	else if (storageType.equals("4K"));
		total = total +200;
		
	System.out.println("Laptop price is: "+ total);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}

