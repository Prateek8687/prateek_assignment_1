package LoopSection;

import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) {
		Scanner p12 = new Scanner(System.in);
		System.out.print("Enter Any Number: ");
		int num = p12.nextInt();
		int FirstDegit, LastDegit, sum;
		FirstDegit = num;
		while(FirstDegit >= 10) {
			FirstDegit =FirstDegit / 10;
		}
		LastDegit = num % 10;
		
		System.out.println("The First Degit Number " + num + " = " + FirstDegit);
		System.out.println("The Last Degit Number " + num + " = " + LastDegit);
		sum = FirstDegit + LastDegit;
		System.out.println("Sum of 1st degit & LastDegit Number is: " + sum);
	}

}
