package java8features;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*created by VARSHINI K*/

public class StreamEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("Varshini","Loshini","Sujatha","Subi","Thanu");
		Stream<String> allNames = names.stream();
		Stream<String> longNames = allNames.filter(str -> str.length()>6);
		System.out.println("Using forEach() : ");
		longNames.forEach(str -> System.out.println(str));
		
		List<String> namesCollect = names.stream().filter(str -> str.length()>6).collect(Collectors.toList());
		System.out.println("Using Colelct() : ");
		//namesCollect.forEach(str-> System.out.println(str));
		namesCollect.forEach(System.out::println);
	}

}
