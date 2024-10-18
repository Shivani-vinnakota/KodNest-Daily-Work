
public class Demo2 {
	static int x,y,z;
	int a,b,c;
	static {
		x=100;
		a=9;//error:Cannot make a static reference to the non-static field 
	}
	static public void display() {
		System.out.println(x);
		System.out.println(a);//Cannot make a static reference to the non-static field a
	}
}
