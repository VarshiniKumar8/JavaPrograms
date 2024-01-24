package switchcaseprogram;
import java.util.*;
public class VowConCheck {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch, user;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Enter a character: ");
		    user = sc.next().charAt(0);
		    switch (Character.toLowerCase(user)) {
	            case 'a':
	            case 'e':
	            case 'i':
	            case 'o':
	            case 'u':
	            	System.out.println(user + " is a vowel.");
	                break;
	            default:
	                System.out.println(user + " is a consonant.");
	        }
		    System.out.println("Do you want to continue");
		    ch=sc.next().charAt(0);
		}while(ch=='y'||ch=='y');
	}

}
