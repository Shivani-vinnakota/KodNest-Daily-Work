package collections5;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap map1 = new HashMap<>();
		map1.put(1, 100);
		map1.put(2, 123);
		map1.put(3,  new Student(1,"Mahesh" , 7.9));
		map1.put(4, 101);
		map1.put(5, "5555");
		System.out.println(map1);
	}
}
