package forloop;
import java.util.*;
public class PrintOddNum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f,l,i;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the starting number");
		f=sc.nextInt();
		System.out.println("Enter the finishing number");
		l=sc.nextInt();
		System.out.println("Odd Numbers from " + f +"to " +l);
		for(i=f;i<=l;i++)
		{
			if(i%2!=0)
				System.out.println(" "+i);
		}
	}

}
