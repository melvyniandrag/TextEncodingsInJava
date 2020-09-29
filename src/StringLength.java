import java.nio.charset.Charset;

public class StringLength{
	public static void printBytes(byte[] byteArr){
		System.out.print("Bytes ( in hex ): ");
		for ( byte b : byteArr ){
			System.out.print(String.format("%02X ", b));
		}
		System.out.println("");
	}
	
	public static void inspectBytesOfText(String data, String textEncoding) {
		System.out.println("\n\n**********************************");
		System.out.println(    "************** " + textEncoding + " ************\n");
		
		System.out.println("Length of string " + data  + " = " +  String.valueOf(data.length()));
		byte[] dataBytes = data.getBytes(Charset.forName(textEncoding));
		System.out.println("Number of bytes in " + data + " = " + dataBytes.length);
	   	printBytes(dataBytes);

	}
	
	public static void main(String[] args){
		inspectBytesOfText("Фёдор", "UTF-8");
		inspectBytesOfText("Фёдор", "UTF-16");
		
		inspectBytesOfText("hello", "UTF-8");
		inspectBytesOfText("hello", "UTF-16");

		// Not that eclipse ( at least on my computer at 10:49 AM of 9/29/2020 )
		// does not perfectly support unicode strings. 
		// When I type an emoji with a halo in, the following quotation mark is
		//displayed in a weird way.
		inspectBytesOfText("😇", "UTF-8");
		inspectBytesOfText("😇", "UTF-16");
		
		// if you know a foreign language, try running this method with a string from that language/
		// try using emojis too.
	}
}
