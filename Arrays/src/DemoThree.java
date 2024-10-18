import java.util.Scanner;

public class DemoThree {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter people count");
		int n = scan.nextInt();
		boolean arr[] = new boolean[n];
		
		System.out.println("Enter Array Elements ");
		for(int i = 0; i <= arr.length-1;i++) {
			System.out.println("Is person " + i +" Married ?");
			arr[i] = scan.nextBoolean(); 
		}
		System.out.println("Heights of the players are");
		for(int i = 0; i <= arr.length-1;i++) {
			
		System.out.println("Person "+i+ " Married "+ arr[i] ); 
		}
		scan.close();
	}

}



