package Assignment3;

//  5.	Please write a java program to calculate sum & average  of given 4 marks via constructor, 
 //      if three or two marks only passed from main method, then keep the missing value(s) as 35) 
//       - Hint - multiple parameterized constructor

public class Constructor {
	int mark1;
	int mark2;
	int mark3;
	int mark4;
	int total;
	int avg;
	public Constructor(int m1,int m2,int m3,int m4) {
		 mark1= m1;
		 mark2= m2;
		 mark3= m3;
		 mark4= m4;
	}
	public Constructor(int m1,int m2,int m3) {
		 mark1= m1;
		 mark2= m2;
		 mark3= m3;
		 mark4= 35;
	}
	public Constructor(int m1,int m2) {
		 mark1= m1;
		 mark2= m2;
		 mark3= 35;
		 mark4= 35;
	}
	public Constructor(int m1) {
		 mark1= m1;
		 mark2= 35;
		 mark3= 35;
		 mark4= 35;
	}
	
	
	public int sum() {
		total = mark1+mark2+mark3+mark4;
		
		return total;
	}
	public int average() {
		avg = total/4;
		
		return avg;
	}
	
	
	public static void main(String[] args) {
		Constructor obj = new Constructor(45,35);
		
		obj.sum();
		
		System.out.println("Sum is : " +obj.total);
		
		obj.average();
		
		System.out.println("Average is : " +obj.avg);

		
	}

}
