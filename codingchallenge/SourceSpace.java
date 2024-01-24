package codingchallenge;
import java.util.*;
import java.util.stream.Collectors;

// VARSHINI K

public class SourceSpace {
	public String insertSpace(String s) {
		return s.chars().mapToObj(ch->(char)ch+" ").collect(Collectors.joining());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		SourceSpace s1 = new SourceSpace();
		String result = s1.insertSpace(input);
		System.out.println(result);
		sc.close();
	}

}
