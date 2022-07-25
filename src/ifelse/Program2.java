package ifelse;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner p2 = new Scanner(System.in);
		
		System.out.print("Enter the 1st Number: ");
		int p = p2.nextInt();
		
		System.out.print("Enter the 2nd Number: ");
		int q = p2.nextInt();
		
		System.out.print("Enter the 3rd Number: ");
		int r = p2.nextInt();
		
		if(p>q && p>r) {
			System.out.println("a is Maximum: "+p);
		}
		else {
			if(q>p && q>r) {
				System.out.print("q is Maximum Number: "+ q);
			}
			else {
				System.out.print("r is Maximum Number: "+ r);
			}
		}
	}

}
