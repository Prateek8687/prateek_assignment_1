package ifelse;

import java.util.Scanner;

public class Program16 {

	public static void main(String[] args) {
		Scanner p16 = new Scanner(System.in);
		System.out.println("Enter All Side: ");
		
		int a1 = p16.nextInt();
		int a2 = p16.nextInt();
		int a3 = p16.nextInt();
		
		if(a1 == a2 && a2 == a3) {
			System.out.println("it is Equilateral Triangle");
		}
		else if(a1 == a2 || a2 ==a3 || a3 == a1) {
			System.out.println("it is Isosceles Triangle");
		}
		else {
			System.out.println("it is Scalene Triangle");
		}
	}

}
