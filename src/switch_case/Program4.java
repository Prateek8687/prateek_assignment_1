package switch_case;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Scanner p4 = new Scanner(System.in);
		System.out.print("Enter First Integer Number: ");
		int num1 = p4.nextInt();
		
		System.out.print("Enter Second Integer Number: ");
		int num2 = p4.nextInt();
		
		switch (num1 > num2) {
		case 0:
			System.out.println("The Maximum Number is: " + num1);
			break;
			
		case 1:
			System.out.println("The Maximum Number is: " + num2);
			break;
		}
	}

}
