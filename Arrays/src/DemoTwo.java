import java.util.Scanner;

public class DemoTwo {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		float arr[] = new float[7];
		System.out.println("Enter Array Elements ");
		for(int i = 0; i <= arr.length-1;i++) {
			System.out.println("Enter the height of the player" + i);
			arr[i] = scan.nextFloat(); 
		}
		System.out.println("Heights of the players are");
		for(int i = 0; i <= arr.length-1;i++) {
		System.out.print(	arr[i] + " "); 
		}
		scan.close();
	}

}

