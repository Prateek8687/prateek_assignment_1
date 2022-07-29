package LoopSection;

import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		Scanner p7 = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = p7.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			if(i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("Sum of even Number between 1 to " + num + " = " + sum);
	}
}
