package Assignment3;

// 	Please write a java program to find the first 30 prime numbers. Hint : for loop and multiple if-else

public class PrimeNumbers {
    
	public static void main(String[] args) {
			
		int n=30;
		for(int i=2;i<=n;i++) {
			int count = 0;
			for(int j=1;j<=n;j++) {
			
				if(i>=j) {
					if(i%j == 0) {
					count++;	
					}
				}
			}
			if(count>2) {
				System.out.println(i+" is not a prime no");
			} else {
				System.out.println(i+" is  a prime no");
			}
		}

}
}
