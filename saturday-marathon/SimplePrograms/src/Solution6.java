import java.util.Scanner;

public class Solution6 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
	    System.out.println("Until Where you need Prime Numbers ");
		int n =  scan.nextInt();
		int count = 0;
		for(int i = 3; i < n; i++) {
			int res = checkPrime(i);
			if(res!=0) {
				System.out.println(res);
				count++;
			}
			
		}
		System.out.println("Number of Prime Numbers is = "+count);		
}
	public static int checkPrime(int n) {
	
		for(int i = 2; i < n; i++) {
			if(n%i==0) {
				return 0;
			}
		}
		count++;
		return n;
		
	}

}
