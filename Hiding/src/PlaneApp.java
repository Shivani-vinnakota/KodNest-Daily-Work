
public class PlaneApp {
public static void main(String[] args) {
	Plane ref = new PassengerPlane();
	ref.fly();
	ref.carrySomething();
	
	((PassengerPlane)(ref)).carrySomething();
}
}
