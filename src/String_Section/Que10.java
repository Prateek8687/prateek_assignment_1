package String_Section;

import java.util.Scanner;

public class Que10 {

	public static void main(String[] args) {
		int totalWords =1;
		char TWord_ch;
		
		Scanner sc= new Scanner(System.in);

		System.out.print("Please Enter String: ");
		String strTWords = sc.nextLine();
		
		for(int i = 0; i < strTWords.length(); i++)
		{
			TWord_ch = strTWords.charAt(i);
			if((TWord_ch == ' ' ) || TWord_ch == '\t') {
				totalWords++;
			}
		}		
		System.out.print("Total Number of Words  =  " + totalWords);
	}

}
