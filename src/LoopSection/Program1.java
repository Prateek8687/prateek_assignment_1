package LoopSection;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner p1 = new Scanner(System.in);
		System.out.print("Enter The netural number: ");
		int num = p1.nextInt();
		for(int i=1; i<=num; i++) {
			System.out.println(i);
		}
	}

}
