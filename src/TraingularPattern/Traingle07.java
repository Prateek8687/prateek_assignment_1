package TraingularPattern;

import java.util.Scanner;

public class Traingle07 {

	public static void main(String[] args) {
		Scanner t7 = new Scanner(System.in);
		
		System.out.print("Enter any number: ");
		int rows = t7.nextInt();
		
		for(int i = rows; i >= 1; i--) {
			for(int j=1; j <= i; j++) {
				System.out.print(j +" ");
			}
			System.out.println();
		}

	}

}
