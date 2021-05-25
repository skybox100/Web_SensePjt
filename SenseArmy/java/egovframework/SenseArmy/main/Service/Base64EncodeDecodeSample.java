package egovframework.SenseArmy.main.Service;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;



public class Base64EncodeDecodeSample {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String a;
		a = sc.next();
		base64(a);
		
	}

	public static String base64(String a) 
	{ String text = a; byte[] targetBytes = text.getBytes();
	// Base64 인코딩 ///////////////////////////////////////////////////
	Encoder encoder = Base64.getEncoder(); byte[] encodedBytes = encoder.encode(targetBytes);
	// Base64 디코딩 /////////////////////////////////////////////////// 
	Decoder decoder = Base64.getDecoder(); byte[] decodedBytes = decoder.decode(encodedBytes);
	System.out.println("인코딩 전 : " + text);
	System.out.println("인코딩 text : " + new String(encodedBytes));
	System.out.println("디코딩 text : " + new String(decodedBytes));
	return  new String(encodedBytes);
	
	}

}
