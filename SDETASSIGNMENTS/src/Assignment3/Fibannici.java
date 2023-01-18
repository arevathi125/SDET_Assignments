package Assignment3;

import java.util.Scanner;

// 3.	Please write a java program to print the nth fibonacci series number (example : 9th fibonacci series is 34) 
 //       Hint : use simple if condition with recursive function call
// 0,1,1,2,3,5,8,13,

public class Fibannici {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no: ");
		int n = scanner.nextInt();
		for(int i = 0; i < n-1; i++) {
			
			System.out.print(a + ",");
			int c = a+b;
			 a=b;
			 b=c;
		}
		System.out.print(a);

	
	}
	

}
