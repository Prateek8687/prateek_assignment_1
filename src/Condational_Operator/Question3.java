package Condational_Operator;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner que3 = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = que3.nextInt();

        String evenOdd = (num % 2 == 0) ? "even" : "odd";

        System.out.println(num + " is " + evenOdd);
	}
}
