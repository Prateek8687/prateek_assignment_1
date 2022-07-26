package switch_case;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		boolean isVowel=false;
		Scanner p3 = new Scanner(System.in);
		System.out.println("Enter a character : ");
		char ch = p3.next().charAt(0);
		
		switch(ch)
		{
		   case 'a' :
		   case 'e' :
	       case 'i' :
		   case 'o' :
		   case 'u' :
		   case 'A' :
		   case 'E' :
		   case 'I' :
		   case 'O' :
		   case 'U' : 
			   isVowel = true;
		}
		if(isVowel == true) {
		   System.out.println(ch+" is  a Vowel");
		}
		else {
		   if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
			System.out.println(ch+" is a Consonant");
		   else
			System.out.println("Input is not an alphabet");		
	        }
	}

}
