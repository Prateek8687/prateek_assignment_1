package LoopSection;

import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		System.out.print("Enter an integer variable :: ");
	    Scanner p9 = new Scanner(System.in);
	    int num = p9.nextInt();
	    for(int i=1; i<= 10; i++) {
	    	System.out.println(num +" * "+ i +" = "+(num*i));
	    }
	}

}
