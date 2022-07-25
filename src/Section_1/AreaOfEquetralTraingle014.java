package Section_1;

import java.util.Scanner;

public class AreaOfEquetralTraingle014 {
	public static void main(String[] args) {
        double side, area;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Length of Equilateral Triangle: ");
        side = sc.nextDouble();

        area = Math.sqrt(3) / 4 * side * side;
 
        System.out.format("The Area of Equilateral Triangle: "+ area);
    }

}
