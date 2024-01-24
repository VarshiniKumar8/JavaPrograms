package forloop;
import java.util.*;
public class PrintName {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		name = sc.nextLine();
		for(int i=0;i<5;i++)
			System.out.println("My name is "+name);
	}
}
