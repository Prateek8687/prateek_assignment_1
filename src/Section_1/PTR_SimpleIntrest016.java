package Section_1;

import java.util.Scanner;

public class PTR_SimpleIntrest016 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        float p, r, t, simpleInt;
        
        System.out.print("Enter the Principal Value : ");
        p = sc.nextFloat();   

        System.out.print("Enter the Rate of interest Value : ");
        r = sc.nextFloat();   

        System.out.print("Enter the Time period Value : ");
        t = sc.nextFloat();    

        sc.close();
     
        simpleInt = (p * r * t) / 100;
       
        System.out.println("Simple Interest is: " +simpleInt);

	}

}
