package LoopSection;

import java.util.Scanner;

public class Program15 {

	public static void main(String[] args) {
		int digit, pro = 1;  
		Scanner p15 = new Scanner(System.in);  
		System.out.print("Enter Any Integer number: ");  
		int num = p15.nextInt();
		while(num > 0)  
		{  
			digit = num % 10;   
			pro = pro * digit;   
			num = num / 10;  
		}   
		System.out.println("Product of Digits: "+pro);
	}

}
