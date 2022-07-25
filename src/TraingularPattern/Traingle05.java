package TraingularPattern;

import java.util.Scanner;

public class Traingle05 {

	public static void main(String[] args) {
		Scanner t5 = new Scanner(System.in);
		
		System.out.print("Enter Any Number: ");
		int rows = t5.nextInt();
		for(int i=1; i<=rows; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

}
