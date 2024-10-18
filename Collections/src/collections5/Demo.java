package collections5;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class Demo {
	public static void main(String[] args) {
		LinkedHashMap map1 = new LinkedHashMap<>();
		map1.put(1, 100);
		map1.put(2, 123);
		map1.put(3,  new Student(1,"Mahesh" , 7.9));
		map1.put(4, 101);
		map1.put(5, "5555");
		System.out.println(map1);
		
		//Accessing Keys only using keySet()method which returns a Set object
		Set keys = map1.keySet();
		System.out.println("Keys = "+keys);
		
		//Accessing key-value pair using entrySet() method which returns a Set object
		Set kv = map1.entrySet();
		System.out.println("Key-value = "+kv);
		
		//Accessing Values only using values()method which returns a Collection object
		Collection values = map1.values();
		System.out.println("values =" +values);
 	}
}
