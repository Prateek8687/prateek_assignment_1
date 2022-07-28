package LoopSection;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Scanner p4 = new Scanner(System.in);
		System.out.print("Enter The Number: ");
		int num = p4.nextInt();	
		int i = 2;
		while(i <=num) {
			System.out.print(i + " ");
			i = i+2;
		}
	}
}
