import java.util.Scanner;
public class ex4 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the people count");
	int n = scan.nextInt();
	Boolean arr[]= new Boolean[n];
	for(int i=0;i<=arr.length-1;i++) {
		System.out.println("Is person "+i+" is MArried?");
		arr[i]=scan.nextBoolean();
	}
	for(int i=0;i<=arr.length-1;i++) {
		System.out.println("person is Married?"+arr[i]);
	}
}
}
