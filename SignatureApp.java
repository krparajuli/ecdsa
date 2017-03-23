/*
 * File: SignatureApp.java
 * Author: Kalyan Parajuli
 * Role: App that lets you test the ECDSA Message Signature and validation 
 */


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
		BigInteger[] G = ec1.getXyG();

		KeyPair kp = new KeyPair(G, n, a);

		Scanner s = new Scanner(System.in);
		System.out.println("Enter your message on one line:");
		String msg = s.nextLine();

		BigInteger[] signature = MessageSV.messageSign(msg, n, G, a, kp.getPrivateKey());

		MessageSV.messageVerify(msg, signature, n, G, a, kp.getPublicKey());
	}

}