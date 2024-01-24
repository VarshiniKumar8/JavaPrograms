package whileloop;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int orinum = num;
        int rev = 0;
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        if(orinum == rev)
        	System.out.println(orinum +" is a palindrome");
        else
        	System.out.println(orinum +" is not a palindrome");
	}

}
