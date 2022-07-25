package Section_1;

import java.util.Scanner;

public class TraingleFindThirdAngle012 {

	public static void main(String[] args) {
		int angle1, angle2, angle3;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the First Angele And Second Angle: ");
		angle1 = sc.nextInt();
		angle2 = sc.nextInt();
		
		angle3 = 180 - (angle1 + angle2);
		
		System.out.println("Third angle of traingle is: "+angle3);
	}

}
