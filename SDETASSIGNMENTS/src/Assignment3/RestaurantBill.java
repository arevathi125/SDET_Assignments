package Assignment3;

import java.util.Scanner;

public class RestaurantBill {

	Scanner scanner = new Scanner(System.in);

	public static void vegMenu() {
		System.out.println("Below Are The Dishes Available Cuurently To Order : ");

		System.out.println("   1.Paneer tikka - Rs. 120.00 (per item))\n"
				+ "   2.Cashew pulao - Rs. 150.00 (per item)\r\n" + "   3.Veg fried rice - Rs. 130.00 (per item)\r\n"
				+ "   4.Gobi 65 - Rs. 100.00 (per item)\r\n" + "   5.Veg. thali - Rs. 140.00 (per item)\r\n" + "");
	}

	public static void nonVegMenu() {
		System.out.println("Below Are The Dishes Available Cuurently To Order : ");

		System.out.println(" 1.	Chicken briyani - Rs. 200.00 (per item)\r\n"
				+ "2.	Fish curry -  Rs. 150.00 (per item)\r\n"
				+ "3.	Chicken 65 - Rs. 120.00 (per item)\r\n"
				+ "4.	Mutton gravy -  Rs. 220.00 (per item)\r\n"
				+ "5.	Chicken fried rice - Rs. 180.00 (per item)\r\n"
				+ "");
	}

	public void vegExtraOrder(int list_2, int list_3) {
		if (list_2 == 1) {

			int veg_1;
			if (list_3 == 1) {

				System.out.println("Please Enter number of “Panneer Tikka” You Would like To Order : ");

				veg_1 = scanner.nextInt();
			}

			else if (list_3 == 2) {

				System.out.println("Please Enter number of “Cashew pulao” You Would like To Order : ");

				veg_1 = scanner.nextInt();
			} else if (list_3 == 3) {

				System.out.println("Please Enter number of “Veg fried rice” You Would like To Order : ");

				veg_1 = scanner.nextInt();
			} else if (list_3 == 4) {

				System.out.println("Please Enter number of “Gobi 65” You Would like To Order : ");

				veg_1 = scanner.nextInt();
			} else if (list_3 == 5) {

				System.out.println("Please Enter number of “Veg. thali” You Would like To Order : ");

				veg_1 = scanner.nextInt();
			}

		}
	}

	public  void nonVegExtraOrder(int list_2, int list_3) {
		if (list_2 == 2) {
			int nonVeg;
			if (list_3 == 1) {
				System.out.println("Please Enter number of “Chicken briyani ” You Would like To Order : ");

				nonVeg = scanner.nextInt();

			} else if (list_3 == 2) {

				System.out.println("Please Enter number of “Fish curry” You Would like To Order : ");

				 nonVeg = scanner.nextInt();

			} else if (list_3 == 3) {

				System.out.println("Please Enter number of “Chicken 65” You Would like To Order : ");

				nonVeg = scanner.nextInt();

			} else if (list_3 == 4) {

				System.out.println("Please Enter number of “Mutton gravy ” You Would like To Order : ");

				nonVeg = scanner.nextInt();

			} else if (list_3 == 5) {

				System.out.println("Please Enter number of “Chicken fried rice ” You Would like To Order : ");

				nonVeg = scanner.nextInt();

			}
		}
	}
	public static void main(String[] args) {
		
		RestaurantBill obj = new RestaurantBill();

		System.out.println("Hello Welcome To Numpy Ninja Restaurant");

		System.out.println("=======================================");

		System.out.println("Please select The Service Offering From Below list : ");

		System.out.println("[1]. Dine in \n[2]. Take  away");

		System.out.println("Please Enter the Option : ");

		Scanner scanner = new Scanner(System.in);

		int list_1 = scanner.nextInt();

		System.out.println("Please select The Service Offering From Below list : ");

		System.out.println("[1]. Vegetarian \n[2]. Non-Vegetarian ");

		System.out.println("Please Enter the Option : ");

		int list_2 = scanner.nextInt();

		if (list_2 == 1) {

			vegMenu();
		}

		else if (list_2 == 2) {

			nonVegMenu();
		} else {
			System.out.println("Please Enter [1] Or [2] : ");
			
		}

		System.out.println("Please Enter the Option : ");

		int list_3 = scanner.nextInt();
		
		if (list_2 == 1) {
			obj.vegExtraOrder(list_2, list_3);
		} else if (list_2 == 2) {
			obj.nonVegExtraOrder(list_2, list_3);
		}
		
		

//		if(list_3 == 1&& list_2 == 1){
//			
//			System.out.println("Please Enter number of “Panneer Tikka” You Would like To Order : ");
//			
//			int veg_1 = scanner.nextInt(); }
//			
//			else if (list_3 == 1&& list_2 == 2){
//				
//				System.out.println("Please Enter number of “Cashew pulao” You Would like To Order : ");
//				
//				int veg_1 = scanner.nextInt(); }
//           else if (list_3 == 1&& list_2 == 3){
//				
//				System.out.println("Please Enter number of “Veg fried rice” You Would like To Order : ");
//				
//				int veg_1 = scanner.nextInt(); }
//          else if (list_3 == 1&& list_2 == 4){
//	
//	              System.out.println("Please Enter number of “Gobi 65” You Would like To Order : ");
//	
//	               int veg_1 = scanner.nextInt(); }
//           else if (list_3 == 1&& list_2 == 5){
//	
//	               System.out.println("Please Enter number of “Veg. thali” You Would like To Order : ");
//	
//	               int veg_1 = scanner.nextInt(); }
//		 
//						}
//		
		
				
		System.out.println("Would you like to order one more dish ? ");
		
		String option = scanner.next();
		
		if( "y".equalsIgnoreCase(option)) {
			if (list_2 == 1) {

				vegMenu();
				obj.vegExtraOrder(list_2, list_3);
			}

			else if (list_2 == 2) {
				nonVegMenu();
				obj.nonVegExtraOrder(list_2, list_3);
			}
		} else if( "n".equalsIgnoreCase(option)) {
			
				System.out.println("Would you like to order from other category ? ");
				String otherCategory = scanner.next();
		}
		
	}
}