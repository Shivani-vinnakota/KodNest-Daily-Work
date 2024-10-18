package collections5;

import java.util.TreeMap;

public class MapDemo {
public static void main(String[] args) {
	TreeMap map1 = new TreeMap<>();
	map1.put(1, 100);
	map1.put(2, new Student(1,"Akash" , 8.2));
	map1.put(3, 700);
	map1.put(4, new Student(2,"Pradeep" , 7.9));
	//map1.put("four", new Student(2,"Pradeep" , 7.9));//it will give error
	map1.put(5, 400);
	System.out.println(map1);
}
}
