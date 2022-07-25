package ifelse;

import java.util.Scanner;

public class Program14 {
	
	public static void main(String[] args) {
		Scanner p14 = new Scanner(System.in);
		System.out.println("Enter Triangle 1st, 2nd, 3rd: ");
		
		int total;
		int a1 = p14.nextInt();
		int a2 = p14.nextInt();
		int a3 = p14.nextInt();
		
		total = a1+a2+a3;
		
		if(total == 180) {
			System.out.println("It's a Valid Triangle.");
		}
		else {
			System.out.println("It's a Not Valid Triangle.");
		}
	}

}
