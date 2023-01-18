package classpackage;

import java.util.Scanner;

public class While {
	
		
		
		public static void main(String[] args) {
			
			
			Scanner sc = new Scanner(System.in);
			
			boolean wouldliketoordercategory = true;
			boolean wouldliketoorderitem = true;
			
			while (wouldliketoordercategory) {
				wouldliketoorderitem = true;
				System.out.println("please enter your category choice");
				 wouldliketoordercategory = sc.nextBoolean();
				 if(wouldliketoordercategory==false) {
					 break;
				 }
				
				while (wouldliketoorderitem) {
					
					System.out.println("please enter your item choice");
					 wouldliketoorderitem = sc.nextBoolean();
					
				}
				
			}
			
		}
}

