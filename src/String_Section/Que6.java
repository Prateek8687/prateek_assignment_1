package String_Section;

import java.util.Scanner;

public class Que6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		System.out.print("Please Enter Lowercase String: ");
		String UperStr = sc.nextLine();
	
		String UperStr2 = UperStr.toLowerCase();	
		System.out.println("The Uppercase String  =  " + UperStr2);
	}

}
