import java.util.Scanner;
public class Day1 {
   public static void main(String[]args) {
	   Scanner scan = new Scanner(System.in);
	   int arr[] = new int[3];
	   System.out.println("Enter the elements");
	   for(int i=0;i<=arr.length-1;i++) {
		   arr[i]=scan.nextInt();
		   
	   }
	   System.out.println("Array contents are");
	   for(int i=0;i<=arr.length-1;i++) {
		   System.out.println(arr[i]+" ");
		   
	   }
   }
}
