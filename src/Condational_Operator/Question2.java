package Condational_Operator;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter First Number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter Third Number: ");
        int num3 = scanner.nextInt(); 
        scanner.close();
        
        int result, temp;
        
        temp = num1 > num2 ? num1 : num2;
        result = num3 > temp ? num3 : temp;
        System.out.println("Largest Number is: " + result);
	}
}
