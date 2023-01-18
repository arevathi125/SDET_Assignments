package assignment1;

import java.util.Scanner;

public class scannerMethod {
	
	static int totalMarks(int eng_marks,int math_marks,int sci_marks,int sst_marks) {
		int sum = eng_marks+math_marks+sci_marks+sst_marks;
		System.out.println("  Total Mark is : " +sum);
		return sum;
		
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Your English Mark : ");
		 int engMark= input.nextInt();
		
		System.out.println("Enter Your Math Mark : ");
		int mathMark= input.nextInt();
		
		System.out.println("Enter Your Sci Mark : ");
		 int sciMark= input.nextInt();
		
		System.out.println("Enter Your SST Mark : ");
		 int sstMark= input.nextInt();

		 int sum = engMark+mathMark+sciMark+sstMark;
			System.out.println("  Total Mark is : " +sum);
		float avg = sum/4;
		  System.out.println("  Average is : " +avg);
		  
		  totalMarks(engMark,mathMark,sciMark,sstMark);
	
}
	
	
}

