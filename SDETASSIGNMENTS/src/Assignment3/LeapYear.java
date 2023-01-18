package Assignment3;

//	Please write a java program to print the leap years between 2000 and 2100 - Hint : for loop and multiple if-else 

public class LeapYear {
	
 
   public static void main(String[] args) {
     int year;
//	   // year to be checked
//	    int year = 1804;
//	    boolean leap = false;
//
//	    // if the year is divided by 4
//	    if (year % 4 == 0) {
//
//	      // if the year is century
//	      if (year % 100 == 0) {
//
//	        // if year is divided by 400
//	        // then it is a leap year
//	        if (year % 400 == 0)
//	          leap = true;
//	        else
//	          leap = false;
//	      }
//	      
//	      // if the year is not century
//	      else
//	        leap = true;
//	    }
//	    
//	    else
//	      leap = false;
//
//	    if (leap)
//	      System.out.println(year + " is a leap year.");
//	    else
//	      System.out.println(year + " is not a leap year.");
//	  }  
	   boolean leapYear = false;
	   
	   for ( year = 2000; year <= 2100;year++) {
		   if (year % 4==0 && year % 100==0 && year % 400==0) {
			   leapYear=true;
		   }
		   
			   if(year % 4==0) {
				   leapYear= true;
			   } else {
				   leapYear=false;
			   }
				   
		   
		   if(leapYear) {
			   
			   System.out.println(year + " is a Leap year");
		   }
		   else 
			   System.out.println(year + " is  not a Leap year");
	   			   }
	   			   
		  
		   }
	   

	   
		}

	   
	
 

