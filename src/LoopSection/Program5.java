package LoopSection;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		Scanner p5 = new Scanner(System.in);
		System.out.print("Enter The Number: ");
		int num = p5.nextInt();
		
		int i =1;
		while(i <= num) {
			System.out.print(i + " ");
			i = i+2;
		}
	}
}
