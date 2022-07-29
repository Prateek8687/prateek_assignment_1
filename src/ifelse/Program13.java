package ifelse;

import java.util.Scanner;

public class Program13 {

	public static void main(String[] args) {
		Scanner p13 = new Scanner(System.in);
		System.out.println("Enter AnyAmount: ");
		int amount = p13.nextInt();
		
		int arr[] = {2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
		
		for(int i = 0; i <= 10; i++) {
			System.out.println(arr[i] +" notes: " + amount/arr[i]);
			amount = amount % arr[i];
		}
	}
}
 