package LoopSection;

import java.util.Scanner;

public class Program47 {

	public static void main(String[] args) {
		Scanner p47 = new Scanner( System.in );
	    System.out.print("Enter a decimal number : ");
	    int num = p47.nextInt();
	    String str = Integer.toHexString(num);
	    System.out.println("Method 1: Decimal to hexadecimal: "+str);
	}

}
