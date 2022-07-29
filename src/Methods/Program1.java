package Methods;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner p1 = new Scanner(System.in);
		System.out.print("Enter Any Number: ");
		int num = p1.nextInt();
		p1.close();
		
		int cube = CalcluteCube(num);
		System.out.println("Cube of " + num + " is " + cube);
	}
	public static int CalcluteCube(int number) {
		return number * number * number;
	}

}
