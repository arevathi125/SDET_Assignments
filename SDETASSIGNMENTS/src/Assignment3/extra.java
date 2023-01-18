package Assignment3;

public class extra {

	public static void main(String a[]) {
		int n=60;
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
