import java.math.BigInteger;

public class ECOperations {

	
	public static BigInteger[] negation(BigInteger[] p) {
		BigInteger[] q = new BigInteger[2];
		q[0] = p[0];
		q[1] = p[1].multiply(BigInteger.valueOf(-1));
		return q;
	}

	public static BigInteger[] pointAddition(BigInteger[] p1, BigInteger[] p2, BigInteger n) {
		BigInteger[] val = new BigInteger[2];

		BigInteger a = (p2[0].subtract(p1[0])).mod(n);
		BigInteger b = (p2[1].subtract(p1[1])).mod(n);
		b = b.modInverse(n);
		a = a.multiply(b).mod(n);
		b = a.multiply(a);
		b = ((b.subtract(p1[0])).subtract(p2[0])).mod(n);
		val[0] = a;

		val[1] = a.multiply(p1[0].subtract(a)).subtract(p1[1]);
		return val;
	}

	//	public static BigInteger[] pointDoubling(BigInteger[] p1, BigInteger[] p2, )


	//public
	public static String printPoint(BigInteger[] p) {
		return "Result: ("+ p[0].toString() +","+p[1].toString()+")";
	}
}