package Replit;

public class CheckIfInArray {
public static void main(String[] args) {
	
	int n = 55;
	int nums [] = {22,33,55,22,11,90};
	boolean present = false;
	for (int num :nums  ) {
	if (num == n) {
		present = true;
		break;
	}	
	}
	System.out.println("is n present"+ present);
}
}
