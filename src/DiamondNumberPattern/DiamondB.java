package DiamondNumberPattern;

import java.util.Scanner;

public class DiamondB {

	public static void main(String[] args) {
		Scanner dB = new Scanner(System.in);
		System.out.print("Enter The Number: ");
		int n = dB.nextInt();
		
		for(int i = 1; i <= n; i++) {
			
			for(int k = 1; k <= i *2 - 1; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
		for(int i = n; i >= 1; i--) {
			
			for(int k = 1; k <= i * 2-1; k++) {
				System.out.print(k + " ");
				n--;
			}
			System.out.println();
		}
	}
}
