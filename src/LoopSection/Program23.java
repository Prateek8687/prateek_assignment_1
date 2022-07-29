package LoopSection;

import java.util.Scanner;

public class Program23 {

	public static void main(String[] args) {
		Scanner p23 = new Scanner(System.in);
		System.out.println("Enter Any Number: ");
		int num = p23.nextInt();
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            factorial *= i;
        }
        System.out.print("Factorial of "+ num + " is " +factorial);
	}

}
