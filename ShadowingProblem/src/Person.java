
public class Person {
	int id;
	String name;
	String gender;
	String email;
	long phoneno;
	public Person(int id, String name, String gender, String email, long phoneno) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.phoneno = phoneno;
	}
	void eat()
	{
		System.out.println(name + "Is Eating");
	}
	void sleep()
	{
		System.out.println(gender+"Is Sleeping");
	}
}
