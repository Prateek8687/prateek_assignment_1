package TraingularPattern;

import java.util.Scanner;

public class Traingle10 {

	public static void main(String[] args) {
		Scanner t10 = new Scanner(System.in);
		System.out.print("Enter any Number: ");
		int n = t10.nextInt();
		
		int k = 1;
		for(int i = 1; i <= n; i++) {
			k = i;
			for(int j = 1; j <= i; j++) {
				System.out.print(k + " ");
				k = k + n - j;
			}
			System.out.println();
		}
	}

}
