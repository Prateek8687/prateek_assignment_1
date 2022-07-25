package TraingularPattern;

import java.util.Scanner;

public class Traingle14 {

	public static void main(String[] args) {
		Scanner t14 = new Scanner(System.in);
		
		System.out.println("Enter any Number: ");
		int n = t14.nextInt();
		
		for(int i = 1; i <= n/2 +1; i++) {
			for(int j = i; j < n; j--) {
				System.out.println(j + " ");
			}
			System.out.println();
		}
	}

}
