package day2;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Demo {
public static void main(String[] args) {
	//upcasting with collection objects
	List list1 = new ArrayList<>();
	list1.add(10);
	list1.add(20);
	list1.add(30);
	
	List list2 = new LinkedList();
	list2.add(10);
	list2.add(20);
	list2.add(30);
	
	Queue que = new ArrayDeque();
	que.add(11);
	que.add(22);
	que.add(33);
	
	Queue que2 = new PriorityQueue();
	que.add(99);
	que.add(88);
	que.add(77);
	
}
}
