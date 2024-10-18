package day2;
import java.util.ArrayList;
import java.util.ListIterator;

public class Traversing3 {
public static void main(String[] args) {
	//Backward traversing  for list implementing class
	ArrayList<Integer> list1 = new ArrayList<>();
	list1.add(10);
	list1.add(20);
	list1.add(30);
	
	//using Iterator
	ListIterator<Integer> itr = list1.listIterator(list1.size()); 
	while(itr.hasPrevious()) {
		System.out.println(itr.previous()+" ");
	}
	
}
}
