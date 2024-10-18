import java.util.Scanner;
public class CarStore {
	public static void main(String []args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the Carname");
	String carname = scan.nextLine();
	System.out.println("Enter the color");
	String color = scan.next();
	System.out.println("Enter the brand");
	String brand = scan.next();
	System.out.println("Enter the Owner Name");
	scan.nextLine();
	String owner = scan.nextLine();
	System.out.println("Enter the Carid");
	int carid = scan.nextInt();
	
	Car c = new Car(carname,color,brand,owner,carid);
	System.out.println(carname+" "+color+" "+brand+" "+owner+" "+carid);
	
	}

}
