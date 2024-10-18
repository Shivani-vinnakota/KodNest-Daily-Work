import java.util.Scanner;
public class Demo {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array Elements...");
		int arr[] = new int[5];
		for(int i = 0; i<= arr.length-1; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Array contents are....");
		for(int i = 0; i<= arr.length-1; i++) {
		System.out.print(arr[i]+" ");
		}
        scan.close();
}
}