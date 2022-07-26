package switch_case;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the integer number: ");
		int num=scan.nextInt();
		
		switch(num%2){
		case 0:
		    System.out.println(num+" is a Even number");
		    break;
		case 1:
		    System.out.println(num+" is a Odd number");
		}
	}

}
