package LoopSection;

import java.util.Scanner;

public class Program32 {

	public static void main(String[] args) {
		Scanner p32 = new Scanner(System.in);
        System.out.println("Armstrong numbers from 1 to 1000:");
        int count = 0, b, sum = 0;
        
        for(int i = 1; i <= 1000; i++)
        {
            int n = i;
            while(n > 0)
            {
                b = n % 10;
                sum = sum + (b * b * b);
                n = n / 10;
            }
            if(sum == i)
            {
                System.out.print(i+" ");
            }
            sum = 0;
        }
	}

}
