package String_Section;

import java.util.Scanner;

public class Que5 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);

		System.out.print("Please Enter Lowercase String: ");
		String lowerStr = sc.nextLine();
	
		String lowerStr2 = lowerStr.toUpperCase();	
		System.out.println("The Uppercase String  =  " + lowerStr2);
	}
}
