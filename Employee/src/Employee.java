
public class Employee 
{
private int id;
private String name;
private double salary;
static int idgenerator=1000;
public Employee( String name, double salary)
{

	id = ++idgenerator;
	this.name = name;
	this.salary = salary;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}
