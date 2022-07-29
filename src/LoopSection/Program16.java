package LoopSection;

import java.util.Scanner;

public class Program16 {

	public static void main(String[] args) {
		Scanner p16 = new Scanner(System.in);
		System.out.print("Enter Any integer Number: ");
		int num = p16.nextInt();
		int reverse = 0;
		
		while(num != 0) {
		int i = num % 10;
		reverse = reverse * 10 + i;
		num /= 10;
		}
		System.out.println("The reversed number is: " + reverse);
	}

}
