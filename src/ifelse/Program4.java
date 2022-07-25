package ifelse;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Scanner p4 = new Scanner(System.in);
				
		System.out.print("Enter the Any Number: ");
		int n = p4.nextInt();
		
		if((n%5 == 0) && (n%11 ==0)) {
			System.out.println("This Number is Divided by 5 and 11.... ");
		}
		else {
			System.out.println("This Number is Not Divided by 5 and 11.... ");
		}
	}

}
