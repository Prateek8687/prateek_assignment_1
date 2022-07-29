package Condational_Operator;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		System.out.print("Please Enter any Character =  ");
		char ch = sc.next().charAt(0);
		
		String result = ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) ?
				ch + " is an Alphabet" : ch + " is Not";
		
		System.out.println(result);
	}

}
