package LoopSection;

import java.util.Scanner;

public class Program13 {

	public static void main(String[] args) {
		Scanner p13 = new Scanner(System.in);
		System.out.print("Enter Any Number: ");
		int num = p13.nextInt();
		int FirstDegit, LastDegit;
		FirstDegit = num;
		while(FirstDegit >= 10) {
			FirstDegit =FirstDegit / 10;
		}
		LastDegit = num % 10;
		
		System.out.println("The First Degit Number " + num + " = " + FirstDegit);
		System.out.println("The Last Degit Number " + num + " = " + LastDegit);
		
		int temp = FirstDegit;
		FirstDegit = LastDegit;
		LastDegit = temp;
		
		System.out.println("After Swap Number " + FirstDegit);
		System.out.println("After Swap Number " + LastDegit);
	}

}
