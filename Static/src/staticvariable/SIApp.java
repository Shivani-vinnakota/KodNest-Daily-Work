package staticvariable;

public class SIApp {
public static void main(String[] args) {
	BusinessMan b1= new BusinessMan("Malya");
	BusinessMan b2= new BusinessMan("MODI");
	BusinessMan b3= new BusinessMan("Adhani");
	
	b1.takeInput();
	b1.calculateSi();
	b1.display();
	System.out.println("=====================");
	b2.takeInput();
	b2.calculateSi();
	b2.display();
	System.out.println("=====================");
	b3.takeInput();
	b3.calculateSi();
	b3.display();
}
}
