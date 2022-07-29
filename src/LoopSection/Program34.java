package LoopSection;

import java.util.Scanner;

public class Program34 {

	public static void main(String[] args) {
		Scanner p34 = new Scanner(System.in);
		System.out.print("Enter The any number ");
		int num = p34.nextInt();
		int sum;
		for(int i = 1; i < num; i++) {
			sum = 0;

		    for(int j = 1; j< i; j++) {
		        if(i % j == 0) {
		            sum += j;
		        }
		    }

		    if(sum == i) {
		        System.out.println(sum);
		    }
		}

	}
}
