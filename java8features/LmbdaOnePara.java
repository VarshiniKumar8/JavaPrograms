package java8features;

/*created by VARSHINI K*/

interface Sayable1{
	String sayHellow(String name);
}
public class LmbdaOnePara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sayable1 s1 = name -> {
			return "Hello "+name;
		};
		
		System.out.println(s1.sayHellow("Varshini"));
	}

}
