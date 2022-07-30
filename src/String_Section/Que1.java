package String_Section;

import java.util.Scanner;

public class Que1 {

	public static void main(String[] args) {
		
	      int len=0;
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.print("Enter the String: ");
	      String str = sc.nextLine();
	      
	      char[] strChars = str.toCharArray();
	      for(char ch: strChars)
	         len++;
	      
	      System.out.println("Length of the String = " +len);
	}

}
