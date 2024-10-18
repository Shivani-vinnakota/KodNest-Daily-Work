
public class Toys {
	String toyname;
	String brand;
	String color;
	int sno;
	int cost;
	public Toys(String toyname, String brand, String color, int sno, int cost) {
		super();
		this.toyname = toyname;
		this.brand = brand;
		this.color = color;
		this.sno = sno;
		this.cost = cost;
	}
	void entertainment() {
		System.out.println(toyname+"is giving entertainment for children");
	}

}
