package DiamondNumberPattern;

import java.util.Scanner;

public class DiamondC {

	public static void main(String[] args) {
		Scanner dC = new Scanner(System.in);
		System.out.print("Enter The Number: ");
		int n = dC.nextInt();
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print(j + " ");
			}
			for(int k = i - 1; k >= 1; k--) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
		for(int i = n-1; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			for(int k = i-1; k >= 1; k--) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}

}
