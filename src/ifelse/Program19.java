package ifelse;

import java.util.Scanner;

public class Program19 {

	public static void main(String[] args) {
		Scanner p19 = new Scanner(System.in);
		System.out.println("Enter All Subject Number: ");
		
		float total, avg, percentage; 
		char grade;
		
		float Physics = p19.nextFloat();
		float Chemistry = p19.nextFloat();
		float Biology = p19.nextFloat();
		float Mathematics = p19.nextFloat();
		float Computer = p19.nextFloat();
		
		total = Physics + Chemistry + Biology + Mathematics + Computer;
		avg = (float)(total / 5.0);
		percentage = (float)((total/500.00) * 100);
		
		
		if(avg >= 90) 
			grade = 'A';
		
		else if(avg >= 80 && avg < 90) 
			grade = 'B';
		
		else if(avg >= 70 && avg < 80) 
			grade = 'C';
		
		else if(avg >= 60 && avg < 70) 
			grade = 'D';
		
		else if(avg >= 50 && avg < 60) 
			grade = 'E';
		
		else if (avg >= 40 && avg < 50) 
			grade = 'F';
		
		else 
			grade = 'G';
			System.out.println("The Total marks = " + total);
			System.out.println("The Percentage of marks = " + percentage + "%");
		    System.out.println("The Average marks = " + avg);
		    System.out.println("The Total Grade = '" + grade + "'");
		
		
	}

}
