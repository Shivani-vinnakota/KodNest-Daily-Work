
import java.util.Scanner;
public class Factors {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to print the factors:");
		int n = scan.nextInt();
		System.out.println("Factors of "+ n+"number:");
		for(int i = 1; i<=n ;i++) {
			
			if(n%i==0) {
			    
				System.out.println(i);
			}
		}
		scan.close();	
	}

}
