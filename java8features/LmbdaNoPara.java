package java8features;

/*Created by VARSHINI K*/

@FunctionalInterface
interface Sayable{
	String sayHello();
	//int add();
}
public class LmbdaNoPara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sayable s1=() -> {
			return "Hello User";
		};
		
		System.out.println(s1.sayHello());
	}

}
