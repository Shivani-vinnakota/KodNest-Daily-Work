import java.util.Scanner;
public class Demo1 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		String arr[] = new String[10];
		System.out.println("enter employee first name");
		for(int i = 0; i <= arr.length-1;i++) {
			arr[i] = scan.next(); 
		}
		System.out.println("Employee first names are");
		for(int i = 0; i <= arr.length-1;i++) {
		System.out.print(	arr[i] + " "); 
		}
		scan.close();
	}

}
