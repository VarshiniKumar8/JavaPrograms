package collection;
import java.util.*;

/* created by VARSHINI K */

public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vector = new Vector<>();
		vector.addElement("Jasmine");
		vector.add("Rose");
		vector.add("Lilly");
		vector.add("Mogra");
		vector.add("Rose");
		vector.add(null);
		
		Enumeration<String> e = vector.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}

}
