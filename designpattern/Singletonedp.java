package designpattern;

//VARSHINI K

class SingleObject{
	private static SingleObject instance = new SingleObject();
	private SingleObject() {}
	public static SingleObject getInstance() {
		return instance;
	}
	public void show() {
		System.out.println("Accessing method using single object");
	}
}
public class Singletonedp {
	public static void main(String[] args) {
		//SingleObject  obj = SingleObject.getInstance();
		SingleObject obj = SingleObject.getInstance();
		obj.show();
	}
}
