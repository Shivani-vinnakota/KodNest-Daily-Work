package rulesofMethodoverloading;

public class Demo3 extends Demo2 {
@Override
public Student getHuman() {
	Human human = new Human();
	Student student = new Student();
	return student;
}

}
