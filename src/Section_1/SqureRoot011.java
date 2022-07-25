package Section_1;

import java.util.Scanner;

public class SqureRoot011 {

	public static void main(String[] args) {
		double num, sqrt;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the any number: ");
		
		num = sc.nextDouble();
		sqrt = Math.sqrt(num);
		
		System.out.println("The Squre of given number is: "+num+ " = " + sqrt);
		
	}
}
