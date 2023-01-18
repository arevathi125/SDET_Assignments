package Assignment3;

//	Please write a java program to print the factors and total number of factors of given number

  public class Factors {
	

		  public static void main(String[] args) {

		    		    int number = 70;
			  

		    System.out.print("Factors of " + number + " are: ");

		    		    for (int i = 1; i <= number-1; ++i) {

 		      if (number % i == 0) {
 		    	  
		        System.out.print(i + " , ");}
 		     
}
		    		    System.out.println(number);
		  }
}