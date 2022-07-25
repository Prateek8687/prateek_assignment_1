package ifelse;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner p3 = new Scanner(System.in);
		System.out.print("Enter The Number: ");
		int number = p3.nextInt();
		
		if(number > 0) {
			System.out.print("The Number is Positive");
		}
		else if(number < 0) {
			System.out.print("The Number is Negative: ");
		}
		else {
			System.out.println("The Number is Zero: ");
		}
	}

}
