package collection;
import java.util.*;

/*created by VARSHINI K*/
public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map = new HashMap<>();
		map.put("IND","India");
		map.put("BRZ","Brazil");
		map.put("DE","Germany");
		map.put("FR","France");
		map.put(null,null);
		map.put(null,null);
		
		System.out.println("Implmenting HashMap: ");
		for(Map.Entry<String,String> entry : map.entrySet()) {
			System.out.println("Country Code: "+entry.getKey()+", Country: "+entry.getValue());
		}
		
		Map<String,String> tree = new TreeMap<>();
		tree.put("BR01","Coffee");
		tree.put("BR05","Tea");
		tree.put("BR03","Chola-Puri");
		tree.put("BR02","Cookies");
		tree.put("BR04","Kaalan");
		//tree.put(null, null);
		
		System.out.println("\nImplmenting TreeMap: ");
		for(Map.Entry<String,String> entry : tree.entrySet()) {
			System.out.println("Menu Code: "+entry.getKey()+", Menu: "+entry.getValue());
		}
		
		Hashtable<String,String> hashtbl = new Hashtable<>();
		hashtbl.put("DOS", "Distributed Operating System");
		hashtbl.put("AJP", "Advanced Java Programming");
		hashtbl.put("ML", "Machine Learning");
		hashtbl.put("CD", "Compiler Design");
		hashtbl.put("CC", "Cloud Computing");
		//hashtbl.put(null, null);
		
		System.out.println("\nImplmenting Hashtable: ");
		for(Map.Entry<String,String> entry : hashtbl.entrySet()) {
			System.out.println("Subject Code: "+entry.getKey()+", Subject: "+entry.getValue());
		}
	}

}
