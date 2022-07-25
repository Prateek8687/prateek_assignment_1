package Section_1;

import java.util.Scanner;

public class PowerOfAnyNumber010 {
	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.print("Enter the base number: ");
	      int base = sc.nextInt();
	      
	      int temp = base;
	      System.out.print("Enter the exponent number: ");
	      
	      int exp = sc.nextInt();
	      for (int i=1; i<exp; i++){
	         temp = temp*temp;
	      }
	      System.out.println("Result of "+base+" ^ "+exp+" is:  "+temp);
	   }
}
