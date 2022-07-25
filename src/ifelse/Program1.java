package ifelse;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner p1 = new Scanner(System.in);
		System.out.print("Enter The First Number: ");
		int a = p1.nextInt();
		
		System.out.print("Enter The Second Number: ");
		int b = p1.nextInt();
		
		if(a>b) {
			System.out.print("a is Maximum: "+a);
		}else {
			System.out.print("b is Maximum: "+ b);
		}
	}

}
