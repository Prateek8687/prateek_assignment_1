package Section_1;

import java.util.Scanner;

public class Enter2num_Find_Sum001 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Two Number: ");
		
		int a = in.nextInt();
		int b = in.nextInt();
		
		System.out.print("Results: " + a + " + " + b + " = ");
		a = a+b;
		System.out.println(a);
	}

}
