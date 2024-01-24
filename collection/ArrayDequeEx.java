package collection;

import java.util.*;

/*created by VARSHINI K*/

public class ArrayDequeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> deque = new ArrayDeque<>();
		deque.add("Coffee");
		deque.offer("Tea");
		deque.offer("Ice Cream");
		deque.offerFirst("Sandwich");
		deque.offer("Pizza");
		deque.offer("Burgur");
		//deque.add(null);
		
		System.out.println("Deque: "+deque);
		
		System.out.println("Removing 1st element: "+deque.pollFirst());
		System.out.println("Deque: "+deque);
		
		System.out.println("Removing last element: "+deque.pollLast());
		System.out.println("Deque: "+deque);
		
		System.out.println("Head of Queue: "+deque.peek());
	}

}
