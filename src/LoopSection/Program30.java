package LoopSection;

import java.util.Scanner;

public class Program30 {

	public static void main(String[] args) {
	     Scanner p30 = new Scanner(System.in);
	     System.out.print("Enter a number :");
	     int num = p30.nextInt();
	     
	      for(int i = 2; i< num; i++) {
	         while(num % i == 0) {
	            System.out.println(i+" ");
	            num = num / i;
	         }
	      }
	      if(num >2) {
	         System.out.println(num);
	      }
	}

}
