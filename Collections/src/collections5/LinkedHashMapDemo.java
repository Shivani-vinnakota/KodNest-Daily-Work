package collections5;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap map1 = new LinkedHashMap<>();
		map1.put(1, 100);
		map1.put(2, 123);
		map1.put(3,  new Student(1,"Mahesh" , 7.9));
		map1.put(4, 101);
		map1.put(5, "5555");
		System.out.println(map1);
	}
}
