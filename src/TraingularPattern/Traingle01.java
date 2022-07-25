package TraingularPattern;

import java.util.Scanner;

public class Traingle01 {

	public static void main(String[] args) {
		Scanner t1 = new Scanner(System.in);
		System.out.print("Enter Any Number: ");
		int row = t1.nextInt();
		
		for(int i = 1; i <= row; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
