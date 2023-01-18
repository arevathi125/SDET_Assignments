package Assignment3;

import java.util.Scanner;

// 1.	Please write a java program to print the day of the week when number is given
 //      (example : 1 means Sunday should be printed) -Hint:  Switch case
         
public class Weekdays {
	
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter your number : " );
		 int weekdays = scanner.nextInt();
		  
		switch(weekdays) {
		
		case 1: {
			System.out.println("This is Sunday");
			break;}
		case 2: {
			System.out.println("This is Monday");
			break;}
		case 3: {
			System.out.println("This is Tuesday");
			break;}
		case 4:{ 
			System.out.println("This is Wednesday");
			break;}
		case 5: {
			System.out.println("This is Thursday");
			break;}
		case 6: {
			System.out.println("This is Friday");
			break;}
	    default:{
			System.out.println("This is Saturday");
		
	    }
	}
	}
	}



