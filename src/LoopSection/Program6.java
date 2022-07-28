package LoopSection;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		Scanner p6 = new Scanner(System.in);
		System.out.print("Enter the Any Number: ");
		int num = p6.nextInt();
		int sum = 0;
		
		for(int i=1; i<=num; i++) {
			sum = sum+i;
		}
		System.out.println("Sum of given Number is: " + sum);
	}
}
