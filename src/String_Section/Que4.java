package String_Section;

import java.util.Scanner;

public class Que4 {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	      
	    System.out.print("Enter the First String: ");
	    String str1 = scan.nextLine();
	    System.out.print("Enter the Second String: ");
	    String str2 = scan.nextLine();
	      
	    if(str1.equals(str2))
	       System.out.println("Strings are equal.");
	    else
	       System.out.println("Strings are not equal.");
	}
}
