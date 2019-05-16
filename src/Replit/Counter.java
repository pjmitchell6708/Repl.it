package Replit;
import java.util.Scanner;
public class Counter {
public static void main(String[] args) throws InterruptedException {
		int number = 100;
	
		while (number >=1) {
			System.out.println(number);
		--number;
		Thread.sleep(1000);
	}
	//System.out.println(number);

}	
}
