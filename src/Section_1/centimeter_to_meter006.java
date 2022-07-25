package Section_1;

import java.util.Scanner;

public class centimeter_to_meter006 {

	public static void main(String[] args) {
		Scanner cen = new Scanner(System.in);
		
		System.out.println("Enter the Length in Centimeter: ");
		double centimeter = cen.nextDouble();
		
		double meter = centimeter/100;
		double kilom = centimeter/100000;
		
		System.out.println("Length in Meter: "+meter);
		System.out.println("Length in Kilometer: "+kilom);
	}

}
