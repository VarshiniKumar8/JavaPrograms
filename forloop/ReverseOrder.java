package forloop;
import java.util.*;
public class ReverseOrder {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,start,end;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting value: ");
		start=sc.nextInt();
		System.out.println("Entr the ending value: ");
		end=sc.nextInt();
		System.out.println("The reverse order of "+start+ "to "+end+ "is: ");
		for(i=end;i>=start;i--)
			System.out.println(i);
	}
}
