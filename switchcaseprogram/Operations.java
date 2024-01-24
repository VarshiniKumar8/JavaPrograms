package switchcaseprogram;
import java.util.*;
public class Operations {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
	    char ch,choice;
	    Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Enter two numbers");
		    a=sc.nextInt();
		    b=sc.nextInt();
		    System.out.println("Enter the choice\n + for Add\n - for Sub\n * for Mul\n / for Div");
		    choice=sc.next().charAt(0);
		    switch(choice)
		    {
			    case '+':System.out.println(a+b);
			             break;   
			    case '-':System.out.println(a-b);
			    		 break; 
			    case '*':System.out.println(a*b);
			    		 break;  
			    case '/':System.out.println(a/b);
			    		 break; 
			    default:System.out.println("Invalid choice");
		    }
		    System.out.println("Do you want to continue");
		    ch=sc.next().charAt(0);
		}while(ch=='y'||ch=='y');
	}
}
