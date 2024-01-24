package forloop;
import java.util.*;
public class NaturalNum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of natural numbers to be add: ");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
			sum+=i;
		System.out.println("Sum of First "+n+" Natural Numbers is: "+sum);
	}

}
