package java8features;
import java.util.*;

/*created by VARSHINI K*/

class Product{
	int id;
	String name;
	float price;
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
}
public class LmbdaWithComparator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> list = new ArrayList<>();
		list.add(new Product(101,"NoteBook",1200));
		list.add(new Product(102,"Pencil Box",400));
		list.add(new Product(103,"KeyBoard",7200));
		list.add(new Product(104,"Mouse",2500));
		list.add(new Product(105,"Monitor",15200));
		
		Collections.sort(list,(p1,p2) -> {
			return p1.name.compareTo(p2.name);
		});
		
		/*for(Product product : list){
		  	System.out.println(product);
		}*/
		
		//forEach Method
		list.forEach(p -> System.out.println(p));
	}
}
