import java.util.Scanner;
public class ContainsDuplicate {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the arr1 size");
	int arr1[] = new int[scan.nextInt()];
	for(int i=0;i<=arr1.length-1;i++) {
		arr1[i]=scan.nextInt();
	}
	for(int x:arr1) {
		System.out.print(x+" ");
	}
	
	for(int i=0;i<=arr1.length-1;i++) {
		if(arr1[i] == arr1[i+1]) {
			 
		}
	}



}
}
