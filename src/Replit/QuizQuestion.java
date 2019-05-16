package Replit;
import java.util.Scanner;
public class QuizQuestion {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    
	    
	    System.out.println("what is the farthest planet in the solar system:" );
	    System.out.println("a)venus" );
	    System.out.println("b)pluto" );
	    System.out.println("c)neptune" );
	    
	   String planet = scan.next();
	   
	   switch (planet) 
	   { case "a":
		   System.out.println(planet + " is wrong");
		   break;
	   case "b":
		   System.out.println(planet + " is correct");
		   break;
	   case "c":
		   System.out.println(planet + " is wrong");
		   break;
	   }
	   
	    
	    
	    
	    //your code here

	  

	    
	  }
	}