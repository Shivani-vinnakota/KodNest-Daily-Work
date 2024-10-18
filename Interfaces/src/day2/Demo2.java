package day2;

public abstract class Demo2 implements Demo{
//even if this class is partially (only 1 method you implementing)implementing
	//the interface then you make it as abstract
	@Override
	public void display() {
		System.out.println("Implemented");
	}

}
