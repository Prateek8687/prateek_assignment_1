package LoopSection;

import java.util.Scanner;

public class Program11 {

	public static void main(String[] args) {
		Scanner p11 = new Scanner(System.in);
		System.out.print("Enter Any Number: ");
		int num = p11.nextInt();
		int FirstDegit, LastDegit, sum;
		FirstDegit = num;
		while(FirstDegit >= 10) {
			FirstDegit =FirstDegit / 10;
		}
		LastDegit = num % 10;
		
		System.out.println("The First Degit Number " + num + " = " + FirstDegit);
		System.out.println("The Last Degit Number " + num + " = " + LastDegit);
		sum = FirstDegit + LastDegit;
		System.out.println(sum);
	}

}
