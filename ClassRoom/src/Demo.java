import java.util.Scanner;
public class Demo {
public static void main(String[]args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number");
	int n = scan.nextInt();
	for(int i=1;i<=n;i++) {
	if(n%2==0) {
		System.out.println(i);
	}
	else if(n%3==0) {
		System.out.println(i);
	}
	else if(n%5==0) {
		System.out.println(i);
	}
	else if(n%2==0 & n%5==0) {
		System.out.println(i);
	}
	}
}
}
