package LoopSection;

import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		Scanner p10 = new Scanner(System.in);
		System.out.print("Enter Any Number: ");
		int num = p10.nextInt();
		int count =0;
		
		while(num > 0) {
			num = num/10;
			count = count +1;
		}
		System.out.println("Number of degit is: " + count);
	}

}
