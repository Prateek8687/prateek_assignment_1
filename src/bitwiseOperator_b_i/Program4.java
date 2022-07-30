package bitwiseOperator_b_i;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Number:");
        int number = sc.nextInt();
        
        System.out.print("Enter the Bit position you want to get: ");
        int bit_pos = sc.nextInt();
        
        int mask = (1 << bit_pos);
        
        if ((number & mask) == 1)
            System.out.print("Given Position bit is 1.");
        else
            System.out.print("Given Position bit is 0.");
        sc.close();
	}

}
