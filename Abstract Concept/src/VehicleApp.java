
public class VehicleApp {
public static void main(String[] args) {
	/*Car car = new Car();
	Bike bike = new Bike();
	Truck truck = new Truck();
	
	car.start();
	car.stop();
	car.refuel();
	System.out.println("===============");
	
	bike.start();
	bike.stop();
	bike.refuel();
	System.out.println("===============");
	
	truck.start();
	truck.stop();
	truck.refuel();
	System.out.println("===============");*/
	//writing as polymorphism
	ShowRoom sh = new ShowRoom();
	sh.acceptvehicle(new Car());
	
	System.out.println("===============");
	sh.acceptvehicle(new Bike());
	
	System.out.println("===============");
	sh.acceptvehicle(new Truck());
	
	
}
}
