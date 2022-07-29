package LoopSection;

import java.util.Scanner;

public class Program46 {

	public static void main(String[] args) {
		Scanner p46= new Scanner(System.in);

		System.out.print("Please Enter Decimal Number =  ");
		int decimal = p46.nextInt();
	
		String BinaryVal = Integer.toBinaryString(decimal);
		System.out.println("Decimal To Binary Result    = " + BinaryVal);
	}

}
