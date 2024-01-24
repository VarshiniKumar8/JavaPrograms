package switchcaseprogram;
import java.util.*;
public class AreaCRT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch, choice;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Enter two numbers");
		    System.out.println("Enter the choice\nC for Circle\nR for Rectangle\nT for Trianlge");
		    choice=sc.next().charAt(0);
			switch(choice) {
			case 'C' : {
				float r;
				System.out.println("Enter radius: ");
				r=sc.nextFloat();
				double AreaC = 3.14*r*r;
				System.out.println("Area of Circle: "+AreaC);
				break;
			}
			case 'R' :{
				float l,w;
				System.out.println("Enter length and width: ");
				l=sc.nextFloat();
				w=sc.nextFloat();
				double AreaR = l*w;
				System.out.println("Area of Rectangle: "+AreaR);
				break;
			}
			case 'T' :{
				float b,h;
				System.out.println("Enter breadth and height: ");
				b=sc.nextFloat();
				h=sc.nextFloat();
				double AreaT = 0.5*b*h;
				System.out.println("Area of Rectangle: "+AreaT);
				break;
			}
			default : System.out.println("Invalid choice");
			}
			System.out.println("Do you want to continue");
		    ch=sc.next().charAt(0);
		}while(ch=='y'||ch=='y');
	}

}
