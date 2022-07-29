package LoopSection;

import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		Scanner p8 = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = p8.nextInt();
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			if(i % 2 != 0) {
				sum = sum + i;
			}
		}
		System.out.println("Sum of Odd Number between 1 to " + num + " = " + sum);
	}

}
