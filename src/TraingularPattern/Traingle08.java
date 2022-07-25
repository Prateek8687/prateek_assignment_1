package TraingularPattern;

import java.util.Scanner;

public class Traingle08 {

	public static void main(String[] args) {
		Scanner t8 = new Scanner(System.in);
		System.out.print("Enter any Number: ");
		int rows = t8.nextInt();
		
		int k = 1;
		
		for(int i = 1; i<=rows; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(k + " ");
				k++;
			}
			System.out.println();
		}
	}

}
