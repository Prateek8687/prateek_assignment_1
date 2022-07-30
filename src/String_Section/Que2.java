package String_Section;

import java.util.Scanner;

public class Que2 {

	public static void main(String[] args) {
		String strOrig;
	    Scanner sc = new Scanner(System.in);
	 
	    System.out.print("Enter a String : ");
	    strOrig = sc.nextLine();
	      
	    System.out.print("Copying String...");
	      
	    StringBuffer strCopy = new StringBuffer(strOrig);
	      
	    System.out.println("String Copied Successfully..!!");      
	    System.out.println("The Copied String is " + strCopy);
	}

}
