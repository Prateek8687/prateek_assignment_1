package LoopSection;

import java.util.Scanner;

public class Program43 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		System.out.print("Please Enter Octal Number =  ");
		String octalString = sc.nextLine();
	
		int decimalVal = Integer.parseInt(octalString, 8);
		String binaryVal = Integer.toBinaryString(decimalVal);
		
		System.out.println("Octal To Binary number = " + binaryVal);
		
	}

}
