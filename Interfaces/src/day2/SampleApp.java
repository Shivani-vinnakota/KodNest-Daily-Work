package day2;

public class SampleApp {
public static void main(String[] args) {
	
	Sample1 ref = new Sample();//upcasting
	ref.display();
	
	Sample2 ref2 = new Sample();//Parent reference to child class object
	ref2.display();
}
}
