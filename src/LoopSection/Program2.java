package LoopSection;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner p2 = new Scanner(System.in);
		System.out.print("Enter The Natural Number: ");
		int num = p2.nextInt();
		
		int i = num;
		while(i >= 1) {
			System.out.print(i + " ");
			i--;
		}
	}

}
