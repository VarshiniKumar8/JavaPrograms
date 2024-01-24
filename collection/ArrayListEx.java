package collection;
import java.util.*;

/* created by VARSHINI K */

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add("Raj");
		list.add(101);
		list.add(56.78);
		list.add(true);
		list.add(null);
		list.add("Raj");
		System.out.println("List Elements: "+list);
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("Rose");
		list2.add("Lilly");
		list2.add("Mogra");
		list2.add("Lotus");
		list2.add(null);
		list2.add("Rose");
		System.out.println("Generic Elements: "+list2);
		
		System.out.println("Iterating list using iterator interface");
		Iterator<String> iterator = list2.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		System.out.println("Iterating list using For Each Loop");
		for (String string : list2) {
			System.out.println(string);
		}
	}

}
