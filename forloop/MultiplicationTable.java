package forloop;
import java.util.*;
public class MultiplicationTable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,i,n,res;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to that multiplication table: ");
		m = sc.nextInt();
		System.out.println("Enter number of times to get the multiplication table: ");
		n = sc.nextInt();
		System.out.println("The multiplication Table of "+m+ " is;");
		for(i=1;i<=n;i++) {
			res=0;
			res=m*i;
			System.out.println(m+" * "+i+" = "+res);
		}
	}

}
