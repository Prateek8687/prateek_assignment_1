package ifelse;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		Scanner p5 = new Scanner(System.in);
		
		System.out.print("Enter the Number: ");
		int num = p5.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("This Number Even..");
		}
		else {
			System.out.println("This Number is odd..");
		}
	}

}
