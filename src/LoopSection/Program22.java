package LoopSection;

import java.util.Scanner;

public class Program22 {

	public static void main(String[] args) {
		Scanner p22 = new Scanner(System.in);
		System.out.print("Enter Any Number: ");
        int num = p22.nextInt();
        
        for(int i = 1; i <= num; ++i) {
            if(num % i == 0) {
                System.out.print(i + " ");
            }
        }
	}

}
