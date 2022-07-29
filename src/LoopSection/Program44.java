package LoopSection;

import java.util.Scanner;

public class Program44 {

	public static void main(String[] args) {
		int octal, decimal=0, i=0, rem;
	    Scanner p44 = new Scanner(System.in);
	      
	    System.out.print("Enter the Octal Number: ");
	    octal = p44.nextInt();
	      
	    while(octal!=0)
	    {
	    	rem = octal%10;
	        decimal = (int) (decimal + (rem*Math.pow(8, i)));
	        i++;
	        octal = octal/10;
	    }
	      
	    System.out.println("\nEquivalent Decimal Value = " +decimal);
	}

}
