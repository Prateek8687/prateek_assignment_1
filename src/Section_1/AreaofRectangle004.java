package Section_1;

import java.util.Scanner;

public class AreaofRectangle004 {

	public static void main(String[] args) {
		float length, breadth, area;
		
		Scanner n = new Scanner(System.in); 
		
		System.out.print("Enter the Length of Rectangle: ");
		length = n.nextFloat();
		
		System.out.print("Enter the Breadth of Rectangle: ");
		breadth = n.nextFloat();
		
		area = length * breadth;
		System.out.println("Area of Rectangle is: " +area);
	}

}
