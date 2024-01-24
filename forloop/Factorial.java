package forloop;
import java.util.*;
public class Factorial {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int i;
		int num=sc.nextInt();
		long fact=1;
		for(i=1;i<=num;i++)
			fact *=i;
		System.out.println("Factorial of "+num+" is: "+fact);
	}
}
