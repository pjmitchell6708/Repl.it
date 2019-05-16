package Replit;
import java.util.*;
public class Email1 {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String email = scan.next();
	    
	    if(email.contains("_")) {
	    int	underscore = email.indexOf("_");
	    String lastName = email.substring(underscore+1,email.length()-10);
	    String firstName = email.substring(0,underscore);
	    System.out.println(lastName+"_"+firstName+"@gmail.com");
	    }else {
	    	System.out.println(email);
	    }
	    
	   
	  }
	}

