package String_Section;

import java.util.Scanner;

public class Que18 {

	public static void main(String[] args) {
		System.out.print("Enter a string: ");
	    Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	    
	    char character = sc.nextLine().charAt(0);
	    int count = 0;

	    for (int i=0; i<str.length(); i++){
	       if(character == str.charAt(i)){
	          count++;
	       }
	    }
	    System.out.println("Frequency of the give String: " +count);
	}
}