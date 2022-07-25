package ifelse;

import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		Scanner p8 = new Scanner(System.in);
		System.out.print("Enter a Character: ");
		char c = p8.next().charAt(0);
		
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
			System.out.println("This Character is Vowel...");
		}
		else {
			System.out.println("This Character is Consonant...");
		}
	}

}
