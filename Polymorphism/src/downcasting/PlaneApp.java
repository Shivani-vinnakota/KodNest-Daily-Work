package downcasting;

public class PlaneApp {
public static void main(String[] args) {
	Plane ref;
	ref = new FighterPlane("BHARMOS...");
	ref.takeOff();
	ref.fly();
	//parent type ref cannot access the specialized property of the child directly
	//ref.carryArms();
	//ifyou wannt to access write like this 
	((FighterPlane)(ref)).carryArms();//downcasting
}
}
