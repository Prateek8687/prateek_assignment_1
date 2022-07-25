package TraingularPattern;

import java.util.Scanner;

public class Traingle06 {

	public static void main(String[] args) {
		Scanner t6 = new Scanner(System.in);
		System.out.print("Enter The Number: ");
		int n = t6.nextInt();
		
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print(j);
			}
			for(int j = i*2; j < n*2; j++) {
				System.out.print(" ");
			}
			for(int l = i; l>=1; l--) {
				System.out.print(l);
			}
			System.out.println();
		}
	}

}
