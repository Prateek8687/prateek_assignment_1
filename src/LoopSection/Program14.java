package LoopSection;

import java.util.Scanner;

public class Program14 {

	public static void main(String[] args) {
		int digit, sum = 0;  
		Scanner p14 = new Scanner(System.in);  
		System.out.print("Enter Any Integer number: ");  
		int num = p14.nextInt();
		while(num > 0)  
		{  
			digit = num % 10;   
			sum = sum + digit;   
			num = num / 10;  
		}   
		System.out.println("Sum of Digits: "+sum);  
	}
}
