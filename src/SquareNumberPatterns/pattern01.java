package SquareNumberPatterns;

import java.util.Scanner;

public class pattern01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any Number: ");
		int n = sc.nextInt();
		for(int i = 1; i < n; i++)
		{
			for(int j = 1; j < n; j++)
			{
				System.out.print(1);
			}
			System.out.println();
		}
	}
}
