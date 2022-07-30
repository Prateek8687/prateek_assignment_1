package Methods;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter Second Number: ");
		int num2 = sc.nextInt();
		int max, min;
		max = Math.max(num1, num2);
		min = Math.min(num1, num2);
		System.out.println("Minimum Number is: " + min);
		System.out.println("Maximum Number is: " + max);
	}

}
