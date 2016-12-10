import  java.io.*;
import java.util.Scanner;

public class SignatureApplication {
	
	public static void main(String[] args) {
		EllipticCurve ec1 = new EllipticCurve();

		System.out.println(ec1.toString());
		KeyPair kp = new KeyPair(ec1.n, ec1.xyG);

		// System.out.println(kp.getPrivateKey());

		// System.out.println(kp.getPublicKey());
	}


}