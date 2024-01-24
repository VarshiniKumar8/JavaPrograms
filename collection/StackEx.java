package collection;
import java.util.*;

/* created by VARSHINI K */

public class StackEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<>();
		stack.push("Gauva");
		stack.push("Mango");
		stack.push("Gauva");
		stack.push("Banana");
		stack.push("Apple");
		stack.push(null);
		
		System.out.println("Stack :"+stack);
		System.out.println("Removing Elements: "+stack.pop());
		System.out.println("Stack after removing :"+stack);
		System.out.println("Search Mango :"+stack.search("Mango"));
		System.out.println("Search Watermelon :"+stack.search("Watermelon"));
	}
}
