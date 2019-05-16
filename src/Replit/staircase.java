package Replit;

public class staircase {
public static void main(String[] args) {
	
	String asterix = "*";
	int num = 1;
	while (num <= 10) {
		System.out.println(asterix);
		asterix += "*";
		num++;
	}
	
	asterix = "*";
	while (asterix.length() <=10) {
		System.out.println(asterix);
		asterix += "*";
		
	}
}
}
