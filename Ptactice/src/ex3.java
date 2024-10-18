import java.util.Scanner;
public class ex3 {
   public static void main(String[]args) {
	   Scanner scan = new Scanner(System.in);
	   float arr[]= new float[7];
	   
	   System.out.println("Enter Game Players height");
	   for(int i=0;i<=arr.length-1;i++) 
	   {
		   arr[i]=scan.nextFloat();
        }
	   System.out.println("Game Players heights are: ");
	   for(int i=0;i<=arr.length-1;i++) {
		   System.out.println(arr[i]+" ");
	   }
}
}
