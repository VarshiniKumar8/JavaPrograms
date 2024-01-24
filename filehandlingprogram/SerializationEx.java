package filehandlingprogram;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
public class SerializationEx {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		// TODO Auto-generated method stub
		Employee employee = new Employee(101,"Varshini","Programmer");
		//ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("C:\\Java\\ser.txt"));
		FileOutputStream outputStream = new FileOutputStream("C:\\Java\\ser.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
		objectOutputStream.flush();
		System.out.println("Converted emp obj into byte stream");
	}

}
