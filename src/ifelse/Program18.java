package ifelse;

import java.util.Scanner;

public class Program18 {

	public static void main(String[] args) {
		Scanner p18 = new Scanner(System.in);
		System.out.print("Enter Cost Price: ");
		double cp = p18.nextDouble();
		
		System.out.print("Enter Sell Price: ");
		double sp = p18.nextDouble();
		
		if(cp - sp > 0) {
			System.out.println("Are Yaar Loss ho gya: " + (cp - sp) + " ka ");
		}
		else if(cp - sp < 0) {
			System.out.println("Are waah Profit hua: " + (sp - cp) + " ka ");
		}
		else {
			System.out.println("Na Profit hua... Na Loss hua...");
		}
	}

}
