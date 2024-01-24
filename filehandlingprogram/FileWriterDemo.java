package filehandlingprogram;
import java.io.FileWriter;
import java.io.IOException;
public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter writer = new FileWriter("C:\\Java\\xyz.txt",true);
		writer.write("We are learning file handling concept");
		writer.close();
		System.out.println("File Created");
	}

}
