import  java.io.*;
import java.util.Scanner;
import java.math.BigInteger;

public class SignatureApp {

	public static void main(String[] args) {
		EllipticCurve ec1 = new EllipticCurve();

		BigInteger n = ec1.getN();
		BigInteger a = ec1.getA();
		BigInteger[] g = ec1.getXyG();

		System.out.print("HERE");
		KeyPair kp = new KeyPair(g, a, n);


	}

}