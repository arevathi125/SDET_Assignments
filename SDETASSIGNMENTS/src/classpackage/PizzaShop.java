package classpackage;

import java.util.Scanner;

public class PizzaShop {
	    static boolean canAcceptOrder = true;
	    static int numberofPizzas = 100;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//PizzaShop p = new PizzaShop();
	    man(sc);	
}
	
	public static void man(Scanner sc) {
		  while(canAcceptOrder) {
				
				System.out.println("i am selling pizzas..");
				
				System.out.println("Please enter your order...");
				int order = sc.nextInt();
				numberofPizzas=numberofPizzas-order;
				
				System.out.println(" number of available pizzas " + numberofPizzas);
				
				if(numberofPizzas<=0) {
					canAcceptOrder=false;
				}
				
			}
	}
}
