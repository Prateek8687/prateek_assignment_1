package ifelse;

import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		Scanner p10 = new Scanner(System.in);
		System.out.print("Enter any Alphabate: ");
		char c = p10.next().charAt(0);
		
		if(c >= 'A' && c <= 'Z') {
			System.out.println("This Alphabate is Uppercase..");
		}
		else if(c >= 'a' && c <= 'z') {
			System.out.println("This Alphabate is Lowercase..");
		}
		else {
			System.out.println("This is Not Alphabate..");
		}
	}

}
