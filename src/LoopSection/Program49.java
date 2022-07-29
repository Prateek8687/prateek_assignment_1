package LoopSection;

import java.util.Scanner;

public class Program49 {

	public static void main(String[] args) {
		Scanner p49 = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = p49.nextInt();
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(" * " + " ");
			}
			System.out.println();
		}
	}

}
