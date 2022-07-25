package Section_1;

import java.util.Scanner;

public class LandB_find_Parimeter003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float length, breadth,perimeter;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter The Length of rectangle: ");
		length = in.nextInt();
		
		System.out.print("Enter The Breadth of rectangle: ");
		breadth = in.nextInt();
		
		perimeter = 2 * (length + breadth);
		
		System.out.println("Perimeter of Rectangle is: "+perimeter+ "units");
	}

}
