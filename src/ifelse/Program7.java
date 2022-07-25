package ifelse;

import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		Scanner p7 = new Scanner(System.in);
		System.out.print("Enter the character: ");
		char c = p7.next().charAt(0);
		
		if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
			System.out.println("it is Alphabate....");
		}
		else {
			System.out.println("it is not Alphabate...");
		}
	}

}
