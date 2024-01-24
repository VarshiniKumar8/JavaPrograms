package forloop;
import java.util.*;
public class SumEvenNum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start,end,sum,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Starting number: ");
		start=sc.nextInt();
		System.out.println("Enter the Ending number: ");
		end=sc.nextInt();
		sum=0;
		for(i=start;i<=end;i=i+2)
			sum+=i;
		System.out.println("The sum of even number between "+start+" and "+end+" is: "+sum);
	}

}
