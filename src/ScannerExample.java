/*
 * Little example that reads a text file using a Scanner
 * 
 * Checkout the Constructors for Scanner here:
 * https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ScannerExample {
	
	public static List<String> readFile(String filename, String textEncoding){
		File f = new File( filename );
		Scanner s = null;
		
		try{
			// Note: if you've ever used a Scanner before
			// your probably didn't pass the second parameter "textEncoding"
			// into it.
			s = new Scanner(f, textEncoding);
		}
		catch (FileNotFoundException ex) {
			System.err.println(ex.getMessage());
			return new ArrayList<String>();
		}
		
		List<String> arr = new ArrayList<String>();
		while(s.hasNext()) {
			arr.add(s.next());
		}
		s.close();
		return arr;
	}
	
	public static void main(String[] args) {
		List<String> utf8_strings = readFile("dostoyevsky-utf8.txt", "utf-8");
		for(String s : utf8_strings) {
			System.out.println(s);
		}
		List<String> utf16_strings = readFile("dostoyevsky-utf16.txt", "utf-16");
		for(String s : utf16_strings) {
			System.out.println(s);
		}
		
		// Note you have a few other files to play with in this example 
	}

}