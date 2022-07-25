package Section_1;

import java.util.Scanner;

public class convert_day_into_year009 {

	public static void main(String[] args) {
		int years, weeks, days;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of Days: ");
		days = sc.nextInt();
		
		years = (days / 365);
		weeks = (days % 365)/7;
		days = days - ((years * 365) + (weeks * 7));
		
		
		
		System.out.println("Years is: "+years);
		System.out.println("Weeks is: "+weeks);
		System.out.println("Days is: "+days);
	}

}
