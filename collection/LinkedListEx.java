package collection;
import java.util.*;

/* created by VARSHINI K */

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> linkedlist = new LinkedList<>();
		linkedlist.add("Apple");
		linkedlist.add("Mango");
		linkedlist.add("Banana");
		linkedlist.add(1,"Grapes");
		linkedlist.add(null);
		linkedlist.add("Apple");
		
		for (String string : linkedlist) {
			System.out.println(string);
		}
		
		LinkedList<String> linkedlist2 = new LinkedList<>();
		linkedlist2.add("Jasmine");
		linkedlist2.add("Lilly");
		
		linkedlist.addAll(linkedlist2);
		System.out.println("Adding list2 in list1: \n "+linkedlist);
	}

}
