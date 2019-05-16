package Replit;
import java.util.Scanner;
public class BlackJack {
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	    
	    int house = s.nextInt();
	    int player = s.nextInt();
	    
	    
	    
	    if (player > 21)
	    {
	    	System.out.println("bust");
	    }
	    if (player == house)
	    {
	    	    System.out.println("its a tie");	    	
		}
	    if (player > house && player <=21 && player != house )
	    {
	    System.out.println("player wins");
		}
	    if (house > player && house <= 21 && player != house)
	    {
	    	System.out.println("bust");
	    }
		if (player > )
			
			
			
			
			
			
		}
}
