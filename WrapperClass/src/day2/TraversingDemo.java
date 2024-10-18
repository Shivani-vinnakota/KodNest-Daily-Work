package day2;
import java.util.ArrayList;
import java.util.Iterator;

public class TraversingDemo {
public static void main(String[] args) {
	ArrayList<Object> list1 = new ArrayList<>();
	list1.add("Shirt");
	list1.add("Jeans");
	list1.add("Cap");
	list1.add(10);
	list1.add(true);
	
	//1.using for loop
	for(int i=0; i<list1.size(); i++) {
		System.out.println(list1.get(i));
	}
	
	//2.using for each loop
	for (Object s:list1) {
		System.out.println(s+" ");
	}
	
	//3.using Iterator
	Iterator itr = list1.iterator();
	while (itr.hasNext()) {
		System.out.println(itr.next()+" ");
	}
	
}
}
