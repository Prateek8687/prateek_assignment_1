package LoopSection;

import java.util.Scanner;

public class Program25 {

	public static void main(String[] args) {
		
	      Scanner p25 = new Scanner(System.in);
	      System.out.print("Enter first number : ");
	      int num1 = p25.nextInt();
	      System.out.print("Enter second number : ");
	      int num2 = p25.nextInt();
	      
	      int hcf = 0;
	      for(int i = 1; i <= num1 || i <= num2; i++) {
	         if( num1 % i == 0 && num2 % i == 0 )
	         hcf = i;
	      }
	      System.out.println("HCF of given two numbers is :"+hcf);
	}

}
