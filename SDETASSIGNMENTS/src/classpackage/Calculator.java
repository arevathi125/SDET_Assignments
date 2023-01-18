package classpackage;

// class for method calling
public class Calculator {
   int a;
   int b;
   int c;
   public int add() {
	   c= a+b;
	   System.out.println("Addition of two numbers :"+c);
	   return c;
   }
   public int subtraction() {
	   c= a-b;
	   System.out.println("subtraction of two numbers :"+c);
	   return c;
   }
   public int multiplication() {
	   c= a*b;
	   System.out.println("Multiplication of two numbers :"+c);
	   return c;
   }
   public int Division() {
	   c= a/b;
	   System.out.println("Division of two numbers :"+c);
	   return c;
   }
   public static void main(String[] args) {
	   Calculator packetCal = new Calculator();
	   packetCal.a=10;
	   packetCal.b=30;
	   packetCal.add();
	      
	   Calculator sciCal = new Calculator();
	   sciCal.a=30;
	   sciCal.b=40;
	   sciCal.Division();
	   
	   
	   Calculator solarCal = new Calculator();
	   solarCal.a=50;
	   solarCal.b=50;
	   solarCal.multiplication();
	   
	
}
   
}
