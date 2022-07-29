package LoopSection;

import java.util.Scanner;

public class Program45 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a octal Value : ");
        String input1=sc.next();
        int octal = Integer.parseInt(input1, 8);
        String output = Integer.toHexString(octal);
        System.out.println("Converted hexadecimal is :"+output);
	}
}
