package LoopSection;

import java.util.Scanner;

public class Program40 {

	public static void main(String[] args) {
		Scanner p40 = new Scanner(System.in);
		System.out.print("Enter The Binary Number: ");
		int bin = p40.nextInt();
		int i=1;
		int oct[] = new int[100];
		while(bin != 0) {
			oct[i++] = bin % 8;
			bin = bin/8;
		}
		for(int j = i-1; j>0; j--) {
			System.out.print(oct[j]);
		}
	}

}
