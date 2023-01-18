package classpackage;

public class TypesOfVariables {
	 public int add(int a,int b) {
		  int c= a+b;
		   System.out.println("Addition of two numbers :"+c);
		   return c;
	   }
	   public void subtraction(int a,int b) {
		  int c= a-b;
		   System.out.println("subtraction of two numbers :"+c);
		  
	   }
	   public void multiplication(int a,int b) {
		   int c= a*b;
		   System.out.println("Multiplication of two numbers :"+c);
		  
	   }
	   public void  Division(int a,int b) {
		   int c= a/b;
		   System.out.println("Division of two numbers :"+c);
		   
	   }
	   public static void main(String[] args) {
		TypesOfVariables obj = new TypesOfVariables();
		int c= obj.add(10,20);
		obj.Division(c, 10);
	}
}
