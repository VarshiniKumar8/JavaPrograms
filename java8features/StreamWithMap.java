package java8features;
import java.util.*;
import java.util.stream.Collectors;

/*created by VARSHINI K*/

public class StreamWithMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(56);
		marks.add(72);
		marks.add(45);
		marks.add(84);
		marks.add(66);
		System.out.println("Marks before Grace Score: "+marks);
		
		List<Integer> updatedMarks = marks.stream().map(i -> i+10).collect(Collectors.toList());
		System.out.println("Marks after Grace Score: "+updatedMarks);
	}

}
