package Assignment3;

import java.util.Scanner;

public class pseudoOrderDemo {
	
	public static void main(String a[]) {
		Scanner scanner = new Scanner(System.in);
		int enter = scanner.nextInt();
		boolean isBreakTheLoop =false;
		while(!isBreakTheLoop){
		    switch (enter) {
		       case 1: 
		            {
		            	//enter=2;
		            	System.out.println("Please enter the option : ");
		            	enter = scanner.nextInt();
		            	while(enter == 1) {
		            		int v = enter;
		            		System.out.println("Choosen veg Items : ");
		            		System.out.println("Please enter the option : ");
		            		enter = scanner.nextInt();
		            		if(v!=enter) {
		            			isBreakTheLoop=true;
		            			break;
		            		}
		            	}
		            	//enter = scanner.nextInt();
		            	
		            	//break;
		            }
		 
		            
		       case 2:
		    	   
		       {
		    		//System.out.println("Please enter the option2 : ");
		    		//enter = scanner.nextInt();
		    	 	while(enter == 2) {

	            		int n = enter;
	            		System.out.println("Choosen non-veg Items : ");
	            		System.out.println("Please enter the option : ");
	            		enter = scanner.nextInt();
	            		if(n!=enter) {
	            			isBreakTheLoop=true;
	            			//break;
	            			//case 1;
	            		}
	            		            	}
	            	//enter = scanner.nextInt();
		       
		    	   //break;
		       }
		       default:{
		    	   System.out.println("End: ");
           				    	   break;
		       }
		       
		       
		         
		          
	
//		       default:
//		       {
//		            break;
//		    }
		    }
	}
	}
}




