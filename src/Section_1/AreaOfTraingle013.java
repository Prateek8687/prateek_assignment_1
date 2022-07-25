package Section_1;

import java.util.Scanner;

public class AreaOfTraingle013 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Base of the Triangle: ");
	    
		double b= sc.nextDouble();
	    System.out.print("Enter the height of the Triangle: ");
	    
	    double h= sc.nextDouble();
	    
	    double area=(b*h)/2;
	    System.out.println("Area of Triangle is: " + area);
	}
}
