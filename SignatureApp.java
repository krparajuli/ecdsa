import  java.io.*;
import java.util.Scanner;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;


public class SignatureApp {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		EllipticCurve ec1 = new EllipticCurve();

		BigInteger n = ec1.getN();
		BigInteger a = ec1.getA();
		BigInteger[] g = ec1.getXyG();

		KeyPair kp = new KeyPair(g, n, a);

		// System.out.println("Private Key");
		// System.out.println(kp.getPrivateKey().toString());

		// System.out.println("Public Key\nx");
		// System.out.println(kp.getPublicKey()[0].toString());
		// System.out.println("y");
		// System.out.println(kp.getPublicKey()[1].toString());

		BigInteger bi = new BigInteger(SHAsum("hello".getBytes()), 16);

		System.out.println("HELLO = "+SHAsum("hello".getBytes()));
		System.out.println("HELLO = "+bi.toString());



	}




	public static String SHAsum(byte[] convertme) throws NoSuchAlgorithmException {
	    MessageDigest md = MessageDigest.getInstance("SHA-1"); 
	    return byteArray2Hex(md.digest(convertme));
	}

	private static String byteArray2Hex(final byte[] hash) {
	    Formatter formatter = new Formatter();
	    for (byte b : hash) {
	        formatter.format("%02x", b);
	    }
	    return formatter.toString();
	}

}