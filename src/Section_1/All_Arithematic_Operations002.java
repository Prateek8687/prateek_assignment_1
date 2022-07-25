package Section_1;

import java.util.Scanner;

public class All_Arithematic_Operations002 {

	public static void main(String[] args) {
		int num1, num2;
		int sum, sub, mul, mod;
		float div;
		Scanner op = new Scanner(System.in);
		
		System.out.print("Enter The First Number: ");
		num1 = op.nextInt();
		
		System.out.print("Enter The Second Number: ");
		num2 = op.nextInt();
		
		sum = num1 + num2;
		sub = num1 - num2;
		mul = num1 * num2;
		mod = num1 % num2;
		div = num1/num2;
		
		System.out.println("Sum is: = "+sum);
		System.out.println("Subtract is: = "+sub);
		System.out.println("Multiply is: = "+mul);
		System.out.println("Modulus is: = "+mod);
		System.out.println("Division is: = "+div);
		
	}
}
