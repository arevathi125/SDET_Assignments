package Assignment3;

import java.util.Scanner;

public class CalculateFoodBill {
	private final static double gst_Tax=0.06;
	private final static int parcel=10;
	private final static int service_Charge=30;
	private final static double discount1=0.10;
	private final static double discount2=0.15;
	//private static int vegTotalPrice=0;
	//private static int nonVegTotalPrice=0;
   private static String categoryList() {
	  // System.out.println("please enter your selection: ");
	   return "Please select the category from the below list : \r\n"
	   		+ "[1] vegetarian\r\n"
	   		+ "[2] Non-vegetarian\r\n";
	   		
   }
   public static String vegetarian() {
	   System.out.println("Below are the dishes available currently to order : ");
	 return  " •	Paneer tikka - Rs. 120.00 (per item)\r\n"
			+" •	Cashew pulao - Rs. 150.00 (per item)\r\n"
			+" •	Veg fried rice - Rs. 130.00 (per item)\r\n"
			+" •	Gobi 65 - Rs. 100.00 (per item)\r\n"
			+" •	Veg. thali - Rs. 140.00 (per item)\r\n";
   }
   public static String nonVegetarian() {
	   System.out.println("Below are the dishes available currently to order : ");
	   return "•	Chicken briyani - Rs. 200.00 (per item)\r\n"
	   		+ "•	Fish curry -  Rs. 150.00 (per item)\r\n"
	   		+ "•	Chicken 65 - Rs. 120.00 (per item)\r\n"
	   		+ "•	Mutton gravy -  Rs. 220.00 (per item)\r\n"
	   		+ "•	Chicken fried rice - Rs. 180.00 (per item)\r\n";
   }
   public static String vegOrders(int vegOption) {
	    
    if(vegOption==1) {
    	//vegTotalPrice=120;
		return "Please enter the number of panneer tikka : ";
    }	
	 else if(vegOption==2){
		 //vegTotalPrice=150;
	     return "Please enter the number of Cashew Pulav : ";
	 }
	 else if(vegOption==3){
		 //vegTotalPrice=130;
		 return "Please enter the number of Veg fried rice : ";
	}
	else if(vegOption==4){
		 //vegTotalPrice=100;
		return "Please enter the number of Gobi 65 : ";
		
	}
	else {
		//vegTotalPrice=140;
		return "Please enter the number of Veg. thali : ";
	}
   }
   public static double vegPrice(int vegOption) {
	    
	    if(vegOption==1) {
	    	
			return 120.0 ;
	    }	
		 else if(vegOption==2){
			 return 150.0 ;
		 }
		     
		 else if(vegOption==3){
			 return 130.0 ;
		}
		else if(vegOption==4){
			return 100.0 ;
			
		}
		else {
			return 140.0 ;
		}
	   }
   public static String nonVegOrders(int nonVegOption) {
	    
	    if(nonVegOption==1) {
	    	//nonVegTotalPrice=200;
			return "Please enter the number of Chicken Briyani : ";
	    }	
		 else if(nonVegOption==2){
			 //nonVegTotalPrice=150;
		     return "Please enter the number of Fish Curry : ";
		 }
		 else if(nonVegOption==3){
			 //nonVegTotalPrice=120;
			 return "Please enter the number of Chicken 65 : ";
		}
		else if(nonVegOption==4){
			//nonVegTotalPrice=220;
			return "Please enter the number of Mutton Gravy : ";
		}
		else {
			//nonVegTotalPrice=180;
			return "Please enter the number of Chicken Fried Rice : ";
		}
	   }
   public static double nonVegPrice(int nonVegOption) {
	    
	    if(nonVegOption==1) {
	    	
			return 200.0 ;
	    }	
		 else if(nonVegOption==2){
			 return 150.0 ; }
		     
		 else if(nonVegOption==3){
			 return 120.0 ;
		}
		else if(nonVegOption==4){
			return 220.0 ;
			
		}
		else {
			return 180.0 ;
		}
	   }
   public static String oneMoreOrder() {
	   return "Would you like to order one more dish ? [Y] or [N]"; 
	   
   }
	
   public static String otherCatagory() {
	   return "Would you like to order from other category ? [Y] or [N]"; 
	   
   }
   
   public static double calculateTotal_FoodPrice(int quantity,double price,boolean optionTakeAway) {
	   double finalPrice = 0.0;
	   double parcelPrice = 0.0;
	   double gstAmt =0;
	   try {
	   double priceForTotalQty = quantity*price;
	   System.out.println("[2] take away"+priceForTotalQty);
	   if(optionTakeAway) {
		   parcelPrice= quantity*parcel;
	   } else {
		   parcelPrice = quantity*service_Charge;
	   }
	   System.out.println("[2] take away"+parcelPrice);
	   gstAmt = gst_Tax * (priceForTotalQty+parcelPrice);
	   finalPrice = priceForTotalQty+parcelPrice+gstAmt;
	   System.out.println("[2] take away"+finalPrice);
	   if(finalPrice>1500) {
		   return finalPrice - (discount2*finalPrice);
		  
	   }
	   else if(finalPrice>1000) {
		   return finalPrice - (discount1*finalPrice);
	    }
	   } catch(Exception e) {
		   e.printStackTrace();
	   }
 	   return finalPrice;
	   
   }
   
   public static double calculateTotal_DineIn() {
	   return 0.0;
	   
   }
   
   
	public static void main(String[] args) {
		System.out.println("Hello Welcome to Numpy Ninja restaurant ! ");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please select the service offering from below list : ");
		System.out.println("[1] dine-in "  );
		System.out.println("[2] take away");
		int enter = scanner.nextInt();
		
		switch(enter){	
		case 1:{
			System.out.println(categoryList());
			System.out.println("Please enter the option : ");
			int enter1 = scanner.nextInt();
			if(enter1==1) {
				System.out.println(vegetarian());
				System.out.println("Please enter your selections : ");
				int vegItem = scanner.nextInt();
				System.out.println(vegOrders(vegItem));
				int vegQuantity = scanner.nextInt();
				double vegPrice = vegPrice(vegItem);
				
				System.out.println(oneMoreOrder());
				String enter4=scanner.next();
				if("Y".equals(enter4)) {
					System.out.println(vegetarian());
				}
				else {
				System.out.println(otherCatagory());
				String enter5=scanner.next();
				if("Y".equals(enter5)) {
					System.out.println(nonVegetarian());
					System.out.println("Please enter your selections : ");
					int nonVegItem = scanner.nextInt();
					double nonVegPrice = nonVegPrice(nonVegItem);
					System.out.println(nonVegOrders(nonVegItem));
					int nonVegQuantity = scanner.nextInt();
					System.out.println(oneMoreOrder());
					String enter6=scanner.next();
					if("Y".equals(enter6)) {
						System.out.println(nonVegetarian());
					} else {
						System.out.println(otherCatagory());
						String enter7=scanner.next();
						if("Y".equals(enter6)) {
							System.out.println(vegetarian());
						} else {
						System.out.println("Total Cost is : ");
						int totalQty = vegQuantity+nonVegQuantity;
						double totalPrice = vegPrice+nonVegPrice;
						System.out.println(calculateTotal_FoodPrice(totalQty,totalPrice,true));
						}
					}
				}
				}
						

				
			}
			else {
				System.out.println(nonVegetarian());
			}
			
			break;
			
		}
		case 2:{
		
			System.out.println(categoryList());
			System.out.println("Please enter the option : ");
			int enter1 = scanner.nextInt();
			if(enter1==1) {
				System.out.println(vegetarian());
				System.out.println("Please enter your selections : ");
				int vegItem = scanner.nextInt();
				double vegPrice = vegPrice(vegItem);
				System.out.println(vegOrders(vegItem));
				int vegQuantity = scanner.nextInt();
				
				System.out.println(oneMoreOrder());
				String enter4=scanner.next();
				if("Y".equals(enter4)) {
					System.out.println(vegetarian());
				}
				else {
				System.out.println(otherCatagory());
				String enter5=scanner.next();
				if("Y".equals(enter5)) {
					System.out.println(nonVegetarian());
					System.out.println("Please enter your selections : ");
					int nonVegItem = scanner.nextInt();
					double nonVegPrice = nonVegPrice(nonVegItem);
					System.out.println(nonVegOrders(nonVegItem));
					int nonVegQuantity = scanner.nextInt();
					System.out.println(oneMoreOrder());
					String enter6=scanner.next();
					if("Y".equals(enter6)) {
						System.out.println(nonVegetarian());
					} else {
						System.out.println(otherCatagory());
						String enter7=scanner.next();
						if("Y".equals(enter6)) {
							System.out.println(vegetarian());
						} else {
						System.out.println("Total Cost is : ");
						int totalQty = vegQuantity+nonVegQuantity;
						//int totalPrice = vegTotalPrice+nonVegTotalPrice;
						double totalPrice = vegPrice+nonVegPrice;
						System.out.println(calculateTotal_FoodPrice(totalQty,totalPrice,false));
						}
					}
				}
				}
						
			}
			else {
				System.out.println(nonVegetarian());
			}
		
		}
				
		}
		System.out.println("Thank you Visit again!");
			}
	
	

}
