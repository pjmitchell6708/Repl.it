package Replit;
import java.util.*;
public class Email2 {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String email = scan.next();
	    
	   int underscore = email.indexOf("_");
	    String firstName = email.substring(0, underscore);
	    String lastName = email.substring(underscore+1, email.length()-10);
	   int atSymbol = email.indexOf("@");
	    String domain = email.substring(atSymbol+1,email.length()-4);
	    String topLevelDomain = email.substring(email.length()-3, email.length());
	    
	    System.out.println("Output:");
	    System.out.println("First name: "+ firstName);
	    System.out.println("Last name: "+ lastName);
	    System.out.println("Domain: "+domain);
	    System.out.println("Top-level Domain: "+ topLevelDomain);
	    
	  }
	}
