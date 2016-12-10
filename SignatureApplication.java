import  java.io.*;
import java.util.Scanner;
import java.math.BigInteger;

public class SignatureApplication {
	
	public static void main(String[] args) {
		// EllipticCurve ec1 = new EllipticCurve();
		// System.out.println(ec1.toString());

		BigInteger n = BigInteger.valueOf(23);

		BigInteger[] point1 = new BigInteger[2];
		point1[0] = BigInteger.valueOf(4);
		point1[1] = BigInteger.valueOf(7);

		BigInteger[] point2 = new BigInteger[2];
		point2[0] = BigInteger.valueOf(13);
		point2[1] = BigInteger.valueOf(11);

		BigInteger[] res = ECOperations.pointAddition(point1, point2, n);
		System.out.println(ECOperations.printPoint(point1));
		System.out.println(ECOperations.printPoint(point2));
		System.out.println(ECOperations.printPoint(res));


		// KeyPair kp = new KeyPair(ec1.n, ec1.xyG);

		// System.out.println(kp.getPrivateKey());

		// System.out.println(kp.getPublicKey());
	}


}