package day2;
import java.util.ArrayDeque;
import java.util.Iterator;

public class Traversing2 {
	public static void main(String[] args) {
		//Backward Traversing
		
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		ad.add(10);
		ad.add(57);
		ad.add(96);
		ad.add(256);
		
		//using descending Iterator()
		Iterator itr = ad.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
