package filehandlingprogram;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class FileReaderDemo {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileReader reader = new FileReader("C:\\Java\\xyz.txt");
		int i;
		while((i=reader.read())!=-1) {
			System.out.print((char)i);
		}
		reader.close();
	}

}
