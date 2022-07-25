package Section_1;

import java.util.Scanner;

public class TAPeofFiveSubject015 {

	public static void main(String[] args) {
		Scanner cs=new Scanner(System.in);
	      double subject1, subject2, subject3, subject4, subject5, total_marks, avg, percentage;

	      System.out.println("Enter marks of 5 subjects out of 100:");
	      subject1=cs.nextDouble();
	      subject2=cs.nextDouble();
	      subject3=cs.nextDouble();
	      subject4=cs.nextDouble();
	      subject5=cs.nextDouble();

	      total_marks = subject1 + subject2 + subject3 + subject4 + subject5;
	      
	      avg = total_marks / 5.0;
	      
	      percentage = (total_marks / 500) * 100;

	      System.out.println("Total Marks is: "+total_marks);
	      System.out.println("Average is: "+avg);
	      System.out.println("Percentage is: "+percentage+"%");
	      cs.close(); 

	}

}
