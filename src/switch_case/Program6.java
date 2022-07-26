package switch_case;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      System.out.print("Enter The 1st number: ");
	      int a = sc.nextInt();

	      System.out.print("Enter The 2nd number: ");
	      int b = sc.nextInt();

	      System.out.println("Select operation");
	      System.out.println("Addition: Subtraction: Multiplication: Division: ");
	      char ch = sc.next().charAt(0);
	      switch(ch) {
	         case '+' :
	         System.out.println("Sum of the given two numbers: "+(a+b));
	         break;
	         case '-' :
	         System.out.println("Sutract between the two numbers: "+(a-b));
	         break;
	         case '*' :
	         System.out.println("Multiply of the two numbers: "+(a*b));
	         case '/' :
	         System.out.println("division Between two number: "+(a/b));
	         break;
	         default :
	         System.out.println("Invalid grade");
	      }
	}

}
