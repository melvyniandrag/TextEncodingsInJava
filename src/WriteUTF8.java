import java.io.*;

public class WriteUTF8 {
	
	public static void main(String[] args) {
		File file = new File("utf8_output.txt");
		FileOutputStream fs=  null;
		try {
			 fs = new FileOutputStream(file);
		}
		catch (FileNotFoundException fnfe) {
			System.err.println("file not found");
		}
		try {
			fs.write("Фёдор".getBytes("UTF-8"));
			fs.close();
		}
		catch(IOException ioe){
			System.err.println("unable to write to file");
		}
	}
}
