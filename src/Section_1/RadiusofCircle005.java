package Section_1;

import java.util.Scanner;

public class RadiusofCircle005 {

	public static void main(String[] args) {
		double r, d, a, c;
		Scanner cir = new Scanner(System.in);
		System.out.print("Enter the Radius of circle: ");
		r = cir.nextDouble();
		
		d = 2 * r;
		
		c = 2 * Math.PI * r;
		
		a = Math.PI * r * r;
		
		System.out.println("Diameter of Circle: " + d);
		System.out.println("Circumference of circle: "+ c);
		System.out.println("Area of Circle: "+ a);
	}

}
