package LoopSection;

import java.util.Scanner;

public class Program31 {

	public static void main(String[] args) {
		Scanner p31 = new Scanner(System.in);
		System.out.print("Enter Any Number: ");
		int num = p31.nextInt();
		
		int originalNumber, remainder, result = 0;

        originalNumber = num;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
	}

}
