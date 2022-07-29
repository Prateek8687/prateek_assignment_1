package LoopSection;

import java.util.Scanner;

public class Program21 {

	public static void main(String[] args) {
		Scanner p21 = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int num = p21.nextInt();
		
		System.out.println("Enter Second Number: ");
		int num2 = p21.nextInt();
		
        int res = 1;

        for (int i = num2; i > 0; i--) {
            res *= num;
        }
        System.out.println ("The calculation of the power of N number is " + num + "^" + num2 + " = " + res);
	}

}
