package collection;
import java.util.*;

/*created by VARSHINI K*/

public class QueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue = new PriorityQueue<>();
		queue.add("Jasmine");
		queue.offer("Lotus");
		queue.offer("Rose");
		queue.offer("Mogra");
		queue.offer("Lilly");
		//queue.offer(null);
		System.out.println("Queue: "+queue);
		
		System.out.println("Head of Queue: "+queue.element());
		
		System.out.println("Remove: "+queue.remove());
		System.out.println("Queue: "+queue);
		
		System.out.println("Remove: "+queue.poll());
		System.out.println("Queue: "+queue);
	}

}
