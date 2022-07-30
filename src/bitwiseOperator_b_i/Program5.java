package bitwiseOperator_b_i;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number:");
        int number = sc.nextInt();

        System.out.print("Enter the Bit position you want to set(Between 0-31):");
        int bit_pos = sc.nextInt();

        int mask = (1 << bit_pos);
        number = number | mask;
        System.out.print("The number after set the bit in the given position is: " + number);
        sc.close();
	}

}
