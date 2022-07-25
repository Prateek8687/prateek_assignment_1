package Section_1;

import java.util.Scanner;

public class temperature_in_Celsius007 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Temprature in celcius: ");
		float cel = sc.nextFloat();
		float Far = cel * (9.0f/5.0f) + 32;
		System.out.print("The Temprature is: " + Far + " Degree in Faranhite "); 
	}
}
