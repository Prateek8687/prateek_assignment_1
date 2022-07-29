package LoopSection;

import java.util.Scanner;

public class Program35 {

	public static void main(String[] args) {
		int fact_n,lastdig;
		Scanner p35 = new Scanner(System.in);
		System.out.print("Enter the number : " );
		int n = p35.nextInt();
		
		int total = 0, num = n;
		while(n != 0)
		{
			int i = 1;
			fact_n = 1;
			lastdig = n % 10;
			while(i <= lastdig)
			{
				fact_n = fact_n * i;
				i++;
			}
			total = total + fact_n;
			n = n / 10;
		}
		if(total == num)
			System.out.println(num + " is a strong number");
		else
			System.out.println(num + " is not a strong number");
		System.out.println();
	}

}
