import java.util.Scanner;
public class ToysStore {
	public static void main(String []args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the toyname");
	String toyname = scan.nextLine();
	System.out.println("Enter the brand");
	scan.nextLine();
    String brand = scan.nextLine();
    System.out.println("Enter the color");
    String color = scan.nextLine();
    System.out.println("Enter the serial number");
    int sno = scan.nextInt();
    System.out.println("Enter the Cost");
    int cost = scan.nextInt();
    
    Toys t = new Toys(toyname,brand,color,sno,cost);
    System.out.println(t.toyname+" "+t.brand+" "+t.color+" "+t.sno+" "+t.cost);
}
}
