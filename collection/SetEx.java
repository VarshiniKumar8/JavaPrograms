package collection;
import java.util.*;

/*created by VARSHINI K*/

public class SetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> hashset = new HashSet<>();
		hashset.add("Varshini");
		hashset.add("Loshini");
		hashset.add("Varshini");
		hashset.add("Sujatha");
		hashset.add("Subi");
		hashset.add(null);
		System.out.println("Implementation of HashSet : ");
		for (String string : hashset) {
			System.out.println(string);
		}
		
		LinkedHashSet<String> linkedhashset = new LinkedHashSet<>();
		linkedhashset.add("Mango");
		linkedhashset.add("Banana");
		linkedhashset.add("Mango");
		linkedhashset.add("Gauva");
		linkedhashset.add(null);
		System.out.println("Implementation of Linked HashSet : \n"+linkedhashset);
		
		TreeSet<String> treeset = new TreeSet<>();
		treeset.add("Pizza");
		treeset.add("Burgur");
		treeset.add("Coffee");
		treeset.add("Burgur");
		//treeset.add(null);
		System.out.println("Implementation of TreeSet: \n"+treeset);
	}

}
