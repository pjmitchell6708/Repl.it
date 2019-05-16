package Replit;
import java.util.*;
public class SecondsConverter {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int inputSeconds, hours, minutes, seconds;
		seconds = 0;
		
		System.out.println("Enter seconds:");
		inputSeconds = scan.nextInt();
		
		if (inputSeconds >0)
		seconds = inputSeconds % 60;
		minutes = (inputSeconds % 3600) /60;
		hours = inputSeconds / 3600;
		
		System.out.println(hours +" hours, "+ minutes+ " minutes, and " + seconds + " seconds");
	}

}
