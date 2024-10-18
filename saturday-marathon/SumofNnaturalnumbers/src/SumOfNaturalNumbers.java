import java.util.Scanner;
public class SumOfNaturalNumbers {
	public static void main(String[]args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter a no:");
	int no = scan.nextInt();
	int sum = 0;
	for(int i =1; i<=no;i++) {
		sum = sum + i;
	}
    System.out.println("Sum is: "+sum);
    scan.close();
}
}
