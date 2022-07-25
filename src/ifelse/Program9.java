package ifelse;

import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		Scanner p9 = new Scanner(System.in);
		System.out.print("Enter any C D S: ");
		char c = p9.next().charAt(0);
		
		if((c >= 'a' && c <= 'z') || c >= 'A' && c <= 'Z') {
			System.out.print("it is Alphabate..");
		}
		else if(c >= '0' && c <= '9') {
			System.out.println("It is Degit Number...");
		}
		else {
			System.out.println("It is Special Character...");
		}
	}

}
