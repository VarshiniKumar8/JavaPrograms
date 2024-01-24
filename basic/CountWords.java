package basic;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "This a java program to count no of words in string";
		String splittedString[] = s1.split(" ");
		System.out.println("Count of words: "+splittedString.length);
	}

}
