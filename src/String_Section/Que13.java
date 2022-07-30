package String_Section;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Que13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String: ");
		String str = sc.nextLine();
		
	    Pattern p = Pattern.compile("\s");
	    String[] temp = p.split(str);
	    String rev = "";
	    for (int i = 0; i < temp.length; i++) {
	    	if (i == temp.length - 1)
	    		rev = temp[i] + rev;
	        else
	        	rev = " " + temp[i] + rev;
	      }
	      System.out.println("The reversed string is: " + rev);
	}

}
