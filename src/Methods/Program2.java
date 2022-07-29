package Methods;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double radius, diameter, area, circumference;
		
		System.out.print("Please Enter the Circle radius = ");
		radius = sc.nextDouble();
		
		diameter = calcDiameter(radius);
		area = calcArea(radius); 
		circumference = calCircumference(radius);

		System.out.println("\nArea of a Circle: " + area);
		System.out.println("Diameter of a Circle: " + diameter);
		System.out.println("Circumference of a Circle: " + circumference);
	}
	
	public static double calcDiameter(double radius) {
		return 2 * radius;
	}
	public static double calcArea(double radius) {
		return Math.PI * radius * radius;
	}
	public static double calCircumference(double radius) {
		return 2 * Math.PI * radius;
	}

}
