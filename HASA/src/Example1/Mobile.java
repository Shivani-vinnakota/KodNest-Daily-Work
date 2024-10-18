package Example1;

public class Mobile {
//Handling composition
	Os os = new Os(32, "Android");
	//Handling aggregation
	Charger ref;
	public void HasA(Charger ref) {
		this.ref=ref;
		System.out.println(ref.getBrand());
		System.out.println(ref.getColor());
		System.out.println(ref.getType());
	}
}
