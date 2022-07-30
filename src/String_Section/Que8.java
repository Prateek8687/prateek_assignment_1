package String_Section;

import java.util.Scanner;

public class Que8 {

	public static void main(String[] args) {
		int alph, digi, spl;
		alph = digi = spl = 0;
		char ch;
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Alpha Numeric Special String: ");
		String disp_str = sc.nextLine();
		
		for(int i = 0; i < disp_str.length(); i++)
		{
			ch = disp_str.charAt(i);
			if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' ) {
				alph++;
			}
			else if(ch >= '0' && ch <= '9') {
				digi++;
			}
			else {
				spl++;
			}
		}		
		System.out.println("Number of Alphabet Characters: " + alph);
		System.out.println("Number of Digit Characters: " + digi);
		System.out.println("Number of Special Characters: " + spl);
	}

}
