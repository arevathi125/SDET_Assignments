package Assignment3;

import java.util.Scanner;

//4. Please write a java program to print the binary, octal, hexadecimal form of a given decimal number 
 //       (example : for the input 10, print 1010(binary), 12 (octal), A (hexa))

public class Binary {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter decimal number : ");
		 int n= scanner.nextInt();
		String binary = Integer.toString(n,2);
		String octal = Integer.toString(n,8);
		String hexa = Integer.toString(n,16);
		System.out.println(" Binary number is : "+binary);
		System.out.println(" Octal number is : "+octal);
		System.out.println(" Hexa decimal number is : "+hexa.toUpperCase());

	}

}
