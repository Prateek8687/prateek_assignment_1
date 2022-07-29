package LoopSection;

import java.util.Scanner;

public class Program26 {

	public static void main(String[] args) {
	    Scanner p26 = new Scanner(System.in);
	    
	    System.out.print("Enter first number :");
	    int num1 = p26.nextInt();
	    
	    System.out.print("Enter second number :");
	    int num2 = p26.nextInt();
	    
	    int max, step, lcm = 0;

	    if(num1 > num2){
	    	max = step = num1;
	    }
	    else{
	    	max = step = num2;
	    }
	    while(num1!= 0) {
	    	if(max % num1 == 0 && max % num2 == 0) {
	    		lcm = max;
	            break;
	         }
	         max += step;
	      }
	      System.out.println("LCM of given numbers is :: "+lcm);
	}

}
