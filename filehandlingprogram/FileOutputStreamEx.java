package filehandlingprogram;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
public class FileOutputStreamEx {
	public static void main(String[] args) throws IOException {
		FileOutputStream outputStream=new FileOutputStream("C:\\Java\\varsh.txt",true);
		String str="Java FullStack Development";
		byte bArray[]=str.getBytes();
		outputStream.write(bArray);
		outputStream.close();
		System.out.println("File Created");
	}
}

