package LoopSection;

import java.util.Scanner;

public class Program41 {

	public static void main(String[] args) {
		Scanner p40 = new Scanner(System.in);
		System.out.println("Enter Binary Number: ");
		String binary = p40.next();
	    int decimal = Integer.parseInt(binary, 2);
	    System.out.println("Decimal value of the binary number is: " + decimal);
	}

}
