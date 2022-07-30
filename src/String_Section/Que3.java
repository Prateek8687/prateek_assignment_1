package String_Section;

import java.util.Scanner;

public class Que3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First String: ");
		String s1 = sc.nextLine();
		
		System.out.print("Enter Second String: ");
		String s2 = sc.nextLine();
		
		System.out.println("Concatenate " + "(" + concat(s1,s2) + " )");
	}
	static String concat( String s1,String s2)
	{   
	   String s=s2+','+s1;
	    return s;
	}
}
