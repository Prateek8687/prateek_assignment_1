package TraingularPattern;

import java.util.Scanner;

public class Tringle15 {

	public static void main(String[] args) {
		Scanner t15 = new Scanner(System.in);
		System.out.print("Enter The Number: ");
		int n = t15.nextInt();
		for(int i = n; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
