package String_Section;

import java.util.Scanner;

public class Que11 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str=scan.nextLine();	
		
		char[] ch=str.toCharArray(); 
		
		int j=ch.length;
		for(int i=j; i>0; i--)
		{
			System.out.print(ch[i-1]); 
		}
	}

}
