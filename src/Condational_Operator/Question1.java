package Condational_Operator;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please Enter the First Number : ");
		int num1 = sc.nextInt();	
		
		System.out.print("Please Enter the Second Number : ");
		int num2 = sc.nextInt();	
		int  largest;
		
		if(num1 == num2) 
	    {
			System.out.println("\n Both are Equal");     
	    }
		else
		{
			largest = (num1 > num2)? num1: num2;
			System.out.println("The Largest Number = " + largest);   
		}
	}

}
