package TraingularPattern;

import java.util.Scanner;

public class Traingle09 {

	public static void main(String[] args) {
		Scanner t9 = new Scanner(System.in);
		
		System.out.print("Enter the Number: ");
		int n = t9.nextInt();
		
		int k = 1;
		
		for(int i = 1; i <= n; i++) {
			k =i; 
			for(int j =1; j <= i; j++) {
				System.out.print(k + " ");
				k = k + n-1;
			}
			System.out.println();
		}
	}

}
