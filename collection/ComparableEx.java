package collection;
import java.util.*;

/*created by VARSHINI K*/

class Student implements Comparable<Student>{
	int roll,age;
	String name;
	public Student(int roll, int age, String name) {
		super();
		this.roll = roll;
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", age=" + age + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Student st) {
		// TODO Auto-generated method stub
		if(age==st.age)
			return 0;
		else if(age<st.age)
			return 1;
		else
			return -1;
	}
}
public class ComparableEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list = new ArrayList<>();
		list.add(new Student(101,23,"Varshini"));
		list.add(new Student(102,23,"Loshini"));
		list.add(new Student(103,25,"Sujatha"));
		list.add(new Student(104,20,"Subi"));
		list.add(new Student(105,21,"Thanu"));
		Collections.sort(list);
		System.out.println("List after sorting: ");
		for(Student student : list) {
			System.out.println(student);
		}
	}

}
