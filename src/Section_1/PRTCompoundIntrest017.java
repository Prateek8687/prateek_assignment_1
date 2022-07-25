package Section_1;

import java.util.Scanner;

public class PRTCompoundIntrest017 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        float p, r, t, CompoundIntrest;
        System.out.print("Enter the Principal Value: ");
        p = sc.nextFloat();     

        System.out.println("Enter the Rate of interest : ");
        r = sc.nextFloat(); 

        System.out.println("Enter the Time period Value : ");
        t = sc.nextFloat();    

        System.out.println("Enter the number of times that interest is compounded per unit: ");
        CompoundIntrest=sc.nextFloat(); 

        sc.close();


    	double amount = p * Math.pow(1 + (r / CompoundIntrest), CompoundIntrest * t);
        double cinterest = amount - p;
        
        System.out.println("Compound Interest after " + t + " years: "+cinterest);
        System.out.println("Amount after " + t + " years: "+amount);

	}

}
