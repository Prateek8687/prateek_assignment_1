package switch_case;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner p1 = new Scanner(System.in);
		System.out.println("Enter The Number of WeekDay: ");
		int wd = p1.nextInt();
		
		switch (wd) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
			
		case 3:
			System.out.println("Wednesday");
			break;
			
		case 4:
			System.out.println("Thursday");
			break;
			
		case 5:
			System.out.println("Friday");
			break;
			
		case 6:
			System.out.println("Saturday");
			break;
			
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Not a weekday number");
			break;
		}
	}

}
