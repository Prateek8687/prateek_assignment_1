package ifelse;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		Scanner p6 = new Scanner(System.in);
		System.out.print("Enter The Year: ");
		int year = p6.nextInt();
		
		if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("This year is Leap Year ");
		}else {
			System.out.println("This year is not Leap Year");
		}
	}

}
