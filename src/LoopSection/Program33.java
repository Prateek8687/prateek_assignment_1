package LoopSection;

import java.util.Scanner;

public class Program33 {

	public static void main(String[] args) {
		Scanner p33 = new Scanner(System.in);
		System.out.print("Enter any Number: ");
		int num = p33.nextInt();
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				sum += i;
			}
		}
		if(sum == num) {
			System.out.println(num + "is perfect Number");
		}
		else {
			System.out.println(num + " is Not perfect Number");
		}
	}

}
