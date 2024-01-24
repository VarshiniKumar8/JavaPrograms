package java8features;
import java.util.*;

/*created by VARSHINI K*/

public class StreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		list.add("Varshini");
		list.add("Sujatha");
		list.add("Loshini");
		list.add("Subi");
		list.add("Thanu");
		
		int count = 0;
		for(String string : list) {
			if(string.length()<7) {
				count++;
			}
		}
		System.out.println("Without using Stream API");
		System.out.println("There are "+count+" strings with length less than 6");
		
		long count1 = list.stream().filter(str -> str.length()<7).count();
		System.out.println("With using Stream API");
		System.out.println("There are "+count+" strings with length less than 6");
		
	}

}
