package LoopSection;

import java.util.Scanner;

public class Program17 {

	public static void main(String[] args) {
		Scanner p17  = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = p17.nextInt();
		
		int reverseNum = 0, remainder;
	    int number = num;
	    
	    while (num != 0) {
	      remainder = num % 10;
	      reverseNum = reverseNum * 10 + remainder;
	      num /= 10;
	    }

	    if (number == reverseNum) {
	      System.out.println("This " + number + " is Palindrome.");
	    }
	    else {
	      System.out.println("This " + number + " is not Palindrome.");
	    }
	}

}
