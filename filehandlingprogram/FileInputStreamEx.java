package filehandlingprogram;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
public class FileInputStreamEx {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream inputStream=new FileInputStream("C:\\Java\\varsh.txt");
		int i=0;
		while((i=inputStream.read())!=-1){
			System.out.println((char)i);
		}
		inputStream.close();
	}

}
